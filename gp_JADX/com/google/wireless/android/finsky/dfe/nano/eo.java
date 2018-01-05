package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eo extends b {
    public static volatile eo[] f38792a;
    public int f38793b;
    public String f38794c;
    public boolean f38795d;

    public static eo[] m36346d() {
        if (f38792a == null) {
            synchronized (C7219h.f35465b) {
                if (f38792a == null) {
                    f38792a = new eo[0];
                }
            }
        }
        return f38792a;
    }

    public eo() {
        this.f38793b = 0;
        this.f38794c = "";
        this.f38795d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36348a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38793b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38794c);
        }
        if ((this.f38793b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38795d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36349b() {
        int b = super.b();
        if ((this.f38793b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38794c);
        }
        if ((this.f38793b & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36347a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38794c = c7213a.m33564f();
                    this.f38793b |= 1;
                    continue;
                case 16:
                    this.f38795d = c7213a.m33563e();
                    this.f38793b |= 2;
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
