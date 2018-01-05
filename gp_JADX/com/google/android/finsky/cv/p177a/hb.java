package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hb extends C0758b {
    public int f12531a;
    public cv f12532b;
    public boolean f12533c;
    public gm f12534d;

    public hb() {
        this.f12531a = 0;
        this.f12532b = null;
        this.f12533c = true;
        this.f12534d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        if (this.f12532b == null) {
            if (hbVar.f12532b != null) {
                return false;
            }
        } else if (!this.f12532b.equals(hbVar.f12532b)) {
            return false;
        }
        if ((this.f12531a & 1) != (hbVar.f12531a & 1)) {
            return false;
        }
        if (this.f12533c != hbVar.f12533c) {
            return false;
        }
        if (this.f12534d == null) {
            if (hbVar.f12534d != null) {
                return false;
            }
        } else if (!this.f12534d.equals(hbVar.f12534d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hbVar.aO);
        }
        if (hbVar.aO == null || hbVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cv cvVar = this.f12532b;
        hashCode = (this.f12533c ? 1231 : 1237) + (((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31);
        gm gmVar = this.f12534d;
        hashCode = ((gmVar == null ? 0 : gmVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12534d != null) {
            codedOutputByteBufferNano.b(1, this.f12534d);
        }
        if (this.f12532b != null) {
            codedOutputByteBufferNano.b(2, this.f12532b);
        }
        if ((this.f12531a & 1) != 0) {
            codedOutputByteBufferNano.a(3, this.f12533c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12534d != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12534d);
        }
        if (this.f12532b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12532b);
        }
        if ((this.f12531a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(3) + 1);
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
                    if (this.f12534d == null) {
                        this.f12534d = new gm();
                    }
                    aVar.a(this.f12534d);
                    continue;
                case 18:
                    if (this.f12532b == null) {
                        this.f12532b = new cv();
                    }
                    aVar.a(this.f12532b);
                    continue;
                case 24:
                    this.f12533c = aVar.e();
                    this.f12531a |= 1;
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
