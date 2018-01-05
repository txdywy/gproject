package p046b.p047a;

public abstract class aa extends ap implements ae {
    public transient long[] f3675h;
    public ae f3676i = this;

    public Object clone() {
        aa aaVar = (aa) super.clone();
        aaVar.f3675h = (long[]) this.f3675h.clone();
        return aaVar;
    }

    protected int mo934c(int i) {
        int c = super.mo934c(i);
        this.f3675h = new long[c];
        return c;
    }

    public final boolean m3932a(long j) {
        return m3934b(j) >= 0;
    }

    public final boolean m3933a(aj ajVar) {
        byte[] bArr = this.k;
        long[] jArr = this.f3675h;
        int length = jArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (bArr[i] == (byte) 1 && !ajVar.mo939a(jArr[i])) {
                return false;
            }
            length = i;
        }
    }

    protected void mo933b(int i) {
        this.f3675h[i] = 0;
        super.mo933b(i);
    }

    protected final int m3934b(long j) {
        byte[] bArr = this.k;
        long[] jArr = this.f3675h;
        int length = bArr.length;
        int d = Integer.MAX_VALUE & this.f3676i.mo936d(j);
        int i = d % length;
        if (bArr[i] != (byte) 0 && (bArr[i] == (byte) 2 || jArr[i] != j)) {
            d = (d % (length - 2)) + 1;
            while (true) {
                i -= d;
                if (i < 0) {
                    i += length;
                }
                if (bArr[i] == (byte) 0 || (bArr[i] != (byte) 2 && jArr[i] == j)) {
                    break;
                }
            }
        }
        return bArr[i] == (byte) 0 ? -1 : i;
    }

    protected final int m3937c(long j) {
        byte[] bArr = this.k;
        long[] jArr = this.f3675h;
        int length = bArr.length;
        int d = Integer.MAX_VALUE & this.f3676i.mo936d(j);
        int i = d % length;
        if (bArr[i] == (byte) 0) {
            return i;
        }
        if (bArr[i] == (byte) 1 && jArr[i] == j) {
            return (-i) - 1;
        }
        int i2 = (d % (length - 2)) + 1;
        if (bArr[i] != (byte) 2) {
            do {
                i -= i2;
                if (i < 0) {
                    i += length;
                }
                if (bArr[i] != (byte) 1) {
                    break;
                }
            } while (jArr[i] != j);
        }
        if (bArr[i] != (byte) 2) {
            return bArr[i] == (byte) 1 ? (-i) - 1 : i;
        } else {
            d = i;
            while (bArr[d] != (byte) 0 && (bArr[d] == (byte) 2 || jArr[d] != j)) {
                d -= i2;
                if (d < 0) {
                    d += length;
                }
            }
            if (bArr[d] == (byte) 1) {
                return (-d) - 1;
            }
            return i;
        }
    }

    public final int mo936d(long j) {
        return ((int) ((j >>> 32) ^ j)) * 31;
    }
}
