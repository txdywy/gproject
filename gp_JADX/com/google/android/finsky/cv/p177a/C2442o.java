package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C2442o extends C0758b {
    public ax[] f13187a;
    public ax[] f13188b;

    public C2442o() {
        this.f13187a = ax.aG_();
        this.f13188b = ax.aG_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2442o)) {
            return false;
        }
        C2442o c2442o = (C2442o) obj;
        if (!h.a(this.f13187a, c2442o.f13187a)) {
            return false;
        }
        if (!h.a(this.f13188b, c2442o.f13188b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2442o.aO);
        }
        if (c2442o.aO == null || c2442o.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13187a)) * 31) + h.a(this.f13188b)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f13187a != null && this.f13187a.length > 0) {
            for (C0757i c0757i : this.f13187a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f13188b != null && this.f13188b.length > 0) {
            while (i < this.f13188b.length) {
                C0757i c0757i2 = this.f13188b[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(2, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f13187a != null && this.f13187a.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f13187a) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i2;
        }
        if (this.f13188b != null && this.f13188b.length > 0) {
            while (i < this.f13188b.length) {
                C0757i c0757i2 = this.f13188b[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(2, c0757i2);
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
                    a2 = l.a(aVar, 10);
                    a = this.f13187a == null ? 0 : this.f13187a.length;
                    obj = new ax[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13187a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ax();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ax();
                    aVar.a(obj[a]);
                    this.f13187a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f13188b == null ? 0 : this.f13188b.length;
                    obj = new ax[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13188b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ax();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ax();
                    aVar.a(obj[a]);
                    this.f13188b = obj;
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
