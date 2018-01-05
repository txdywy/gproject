package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class cr extends C0758b {
    public static volatile cr[] f12069a;
    public int f12070b;
    public bd f12071c;
    public String f12072d;

    public static cr[] aQ_() {
        if (f12069a == null) {
            synchronized (h.b) {
                if (f12069a == null) {
                    f12069a = new cr[0];
                }
            }
        }
        return f12069a;
    }

    public cr() {
        this.f12070b = 0;
        this.f12071c = null;
        this.f12072d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj;
        if (this.f12071c == null) {
            if (crVar.f12071c != null) {
                return false;
            }
        } else if (!this.f12071c.equals(crVar.f12071c)) {
            return false;
        }
        if ((this.f12070b & 1) != (crVar.f12070b & 1)) {
            return false;
        }
        if (!this.f12072d.equals(crVar.f12072d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(crVar.aO);
        }
        if (crVar.aO == null || crVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bd bdVar = this.f12071c;
        hashCode = ((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f12072d.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12071c != null) {
            codedOutputByteBufferNano.b(1, this.f12071c);
        }
        if ((this.f12070b & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12072d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12071c != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12071c);
        }
        if ((this.f12070b & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12072d);
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
                    if (this.f12071c == null) {
                        this.f12071c = new bd();
                    }
                    aVar.a(this.f12071c);
                    continue;
                case 18:
                    this.f12072d = aVar.f();
                    this.f12070b |= 1;
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
