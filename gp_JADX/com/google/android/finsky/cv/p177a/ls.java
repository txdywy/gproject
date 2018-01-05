package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ls extends C0758b {
    public C2453z f13054a;
    public ie f13055b;
    public C2443p f13056c;
    public C2442o f13057d;

    public ls() {
        this.f13054a = null;
        this.f13055b = null;
        this.f13056c = null;
        this.f13057d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ls)) {
            return false;
        }
        ls lsVar = (ls) obj;
        if (this.f13054a == null) {
            if (lsVar.f13054a != null) {
                return false;
            }
        } else if (!this.f13054a.equals(lsVar.f13054a)) {
            return false;
        }
        if (this.f13055b == null) {
            if (lsVar.f13055b != null) {
                return false;
            }
        } else if (!this.f13055b.equals(lsVar.f13055b)) {
            return false;
        }
        if (this.f13056c == null) {
            if (lsVar.f13056c != null) {
                return false;
            }
        } else if (!this.f13056c.equals(lsVar.f13056c)) {
            return false;
        }
        if (this.f13057d == null) {
            if (lsVar.f13057d != null) {
                return false;
            }
        } else if (!this.f13057d.equals(lsVar.f13057d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lsVar.aO);
        }
        if (lsVar.aO == null || lsVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2453z c2453z = this.f13054a;
        hashCode = (c2453z == null ? 0 : c2453z.hashCode()) + (hashCode * 31);
        ie ieVar = this.f13055b;
        hashCode = (ieVar == null ? 0 : ieVar.hashCode()) + (hashCode * 31);
        C2443p c2443p = this.f13056c;
        hashCode = (c2443p == null ? 0 : c2443p.hashCode()) + (hashCode * 31);
        C2442o c2442o = this.f13057d;
        hashCode = ((c2442o == null ? 0 : c2442o.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13054a != null) {
            codedOutputByteBufferNano.b(1, this.f13054a);
        }
        if (this.f13055b != null) {
            codedOutputByteBufferNano.b(2, this.f13055b);
        }
        if (this.f13056c != null) {
            codedOutputByteBufferNano.b(3, this.f13056c);
        }
        if (this.f13057d != null) {
            codedOutputByteBufferNano.b(4, this.f13057d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13054a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f13054a);
        }
        if (this.f13055b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f13055b);
        }
        if (this.f13056c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f13056c);
        }
        if (this.f13057d != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f13057d);
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
                    if (this.f13054a == null) {
                        this.f13054a = new C2453z();
                    }
                    aVar.a(this.f13054a);
                    continue;
                case 18:
                    if (this.f13055b == null) {
                        this.f13055b = new ie();
                    }
                    aVar.a(this.f13055b);
                    continue;
                case 26:
                    if (this.f13056c == null) {
                        this.f13056c = new C2443p();
                    }
                    aVar.a(this.f13056c);
                    continue;
                case 34:
                    if (this.f13057d == null) {
                        this.f13057d = new C2442o();
                    }
                    aVar.a(this.f13057d);
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
