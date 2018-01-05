package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class kv extends C0758b {
    public int f12965a;
    public String f12966b;
    public ah f12967c;

    public kv() {
        this.f12965a = 0;
        this.f12966b = "";
        this.f12967c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kv)) {
            return false;
        }
        kv kvVar = (kv) obj;
        if ((this.f12965a & 1) != (kvVar.f12965a & 1)) {
            return false;
        }
        if (!this.f12966b.equals(kvVar.f12966b)) {
            return false;
        }
        if (this.f12967c == null) {
            if (kvVar.f12967c != null) {
                return false;
            }
        } else if (!this.f12967c.equals(kvVar.f12967c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kvVar.aO);
        }
        if (kvVar.aO == null || kvVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12966b.hashCode();
        ah ahVar = this.f12967c;
        hashCode = ((ahVar == null ? 0 : ahVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12965a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12966b);
        }
        if (this.f12967c != null) {
            codedOutputByteBufferNano.b(2, this.f12967c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12965a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12966b);
        }
        if (this.f12967c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12967c);
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
                    this.f12966b = aVar.f();
                    this.f12965a |= 1;
                    continue;
                case 18:
                    if (this.f12967c == null) {
                        this.f12967c = new ah();
                    }
                    aVar.a(this.f12967c);
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
