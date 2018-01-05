package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bs extends C0758b {
    public int f11957a;
    public bk f11958b;
    public bk f11959c;
    public boolean f11960d;
    public bt f11961e;

    public bs() {
        this.f11957a = 0;
        this.f11958b = null;
        this.f11959c = null;
        this.f11960d = false;
        this.f11961e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        if (this.f11958b == null) {
            if (bsVar.f11958b != null) {
                return false;
            }
        } else if (!this.f11958b.equals(bsVar.f11958b)) {
            return false;
        }
        if (this.f11959c == null) {
            if (bsVar.f11959c != null) {
                return false;
            }
        } else if (!this.f11959c.equals(bsVar.f11959c)) {
            return false;
        }
        if ((this.f11957a & 1) != (bsVar.f11957a & 1)) {
            return false;
        }
        if (this.f11960d != bsVar.f11960d) {
            return false;
        }
        if (this.f11961e == null) {
            if (bsVar.f11961e != null) {
                return false;
            }
        } else if (!this.f11961e.equals(bsVar.f11961e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bsVar.aO);
        }
        if (bsVar.aO == null || bsVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bk bkVar = this.f11958b;
        hashCode = (bkVar == null ? 0 : bkVar.hashCode()) + (hashCode * 31);
        bkVar = this.f11959c;
        hashCode = (this.f11960d ? 1231 : 1237) + (((bkVar == null ? 0 : bkVar.hashCode()) + (hashCode * 31)) * 31);
        bt btVar = this.f11961e;
        hashCode = ((btVar == null ? 0 : btVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11958b != null) {
            codedOutputByteBufferNano.b(1, this.f11958b);
        }
        if (this.f11959c != null) {
            codedOutputByteBufferNano.b(2, this.f11959c);
        }
        if ((this.f11957a & 1) != 0) {
            codedOutputByteBufferNano.a(4, this.f11960d);
        }
        if (this.f11961e != null) {
            codedOutputByteBufferNano.b(5, this.f11961e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11958b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f11958b);
        }
        if (this.f11959c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f11959c);
        }
        if ((this.f11957a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if (this.f11961e != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f11961e);
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
                    if (this.f11958b == null) {
                        this.f11958b = new bk();
                    }
                    aVar.a(this.f11958b);
                    continue;
                case 18:
                    if (this.f11959c == null) {
                        this.f11959c = new bk();
                    }
                    aVar.a(this.f11959c);
                    continue;
                case 32:
                    this.f11960d = aVar.e();
                    this.f11957a |= 1;
                    continue;
                case 42:
                    if (this.f11961e == null) {
                        this.f11961e = new bt();
                    }
                    aVar.a(this.f11961e);
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
