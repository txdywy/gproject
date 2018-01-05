package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ma extends C0758b {
    public static volatile ma[] f13146a;
    public int f13147b;
    public String f13148c;

    public static ma[] bU_() {
        if (f13146a == null) {
            synchronized (h.b) {
                if (f13146a == null) {
                    f13146a = new ma[0];
                }
            }
        }
        return f13146a;
    }

    public ma() {
        this.f13147b = 0;
        this.f13148c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        if ((this.f13147b & 1) != (maVar.f13147b & 1)) {
            return false;
        }
        if (!this.f13148c.equals(maVar.f13148c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(maVar.aO);
        }
        if (maVar.aO == null || maVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f13148c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13147b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13148c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13147b & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(1, this.f13148c);
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
                    this.f13148c = aVar.f();
                    this.f13147b |= 1;
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
