package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hn extends C0758b {
    public int f12584a;
    public String f12585b;
    public String f12586c;
    public String f12587d;

    public hn() {
        this.f12584a = 0;
        this.f12585b = "";
        this.f12586c = "";
        this.f12587d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        if ((this.f12584a & 1) != (hnVar.f12584a & 1)) {
            return false;
        }
        if (!this.f12585b.equals(hnVar.f12585b)) {
            return false;
        }
        if ((this.f12584a & 2) != (hnVar.f12584a & 2)) {
            return false;
        }
        if (!this.f12586c.equals(hnVar.f12586c)) {
            return false;
        }
        if ((this.f12584a & 4) != (hnVar.f12584a & 4)) {
            return false;
        }
        if (!this.f12587d.equals(hnVar.f12587d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hnVar.aO);
        }
        if (hnVar.aO == null || hnVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12585b.hashCode()) * 31) + this.f12586c.hashCode()) * 31) + this.f12587d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12584a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12585b);
        }
        if ((this.f12584a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12586c);
        }
        if ((this.f12584a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12587d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12584a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12585b);
        }
        if ((this.f12584a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12586c);
        }
        if ((this.f12584a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f12587d);
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
                    this.f12585b = aVar.f();
                    this.f12584a |= 1;
                    continue;
                case 18:
                    this.f12586c = aVar.f();
                    this.f12584a |= 2;
                    continue;
                case 26:
                    this.f12587d = aVar.f();
                    this.f12584a |= 4;
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
