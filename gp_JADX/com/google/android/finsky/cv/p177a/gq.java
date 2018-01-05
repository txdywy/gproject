package com.google.android.finsky.cv.p177a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import g.a.a.a;

public final class gq extends C0758b {
    public int f12475a;
    public long f12476b;
    public long f12477c;
    public long f12478d;
    public boolean f12479e;
    public boolean f12480f;
    public long f12481g;
    public long f12482h;
    public long f12483i;
    public bu f12484j;
    public boolean f12485k;
    public boolean f12486l;
    public bq f12487m;
    public eh f12488n;
    public bj f12489o;
    public int f12490p;
    public ax f12491q;
    public boolean f12492r;
    public a f12493s;

    public gq() {
        this.f12475a = 0;
        this.f12476b = 0;
        this.f12477c = 0;
        this.f12478d = 0;
        this.f12479e = false;
        this.f12480f = false;
        this.f12481g = 0;
        this.f12482h = 0;
        this.f12483i = 0;
        this.f12484j = null;
        this.f12485k = false;
        this.f12486l = false;
        this.f12487m = null;
        this.f12488n = null;
        this.f12489o = null;
        this.f12490p = 1;
        this.f12491q = null;
        this.f12492r = false;
        this.f12493s = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gq)) {
            return false;
        }
        gq gqVar = (gq) obj;
        if ((this.f12475a & 1) != (gqVar.f12475a & 1)) {
            return false;
        }
        if (this.f12476b != gqVar.f12476b) {
            return false;
        }
        if ((this.f12475a & 2) != (gqVar.f12475a & 2)) {
            return false;
        }
        if (this.f12477c != gqVar.f12477c) {
            return false;
        }
        if ((this.f12475a & 4) != (gqVar.f12475a & 4)) {
            return false;
        }
        if (this.f12478d != gqVar.f12478d) {
            return false;
        }
        if ((this.f12475a & 8) != (gqVar.f12475a & 8)) {
            return false;
        }
        if (this.f12479e != gqVar.f12479e) {
            return false;
        }
        if ((this.f12475a & 16) != (gqVar.f12475a & 16)) {
            return false;
        }
        if (this.f12480f != gqVar.f12480f) {
            return false;
        }
        if ((this.f12475a & 32) != (gqVar.f12475a & 32)) {
            return false;
        }
        if (this.f12481g != gqVar.f12481g) {
            return false;
        }
        if ((this.f12475a & 64) != (gqVar.f12475a & 64)) {
            return false;
        }
        if (this.f12482h != gqVar.f12482h) {
            return false;
        }
        if ((this.f12475a & 128) != (gqVar.f12475a & 128)) {
            return false;
        }
        if (this.f12483i != gqVar.f12483i) {
            return false;
        }
        if (this.f12484j == null) {
            if (gqVar.f12484j != null) {
                return false;
            }
        } else if (!this.f12484j.equals(gqVar.f12484j)) {
            return false;
        }
        if ((this.f12475a & 256) != (gqVar.f12475a & 256)) {
            return false;
        }
        if (this.f12485k != gqVar.f12485k) {
            return false;
        }
        if ((this.f12475a & 512) != (gqVar.f12475a & 512)) {
            return false;
        }
        if (this.f12486l != gqVar.f12486l) {
            return false;
        }
        if (this.f12487m == null) {
            if (gqVar.f12487m != null) {
                return false;
            }
        } else if (!this.f12487m.equals(gqVar.f12487m)) {
            return false;
        }
        if (this.f12488n == null) {
            if (gqVar.f12488n != null) {
                return false;
            }
        } else if (!this.f12488n.equals(gqVar.f12488n)) {
            return false;
        }
        if (this.f12489o == null) {
            if (gqVar.f12489o != null) {
                return false;
            }
        } else if (!this.f12489o.equals(gqVar.f12489o)) {
            return false;
        }
        if ((this.f12475a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (gqVar.f12475a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (this.f12490p != gqVar.f12490p) {
            return false;
        }
        if (this.f12491q == null) {
            if (gqVar.f12491q != null) {
                return false;
            }
        } else if (!this.f12491q.equals(gqVar.f12491q)) {
            return false;
        }
        if ((this.f12475a & eq.FLAG_MOVED) != (gqVar.f12475a & eq.FLAG_MOVED)) {
            return false;
        }
        if (this.f12492r != gqVar.f12492r) {
            return false;
        }
        if (this.f12493s == null) {
            if (gqVar.f12493s != null) {
                return false;
            }
        } else if (!this.f12493s.equals(gqVar.f12493s)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gqVar.aO);
        }
        if (gqVar.aO == null || gqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f12476b;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12477c;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12478d;
        int i3 = ((this.f12479e ? 1231 : 1237) + (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        if (this.f12480f) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode += i3;
        j = this.f12481g;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12482h;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12483i;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        bu buVar = this.f12484j;
        i3 = ((buVar == null ? 0 : buVar.hashCode()) + (hashCode * 31)) * 31;
        if (this.f12485k) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        i3 = (hashCode + i3) * 31;
        if (this.f12486l) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode += i3;
        bq bqVar = this.f12487m;
        hashCode = (bqVar == null ? 0 : bqVar.hashCode()) + (hashCode * 31);
        eh ehVar = this.f12488n;
        hashCode = (ehVar == null ? 0 : ehVar.hashCode()) + (hashCode * 31);
        bj bjVar = this.f12489o;
        hashCode = (((bjVar == null ? 0 : bjVar.hashCode()) + (hashCode * 31)) * 31) + this.f12490p;
        ax axVar = this.f12491q;
        hashCode = ((axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31)) * 31;
        if (!this.f12492r) {
            i = 1237;
        }
        hashCode += i;
        a aVar = this.f12493s;
        hashCode = ((aVar == null ? 0 : aVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12475a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f12476b);
        }
        if ((this.f12475a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f12477c);
        }
        if ((this.f12475a & 8) != 0) {
            codedOutputByteBufferNano.a(3, this.f12479e);
        }
        if ((this.f12475a & 64) != 0) {
            codedOutputByteBufferNano.b(4, this.f12482h);
        }
        if ((this.f12475a & 128) != 0) {
            codedOutputByteBufferNano.b(5, this.f12483i);
        }
        if (this.f12484j != null) {
            codedOutputByteBufferNano.b(6, this.f12484j);
        }
        if ((this.f12475a & 256) != 0) {
            codedOutputByteBufferNano.a(7, this.f12485k);
        }
        if ((this.f12475a & 512) != 0) {
            codedOutputByteBufferNano.a(8, this.f12486l);
        }
        if (this.f12487m != null) {
            codedOutputByteBufferNano.b(9, this.f12487m);
        }
        if (this.f12488n != null) {
            codedOutputByteBufferNano.b(10, this.f12488n);
        }
        if (this.f12489o != null) {
            codedOutputByteBufferNano.b(11, this.f12489o);
        }
        if ((this.f12475a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(12, this.f12490p);
        }
        if (this.f12493s != null) {
            codedOutputByteBufferNano.b(13, this.f12493s);
        }
        if ((this.f12475a & 32) != 0) {
            codedOutputByteBufferNano.b(14, this.f12481g);
        }
        if (this.f12491q != null) {
            codedOutputByteBufferNano.b(16, this.f12491q);
        }
        if ((this.f12475a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(17, this.f12492r);
        }
        if ((this.f12475a & 4) != 0) {
            codedOutputByteBufferNano.b(18, this.f12478d);
        }
        if ((this.f12475a & 16) != 0) {
            codedOutputByteBufferNano.a(19, this.f12480f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12475a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f12476b);
        }
        if ((this.f12475a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f12477c);
        }
        if ((this.f12475a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f12475a & 64) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f12482h);
        }
        if ((this.f12475a & 128) != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f12483i);
        }
        if (this.f12484j != null) {
            b += CodedOutputByteBufferNano.d(6, this.f12484j);
        }
        if ((this.f12475a & 256) != 0) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if ((this.f12475a & 512) != 0) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if (this.f12487m != null) {
            b += CodedOutputByteBufferNano.d(9, this.f12487m);
        }
        if (this.f12488n != null) {
            b += CodedOutputByteBufferNano.d(10, this.f12488n);
        }
        if (this.f12489o != null) {
            b += CodedOutputByteBufferNano.d(11, this.f12489o);
        }
        if ((this.f12475a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.d(12, this.f12490p);
        }
        if (this.f12493s != null) {
            b += CodedOutputByteBufferNano.d(13, this.f12493s);
        }
        if ((this.f12475a & 32) != 0) {
            b += CodedOutputByteBufferNano.f(14, this.f12481g);
        }
        if (this.f12491q != null) {
            b += CodedOutputByteBufferNano.d(16, this.f12491q);
        }
        if ((this.f12475a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.d(17) + 1;
        }
        if ((this.f12475a & 4) != 0) {
            b += CodedOutputByteBufferNano.f(18, this.f12478d);
        }
        if ((this.f12475a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.d(19) + 1);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12476b = aVar.j();
                    this.f12475a |= 1;
                    continue;
                case 16:
                    this.f12477c = aVar.j();
                    this.f12475a |= 2;
                    continue;
                case 24:
                    this.f12479e = aVar.e();
                    this.f12475a |= 8;
                    continue;
                case 32:
                    this.f12482h = aVar.j();
                    this.f12475a |= 64;
                    continue;
                case 40:
                    this.f12483i = aVar.j();
                    this.f12475a |= 128;
                    continue;
                case 50:
                    if (this.f12484j == null) {
                        this.f12484j = new bu();
                    }
                    aVar.a(this.f12484j);
                    continue;
                case 56:
                    this.f12485k = aVar.e();
                    this.f12475a |= 256;
                    continue;
                case 64:
                    this.f12486l = aVar.e();
                    this.f12475a |= 512;
                    continue;
                case 74:
                    if (this.f12487m == null) {
                        this.f12487m = new bq();
                    }
                    aVar.a(this.f12487m);
                    continue;
                case 82:
                    if (this.f12488n == null) {
                        this.f12488n = new eh();
                    }
                    aVar.a(this.f12488n);
                    continue;
                case 90:
                    if (this.f12489o == null) {
                        this.f12489o = new bj();
                    }
                    aVar.a(this.f12489o);
                    continue;
                case 96:
                    this.f12490p = aVar.i();
                    this.f12475a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 106:
                    if (this.f12493s == null) {
                        this.f12493s = new a();
                    }
                    aVar.a(this.f12493s);
                    continue;
                case 112:
                    this.f12481g = aVar.j();
                    this.f12475a |= 32;
                    continue;
                case 130:
                    if (this.f12491q == null) {
                        this.f12491q = new ax();
                    }
                    aVar.a(this.f12491q);
                    continue;
                case 136:
                    this.f12492r = aVar.e();
                    this.f12475a |= eq.FLAG_MOVED;
                    continue;
                case HprofParser.ROOT_UNREACHABLE /*144*/:
                    this.f12478d = aVar.j();
                    this.f12475a |= 4;
                    continue;
                case 152:
                    this.f12480f = aVar.e();
                    this.f12475a |= 16;
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
