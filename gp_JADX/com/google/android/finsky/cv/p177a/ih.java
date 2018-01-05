package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ih extends C0758b {
    public int f12653a;
    public String f12654b;
    public String f12655c;
    public String f12656d;
    public int f12657e;
    public String f12658f;

    public ih() {
        this.f12653a = 0;
        this.f12654b = "";
        this.f12655c = "";
        this.f12656d = "";
        this.f12657e = 1;
        this.f12658f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ih)) {
            return false;
        }
        ih ihVar = (ih) obj;
        if ((this.f12653a & 1) != (ihVar.f12653a & 1)) {
            return false;
        }
        if (!this.f12654b.equals(ihVar.f12654b)) {
            return false;
        }
        if ((this.f12653a & 2) != (ihVar.f12653a & 2)) {
            return false;
        }
        if (!this.f12655c.equals(ihVar.f12655c)) {
            return false;
        }
        if ((this.f12653a & 4) != (ihVar.f12653a & 4)) {
            return false;
        }
        if (!this.f12656d.equals(ihVar.f12656d)) {
            return false;
        }
        if ((this.f12653a & 8) != (ihVar.f12653a & 8)) {
            return false;
        }
        if (this.f12657e != ihVar.f12657e) {
            return false;
        }
        if ((this.f12653a & 16) != (ihVar.f12653a & 16)) {
            return false;
        }
        if (!this.f12658f.equals(ihVar.f12658f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ihVar.aO);
        }
        if (ihVar.aO == null || ihVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12654b.hashCode()) * 31) + this.f12655c.hashCode()) * 31) + this.f12656d.hashCode()) * 31) + this.f12657e) * 31) + this.f12658f.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12653a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12654b);
        }
        if ((this.f12653a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12655c);
        }
        if ((this.f12653a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12656d);
        }
        if ((this.f12653a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12657e);
        }
        if ((this.f12653a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12658f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12653a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12654b);
        }
        if ((this.f12653a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12655c);
        }
        if ((this.f12653a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12656d);
        }
        if ((this.f12653a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f12657e);
        }
        if ((this.f12653a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f12658f);
        }
        return b;
    }

    private final ih m12786b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12654b = aVar.f();
                    this.f12653a |= 1;
                    continue;
                case 18:
                    this.f12655c = aVar.f();
                    this.f12653a |= 2;
                    continue;
                case 26:
                    this.f12656d = aVar.f();
                    this.f12653a |= 4;
                    continue;
                case 32:
                    this.f12653a |= 8;
                    int o = aVar.o();
                    try {
                        this.f12657e = bp.m12290a(aVar.i());
                        this.f12653a |= 8;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 42:
                    this.f12658f = aVar.f();
                    this.f12653a |= 16;
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12786b(aVar);
    }
}
