package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class eb extends C0758b {
    public int f12247a;
    public C2450w f12248b;
    public String f12249c;
    public String f12250d;
    public C2452y f12251e;
    public C2451x f12252f;

    public eb() {
        this.f12247a = 0;
        this.f12248b = null;
        this.f12249c = "";
        this.f12250d = "";
        this.f12251e = null;
        this.f12252f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        if (this.f12248b == null) {
            if (ebVar.f12248b != null) {
                return false;
            }
        } else if (!this.f12248b.equals(ebVar.f12248b)) {
            return false;
        }
        if ((this.f12247a & 1) != (ebVar.f12247a & 1)) {
            return false;
        }
        if (!this.f12249c.equals(ebVar.f12249c)) {
            return false;
        }
        if ((this.f12247a & 2) != (ebVar.f12247a & 2)) {
            return false;
        }
        if (!this.f12250d.equals(ebVar.f12250d)) {
            return false;
        }
        if (this.f12251e == null) {
            if (ebVar.f12251e != null) {
                return false;
            }
        } else if (!this.f12251e.equals(ebVar.f12251e)) {
            return false;
        }
        if (this.f12252f == null) {
            if (ebVar.f12252f != null) {
                return false;
            }
        } else if (!this.f12252f.equals(ebVar.f12252f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ebVar.aO);
        }
        if (ebVar.aO == null || ebVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2450w c2450w = this.f12248b;
        hashCode = (((((c2450w == null ? 0 : c2450w.hashCode()) + (hashCode * 31)) * 31) + this.f12249c.hashCode()) * 31) + this.f12250d.hashCode();
        C2452y c2452y = this.f12251e;
        hashCode = (c2452y == null ? 0 : c2452y.hashCode()) + (hashCode * 31);
        C2451x c2451x = this.f12252f;
        hashCode = ((c2451x == null ? 0 : c2451x.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12248b != null) {
            codedOutputByteBufferNano.b(1, this.f12248b);
        }
        if ((this.f12247a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12249c);
        }
        if ((this.f12247a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12250d);
        }
        if (this.f12251e != null) {
            codedOutputByteBufferNano.b(4, this.f12251e);
        }
        if (this.f12252f != null) {
            codedOutputByteBufferNano.b(5, this.f12252f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12248b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12248b);
        }
        if ((this.f12247a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12249c);
        }
        if ((this.f12247a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12250d);
        }
        if (this.f12251e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12251e);
        }
        if (this.f12252f != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f12252f);
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
                    if (this.f12248b == null) {
                        this.f12248b = new C2450w();
                    }
                    aVar.a(this.f12248b);
                    continue;
                case 18:
                    this.f12249c = aVar.f();
                    this.f12247a |= 1;
                    continue;
                case 26:
                    this.f12250d = aVar.f();
                    this.f12247a |= 2;
                    continue;
                case 34:
                    if (this.f12251e == null) {
                        this.f12251e = new C2452y();
                    }
                    aVar.a(this.f12251e);
                    continue;
                case 42:
                    if (this.f12252f == null) {
                        this.f12252f = new C2451x();
                    }
                    aVar.a(this.f12252f);
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
