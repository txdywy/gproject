package com.google.android.gms.instantapps.p286a.p287a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5258a extends C0758b {
    public C5259b f26387a;

    public C5258a() {
        this.f26387a = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f26387a != null) {
            codedOutputByteBufferNano.b(1, this.f26387a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f26387a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f26387a);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26387a == null) {
                        this.f26387a = new C5259b();
                    }
                    aVar.a(this.f26387a);
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
