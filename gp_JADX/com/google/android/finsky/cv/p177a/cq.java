package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class cq extends C0758b {
    public int f12066a;
    public String f12067b;
    public cs[] f12068c;

    public cq() {
        this.f12066a = 0;
        this.f12067b = "";
        this.f12068c = cs.aR_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        if ((this.f12066a & 1) != (cqVar.f12066a & 1)) {
            return false;
        }
        if (!this.f12067b.equals(cqVar.f12067b)) {
            return false;
        }
        if (!h.a(this.f12068c, cqVar.f12068c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cqVar.aO);
        }
        if (cqVar.aO == null || cqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12067b.hashCode()) * 31) + h.a(this.f12068c)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12066a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12067b);
        }
        if (this.f12068c != null && this.f12068c.length > 0) {
            for (C0757i c0757i : this.f12068c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12066a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12067b);
        }
        if (this.f12068c == null || this.f12068c.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12068c) {
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
                    this.f12067b = aVar.f();
                    this.f12066a |= 1;
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f12068c == null ? 0 : this.f12068c.length;
                    Object obj = new cs[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12068c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cs();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cs();
                    aVar.a(obj[a]);
                    this.f12068c = obj;
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
