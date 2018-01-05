package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0828d extends C0758b {
    public boolean f5258a;
    public boolean f5259b;
    public boolean f5260c;
    public int f5261d;
    public int f5262e;

    public C0828d() {
        this.f5258a = false;
        this.f5259b = false;
        this.f5260c = false;
        this.f5261d = 0;
        this.f5262e = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5258a) {
            codedOutputByteBufferNano.a(1, this.f5258a);
        }
        if (this.f5259b) {
            codedOutputByteBufferNano.a(2, this.f5259b);
        }
        if (this.f5260c) {
            codedOutputByteBufferNano.a(3, this.f5260c);
        }
        if (this.f5261d != 0) {
            codedOutputByteBufferNano.a(4, this.f5261d);
        }
        if (this.f5262e != 0) {
            codedOutputByteBufferNano.a(5, this.f5262e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5258a) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if (this.f5259b) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (this.f5260c) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if (this.f5261d != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f5261d);
        }
        if (this.f5262e != 0) {
            return b + CodedOutputByteBufferNano.d(5, this.f5262e);
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
                    this.f5258a = aVar.e();
                    continue;
                case 16:
                    this.f5259b = aVar.e();
                    continue;
                case 24:
                    this.f5260c = aVar.e();
                    continue;
                case 32:
                    this.f5261d = aVar.i();
                    continue;
                case 40:
                    this.f5262e = aVar.i();
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
