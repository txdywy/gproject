package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class kn extends C0758b {
    public int f12893a;
    public long[] f12894b;
    public byte[] f12895c;

    public kn() {
        this.f12893a = 0;
        this.f12894b = l.f;
        this.f12895c = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        if (!h.a(this.f12894b, knVar.f12894b)) {
            return false;
        }
        if ((this.f12893a & 1) != (knVar.f12893a & 1)) {
            return false;
        }
        if (!Arrays.equals(this.f12895c, knVar.f12895c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(knVar.aO);
        }
        if (knVar.aO == null || knVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12894b)) * 31) + Arrays.hashCode(this.f12895c)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12894b != null && this.f12894b.length > 0) {
            for (long b : this.f12894b) {
                codedOutputByteBufferNano.b(1, b);
            }
        }
        if ((this.f12893a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12895c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f12894b == null || this.f12894b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f12894b.length) {
                i2 += CodedOutputByteBufferNano.c(this.f12894b[i]);
                i++;
            }
            i = (b + i2) + (this.f12894b.length * 1);
        }
        if ((this.f12893a & 1) != 0) {
            return i + CodedOutputByteBufferNano.b(2, this.f12895c);
        }
        return i;
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
                    if (this.f12894b == null) {
                        a = 0;
                    } else {
                        a = this.f12894b.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12894b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f12894b = obj;
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
                    a2 = this.f12894b == null ? 0 : this.f12894b.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f12894b, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f12894b = obj2;
                    aVar.d(c);
                    continue;
                case 18:
                    this.f12895c = aVar.g();
                    this.f12893a |= 1;
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
