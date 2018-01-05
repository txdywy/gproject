package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2432f extends C0758b {
    public int f12343a;
    public String f12344b;
    public String f12345c;
    public String f12346d;

    public C2432f() {
        this.f12343a = 0;
        this.f12344b = "";
        this.f12345c = "";
        this.f12346d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2432f)) {
            return false;
        }
        C2432f c2432f = (C2432f) obj;
        if ((this.f12343a & 1) != (c2432f.f12343a & 1)) {
            return false;
        }
        if (!this.f12344b.equals(c2432f.f12344b)) {
            return false;
        }
        if ((this.f12343a & 2) != (c2432f.f12343a & 2)) {
            return false;
        }
        if (!this.f12345c.equals(c2432f.f12345c)) {
            return false;
        }
        if ((this.f12343a & 4) != (c2432f.f12343a & 4)) {
            return false;
        }
        if (!this.f12346d.equals(c2432f.f12346d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2432f.aO);
        }
        if (c2432f.aO == null || c2432f.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12344b.hashCode()) * 31) + this.f12345c.hashCode()) * 31) + this.f12346d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12343a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12344b);
        }
        if ((this.f12343a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12345c);
        }
        if ((this.f12343a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12346d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12343a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12344b);
        }
        if ((this.f12343a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12345c);
        }
        if ((this.f12343a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f12346d);
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
                    this.f12344b = aVar.f();
                    this.f12343a |= 1;
                    continue;
                case 18:
                    this.f12345c = aVar.f();
                    this.f12343a |= 2;
                    continue;
                case 26:
                    this.f12346d = aVar.f();
                    this.f12343a |= 4;
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
