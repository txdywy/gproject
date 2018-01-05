package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class kj extends C0758b {
    public int f12886a;
    public String f12887b;
    public String f12888c;
    public ki[] f12889d;

    public kj() {
        this.f12886a = 0;
        this.f12887b = "";
        this.f12888c = "";
        this.f12889d = ki.bI_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kj)) {
            return false;
        }
        kj kjVar = (kj) obj;
        if ((this.f12886a & 1) != (kjVar.f12886a & 1)) {
            return false;
        }
        if (!this.f12887b.equals(kjVar.f12887b)) {
            return false;
        }
        if ((this.f12886a & 2) != (kjVar.f12886a & 2)) {
            return false;
        }
        if (!this.f12888c.equals(kjVar.f12888c)) {
            return false;
        }
        if (!h.a(this.f12889d, kjVar.f12889d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kjVar.aO);
        }
        if (kjVar.aO == null || kjVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12887b.hashCode()) * 31) + this.f12888c.hashCode()) * 31) + h.a(this.f12889d)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12886a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12887b);
        }
        if ((this.f12886a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12888c);
        }
        if (this.f12889d != null && this.f12889d.length > 0) {
            for (C0757i c0757i : this.f12889d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12886a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12887b);
        }
        if ((this.f12886a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12888c);
        }
        if (this.f12889d == null || this.f12889d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12889d) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(3, c0757i);
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
                    this.f12887b = aVar.f();
                    this.f12886a |= 1;
                    continue;
                case 18:
                    this.f12888c = aVar.f();
                    this.f12886a |= 2;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f12889d == null ? 0 : this.f12889d.length;
                    Object obj = new ki[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12889d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ki();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ki();
                    aVar.a(obj[a]);
                    this.f12889d = obj;
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
