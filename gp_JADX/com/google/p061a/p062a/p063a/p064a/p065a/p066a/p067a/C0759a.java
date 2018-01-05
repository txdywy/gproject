package com.google.p061a.p062a.p063a.p064a.p065a.p066a.p067a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0759a extends C0758b {
    public String f4732a;
    public C0760b f4733b;

    public C0759a() {
        this.f4732a = "";
        this.f4733b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4732a == null || this.f4732a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4732a);
        }
        if (this.f4733b != null) {
            codedOutputByteBufferNano.b(4, this.f4733b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4732a == null || this.f4732a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4732a);
        }
        if (this.f4733b != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f4733b);
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
                    this.f4732a = aVar.f();
                    continue;
                case 34:
                    if (this.f4733b == null) {
                        this.f4733b = new C0760b();
                    }
                    aVar.a(this.f4733b);
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
