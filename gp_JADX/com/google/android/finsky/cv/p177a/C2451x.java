package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2451x extends C0758b {
    public int f13219a;
    public C2427b f13220b;
    public String f13221c;
    public String f13222d;

    public C2451x() {
        this.f13219a = 0;
        this.f13220b = null;
        this.f13221c = "";
        this.f13222d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2451x)) {
            return false;
        }
        C2451x c2451x = (C2451x) obj;
        if (this.f13220b == null) {
            if (c2451x.f13220b != null) {
                return false;
            }
        } else if (!this.f13220b.equals(c2451x.f13220b)) {
            return false;
        }
        if ((this.f13219a & 1) != (c2451x.f13219a & 1)) {
            return false;
        }
        if (!this.f13221c.equals(c2451x.f13221c)) {
            return false;
        }
        if ((this.f13219a & 2) != (c2451x.f13219a & 2)) {
            return false;
        }
        if (!this.f13222d.equals(c2451x.f13222d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2451x.aO);
        }
        if (c2451x.aO == null || c2451x.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2427b c2427b = this.f13220b;
        hashCode = ((((((c2427b == null ? 0 : c2427b.hashCode()) + (hashCode * 31)) * 31) + this.f13221c.hashCode()) * 31) + this.f13222d.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13220b != null) {
            codedOutputByteBufferNano.b(1, this.f13220b);
        }
        if ((this.f13219a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f13221c);
        }
        if ((this.f13219a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f13222d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13220b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f13220b);
        }
        if ((this.f13219a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13221c);
        }
        if ((this.f13219a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f13222d);
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
                    if (this.f13220b == null) {
                        this.f13220b = new C2427b();
                    }
                    aVar.a(this.f13220b);
                    continue;
                case 18:
                    this.f13221c = aVar.f();
                    this.f13219a |= 1;
                    continue;
                case 26:
                    this.f13222d = aVar.f();
                    this.f13219a |= 2;
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
