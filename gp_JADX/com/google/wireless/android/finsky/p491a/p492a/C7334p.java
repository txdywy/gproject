package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7334p extends b {
    public static volatile C7334p[] f36576a;
    public int f36577b;
    public String f36578c;
    public String f36579d;

    public static C7334p[] m34760d() {
        if (f36576a == null) {
            synchronized (C7219h.f35465b) {
                if (f36576a == null) {
                    f36576a = new C7334p[0];
                }
            }
        }
        return f36576a;
    }

    public C7334p() {
        this.f36577b = 0;
        this.f36578c = "";
        this.f36579d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34762a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36577b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36578c);
        }
        if ((this.f36577b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36579d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34763b() {
        int b = super.b();
        if ((this.f36577b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36578c);
        }
        if ((this.f36577b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36579d);
        }
        return b;
    }

    public final /* synthetic */ i m34761a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36578c = c7213a.m33564f();
                    this.f36577b |= 1;
                    continue;
                case 18:
                    this.f36579d = c7213a.m33564f();
                    this.f36577b |= 2;
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
