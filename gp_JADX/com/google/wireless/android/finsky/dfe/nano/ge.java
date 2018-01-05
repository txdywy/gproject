package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ge extends b {
    public static volatile ge[] f39075a;
    public int f39076b;
    public String f39077c;

    public static ge[] m36489d() {
        if (f39075a == null) {
            synchronized (C7219h.f35465b) {
                if (f39075a == null) {
                    f39075a = new ge[0];
                }
            }
        }
        return f39075a;
    }

    public ge() {
        this.f39076b = 0;
        this.f39077c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36491a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39076b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39077c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36492b() {
        int b = super.b();
        if ((this.f39076b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f39077c);
        }
        return b;
    }

    public final /* synthetic */ i m36490a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39077c = c7213a.m33564f();
                    this.f39076b |= 1;
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
