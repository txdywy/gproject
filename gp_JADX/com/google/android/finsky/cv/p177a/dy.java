package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class dy extends C0758b {
    public int f12226a;
    public C2450w f12227b;
    public String f12228c;
    public C2452y f12229d;
    public String f12230e;
    public C2451x f12231f;

    public dy() {
        this.f12226a = 0;
        this.f12227b = null;
        this.f12228c = "";
        this.f12229d = null;
        this.f12230e = "";
        this.f12231f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        if (this.f12227b == null) {
            if (dyVar.f12227b != null) {
                return false;
            }
        } else if (!this.f12227b.equals(dyVar.f12227b)) {
            return false;
        }
        if ((this.f12226a & 1) != (dyVar.f12226a & 1)) {
            return false;
        }
        if (!this.f12228c.equals(dyVar.f12228c)) {
            return false;
        }
        if (this.f12229d == null) {
            if (dyVar.f12229d != null) {
                return false;
            }
        } else if (!this.f12229d.equals(dyVar.f12229d)) {
            return false;
        }
        if ((this.f12226a & 2) != (dyVar.f12226a & 2)) {
            return false;
        }
        if (!this.f12230e.equals(dyVar.f12230e)) {
            return false;
        }
        if (this.f12231f == null) {
            if (dyVar.f12231f != null) {
                return false;
            }
        } else if (!this.f12231f.equals(dyVar.f12231f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dyVar.aO);
        }
        if (dyVar.aO == null || dyVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2450w c2450w = this.f12227b;
        hashCode = (((c2450w == null ? 0 : c2450w.hashCode()) + (hashCode * 31)) * 31) + this.f12228c.hashCode();
        C2452y c2452y = this.f12229d;
        hashCode = (((c2452y == null ? 0 : c2452y.hashCode()) + (hashCode * 31)) * 31) + this.f12230e.hashCode();
        C2451x c2451x = this.f12231f;
        hashCode = ((c2451x == null ? 0 : c2451x.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12227b != null) {
            codedOutputByteBufferNano.b(1, this.f12227b);
        }
        if ((this.f12226a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12228c);
        }
        if (this.f12229d != null) {
            codedOutputByteBufferNano.b(3, this.f12229d);
        }
        if ((this.f12226a & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f12230e);
        }
        if (this.f12231f != null) {
            codedOutputByteBufferNano.b(5, this.f12231f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12227b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12227b);
        }
        if ((this.f12226a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12228c);
        }
        if (this.f12229d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12229d);
        }
        if ((this.f12226a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12230e);
        }
        if (this.f12231f != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f12231f);
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
                    if (this.f12227b == null) {
                        this.f12227b = new C2450w();
                    }
                    aVar.a(this.f12227b);
                    continue;
                case 18:
                    this.f12228c = aVar.f();
                    this.f12226a |= 1;
                    continue;
                case 26:
                    if (this.f12229d == null) {
                        this.f12229d = new C2452y();
                    }
                    aVar.a(this.f12229d);
                    continue;
                case 34:
                    this.f12230e = aVar.f();
                    this.f12226a |= 2;
                    continue;
                case 42:
                    if (this.f12231f == null) {
                        this.f12231f = new C2451x();
                    }
                    aVar.a(this.f12231f);
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
