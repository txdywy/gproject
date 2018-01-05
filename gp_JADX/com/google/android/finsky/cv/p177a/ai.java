package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ai extends C0758b {
    public int f11795a;
    public String f11796b;
    public String f11797c;
    public String f11798d;
    public String f11799e;

    public final boolean aD_() {
        return (this.f11795a & 2) != 0;
    }

    public ai() {
        this.f11795a = 0;
        this.f11796b = "";
        this.f11797c = "";
        this.f11798d = "";
        this.f11799e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        if ((this.f11795a & 1) != (aiVar.f11795a & 1)) {
            return false;
        }
        if (!this.f11796b.equals(aiVar.f11796b)) {
            return false;
        }
        if ((this.f11795a & 2) != (aiVar.f11795a & 2)) {
            return false;
        }
        if (!this.f11797c.equals(aiVar.f11797c)) {
            return false;
        }
        if ((this.f11795a & 4) != (aiVar.f11795a & 4)) {
            return false;
        }
        if (!this.f11798d.equals(aiVar.f11798d)) {
            return false;
        }
        if ((this.f11795a & 8) != (aiVar.f11795a & 8)) {
            return false;
        }
        if (!this.f11799e.equals(aiVar.f11799e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(aiVar.aO);
        }
        if (aiVar.aO == null || aiVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f11796b.hashCode()) * 31) + this.f11797c.hashCode()) * 31) + this.f11798d.hashCode()) * 31) + this.f11799e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11795a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11796b);
        }
        if ((this.f11795a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11797c);
        }
        if ((this.f11795a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11798d);
        }
        if ((this.f11795a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f11799e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11795a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11796b);
        }
        if ((this.f11795a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11797c);
        }
        if ((this.f11795a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11798d);
        }
        if ((this.f11795a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f11799e);
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
                    this.f11796b = aVar.f();
                    this.f11795a |= 1;
                    continue;
                case 18:
                    this.f11797c = aVar.f();
                    this.f11795a |= 2;
                    continue;
                case 26:
                    this.f11798d = aVar.f();
                    this.f11795a |= 4;
                    continue;
                case 34:
                    this.f11799e = aVar.f();
                    this.f11795a |= 8;
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
