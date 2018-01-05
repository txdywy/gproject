package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ah extends C0758b {
    public static volatile ah[] f5335a;
    public ag f5336b;

    public static ah[] m5284a() {
        if (f5335a == null) {
            synchronized (h.b) {
                if (f5335a == null) {
                    f5335a = new ah[0];
                }
            }
        }
        return f5335a;
    }

    public ah() {
        this.f5336b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5336b != null) {
            codedOutputByteBufferNano.b(2, this.f5336b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5336b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f5336b);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    if (this.f5336b == null) {
                        this.f5336b = new ag();
                    }
                    aVar.a(this.f5336b);
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
