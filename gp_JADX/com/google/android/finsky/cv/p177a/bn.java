package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class bn extends C0758b {
    public static volatile bn[] f11943a;
    public int f11944b;
    public long f11945c;
    public bk f11946d;
    public bk f11947e;

    public static bn[] aN_() {
        if (f11943a == null) {
            synchronized (h.b) {
                if (f11943a == null) {
                    f11943a = new bn[0];
                }
            }
        }
        return f11943a;
    }

    public bn() {
        this.f11944b = 0;
        this.f11945c = 0;
        this.f11946d = null;
        this.f11947e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        if ((this.f11944b & 1) != (bnVar.f11944b & 1)) {
            return false;
        }
        if (this.f11945c != bnVar.f11945c) {
            return false;
        }
        if (this.f11946d == null) {
            if (bnVar.f11946d != null) {
                return false;
            }
        } else if (!this.f11946d.equals(bnVar.f11946d)) {
            return false;
        }
        if (this.f11947e == null) {
            if (bnVar.f11947e != null) {
                return false;
            }
        } else if (!this.f11947e.equals(bnVar.f11947e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bnVar.aO);
        }
        if (bnVar.aO == null || bnVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f11945c;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        bk bkVar = this.f11946d;
        hashCode = (bkVar == null ? 0 : bkVar.hashCode()) + (hashCode * 31);
        bkVar = this.f11947e;
        hashCode = ((bkVar == null ? 0 : bkVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11944b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f11945c);
        }
        if (this.f11946d != null) {
            codedOutputByteBufferNano.b(2, this.f11946d);
        }
        if (this.f11947e != null) {
            codedOutputByteBufferNano.b(3, this.f11947e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11944b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f11945c);
        }
        if (this.f11946d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f11946d);
        }
        if (this.f11947e != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f11947e);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f11945c = aVar.j();
                    this.f11944b |= 1;
                    continue;
                case 18:
                    if (this.f11946d == null) {
                        this.f11946d = new bk();
                    }
                    aVar.a(this.f11946d);
                    continue;
                case 26:
                    if (this.f11947e == null) {
                        this.f11947e = new bk();
                    }
                    aVar.a(this.f11947e);
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
