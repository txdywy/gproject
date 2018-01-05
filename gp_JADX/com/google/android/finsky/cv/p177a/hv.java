package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hv extends C0758b {
    public int f12623a;
    public String f12624b;
    public String f12625c;
    public String f12626d;
    public String f12627e;

    public final boolean bl_() {
        return (this.f12623a & 2) != 0;
    }

    public hv() {
        this.f12623a = 0;
        this.f12624b = "";
        this.f12625c = "";
        this.f12626d = "";
        this.f12627e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        if ((this.f12623a & 1) != (hvVar.f12623a & 1)) {
            return false;
        }
        if (!this.f12624b.equals(hvVar.f12624b)) {
            return false;
        }
        if ((this.f12623a & 2) != (hvVar.f12623a & 2)) {
            return false;
        }
        if (!this.f12625c.equals(hvVar.f12625c)) {
            return false;
        }
        if ((this.f12623a & 4) != (hvVar.f12623a & 4)) {
            return false;
        }
        if (!this.f12626d.equals(hvVar.f12626d)) {
            return false;
        }
        if ((this.f12623a & 8) != (hvVar.f12623a & 8)) {
            return false;
        }
        if (!this.f12627e.equals(hvVar.f12627e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hvVar.aO);
        }
        if (hvVar.aO == null || hvVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f12624b.hashCode()) * 31) + this.f12625c.hashCode()) * 31) + this.f12626d.hashCode()) * 31) + this.f12627e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12623a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12624b);
        }
        if ((this.f12623a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12625c);
        }
        if ((this.f12623a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12626d);
        }
        if ((this.f12623a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12627e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12623a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12624b);
        }
        if ((this.f12623a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12625c);
        }
        if ((this.f12623a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12626d);
        }
        if ((this.f12623a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12627e);
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
                    this.f12624b = aVar.f();
                    this.f12623a |= 1;
                    continue;
                case 18:
                    this.f12625c = aVar.f();
                    this.f12623a |= 2;
                    continue;
                case 26:
                    this.f12626d = aVar.f();
                    this.f12623a |= 4;
                    continue;
                case 34:
                    this.f12627e = aVar.f();
                    this.f12623a |= 8;
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
