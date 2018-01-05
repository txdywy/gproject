package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0857u extends C0758b {
    public long[] f5491a;
    public String f5492b;

    public C0857u() {
        this.f5491a = l.f;
        this.f5492b = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5491a != null && this.f5491a.length > 0) {
            int i2 = 0;
            for (long c : this.f5491a) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(10);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5491a.length) {
                codedOutputByteBufferNano.b(this.f5491a[i]);
                i++;
            }
        }
        if (!(this.f5492b == null || this.f5492b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5492b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5491a == null || this.f5491a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f5491a.length) {
                i2 += CodedOutputByteBufferNano.c(this.f5491a[i]);
                i++;
            }
            i = ((b + i2) + 1) + CodedOutputByteBufferNano.f(i2);
        }
        if (this.f5492b == null || this.f5492b.equals("")) {
            return i;
        }
        return i + CodedOutputByteBufferNano.b(2, this.f5492b);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = l.a(aVar, 8);
                    if (this.f5491a == null) {
                        a = 0;
                    } else {
                        a = this.f5491a.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5491a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f5491a = obj;
                    continue;
                case 10:
                    int c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.j();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5491a == null ? 0 : this.f5491a.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5491a, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f5491a = obj2;
                    aVar.d(c);
                    continue;
                case 18:
                    this.f5492b = aVar.f();
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
