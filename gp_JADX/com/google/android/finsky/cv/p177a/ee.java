package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ee extends C0758b {
    public int f12268a;
    public C2450w f12269b;
    public String f12270c;
    public String f12271d;
    public C2452y f12272e;
    public C2451x f12273f;

    public ee() {
        this.f12268a = 0;
        this.f12269b = null;
        this.f12270c = "";
        this.f12271d = "";
        this.f12272e = null;
        this.f12273f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj;
        if (this.f12269b == null) {
            if (eeVar.f12269b != null) {
                return false;
            }
        } else if (!this.f12269b.equals(eeVar.f12269b)) {
            return false;
        }
        if ((this.f12268a & 1) != (eeVar.f12268a & 1)) {
            return false;
        }
        if (!this.f12270c.equals(eeVar.f12270c)) {
            return false;
        }
        if ((this.f12268a & 2) != (eeVar.f12268a & 2)) {
            return false;
        }
        if (!this.f12271d.equals(eeVar.f12271d)) {
            return false;
        }
        if (this.f12272e == null) {
            if (eeVar.f12272e != null) {
                return false;
            }
        } else if (!this.f12272e.equals(eeVar.f12272e)) {
            return false;
        }
        if (this.f12273f == null) {
            if (eeVar.f12273f != null) {
                return false;
            }
        } else if (!this.f12273f.equals(eeVar.f12273f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(eeVar.aO);
        }
        if (eeVar.aO == null || eeVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2450w c2450w = this.f12269b;
        hashCode = (((((c2450w == null ? 0 : c2450w.hashCode()) + (hashCode * 31)) * 31) + this.f12270c.hashCode()) * 31) + this.f12271d.hashCode();
        C2452y c2452y = this.f12272e;
        hashCode = (c2452y == null ? 0 : c2452y.hashCode()) + (hashCode * 31);
        C2451x c2451x = this.f12273f;
        hashCode = ((c2451x == null ? 0 : c2451x.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12269b != null) {
            codedOutputByteBufferNano.b(1, this.f12269b);
        }
        if ((this.f12268a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12270c);
        }
        if ((this.f12268a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12271d);
        }
        if (this.f12272e != null) {
            codedOutputByteBufferNano.b(4, this.f12272e);
        }
        if (this.f12273f != null) {
            codedOutputByteBufferNano.b(5, this.f12273f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12269b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12269b);
        }
        if ((this.f12268a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12270c);
        }
        if ((this.f12268a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12271d);
        }
        if (this.f12272e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12272e);
        }
        if (this.f12273f != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f12273f);
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
                    if (this.f12269b == null) {
                        this.f12269b = new C2450w();
                    }
                    aVar.a(this.f12269b);
                    continue;
                case 18:
                    this.f12270c = aVar.f();
                    this.f12268a |= 1;
                    continue;
                case 26:
                    this.f12271d = aVar.f();
                    this.f12268a |= 2;
                    continue;
                case 34:
                    if (this.f12272e == null) {
                        this.f12272e = new C2452y();
                    }
                    aVar.a(this.f12272e);
                    continue;
                case 42:
                    if (this.f12273f == null) {
                        this.f12273f = new C2451x();
                    }
                    aVar.a(this.f12273f);
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
