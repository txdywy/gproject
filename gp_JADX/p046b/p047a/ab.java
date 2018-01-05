package p046b.p047a;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public final class ab extends aa implements Externalizable {
    public final boolean m3940e(long j) {
        boolean z = false;
        int c = m3937c(j);
        if (c < 0) {
            return false;
        }
        byte b = this.k[c];
        this.h[c] = j;
        this.k[c] = (byte) 1;
        if (b == (byte) 0) {
            z = true;
        }
        m3924a(z);
        return true;
    }

    protected final void mo938d(int i) {
        int length = this.h.length;
        long[] jArr = this.h;
        byte[] bArr = this.k;
        this.h = new long[i];
        this.k = new byte[i];
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            if (bArr[i2] == (byte) 1) {
                long j = jArr[i2];
                length = m3937c(j);
                this.h[length] = j;
                this.k[length] = (byte) 1;
                length = i2;
            } else {
                length = i2;
            }
        }
    }

    public final void clear() {
        super.clear();
        long[] jArr = this.h;
        byte[] bArr = this.k;
        int length = jArr.length;
        while (true) {
            int i = length - 1;
            if (length > 0) {
                jArr[i] = 0;
                bArr[i] = (byte) 0;
                length = i;
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (abVar.size() == size()) {
            return m3933a(new ac(abVar));
        }
        return false;
    }

    public final int hashCode() {
        aj adVar = new ad(this);
        m3933a(adVar);
        return adVar.f3678a;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a);
        aj c0521c = new C0521c(objectOutput);
        if (!m3933a(c0521c)) {
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
                m3940e(objectInput.readLong());
                readInt = i;
            } else {
                return;
            }
        }
    }
}
