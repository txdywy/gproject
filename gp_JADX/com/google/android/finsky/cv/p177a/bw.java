package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class bw extends C0758b {
    public int f11970a;
    public bz f11971b;
    public bz f11972c;
    public boolean f11973d;
    public boolean f11974e;
    public String f11975f;
    public bs f11976g;
    public ax[] f11977h;
    public by f11978i;
    public bz f11979j;
    public bx f11980k;
    public boolean f11981l;
    public long f11982m;
    public String f11983n;
    public long f11984o;
    public boolean f11985p;

    public bw() {
        this.f11970a = 0;
        this.f11971b = null;
        this.f11972c = null;
        this.f11973d = false;
        this.f11974e = false;
        this.f11975f = "";
        this.f11976g = null;
        this.f11977h = ax.aG_();
        this.f11978i = null;
        this.f11979j = null;
        this.f11980k = null;
        this.f11981l = false;
        this.f11982m = 0;
        this.f11983n = "";
        this.f11984o = 0;
        this.f11985p = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        if (this.f11971b == null) {
            if (bwVar.f11971b != null) {
                return false;
            }
        } else if (!this.f11971b.equals(bwVar.f11971b)) {
            return false;
        }
        if (this.f11972c == null) {
            if (bwVar.f11972c != null) {
                return false;
            }
        } else if (!this.f11972c.equals(bwVar.f11972c)) {
            return false;
        }
        if ((this.f11970a & 1) != (bwVar.f11970a & 1)) {
            return false;
        }
        if (this.f11973d != bwVar.f11973d) {
            return false;
        }
        if ((this.f11970a & 2) != (bwVar.f11970a & 2)) {
            return false;
        }
        if (this.f11974e != bwVar.f11974e) {
            return false;
        }
        if ((this.f11970a & 4) != (bwVar.f11970a & 4)) {
            return false;
        }
        if (!this.f11975f.equals(bwVar.f11975f)) {
            return false;
        }
        if (this.f11976g == null) {
            if (bwVar.f11976g != null) {
                return false;
            }
        } else if (!this.f11976g.equals(bwVar.f11976g)) {
            return false;
        }
        if (!h.a(this.f11977h, bwVar.f11977h)) {
            return false;
        }
        if (this.f11978i == null) {
            if (bwVar.f11978i != null) {
                return false;
            }
        } else if (!this.f11978i.equals(bwVar.f11978i)) {
            return false;
        }
        if (this.f11979j == null) {
            if (bwVar.f11979j != null) {
                return false;
            }
        } else if (!this.f11979j.equals(bwVar.f11979j)) {
            return false;
        }
        if (this.f11980k == null) {
            if (bwVar.f11980k != null) {
                return false;
            }
        } else if (!this.f11980k.equals(bwVar.f11980k)) {
            return false;
        }
        if ((this.f11970a & 8) != (bwVar.f11970a & 8)) {
            return false;
        }
        if (this.f11981l != bwVar.f11981l) {
            return false;
        }
        if ((this.f11970a & 16) != (bwVar.f11970a & 16)) {
            return false;
        }
        if (this.f11982m != bwVar.f11982m) {
            return false;
        }
        if ((this.f11970a & 32) != (bwVar.f11970a & 32)) {
            return false;
        }
        if (!this.f11983n.equals(bwVar.f11983n)) {
            return false;
        }
        if ((this.f11970a & 64) != (bwVar.f11970a & 64)) {
            return false;
        }
        if (this.f11984o != bwVar.f11984o) {
            return false;
        }
        if ((this.f11970a & 128) != (bwVar.f11970a & 128)) {
            return false;
        }
        if (this.f11985p != bwVar.f11985p) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bwVar.aO);
        }
        if (bwVar.aO == null || bwVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bz bzVar = this.f11971b;
        hashCode = (bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31);
        bzVar = this.f11972c;
        int hashCode2 = ((bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31)) * 31;
        if (this.f11973d) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11974e) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode = ((hashCode + hashCode2) * 31) + this.f11975f.hashCode();
        bs bsVar = this.f11976g;
        hashCode = (((bsVar == null ? 0 : bsVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f11977h);
        by byVar = this.f11978i;
        hashCode = (byVar == null ? 0 : byVar.hashCode()) + (hashCode * 31);
        bzVar = this.f11979j;
        hashCode = (bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31);
        bx bxVar = this.f11980k;
        hashCode2 = ((bxVar == null ? 0 : bxVar.hashCode()) + (hashCode * 31)) * 31;
        if (this.f11981l) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode += hashCode2;
        long j = this.f11982m;
        hashCode = (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11983n.hashCode();
        j = this.f11984o;
        hashCode = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (!this.f11985p) {
            i = 1237;
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11971b != null) {
            codedOutputByteBufferNano.b(1, this.f11971b);
        }
        if (this.f11972c != null) {
            codedOutputByteBufferNano.b(2, this.f11972c);
        }
        if ((this.f11970a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11975f);
        }
        if (this.f11976g != null) {
            codedOutputByteBufferNano.b(4, this.f11976g);
        }
        if (this.f11977h != null && this.f11977h.length > 0) {
            for (C0757i c0757i : this.f11977h) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(5, c0757i);
                }
            }
        }
        if (this.f11979j != null) {
            codedOutputByteBufferNano.b(6, this.f11979j);
        }
        if ((this.f11970a & 8) != 0) {
            codedOutputByteBufferNano.a(7, this.f11981l);
        }
        if ((this.f11970a & 16) != 0) {
            codedOutputByteBufferNano.b(8, this.f11982m);
        }
        if ((this.f11970a & 32) != 0) {
            codedOutputByteBufferNano.a(9, this.f11983n);
        }
        if ((this.f11970a & 64) != 0) {
            codedOutputByteBufferNano.b(10, this.f11984o);
        }
        if ((this.f11970a & 2) != 0) {
            codedOutputByteBufferNano.a(11, this.f11974e);
        }
        if (this.f11978i != null) {
            codedOutputByteBufferNano.b(12, this.f11978i);
        }
        if (this.f11980k != null) {
            codedOutputByteBufferNano.b(13, this.f11980k);
        }
        if ((this.f11970a & 128) != 0) {
            codedOutputByteBufferNano.a(14, this.f11985p);
        }
        if ((this.f11970a & 1) != 0) {
            codedOutputByteBufferNano.a(15, this.f11973d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11971b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f11971b);
        }
        if (this.f11972c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f11972c);
        }
        if ((this.f11970a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11975f);
        }
        if (this.f11976g != null) {
            b += CodedOutputByteBufferNano.d(4, this.f11976g);
        }
        if (this.f11977h != null && this.f11977h.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f11977h) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(5, c0757i);
                }
            }
            b = i;
        }
        if (this.f11979j != null) {
            b += CodedOutputByteBufferNano.d(6, this.f11979j);
        }
        if ((this.f11970a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if ((this.f11970a & 16) != 0) {
            b += CodedOutputByteBufferNano.f(8, this.f11982m);
        }
        if ((this.f11970a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f11983n);
        }
        if ((this.f11970a & 64) != 0) {
            b += CodedOutputByteBufferNano.f(10, this.f11984o);
        }
        if ((this.f11970a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(11) + 1;
        }
        if (this.f11978i != null) {
            b += CodedOutputByteBufferNano.d(12, this.f11978i);
        }
        if (this.f11980k != null) {
            b += CodedOutputByteBufferNano.d(13, this.f11980k);
        }
        if ((this.f11970a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(14) + 1;
        }
        if ((this.f11970a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(15) + 1);
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
                    if (this.f11971b == null) {
                        this.f11971b = new bz();
                    }
                    aVar.a(this.f11971b);
                    continue;
                case 18:
                    if (this.f11972c == null) {
                        this.f11972c = new bz();
                    }
                    aVar.a(this.f11972c);
                    continue;
                case 26:
                    this.f11975f = aVar.f();
                    this.f11970a |= 4;
                    continue;
                case 34:
                    if (this.f11976g == null) {
                        this.f11976g = new bs();
                    }
                    aVar.a(this.f11976g);
                    continue;
                case 42:
                    int a2 = l.a(aVar, 42);
                    a = this.f11977h == null ? 0 : this.f11977h.length;
                    Object obj = new ax[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11977h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ax();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ax();
                    aVar.a(obj[a]);
                    this.f11977h = obj;
                    continue;
                case 50:
                    if (this.f11979j == null) {
                        this.f11979j = new bz();
                    }
                    aVar.a(this.f11979j);
                    continue;
                case 56:
                    this.f11981l = aVar.e();
                    this.f11970a |= 8;
                    continue;
                case 64:
                    this.f11982m = aVar.j();
                    this.f11970a |= 16;
                    continue;
                case 74:
                    this.f11983n = aVar.f();
                    this.f11970a |= 32;
                    continue;
                case 80:
                    this.f11984o = aVar.j();
                    this.f11970a |= 64;
                    continue;
                case 88:
                    this.f11974e = aVar.e();
                    this.f11970a |= 2;
                    continue;
                case 98:
                    if (this.f11978i == null) {
                        this.f11978i = new by();
                    }
                    aVar.a(this.f11978i);
                    continue;
                case 106:
                    if (this.f11980k == null) {
                        this.f11980k = new bx();
                    }
                    aVar.a(this.f11980k);
                    continue;
                case 112:
                    this.f11985p = aVar.e();
                    this.f11970a |= 128;
                    continue;
                case 120:
                    this.f11973d = aVar.e();
                    this.f11970a |= 1;
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
