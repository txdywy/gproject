package p046b.p047a;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public final class C0538v extends C0537t implements Externalizable {
    public transient Object[] f3720j;

    protected final int mo934c(int i) {
        int c = super.mo934c(i);
        this.f3720j = new Object[c];
        return c;
    }

    public final Object m4004a(int i, Object obj) {
        Object obj2;
        int i2;
        boolean z;
        boolean z2 = true;
        int f = mo953f(i);
        if (f < 0) {
            f = (-f) - 1;
            obj2 = this.f3720j[f];
            i2 = f;
            z = false;
        } else {
            obj2 = null;
            i2 = f;
            z = true;
        }
        byte b = this.k[i2];
        this.h[i2] = i;
        this.k[i2] = (byte) 1;
        this.f3720j[i2] = obj;
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
        int[] iArr = this.h;
        Object[] objArr = this.f3720j;
        byte[] bArr = this.k;
        this.h = new int[i];
        this.f3720j = new Object[i];
        this.k = new byte[i];
        int i2 = length;
        while (true) {
            length = i2 - 1;
            if (i2 <= 0) {
                return;
            }
            if (bArr[length] == (byte) 1) {
                i2 = iArr[length];
                int f = mo953f(i2);
                this.h[f] = i2;
                this.f3720j[f] = objArr[length];
                this.k[f] = (byte) 1;
                i2 = length;
            } else {
                i2 = length;
            }
        }
    }

    public final Object m4010h(int i) {
        int e = mo952e(i);
        return e < 0 ? null : this.f3720j[e];
    }

    public final void clear() {
        super.clear();
        Arrays.fill(this.h, 0, this.h.length, 0);
        Arrays.fill(this.f3720j, 0, this.f3720j.length, null);
        Arrays.fill(this.k, 0, this.k.length, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0538v)) {
            return false;
        }
        C0538v c0538v = (C0538v) obj;
        if (c0538v.size() == size()) {
            return m4003a(new C0539w(c0538v));
        }
        return false;
    }

    public final int hashCode() {
        Object c0540x = new C0540x(this);
        m4003a(c0540x);
        return c0540x.f3722a;
    }

    protected final void mo933b(int i) {
        this.f3720j[i] = null;
        super.mo933b(i);
    }

    public final Object[] m4006b() {
        Object[] objArr = new Object[size()];
        Object[] objArr2 = this.f3720j;
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

    public final int[] m4008c() {
        int[] iArr = new int[size()];
        int[] iArr2 = this.h;
        byte[] bArr = this.k;
        int length = iArr2.length;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return iArr;
            }
            if (bArr[i2] == (byte) 1) {
                length = i + 1;
                iArr[i] = iArr2[i2];
                i = length;
                length = i2;
            } else {
                length = i2;
            }
        }
    }

    private final boolean m4003a(C0520y c0520y) {
        byte[] bArr = this.k;
        int[] iArr = this.h;
        Object[] objArr = this.f3720j;
        int length = iArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (bArr[i] == (byte) 1 && !c0520y.mo946a(iArr[i], objArr[i])) {
                return false;
            }
            length = i;
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a);
        Object c0521c = new C0521c(objectOutput);
        if (!m4003a(c0521c)) {
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
                m4004a(objectInput.readInt(), objectInput.readObject());
                readInt = i;
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ Object clone() {
        C0538v c0538v = (C0538v) super.clone();
        c0538v.f3720j = (Object[]) this.f3720j.clone();
        return c0538v;
    }
}
