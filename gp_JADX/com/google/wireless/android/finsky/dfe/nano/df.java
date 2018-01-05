package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class df extends b {
    public static volatile df[] f38635b;
    public int f38636a;
    public int f38637c;
    public String f38638d;
    public boolean f38639e;
    public int f38640f;
    public String f38641g;
    public di f38642h;
    public dg f38643i;
    public dh f38644j;

    public static df[] m36229d() {
        if (f38635b == null) {
            synchronized (C7219h.f35465b) {
                if (f38635b == null) {
                    f38635b = new df[0];
                }
            }
        }
        return f38635b;
    }

    public final di m36233e() {
        if (this.f38636a == 3) {
            return this.f38642h;
        }
        return null;
    }

    public final dg m36234f() {
        if (this.f38636a == 4) {
            return this.f38643i;
        }
        return null;
    }

    public final dh m36235g() {
        if (this.f38636a == 5) {
            return this.f38644j;
        }
        return null;
    }

    public df() {
        this.f38636a = -1;
        this.f38637c = 0;
        this.f38638d = "";
        this.f38636a = -1;
        this.f38639e = false;
        this.f38636a = -1;
        this.f38640f = 0;
        this.f38636a = -1;
        this.f38641g = "";
        this.f38636a = -1;
        this.f38642h = null;
        this.f38636a = -1;
        this.f38643i = null;
        this.f38636a = -1;
        this.f38644j = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36231a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38637c & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38638d);
        }
        if (this.f38636a == 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38639e);
        }
        if (this.f38636a == 1) {
            codedOutputByteBufferNano.m33518a(3, this.f38640f);
        }
        if (this.f38636a == 2) {
            codedOutputByteBufferNano.m33521a(4, this.f38641g);
        }
        if (this.f38636a == 3) {
            codedOutputByteBufferNano.m33532b(5, this.f38642h);
        }
        if (this.f38636a == 4) {
            codedOutputByteBufferNano.m33532b(6, this.f38643i);
        }
        if (this.f38636a == 5) {
            codedOutputByteBufferNano.m33532b(7, this.f38644j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36232b() {
        int b = super.b();
        if ((this.f38637c & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38638d);
        }
        if (this.f38636a == 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f38636a == 1) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f38640f);
        }
        if (this.f38636a == 2) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38641g);
        }
        if (this.f38636a == 3) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f38642h);
        }
        if (this.f38636a == 4) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f38643i);
        }
        if (this.f38636a == 5) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f38644j);
        }
        return b;
    }

    public final /* synthetic */ i m36230a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38638d = c7213a.m33564f();
                    this.f38637c |= 1;
                    continue;
                case 16:
                    this.f38639e = c7213a.m33563e();
                    this.f38636a = 0;
                    continue;
                case 24:
                    this.f38640f = c7213a.m33567i();
                    this.f38636a = 1;
                    continue;
                case 34:
                    this.f38641g = c7213a.m33564f();
                    this.f38636a = 2;
                    continue;
                case 42:
                    if (this.f38642h == null) {
                        this.f38642h = new di();
                    }
                    c7213a.m33552a(this.f38642h);
                    this.f38636a = 3;
                    continue;
                case 50:
                    if (this.f38643i == null) {
                        this.f38643i = new dg();
                    }
                    c7213a.m33552a(this.f38643i);
                    this.f38636a = 4;
                    continue;
                case 58:
                    if (this.f38644j == null) {
                        this.f38644j = new dh();
                    }
                    c7213a.m33552a(this.f38644j);
                    this.f38636a = 5;
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
