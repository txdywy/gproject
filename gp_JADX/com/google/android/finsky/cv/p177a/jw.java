package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jw extends C0758b {
    public int f12827a;
    public String f12828b;
    public fl f12829c;
    public String f12830d;
    public int f12831e;
    public String f12832f;
    public C2448u f12833g;
    public ac f12834h;
    public boolean f12835i;

    public final boolean bB_() {
        return (this.f12827a & 8) != 0;
    }

    public jw() {
        this.f12827a = 0;
        this.f12828b = "";
        this.f12829c = null;
        this.f12830d = "";
        this.f12831e = 0;
        this.f12832f = "";
        this.f12833g = null;
        this.f12834h = null;
        this.f12835i = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        if ((this.f12827a & 1) != (jwVar.f12827a & 1)) {
            return false;
        }
        if (!this.f12828b.equals(jwVar.f12828b)) {
            return false;
        }
        if (this.f12829c == null) {
            if (jwVar.f12829c != null) {
                return false;
            }
        } else if (!this.f12829c.equals(jwVar.f12829c)) {
            return false;
        }
        if ((this.f12827a & 2) != (jwVar.f12827a & 2)) {
            return false;
        }
        if (!this.f12830d.equals(jwVar.f12830d)) {
            return false;
        }
        if ((this.f12827a & 4) != (jwVar.f12827a & 4)) {
            return false;
        }
        if (this.f12831e != jwVar.f12831e) {
            return false;
        }
        if ((this.f12827a & 8) != (jwVar.f12827a & 8)) {
            return false;
        }
        if (!this.f12832f.equals(jwVar.f12832f)) {
            return false;
        }
        if (this.f12833g == null) {
            if (jwVar.f12833g != null) {
                return false;
            }
        } else if (!this.f12833g.equals(jwVar.f12833g)) {
            return false;
        }
        if (this.f12834h == null) {
            if (jwVar.f12834h != null) {
                return false;
            }
        } else if (!this.f12834h.equals(jwVar.f12834h)) {
            return false;
        }
        if ((this.f12827a & 16) != (jwVar.f12827a & 16)) {
            return false;
        }
        if (this.f12835i != jwVar.f12835i) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jwVar.aO);
        }
        if (jwVar.aO == null || jwVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12828b.hashCode();
        fl flVar = this.f12829c;
        hashCode = (((((((flVar == null ? 0 : flVar.hashCode()) + (hashCode * 31)) * 31) + this.f12830d.hashCode()) * 31) + this.f12831e) * 31) + this.f12832f.hashCode();
        C2448u c2448u = this.f12833g;
        hashCode = (c2448u == null ? 0 : c2448u.hashCode()) + (hashCode * 31);
        ac acVar = this.f12834h;
        hashCode = ((this.f12835i ? 1231 : 1237) + (((acVar == null ? 0 : acVar.hashCode()) + (hashCode * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12827a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12828b);
        }
        if (this.f12829c != null) {
            codedOutputByteBufferNano.b(2, this.f12829c);
        }
        if ((this.f12827a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12830d);
        }
        if ((this.f12827a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12831e);
        }
        if ((this.f12827a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12832f);
        }
        if (this.f12833g != null) {
            codedOutputByteBufferNano.b(6, this.f12833g);
        }
        if (this.f12834h != null) {
            codedOutputByteBufferNano.b(7, this.f12834h);
        }
        if ((this.f12827a & 16) != 0) {
            codedOutputByteBufferNano.a(8, this.f12835i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12827a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12828b);
        }
        if (this.f12829c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12829c);
        }
        if ((this.f12827a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12830d);
        }
        if ((this.f12827a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f12831e);
        }
        if ((this.f12827a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12832f);
        }
        if (this.f12833g != null) {
            b += CodedOutputByteBufferNano.d(6, this.f12833g);
        }
        if (this.f12834h != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12834h);
        }
        if ((this.f12827a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.d(8) + 1);
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
                    this.f12828b = aVar.f();
                    this.f12827a |= 1;
                    continue;
                case 18:
                    if (this.f12829c == null) {
                        this.f12829c = new fl();
                    }
                    aVar.a(this.f12829c);
                    continue;
                case 26:
                    this.f12830d = aVar.f();
                    this.f12827a |= 2;
                    continue;
                case 32:
                    this.f12831e = aVar.i();
                    this.f12827a |= 4;
                    continue;
                case 42:
                    this.f12832f = aVar.f();
                    this.f12827a |= 8;
                    continue;
                case 50:
                    if (this.f12833g == null) {
                        this.f12833g = new C2448u();
                    }
                    aVar.a(this.f12833g);
                    continue;
                case 58:
                    if (this.f12834h == null) {
                        this.f12834h = new ac();
                    }
                    aVar.a(this.f12834h);
                    continue;
                case 64:
                    this.f12835i = aVar.e();
                    this.f12827a |= 16;
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
