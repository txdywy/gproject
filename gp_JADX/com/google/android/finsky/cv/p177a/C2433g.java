package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2433g extends C0758b {
    public int f12395a;
    public String f12396b;
    public fl f12397c;
    public C2448u f12398d;
    public boolean f12399e;

    public C2433g() {
        this.f12395a = 0;
        this.f12396b = "";
        this.f12397c = null;
        this.f12398d = null;
        this.f12399e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2433g)) {
            return false;
        }
        C2433g c2433g = (C2433g) obj;
        if ((this.f12395a & 1) != (c2433g.f12395a & 1)) {
            return false;
        }
        if (!this.f12396b.equals(c2433g.f12396b)) {
            return false;
        }
        if (this.f12397c == null) {
            if (c2433g.f12397c != null) {
                return false;
            }
        } else if (!this.f12397c.equals(c2433g.f12397c)) {
            return false;
        }
        if (this.f12398d == null) {
            if (c2433g.f12398d != null) {
                return false;
            }
        } else if (!this.f12398d.equals(c2433g.f12398d)) {
            return false;
        }
        if ((this.f12395a & 2) != (c2433g.f12395a & 2)) {
            return false;
        }
        if (this.f12399e != c2433g.f12399e) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2433g.aO);
        }
        if (c2433g.aO == null || c2433g.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12396b.hashCode();
        fl flVar = this.f12397c;
        hashCode = (flVar == null ? 0 : flVar.hashCode()) + (hashCode * 31);
        C2448u c2448u = this.f12398d;
        hashCode = ((this.f12399e ? 1231 : 1237) + (((c2448u == null ? 0 : c2448u.hashCode()) + (hashCode * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12395a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12396b);
        }
        if (this.f12397c != null) {
            codedOutputByteBufferNano.b(2, this.f12397c);
        }
        if (this.f12398d != null) {
            codedOutputByteBufferNano.b(3, this.f12398d);
        }
        if ((this.f12395a & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f12399e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12395a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12396b);
        }
        if (this.f12397c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12397c);
        }
        if (this.f12398d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12398d);
        }
        if ((this.f12395a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.d(4) + 1);
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
                    this.f12396b = aVar.f();
                    this.f12395a |= 1;
                    continue;
                case 18:
                    if (this.f12397c == null) {
                        this.f12397c = new fl();
                    }
                    aVar.a(this.f12397c);
                    continue;
                case 26:
                    if (this.f12398d == null) {
                        this.f12398d = new C2448u();
                    }
                    aVar.a(this.f12398d);
                    continue;
                case 32:
                    this.f12399e = aVar.e();
                    this.f12395a |= 2;
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
