package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4716t extends C0758b {
    public C4712p[] f24260a;

    public C4716t() {
        this.f24260a = C4712p.cr_();
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24260a != null && this.f24260a.length > 0) {
            for (C0757i c0757i : this.f24260a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24260a != null && this.f24260a.length > 0) {
            for (C0757i c0757i : this.f24260a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
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
                    int a2 = l.a(aVar, 10);
                    a = this.f24260a == null ? 0 : this.f24260a.length;
                    Object obj = new C4712p[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24260a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4712p();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4712p();
                    aVar.a(obj[a]);
                    this.f24260a = obj;
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
