package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eu extends b {
    public int f38852a;
    public String f38853b;
    public fc f38854c;

    public eu() {
        this.f38852a = 0;
        this.f38853b = "";
        this.f38854c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36368a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38852a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38853b);
        }
        if (this.f38854c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38854c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36369b() {
        int b = super.b();
        if ((this.f38852a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38853b);
        }
        if (this.f38854c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f38854c);
        }
        return b;
    }

    public final /* synthetic */ i m36367a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38853b = c7213a.m33564f();
                    this.f38852a |= 1;
                    continue;
                case 18:
                    if (this.f38854c == null) {
                        this.f38854c = new fc();
                    }
                    c7213a.m33552a(this.f38854c);
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
