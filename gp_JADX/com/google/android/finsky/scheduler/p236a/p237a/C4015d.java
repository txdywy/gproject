package com.google.android.finsky.scheduler.p236a.p237a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C4015d extends C0758b {
    public static volatile C4015d[] f20163a;
    public int f20164b;
    public String f20165c;
    public C4016e f20166d;

    public static C4015d[] bV_() {
        if (f20163a == null) {
            synchronized (h.b) {
                if (f20163a == null) {
                    f20163a = new C4015d[0];
                }
            }
        }
        return f20163a;
    }

    public C4015d() {
        this.f20164b = 0;
        this.f20165c = "";
        this.f20166d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f20164b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f20165c);
        }
        if (this.f20166d != null) {
            codedOutputByteBufferNano.b(2, this.f20166d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f20164b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f20165c);
        }
        if (this.f20166d != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f20166d);
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
                    this.f20165c = aVar.f();
                    this.f20164b |= 1;
                    continue;
                case 18:
                    if (this.f20166d == null) {
                        this.f20166d = new C4016e();
                    }
                    aVar.a(this.f20166d);
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
