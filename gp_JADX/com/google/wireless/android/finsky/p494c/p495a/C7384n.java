package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7384n extends b {
    public int f36902a;
    public byte[] f36903b;
    public String[] f36904c;
    public C7386p f36905d;

    public C7384n() {
        this.f36902a = 0;
        this.f36903b = C7222l.f35479l;
        this.f36904c = C7222l.f35477j;
        this.f36905d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34969a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36902a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f36903b);
        }
        if (this.f36904c != null && this.f36904c.length > 0) {
            for (String str : this.f36904c) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(2, str);
                }
            }
        }
        if (this.f36905d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36905d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34970b() {
        int i = 0;
        int b = super.b();
        if ((this.f36902a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f36903b);
        }
        if (this.f36904c != null && this.f36904c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f36904c.length) {
                String str = this.f36904c[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f36905d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f36905d);
        }
        return b;
    }

    public final /* synthetic */ i m34968a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36903b = c7213a.m33565g();
                    this.f36902a |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36904c == null ? 0 : this.f36904c.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36904c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36904c = obj;
                    continue;
                case 26:
                    if (this.f36905d == null) {
                        this.f36905d = new C7386p();
                    }
                    c7213a.m33552a(this.f36905d);
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
