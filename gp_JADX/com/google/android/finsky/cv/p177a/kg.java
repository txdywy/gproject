package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class kg extends C0758b {
    public ck f12872a;
    public ck f12873b;
    public hw[] f12874c;

    public kg() {
        this.f12872a = null;
        this.f12873b = null;
        this.f12874c = hw.bm_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) obj;
        if (this.f12872a == null) {
            if (kgVar.f12872a != null) {
                return false;
            }
        } else if (!this.f12872a.equals(kgVar.f12872a)) {
            return false;
        }
        if (this.f12873b == null) {
            if (kgVar.f12873b != null) {
                return false;
            }
        } else if (!this.f12873b.equals(kgVar.f12873b)) {
            return false;
        }
        if (!h.a(this.f12874c, kgVar.f12874c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kgVar.aO);
        }
        if (kgVar.aO == null || kgVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ck ckVar = this.f12872a;
        hashCode = (ckVar == null ? 0 : ckVar.hashCode()) + (hashCode * 31);
        ckVar = this.f12873b;
        hashCode = ((((ckVar == null ? 0 : ckVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f12874c)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12874c != null && this.f12874c.length > 0) {
            for (C0757i c0757i : this.f12874c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f12872a != null) {
            codedOutputByteBufferNano.b(4, this.f12872a);
        }
        if (this.f12873b != null) {
            codedOutputByteBufferNano.b(5, this.f12873b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12874c != null && this.f12874c.length > 0) {
            for (C0757i c0757i : this.f12874c) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
        }
        if (this.f12872a != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12872a);
        }
        if (this.f12873b != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f12873b);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f12874c == null ? 0 : this.f12874c.length;
                    Object obj = new hw[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12874c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hw();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new hw();
                    aVar.a(obj[a]);
                    this.f12874c = obj;
                    continue;
                case 34:
                    if (this.f12872a == null) {
                        this.f12872a = new ck();
                    }
                    aVar.a(this.f12872a);
                    continue;
                case 42:
                    if (this.f12873b == null) {
                        this.f12873b = new ck();
                    }
                    aVar.a(this.f12873b);
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
