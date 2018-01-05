package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7492q extends b {
    public static volatile C7492q[] f38123a;
    public int f38124b;
    public int f38125c;
    public String f38126d;
    public C7493r f38127e;
    public boolean f38128f;
    public String f38129g;
    public String f38130h;

    public static C7492q[] m35836d() {
        if (f38123a == null) {
            synchronized (C7219h.f35465b) {
                if (f38123a == null) {
                    f38123a = new C7492q[0];
                }
            }
        }
        return f38123a;
    }

    public C7492q() {
        this.f38124b = 0;
        this.f38125c = 0;
        this.f38126d = "";
        this.f38127e = null;
        this.f38128f = false;
        this.f38129g = "";
        this.f38130h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35838a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38124b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38125c);
        }
        if ((this.f38124b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38126d);
        }
        if (this.f38127e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38127e);
        }
        if ((this.f38124b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f38128f);
        }
        if ((this.f38124b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38129g);
        }
        if ((this.f38124b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38130h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35839b() {
        int b = super.b();
        if ((this.f38124b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38125c);
        }
        if ((this.f38124b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38126d);
        }
        if (this.f38127e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38127e);
        }
        if ((this.f38124b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f38124b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38129g);
        }
        if ((this.f38124b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f38130h);
        }
        return b;
    }

    public final /* synthetic */ i m35837a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38125c = c7213a.m33567i();
                    this.f38124b |= 1;
                    continue;
                case 18:
                    this.f38126d = c7213a.m33564f();
                    this.f38124b |= 2;
                    continue;
                case 26:
                    if (this.f38127e == null) {
                        this.f38127e = new C7493r();
                    }
                    c7213a.m33552a(this.f38127e);
                    continue;
                case 32:
                    this.f38128f = c7213a.m33563e();
                    this.f38124b |= 4;
                    continue;
                case 42:
                    this.f38129g = c7213a.m33564f();
                    this.f38124b |= 8;
                    continue;
                case 50:
                    this.f38130h = c7213a.m33564f();
                    this.f38124b |= 16;
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
