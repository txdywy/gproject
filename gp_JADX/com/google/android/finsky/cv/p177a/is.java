package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class is extends C0758b {
    public it[] f12704a;

    public is() {
        this.f12704a = it.bp_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof is)) {
            return false;
        }
        is isVar = (is) obj;
        if (!h.a(this.f12704a, isVar.f12704a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(isVar.aO);
        }
        if (isVar.aO == null || isVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12704a)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12704a != null && this.f12704a.length > 0) {
            for (C0757i c0757i : this.f12704a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12704a != null && this.f12704a.length > 0) {
            for (C0757i c0757i : this.f12704a) {
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
                    a = this.f12704a == null ? 0 : this.f12704a.length;
                    Object obj = new it[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12704a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new it();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new it();
                    aVar.a(obj[a]);
                    this.f12704a = obj;
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
