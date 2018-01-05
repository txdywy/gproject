package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class df extends C0758b {
    public int f12140a;
    public String f12141b;
    public String f12142c;
    public String f12143d;
    public String f12144e;

    public df() {
        this.f12140a = 0;
        this.f12141b = "";
        this.f12142c = "";
        this.f12143d = "";
        this.f12144e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        if ((this.f12140a & 1) != (dfVar.f12140a & 1)) {
            return false;
        }
        if (!this.f12141b.equals(dfVar.f12141b)) {
            return false;
        }
        if ((this.f12140a & 2) != (dfVar.f12140a & 2)) {
            return false;
        }
        if (!this.f12142c.equals(dfVar.f12142c)) {
            return false;
        }
        if ((this.f12140a & 4) != (dfVar.f12140a & 4)) {
            return false;
        }
        if (!this.f12143d.equals(dfVar.f12143d)) {
            return false;
        }
        if ((this.f12140a & 8) != (dfVar.f12140a & 8)) {
            return false;
        }
        if (!this.f12144e.equals(dfVar.f12144e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dfVar.aO);
        }
        if (dfVar.aO == null || dfVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f12141b.hashCode()) * 31) + this.f12142c.hashCode()) * 31) + this.f12143d.hashCode()) * 31) + this.f12144e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12140a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12141b);
        }
        if ((this.f12140a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12142c);
        }
        if ((this.f12140a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12143d);
        }
        if ((this.f12140a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12144e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12140a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12141b);
        }
        if ((this.f12140a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12142c);
        }
        if ((this.f12140a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12143d);
        }
        if ((this.f12140a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12144e);
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
                    this.f12141b = aVar.f();
                    this.f12140a |= 1;
                    continue;
                case 18:
                    this.f12142c = aVar.f();
                    this.f12140a |= 2;
                    continue;
                case 26:
                    this.f12143d = aVar.f();
                    this.f12140a |= 4;
                    continue;
                case 34:
                    this.f12144e = aVar.f();
                    this.f12140a |= 8;
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
