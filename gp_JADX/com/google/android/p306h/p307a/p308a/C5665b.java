package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C5665b extends C0758b {
    public String f28724a;
    public C5666c[] f28725b;

    public C5665b() {
        this.f28724a = null;
        this.f28725b = C5666c.m26858a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28724a != null) {
            codedOutputByteBufferNano.a(1, this.f28724a);
        }
        if (this.f28725b != null && this.f28725b.length > 0) {
            for (C0757i c0757i : this.f28725b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28724a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28724a);
        }
        if (this.f28725b == null || this.f28725b.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f28725b) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(2, c0757i);
            }
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28724a = aVar.f();
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f28725b == null ? 0 : this.f28725b.length;
                    Object obj = new C5666c[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28725b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C5666c();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C5666c();
                    aVar.a(obj[a]);
                    this.f28725b = obj;
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
