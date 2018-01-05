package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class af extends C0758b {
    public ah[] f5332a;

    public af() {
        this.f5332a = ah.m5284a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5332a != null && this.f5332a.length > 0) {
            for (C0757i c0757i : this.f5332a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5332a != null && this.f5332a.length > 0) {
            for (C0757i c0757i : this.f5332a) {
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
                    a = this.f5332a == null ? 0 : this.f5332a.length;
                    Object obj = new ah[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5332a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ah();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ah();
                    aVar.a(obj[a]);
                    this.f5332a = obj;
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
