package com.google.android.finsky.scheduler.p236a.p237a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4014c extends C0758b {
    public C4015d[] f20162a;

    public C4014c() {
        this.f20162a = C4015d.bV_();
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f20162a != null && this.f20162a.length > 0) {
            for (C0757i c0757i : this.f20162a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f20162a != null && this.f20162a.length > 0) {
            for (C0757i c0757i : this.f20162a) {
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
                    a = this.f20162a == null ? 0 : this.f20162a.length;
                    Object obj = new C4015d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f20162a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4015d();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4015d();
                    aVar.a(obj[a]);
                    this.f20162a = obj;
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
