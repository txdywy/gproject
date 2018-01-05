package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7425o extends b {
    public static volatile C7425o[] f37633a;
    public int f37634b;
    public String f37635c;
    public String f37636d;

    public static C7425o[] m35489d() {
        if (f37633a == null) {
            synchronized (C7219h.f35465b) {
                if (f37633a == null) {
                    f37633a = new C7425o[0];
                }
            }
        }
        return f37633a;
    }

    public C7425o() {
        this.f37634b = 0;
        this.f37635c = "";
        this.f37636d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35491a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37634b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37635c);
        }
        if ((this.f37634b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37636d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35492b() {
        int b = super.b();
        if ((this.f37634b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37635c);
        }
        if ((this.f37634b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f37636d);
        }
        return b;
    }

    public final /* synthetic */ i m35490a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37635c = c7213a.m33564f();
                    this.f37634b |= 1;
                    continue;
                case 18:
                    this.f37636d = c7213a.m33564f();
                    this.f37634b |= 2;
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
