package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class jq extends C0758b {
    public int f12808a;
    public boolean f12809b;
    public String f12810c;
    public String f12811d;
    public lf[] f12812e;

    public final boolean bz_() {
        return (this.f12808a & 2) != 0;
    }

    public final boolean bA_() {
        return (this.f12808a & 4) != 0;
    }

    public jq() {
        this.f12808a = 0;
        this.f12809b = false;
        this.f12810c = "";
        this.f12811d = "";
        this.f12812e = lf.bL_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        if ((this.f12808a & 1) != (jqVar.f12808a & 1)) {
            return false;
        }
        if (this.f12809b != jqVar.f12809b) {
            return false;
        }
        if ((this.f12808a & 2) != (jqVar.f12808a & 2)) {
            return false;
        }
        if (!this.f12810c.equals(jqVar.f12810c)) {
            return false;
        }
        if ((this.f12808a & 4) != (jqVar.f12808a & 4)) {
            return false;
        }
        if (!this.f12811d.equals(jqVar.f12811d)) {
            return false;
        }
        if (!h.a(this.f12812e, jqVar.f12812e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jqVar.aO);
        }
        if (jqVar.aO == null || jqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.f12809b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f12810c.hashCode()) * 31) + this.f12811d.hashCode()) * 31) + h.a(this.f12812e)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12808a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12809b);
        }
        if ((this.f12808a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12810c);
        }
        if ((this.f12808a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12811d);
        }
        if (this.f12812e != null && this.f12812e.length > 0) {
            for (C0757i c0757i : this.f12812e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12808a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f12808a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12810c);
        }
        if ((this.f12808a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12811d);
        }
        if (this.f12812e == null || this.f12812e.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12812e) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(4, c0757i);
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
                case 8:
                    this.f12809b = aVar.e();
                    this.f12808a |= 1;
                    continue;
                case 18:
                    this.f12810c = aVar.f();
                    this.f12808a |= 2;
                    continue;
                case 26:
                    this.f12811d = aVar.f();
                    this.f12808a |= 4;
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f12812e == null ? 0 : this.f12812e.length;
                    Object obj = new lf[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12812e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lf();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lf();
                    aVar.a(obj[a]);
                    this.f12812e = obj;
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
