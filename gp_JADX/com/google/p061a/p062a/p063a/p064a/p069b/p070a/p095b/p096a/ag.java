package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class ag extends C0758b {
    public String f5333a;
    public long[] f5334b;

    public ag() {
        this.f5333a = "";
        this.f5334b = l.f;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f5333a == null || this.f5333a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5333a);
        }
        if (this.f5334b != null && this.f5334b.length > 0) {
            int i2 = 0;
            for (long c : this.f5334b) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(18);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5334b.length) {
                codedOutputByteBufferNano.b(this.f5334b[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (!(this.f5333a == null || this.f5333a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5333a);
        }
        if (this.f5334b == null || this.f5334b.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f5334b.length) {
            i2 += CodedOutputByteBufferNano.c(this.f5334b[i]);
            i++;
        }
        return ((b + i2) + 1) + CodedOutputByteBufferNano.f(i2);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5333a = aVar.f();
                    continue;
                case 16:
                    a2 = l.a(aVar, 16);
                    if (this.f5334b == null) {
                        a = 0;
                    } else {
                        a = this.f5334b.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5334b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f5334b = obj;
                    continue;
                case 18:
                    int c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.j();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5334b == null ? 0 : this.f5334b.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5334b, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f5334b = obj2;
                    aVar.d(c);
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
