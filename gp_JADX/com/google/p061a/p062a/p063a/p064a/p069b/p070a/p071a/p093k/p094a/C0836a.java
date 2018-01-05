package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p093k.p094a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a.C0826b;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0836a extends C0758b {
    public C0826b f5302a;
    public String f5303b;

    public C0836a() {
        this.f5302a = null;
        this.f5303b = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5302a != null) {
            codedOutputByteBufferNano.b(1, this.f5302a);
        }
        if (!(this.f5303b == null || this.f5303b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5303b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5302a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5302a);
        }
        if (this.f5303b == null || this.f5303b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(2, this.f5303b);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5302a == null) {
                        this.f5302a = new C0826b();
                    }
                    aVar.a(this.f5302a);
                    continue;
                case 18:
                    this.f5303b = aVar.f();
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
