package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ar extends C0758b {
    public int f11823a;
    public bd f11824b;
    public String f11825c;

    public ar() {
        this.f11823a = 0;
        this.f11824b = null;
        this.f11825c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        if (this.f11824b == null) {
            if (arVar.f11824b != null) {
                return false;
            }
        } else if (!this.f11824b.equals(arVar.f11824b)) {
            return false;
        }
        if ((this.f11823a & 1) != (arVar.f11823a & 1)) {
            return false;
        }
        if (!this.f11825c.equals(arVar.f11825c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(arVar.aO);
        }
        if (arVar.aO == null || arVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bd bdVar = this.f11824b;
        hashCode = ((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f11825c.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11824b != null) {
            codedOutputByteBufferNano.b(1, this.f11824b);
        }
        if ((this.f11823a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f11825c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11824b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f11824b);
        }
        if ((this.f11823a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f11825c);
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
                    if (this.f11824b == null) {
                        this.f11824b = new bd();
                    }
                    aVar.a(this.f11824b);
                    continue;
                case 18:
                    this.f11825c = aVar.f();
                    this.f11823a |= 1;
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
