package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ao extends C0758b {
    public String f5380a;
    public ae f5381b;

    public ao() {
        this.f5380a = "";
        this.f5381b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5380a == null || this.f5380a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5380a);
        }
        if (this.f5381b != null) {
            codedOutputByteBufferNano.b(2, this.f5381b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5380a == null || this.f5380a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5380a);
        }
        if (this.f5381b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f5381b);
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
                    this.f5380a = aVar.f();
                    continue;
                case 18:
                    if (this.f5381b == null) {
                        this.f5381b = new ae();
                    }
                    aVar.a(this.f5381b);
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
