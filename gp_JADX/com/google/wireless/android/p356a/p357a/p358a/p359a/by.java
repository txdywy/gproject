package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.a.a.a.a.bo;

public final class by extends b {
    public int f35852a;
    public int f35853b;
    public long f35854c;
    public long f35855d;
    public String f35856e;
    public bq f35857f;
    public byte[] f35858g;
    public bu f35859h;
    public bp f35860i;
    public bo f35861j;
    public cb f35862k;
    public br f35863l;
    public cd f35864m;
    public bt f35865n;

    public final by m34247a(long j) {
        this.f35852a |= 4;
        this.f35855d = j;
        return this;
    }

    public by() {
        m34250d();
    }

    public final by m34250d() {
        this.f35852a = 0;
        this.f35853b = 0;
        this.f35854c = 0;
        this.f35855d = 0;
        this.f35856e = "";
        this.f35857f = null;
        this.f35858g = C7222l.f35479l;
        this.f35859h = null;
        this.f35860i = null;
        this.f35861j = null;
        this.f35862k = null;
        this.f35863l = null;
        this.f35864m = null;
        this.f35865n = null;
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final void m34248a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35859h != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35859h);
        }
        if (this.f35860i != null) {
            codedOutputByteBufferNano.m33532b(3, this.f35860i);
        }
        if (this.f35861j != null) {
            codedOutputByteBufferNano.m33532b(4, this.f35861j);
        }
        if (this.f35862k != null) {
            codedOutputByteBufferNano.m33532b(5, this.f35862k);
        }
        if (this.f35863l != null) {
            codedOutputByteBufferNano.m33532b(6, this.f35863l);
        }
        if (this.f35864m != null) {
            codedOutputByteBufferNano.m33532b(7, this.f35864m);
        }
        if (this.f35865n != null) {
            codedOutputByteBufferNano.m33532b(8, this.f35865n);
        }
        if ((this.f35852a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35853b);
        }
        if ((this.f35852a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(10, this.f35854c);
        }
        if ((this.f35852a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(11, this.f35855d);
        }
        if (this.f35857f != null) {
            codedOutputByteBufferNano.m33532b(12, this.f35857f);
        }
        if ((this.f35852a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f35856e);
        }
        if ((this.f35852a & 16) != 0) {
            codedOutputByteBufferNano.m33523a(14, this.f35858g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34249b() {
        int b = super.b();
        if (this.f35859h != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35859h);
        }
        if (this.f35860i != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f35860i);
        }
        if (this.f35861j != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f35861j);
        }
        if (this.f35862k != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f35862k);
        }
        if (this.f35863l != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f35863l);
        }
        if (this.f35864m != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f35864m);
        }
        if (this.f35865n != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f35865n);
        }
        if ((this.f35852a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f35853b);
        }
        if ((this.f35852a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(10, this.f35854c);
        }
        if ((this.f35852a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(11, this.f35855d);
        }
        if (this.f35857f != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f35857f);
        }
        if ((this.f35852a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f35856e);
        }
        if ((this.f35852a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(14, this.f35858g);
        }
        return b;
    }

    public final /* synthetic */ i m34246a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35859h == null) {
                        this.f35859h = new bu();
                    }
                    c7213a.m33552a(this.f35859h);
                    continue;
                case 26:
                    if (this.f35860i == null) {
                        this.f35860i = new bp();
                    }
                    c7213a.m33552a(this.f35860i);
                    continue;
                case 34:
                    if (this.f35861j == null) {
                        this.f35861j = new bo();
                    }
                    c7213a.m33552a(this.f35861j);
                    continue;
                case 42:
                    if (this.f35862k == null) {
                        this.f35862k = new cb();
                    }
                    c7213a.m33552a(this.f35862k);
                    continue;
                case 50:
                    if (this.f35863l == null) {
                        this.f35863l = new br();
                    }
                    c7213a.m33552a(this.f35863l);
                    continue;
                case 58:
                    if (this.f35864m == null) {
                        this.f35864m = new cd();
                    }
                    c7213a.m33552a(this.f35864m);
                    continue;
                case 66:
                    if (this.f35865n == null) {
                        this.f35865n = new bt();
                    }
                    c7213a.m33552a(this.f35865n);
                    continue;
                case 72:
                    this.f35853b = c7213a.m33567i();
                    this.f35852a |= 1;
                    continue;
                case 80:
                    this.f35854c = c7213a.m33568j();
                    this.f35852a |= 2;
                    continue;
                case 88:
                    this.f35855d = c7213a.m33568j();
                    this.f35852a |= 4;
                    continue;
                case 98:
                    if (this.f35857f == null) {
                        this.f35857f = new bq();
                    }
                    c7213a.m33552a(this.f35857f);
                    continue;
                case 106:
                    this.f35856e = c7213a.m33564f();
                    this.f35852a |= 8;
                    continue;
                case 114:
                    this.f35858g = c7213a.m33565g();
                    this.f35852a |= 16;
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
