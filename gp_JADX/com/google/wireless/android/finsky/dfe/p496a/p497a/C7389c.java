package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7389c extends b {
    public static volatile C7389c[] f36922a;
    public int f36923b;
    public String f36924c;
    public String f36925d;
    public bd f36926e;
    public String f36927f;
    public C7397k f36928g;
    public C7391e f36929h;
    public C7390d f36930i;
    public byte[] f36931j;

    public static C7389c[] m34987d() {
        if (f36922a == null) {
            synchronized (C7219h.f35465b) {
                if (f36922a == null) {
                    f36922a = new C7389c[0];
                }
            }
        }
        return f36922a;
    }

    public C7389c() {
        this.f36923b = 0;
        this.f36924c = "";
        this.f36925d = "";
        this.f36926e = null;
        this.f36927f = "";
        this.f36928g = null;
        this.f36929h = null;
        this.f36930i = null;
        this.f36931j = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34989a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36923b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36924c);
        }
        if ((this.f36923b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36925d);
        }
        if (this.f36926e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36926e);
        }
        if ((this.f36923b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36927f);
        }
        if (this.f36928g != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36928g);
        }
        if (this.f36929h != null) {
            codedOutputByteBufferNano.m33532b(6, this.f36929h);
        }
        if (this.f36930i != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36930i);
        }
        if ((this.f36923b & 8) != 0) {
            codedOutputByteBufferNano.m33523a(8, this.f36931j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34990b() {
        int b = super.b();
        if ((this.f36923b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36924c);
        }
        if ((this.f36923b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36925d);
        }
        if (this.f36926e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36926e);
        }
        if ((this.f36923b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36927f);
        }
        if (this.f36928g != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36928g);
        }
        if (this.f36929h != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f36929h);
        }
        if (this.f36930i != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36930i);
        }
        if ((this.f36923b & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(8, this.f36931j);
        }
        return b;
    }

    public final /* synthetic */ i m34988a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36924c = c7213a.m33564f();
                    this.f36923b |= 1;
                    continue;
                case 18:
                    this.f36925d = c7213a.m33564f();
                    this.f36923b |= 2;
                    continue;
                case 26:
                    if (this.f36926e == null) {
                        this.f36926e = new bd();
                    }
                    c7213a.m33552a(this.f36926e);
                    continue;
                case 34:
                    this.f36927f = c7213a.m33564f();
                    this.f36923b |= 4;
                    continue;
                case 42:
                    if (this.f36928g == null) {
                        this.f36928g = new C7397k();
                    }
                    c7213a.m33552a(this.f36928g);
                    continue;
                case 50:
                    if (this.f36929h == null) {
                        this.f36929h = new C7391e();
                    }
                    c7213a.m33552a(this.f36929h);
                    continue;
                case 58:
                    if (this.f36930i == null) {
                        this.f36930i = new C7390d();
                    }
                    c7213a.m33552a(this.f36930i);
                    continue;
                case 66:
                    this.f36931j = c7213a.m33565g();
                    this.f36923b |= 8;
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
