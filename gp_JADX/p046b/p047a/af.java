package p046b.p047a;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public final class af extends aa implements Externalizable {
    public transient Object[] f3680j;

    protected final int mo934c(int i) {
        int c = super.mo934c(i);
        this.f3680j = new Object[c];
        return c;
    }

    public final Object m3945a(long j, Object obj) {
        Object obj2;
        int i;
        boolean z;
        boolean z2 = true;
        int c = m3937c(j);
        if (c < 0) {
            c = (-c) - 1;
            obj2 = this.f3680j[c];
            i = c;
            z = false;
        } else {
            obj2 = null;
            i = c;
            z = true;
        }
        byte b = this.k[i];
        this.h[i] = j;
        this.k[i] = (byte) 1;
        this.f3680j[i] = obj;
        if (z) {
            if (b != (byte) 0) {
                z2 = false;
            }
            m3924a(z2);
        }
        return obj2;
    }

    protected final void mo938d(int i) {
        int length = this.h.length;
        long[] jArr = this.h;
        Object[] objArr = this.f3680j;
        byte[] bArr = this.k;
        this.h = new long[i];
        this.f3680j = new Object[i];
        this.k = new byte[i];
        int i2 = length;
        while (true) {
            length = i2 - 1;
            if (i2 <= 0) {
                return;
            }
            if (bArr[length] == (byte) 1) {
                long j = jArr[length];
                i2 = m3937c(j);
                this.h[i2] = j;
                this.f3680j[i2] = objArr[length];
                this.k[i2] = (byte) 1;
                i2 = length;
            } else {
                i2 = length;
            }
        }
    }

    public final Object m3951e(long j) {
        int b = m3934b(j);
        return b < 0 ? null : this.f3680j[b];
    }

    public final void clear() {
        super.clear();
        Arrays.fill(this.h, 0, this.h.length, 0);
        Arrays.fill(this.f3680j, 0, this.f3680j.length, null);
        Arrays.fill(this.k, 0, this.k.length, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if (afVar.size() == size()) {
            return m3944a(new ag(afVar));
        }
        return false;
    }

    public final int hashCode() {
        ai ahVar = new ah(this);
        m3944a(ahVar);
        return ahVar.f3682a;
    }

    protected final void mo933b(int i) {
        this.f3680j[i] = null;
        super.mo933b(i);
    }

    public final Object[] m3948b() {
        Object[] objArr = new Object[size()];
        Object[] objArr2 = this.f3680j;
        byte[] bArr = this.k;
        int length = objArr2.length;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return objArr;
            }
            if (bArr[i2] == (byte) 1) {
                length = i + 1;
                objArr[i] = objArr2[i2];
                i = length;
                length = i2;
            } else {
                length = i2;
            }
        }
    }

    public final boolean m3946a(ao aoVar) {
        byte[] bArr = this.k;
        Object[] objArr = this.f3680j;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (bArr[i] == (byte) 1 && !aoVar.execute(objArr[i])) {
                return false;
            }
            length = i;
        }
    }

    private final boolean m3944a(ai aiVar) {
        byte[] bArr = this.k;
        long[] jArr = this.h;
        Object[] objArr = this.f3680j;
        int length = jArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (bArr[i] == (byte) 1 && !aiVar.mo940a(jArr[i], objArr[i])) {
                return false;
            }
            length = i;
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a);
        ai c0521c = new C0521c(objectOutput);
        if (!m3944a(c0521c)) {
            throw c0521c.f3697b;
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        objectInput.readByte();
        int readInt = objectInput.readInt();
        mo934c(readInt);
        while (true) {
            int i = readInt - 1;
            if (readInt > 0) {
                m3945a(objectInput.readLong(), objectInput.readObject());
                readInt = i;
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ Object clone() {
        af afVar = (af) super.clone();
        afVar.f3680j = (Object[]) this.f3680j.clone();
        return afVar;
    }
}
