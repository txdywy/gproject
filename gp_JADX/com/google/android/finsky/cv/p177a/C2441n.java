package com.google.android.finsky.cv.p177a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C2441n extends C0758b {
    public String f13152A;
    public es f13153B;
    public kq f13154C;
    public cx f13155D;
    public li f13156E;
    public int[] f13157F;
    public he f13158G;
    public C2444q f13159H;
    public String f13160I;
    public int f13161a;
    public String f13162b;
    public int f13163c;
    public String f13164d;
    public int f13165e;
    public long f13166f;
    public String[] f13167g;
    public String f13168h;
    public String f13169i;
    public String f13170j;
    public String f13171k;
    public String f13172l;
    public String f13173m;
    public dl[] f13174n;
    public String f13175o;
    public ao[] f13176p;
    public String[] f13177q;
    public boolean f13178r;
    public String[] f13179s;
    public boolean f13180t;
    public boolean f13181u;
    public boolean f13182v;
    public boolean f13183w;
    public String f13184x;
    public int f13185y;
    public int f13186z;

    public final boolean aw_() {
        return (this.f13161a & 256) != 0;
    }

    public final C2441n m13100a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f13161a |= 256;
        this.f13171k = str;
        return this;
    }

    public final boolean ax_() {
        return (this.f13161a & 65536) != 0;
    }

    public final boolean m13104d() {
        return (this.f13161a & 131072) != 0;
    }

    public C2441n() {
        this.f13161a = 0;
        this.f13162b = "";
        this.f13163c = 0;
        this.f13164d = "";
        this.f13165e = 0;
        this.f13166f = 0;
        this.f13167g = l.j;
        this.f13168h = "";
        this.f13169i = "";
        this.f13170j = "";
        this.f13171k = "";
        this.f13172l = "";
        this.f13173m = "";
        this.f13174n = dl.aU_();
        this.f13175o = "";
        this.f13176p = ao.aF_();
        this.f13177q = l.j;
        this.f13178r = true;
        this.f13179s = l.j;
        this.f13180t = false;
        this.f13181u = false;
        this.f13182v = false;
        this.f13183w = false;
        this.f13184x = "";
        this.f13185y = 0;
        this.f13186z = 0;
        this.f13152A = "";
        this.f13153B = null;
        this.f13154C = null;
        this.f13155D = null;
        this.f13156E = null;
        this.f13157F = l.e;
        this.f13158G = null;
        this.f13159H = null;
        this.f13160I = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2441n)) {
            return false;
        }
        C2441n c2441n = (C2441n) obj;
        if ((this.f13161a & 1) != (c2441n.f13161a & 1)) {
            return false;
        }
        if (!this.f13162b.equals(c2441n.f13162b)) {
            return false;
        }
        if ((this.f13161a & 2) != (c2441n.f13161a & 2)) {
            return false;
        }
        if (this.f13163c != c2441n.f13163c) {
            return false;
        }
        if ((this.f13161a & 4) != (c2441n.f13161a & 4)) {
            return false;
        }
        if (!this.f13164d.equals(c2441n.f13164d)) {
            return false;
        }
        if ((this.f13161a & 8) != (c2441n.f13161a & 8)) {
            return false;
        }
        if (this.f13165e != c2441n.f13165e) {
            return false;
        }
        if ((this.f13161a & 16) != (c2441n.f13161a & 16)) {
            return false;
        }
        if (this.f13166f != c2441n.f13166f) {
            return false;
        }
        if (!h.a(this.f13167g, c2441n.f13167g)) {
            return false;
        }
        if ((this.f13161a & 32) != (c2441n.f13161a & 32)) {
            return false;
        }
        if (!this.f13168h.equals(c2441n.f13168h)) {
            return false;
        }
        if ((this.f13161a & 64) != (c2441n.f13161a & 64)) {
            return false;
        }
        if (!this.f13169i.equals(c2441n.f13169i)) {
            return false;
        }
        if ((this.f13161a & 128) != (c2441n.f13161a & 128)) {
            return false;
        }
        if (!this.f13170j.equals(c2441n.f13170j)) {
            return false;
        }
        if ((this.f13161a & 256) != (c2441n.f13161a & 256)) {
            return false;
        }
        if (!this.f13171k.equals(c2441n.f13171k)) {
            return false;
        }
        if ((this.f13161a & 512) != (c2441n.f13161a & 512)) {
            return false;
        }
        if (!this.f13172l.equals(c2441n.f13172l)) {
            return false;
        }
        if ((this.f13161a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (c2441n.f13161a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f13173m.equals(c2441n.f13173m)) {
            return false;
        }
        if (!h.a(this.f13174n, c2441n.f13174n)) {
            return false;
        }
        if ((this.f13161a & eq.FLAG_MOVED) != (c2441n.f13161a & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f13175o.equals(c2441n.f13175o)) {
            return false;
        }
        if (!h.a(this.f13176p, c2441n.f13176p)) {
            return false;
        }
        if (!h.a(this.f13177q, c2441n.f13177q)) {
            return false;
        }
        if ((this.f13161a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (c2441n.f13161a & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (this.f13178r != c2441n.f13178r) {
            return false;
        }
        if (!h.a(this.f13179s, c2441n.f13179s)) {
            return false;
        }
        if ((this.f13161a & 8192) != (c2441n.f13161a & 8192)) {
            return false;
        }
        if (this.f13180t != c2441n.f13180t) {
            return false;
        }
        if ((this.f13161a & 16384) != (c2441n.f13161a & 16384)) {
            return false;
        }
        if (this.f13181u != c2441n.f13181u) {
            return false;
        }
        if ((this.f13161a & 32768) != (c2441n.f13161a & 32768)) {
            return false;
        }
        if (this.f13182v != c2441n.f13182v) {
            return false;
        }
        if ((this.f13161a & 65536) != (c2441n.f13161a & 65536)) {
            return false;
        }
        if (this.f13183w != c2441n.f13183w) {
            return false;
        }
        if ((this.f13161a & 131072) != (c2441n.f13161a & 131072)) {
            return false;
        }
        if (!this.f13184x.equals(c2441n.f13184x)) {
            return false;
        }
        if ((this.f13161a & 262144) != (c2441n.f13161a & 262144)) {
            return false;
        }
        if (this.f13185y != c2441n.f13185y) {
            return false;
        }
        if ((this.f13161a & 524288) != (c2441n.f13161a & 524288)) {
            return false;
        }
        if (this.f13186z != c2441n.f13186z) {
            return false;
        }
        if ((this.f13161a & 1048576) != (c2441n.f13161a & 1048576)) {
            return false;
        }
        if (!this.f13152A.equals(c2441n.f13152A)) {
            return false;
        }
        if (this.f13153B == null) {
            if (c2441n.f13153B != null) {
                return false;
            }
        } else if (!this.f13153B.equals(c2441n.f13153B)) {
            return false;
        }
        if (this.f13154C == null) {
            if (c2441n.f13154C != null) {
                return false;
            }
        } else if (!this.f13154C.equals(c2441n.f13154C)) {
            return false;
        }
        if (this.f13155D == null) {
            if (c2441n.f13155D != null) {
                return false;
            }
        } else if (!this.f13155D.equals(c2441n.f13155D)) {
            return false;
        }
        if (this.f13156E == null) {
            if (c2441n.f13156E != null) {
                return false;
            }
        } else if (!this.f13156E.equals(c2441n.f13156E)) {
            return false;
        }
        if (!h.a(this.f13157F, c2441n.f13157F)) {
            return false;
        }
        if (this.f13158G == null) {
            if (c2441n.f13158G != null) {
                return false;
            }
        } else if (!this.f13158G.equals(c2441n.f13158G)) {
            return false;
        }
        if (this.f13159H == null) {
            if (c2441n.f13159H != null) {
                return false;
            }
        } else if (!this.f13159H.equals(c2441n.f13159H)) {
            return false;
        }
        if ((this.f13161a & 2097152) != (c2441n.f13161a & 2097152)) {
            return false;
        }
        if (!this.f13160I.equals(c2441n.f13160I)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2441n.aO);
        }
        if (c2441n.aO == null || c2441n.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + this.f13162b.hashCode()) * 31) + this.f13163c) * 31) + this.f13164d.hashCode()) * 31) + this.f13165e;
        long j = this.f13166f;
        int a = ((((this.f13178r ? 1231 : 1237) + (((((((((((((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f13167g)) * 31) + this.f13168h.hashCode()) * 31) + this.f13169i.hashCode()) * 31) + this.f13170j.hashCode()) * 31) + this.f13171k.hashCode()) * 31) + this.f13172l.hashCode()) * 31) + this.f13173m.hashCode()) * 31) + h.a(this.f13174n)) * 31) + this.f13175o.hashCode()) * 31) + h.a(this.f13176p)) * 31) + h.a(this.f13177q)) * 31)) * 31) + h.a(this.f13179s)) * 31;
        if (this.f13180t) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        a = (hashCode + a) * 31;
        if (this.f13181u) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        a = (hashCode + a) * 31;
        if (this.f13182v) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode = (hashCode + a) * 31;
        if (!this.f13183w) {
            i = 1237;
        }
        hashCode = ((((((((hashCode + i) * 31) + this.f13184x.hashCode()) * 31) + this.f13185y) * 31) + this.f13186z) * 31) + this.f13152A.hashCode();
        es esVar = this.f13153B;
        hashCode = (esVar == null ? 0 : esVar.hashCode()) + (hashCode * 31);
        kq kqVar = this.f13154C;
        hashCode = (kqVar == null ? 0 : kqVar.hashCode()) + (hashCode * 31);
        cx cxVar = this.f13155D;
        hashCode = (cxVar == null ? 0 : cxVar.hashCode()) + (hashCode * 31);
        li liVar = this.f13156E;
        hashCode = (((liVar == null ? 0 : liVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f13157F);
        he heVar = this.f13158G;
        hashCode = (heVar == null ? 0 : heVar.hashCode()) + (hashCode * 31);
        C2444q c2444q = this.f13159H;
        hashCode = ((((c2444q == null ? 0 : c2444q.hashCode()) + (hashCode * 31)) * 31) + this.f13160I.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f13161a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13162b);
        }
        if ((this.f13161a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f13163c);
        }
        if ((this.f13161a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f13164d);
        }
        if ((this.f13161a & 8) != 0) {
            codedOutputByteBufferNano.a(8, this.f13165e);
        }
        if ((this.f13161a & 16) != 0) {
            codedOutputByteBufferNano.b(9, this.f13166f);
        }
        if (this.f13167g != null && this.f13167g.length > 0) {
            for (String str : this.f13167g) {
                if (str != null) {
                    codedOutputByteBufferNano.a(10, str);
                }
            }
        }
        if ((this.f13161a & 32) != 0) {
            codedOutputByteBufferNano.a(11, this.f13168h);
        }
        if ((this.f13161a & 64) != 0) {
            codedOutputByteBufferNano.a(12, this.f13169i);
        }
        if ((this.f13161a & 128) != 0) {
            codedOutputByteBufferNano.a(13, this.f13170j);
        }
        if ((this.f13161a & 256) != 0) {
            codedOutputByteBufferNano.a(14, this.f13171k);
        }
        if ((this.f13161a & 512) != 0) {
            codedOutputByteBufferNano.a(15, this.f13172l);
        }
        if ((this.f13161a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(16, this.f13173m);
        }
        if (this.f13174n != null && this.f13174n.length > 0) {
            for (C0757i c0757i : this.f13174n) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(17, c0757i);
                }
            }
        }
        if ((this.f13161a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(18, this.f13175o);
        }
        if (this.f13177q != null && this.f13177q.length > 0) {
            for (String str2 : this.f13177q) {
                if (str2 != null) {
                    codedOutputByteBufferNano.a(19, str2);
                }
            }
        }
        if ((this.f13161a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(21, this.f13178r);
        }
        if (this.f13176p != null && this.f13176p.length > 0) {
            for (C0757i c0757i2 : this.f13176p) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(22, c0757i2);
                }
            }
        }
        if (this.f13179s != null && this.f13179s.length > 0) {
            for (String str22 : this.f13179s) {
                if (str22 != null) {
                    codedOutputByteBufferNano.a(23, str22);
                }
            }
        }
        if ((this.f13161a & 8192) != 0) {
            codedOutputByteBufferNano.a(24, this.f13180t);
        }
        if ((this.f13161a & 16384) != 0) {
            codedOutputByteBufferNano.a(26, this.f13181u);
        }
        if ((this.f13161a & 32768) != 0) {
            codedOutputByteBufferNano.a(27, this.f13182v);
        }
        if ((this.f13161a & 65536) != 0) {
            codedOutputByteBufferNano.a(28, this.f13183w);
        }
        if ((this.f13161a & 131072) != 0) {
            codedOutputByteBufferNano.a(30, this.f13184x);
        }
        if ((this.f13161a & 262144) != 0) {
            codedOutputByteBufferNano.a(31, this.f13185y);
        }
        if ((this.f13161a & 524288) != 0) {
            codedOutputByteBufferNano.a(32, this.f13186z);
        }
        if ((this.f13161a & 1048576) != 0) {
            codedOutputByteBufferNano.a(33, this.f13152A);
        }
        if (this.f13153B != null) {
            codedOutputByteBufferNano.b(34, this.f13153B);
        }
        if (this.f13154C != null) {
            codedOutputByteBufferNano.b(35, this.f13154C);
        }
        if (this.f13155D != null) {
            codedOutputByteBufferNano.b(36, this.f13155D);
        }
        if (this.f13156E != null) {
            codedOutputByteBufferNano.b(37, this.f13156E);
        }
        if (this.f13157F != null && this.f13157F.length > 0) {
            while (i < this.f13157F.length) {
                codedOutputByteBufferNano.a(38, this.f13157F[i]);
                i++;
            }
        }
        if (this.f13158G != null) {
            codedOutputByteBufferNano.b(40, this.f13158G);
        }
        if (this.f13159H != null) {
            codedOutputByteBufferNano.b(41, this.f13159H);
        }
        if ((this.f13161a & 2097152) != 0) {
            codedOutputByteBufferNano.a(43, this.f13160I);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo1128b();
        if ((this.f13161a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13162b);
        }
        if ((this.f13161a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f13163c);
        }
        if ((this.f13161a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f13164d);
        }
        if ((this.f13161a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f13165e);
        }
        if ((this.f13161a & 16) != 0) {
            b += CodedOutputByteBufferNano.f(9, this.f13166f);
        }
        if (this.f13167g != null && this.f13167g.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f13167g) {
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if ((this.f13161a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(11, this.f13168h);
        }
        if ((this.f13161a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(12, this.f13169i);
        }
        if ((this.f13161a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f13170j);
        }
        if ((this.f13161a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(14, this.f13171k);
        }
        if ((this.f13161a & 512) != 0) {
            b += CodedOutputByteBufferNano.b(15, this.f13172l);
        }
        if ((this.f13161a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(16, this.f13173m);
        }
        if (this.f13174n != null && this.f13174n.length > 0) {
            i3 = b;
            for (C0757i c0757i : this.f13174n) {
                if (c0757i != null) {
                    i3 += CodedOutputByteBufferNano.d(17, c0757i);
                }
            }
            b = i3;
        }
        if ((this.f13161a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(18, this.f13175o);
        }
        if (this.f13177q != null && this.f13177q.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.f13177q) {
                if (str2 != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.b(str2);
                }
            }
            b = (b + i) + (i2 * 2);
        }
        if ((this.f13161a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.d(21) + 1;
        }
        if (this.f13176p != null && this.f13176p.length > 0) {
            i3 = b;
            for (C0757i c0757i2 : this.f13176p) {
                if (c0757i2 != null) {
                    i3 += CodedOutputByteBufferNano.d(22, c0757i2);
                }
            }
            b = i3;
        }
        if (this.f13179s != null && this.f13179s.length > 0) {
            i = 0;
            i2 = 0;
            for (String str22 : this.f13179s) {
                if (str22 != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.b(str22);
                }
            }
            b = (b + i) + (i2 * 2);
        }
        if ((this.f13161a & 8192) != 0) {
            b += CodedOutputByteBufferNano.d(24) + 1;
        }
        if ((this.f13161a & 16384) != 0) {
            b += CodedOutputByteBufferNano.d(26) + 1;
        }
        if ((this.f13161a & 32768) != 0) {
            b += CodedOutputByteBufferNano.d(27) + 1;
        }
        if ((this.f13161a & 65536) != 0) {
            b += CodedOutputByteBufferNano.d(28) + 1;
        }
        if ((this.f13161a & 131072) != 0) {
            b += CodedOutputByteBufferNano.b(30, this.f13184x);
        }
        if ((this.f13161a & 262144) != 0) {
            b += CodedOutputByteBufferNano.d(31, this.f13185y);
        }
        if ((this.f13161a & 524288) != 0) {
            b += CodedOutputByteBufferNano.d(32, this.f13186z);
        }
        if ((this.f13161a & 1048576) != 0) {
            b += CodedOutputByteBufferNano.b(33, this.f13152A);
        }
        if (this.f13153B != null) {
            b += CodedOutputByteBufferNano.d(34, this.f13153B);
        }
        if (this.f13154C != null) {
            b += CodedOutputByteBufferNano.d(35, this.f13154C);
        }
        if (this.f13155D != null) {
            b += CodedOutputByteBufferNano.d(36, this.f13155D);
        }
        if (this.f13156E != null) {
            b += CodedOutputByteBufferNano.d(37, this.f13156E);
        }
        if (this.f13157F != null && this.f13157F.length > 0) {
            i3 = 0;
            while (i4 < this.f13157F.length) {
                i3 += CodedOutputByteBufferNano.c(this.f13157F[i4]);
                i4++;
            }
            b = (b + i3) + (this.f13157F.length * 2);
        }
        if (this.f13158G != null) {
            b += CodedOutputByteBufferNano.d(40, this.f13158G);
        }
        if (this.f13159H != null) {
            b += CodedOutputByteBufferNano.d(41, this.f13159H);
        }
        if ((this.f13161a & 2097152) != 0) {
            return b + CodedOutputByteBufferNano.b(43, this.f13160I);
        }
        return b;
    }

    private final C2441n m13099b(a aVar) {
        int a;
        while (true) {
            int a2 = aVar.a();
            int a3;
            int length;
            Object obj;
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f13162b = aVar.f();
                    this.f13161a |= 1;
                    continue;
                case 24:
                    this.f13163c = aVar.i();
                    this.f13161a |= 2;
                    continue;
                case 34:
                    this.f13164d = aVar.f();
                    this.f13161a |= 4;
                    continue;
                case 64:
                    this.f13165e = aVar.i();
                    this.f13161a |= 8;
                    continue;
                case 72:
                    this.f13166f = aVar.j();
                    this.f13161a |= 16;
                    continue;
                case 82:
                    a3 = l.a(aVar, 82);
                    length = this.f13167g == null ? 0 : this.f13167g.length;
                    obj = new String[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f13167g, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = aVar.f();
                        aVar.a();
                        length++;
                    }
                    obj[length] = aVar.f();
                    this.f13167g = obj;
                    continue;
                case 90:
                    this.f13168h = aVar.f();
                    this.f13161a |= 32;
                    continue;
                case 98:
                    this.f13169i = aVar.f();
                    this.f13161a |= 64;
                    continue;
                case 106:
                    this.f13170j = aVar.f();
                    this.f13161a |= 128;
                    continue;
                case 114:
                    this.f13171k = aVar.f();
                    this.f13161a |= 256;
                    continue;
                case 122:
                    this.f13172l = aVar.f();
                    this.f13161a |= 512;
                    continue;
                case 130:
                    this.f13173m = aVar.f();
                    this.f13161a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    a3 = l.a(aVar, HprofParser.ROOT_FINALIZING);
                    length = this.f13174n == null ? 0 : this.f13174n.length;
                    obj = new dl[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f13174n, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new dl();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new dl();
                    aVar.a(obj[length]);
                    this.f13174n = obj;
                    continue;
                case 146:
                    this.f13175o = aVar.f();
                    this.f13161a |= eq.FLAG_MOVED;
                    continue;
                case 154:
                    a3 = l.a(aVar, 154);
                    length = this.f13177q == null ? 0 : this.f13177q.length;
                    obj = new String[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f13177q, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = aVar.f();
                        aVar.a();
                        length++;
                    }
                    obj[length] = aVar.f();
                    this.f13177q = obj;
                    continue;
                case 168:
                    this.f13178r = aVar.e();
                    this.f13161a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 178:
                    a3 = l.a(aVar, 178);
                    length = this.f13176p == null ? 0 : this.f13176p.length;
                    obj = new ao[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f13176p, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new ao();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new ao();
                    aVar.a(obj[length]);
                    this.f13176p = obj;
                    continue;
                case 186:
                    a3 = l.a(aVar, 186);
                    length = this.f13179s == null ? 0 : this.f13179s.length;
                    obj = new String[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f13179s, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = aVar.f();
                        aVar.a();
                        length++;
                    }
                    obj[length] = aVar.f();
                    this.f13179s = obj;
                    continue;
                case 192:
                    this.f13180t = aVar.e();
                    this.f13161a |= 8192;
                    continue;
                case 208:
                    this.f13181u = aVar.e();
                    this.f13161a |= 16384;
                    continue;
                case 216:
                    this.f13182v = aVar.e();
                    this.f13161a |= 32768;
                    continue;
                case 224:
                    this.f13183w = aVar.e();
                    this.f13161a |= 65536;
                    continue;
                case 242:
                    this.f13184x = aVar.f();
                    this.f13161a |= 131072;
                    continue;
                case 248:
                    this.f13161a |= 262144;
                    length = aVar.o();
                    try {
                        this.f13185y = jt.m12904d(aVar.i());
                        this.f13161a |= 262144;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(length);
                        m4918a(aVar, a2);
                        break;
                    }
                case 256:
                    this.f13186z = aVar.i();
                    this.f13161a |= 524288;
                    continue;
                case 266:
                    this.f13152A = aVar.f();
                    this.f13161a |= 1048576;
                    continue;
                case 274:
                    if (this.f13153B == null) {
                        this.f13153B = new es();
                    }
                    aVar.a(this.f13153B);
                    continue;
                case 282:
                    if (this.f13154C == null) {
                        this.f13154C = new kq();
                    }
                    aVar.a(this.f13154C);
                    continue;
                case 290:
                    if (this.f13155D == null) {
                        this.f13155D = new cx();
                    }
                    aVar.a(this.f13155D);
                    continue;
                case 298:
                    if (this.f13156E == null) {
                        this.f13156E = new li();
                    }
                    aVar.a(this.f13156E);
                    continue;
                case 304:
                    a = l.a(aVar, 304);
                    Object obj2 = new int[a];
                    length = 0;
                    for (a3 = 0; a3 < a; a3++) {
                        if (a3 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj2[length] = jt.m12903c(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                            aVar.e(o);
                            m4918a(aVar, a2);
                        }
                    }
                    if (length != 0) {
                        a3 = this.f13157F == null ? 0 : this.f13157F.length;
                        if (a3 != 0 || length != obj2.length) {
                            Object obj3 = new int[(a3 + length)];
                            if (a3 != 0) {
                                System.arraycopy(this.f13157F, 0, obj3, 0, a3);
                            }
                            System.arraycopy(obj2, 0, obj3, a3, length);
                            this.f13157F = obj3;
                            break;
                        }
                        this.f13157F = obj2;
                        break;
                    }
                    continue;
                case 306:
                    a2 = aVar.c(aVar.i());
                    a3 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            jt.m12903c(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e3) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a3);
                        if (this.f13157F == null) {
                            a3 = 0;
                        } else {
                            a3 = this.f13157F.length;
                        }
                        Object obj4 = new int[(length + a3)];
                        if (a3 != 0) {
                            System.arraycopy(this.f13157F, 0, obj4, 0, a3);
                        }
                        while (aVar.m() > 0) {
                            a = aVar.o();
                            try {
                                obj4[a3] = jt.m12903c(aVar.i());
                                a3++;
                            } catch (IllegalArgumentException e4) {
                                aVar.e(a);
                                m4918a(aVar, 304);
                            }
                        }
                        this.f13157F = obj4;
                    }
                    aVar.d(a2);
                    continue;
                case 322:
                    if (this.f13158G == null) {
                        this.f13158G = new he();
                    }
                    aVar.a(this.f13158G);
                    continue;
                case 330:
                    if (this.f13159H == null) {
                        this.f13159H = new C2444q();
                    }
                    aVar.a(this.f13159H);
                    continue;
                case 346:
                    this.f13160I = aVar.f();
                    this.f13161a |= 2097152;
                    continue;
                default:
                    if (!super.m4918a(aVar, a2)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public static C2441n m13098a(byte[] bArr) {
        return (C2441n) C0757i.m4905a(new C2441n(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m13099b(aVar);
    }
}
