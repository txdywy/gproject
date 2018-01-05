package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gd extends C0758b {
    public int f12426a;
    public String f12427b;
    public String f12428c;
    public String f12429d;
    public String f12430e;

    public gd() {
        this.f12426a = 0;
        this.f12427b = "";
        this.f12428c = "";
        this.f12429d = "";
        this.f12430e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        if ((this.f12426a & 1) != (gdVar.f12426a & 1)) {
            return false;
        }
        if (!this.f12427b.equals(gdVar.f12427b)) {
            return false;
        }
        if ((this.f12426a & 2) != (gdVar.f12426a & 2)) {
            return false;
        }
        if (!this.f12428c.equals(gdVar.f12428c)) {
            return false;
        }
        if ((this.f12426a & 4) != (gdVar.f12426a & 4)) {
            return false;
        }
        if (!this.f12429d.equals(gdVar.f12429d)) {
            return false;
        }
        if ((this.f12426a & 8) != (gdVar.f12426a & 8)) {
            return false;
        }
        if (!this.f12430e.equals(gdVar.f12430e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gdVar.aO);
        }
        if (gdVar.aO == null || gdVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f12427b.hashCode()) * 31) + this.f12428c.hashCode()) * 31) + this.f12429d.hashCode()) * 31) + this.f12430e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12426a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12427b);
        }
        if ((this.f12426a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12428c);
        }
        if ((this.f12426a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12429d);
        }
        if ((this.f12426a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12430e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12426a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12427b);
        }
        if ((this.f12426a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12428c);
        }
        if ((this.f12426a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12429d);
        }
        if ((this.f12426a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12430e);
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
                    this.f12427b = aVar.f();
                    this.f12426a |= 1;
                    continue;
                case 18:
                    this.f12428c = aVar.f();
                    this.f12426a |= 2;
                    continue;
                case 26:
                    this.f12429d = aVar.f();
                    this.f12426a |= 4;
                    continue;
                case 34:
                    this.f12430e = aVar.f();
                    this.f12426a |= 8;
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
