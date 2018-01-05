package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class kt extends C0758b {
    public int f12958a;
    public String f12959b;
    public eu f12960c;
    public String f12961d;

    public kt() {
        this.f12958a = 0;
        this.f12959b = "";
        this.f12960c = null;
        this.f12961d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kt)) {
            return false;
        }
        kt ktVar = (kt) obj;
        if ((this.f12958a & 1) != (ktVar.f12958a & 1)) {
            return false;
        }
        if (!this.f12959b.equals(ktVar.f12959b)) {
            return false;
        }
        if (this.f12960c == null) {
            if (ktVar.f12960c != null) {
                return false;
            }
        } else if (!this.f12960c.equals(ktVar.f12960c)) {
            return false;
        }
        if ((this.f12958a & 2) != (ktVar.f12958a & 2)) {
            return false;
        }
        if (!this.f12961d.equals(ktVar.f12961d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ktVar.aO);
        }
        if (ktVar.aO == null || ktVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12959b.hashCode();
        eu euVar = this.f12960c;
        hashCode = ((((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31) + this.f12961d.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12958a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12959b);
        }
        if (this.f12960c != null) {
            codedOutputByteBufferNano.b(2, this.f12960c);
        }
        if ((this.f12958a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12961d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12958a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12959b);
        }
        if (this.f12960c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12960c);
        }
        if ((this.f12958a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f12961d);
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
                    this.f12959b = aVar.f();
                    this.f12958a |= 1;
                    continue;
                case 18:
                    if (this.f12960c == null) {
                        this.f12960c = new eu();
                    }
                    aVar.a(this.f12960c);
                    continue;
                case 26:
                    this.f12961d = aVar.f();
                    this.f12958a |= 2;
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
