package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ed extends C0758b {
    public int f12259a;
    public C2450w f12260b;
    public String f12261c;
    public String f12262d;
    public int f12263e;
    public String f12264f;
    public String f12265g;
    public C2451x f12266h;
    public String f12267i;

    public ed() {
        this.f12259a = 0;
        this.f12260b = null;
        this.f12261c = "";
        this.f12262d = "";
        this.f12263e = 0;
        this.f12264f = "";
        this.f12265g = "";
        this.f12266h = null;
        this.f12267i = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ed)) {
            return false;
        }
        ed edVar = (ed) obj;
        if (this.f12260b == null) {
            if (edVar.f12260b != null) {
                return false;
            }
        } else if (!this.f12260b.equals(edVar.f12260b)) {
            return false;
        }
        if ((this.f12259a & 1) != (edVar.f12259a & 1)) {
            return false;
        }
        if (!this.f12261c.equals(edVar.f12261c)) {
            return false;
        }
        if ((this.f12259a & 2) != (edVar.f12259a & 2)) {
            return false;
        }
        if (!this.f12262d.equals(edVar.f12262d)) {
            return false;
        }
        if ((this.f12259a & 4) != (edVar.f12259a & 4)) {
            return false;
        }
        if (this.f12263e != edVar.f12263e) {
            return false;
        }
        if ((this.f12259a & 8) != (edVar.f12259a & 8)) {
            return false;
        }
        if (!this.f12264f.equals(edVar.f12264f)) {
            return false;
        }
        if ((this.f12259a & 16) != (edVar.f12259a & 16)) {
            return false;
        }
        if (!this.f12265g.equals(edVar.f12265g)) {
            return false;
        }
        if (this.f12266h == null) {
            if (edVar.f12266h != null) {
                return false;
            }
        } else if (!this.f12266h.equals(edVar.f12266h)) {
            return false;
        }
        if ((this.f12259a & 32) != (edVar.f12259a & 32)) {
            return false;
        }
        if (!this.f12267i.equals(edVar.f12267i)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(edVar.aO);
        }
        if (edVar.aO == null || edVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2450w c2450w = this.f12260b;
        hashCode = (((((((((((c2450w == null ? 0 : c2450w.hashCode()) + (hashCode * 31)) * 31) + this.f12261c.hashCode()) * 31) + this.f12262d.hashCode()) * 31) + this.f12263e) * 31) + this.f12264f.hashCode()) * 31) + this.f12265g.hashCode();
        C2451x c2451x = this.f12266h;
        hashCode = ((((c2451x == null ? 0 : c2451x.hashCode()) + (hashCode * 31)) * 31) + this.f12267i.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12260b != null) {
            codedOutputByteBufferNano.b(1, this.f12260b);
        }
        if ((this.f12259a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12261c);
        }
        if ((this.f12259a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12262d);
        }
        if ((this.f12259a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12263e);
        }
        if ((this.f12259a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12264f);
        }
        if ((this.f12259a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f12265g);
        }
        if (this.f12266h != null) {
            codedOutputByteBufferNano.b(7, this.f12266h);
        }
        if ((this.f12259a & 32) != 0) {
            codedOutputByteBufferNano.a(8, this.f12267i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12260b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12260b);
        }
        if ((this.f12259a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12261c);
        }
        if ((this.f12259a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12262d);
        }
        if ((this.f12259a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f12263e);
        }
        if ((this.f12259a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12264f);
        }
        if ((this.f12259a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f12265g);
        }
        if (this.f12266h != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12266h);
        }
        if ((this.f12259a & 32) != 0) {
            return b + CodedOutputByteBufferNano.b(8, this.f12267i);
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
                    if (this.f12260b == null) {
                        this.f12260b = new C2450w();
                    }
                    aVar.a(this.f12260b);
                    continue;
                case 18:
                    this.f12261c = aVar.f();
                    this.f12259a |= 1;
                    continue;
                case 26:
                    this.f12262d = aVar.f();
                    this.f12259a |= 2;
                    continue;
                case 32:
                    this.f12263e = aVar.i();
                    this.f12259a |= 4;
                    continue;
                case 42:
                    this.f12264f = aVar.f();
                    this.f12259a |= 8;
                    continue;
                case 50:
                    this.f12265g = aVar.f();
                    this.f12259a |= 16;
                    continue;
                case 58:
                    if (this.f12266h == null) {
                        this.f12266h = new C2451x();
                    }
                    aVar.a(this.f12266h);
                    continue;
                case 66:
                    this.f12267i = aVar.f();
                    this.f12259a |= 32;
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
