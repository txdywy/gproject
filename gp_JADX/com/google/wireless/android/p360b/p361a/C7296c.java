package com.google.wireless.android.p360b.p361a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7296c extends b {
    public static volatile C7296c[] f36184a;
    public int f36185b;
    public String f36186c;
    public int f36187d;

    public static C7296c[] m34507d() {
        if (f36184a == null) {
            synchronized (C7219h.f35465b) {
                if (f36184a == null) {
                    f36184a = new C7296c[0];
                }
            }
        }
        return f36184a;
    }

    public C7296c() {
        this.f36185b = 0;
        this.f36186c = "";
        this.f36187d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34509a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36185b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36186c);
        }
        if ((this.f36185b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36187d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34510b() {
        int b = super.b();
        if ((this.f36185b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36186c);
        }
        if ((this.f36185b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36187d);
        }
        return b;
    }

    public final /* synthetic */ i m34508a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36186c = c7213a.m33564f();
                    this.f36185b |= 1;
                    continue;
                case 16:
                    this.f36187d = c7213a.m33567i();
                    this.f36185b |= 2;
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
