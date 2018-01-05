package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ec extends C0758b {
    public int f12253a;
    public C2450w f12254b;
    public String f12255c;
    public String f12256d;
    public C2452y f12257e;
    public C2451x f12258f;

    public ec() {
        this.f12253a = 0;
        this.f12254b = null;
        this.f12255c = "";
        this.f12256d = "";
        this.f12257e = null;
        this.f12258f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        if (this.f12254b == null) {
            if (ecVar.f12254b != null) {
                return false;
            }
        } else if (!this.f12254b.equals(ecVar.f12254b)) {
            return false;
        }
        if ((this.f12253a & 1) != (ecVar.f12253a & 1)) {
            return false;
        }
        if (!this.f12255c.equals(ecVar.f12255c)) {
            return false;
        }
        if ((this.f12253a & 2) != (ecVar.f12253a & 2)) {
            return false;
        }
        if (!this.f12256d.equals(ecVar.f12256d)) {
            return false;
        }
        if (this.f12257e == null) {
            if (ecVar.f12257e != null) {
                return false;
            }
        } else if (!this.f12257e.equals(ecVar.f12257e)) {
            return false;
        }
        if (this.f12258f == null) {
            if (ecVar.f12258f != null) {
                return false;
            }
        } else if (!this.f12258f.equals(ecVar.f12258f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ecVar.aO);
        }
        if (ecVar.aO == null || ecVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2450w c2450w = this.f12254b;
        hashCode = (((((c2450w == null ? 0 : c2450w.hashCode()) + (hashCode * 31)) * 31) + this.f12255c.hashCode()) * 31) + this.f12256d.hashCode();
        C2452y c2452y = this.f12257e;
        hashCode = (c2452y == null ? 0 : c2452y.hashCode()) + (hashCode * 31);
        C2451x c2451x = this.f12258f;
        hashCode = ((c2451x == null ? 0 : c2451x.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12254b != null) {
            codedOutputByteBufferNano.b(1, this.f12254b);
        }
        if ((this.f12253a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12255c);
        }
        if ((this.f12253a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12256d);
        }
        if (this.f12257e != null) {
            codedOutputByteBufferNano.b(4, this.f12257e);
        }
        if (this.f12258f != null) {
            codedOutputByteBufferNano.b(5, this.f12258f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12254b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12254b);
        }
        if ((this.f12253a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12255c);
        }
        if ((this.f12253a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12256d);
        }
        if (this.f12257e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12257e);
        }
        if (this.f12258f != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f12258f);
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
                    if (this.f12254b == null) {
                        this.f12254b = new C2450w();
                    }
                    aVar.a(this.f12254b);
                    continue;
                case 18:
                    this.f12255c = aVar.f();
                    this.f12253a |= 1;
                    continue;
                case 26:
                    this.f12256d = aVar.f();
                    this.f12253a |= 2;
                    continue;
                case 34:
                    if (this.f12257e == null) {
                        this.f12257e = new C2452y();
                    }
                    aVar.a(this.f12257e);
                    continue;
                case 42:
                    if (this.f12258f == null) {
                        this.f12258f = new C2451x();
                    }
                    aVar.a(this.f12258f);
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
