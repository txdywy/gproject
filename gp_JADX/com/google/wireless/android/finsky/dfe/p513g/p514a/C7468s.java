package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7468s extends b {
    public static volatile C7468s[] f37935a;
    public int f37936b;
    public String f37937c;
    public C7470u f37938d;
    public C7460k f37939e;

    public static C7468s[] m35689d() {
        if (f37935a == null) {
            synchronized (C7219h.f35465b) {
                if (f37935a == null) {
                    f37935a = new C7468s[0];
                }
            }
        }
        return f37935a;
    }

    public C7468s() {
        this.f37936b = 0;
        this.f37937c = "";
        this.f37938d = null;
        this.f37939e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35691a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37936b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37937c);
        }
        if (this.f37938d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37938d);
        }
        if (this.f37939e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37939e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35692b() {
        int b = super.b();
        if ((this.f37936b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37937c);
        }
        if (this.f37938d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37938d);
        }
        if (this.f37939e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37939e);
        }
        return b;
    }

    public final /* synthetic */ i m35690a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37937c = c7213a.m33564f();
                    this.f37936b |= 1;
                    continue;
                case 26:
                    if (this.f37938d == null) {
                        this.f37938d = new C7470u();
                    }
                    c7213a.m33552a(this.f37938d);
                    continue;
                case 34:
                    if (this.f37939e == null) {
                        this.f37939e = new C7460k();
                    }
                    c7213a.m33552a(this.f37939e);
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
