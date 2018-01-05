package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ey extends C0758b {
    public int f12331a;
    public String f12332b;
    public String f12333c;
    public String f12334d;
    public String f12335e;
    public boolean f12336f;

    public ey() {
        this.f12331a = 0;
        this.f12332b = "";
        this.f12333c = "";
        this.f12334d = "";
        this.f12335e = "";
        this.f12336f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        if ((this.f12331a & 1) != (eyVar.f12331a & 1)) {
            return false;
        }
        if (!this.f12332b.equals(eyVar.f12332b)) {
            return false;
        }
        if ((this.f12331a & 2) != (eyVar.f12331a & 2)) {
            return false;
        }
        if (!this.f12333c.equals(eyVar.f12333c)) {
            return false;
        }
        if ((this.f12331a & 4) != (eyVar.f12331a & 4)) {
            return false;
        }
        if (!this.f12334d.equals(eyVar.f12334d)) {
            return false;
        }
        if ((this.f12331a & 8) != (eyVar.f12331a & 8)) {
            return false;
        }
        if (!this.f12335e.equals(eyVar.f12335e)) {
            return false;
        }
        if ((this.f12331a & 16) != (eyVar.f12331a & 16)) {
            return false;
        }
        if (this.f12336f != eyVar.f12336f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(eyVar.aO);
        }
        if (eyVar.aO == null || eyVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f12336f ? 1231 : 1237) + ((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12332b.hashCode()) * 31) + this.f12333c.hashCode()) * 31) + this.f12334d.hashCode()) * 31) + this.f12335e.hashCode()) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12331a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12332b);
        }
        if ((this.f12331a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12333c);
        }
        if ((this.f12331a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12334d);
        }
        if ((this.f12331a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12335e);
        }
        if ((this.f12331a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12336f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12331a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12332b);
        }
        if ((this.f12331a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12333c);
        }
        if ((this.f12331a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12334d);
        }
        if ((this.f12331a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12335e);
        }
        if ((this.f12331a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.d(5) + 1);
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
                    this.f12332b = aVar.f();
                    this.f12331a |= 1;
                    continue;
                case 18:
                    this.f12333c = aVar.f();
                    this.f12331a |= 2;
                    continue;
                case 26:
                    this.f12334d = aVar.f();
                    this.f12331a |= 4;
                    continue;
                case 34:
                    this.f12335e = aVar.f();
                    this.f12331a |= 8;
                    continue;
                case 40:
                    this.f12336f = aVar.e();
                    this.f12331a |= 16;
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
