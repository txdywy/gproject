package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ed extends b {
    public static volatile ed[] f37538a;
    public int f37539b;
    public String f37540c;
    public byte[] f37541d;

    public static ed[] m35441d() {
        if (f37538a == null) {
            synchronized (C7219h.f35465b) {
                if (f37538a == null) {
                    f37538a = new ed[0];
                }
            }
        }
        return f37538a;
    }

    public ed() {
        this.f37539b = 0;
        this.f37540c = "";
        this.f37541d = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35443a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37539b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37540c);
        }
        if ((this.f37539b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f37541d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35444b() {
        int b = super.b();
        if ((this.f37539b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37540c);
        }
        if ((this.f37539b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f37541d);
        }
        return b;
    }

    public final /* synthetic */ i m35442a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37540c = c7213a.m33564f();
                    this.f37539b |= 1;
                    continue;
                case 18:
                    this.f37541d = c7213a.m33565g();
                    this.f37539b |= 2;
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
