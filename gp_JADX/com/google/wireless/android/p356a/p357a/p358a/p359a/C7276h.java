package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7276h extends b implements Cloneable {
    public byte[] f36072a;
    public String f36073b;
    public byte[][] f36074c;
    public boolean f36075d;

    public C7276h() {
        this.f36072a = C7222l.f35479l;
        this.f36073b = "";
        this.f36074c = C7222l.f35478k;
        this.f36075d = false;
        this.aO = null;
        this.aP = -1;
    }

    private final C7276h m34400d() {
        try {
            C7276h c7276h = (C7276h) super.cK_();
            if (this.f36074c != null && this.f36074c.length > 0) {
                c7276h.f36074c = (byte[][]) this.f36074c.clone();
            }
            return c7276h;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7276h)) {
            return false;
        }
        C7276h c7276h = (C7276h) obj;
        if (!Arrays.equals(this.f36072a, c7276h.f36072a)) {
            return false;
        }
        if (this.f36073b == null) {
            if (c7276h.f36073b != null) {
                return false;
            }
        } else if (!this.f36073b.equals(c7276h.f36073b)) {
            return false;
        }
        if (!C7219h.m33618a(this.f36074c, c7276h.f36074c)) {
            return false;
        }
        if (this.f36075d != c7276h.f36075d) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7276h.aO);
        }
        if (c7276h.aO == null || c7276h.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36075d ? 1231 : 1237) + (((((this.f36073b == null ? 0 : this.f36073b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f36072a)) * 31)) * 31) + C7219h.m33611a(this.f36074c)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34402a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f36072a, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(1, this.f36072a);
        }
        if (this.f36074c != null && this.f36074c.length > 0) {
            for (byte[] bArr : this.f36074c) {
                if (bArr != null) {
                    codedOutputByteBufferNano.m33523a(2, bArr);
                }
            }
        }
        if (this.f36075d) {
            codedOutputByteBufferNano.m33522a(3, this.f36075d);
        }
        if (!(this.f36073b == null || this.f36073b.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36073b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34403b() {
        int i = 0;
        int b = super.b();
        if (!Arrays.equals(this.f36072a, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f36072a);
        }
        if (this.f36074c != null && this.f36074c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f36074c.length) {
                byte[] bArr = this.f36074c[i];
                if (bArr != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33496b(bArr);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f36075d) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f36073b == null || this.f36073b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(4, this.f36073b);
    }

    public final /* synthetic */ b cK_() {
        return (C7276h) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7276h) clone();
    }

    public final /* synthetic */ i m34401a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36072a = c7213a.m33565g();
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36074c == null ? 0 : this.f36074c.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f36074c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33565g();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33565g();
                    this.f36074c = obj;
                    continue;
                case 24:
                    this.f36075d = c7213a.m33563e();
                    continue;
                case 34:
                    this.f36073b = c7213a.m33564f();
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ Object clone() {
        return m34400d();
    }
}
