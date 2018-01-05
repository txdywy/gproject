package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hj extends C0758b {
    public int f12566a;
    public String f12567b;
    public eu f12568c;
    public hk f12569d;

    public hj() {
        this.f12566a = 0;
        this.f12567b = "";
        this.f12568c = null;
        this.f12569d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hj)) {
            return false;
        }
        hj hjVar = (hj) obj;
        if ((this.f12566a & 1) != (hjVar.f12566a & 1)) {
            return false;
        }
        if (!this.f12567b.equals(hjVar.f12567b)) {
            return false;
        }
        if (this.f12568c == null) {
            if (hjVar.f12568c != null) {
                return false;
            }
        } else if (!this.f12568c.equals(hjVar.f12568c)) {
            return false;
        }
        if (this.f12569d == null) {
            if (hjVar.f12569d != null) {
                return false;
            }
        } else if (!this.f12569d.equals(hjVar.f12569d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hjVar.aO);
        }
        if (hjVar.aO == null || hjVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12567b.hashCode();
        eu euVar = this.f12568c;
        hashCode = (euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31);
        hk hkVar = this.f12569d;
        hashCode = ((hkVar == null ? 0 : hkVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12566a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12567b);
        }
        if (this.f12568c != null) {
            codedOutputByteBufferNano.b(2, this.f12568c);
        }
        if (this.f12569d != null) {
            codedOutputByteBufferNano.b(3, this.f12569d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12566a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12567b);
        }
        if (this.f12568c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12568c);
        }
        if (this.f12569d != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f12569d);
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
                    this.f12567b = aVar.f();
                    this.f12566a |= 1;
                    continue;
                case 18:
                    if (this.f12568c == null) {
                        this.f12568c = new eu();
                    }
                    aVar.a(this.f12568c);
                    continue;
                case 26:
                    if (this.f12569d == null) {
                        this.f12569d = new hk();
                    }
                    aVar.a(this.f12569d);
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
