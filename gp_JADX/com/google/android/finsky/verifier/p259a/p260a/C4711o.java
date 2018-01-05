package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C4711o extends C0758b {
    public static volatile C4711o[] f24228a;
    public C4704h f24229b;

    public static C4711o[] cq_() {
        if (f24228a == null) {
            synchronized (h.b) {
                if (f24228a == null) {
                    f24228a = new C4711o[0];
                }
            }
        }
        return f24228a;
    }

    public C4711o() {
        this.f24229b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24229b != null) {
            codedOutputByteBufferNano.b(1, this.f24229b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24229b != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f24229b);
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
                    if (this.f24229b == null) {
                        this.f24229b = new C4704h();
                    }
                    aVar.a(this.f24229b);
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
