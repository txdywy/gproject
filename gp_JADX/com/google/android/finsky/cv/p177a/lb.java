package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class lb extends C0758b {
    public gk[] f13003a;

    public lb() {
        this.f13003a = gk.be_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        if (!h.a(this.f13003a, lbVar.f13003a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lbVar.aO);
        }
        if (lbVar.aO == null || lbVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13003a)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13003a != null && this.f13003a.length > 0) {
            for (C0757i c0757i : this.f13003a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13003a != null && this.f13003a.length > 0) {
            for (C0757i c0757i : this.f13003a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
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
                    a = this.f13003a == null ? 0 : this.f13003a.length;
                    Object obj = new gk[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13003a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gk();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new gk();
                    aVar.a(obj[a]);
                    this.f13003a = obj;
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
