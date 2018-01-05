package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class hx extends C0758b {
    public int f12635a;
    public String f12636b;
    public cv[] f12637c;
    public gm[] f12638d;

    public hx() {
        this.f12635a = 0;
        this.f12636b = "";
        this.f12637c = cv.aS_();
        this.f12638d = gm.bf_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hx)) {
            return false;
        }
        hx hxVar = (hx) obj;
        if ((this.f12635a & 1) != (hxVar.f12635a & 1)) {
            return false;
        }
        if (!this.f12636b.equals(hxVar.f12636b)) {
            return false;
        }
        if (!h.a(this.f12637c, hxVar.f12637c)) {
            return false;
        }
        if (!h.a(this.f12638d, hxVar.f12638d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hxVar.aO);
        }
        if (hxVar.aO == null || hxVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12636b.hashCode()) * 31) + h.a(this.f12637c)) * 31) + h.a(this.f12638d)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12635a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12636b);
        }
        if (this.f12638d != null && this.f12638d.length > 0) {
            for (C0757i c0757i : this.f12638d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f12637c != null && this.f12637c.length > 0) {
            while (i < this.f12637c.length) {
                C0757i c0757i2 = this.f12637c[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(3, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f12635a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12636b);
        }
        if (this.f12638d != null && this.f12638d.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f12638d) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i2;
        }
        if (this.f12637c != null && this.f12637c.length > 0) {
            while (i < this.f12637c.length) {
                C0757i c0757i2 = this.f12637c[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(3, c0757i2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12636b = aVar.f();
                    this.f12635a |= 1;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f12638d == null ? 0 : this.f12638d.length;
                    obj = new gm[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12638d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gm();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new gm();
                    aVar.a(obj[a]);
                    this.f12638d = obj;
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f12637c == null ? 0 : this.f12637c.length;
                    obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12637c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cv();
                    aVar.a(obj[a]);
                    this.f12637c = obj;
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
