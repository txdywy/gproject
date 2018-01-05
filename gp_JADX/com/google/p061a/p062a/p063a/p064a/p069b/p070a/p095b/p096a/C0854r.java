package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0854r extends C0758b {
    public long[] f5479a;
    public boolean f5480b;
    public byte[] f5481c;

    public C0854r() {
        this.f5479a = l.f;
        this.f5480b = false;
        this.f5481c = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5479a != null && this.f5479a.length > 0) {
            int i2 = 0;
            for (long c : this.f5479a) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(10);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5479a.length) {
                codedOutputByteBufferNano.b(this.f5479a[i]);
                i++;
            }
        }
        if (this.f5480b) {
            codedOutputByteBufferNano.a(2, this.f5480b);
        }
        if (!Arrays.equals(this.f5481c, l.l)) {
            codedOutputByteBufferNano.a(5, this.f5481c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5479a == null || this.f5479a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f5479a.length) {
                i2 += CodedOutputByteBufferNano.c(this.f5479a[i]);
                i++;
            }
            i = ((b + i2) + 1) + CodedOutputByteBufferNano.f(i2);
        }
        if (this.f5480b) {
            i += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (Arrays.equals(this.f5481c, l.l)) {
            return i;
        }
        return i + CodedOutputByteBufferNano.b(5, this.f5481c);
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
                    if (this.f5479a == null) {
                        a = 0;
                    } else {
                        a = this.f5479a.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5479a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f5479a = obj;
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
                    a2 = this.f5479a == null ? 0 : this.f5479a.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5479a, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f5479a = obj2;
                    aVar.d(c);
                    continue;
                case 16:
                    this.f5480b = aVar.e();
                    continue;
                case 42:
                    this.f5481c = aVar.g();
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
