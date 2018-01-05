package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C5680q extends C0758b {
    public C5679p[] f28808a;
    public Long f28809b;
    public Long f28810c;

    public C5680q() {
        this.f28808a = C5679p.m26905a();
        this.f28809b = null;
        this.f28810c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28808a != null && this.f28808a.length > 0) {
            for (C0757i c0757i : this.f28808a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f28809b != null) {
            codedOutputByteBufferNano.b(2, this.f28809b.longValue());
        }
        if (this.f28810c != null) {
            codedOutputByteBufferNano.b(3, this.f28810c.longValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28808a != null && this.f28808a.length > 0) {
            for (C0757i c0757i : this.f28808a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if (this.f28809b != null) {
            b += CodedOutputByteBufferNano.f(2, this.f28809b.longValue());
        }
        if (this.f28810c != null) {
            return b + CodedOutputByteBufferNano.f(3, this.f28810c.longValue());
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
                    a = this.f28808a == null ? 0 : this.f28808a.length;
                    Object obj = new C5679p[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28808a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C5679p();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C5679p();
                    aVar.a(obj[a]);
                    this.f28808a = obj;
                    continue;
                case 16:
                    this.f28809b = Long.valueOf(aVar.j());
                    continue;
                case 24:
                    this.f28810c = Long.valueOf(aVar.j());
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
