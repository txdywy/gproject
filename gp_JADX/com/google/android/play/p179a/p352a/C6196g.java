package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6196g extends C0758b {
    public int f30922a;
    public String f30923b;
    public String f30924c;
    public String f30925d;
    public String f30926e;

    public C6196g() {
        this.f30922a = 0;
        this.f30923b = "";
        this.f30924c = "";
        this.f30925d = "";
        this.f30926e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6196g)) {
            return false;
        }
        C6196g c6196g = (C6196g) obj;
        if ((this.f30922a & 1) != (c6196g.f30922a & 1)) {
            return false;
        }
        if (!this.f30923b.equals(c6196g.f30923b)) {
            return false;
        }
        if ((this.f30922a & 2) != (c6196g.f30922a & 2)) {
            return false;
        }
        if (!this.f30924c.equals(c6196g.f30924c)) {
            return false;
        }
        if ((this.f30922a & 4) != (c6196g.f30922a & 4)) {
            return false;
        }
        if (!this.f30925d.equals(c6196g.f30925d)) {
            return false;
        }
        if ((this.f30922a & 8) != (c6196g.f30922a & 8)) {
            return false;
        }
        if (!this.f30926e.equals(c6196g.f30926e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6196g.aO);
        }
        if (c6196g.aO == null || c6196g.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f30923b.hashCode()) * 31) + this.f30924c.hashCode()) * 31) + this.f30925d.hashCode()) * 31) + this.f30926e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30922a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30923b);
        }
        if ((this.f30922a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30924c);
        }
        if ((this.f30922a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30925d);
        }
        if ((this.f30922a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30926e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30922a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30923b);
        }
        if ((this.f30922a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30924c);
        }
        if ((this.f30922a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f30925d);
        }
        if ((this.f30922a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f30926e);
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
                    this.f30923b = aVar.f();
                    this.f30922a |= 1;
                    continue;
                case 18:
                    this.f30924c = aVar.f();
                    this.f30922a |= 2;
                    continue;
                case 26:
                    this.f30925d = aVar.f();
                    this.f30922a |= 4;
                    continue;
                case 34:
                    this.f30926e = aVar.f();
                    this.f30922a |= 8;
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
