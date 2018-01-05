package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bg extends C0758b {
    public int f11881a;
    public String f11882b;
    public String f11883c;
    public String f11884d;
    public String f11885e;
    public String f11886f;
    public String f11887g;

    public bg() {
        this.f11881a = 0;
        this.f11882b = "";
        this.f11883c = "";
        this.f11884d = "";
        this.f11885e = "";
        this.f11886f = "";
        this.f11887g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        if ((this.f11881a & 1) != (bgVar.f11881a & 1)) {
            return false;
        }
        if (!this.f11882b.equals(bgVar.f11882b)) {
            return false;
        }
        if ((this.f11881a & 2) != (bgVar.f11881a & 2)) {
            return false;
        }
        if (!this.f11883c.equals(bgVar.f11883c)) {
            return false;
        }
        if ((this.f11881a & 4) != (bgVar.f11881a & 4)) {
            return false;
        }
        if (!this.f11884d.equals(bgVar.f11884d)) {
            return false;
        }
        if ((this.f11881a & 8) != (bgVar.f11881a & 8)) {
            return false;
        }
        if (!this.f11885e.equals(bgVar.f11885e)) {
            return false;
        }
        if ((this.f11881a & 16) != (bgVar.f11881a & 16)) {
            return false;
        }
        if (!this.f11886f.equals(bgVar.f11886f)) {
            return false;
        }
        if ((this.f11881a & 32) != (bgVar.f11881a & 32)) {
            return false;
        }
        if (!this.f11887g.equals(bgVar.f11887g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bgVar.aO);
        }
        if (bgVar.aO == null || bgVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f11882b.hashCode()) * 31) + this.f11883c.hashCode()) * 31) + this.f11884d.hashCode()) * 31) + this.f11885e.hashCode()) * 31) + this.f11886f.hashCode()) * 31) + this.f11887g.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11881a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11882b);
        }
        if ((this.f11881a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11883c);
        }
        if ((this.f11881a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11884d);
        }
        if ((this.f11881a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f11885e);
        }
        if ((this.f11881a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f11886f);
        }
        if ((this.f11881a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f11887g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11881a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11882b);
        }
        if ((this.f11881a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11883c);
        }
        if ((this.f11881a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11884d);
        }
        if ((this.f11881a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f11885e);
        }
        if ((this.f11881a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f11886f);
        }
        if ((this.f11881a & 32) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f11887g);
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
                    this.f11882b = aVar.f();
                    this.f11881a |= 1;
                    continue;
                case 18:
                    this.f11883c = aVar.f();
                    this.f11881a |= 2;
                    continue;
                case 26:
                    this.f11884d = aVar.f();
                    this.f11881a |= 4;
                    continue;
                case 34:
                    this.f11885e = aVar.f();
                    this.f11881a |= 8;
                    continue;
                case 42:
                    this.f11886f = aVar.f();
                    this.f11881a |= 16;
                    continue;
                case 50:
                    this.f11887g = aVar.f();
                    this.f11881a |= 32;
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
