package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class lu extends C0758b {
    public int f13061a;
    public ah[] f13062b;
    public boolean f13063c;
    public ah f13064d;

    public lu() {
        this.f13061a = 0;
        this.f13062b = ah.aC_();
        this.f13063c = false;
        this.f13064d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lu)) {
            return false;
        }
        lu luVar = (lu) obj;
        if (!h.a(this.f13062b, luVar.f13062b)) {
            return false;
        }
        if ((this.f13061a & 1) != (luVar.f13061a & 1)) {
            return false;
        }
        if (this.f13063c != luVar.f13063c) {
            return false;
        }
        if (this.f13064d == null) {
            if (luVar.f13064d != null) {
                return false;
            }
        } else if (!this.f13064d.equals(luVar.f13064d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(luVar.aO);
        }
        if (luVar.aO == null || luVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f13063c ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13062b)) * 31);
        ah ahVar = this.f13064d;
        hashCode = ((ahVar == null ? 0 : ahVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13062b != null && this.f13062b.length > 0) {
            for (C0757i c0757i : this.f13062b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f13061a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f13063c);
        }
        if (this.f13064d != null) {
            codedOutputByteBufferNano.b(3, this.f13064d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13062b != null && this.f13062b.length > 0) {
            for (C0757i c0757i : this.f13062b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f13061a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (this.f13064d != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f13064d);
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
                    a = this.f13062b == null ? 0 : this.f13062b.length;
                    Object obj = new ah[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13062b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ah();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ah();
                    aVar.a(obj[a]);
                    this.f13062b = obj;
                    continue;
                case 16:
                    this.f13063c = aVar.e();
                    this.f13061a |= 1;
                    continue;
                case 26:
                    if (this.f13064d == null) {
                        this.f13064d = new ah();
                    }
                    aVar.a(this.f13064d);
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
