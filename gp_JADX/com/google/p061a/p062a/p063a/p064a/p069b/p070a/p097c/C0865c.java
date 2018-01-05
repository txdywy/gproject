package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0865c extends C0758b {
    public int f5512a;
    public byte[] f5513b;

    public final byte[] m5452a() {
        if (this.f5512a == 0) {
            return this.f5513b;
        }
        return l.l;
    }

    public C0865c() {
        this.f5512a = -1;
        this.f5512a = -1;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5512a == 0) {
            codedOutputByteBufferNano.a(2, this.f5513b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5512a == 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f5513b);
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
                    this.f5513b = aVar.g();
                    this.f5512a = 0;
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
