package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aq extends b {
    public static volatile aq[] f36418a;
    public int f36419b;
    public String f36420c;
    public String f36421d;

    public static aq[] m34660d() {
        if (f36418a == null) {
            synchronized (C7219h.f35465b) {
                if (f36418a == null) {
                    f36418a = new aq[0];
                }
            }
        }
        return f36418a;
    }

    public aq() {
        this.f36419b = 0;
        this.f36420c = "";
        this.f36421d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34662a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36419b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36420c);
        }
        if ((this.f36419b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36421d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34663b() {
        int b = super.b();
        if ((this.f36419b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36420c);
        }
        if ((this.f36419b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36421d);
        }
        return b;
    }

    public final /* synthetic */ i m34661a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36420c = c7213a.m33564f();
                    this.f36419b |= 1;
                    continue;
                case 18:
                    this.f36421d = c7213a.m33564f();
                    this.f36419b |= 2;
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
