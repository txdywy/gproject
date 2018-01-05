package com.google.android.finsky.cv.p177a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class bl extends C0758b {
    public static volatile bl[] f11905a;
    public String[] f11906A;
    public String f11907B;
    public boolean f11908C;
    public long f11909D;
    public String f11910E;
    public long f11911F;
    public int f11912b;
    public bm[] f11913c;
    public boolean f11914d;
    public long f11915e;
    public String f11916f;
    public String f11917g;
    public String f11918h;
    public String f11919i;
    public String f11920j;
    public long f11921k;
    public String f11922l;
    public bl[] f11923m;
    public boolean f11924n;
    public boolean f11925o;
    public int f11926p;
    public int f11927q;
    public bi f11928r;
    public bq f11929s;
    public bw f11930t;
    public bv f11931u;
    public ca f11932v;
    public boolean f11933w;
    public long f11934x;
    public long f11935y;
    public int f11936z;

    public static bl[] aK_() {
        if (f11905a == null) {
            synchronized (h.b) {
                if (f11905a == null) {
                    f11905a = new bl[0];
                }
            }
        }
        return f11905a;
    }

    public final boolean aL_() {
        return (this.f11912b & 2) != 0;
    }

    public final bl m12273a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f11912b |= 2;
        this.f11917g = str;
        return this;
    }

    public final boolean m12278d() {
        return (this.f11912b & 32) != 0;
    }

    public final bl m12272a(long j) {
        this.f11912b |= 32;
        this.f11921k = j;
        return this;
    }

    public final boolean m12279e() {
        return (this.f11912b & 64) != 0;
    }

    public final bl m12277b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f11912b |= 64;
        this.f11922l = str;
        return this;
    }

    public final boolean m12280f() {
        return (this.f11912b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0;
    }

    public bl() {
        this.f11912b = 0;
        this.f11913c = bm.aM_();
        this.f11914d = false;
        this.f11915e = 0;
        this.f11916f = "";
        this.f11917g = "";
        this.f11918h = "";
        this.f11919i = "";
        this.f11920j = "";
        this.f11921k = 0;
        this.f11922l = "";
        this.f11923m = bl.aK_();
        this.f11924n = false;
        this.f11925o = false;
        this.f11926p = 1;
        this.f11927q = 1;
        this.f11928r = null;
        this.f11929s = null;
        this.f11930t = null;
        this.f11931u = null;
        this.f11932v = null;
        this.f11933w = false;
        this.f11934x = 0;
        this.f11935y = 0;
        this.f11936z = 0;
        this.f11906A = l.j;
        this.f11907B = "";
        this.f11908C = false;
        this.f11909D = 0;
        this.f11910E = "";
        this.f11911F = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        if (!h.a(this.f11913c, blVar.f11913c)) {
            return false;
        }
        if ((this.f11912b & 1) != (blVar.f11912b & 1)) {
            return false;
        }
        if (this.f11914d != blVar.f11914d) {
            return false;
        }
        if (this.f11915e != blVar.f11915e) {
            return false;
        }
        if (this.f11916f == null) {
            if (blVar.f11916f != null) {
                return false;
            }
        } else if (!this.f11916f.equals(blVar.f11916f)) {
            return false;
        }
        if ((this.f11912b & 2) != (blVar.f11912b & 2)) {
            return false;
        }
        if (!this.f11917g.equals(blVar.f11917g)) {
            return false;
        }
        if ((this.f11912b & 4) != (blVar.f11912b & 4)) {
            return false;
        }
        if (!this.f11918h.equals(blVar.f11918h)) {
            return false;
        }
        if ((this.f11912b & 8) != (blVar.f11912b & 8)) {
            return false;
        }
        if (!this.f11919i.equals(blVar.f11919i)) {
            return false;
        }
        if ((this.f11912b & 16) != (blVar.f11912b & 16)) {
            return false;
        }
        if (!this.f11920j.equals(blVar.f11920j)) {
            return false;
        }
        if ((this.f11912b & 32) != (blVar.f11912b & 32)) {
            return false;
        }
        if (this.f11921k != blVar.f11921k) {
            return false;
        }
        if ((this.f11912b & 64) != (blVar.f11912b & 64)) {
            return false;
        }
        if (!this.f11922l.equals(blVar.f11922l)) {
            return false;
        }
        if (!h.a(this.f11923m, blVar.f11923m)) {
            return false;
        }
        if ((this.f11912b & 128) != (blVar.f11912b & 128)) {
            return false;
        }
        if (this.f11924n != blVar.f11924n) {
            return false;
        }
        if ((this.f11912b & 256) != (blVar.f11912b & 256)) {
            return false;
        }
        if (this.f11925o != blVar.f11925o) {
            return false;
        }
        if ((this.f11912b & 512) != (blVar.f11912b & 512)) {
            return false;
        }
        if (this.f11926p != blVar.f11926p) {
            return false;
        }
        if ((this.f11912b & MemoryMappedFileBuffer.DEFAULT_PADDING) != (blVar.f11912b & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (this.f11927q != blVar.f11927q) {
            return false;
        }
        if (this.f11928r == null) {
            if (blVar.f11928r != null) {
                return false;
            }
        } else if (!this.f11928r.equals(blVar.f11928r)) {
            return false;
        }
        if (this.f11929s == null) {
            if (blVar.f11929s != null) {
                return false;
            }
        } else if (!this.f11929s.equals(blVar.f11929s)) {
            return false;
        }
        if (this.f11930t == null) {
            if (blVar.f11930t != null) {
                return false;
            }
        } else if (!this.f11930t.equals(blVar.f11930t)) {
            return false;
        }
        if (this.f11931u == null) {
            if (blVar.f11931u != null) {
                return false;
            }
        } else if (!this.f11931u.equals(blVar.f11931u)) {
            return false;
        }
        if (this.f11932v == null) {
            if (blVar.f11932v != null) {
                return false;
            }
        } else if (!this.f11932v.equals(blVar.f11932v)) {
            return false;
        }
        if ((this.f11912b & eq.FLAG_MOVED) != (blVar.f11912b & eq.FLAG_MOVED)) {
            return false;
        }
        if (this.f11933w != blVar.f11933w) {
            return false;
        }
        if ((this.f11912b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (blVar.f11912b & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (this.f11934x != blVar.f11934x) {
            return false;
        }
        if ((this.f11912b & 8192) != (blVar.f11912b & 8192)) {
            return false;
        }
        if (this.f11935y != blVar.f11935y) {
            return false;
        }
        if ((this.f11912b & 16384) != (blVar.f11912b & 16384)) {
            return false;
        }
        if (this.f11936z != blVar.f11936z) {
            return false;
        }
        if (!h.a(this.f11906A, blVar.f11906A)) {
            return false;
        }
        if ((this.f11912b & 32768) != (blVar.f11912b & 32768)) {
            return false;
        }
        if (!this.f11907B.equals(blVar.f11907B)) {
            return false;
        }
        if ((this.f11912b & 65536) != (blVar.f11912b & 65536)) {
            return false;
        }
        if (this.f11908C != blVar.f11908C) {
            return false;
        }
        if ((this.f11912b & 131072) != (blVar.f11912b & 131072)) {
            return false;
        }
        if (this.f11909D != blVar.f11909D) {
            return false;
        }
        if ((this.f11912b & 262144) != (blVar.f11912b & 262144)) {
            return false;
        }
        if (!this.f11910E.equals(blVar.f11910E)) {
            return false;
        }
        if ((this.f11912b & 524288) != (blVar.f11912b & 524288)) {
            return false;
        }
        if (this.f11911F != blVar.f11911F) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(blVar.aO);
        }
        if (blVar.aO == null || blVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int i3 = 0;
        int hashCode = ((((this.f11914d ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f11913c)) * 31)) * 31) + ((int) (this.f11915e ^ (this.f11915e >>> 32)))) * 31;
        if (this.f11916f == null) {
            i = 0;
        } else {
            i = this.f11916f.hashCode();
        }
        i = ((((((((i + hashCode) * 31) + this.f11917g.hashCode()) * 31) + this.f11918h.hashCode()) * 31) + this.f11919i.hashCode()) * 31) + this.f11920j.hashCode();
        long j = this.f11921k;
        int hashCode2 = ((this.f11924n ? 1231 : 1237) + (((((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11922l.hashCode()) * 31) + h.a(this.f11923m)) * 31)) * 31;
        if (this.f11925o) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = ((((i + hashCode2) * 31) + this.f11926p) * 31) + this.f11927q;
        bi biVar = this.f11928r;
        i = (biVar == null ? 0 : biVar.hashCode()) + (i * 31);
        bq bqVar = this.f11929s;
        i = (bqVar == null ? 0 : bqVar.hashCode()) + (i * 31);
        bw bwVar = this.f11930t;
        i = (bwVar == null ? 0 : bwVar.hashCode()) + (i * 31);
        bv bvVar = this.f11931u;
        i = (bvVar == null ? 0 : bvVar.hashCode()) + (i * 31);
        ca caVar = this.f11932v;
        hashCode2 = ((caVar == null ? 0 : caVar.hashCode()) + (i * 31)) * 31;
        if (this.f11933w) {
            i = 1231;
        } else {
            i = 1237;
        }
        i += hashCode2;
        j = this.f11934x;
        i = (i * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f11935y;
        i = ((((((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11936z) * 31) + h.a(this.f11906A)) * 31) + this.f11907B.hashCode()) * 31;
        if (!this.f11908C) {
            i2 = 1237;
        }
        i += i2;
        j = this.f11909D;
        i = (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11910E.hashCode();
        j = this.f11911F;
        i = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i3 = this.aO.hashCode();
        }
        return i + i3;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        codedOutputByteBufferNano.b(1, this.f11915e);
        codedOutputByteBufferNano.a(2, this.f11916f);
        if ((this.f11912b & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f11917g);
        }
        if (this.f11923m != null && this.f11923m.length > 0) {
            for (C0757i c0757i : this.f11923m) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if ((this.f11912b & 128) != 0) {
            codedOutputByteBufferNano.a(5, this.f11924n);
        }
        if ((this.f11912b & 32) != 0) {
            codedOutputByteBufferNano.b(6, this.f11921k);
        }
        if ((this.f11912b & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f11922l);
        }
        if ((this.f11912b & 512) != 0) {
            codedOutputByteBufferNano.a(8, this.f11926p);
        }
        if (this.f11929s != null) {
            codedOutputByteBufferNano.b(9, this.f11929s);
        }
        if ((this.f11912b & 8192) != 0) {
            codedOutputByteBufferNano.b(10, this.f11935y);
        }
        if (this.f11906A != null && this.f11906A.length > 0) {
            for (String str : this.f11906A) {
                if (str != null) {
                    codedOutputByteBufferNano.a(11, str);
                }
            }
        }
        if (this.f11930t != null) {
            codedOutputByteBufferNano.b(12, this.f11930t);
        }
        if ((this.f11912b & 4) != 0) {
            codedOutputByteBufferNano.a(13, this.f11918h);
        }
        if ((this.f11912b & 8) != 0) {
            codedOutputByteBufferNano.a(14, this.f11919i);
        }
        if ((this.f11912b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(15, this.f11933w);
        }
        if ((this.f11912b & 16384) != 0) {
            codedOutputByteBufferNano.a(16, this.f11936z);
        }
        if ((this.f11912b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(17, this.f11927q);
        }
        if (this.f11931u != null) {
            codedOutputByteBufferNano.b(18, this.f11931u);
        }
        if ((this.f11912b & 32768) != 0) {
            codedOutputByteBufferNano.a(19, this.f11907B);
        }
        if ((this.f11912b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.b(20, this.f11934x);
        }
        if (this.f11928r != null) {
            codedOutputByteBufferNano.b(21, this.f11928r);
        }
        if ((this.f11912b & 256) != 0) {
            codedOutputByteBufferNano.a(22, this.f11925o);
        }
        if (this.f11932v != null) {
            codedOutputByteBufferNano.b(23, this.f11932v);
        }
        if (this.f11913c != null && this.f11913c.length > 0) {
            while (i < this.f11913c.length) {
                C0757i c0757i2 = this.f11913c[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(24, c0757i2);
                }
                i++;
            }
        }
        if ((this.f11912b & 1) != 0) {
            codedOutputByteBufferNano.a(25, this.f11914d);
        }
        if ((this.f11912b & 16) != 0) {
            codedOutputByteBufferNano.a(26, this.f11920j);
        }
        if ((this.f11912b & 65536) != 0) {
            codedOutputByteBufferNano.a(29, this.f11908C);
        }
        if ((this.f11912b & 131072) != 0) {
            codedOutputByteBufferNano.b(30, this.f11909D);
        }
        if ((this.f11912b & 262144) != 0) {
            codedOutputByteBufferNano.a(31, this.f11910E);
        }
        if ((this.f11912b & 524288) != 0) {
            codedOutputByteBufferNano.b(32, this.f11911F);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = (super.mo1128b() + CodedOutputByteBufferNano.f(1, this.f11915e)) + CodedOutputByteBufferNano.b(2, this.f11916f);
        if ((this.f11912b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11917g);
        }
        if (this.f11923m != null && this.f11923m.length > 0) {
            i = b;
            for (C0757i c0757i : this.f11923m) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if ((this.f11912b & 128) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if ((this.f11912b & 32) != 0) {
            b += CodedOutputByteBufferNano.f(6, this.f11921k);
        }
        if ((this.f11912b & 64) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f11922l);
        }
        if ((this.f11912b & 512) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f11926p);
        }
        if (this.f11929s != null) {
            b += CodedOutputByteBufferNano.d(9, this.f11929s);
        }
        if ((this.f11912b & 8192) != 0) {
            b += CodedOutputByteBufferNano.f(10, this.f11935y);
        }
        if (this.f11906A != null && this.f11906A.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f11906A) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f11930t != null) {
            b += CodedOutputByteBufferNano.d(12, this.f11930t);
        }
        if ((this.f11912b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f11918h);
        }
        if ((this.f11912b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(14, this.f11919i);
        }
        if ((this.f11912b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.d(15) + 1;
        }
        if ((this.f11912b & 16384) != 0) {
            b += CodedOutputByteBufferNano.d(16, this.f11936z);
        }
        if ((this.f11912b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.d(17, this.f11927q);
        }
        if (this.f11931u != null) {
            b += CodedOutputByteBufferNano.d(18, this.f11931u);
        }
        if ((this.f11912b & 32768) != 0) {
            b += CodedOutputByteBufferNano.b(19, this.f11907B);
        }
        if ((this.f11912b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.f(20, this.f11934x);
        }
        if (this.f11928r != null) {
            b += CodedOutputByteBufferNano.d(21, this.f11928r);
        }
        if ((this.f11912b & 256) != 0) {
            b += CodedOutputByteBufferNano.d(22) + 1;
        }
        if (this.f11932v != null) {
            b += CodedOutputByteBufferNano.d(23, this.f11932v);
        }
        if (this.f11913c != null && this.f11913c.length > 0) {
            while (i2 < this.f11913c.length) {
                C0757i c0757i2 = this.f11913c[i2];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(24, c0757i2);
                }
                i2++;
            }
        }
        if ((this.f11912b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(25) + 1;
        }
        if ((this.f11912b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(26, this.f11920j);
        }
        if ((this.f11912b & 65536) != 0) {
            b += CodedOutputByteBufferNano.d(29) + 1;
        }
        if ((this.f11912b & 131072) != 0) {
            b += CodedOutputByteBufferNano.f(30, this.f11909D);
        }
        if ((this.f11912b & 262144) != 0) {
            b += CodedOutputByteBufferNano.b(31, this.f11910E);
        }
        if ((this.f11912b & 524288) != 0) {
            return b + CodedOutputByteBufferNano.f(32, this.f11911F);
        }
        return b;
    }

    private final bl m12271b(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f11915e = aVar.j();
                    continue;
                case 18:
                    this.f11916f = aVar.f();
                    continue;
                case 26:
                    this.f11917g = aVar.f();
                    this.f11912b |= 2;
                    continue;
                case 34:
                    a2 = l.a(aVar, 34);
                    a = this.f11923m == null ? 0 : this.f11923m.length;
                    obj = new bl[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11923m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bl();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bl();
                    aVar.a(obj[a]);
                    this.f11923m = obj;
                    continue;
                case 40:
                    this.f11924n = aVar.e();
                    this.f11912b |= 128;
                    continue;
                case 48:
                    this.f11921k = aVar.j();
                    this.f11912b |= 32;
                    continue;
                case 58:
                    this.f11922l = aVar.f();
                    this.f11912b |= 64;
                    continue;
                case 64:
                    this.f11912b |= 512;
                    a2 = aVar.o();
                    try {
                        this.f11926p = bp.m12290a(aVar.i());
                        this.f11912b |= 512;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(a2);
                        m4918a(aVar, a);
                        break;
                    }
                case 74:
                    if (this.f11929s == null) {
                        this.f11929s = new bq();
                    }
                    aVar.a(this.f11929s);
                    continue;
                case 80:
                    this.f11935y = aVar.j();
                    this.f11912b |= 8192;
                    continue;
                case 90:
                    a2 = l.a(aVar, 90);
                    a = this.f11906A == null ? 0 : this.f11906A.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11906A, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f11906A = obj;
                    continue;
                case 98:
                    if (this.f11930t == null) {
                        this.f11930t = new bw();
                    }
                    aVar.a(this.f11930t);
                    continue;
                case 106:
                    this.f11918h = aVar.f();
                    this.f11912b |= 4;
                    continue;
                case 114:
                    this.f11919i = aVar.f();
                    this.f11912b |= 8;
                    continue;
                case 120:
                    this.f11933w = aVar.e();
                    this.f11912b |= eq.FLAG_MOVED;
                    continue;
                case 128:
                    this.f11936z = aVar.i();
                    this.f11912b |= 16384;
                    continue;
                case 136:
                    this.f11912b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    a2 = aVar.o();
                    try {
                        this.f11927q = bp.m12290a(aVar.i());
                        this.f11912b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        aVar.e(a2);
                        m4918a(aVar, a);
                        break;
                    }
                case 146:
                    if (this.f11931u == null) {
                        this.f11931u = new bv();
                    }
                    aVar.a(this.f11931u);
                    continue;
                case 154:
                    this.f11907B = aVar.f();
                    this.f11912b |= 32768;
                    continue;
                case 160:
                    this.f11934x = aVar.j();
                    this.f11912b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 170:
                    if (this.f11928r == null) {
                        this.f11928r = new bi();
                    }
                    aVar.a(this.f11928r);
                    continue;
                case 176:
                    this.f11925o = aVar.e();
                    this.f11912b |= 256;
                    continue;
                case 186:
                    if (this.f11932v == null) {
                        this.f11932v = new ca();
                    }
                    aVar.a(this.f11932v);
                    continue;
                case 194:
                    a2 = l.a(aVar, 194);
                    a = this.f11913c == null ? 0 : this.f11913c.length;
                    obj = new bm[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11913c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bm();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bm();
                    aVar.a(obj[a]);
                    this.f11913c = obj;
                    continue;
                case 200:
                    this.f11914d = aVar.e();
                    this.f11912b |= 1;
                    continue;
                case 210:
                    this.f11920j = aVar.f();
                    this.f11912b |= 16;
                    continue;
                case 232:
                    this.f11908C = aVar.e();
                    this.f11912b |= 65536;
                    continue;
                case 240:
                    this.f11909D = aVar.j();
                    this.f11912b |= 131072;
                    continue;
                case 250:
                    this.f11910E = aVar.f();
                    this.f11912b |= 262144;
                    continue;
                case 256:
                    this.f11911F = aVar.j();
                    this.f11912b |= 524288;
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12271b(aVar);
    }
}
