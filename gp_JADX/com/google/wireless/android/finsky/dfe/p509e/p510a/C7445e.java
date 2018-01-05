package com.google.wireless.android.finsky.dfe.p509e.p510a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7445e extends b {
    public static volatile C7445e[] f37741a;
    public int f37742b;
    public String f37743c;

    public static C7445e[] m35555d() {
        if (f37741a == null) {
            synchronized (C7219h.f35465b) {
                if (f37741a == null) {
                    f37741a = new C7445e[0];
                }
            }
        }
        return f37741a;
    }

    public C7445e() {
        this.f37742b = 0;
        this.f37743c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35557a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37742b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37743c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35558b() {
        int b = super.b();
        if ((this.f37742b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f37743c);
        }
        return b;
    }

    public final /* synthetic */ i m35556a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37743c = c7213a.m33564f();
                    this.f37742b |= 1;
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
