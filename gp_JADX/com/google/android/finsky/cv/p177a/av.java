package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class av extends C0758b {
    public int f11827a;
    public String f11828b;
    public String f11829c;
    public String f11830d;
    public String f11831e;

    public av() {
        this.f11827a = 0;
        this.f11828b = "";
        this.f11829c = "";
        this.f11830d = "";
        this.f11831e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        if ((this.f11827a & 1) != (avVar.f11827a & 1)) {
            return false;
        }
        if (!this.f11828b.equals(avVar.f11828b)) {
            return false;
        }
        if ((this.f11827a & 2) != (avVar.f11827a & 2)) {
            return false;
        }
        if (!this.f11829c.equals(avVar.f11829c)) {
            return false;
        }
        if ((this.f11827a & 4) != (avVar.f11827a & 4)) {
            return false;
        }
        if (!this.f11830d.equals(avVar.f11830d)) {
            return false;
        }
        if ((this.f11827a & 8) != (avVar.f11827a & 8)) {
            return false;
        }
        if (!this.f11831e.equals(avVar.f11831e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(avVar.aO);
        }
        if (avVar.aO == null || avVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f11828b.hashCode()) * 31) + this.f11829c.hashCode()) * 31) + this.f11830d.hashCode()) * 31) + this.f11831e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11827a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11828b);
        }
        if ((this.f11827a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11829c);
        }
        if ((this.f11827a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11830d);
        }
        if ((this.f11827a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f11831e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11827a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11828b);
        }
        if ((this.f11827a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11829c);
        }
        if ((this.f11827a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11830d);
        }
        if ((this.f11827a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f11831e);
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
                    this.f11828b = aVar.f();
                    this.f11827a |= 1;
                    continue;
                case 18:
                    this.f11829c = aVar.f();
                    this.f11827a |= 2;
                    continue;
                case 26:
                    this.f11830d = aVar.f();
                    this.f11827a |= 4;
                    continue;
                case 34:
                    this.f11831e = aVar.f();
                    this.f11827a |= 8;
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
