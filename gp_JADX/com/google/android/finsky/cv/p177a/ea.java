package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ea extends C0758b {
    public int f12240a;
    public C2450w f12241b;
    public String f12242c;
    public String f12243d;
    public C2452y f12244e;
    public String f12245f;
    public C2451x f12246g;

    public ea() {
        this.f12240a = 0;
        this.f12241b = null;
        this.f12242c = "";
        this.f12243d = "";
        this.f12244e = null;
        this.f12245f = "";
        this.f12246g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        if (this.f12241b == null) {
            if (eaVar.f12241b != null) {
                return false;
            }
        } else if (!this.f12241b.equals(eaVar.f12241b)) {
            return false;
        }
        if ((this.f12240a & 1) != (eaVar.f12240a & 1)) {
            return false;
        }
        if (!this.f12242c.equals(eaVar.f12242c)) {
            return false;
        }
        if ((this.f12240a & 2) != (eaVar.f12240a & 2)) {
            return false;
        }
        if (!this.f12243d.equals(eaVar.f12243d)) {
            return false;
        }
        if (this.f12244e == null) {
            if (eaVar.f12244e != null) {
                return false;
            }
        } else if (!this.f12244e.equals(eaVar.f12244e)) {
            return false;
        }
        if ((this.f12240a & 4) != (eaVar.f12240a & 4)) {
            return false;
        }
        if (!this.f12245f.equals(eaVar.f12245f)) {
            return false;
        }
        if (this.f12246g == null) {
            if (eaVar.f12246g != null) {
                return false;
            }
        } else if (!this.f12246g.equals(eaVar.f12246g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(eaVar.aO);
        }
        if (eaVar.aO == null || eaVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2450w c2450w = this.f12241b;
        hashCode = (((((c2450w == null ? 0 : c2450w.hashCode()) + (hashCode * 31)) * 31) + this.f12242c.hashCode()) * 31) + this.f12243d.hashCode();
        C2452y c2452y = this.f12244e;
        hashCode = (((c2452y == null ? 0 : c2452y.hashCode()) + (hashCode * 31)) * 31) + this.f12245f.hashCode();
        C2451x c2451x = this.f12246g;
        hashCode = ((c2451x == null ? 0 : c2451x.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12241b != null) {
            codedOutputByteBufferNano.b(1, this.f12241b);
        }
        if ((this.f12240a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12242c);
        }
        if ((this.f12240a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12243d);
        }
        if (this.f12244e != null) {
            codedOutputByteBufferNano.b(4, this.f12244e);
        }
        if ((this.f12240a & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f12245f);
        }
        if (this.f12246g != null) {
            codedOutputByteBufferNano.b(6, this.f12246g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12241b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12241b);
        }
        if ((this.f12240a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12242c);
        }
        if ((this.f12240a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12243d);
        }
        if (this.f12244e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12244e);
        }
        if ((this.f12240a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12245f);
        }
        if (this.f12246g != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f12246g);
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
                    if (this.f12241b == null) {
                        this.f12241b = new C2450w();
                    }
                    aVar.a(this.f12241b);
                    continue;
                case 18:
                    this.f12242c = aVar.f();
                    this.f12240a |= 1;
                    continue;
                case 26:
                    this.f12243d = aVar.f();
                    this.f12240a |= 2;
                    continue;
                case 34:
                    if (this.f12244e == null) {
                        this.f12244e = new C2452y();
                    }
                    aVar.a(this.f12244e);
                    continue;
                case 42:
                    this.f12245f = aVar.f();
                    this.f12240a |= 4;
                    continue;
                case 50:
                    if (this.f12246g == null) {
                        this.f12246g = new C2451x();
                    }
                    aVar.a(this.f12246g);
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
