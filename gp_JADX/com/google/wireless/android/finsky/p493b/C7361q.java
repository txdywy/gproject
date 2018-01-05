package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7361q extends b {
    public int f36789a;
    public String[] f36790b;
    public long f36791c;
    public long f36792d;
    public boolean f36793e;

    public C7361q() {
        this.f36789a = 0;
        this.f36790b = C7222l.f35477j;
        this.f36791c = 0;
        this.f36792d = 0;
        this.f36793e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34884a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36790b != null && this.f36790b.length > 0) {
            for (String str : this.f36790b) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(2, str);
                }
            }
        }
        if ((this.f36789a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36791c);
        }
        if ((this.f36789a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f36792d);
        }
        if ((this.f36789a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f36793e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34885b() {
        int i = 0;
        int b = super.b();
        if (this.f36790b == null || this.f36790b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f36790b.length) {
                String str = this.f36790b[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if ((this.f36789a & 1) != 0) {
            i += CodedOutputByteBufferNano.m33508f(3, this.f36791c);
        }
        if ((this.f36789a & 2) != 0) {
            i += CodedOutputByteBufferNano.m33508f(4, this.f36792d);
        }
        if ((this.f36789a & 4) != 0) {
            return i + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return i;
    }

    public final /* synthetic */ i m34883a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36790b == null ? 0 : this.f36790b.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36790b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36790b = obj;
                    continue;
                case 24:
                    this.f36791c = c7213a.m33568j();
                    this.f36789a |= 1;
                    continue;
                case 32:
                    this.f36792d = c7213a.m33568j();
                    this.f36789a |= 2;
                    continue;
                case 40:
                    this.f36793e = c7213a.m33563e();
                    this.f36789a |= 4;
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
