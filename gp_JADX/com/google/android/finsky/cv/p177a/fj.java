package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class fj extends C0758b {
    public int f12366a;
    public bd f12367b;
    public long f12368c;
    public String f12369d;
    public String f12370e;
    public String f12371f;

    public fj() {
        this.f12366a = 0;
        this.f12367b = null;
        this.f12368c = 0;
        this.f12369d = "";
        this.f12370e = "";
        this.f12371f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj;
        if (this.f12367b == null) {
            if (fjVar.f12367b != null) {
                return false;
            }
        } else if (!this.f12367b.equals(fjVar.f12367b)) {
            return false;
        }
        if ((this.f12366a & 1) != (fjVar.f12366a & 1)) {
            return false;
        }
        if (this.f12368c != fjVar.f12368c) {
            return false;
        }
        if ((this.f12366a & 2) != (fjVar.f12366a & 2)) {
            return false;
        }
        if (!this.f12369d.equals(fjVar.f12369d)) {
            return false;
        }
        if ((this.f12366a & 4) != (fjVar.f12366a & 4)) {
            return false;
        }
        if (!this.f12370e.equals(fjVar.f12370e)) {
            return false;
        }
        if ((this.f12366a & 8) != (fjVar.f12366a & 8)) {
            return false;
        }
        if (!this.f12371f.equals(fjVar.f12371f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fjVar.aO);
        }
        if (fjVar.aO == null || fjVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bd bdVar = this.f12367b;
        hashCode = (bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31);
        long j = this.f12368c;
        hashCode = ((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12369d.hashCode()) * 31) + this.f12370e.hashCode()) * 31) + this.f12371f.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12367b != null) {
            codedOutputByteBufferNano.b(1, this.f12367b);
        }
        if ((this.f12366a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12368c);
        }
        if ((this.f12366a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12369d);
        }
        if ((this.f12366a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12370e);
        }
        if ((this.f12366a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12371f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12367b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12367b);
        }
        if ((this.f12366a & 1) != 0) {
            b += CodedOutputByteBufferNano.e(2, this.f12368c);
        }
        if ((this.f12366a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12369d);
        }
        if ((this.f12366a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12370e);
        }
        if ((this.f12366a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f12371f);
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
                    if (this.f12367b == null) {
                        this.f12367b = new bd();
                    }
                    aVar.a(this.f12367b);
                    continue;
                case 16:
                    this.f12368c = aVar.j();
                    this.f12366a |= 1;
                    continue;
                case 26:
                    this.f12369d = aVar.f();
                    this.f12366a |= 2;
                    continue;
                case 34:
                    this.f12370e = aVar.f();
                    this.f12366a |= 4;
                    continue;
                case 42:
                    this.f12371f = aVar.f();
                    this.f12366a |= 8;
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
