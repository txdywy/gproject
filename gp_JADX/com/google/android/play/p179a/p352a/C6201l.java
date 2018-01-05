package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C6201l extends C0758b {
    public int f30962a;
    public byte[] f30963b;
    public String f30964c;
    public byte[][] f30965d;
    public boolean f30966e;

    public C6201l() {
        this.f30962a = 0;
        this.f30963b = l.l;
        this.f30964c = "";
        this.f30965d = l.k;
        this.f30966e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6201l)) {
            return false;
        }
        C6201l c6201l = (C6201l) obj;
        if ((this.f30962a & 1) != (c6201l.f30962a & 1)) {
            return false;
        }
        if (!Arrays.equals(this.f30963b, c6201l.f30963b)) {
            return false;
        }
        if ((this.f30962a & 2) != (c6201l.f30962a & 2)) {
            return false;
        }
        if (!this.f30964c.equals(c6201l.f30964c)) {
            return false;
        }
        if (!h.a(this.f30965d, c6201l.f30965d)) {
            return false;
        }
        if ((this.f30962a & 4) != (c6201l.f30962a & 4)) {
            return false;
        }
        if (this.f30966e != c6201l.f30966e) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6201l.aO);
        }
        if (c6201l.aO == null || c6201l.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f30966e ? 1231 : 1237) + ((((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f30963b)) * 31) + this.f30964c.hashCode()) * 31) + h.a(this.f30965d)) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30962a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30963b);
        }
        if (this.f30965d != null && this.f30965d.length > 0) {
            for (byte[] bArr : this.f30965d) {
                if (bArr != null) {
                    codedOutputByteBufferNano.a(2, bArr);
                }
            }
        }
        if ((this.f30962a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30966e);
        }
        if ((this.f30962a & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f30964c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f30962a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30963b);
        }
        if (this.f30965d != null && this.f30965d.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f30965d.length) {
                byte[] bArr = this.f30965d[i];
                if (bArr != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(bArr);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f30962a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f30962a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f30964c);
        }
        return b;
    }

    public static C6201l m28640a(byte[] bArr) {
        return (C6201l) C0757i.m4905a(new C6201l(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30963b = aVar.g();
                    this.f30962a |= 1;
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f30965d == null ? 0 : this.f30965d.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f30965d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.g();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.g();
                    this.f30965d = obj;
                    continue;
                case 24:
                    this.f30966e = aVar.e();
                    this.f30962a |= 4;
                    continue;
                case 34:
                    this.f30964c = aVar.f();
                    this.f30962a |= 2;
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
