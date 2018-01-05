package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p089i.p090a;

import com.google.h.c.a.a.a.a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0831b extends C0758b {
    public String f5278a;
    public byte[] f5279b;
    public a f5280c;

    public C0831b() {
        this.f5278a = "";
        this.f5279b = l.l;
        this.f5280c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5278a == null || this.f5278a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5278a);
        }
        if (!Arrays.equals(this.f5279b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5279b);
        }
        if (this.f5280c != null) {
            codedOutputByteBufferNano.b(3, this.f5280c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5278a == null || this.f5278a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5278a);
        }
        if (!Arrays.equals(this.f5279b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5279b);
        }
        if (this.f5280c != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f5280c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5278a = aVar.f();
                    continue;
                case 18:
                    this.f5279b = aVar.g();
                    continue;
                case 26:
                    if (this.f5280c == null) {
                        this.f5280c = new a();
                    }
                    aVar.a(this.f5280c);
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
