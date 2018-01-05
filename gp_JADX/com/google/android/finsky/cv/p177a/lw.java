package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class lw extends C0758b {
    public static volatile lw[] f13067a;
    public int f13068b;
    public String f13069c;
    public boolean f13070d;
    public bd f13071e;

    public static lw[] bR_() {
        if (f13067a == null) {
            synchronized (h.b) {
                if (f13067a == null) {
                    f13067a = new lw[0];
                }
            }
        }
        return f13067a;
    }

    public lw() {
        this.f13068b = 0;
        this.f13069c = "";
        this.f13070d = true;
        this.f13071e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lw)) {
            return false;
        }
        lw lwVar = (lw) obj;
        if ((this.f13068b & 1) != (lwVar.f13068b & 1)) {
            return false;
        }
        if (!this.f13069c.equals(lwVar.f13069c)) {
            return false;
        }
        if ((this.f13068b & 2) != (lwVar.f13068b & 2)) {
            return false;
        }
        if (this.f13070d != lwVar.f13070d) {
            return false;
        }
        if (this.f13071e == null) {
            if (lwVar.f13071e != null) {
                return false;
            }
        } else if (!this.f13071e.equals(lwVar.f13071e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lwVar.aO);
        }
        if (lwVar.aO == null || lwVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f13070d ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + this.f13069c.hashCode()) * 31);
        bd bdVar = this.f13071e;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13068b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13069c);
        }
        if ((this.f13068b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13070d);
        }
        if (this.f13071e != null) {
            codedOutputByteBufferNano.b(3, this.f13071e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13068b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13069c);
        }
        if ((this.f13068b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (this.f13071e != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f13071e);
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
                    this.f13069c = aVar.f();
                    this.f13068b |= 1;
                    continue;
                case 16:
                    this.f13070d = aVar.e();
                    this.f13068b |= 2;
                    continue;
                case 26:
                    if (this.f13071e == null) {
                        this.f13071e = new bd();
                    }
                    aVar.a(this.f13071e);
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
