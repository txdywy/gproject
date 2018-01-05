package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7454e extends b {
    public int f37858a;
    public String f37859b;
    public ab f37860c;
    public ae f37861d;
    public ai f37862e;
    public String f37863f;

    public C7454e() {
        this.f37858a = 0;
        this.f37859b = "";
        this.f37860c = null;
        this.f37861d = null;
        this.f37862e = null;
        this.f37863f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35636a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37858a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37859b);
        }
        if (this.f37860c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37860c);
        }
        if (this.f37861d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37861d);
        }
        if (this.f37862e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37862e);
        }
        if ((this.f37858a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37863f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35637b() {
        int b = super.b();
        if ((this.f37858a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37859b);
        }
        if (this.f37860c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37860c);
        }
        if (this.f37861d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37861d);
        }
        if (this.f37862e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37862e);
        }
        if ((this.f37858a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f37863f);
        }
        return b;
    }

    public final /* synthetic */ i m35635a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37859b = c7213a.m33564f();
                    this.f37858a |= 1;
                    continue;
                case 18:
                    if (this.f37860c == null) {
                        this.f37860c = new ab();
                    }
                    c7213a.m33552a(this.f37860c);
                    continue;
                case 26:
                    if (this.f37861d == null) {
                        this.f37861d = new ae();
                    }
                    c7213a.m33552a(this.f37861d);
                    continue;
                case 34:
                    if (this.f37862e == null) {
                        this.f37862e = new ai();
                    }
                    c7213a.m33552a(this.f37862e);
                    continue;
                case 42:
                    this.f37863f = c7213a.m33564f();
                    this.f37858a |= 2;
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
