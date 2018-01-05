package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ho extends C0758b {
    public int f12588a;
    public long f12589b;
    public String f12590c;
    public String f12591d;
    public bd f12592e;
    public bl f12593f;
    public String f12594g;

    public ho() {
        this.f12588a = 0;
        this.f12589b = 0;
        this.f12590c = "";
        this.f12591d = "";
        this.f12592e = null;
        this.f12593f = null;
        this.f12594g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        if ((this.f12588a & 1) != (hoVar.f12588a & 1)) {
            return false;
        }
        if (this.f12589b != hoVar.f12589b) {
            return false;
        }
        if ((this.f12588a & 2) != (hoVar.f12588a & 2)) {
            return false;
        }
        if (!this.f12590c.equals(hoVar.f12590c)) {
            return false;
        }
        if ((this.f12588a & 4) != (hoVar.f12588a & 4)) {
            return false;
        }
        if (!this.f12591d.equals(hoVar.f12591d)) {
            return false;
        }
        if (this.f12592e == null) {
            if (hoVar.f12592e != null) {
                return false;
            }
        } else if (!this.f12592e.equals(hoVar.f12592e)) {
            return false;
        }
        if (this.f12593f == null) {
            if (hoVar.f12593f != null) {
                return false;
            }
        } else if (!this.f12593f.equals(hoVar.f12593f)) {
            return false;
        }
        if ((this.f12588a & 8) != (hoVar.f12588a & 8)) {
            return false;
        }
        if (!this.f12594g.equals(hoVar.f12594g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hoVar.aO);
        }
        if (hoVar.aO == null || hoVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f12589b;
        hashCode = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12590c.hashCode()) * 31) + this.f12591d.hashCode();
        bd bdVar = this.f12592e;
        hashCode = (bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31);
        bl blVar = this.f12593f;
        hashCode = ((((blVar == null ? 0 : blVar.hashCode()) + (hashCode * 31)) * 31) + this.f12594g.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12588a & 1) != 0) {
            codedOutputByteBufferNano.b(2, this.f12589b);
        }
        if ((this.f12588a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12591d);
        }
        if (this.f12593f != null) {
            codedOutputByteBufferNano.b(5, this.f12593f);
        }
        if ((this.f12588a & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f12594g);
        }
        if ((this.f12588a & 2) != 0) {
            codedOutputByteBufferNano.a(7, this.f12590c);
        }
        if (this.f12592e != null) {
            codedOutputByteBufferNano.b(9, this.f12592e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12588a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f12589b);
        }
        if ((this.f12588a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12591d);
        }
        if (this.f12593f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12593f);
        }
        if ((this.f12588a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f12594g);
        }
        if ((this.f12588a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f12590c);
        }
        if (this.f12592e != null) {
            return b + CodedOutputByteBufferNano.d(9, this.f12592e);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f12589b = aVar.j();
                    this.f12588a |= 1;
                    continue;
                case 26:
                    this.f12591d = aVar.f();
                    this.f12588a |= 4;
                    continue;
                case 42:
                    if (this.f12593f == null) {
                        this.f12593f = new bl();
                    }
                    aVar.a(this.f12593f);
                    continue;
                case 50:
                    this.f12594g = aVar.f();
                    this.f12588a |= 8;
                    continue;
                case 58:
                    this.f12590c = aVar.f();
                    this.f12588a |= 2;
                    continue;
                case 74:
                    if (this.f12592e == null) {
                        this.f12592e = new bd();
                    }
                    aVar.a(this.f12592e);
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
