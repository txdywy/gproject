package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fc extends b {
    public int f38899a;
    public String f38900b;
    public String f38901c;
    public String f38902d;

    public fc() {
        this.f38899a = 0;
        this.f38900b = "";
        this.f38901c = "";
        this.f38902d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36401a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38899a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38900b);
        }
        if ((this.f38899a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38901c);
        }
        if ((this.f38899a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38902d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36402b() {
        int b = super.b();
        if ((this.f38899a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38900b);
        }
        if ((this.f38899a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38901c);
        }
        if ((this.f38899a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38902d);
        }
        return b;
    }

    public final /* synthetic */ i m36400a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38900b = c7213a.m33564f();
                    this.f38899a |= 1;
                    continue;
                case 18:
                    this.f38901c = c7213a.m33564f();
                    this.f38899a |= 2;
                    continue;
                case 26:
                    this.f38902d = c7213a.m33564f();
                    this.f38899a |= 4;
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
