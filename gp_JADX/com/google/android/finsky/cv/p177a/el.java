package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class el extends C0758b {
    public static volatile el[] f12287a;
    public int f12288b;
    public cv f12289c;
    public boolean f12290d;

    public static el[] aY_() {
        if (f12287a == null) {
            synchronized (h.b) {
                if (f12287a == null) {
                    f12287a = new el[0];
                }
            }
        }
        return f12287a;
    }

    public el() {
        this.f12288b = 0;
        this.f12289c = null;
        this.f12290d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        if (this.f12289c == null) {
            if (elVar.f12289c != null) {
                return false;
            }
        } else if (!this.f12289c.equals(elVar.f12289c)) {
            return false;
        }
        if ((this.f12288b & 1) != (elVar.f12288b & 1)) {
            return false;
        }
        if (this.f12290d != elVar.f12290d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(elVar.aO);
        }
        if (elVar.aO == null || elVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cv cvVar = this.f12289c;
        hashCode = ((this.f12290d ? 1231 : 1237) + (((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12289c != null) {
            codedOutputByteBufferNano.b(1, this.f12289c);
        }
        if ((this.f12288b & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12290d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12289c != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12289c);
        }
        if ((this.f12288b & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(2) + 1);
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
                    if (this.f12289c == null) {
                        this.f12289c = new cv();
                    }
                    aVar.a(this.f12289c);
                    continue;
                case 16:
                    this.f12290d = aVar.e();
                    this.f12288b |= 1;
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
