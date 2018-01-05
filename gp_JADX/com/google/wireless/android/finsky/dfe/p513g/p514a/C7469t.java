package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7469t extends b {
    public int f37940a;
    public String f37941b;
    public ab f37942c;
    public ae f37943d;
    public ai f37944e;

    public C7469t() {
        this.f37940a = 0;
        this.f37941b = "";
        this.f37942c = null;
        this.f37943d = null;
        this.f37944e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35694a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37940a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37941b);
        }
        if (this.f37942c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37942c);
        }
        if (this.f37943d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37943d);
        }
        if (this.f37944e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37944e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35695b() {
        int b = super.b();
        if ((this.f37940a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37941b);
        }
        if (this.f37942c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37942c);
        }
        if (this.f37943d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37943d);
        }
        if (this.f37944e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37944e);
        }
        return b;
    }

    public final /* synthetic */ i m35693a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37941b = c7213a.m33564f();
                    this.f37940a |= 1;
                    continue;
                case 18:
                    if (this.f37942c == null) {
                        this.f37942c = new ab();
                    }
                    c7213a.m33552a(this.f37942c);
                    continue;
                case 26:
                    if (this.f37943d == null) {
                        this.f37943d = new ae();
                    }
                    c7213a.m33552a(this.f37943d);
                    continue;
                case 34:
                    if (this.f37944e == null) {
                        this.f37944e = new ai();
                    }
                    c7213a.m33552a(this.f37944e);
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
