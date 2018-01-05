package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C4702f extends C0758b {
    public static volatile C4702f[] f24187a;
    public C4703g[] f24188b;

    public static C4702f[] cl_() {
        if (f24187a == null) {
            synchronized (h.b) {
                if (f24187a == null) {
                    f24187a = new C4702f[0];
                }
            }
        }
        return f24187a;
    }

    public C4702f() {
        this.f24188b = C4703g.cm_();
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24188b != null && this.f24188b.length > 0) {
            for (C0757i c0757i : this.f24188b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24188b != null && this.f24188b.length > 0) {
            for (C0757i c0757i : this.f24188b) {
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
                    a = this.f24188b == null ? 0 : this.f24188b.length;
                    Object obj = new C4703g[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24188b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4703g();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4703g();
                    aVar.a(obj[a]);
                    this.f24188b = obj;
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
