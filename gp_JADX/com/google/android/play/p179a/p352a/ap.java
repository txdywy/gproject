package com.google.android.play.p179a.p352a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Arrays;

public final class ap extends C0758b {
    public static volatile ap[] f30845a;
    public int f30846b;
    public long f30847c;
    public String f30848d;
    public int f30849e;
    public int f30850f;
    public boolean f30851g;
    public al[] f30852h;
    public byte[] f30853i;
    public byte[] f30854j;
    public String f30855k;
    public String f30856l;
    public ad f30857m;
    public long f30858n;
    public ar f30859o;
    public String f30860p;
    public ag f30861q;
    public ao f30862r;
    public boolean f30863s;
    public long f30864t;

    public static ap[] m28591a() {
        if (f30845a == null) {
            synchronized (h.b) {
                if (f30845a == null) {
                    f30845a = new ap[0];
                }
            }
        }
        return f30845a;
    }

    public final ap m28592a(long j) {
        this.f30846b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.f30864t = j;
        return this;
    }

    public ap() {
        m28596c();
    }

    public final ap m28596c() {
        this.f30846b = 0;
        this.f30847c = 0;
        this.f30848d = "";
        this.f30849e = 0;
        this.f30850f = 0;
        this.f30851g = false;
        this.f30852h = al.m28572a();
        this.f30853i = l.l;
        this.f30854j = l.l;
        this.f30855k = "";
        this.f30856l = "";
        this.f30857m = null;
        this.f30858n = 180000;
        this.f30859o = null;
        this.f30860p = "";
        this.f30861q = null;
        this.f30862r = null;
        this.f30863s = false;
        this.f30864t = 0;
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        if ((this.f30846b & 1) != (apVar.f30846b & 1)) {
            return false;
        }
        if (this.f30847c != apVar.f30847c) {
            return false;
        }
        if ((this.f30846b & 2) != (apVar.f30846b & 2)) {
            return false;
        }
        if (!this.f30848d.equals(apVar.f30848d)) {
            return false;
        }
        if ((this.f30846b & 4) != (apVar.f30846b & 4)) {
            return false;
        }
        if (this.f30849e != apVar.f30849e) {
            return false;
        }
        if ((this.f30846b & 8) != (apVar.f30846b & 8)) {
            return false;
        }
        if (this.f30850f != apVar.f30850f) {
            return false;
        }
        if ((this.f30846b & 16) != (apVar.f30846b & 16)) {
            return false;
        }
        if (this.f30851g != apVar.f30851g) {
            return false;
        }
        if (!h.a(this.f30852h, apVar.f30852h)) {
            return false;
        }
        if ((this.f30846b & 32) != (apVar.f30846b & 32)) {
            return false;
        }
        if (!Arrays.equals(this.f30853i, apVar.f30853i)) {
            return false;
        }
        if ((this.f30846b & 64) != (apVar.f30846b & 64)) {
            return false;
        }
        if (!Arrays.equals(this.f30854j, apVar.f30854j)) {
            return false;
        }
        if ((this.f30846b & 128) != (apVar.f30846b & 128)) {
            return false;
        }
        if (!this.f30855k.equals(apVar.f30855k)) {
            return false;
        }
        if ((this.f30846b & 256) != (apVar.f30846b & 256)) {
            return false;
        }
        if (!this.f30856l.equals(apVar.f30856l)) {
            return false;
        }
        if (this.f30857m == null) {
            if (apVar.f30857m != null) {
                return false;
            }
        } else if (!this.f30857m.equals(apVar.f30857m)) {
            return false;
        }
        if ((this.f30846b & 512) != (apVar.f30846b & 512)) {
            return false;
        }
        if (this.f30858n != apVar.f30858n) {
            return false;
        }
        if (this.f30859o == null) {
            if (apVar.f30859o != null) {
                return false;
            }
        } else if (!this.f30859o.equals(apVar.f30859o)) {
            return false;
        }
        if ((this.f30846b & MemoryMappedFileBuffer.DEFAULT_PADDING) != (apVar.f30846b & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f30860p.equals(apVar.f30860p)) {
            return false;
        }
        if (this.f30861q == null) {
            if (apVar.f30861q != null) {
                return false;
            }
        } else if (!this.f30861q.equals(apVar.f30861q)) {
            return false;
        }
        if (this.f30862r == null) {
            if (apVar.f30862r != null) {
                return false;
            }
        } else if (!this.f30862r.equals(apVar.f30862r)) {
            return false;
        }
        if ((this.f30846b & eq.FLAG_MOVED) != (apVar.f30846b & eq.FLAG_MOVED)) {
            return false;
        }
        if (this.f30863s != apVar.f30863s) {
            return false;
        }
        if ((this.f30846b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (apVar.f30846b & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (this.f30864t != apVar.f30864t) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(apVar.aO);
        }
        if (apVar.aO == null || apVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30847c;
        hashCode = (((((((((((this.f30851g ? 1231 : 1237) + (((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30848d.hashCode()) * 31) + this.f30849e) * 31) + this.f30850f) * 31)) * 31) + h.a(this.f30852h)) * 31) + Arrays.hashCode(this.f30853i)) * 31) + Arrays.hashCode(this.f30854j)) * 31) + this.f30855k.hashCode()) * 31) + this.f30856l.hashCode();
        ad adVar = this.f30857m;
        hashCode = (adVar == null ? 0 : adVar.hashCode()) + (hashCode * 31);
        j = this.f30858n;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        ar arVar = this.f30859o;
        hashCode = (((arVar == null ? 0 : arVar.hashCode()) + (hashCode * 31)) * 31) + this.f30860p.hashCode();
        ag agVar = this.f30861q;
        hashCode = (agVar == null ? 0 : agVar.hashCode()) + (hashCode * 31);
        ao aoVar = this.f30862r;
        hashCode = ((aoVar == null ? 0 : aoVar.hashCode()) + (hashCode * 31)) * 31;
        if (!this.f30863s) {
            i = 1237;
        }
        hashCode += i;
        j = this.f30864t;
        hashCode = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30846b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30847c);
        }
        if ((this.f30846b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30848d);
        }
        if (this.f30852h != null && this.f30852h.length > 0) {
            for (C0757i c0757i : this.f30852h) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if ((this.f30846b & 32) != 0) {
            codedOutputByteBufferNano.a(4, this.f30853i);
        }
        if ((this.f30846b & 64) != 0) {
            codedOutputByteBufferNano.a(6, this.f30854j);
        }
        if (this.f30857m != null) {
            codedOutputByteBufferNano.b(7, this.f30857m);
        }
        if ((this.f30846b & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f30855k);
        }
        if ((this.f30846b & 16) != 0) {
            codedOutputByteBufferNano.a(10, this.f30851g);
        }
        if ((this.f30846b & 4) != 0) {
            codedOutputByteBufferNano.a(11, this.f30849e);
        }
        if ((this.f30846b & 8) != 0) {
            codedOutputByteBufferNano.a(12, this.f30850f);
        }
        if ((this.f30846b & 256) != 0) {
            codedOutputByteBufferNano.a(13, this.f30856l);
        }
        if ((this.f30846b & 512) != 0) {
            codedOutputByteBufferNano.d(15, this.f30858n);
        }
        if (this.f30859o != null) {
            codedOutputByteBufferNano.b(16, this.f30859o);
        }
        if ((this.f30846b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(17, this.f30860p);
        }
        if (this.f30861q != null) {
            codedOutputByteBufferNano.b(18, this.f30861q);
        }
        if (this.f30862r != null) {
            codedOutputByteBufferNano.b(19, this.f30862r);
        }
        if ((this.f30846b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(20, this.f30863s);
        }
        if ((this.f30846b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.b(21, this.f30864t);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30846b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30847c);
        }
        if ((this.f30846b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30848d);
        }
        if (this.f30852h != null && this.f30852h.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f30852h) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if ((this.f30846b & 32) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30853i);
        }
        if ((this.f30846b & 64) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30854j);
        }
        if (this.f30857m != null) {
            b += CodedOutputByteBufferNano.d(7, this.f30857m);
        }
        if ((this.f30846b & 128) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f30855k);
        }
        if ((this.f30846b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(10) + 1;
        }
        if ((this.f30846b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(11, this.f30849e);
        }
        if ((this.f30846b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(12, this.f30850f);
        }
        if ((this.f30846b & 256) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f30856l);
        }
        if ((this.f30846b & 512) != 0) {
            b += CodedOutputByteBufferNano.g(15, this.f30858n);
        }
        if (this.f30859o != null) {
            b += CodedOutputByteBufferNano.d(16, this.f30859o);
        }
        if ((this.f30846b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(17, this.f30860p);
        }
        if (this.f30861q != null) {
            b += CodedOutputByteBufferNano.d(18, this.f30861q);
        }
        if (this.f30862r != null) {
            b += CodedOutputByteBufferNano.d(19, this.f30862r);
        }
        if ((this.f30846b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.d(20) + 1;
        }
        if ((this.f30846b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            return b + CodedOutputByteBufferNano.f(21, this.f30864t);
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
                    this.f30847c = aVar.j();
                    this.f30846b |= 1;
                    continue;
                case 18:
                    this.f30848d = aVar.f();
                    this.f30846b |= 2;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f30852h == null ? 0 : this.f30852h.length;
                    Object obj = new al[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30852h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new al();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new al();
                    aVar.a(obj[a]);
                    this.f30852h = obj;
                    continue;
                case 34:
                    this.f30853i = aVar.g();
                    this.f30846b |= 32;
                    continue;
                case 50:
                    this.f30854j = aVar.g();
                    this.f30846b |= 64;
                    continue;
                case 58:
                    if (this.f30857m == null) {
                        this.f30857m = new ad();
                    }
                    aVar.a(this.f30857m);
                    continue;
                case 66:
                    this.f30855k = aVar.f();
                    this.f30846b |= 128;
                    continue;
                case 80:
                    this.f30851g = aVar.e();
                    this.f30846b |= 16;
                    continue;
                case 88:
                    this.f30849e = aVar.i();
                    this.f30846b |= 4;
                    continue;
                case 96:
                    this.f30850f = aVar.i();
                    this.f30846b |= 8;
                    continue;
                case 106:
                    this.f30856l = aVar.f();
                    this.f30846b |= 256;
                    continue;
                case 120:
                    long j = aVar.j();
                    this.f30858n = (-(j & 1)) ^ (j >>> 1);
                    this.f30846b |= 512;
                    continue;
                case 130:
                    if (this.f30859o == null) {
                        this.f30859o = new ar();
                    }
                    aVar.a(this.f30859o);
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f30860p = aVar.f();
                    this.f30846b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 146:
                    if (this.f30861q == null) {
                        this.f30861q = new ag();
                    }
                    aVar.a(this.f30861q);
                    continue;
                case 154:
                    if (this.f30862r == null) {
                        this.f30862r = new ao();
                    }
                    aVar.a(this.f30862r);
                    continue;
                case 160:
                    this.f30863s = aVar.e();
                    this.f30846b |= eq.FLAG_MOVED;
                    continue;
                case 168:
                    this.f30864t = aVar.j();
                    this.f30846b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
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
