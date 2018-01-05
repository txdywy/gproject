package p046b.p047a;

public abstract class C0537t extends ap implements C0536u {
    public transient int[] f3718h;
    public C0536u f3719i = this;

    public Object clone() {
        C0537t c0537t = (C0537t) super.clone();
        c0537t.f3718h = (int[]) this.f3718h.clone();
        return c0537t;
    }

    protected int mo934c(int i) {
        int c = super.mo934c(i);
        this.f3718h = new int[c];
        return c;
    }

    protected void mo933b(int i) {
        this.f3718h[i] = 0;
        super.mo933b(i);
    }

    protected final int mo952e(int i) {
        byte[] bArr = this.k;
        int[] iArr = this.f3718h;
        int length = bArr.length;
        int g = Integer.MAX_VALUE & this.f3719i.mo954g(i);
        int i2 = g % length;
        if (bArr[i2] != (byte) 0 && (bArr[i2] == (byte) 2 || iArr[i2] != i)) {
            g = (g % (length - 2)) + 1;
            while (true) {
                i2 -= g;
                if (i2 < 0) {
                    i2 += length;
                }
                if (bArr[i2] == (byte) 0 || (bArr[i2] != (byte) 2 && iArr[i2] == i)) {
                    break;
                }
            }
        }
        return bArr[i2] == (byte) 0 ? -1 : i2;
    }

    protected final int mo953f(int i) {
        byte[] bArr = this.k;
        int[] iArr = this.f3718h;
        int length = bArr.length;
        int g = Integer.MAX_VALUE & this.f3719i.mo954g(i);
        int i2 = g % length;
        if (bArr[i2] == (byte) 0) {
            return i2;
        }
        if (bArr[i2] == (byte) 1 && iArr[i2] == i) {
            return (-i2) - 1;
        }
        int i3 = (g % (length - 2)) + 1;
        if (bArr[i2] != (byte) 2) {
            do {
                i2 -= i3;
                if (i2 < 0) {
                    i2 += length;
                }
                if (bArr[i2] != (byte) 1) {
                    break;
                }
            } while (iArr[i2] != i);
        }
        if (bArr[i2] != (byte) 2) {
            return bArr[i2] == (byte) 1 ? (-i2) - 1 : i2;
        } else {
            g = i2;
            while (bArr[g] != (byte) 0 && (bArr[g] == (byte) 2 || iArr[g] != i)) {
                g -= i3;
                if (g < 0) {
                    g += length;
                }
            }
            if (bArr[g] == (byte) 1) {
                return (-g) - 1;
            }
            return i2;
        }
    }

    public final int mo954g(int i) {
        return i * 31;
    }
}
