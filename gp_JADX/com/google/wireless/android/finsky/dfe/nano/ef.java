package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ef extends b {
    public static volatile ef[] f38741a;
    public int f38742b;
    public String f38743c;
    public bd f38744d;

    public static ef[] m36320d() {
        if (f38741a == null) {
            synchronized (C7219h.f35465b) {
                if (f38741a == null) {
                    f38741a = new ef[0];
                }
            }
        }
        return f38741a;
    }

    public ef() {
        this.f38742b = 0;
        this.f38743c = "";
        this.f38744d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36322a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38742b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38743c);
        }
        if (this.f38744d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38744d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36323b() {
        int b = super.b();
        if ((this.f38742b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38743c);
        }
        if (this.f38744d != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f38744d);
        }
        return b;
    }

    public final /* synthetic */ i m36321a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38743c = c7213a.m33564f();
                    this.f38742b |= 1;
                    continue;
                case 18:
                    if (this.f38744d == null) {
                        this.f38744d = new bd();
                    }
                    c7213a.m33552a(this.f38744d);
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
