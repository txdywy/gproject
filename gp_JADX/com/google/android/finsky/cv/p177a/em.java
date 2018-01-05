package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class em extends C0758b {
    public int f12291a;
    public String f12292b;
    public String f12293c;
    public String f12294d;
    public bd f12295e;

    public em() {
        this.f12291a = 0;
        this.f12292b = "";
        this.f12293c = "";
        this.f12294d = "";
        this.f12295e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        if ((this.f12291a & 1) != (emVar.f12291a & 1)) {
            return false;
        }
        if (!this.f12292b.equals(emVar.f12292b)) {
            return false;
        }
        if ((this.f12291a & 2) != (emVar.f12291a & 2)) {
            return false;
        }
        if (!this.f12293c.equals(emVar.f12293c)) {
            return false;
        }
        if ((this.f12291a & 4) != (emVar.f12291a & 4)) {
            return false;
        }
        if (!this.f12294d.equals(emVar.f12294d)) {
            return false;
        }
        if (this.f12295e == null) {
            if (emVar.f12295e != null) {
                return false;
            }
        } else if (!this.f12295e.equals(emVar.f12295e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(emVar.aO);
        }
        if (emVar.aO == null || emVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f12292b.hashCode()) * 31) + this.f12293c.hashCode()) * 31) + this.f12294d.hashCode();
        bd bdVar = this.f12295e;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12291a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12292b);
        }
        if ((this.f12291a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12293c);
        }
        if ((this.f12291a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12294d);
        }
        if (this.f12295e != null) {
            codedOutputByteBufferNano.b(4, this.f12295e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12291a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12292b);
        }
        if ((this.f12291a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12293c);
        }
        if ((this.f12291a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12294d);
        }
        if (this.f12295e != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f12295e);
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
                    this.f12292b = aVar.f();
                    this.f12291a |= 1;
                    continue;
                case 18:
                    this.f12293c = aVar.f();
                    this.f12291a |= 2;
                    continue;
                case 26:
                    this.f12294d = aVar.f();
                    this.f12291a |= 4;
                    continue;
                case 34:
                    if (this.f12295e == null) {
                        this.f12295e = new bd();
                    }
                    aVar.a(this.f12295e);
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
