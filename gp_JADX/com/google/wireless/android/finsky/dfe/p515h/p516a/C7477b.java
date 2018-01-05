package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7477b extends b {
    public static volatile C7477b[] f38064a;
    public int f38065b;
    public String f38066c;
    public String f38067d;

    public static C7477b[] m35778d() {
        if (f38064a == null) {
            synchronized (C7219h.f35465b) {
                if (f38064a == null) {
                    f38064a = new C7477b[0];
                }
            }
        }
        return f38064a;
    }

    public C7477b() {
        this.f38065b = 0;
        this.f38066c = "";
        this.f38067d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35780a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38065b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38066c);
        }
        if ((this.f38065b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38067d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35781b() {
        int b = super.b();
        if ((this.f38065b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38066c);
        }
        if ((this.f38065b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38067d);
        }
        return b;
    }

    public final /* synthetic */ i m35779a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38066c = c7213a.m33564f();
                    this.f38065b |= 1;
                    continue;
                case 18:
                    this.f38067d = c7213a.m33564f();
                    this.f38065b |= 2;
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
