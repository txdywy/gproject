package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2450w extends C0758b {
    public int f13214a;
    public ls f13215b;
    public cm f13216c;
    public C2427b f13217d;
    public String f13218e;

    public C2450w() {
        this.f13214a = 0;
        this.f13215b = null;
        this.f13216c = null;
        this.f13217d = null;
        this.f13218e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2450w)) {
            return false;
        }
        C2450w c2450w = (C2450w) obj;
        if (this.f13215b == null) {
            if (c2450w.f13215b != null) {
                return false;
            }
        } else if (!this.f13215b.equals(c2450w.f13215b)) {
            return false;
        }
        if (this.f13216c == null) {
            if (c2450w.f13216c != null) {
                return false;
            }
        } else if (!this.f13216c.equals(c2450w.f13216c)) {
            return false;
        }
        if (this.f13217d == null) {
            if (c2450w.f13217d != null) {
                return false;
            }
        } else if (!this.f13217d.equals(c2450w.f13217d)) {
            return false;
        }
        if ((this.f13214a & 1) != (c2450w.f13214a & 1)) {
            return false;
        }
        if (!this.f13218e.equals(c2450w.f13218e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2450w.aO);
        }
        if (c2450w.aO == null || c2450w.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ls lsVar = this.f13215b;
        hashCode = (lsVar == null ? 0 : lsVar.hashCode()) + (hashCode * 31);
        cm cmVar = this.f13216c;
        hashCode = (cmVar == null ? 0 : cmVar.hashCode()) + (hashCode * 31);
        C2427b c2427b = this.f13217d;
        hashCode = ((((c2427b == null ? 0 : c2427b.hashCode()) + (hashCode * 31)) * 31) + this.f13218e.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13215b != null) {
            codedOutputByteBufferNano.b(1, this.f13215b);
        }
        if (this.f13216c != null) {
            codedOutputByteBufferNano.b(2, this.f13216c);
        }
        if (this.f13217d != null) {
            codedOutputByteBufferNano.b(3, this.f13217d);
        }
        if ((this.f13214a & 1) != 0) {
            codedOutputByteBufferNano.a(4, this.f13218e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13215b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f13215b);
        }
        if (this.f13216c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f13216c);
        }
        if (this.f13217d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f13217d);
        }
        if ((this.f13214a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f13218e);
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
                    if (this.f13215b == null) {
                        this.f13215b = new ls();
                    }
                    aVar.a(this.f13215b);
                    continue;
                case 18:
                    if (this.f13216c == null) {
                        this.f13216c = new cm();
                    }
                    aVar.a(this.f13216c);
                    continue;
                case 26:
                    if (this.f13217d == null) {
                        this.f13217d = new C2427b();
                    }
                    aVar.a(this.f13217d);
                    continue;
                case 34:
                    this.f13218e = aVar.f();
                    this.f13214a |= 1;
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
