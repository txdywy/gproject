package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ga extends C0758b {
    public int f12400a;
    public long f12401b;
    public String f12402c;
    public String f12403d;
    public eu f12404e;
    public cv f12405f;
    public String f12406g;

    public ga() {
        this.f12400a = 0;
        this.f12401b = 0;
        this.f12402c = "";
        this.f12403d = "";
        this.f12404e = null;
        this.f12405f = null;
        this.f12406g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        if ((this.f12400a & 1) != (gaVar.f12400a & 1)) {
            return false;
        }
        if (this.f12401b != gaVar.f12401b) {
            return false;
        }
        if ((this.f12400a & 2) != (gaVar.f12400a & 2)) {
            return false;
        }
        if (!this.f12402c.equals(gaVar.f12402c)) {
            return false;
        }
        if ((this.f12400a & 4) != (gaVar.f12400a & 4)) {
            return false;
        }
        if (!this.f12403d.equals(gaVar.f12403d)) {
            return false;
        }
        if (this.f12404e == null) {
            if (gaVar.f12404e != null) {
                return false;
            }
        } else if (!this.f12404e.equals(gaVar.f12404e)) {
            return false;
        }
        if (this.f12405f == null) {
            if (gaVar.f12405f != null) {
                return false;
            }
        } else if (!this.f12405f.equals(gaVar.f12405f)) {
            return false;
        }
        if ((this.f12400a & 8) != (gaVar.f12400a & 8)) {
            return false;
        }
        if (!this.f12406g.equals(gaVar.f12406g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gaVar.aO);
        }
        if (gaVar.aO == null || gaVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f12401b;
        hashCode = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12402c.hashCode()) * 31) + this.f12403d.hashCode();
        eu euVar = this.f12404e;
        hashCode = (euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31);
        cv cvVar = this.f12405f;
        hashCode = ((((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31) + this.f12406g.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12400a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f12401b);
        }
        if ((this.f12400a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12402c);
        }
        if ((this.f12400a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12403d);
        }
        if (this.f12404e != null) {
            codedOutputByteBufferNano.b(4, this.f12404e);
        }
        if (this.f12405f != null) {
            codedOutputByteBufferNano.b(5, this.f12405f);
        }
        if ((this.f12400a & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f12406g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12400a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f12401b);
        }
        if ((this.f12400a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12402c);
        }
        if ((this.f12400a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12403d);
        }
        if (this.f12404e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12404e);
        }
        if (this.f12405f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12405f);
        }
        if ((this.f12400a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f12406g);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12401b = aVar.j();
                    this.f12400a |= 1;
                    continue;
                case 18:
                    this.f12402c = aVar.f();
                    this.f12400a |= 2;
                    continue;
                case 26:
                    this.f12403d = aVar.f();
                    this.f12400a |= 4;
                    continue;
                case 34:
                    if (this.f12404e == null) {
                        this.f12404e = new eu();
                    }
                    aVar.a(this.f12404e);
                    continue;
                case 42:
                    if (this.f12405f == null) {
                        this.f12405f = new cv();
                    }
                    aVar.a(this.f12405f);
                    continue;
                case 50:
                    this.f12406g = aVar.f();
                    this.f12400a |= 8;
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
