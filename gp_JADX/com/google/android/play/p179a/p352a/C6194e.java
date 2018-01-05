package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6194e extends C0758b {
    public int f30914a;
    public int f30915b;
    public String f30916c;
    public String f30917d;

    public C6194e() {
        this.f30914a = 0;
        this.f30915b = 0;
        this.f30916c = "";
        this.f30917d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6194e)) {
            return false;
        }
        C6194e c6194e = (C6194e) obj;
        if ((this.f30914a & 1) != (c6194e.f30914a & 1)) {
            return false;
        }
        if (this.f30915b != c6194e.f30915b) {
            return false;
        }
        if ((this.f30914a & 2) != (c6194e.f30914a & 2)) {
            return false;
        }
        if (!this.f30916c.equals(c6194e.f30916c)) {
            return false;
        }
        if ((this.f30914a & 4) != (c6194e.f30914a & 4)) {
            return false;
        }
        if (!this.f30917d.equals(c6194e.f30917d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6194e.aO);
        }
        if (c6194e.aO == null || c6194e.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f30915b) * 31) + this.f30916c.hashCode()) * 31) + this.f30917d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30914a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30915b);
        }
        if ((this.f30914a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30916c);
        }
        if ((this.f30914a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30917d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30914a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f30915b);
        }
        if ((this.f30914a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30916c);
        }
        if ((this.f30914a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f30917d);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30915b = aVar.i();
                    this.f30914a |= 1;
                    continue;
                case 18:
                    this.f30916c = aVar.f();
                    this.f30914a |= 2;
                    continue;
                case 26:
                    this.f30917d = aVar.f();
                    this.f30914a |= 4;
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
