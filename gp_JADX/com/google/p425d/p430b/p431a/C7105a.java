package com.google.p425d.p430b.p431a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7105a extends b {
    public String f34756a;
    public int f34757b;
    public String[] f34758c;
    public int[] f34759d;
    public byte[] f34760e;
    public boolean f34761f;
    public String f34762g;

    public C7105a() {
        this.f34756a = "";
        this.f34757b = 0;
        this.f34758c = C7222l.f35477j;
        this.f34759d = C7222l.f35472e;
        this.f34760e = C7222l.f35479l;
        this.f34761f = false;
        this.f34762g = "";
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7105a)) {
            return false;
        }
        C7105a c7105a = (C7105a) obj;
        if (this.f34756a == null) {
            if (c7105a.f34756a != null) {
                return false;
            }
        } else if (!this.f34756a.equals(c7105a.f34756a)) {
            return false;
        }
        if (this.f34757b != c7105a.f34757b) {
            return false;
        }
        if (!C7219h.m33616a(this.f34758c, c7105a.f34758c)) {
            return false;
        }
        if (!C7219h.m33614a(this.f34759d, c7105a.f34759d)) {
            return false;
        }
        if (!Arrays.equals(this.f34760e, c7105a.f34760e)) {
            return false;
        }
        if (this.f34761f != c7105a.f34761f) {
            return false;
        }
        if (this.f34762g == null) {
            if (c7105a.f34762g != null) {
                return false;
            }
        } else if (!this.f34762g.equals(c7105a.f34762g)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7105a.aO);
        }
        if (c7105a.aO == null || c7105a.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f34762g == null ? 0 : this.f34762g.hashCode()) + (((this.f34761f ? 1231 : 1237) + (((((((((((this.f34756a == null ? 0 : this.f34756a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f34757b) * 31) + C7219h.m33609a(this.f34758c)) * 31) + C7219h.m33607a(this.f34759d)) * 31) + Arrays.hashCode(this.f34760e)) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32290a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f34756a == null || this.f34756a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34756a);
        }
        if (this.f34757b != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f34757b);
        }
        if (this.f34758c != null && this.f34758c.length > 0) {
            for (String str : this.f34758c) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(3, str);
                }
            }
        }
        if (this.f34759d != null && this.f34759d.length > 0) {
            while (i < this.f34759d.length) {
                codedOutputByteBufferNano.m33518a(4, this.f34759d[i]);
                i++;
            }
        }
        if (!Arrays.equals(this.f34760e, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(5, this.f34760e);
        }
        if (this.f34761f) {
            codedOutputByteBufferNano.m33522a(6, this.f34761f);
        }
        if (!(this.f34762g == null || this.f34762g.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f34762g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32291b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (!(this.f34756a == null || this.f34756a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34756a);
        }
        if (this.f34757b != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f34757b);
        }
        if (this.f34758c != null && this.f34758c.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f34758c) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f34759d != null && this.f34759d.length > 0) {
            i = 0;
            while (i2 < this.f34759d.length) {
                i += CodedOutputByteBufferNano.m33498c(this.f34759d[i2]);
                i2++;
            }
            b = (b + i) + (this.f34759d.length * 1);
        }
        if (!Arrays.equals(this.f34760e, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(5, this.f34760e);
        }
        if (this.f34761f) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (this.f34762g == null || this.f34762g.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(7, this.f34762g);
    }

    public final /* synthetic */ i m32289a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34756a = c7213a.m33564f();
                    continue;
                case 16:
                    this.f34757b = c7213a.m33567i();
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f34758c == null ? 0 : this.f34758c.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34758c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f34758c = obj;
                    continue;
                case 32:
                    a2 = C7222l.m33624a(c7213a, 32);
                    if (this.f34759d == null) {
                        a = 0;
                    } else {
                        a = this.f34759d.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34759d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34759d = obj;
                    continue;
                case 34:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34759d == null ? 0 : this.f34759d.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34759d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34759d = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 42:
                    this.f34760e = c7213a.m33565g();
                    continue;
                case 48:
                    this.f34761f = c7213a.m33563e();
                    continue;
                case 58:
                    this.f34762g = c7213a.m33564f();
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
}
