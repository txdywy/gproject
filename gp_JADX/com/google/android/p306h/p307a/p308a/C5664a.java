package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5664a extends C0758b {
    public Integer f28722a;
    public Integer f28723b;

    public C5664a() {
        this.f28722a = null;
        this.f28723b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28722a != null) {
            codedOutputByteBufferNano.a(1, this.f28722a.intValue());
        }
        if (this.f28723b != null) {
            codedOutputByteBufferNano.a(2, this.f28723b.intValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28722a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f28722a.intValue());
        }
        if (this.f28723b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f28723b.intValue());
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28722a = Integer.valueOf(aVar.i());
                    continue;
                case 16:
                    this.f28723b = Integer.valueOf(aVar.i());
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
