package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ji extends C0758b {
    public static volatile ji[] f12784b;
    public int f12785a;
    public jh f12786c;
    public jg f12787d;

    public static ji[] bx_() {
        if (f12784b == null) {
            synchronized (h.b) {
                if (f12784b == null) {
                    f12784b = new ji[0];
                }
            }
        }
        return f12784b;
    }

    public final jh by_() {
        if (this.f12785a == 0) {
            return this.f12786c;
        }
        return null;
    }

    public final boolean m12870d() {
        return this.f12785a == 0;
    }

    public ji() {
        this.f12785a = -1;
        this.f12785a = -1;
        this.f12786c = null;
        this.f12785a = -1;
        this.f12787d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ji)) {
            return false;
        }
        ji jiVar = (ji) obj;
        if (this.f12786c == null) {
            if (jiVar.f12786c != null) {
                return false;
            }
        } else if (!this.f12786c.equals(jiVar.f12786c)) {
            return false;
        }
        if (this.f12787d == null) {
            if (jiVar.f12787d != null) {
                return false;
            }
        } else if (!this.f12787d.equals(jiVar.f12787d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jiVar.aO);
        }
        if (jiVar.aO == null || jiVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        jh jhVar = this.f12786c;
        if (this.f12785a != 0) {
            jhVar = null;
        }
        hashCode = (hashCode * 31) + (jhVar == null ? 0 : jhVar.hashCode());
        jg jgVar = this.f12787d;
        if (this.f12785a != 1) {
            jgVar = null;
        }
        int hashCode2 = ((jgVar == null ? 0 : jgVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode2 + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12785a == 0) {
            codedOutputByteBufferNano.b(1, this.f12786c);
        }
        if (this.f12785a == 1) {
            codedOutputByteBufferNano.b(2, this.f12787d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12785a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12786c);
        }
        if (this.f12785a == 1) {
            return b + CodedOutputByteBufferNano.d(2, this.f12787d);
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
                    if (this.f12786c == null) {
                        this.f12786c = new jh();
                    }
                    aVar.a(this.f12786c);
                    this.f12785a = 0;
                    continue;
                case 18:
                    if (this.f12787d == null) {
                        this.f12787d = new jg();
                    }
                    aVar.a(this.f12787d);
                    this.f12785a = 1;
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
