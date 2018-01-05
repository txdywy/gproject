package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7423m extends b {
    public static volatile C7423m[] f37615a;
    public int f37616b;
    public String f37617c;
    public String f37618d;

    public static C7423m[] m35481d() {
        if (f37615a == null) {
            synchronized (C7219h.f35465b) {
                if (f37615a == null) {
                    f37615a = new C7423m[0];
                }
            }
        }
        return f37615a;
    }

    public C7423m() {
        this.f37616b = 0;
        this.f37617c = "";
        this.f37618d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35483a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37616b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37617c);
        }
        if ((this.f37616b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37618d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35484b() {
        int b = super.b();
        if ((this.f37616b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37617c);
        }
        if ((this.f37616b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f37618d);
        }
        return b;
    }

    public final /* synthetic */ i m35482a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37617c = c7213a.m33564f();
                    this.f37616b |= 1;
                    continue;
                case 18:
                    this.f37618d = c7213a.m33564f();
                    this.f37616b |= 2;
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
