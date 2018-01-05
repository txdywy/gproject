package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C5670g extends C0758b {
    public C5669f f28752a;
    public C5671h[] f28753b;

    public C5670g() {
        this.f28752a = null;
        this.f28753b = C5671h.m26876a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28752a != null) {
            codedOutputByteBufferNano.b(1, this.f28752a);
        }
        if (this.f28753b != null && this.f28753b.length > 0) {
            for (C0757i c0757i : this.f28753b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28752a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f28752a);
        }
        if (this.f28753b == null || this.f28753b.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f28753b) {
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
                    if (this.f28752a == null) {
                        this.f28752a = new C5669f();
                    }
                    aVar.a(this.f28752a);
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f28753b == null ? 0 : this.f28753b.length;
                    Object obj = new C5671h[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28753b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C5671h();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C5671h();
                    aVar.a(obj[a]);
                    this.f28753b = obj;
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
