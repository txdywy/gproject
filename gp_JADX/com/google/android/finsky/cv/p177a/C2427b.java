package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2427b extends C0758b {
    public int f11838a;
    public eu f11839b;
    public de f11840c;
    public gn f11841d;
    public cl f11842e;

    public C2427b() {
        this.f11838a = -1;
        this.f11838a = -1;
        this.f11839b = null;
        this.f11838a = -1;
        this.f11840c = null;
        this.f11838a = -1;
        this.f11841d = null;
        this.f11842e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2427b)) {
            return false;
        }
        C2427b c2427b = (C2427b) obj;
        if (this.f11839b == null) {
            if (c2427b.f11839b != null) {
                return false;
            }
        } else if (!this.f11839b.equals(c2427b.f11839b)) {
            return false;
        }
        if (this.f11840c == null) {
            if (c2427b.f11840c != null) {
                return false;
            }
        } else if (!this.f11840c.equals(c2427b.f11840c)) {
            return false;
        }
        if (this.f11841d == null) {
            if (c2427b.f11841d != null) {
                return false;
            }
        } else if (!this.f11841d.equals(c2427b.f11841d)) {
            return false;
        }
        if (this.f11842e == null) {
            if (c2427b.f11842e != null) {
                return false;
            }
        } else if (!this.f11842e.equals(c2427b.f11842e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2427b.aO);
        }
        if (c2427b.aO == null || c2427b.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        eu euVar = this.f11839b;
        if (this.f11838a != 0) {
            euVar = null;
        }
        hashCode = (hashCode * 31) + (euVar == null ? 0 : euVar.hashCode());
        de deVar = this.f11840c;
        if (this.f11838a != 1) {
            deVar = null;
        }
        hashCode = (hashCode * 31) + (deVar == null ? 0 : deVar.hashCode());
        gn gnVar = this.f11841d;
        if (this.f11838a != 2) {
            gnVar = null;
        }
        int hashCode2 = (gnVar == null ? 0 : gnVar.hashCode()) + (hashCode * 31);
        cl clVar = this.f11842e;
        hashCode2 = ((clVar == null ? 0 : clVar.hashCode()) + (hashCode2 * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode2 + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11838a == 0) {
            codedOutputByteBufferNano.b(1, this.f11839b);
        }
        if (this.f11842e != null) {
            codedOutputByteBufferNano.b(2, this.f11842e);
        }
        if (this.f11838a == 1) {
            codedOutputByteBufferNano.b(3, this.f11840c);
        }
        if (this.f11838a == 2) {
            codedOutputByteBufferNano.b(4, this.f11841d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11838a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f11839b);
        }
        if (this.f11842e != null) {
            b += CodedOutputByteBufferNano.d(2, this.f11842e);
        }
        if (this.f11838a == 1) {
            b += CodedOutputByteBufferNano.d(3, this.f11840c);
        }
        if (this.f11838a == 2) {
            return b + CodedOutputByteBufferNano.d(4, this.f11841d);
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
                    if (this.f11839b == null) {
                        this.f11839b = new eu();
                    }
                    aVar.a(this.f11839b);
                    this.f11838a = 0;
                    continue;
                case 18:
                    if (this.f11842e == null) {
                        this.f11842e = new cl();
                    }
                    aVar.a(this.f11842e);
                    continue;
                case 26:
                    if (this.f11840c == null) {
                        this.f11840c = new de();
                    }
                    aVar.a(this.f11840c);
                    this.f11838a = 1;
                    continue;
                case 34:
                    if (this.f11841d == null) {
                        this.f11841d = new gn();
                    }
                    aVar.a(this.f11841d);
                    this.f11838a = 2;
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
