package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class dk extends C0758b {
    public static volatile dk[] f12149a;
    public int f12150b;
    public String f12151c;

    public static dk[] aT_() {
        if (f12149a == null) {
            synchronized (h.b) {
                if (f12149a == null) {
                    f12149a = new dk[0];
                }
            }
        }
        return f12149a;
    }

    public final dk m12426a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f12150b |= 1;
        this.f12151c = str;
        return this;
    }

    public dk() {
        this.f12150b = 0;
        this.f12151c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        if ((this.f12150b & 1) != (dkVar.f12150b & 1)) {
            return false;
        }
        if (!this.f12151c.equals(dkVar.f12151c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dkVar.aO);
        }
        if (dkVar.aO == null || dkVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f12151c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12150b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12151c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12150b & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(1, this.f12151c);
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
                    this.f12151c = aVar.f();
                    this.f12150b |= 1;
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
