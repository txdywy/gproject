package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0869g extends C0758b {
    public static volatile C0869g[] f5534a;
    public C0864b f5535b;
    public String f5536c;

    public static C0869g[] m5466a() {
        if (f5534a == null) {
            synchronized (h.b) {
                if (f5534a == null) {
                    f5534a = new C0869g[0];
                }
            }
        }
        return f5534a;
    }

    public C0869g() {
        this.f5535b = null;
        this.f5536c = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5536c == null || this.f5536c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5536c);
        }
        if (this.f5535b != null) {
            codedOutputByteBufferNano.b(5, this.f5535b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5536c == null || this.f5536c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5536c);
        }
        if (this.f5535b != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f5535b);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 26:
                    this.f5536c = aVar.f();
                    continue;
                case 42:
                    if (this.f5535b == null) {
                        this.f5535b = new C0864b();
                    }
                    aVar.a(this.f5535b);
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
