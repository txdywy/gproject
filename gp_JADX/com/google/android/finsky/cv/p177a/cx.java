package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class cx extends C0758b {
    public int f12122a;
    public boolean f12123b;
    public String f12124c;
    public String f12125d;

    public cx() {
        this.f12122a = 0;
        this.f12123b = false;
        this.f12124c = "";
        this.f12125d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        if ((this.f12122a & 1) != (cxVar.f12122a & 1)) {
            return false;
        }
        if (this.f12123b != cxVar.f12123b) {
            return false;
        }
        if ((this.f12122a & 2) != (cxVar.f12122a & 2)) {
            return false;
        }
        if (!this.f12124c.equals(cxVar.f12124c)) {
            return false;
        }
        if ((this.f12122a & 4) != (cxVar.f12122a & 4)) {
            return false;
        }
        if (!this.f12125d.equals(cxVar.f12125d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cxVar.aO);
        }
        if (cxVar.aO == null || cxVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((this.f12123b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f12124c.hashCode()) * 31) + this.f12125d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12122a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12123b);
        }
        if ((this.f12122a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12124c);
        }
        if ((this.f12122a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12125d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12122a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f12122a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12124c);
        }
        if ((this.f12122a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f12125d);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12123b = aVar.e();
                    this.f12122a |= 1;
                    continue;
                case 18:
                    this.f12124c = aVar.f();
                    this.f12122a |= 2;
                    continue;
                case 26:
                    this.f12125d = aVar.f();
                    this.f12122a |= 4;
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
