package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7539o extends b {
    public int f39178a;
    public String f39179b;
    public String f39180c;

    public C7539o() {
        this.f39178a = 0;
        this.f39179b = "";
        this.f39180c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36568a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39178a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39179b);
        }
        if ((this.f39178a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39180c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36569b() {
        int b = super.b();
        if ((this.f39178a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39179b);
        }
        if ((this.f39178a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f39180c);
        }
        return b;
    }

    public final /* synthetic */ i m36567a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39179b = c7213a.m33564f();
                    this.f39178a |= 1;
                    continue;
                case 18:
                    this.f39180c = c7213a.m33564f();
                    this.f39178a |= 2;
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
