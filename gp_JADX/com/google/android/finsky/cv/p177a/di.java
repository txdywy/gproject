package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class di extends C0758b {
    public int f12146a;
    public bb f12147b;
    public ba f12148c;

    public di() {
        this.f12146a = -1;
        this.f12146a = -1;
        this.f12147b = null;
        this.f12146a = -1;
        this.f12148c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        if (this.f12147b == null) {
            if (diVar.f12147b != null) {
                return false;
            }
        } else if (!this.f12147b.equals(diVar.f12147b)) {
            return false;
        }
        if (this.f12148c == null) {
            if (diVar.f12148c != null) {
                return false;
            }
        } else if (!this.f12148c.equals(diVar.f12148c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(diVar.aO);
        }
        if (diVar.aO == null || diVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bb bbVar = this.f12147b;
        if (this.f12146a != 0) {
            bbVar = null;
        }
        hashCode = (hashCode * 31) + (bbVar == null ? 0 : bbVar.hashCode());
        ba baVar = this.f12148c;
        if (this.f12146a != 1) {
            baVar = null;
        }
        int hashCode2 = ((baVar == null ? 0 : baVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode2 + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12146a == 0) {
            codedOutputByteBufferNano.b(1, this.f12147b);
        }
        if (this.f12146a == 1) {
            codedOutputByteBufferNano.b(2, this.f12148c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12146a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12147b);
        }
        if (this.f12146a == 1) {
            return b + CodedOutputByteBufferNano.d(2, this.f12148c);
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
                    if (this.f12147b == null) {
                        this.f12147b = new bb();
                    }
                    aVar.a(this.f12147b);
                    this.f12146a = 0;
                    continue;
                case 18:
                    if (this.f12148c == null) {
                        this.f12148c = new ba();
                    }
                    aVar.a(this.f12148c);
                    this.f12146a = 1;
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
