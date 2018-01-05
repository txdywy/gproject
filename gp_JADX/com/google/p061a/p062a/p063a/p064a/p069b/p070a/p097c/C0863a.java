package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0863a extends C0758b {
    public String f5506a;
    public ae f5507b;

    public C0863a() {
        this.f5506a = "";
        this.f5507b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5506a == null || this.f5506a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5506a);
        }
        if (this.f5507b != null) {
            codedOutputByteBufferNano.b(2, this.f5507b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5506a == null || this.f5506a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5506a);
        }
        if (this.f5507b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f5507b);
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
                    this.f5506a = aVar.f();
                    continue;
                case 18:
                    if (this.f5507b == null) {
                        this.f5507b = new ae();
                    }
                    aVar.a(this.f5507b);
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
