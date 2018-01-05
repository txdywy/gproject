package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7112g extends b {
    public int f34791a;
    public int f34792b;
    public int f34793c;
    public C7109d f34794d;
    public boolean f34795e;
    public String[] f34796f;
    public boolean f34797g;
    public long f34798h;
    public String[] f34799i;

    public C7112g() {
        this.f34791a = 0;
        this.f34792b = 0;
        this.f34793c = 0;
        this.f34794d = null;
        this.f34795e = false;
        this.f34796f = C7222l.f35477j;
        this.f34797g = false;
        this.f34798h = 0;
        this.f34799i = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32314a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f34791a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34791a);
        }
        if (this.f34792b != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34792b);
        }
        if (this.f34793c != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f34793c);
        }
        if (this.f34794d != null) {
            codedOutputByteBufferNano.m33532b(5, this.f34794d);
        }
        if (this.f34795e) {
            codedOutputByteBufferNano.m33522a(6, this.f34795e);
        }
        if (this.f34796f != null && this.f34796f.length > 0) {
            for (String str : this.f34796f) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(7, str);
                }
            }
        }
        if (this.f34798h != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f34798h);
        }
        if (this.f34797g) {
            codedOutputByteBufferNano.m33522a(9, this.f34797g);
        }
        if (this.f34799i != null && this.f34799i.length > 0) {
            while (i < this.f34799i.length) {
                String str2 = this.f34799i[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(10, str2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32315b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.f34791a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34791a);
        }
        if (this.f34792b != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f34792b);
        }
        if (this.f34793c != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34793c);
        }
        if (this.f34794d != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f34794d);
        }
        if (this.f34795e) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (this.f34796f != null && this.f34796f.length > 0) {
            i = 0;
            int i4 = 0;
            for (String str : this.f34796f) {
                if (str != null) {
                    i4++;
                    i += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i) + (i4 * 1);
        }
        if (this.f34798h != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f34798h);
        }
        if (this.f34797g) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if (this.f34799i == null || this.f34799i.length <= 0) {
            return b;
        }
        i2 = 0;
        i = 0;
        while (i3 < this.f34799i.length) {
            String str2 = this.f34799i[i3];
            if (str2 != null) {
                i++;
                i2 += CodedOutputByteBufferNano.m33495b(str2);
            }
            i3++;
        }
        return (b + i2) + (i * 1);
    }

    public final /* synthetic */ i m32313a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34791a = c7213a.m33567i();
                    continue;
                case 24:
                    this.f34792b = c7213a.m33567i();
                    continue;
                case 32:
                    this.f34793c = c7213a.m33567i();
                    continue;
                case 42:
                    if (this.f34794d == null) {
                        this.f34794d = new C7109d();
                    }
                    c7213a.m33552a(this.f34794d);
                    continue;
                case 48:
                    this.f34795e = c7213a.m33563e();
                    continue;
                case 58:
                    a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f34796f == null ? 0 : this.f34796f.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34796f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f34796f = obj;
                    continue;
                case 64:
                    this.f34798h = c7213a.m33568j();
                    continue;
                case 72:
                    this.f34797g = c7213a.m33563e();
                    continue;
                case 82:
                    a2 = C7222l.m33624a(c7213a, 82);
                    a = this.f34799i == null ? 0 : this.f34799i.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34799i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f34799i = obj;
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
