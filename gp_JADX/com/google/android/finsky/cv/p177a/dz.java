package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class dz extends C0758b {
    public int f12232a;
    public C2450w f12233b;
    public String f12234c;
    public String f12235d;
    public C2452y[] f12236e;
    public C2451x f12237f;

    public dz() {
        this.f12232a = 0;
        this.f12233b = null;
        this.f12234c = "";
        this.f12235d = "";
        this.f12236e = C2452y.az_();
        this.f12237f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        if (this.f12233b == null) {
            if (dzVar.f12233b != null) {
                return false;
            }
        } else if (!this.f12233b.equals(dzVar.f12233b)) {
            return false;
        }
        if ((this.f12232a & 1) != (dzVar.f12232a & 1)) {
            return false;
        }
        if (!this.f12234c.equals(dzVar.f12234c)) {
            return false;
        }
        if ((this.f12232a & 2) != (dzVar.f12232a & 2)) {
            return false;
        }
        if (!this.f12235d.equals(dzVar.f12235d)) {
            return false;
        }
        if (!h.a(this.f12236e, dzVar.f12236e)) {
            return false;
        }
        if (this.f12237f == null) {
            if (dzVar.f12237f != null) {
                return false;
            }
        } else if (!this.f12237f.equals(dzVar.f12237f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dzVar.aO);
        }
        if (dzVar.aO == null || dzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2450w c2450w = this.f12233b;
        hashCode = (((((((c2450w == null ? 0 : c2450w.hashCode()) + (hashCode * 31)) * 31) + this.f12234c.hashCode()) * 31) + this.f12235d.hashCode()) * 31) + h.a(this.f12236e);
        C2451x c2451x = this.f12237f;
        hashCode = ((c2451x == null ? 0 : c2451x.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12233b != null) {
            codedOutputByteBufferNano.b(1, this.f12233b);
        }
        if ((this.f12232a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12234c);
        }
        if ((this.f12232a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12235d);
        }
        if (this.f12236e != null && this.f12236e.length > 0) {
            for (C0757i c0757i : this.f12236e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if (this.f12237f != null) {
            codedOutputByteBufferNano.b(5, this.f12237f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12233b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12233b);
        }
        if ((this.f12232a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12234c);
        }
        if ((this.f12232a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12235d);
        }
        if (this.f12236e != null && this.f12236e.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12236e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if (this.f12237f != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f12237f);
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
                    if (this.f12233b == null) {
                        this.f12233b = new C2450w();
                    }
                    aVar.a(this.f12233b);
                    continue;
                case 18:
                    this.f12234c = aVar.f();
                    this.f12232a |= 1;
                    continue;
                case 26:
                    this.f12235d = aVar.f();
                    this.f12232a |= 2;
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f12236e == null ? 0 : this.f12236e.length;
                    Object obj = new C2452y[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12236e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C2452y();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C2452y();
                    aVar.a(obj[a]);
                    this.f12236e = obj;
                    continue;
                case 42:
                    if (this.f12237f == null) {
                        this.f12237f = new C2451x();
                    }
                    aVar.a(this.f12237f);
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
