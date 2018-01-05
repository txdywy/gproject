package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class md extends C0758b {
    public int f13149a;
    public String f13150b;
    public String f13151c;

    public md() {
        this.f13149a = 0;
        this.f13150b = "";
        this.f13151c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        if ((this.f13149a & 1) != (mdVar.f13149a & 1)) {
            return false;
        }
        if (!this.f13150b.equals(mdVar.f13150b)) {
            return false;
        }
        if ((this.f13149a & 2) != (mdVar.f13149a & 2)) {
            return false;
        }
        if (!this.f13151c.equals(mdVar.f13151c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(mdVar.aO);
        }
        if (mdVar.aO == null || mdVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f13150b.hashCode()) * 31) + this.f13151c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13149a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13150b);
        }
        if ((this.f13149a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13151c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13149a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13150b);
        }
        if ((this.f13149a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f13151c);
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
                    this.f13150b = aVar.f();
                    this.f13149a |= 1;
                    continue;
                case 18:
                    this.f13151c = aVar.f();
                    this.f13149a |= 2;
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
