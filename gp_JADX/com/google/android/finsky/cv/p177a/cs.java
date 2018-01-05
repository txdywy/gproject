package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class cs extends C0758b {
    public static volatile cs[] f12073a;
    public int f12074b;
    public String f12075c;
    public cr[] f12076d;

    public static cs[] aR_() {
        if (f12073a == null) {
            synchronized (h.b) {
                if (f12073a == null) {
                    f12073a = new cs[0];
                }
            }
        }
        return f12073a;
    }

    public cs() {
        this.f12074b = 0;
        this.f12075c = "";
        this.f12076d = cr.aQ_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        if ((this.f12074b & 1) != (csVar.f12074b & 1)) {
            return false;
        }
        if (!this.f12075c.equals(csVar.f12075c)) {
            return false;
        }
        if (!h.a(this.f12076d, csVar.f12076d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(csVar.aO);
        }
        if (csVar.aO == null || csVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12075c.hashCode()) * 31) + h.a(this.f12076d)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12074b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12075c);
        }
        if (this.f12076d != null && this.f12076d.length > 0) {
            for (C0757i c0757i : this.f12076d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12074b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12075c);
        }
        if (this.f12076d == null || this.f12076d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12076d) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(3, c0757i);
            }
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12075c = aVar.f();
                    this.f12074b |= 1;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f12076d == null ? 0 : this.f12076d.length;
                    Object obj = new cr[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12076d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cr();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cr();
                    aVar.a(obj[a]);
                    this.f12076d = obj;
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
