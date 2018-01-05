package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ek extends C0758b {
    public int f12284a;
    public el[] f12285b;
    public String f12286c;

    public ek() {
        this.f12284a = 0;
        this.f12285b = el.aY_();
        this.f12286c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj;
        if (!h.a(this.f12285b, ekVar.f12285b)) {
            return false;
        }
        if ((this.f12284a & 1) != (ekVar.f12284a & 1)) {
            return false;
        }
        if (!this.f12286c.equals(ekVar.f12286c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ekVar.aO);
        }
        if (ekVar.aO == null || ekVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12285b)) * 31) + this.f12286c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12285b != null && this.f12285b.length > 0) {
            for (C0757i c0757i : this.f12285b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f12284a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12286c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12285b != null && this.f12285b.length > 0) {
            for (C0757i c0757i : this.f12285b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f12284a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12286c);
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
                    a = this.f12285b == null ? 0 : this.f12285b.length;
                    Object obj = new el[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12285b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new el();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new el();
                    aVar.a(obj[a]);
                    this.f12285b = obj;
                    continue;
                case 18:
                    this.f12286c = aVar.f();
                    this.f12284a |= 1;
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
