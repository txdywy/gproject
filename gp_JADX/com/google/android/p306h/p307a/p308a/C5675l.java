package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C5675l extends C0758b {
    public static volatile C5675l[] f28767a;
    public String f28768b;
    public Integer f28769c;

    public static C5675l[] m26891a() {
        if (f28767a == null) {
            synchronized (h.b) {
                if (f28767a == null) {
                    f28767a = new C5675l[0];
                }
            }
        }
        return f28767a;
    }

    public C5675l() {
        this.f28768b = null;
        this.f28769c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28768b != null) {
            codedOutputByteBufferNano.a(1, this.f28768b);
        }
        if (this.f28769c != null) {
            codedOutputByteBufferNano.a(2, this.f28769c.intValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28768b != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28768b);
        }
        if (this.f28769c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f28769c.intValue());
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
                    this.f28768b = aVar.f();
                    continue;
                case 16:
                    this.f28769c = Integer.valueOf(aVar.i());
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
