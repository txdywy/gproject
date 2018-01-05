package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class jy extends C0758b {
    public static volatile jy[] f12841a;
    public int f12842b;
    public String f12843c;
    public jz[] f12844d;

    public static jy[] bD_() {
        if (f12841a == null) {
            synchronized (h.b) {
                if (f12841a == null) {
                    f12841a = new jy[0];
                }
            }
        }
        return f12841a;
    }

    public jy() {
        this.f12842b = 0;
        this.f12843c = "";
        this.f12844d = jz.bE_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        if ((this.f12842b & 1) != (jyVar.f12842b & 1)) {
            return false;
        }
        if (!this.f12843c.equals(jyVar.f12843c)) {
            return false;
        }
        if (!h.a(this.f12844d, jyVar.f12844d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jyVar.aO);
        }
        if (jyVar.aO == null || jyVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12843c.hashCode()) * 31) + h.a(this.f12844d)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12842b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12843c);
        }
        if (this.f12844d != null && this.f12844d.length > 0) {
            for (C0757i c0757i : this.f12844d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12842b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12843c);
        }
        if (this.f12844d == null || this.f12844d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12844d) {
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
                    this.f12843c = aVar.f();
                    this.f12842b |= 1;
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f12844d == null ? 0 : this.f12844d.length;
                    Object obj = new jz[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12844d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jz();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new jz();
                    aVar.a(obj[a]);
                    this.f12844d = obj;
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
