package com.google.wireless.android.finsky.dfe.p523l.p524a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7522a extends b {
    public static volatile C7522a[] f38266a;
    public int f38267b;
    public String f38268c;
    public String f38269d;
    public long f38270e;
    public long f38271f;

    public static C7522a[] m35951d() {
        if (f38266a == null) {
            synchronized (C7219h.f35465b) {
                if (f38266a == null) {
                    f38266a = new C7522a[0];
                }
            }
        }
        return f38266a;
    }

    public C7522a() {
        this.f38267b = 0;
        this.f38268c = "";
        this.f38269d = "";
        this.f38270e = 0;
        this.f38271f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35953a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38267b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38268c);
        }
        if ((this.f38267b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38269d);
        }
        if ((this.f38267b & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f38270e);
        }
        if ((this.f38267b & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f38271f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35954b() {
        int b = super.b();
        if ((this.f38267b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38268c);
        }
        if ((this.f38267b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38269d);
        }
        if ((this.f38267b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f38270e);
        }
        if ((this.f38267b & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(4, this.f38271f);
        }
        return b;
    }

    public final /* synthetic */ i m35952a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38268c = c7213a.m33564f();
                    this.f38267b |= 1;
                    continue;
                case 18:
                    this.f38269d = c7213a.m33564f();
                    this.f38267b |= 2;
                    continue;
                case 24:
                    this.f38270e = c7213a.m33568j();
                    this.f38267b |= 4;
                    continue;
                case 32:
                    this.f38271f = c7213a.m33568j();
                    this.f38267b |= 8;
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
