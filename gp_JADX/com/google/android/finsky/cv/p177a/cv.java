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
import java.util.Arrays;

public final class cv extends C0758b {
    public static volatile cv[] f12083a;
    public String f12084A;
    public String f12085B;
    public boolean f12086C;
    public byte[] f12087D;
    public boolean f12088E;
    public boolean f12089F;
    public iv[] f12090G;
    public boolean f12091H;
    public boolean f12092I;
    public String f12093J;
    public int f12094K;
    public int f12095b;
    public String f12096c;
    public String f12097d;
    public int f12098e;
    public int f12099f;
    public String f12100g;
    public String f12101h;
    public String f12102i;
    public String f12103j;
    public String f12104k;
    public String f12105l;
    public String f12106m;
    public bl[] f12107n;
    public dm f12108o;
    public bd[] f12109p;
    public cv[] f12110q;
    public cd f12111r;
    public co f12112s;
    public cq f12113t;
    public hr f12114u;
    public C2440m f12115v;
    public String f12116w;
    public String f12117x;
    public String f12118y;
    public String f12119z;

    public static cv[] aS_() {
        if (f12083a == null) {
            synchronized (h.b) {
                if (f12083a == null) {
                    f12083a = new cv[0];
                }
            }
        }
        return f12083a;
    }

    public final cv m12387a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f12095b |= 1;
        this.f12096c = str;
        return this;
    }

    public final cv m12392b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f12095b |= 2;
        this.f12097d = str;
        return this;
    }

    public final cv m12386a(int i) {
        this.f12098e = i;
        this.f12095b |= 4;
        return this;
    }

    public final cv m12391b(int i) {
        this.f12099f = i;
        this.f12095b |= 8;
        return this;
    }

    public cv() {
        this.f12095b = 0;
        this.f12096c = "";
        this.f12097d = "";
        this.f12098e = 1;
        this.f12099f = 0;
        this.f12100g = "";
        this.f12101h = "";
        this.f12102i = "";
        this.f12103j = "";
        this.f12104k = "";
        this.f12105l = "";
        this.f12106m = "";
        this.f12107n = bl.aK_();
        this.f12108o = null;
        this.f12109p = bd.aH_();
        this.f12110q = cv.aS_();
        this.f12111r = null;
        this.f12112s = null;
        this.f12113t = null;
        this.f12114u = null;
        this.f12115v = null;
        this.f12116w = "";
        this.f12117x = "";
        this.f12118y = "";
        this.f12119z = "";
        this.f12084A = "";
        this.f12085B = "";
        this.f12086C = false;
        this.f12087D = l.l;
        this.f12088E = false;
        this.f12089F = false;
        this.f12090G = iv.bt_();
        this.f12091H = false;
        this.f12092I = false;
        this.f12093J = "";
        this.f12094K = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        if ((this.f12095b & 1) != (cvVar.f12095b & 1)) {
            return false;
        }
        if (!this.f12096c.equals(cvVar.f12096c)) {
            return false;
        }
        if ((this.f12095b & 2) != (cvVar.f12095b & 2)) {
            return false;
        }
        if (!this.f12097d.equals(cvVar.f12097d)) {
            return false;
        }
        if ((this.f12095b & 4) != (cvVar.f12095b & 4)) {
            return false;
        }
        if (this.f12098e != cvVar.f12098e) {
            return false;
        }
        if ((this.f12095b & 8) != (cvVar.f12095b & 8)) {
            return false;
        }
        if (this.f12099f != cvVar.f12099f) {
            return false;
        }
        if ((this.f12095b & 16) != (cvVar.f12095b & 16)) {
            return false;
        }
        if (!this.f12100g.equals(cvVar.f12100g)) {
            return false;
        }
        if ((this.f12095b & 32) != (cvVar.f12095b & 32)) {
            return false;
        }
        if (!this.f12101h.equals(cvVar.f12101h)) {
            return false;
        }
        if ((this.f12095b & 64) != (cvVar.f12095b & 64)) {
            return false;
        }
        if (!this.f12102i.equals(cvVar.f12102i)) {
            return false;
        }
        if ((this.f12095b & 128) != (cvVar.f12095b & 128)) {
            return false;
        }
        if (!this.f12103j.equals(cvVar.f12103j)) {
            return false;
        }
        if ((this.f12095b & 256) != (cvVar.f12095b & 256)) {
            return false;
        }
        if (!this.f12104k.equals(cvVar.f12104k)) {
            return false;
        }
        if ((this.f12095b & 512) != (cvVar.f12095b & 512)) {
            return false;
        }
        if (!this.f12105l.equals(cvVar.f12105l)) {
            return false;
        }
        if ((this.f12095b & MemoryMappedFileBuffer.DEFAULT_PADDING) != (cvVar.f12095b & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f12106m.equals(cvVar.f12106m)) {
            return false;
        }
        if (!h.a(this.f12107n, cvVar.f12107n)) {
            return false;
        }
        if (this.f12108o == null) {
            if (cvVar.f12108o != null) {
                return false;
            }
        } else if (!this.f12108o.equals(cvVar.f12108o)) {
            return false;
        }
        if (!h.a(this.f12109p, cvVar.f12109p)) {
            return false;
        }
        if (!h.a(this.f12110q, cvVar.f12110q)) {
            return false;
        }
        if (this.f12111r == null) {
            if (cvVar.f12111r != null) {
                return false;
            }
        } else if (!this.f12111r.equals(cvVar.f12111r)) {
            return false;
        }
        if (this.f12112s == null) {
            if (cvVar.f12112s != null) {
                return false;
            }
        } else if (!this.f12112s.equals(cvVar.f12112s)) {
            return false;
        }
        if (this.f12113t == null) {
            if (cvVar.f12113t != null) {
                return false;
            }
        } else if (!this.f12113t.equals(cvVar.f12113t)) {
            return false;
        }
        if (this.f12114u == null) {
            if (cvVar.f12114u != null) {
                return false;
            }
        } else if (!this.f12114u.equals(cvVar.f12114u)) {
            return false;
        }
        if (this.f12115v == null) {
            if (cvVar.f12115v != null) {
                return false;
            }
        } else if (!this.f12115v.equals(cvVar.f12115v)) {
            return false;
        }
        if ((this.f12095b & eq.FLAG_MOVED) != (cvVar.f12095b & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f12116w.equals(cvVar.f12116w)) {
            return false;
        }
        if ((this.f12095b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (cvVar.f12095b & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (!this.f12117x.equals(cvVar.f12117x)) {
            return false;
        }
        if ((this.f12095b & 8192) != (cvVar.f12095b & 8192)) {
            return false;
        }
        if (!this.f12118y.equals(cvVar.f12118y)) {
            return false;
        }
        if ((this.f12095b & 16384) != (cvVar.f12095b & 16384)) {
            return false;
        }
        if (!this.f12119z.equals(cvVar.f12119z)) {
            return false;
        }
        if ((this.f12095b & 32768) != (cvVar.f12095b & 32768)) {
            return false;
        }
        if (!this.f12084A.equals(cvVar.f12084A)) {
            return false;
        }
        if ((this.f12095b & 65536) != (cvVar.f12095b & 65536)) {
            return false;
        }
        if (!this.f12085B.equals(cvVar.f12085B)) {
            return false;
        }
        if ((this.f12095b & 131072) != (cvVar.f12095b & 131072)) {
            return false;
        }
        if (this.f12086C != cvVar.f12086C) {
            return false;
        }
        if ((this.f12095b & 262144) != (cvVar.f12095b & 262144)) {
            return false;
        }
        if (!Arrays.equals(this.f12087D, cvVar.f12087D)) {
            return false;
        }
        if ((this.f12095b & 524288) != (cvVar.f12095b & 524288)) {
            return false;
        }
        if (this.f12088E != cvVar.f12088E) {
            return false;
        }
        if ((this.f12095b & 1048576) != (cvVar.f12095b & 1048576)) {
            return false;
        }
        if (this.f12089F != cvVar.f12089F) {
            return false;
        }
        if (!h.a(this.f12090G, cvVar.f12090G)) {
            return false;
        }
        if ((this.f12095b & 2097152) != (cvVar.f12095b & 2097152)) {
            return false;
        }
        if (this.f12091H != cvVar.f12091H) {
            return false;
        }
        if ((this.f12095b & 4194304) != (cvVar.f12095b & 4194304)) {
            return false;
        }
        if (this.f12092I != cvVar.f12092I) {
            return false;
        }
        if ((this.f12095b & 8388608) != (cvVar.f12095b & 8388608)) {
            return false;
        }
        if (!this.f12093J.equals(cvVar.f12093J)) {
            return false;
        }
        if ((this.f12095b & 16777216) != (cvVar.f12095b & 16777216)) {
            return false;
        }
        if (this.f12094K != cvVar.f12094K) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cvVar.aO);
        }
        if (cvVar.aO == null || cvVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = ((((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12096c.hashCode()) * 31) + this.f12097d.hashCode()) * 31) + this.f12098e) * 31) + this.f12099f) * 31) + this.f12100g.hashCode()) * 31) + this.f12101h.hashCode()) * 31) + this.f12102i.hashCode()) * 31) + this.f12103j.hashCode()) * 31) + this.f12104k.hashCode()) * 31) + this.f12105l.hashCode()) * 31) + this.f12106m.hashCode()) * 31) + h.a(this.f12107n);
        dm dmVar = this.f12108o;
        hashCode = (((((dmVar == null ? 0 : dmVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f12109p)) * 31) + h.a(this.f12110q);
        cd cdVar = this.f12111r;
        hashCode = (cdVar == null ? 0 : cdVar.hashCode()) + (hashCode * 31);
        co coVar = this.f12112s;
        hashCode = (coVar == null ? 0 : coVar.hashCode()) + (hashCode * 31);
        cq cqVar = this.f12113t;
        hashCode = (cqVar == null ? 0 : cqVar.hashCode()) + (hashCode * 31);
        hr hrVar = this.f12114u;
        hashCode = (hrVar == null ? 0 : hrVar.hashCode()) + (hashCode * 31);
        C2440m c2440m = this.f12115v;
        int hashCode2 = ((((this.f12086C ? 1231 : 1237) + (((((((((((((((c2440m == null ? 0 : c2440m.hashCode()) + (hashCode * 31)) * 31) + this.f12116w.hashCode()) * 31) + this.f12117x.hashCode()) * 31) + this.f12118y.hashCode()) * 31) + this.f12119z.hashCode()) * 31) + this.f12084A.hashCode()) * 31) + this.f12085B.hashCode()) * 31)) * 31) + Arrays.hashCode(this.f12087D)) * 31;
        if (this.f12088E) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f12089F) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode2 = (((hashCode + hashCode2) * 31) + h.a(this.f12090G)) * 31;
        if (this.f12091H) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode = (hashCode + hashCode2) * 31;
        if (!this.f12092I) {
            i = 1237;
        }
        hashCode = (((((hashCode + i) * 31) + this.f12093J.hashCode()) * 31) + this.f12094K) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12095b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12096c);
        }
        if ((this.f12095b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12097d);
        }
        if ((this.f12095b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12098e);
        }
        if ((this.f12095b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12099f);
        }
        if ((this.f12095b & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12100g);
        }
        if ((this.f12095b & 64) != 0) {
            codedOutputByteBufferNano.a(6, this.f12102i);
        }
        if ((this.f12095b & 128) != 0) {
            codedOutputByteBufferNano.a(7, this.f12103j);
        }
        if (this.f12107n != null && this.f12107n.length > 0) {
            for (C0757i c0757i : this.f12107n) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(8, c0757i);
                }
            }
        }
        if (this.f12108o != null) {
            codedOutputByteBufferNano.b(9, this.f12108o);
        }
        if (this.f12109p != null && this.f12109p.length > 0) {
            for (C0757i c0757i2 : this.f12109p) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(10, c0757i2);
                }
            }
        }
        if (this.f12110q != null && this.f12110q.length > 0) {
            for (C0757i c0757i22 : this.f12110q) {
                if (c0757i22 != null) {
                    codedOutputByteBufferNano.b(11, c0757i22);
                }
            }
        }
        if (this.f12111r != null) {
            codedOutputByteBufferNano.b(12, this.f12111r);
        }
        if (this.f12112s != null) {
            codedOutputByteBufferNano.b(13, this.f12112s);
        }
        if (this.f12114u != null) {
            codedOutputByteBufferNano.b(14, this.f12114u);
        }
        if (this.f12115v != null) {
            codedOutputByteBufferNano.b(15, this.f12115v);
        }
        if ((this.f12095b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(16, this.f12116w);
        }
        if ((this.f12095b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(17, this.f12117x);
        }
        if ((this.f12095b & 8192) != 0) {
            codedOutputByteBufferNano.a(18, this.f12118y);
        }
        if ((this.f12095b & 65536) != 0) {
            codedOutputByteBufferNano.a(19, this.f12085B);
        }
        if ((this.f12095b & 131072) != 0) {
            codedOutputByteBufferNano.a(21, this.f12086C);
        }
        if ((this.f12095b & 32) != 0) {
            codedOutputByteBufferNano.a(22, this.f12101h);
        }
        if ((this.f12095b & 256) != 0) {
            codedOutputByteBufferNano.a(23, this.f12104k);
        }
        if ((this.f12095b & 262144) != 0) {
            codedOutputByteBufferNano.a(24, this.f12087D);
        }
        if (this.f12113t != null) {
            codedOutputByteBufferNano.b(25, this.f12113t);
        }
        if ((this.f12095b & 524288) != 0) {
            codedOutputByteBufferNano.a(26, this.f12088E);
        }
        if ((this.f12095b & 512) != 0) {
            codedOutputByteBufferNano.a(27, this.f12105l);
        }
        if ((this.f12095b & 1048576) != 0) {
            codedOutputByteBufferNano.a(29, this.f12089F);
        }
        if (this.f12090G != null && this.f12090G.length > 0) {
            while (i < this.f12090G.length) {
                C0757i c0757i3 = this.f12090G[i];
                if (c0757i3 != null) {
                    codedOutputByteBufferNano.b(30, c0757i3);
                }
                i++;
            }
        }
        if ((this.f12095b & 32768) != 0) {
            codedOutputByteBufferNano.a(31, this.f12084A);
        }
        if ((this.f12095b & 2097152) != 0) {
            codedOutputByteBufferNano.a(32, this.f12091H);
        }
        if ((this.f12095b & 4194304) != 0) {
            codedOutputByteBufferNano.a(33, this.f12092I);
        }
        if ((this.f12095b & 16384) != 0) {
            codedOutputByteBufferNano.a(34, this.f12119z);
        }
        if ((this.f12095b & 8388608) != 0) {
            codedOutputByteBufferNano.a(35, this.f12093J);
        }
        if ((this.f12095b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(36, this.f12106m);
        }
        if ((this.f12095b & 16777216) != 0) {
            codedOutputByteBufferNano.a(37, this.f12094K);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f12095b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12096c);
        }
        if ((this.f12095b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12097d);
        }
        if ((this.f12095b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12098e);
        }
        if ((this.f12095b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f12099f);
        }
        if ((this.f12095b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12100g);
        }
        if ((this.f12095b & 64) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f12102i);
        }
        if ((this.f12095b & 128) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f12103j);
        }
        if (this.f12107n != null && this.f12107n.length > 0) {
            i = b;
            for (C0757i c0757i : this.f12107n) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(8, c0757i);
                }
            }
            b = i;
        }
        if (this.f12108o != null) {
            b += CodedOutputByteBufferNano.d(9, this.f12108o);
        }
        if (this.f12109p != null && this.f12109p.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f12109p) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(10, c0757i2);
                }
            }
            b = i;
        }
        if (this.f12110q != null && this.f12110q.length > 0) {
            i = b;
            for (C0757i c0757i22 : this.f12110q) {
                if (c0757i22 != null) {
                    i += CodedOutputByteBufferNano.d(11, c0757i22);
                }
            }
            b = i;
        }
        if (this.f12111r != null) {
            b += CodedOutputByteBufferNano.d(12, this.f12111r);
        }
        if (this.f12112s != null) {
            b += CodedOutputByteBufferNano.d(13, this.f12112s);
        }
        if (this.f12114u != null) {
            b += CodedOutputByteBufferNano.d(14, this.f12114u);
        }
        if (this.f12115v != null) {
            b += CodedOutputByteBufferNano.d(15, this.f12115v);
        }
        if ((this.f12095b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(16, this.f12116w);
        }
        if ((this.f12095b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.b(17, this.f12117x);
        }
        if ((this.f12095b & 8192) != 0) {
            b += CodedOutputByteBufferNano.b(18, this.f12118y);
        }
        if ((this.f12095b & 65536) != 0) {
            b += CodedOutputByteBufferNano.b(19, this.f12085B);
        }
        if ((this.f12095b & 131072) != 0) {
            b += CodedOutputByteBufferNano.d(21) + 1;
        }
        if ((this.f12095b & 32) != 0) {
            b += CodedOutputByteBufferNano.b(22, this.f12101h);
        }
        if ((this.f12095b & 256) != 0) {
            b += CodedOutputByteBufferNano.b(23, this.f12104k);
        }
        if ((this.f12095b & 262144) != 0) {
            b += CodedOutputByteBufferNano.b(24, this.f12087D);
        }
        if (this.f12113t != null) {
            b += CodedOutputByteBufferNano.d(25, this.f12113t);
        }
        if ((this.f12095b & 524288) != 0) {
            b += CodedOutputByteBufferNano.d(26) + 1;
        }
        if ((this.f12095b & 512) != 0) {
            b += CodedOutputByteBufferNano.b(27, this.f12105l);
        }
        if ((this.f12095b & 1048576) != 0) {
            b += CodedOutputByteBufferNano.d(29) + 1;
        }
        if (this.f12090G != null && this.f12090G.length > 0) {
            while (i2 < this.f12090G.length) {
                C0757i c0757i3 = this.f12090G[i2];
                if (c0757i3 != null) {
                    b += CodedOutputByteBufferNano.d(30, c0757i3);
                }
                i2++;
            }
        }
        if ((this.f12095b & 32768) != 0) {
            b += CodedOutputByteBufferNano.b(31, this.f12084A);
        }
        if ((this.f12095b & 2097152) != 0) {
            b += CodedOutputByteBufferNano.d(32) + 1;
        }
        if ((this.f12095b & 4194304) != 0) {
            b += CodedOutputByteBufferNano.d(33) + 1;
        }
        if ((this.f12095b & 16384) != 0) {
            b += CodedOutputByteBufferNano.b(34, this.f12119z);
        }
        if ((this.f12095b & 8388608) != 0) {
            b += CodedOutputByteBufferNano.b(35, this.f12093J);
        }
        if ((this.f12095b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(36, this.f12106m);
        }
        if ((this.f12095b & 16777216) != 0) {
            return b + CodedOutputByteBufferNano.d(37, this.f12094K);
        }
        return b;
    }

    private final cv m12385b(a aVar) {
        while (true) {
            int a = aVar.a();
            int o;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12096c = aVar.f();
                    this.f12095b |= 1;
                    continue;
                case 18:
                    this.f12097d = aVar.f();
                    this.f12095b |= 2;
                    continue;
                case 24:
                    this.f12095b |= 4;
                    o = aVar.o();
                    try {
                        this.f12098e = ay.m12224a(aVar.i());
                        this.f12095b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 32:
                    this.f12095b |= 8;
                    o = aVar.o();
                    try {
                        this.f12099f = aw.m12218a(aVar.i());
                        this.f12095b |= 8;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 42:
                    this.f12100g = aVar.f();
                    this.f12095b |= 16;
                    continue;
                case 50:
                    this.f12102i = aVar.f();
                    this.f12095b |= 64;
                    continue;
                case 58:
                    this.f12103j = aVar.f();
                    this.f12095b |= 128;
                    continue;
                case 66:
                    o = l.a(aVar, 66);
                    a = this.f12107n == null ? 0 : this.f12107n.length;
                    obj = new bl[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12107n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bl();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bl();
                    aVar.a(obj[a]);
                    this.f12107n = obj;
                    continue;
                case 74:
                    if (this.f12108o == null) {
                        this.f12108o = new dm();
                    }
                    aVar.a(this.f12108o);
                    continue;
                case 82:
                    o = l.a(aVar, 82);
                    a = this.f12109p == null ? 0 : this.f12109p.length;
                    obj = new bd[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12109p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bd();
                    aVar.a(obj[a]);
                    this.f12109p = obj;
                    continue;
                case 90:
                    o = l.a(aVar, 90);
                    a = this.f12110q == null ? 0 : this.f12110q.length;
                    obj = new cv[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12110q, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cv();
                    aVar.a(obj[a]);
                    this.f12110q = obj;
                    continue;
                case 98:
                    if (this.f12111r == null) {
                        this.f12111r = new cd();
                    }
                    aVar.a(this.f12111r);
                    continue;
                case 106:
                    if (this.f12112s == null) {
                        this.f12112s = new co();
                    }
                    aVar.a(this.f12112s);
                    continue;
                case 114:
                    if (this.f12114u == null) {
                        this.f12114u = new hr();
                    }
                    aVar.a(this.f12114u);
                    continue;
                case 122:
                    if (this.f12115v == null) {
                        this.f12115v = new C2440m();
                    }
                    aVar.a(this.f12115v);
                    continue;
                case 130:
                    this.f12116w = aVar.f();
                    this.f12095b |= eq.FLAG_MOVED;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f12117x = aVar.f();
                    this.f12095b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 146:
                    this.f12118y = aVar.f();
                    this.f12095b |= 8192;
                    continue;
                case 154:
                    this.f12085B = aVar.f();
                    this.f12095b |= 65536;
                    continue;
                case 168:
                    this.f12086C = aVar.e();
                    this.f12095b |= 131072;
                    continue;
                case 178:
                    this.f12101h = aVar.f();
                    this.f12095b |= 32;
                    continue;
                case 186:
                    this.f12104k = aVar.f();
                    this.f12095b |= 256;
                    continue;
                case 194:
                    this.f12087D = aVar.g();
                    this.f12095b |= 262144;
                    continue;
                case 202:
                    if (this.f12113t == null) {
                        this.f12113t = new cq();
                    }
                    aVar.a(this.f12113t);
                    continue;
                case 208:
                    this.f12088E = aVar.e();
                    this.f12095b |= 524288;
                    continue;
                case 218:
                    this.f12105l = aVar.f();
                    this.f12095b |= 512;
                    continue;
                case 232:
                    this.f12089F = aVar.e();
                    this.f12095b |= 1048576;
                    continue;
                case 242:
                    o = l.a(aVar, 242);
                    a = this.f12090G == null ? 0 : this.f12090G.length;
                    obj = new iv[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12090G, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new iv();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new iv();
                    aVar.a(obj[a]);
                    this.f12090G = obj;
                    continue;
                case 250:
                    this.f12084A = aVar.f();
                    this.f12095b |= 32768;
                    continue;
                case 256:
                    this.f12091H = aVar.e();
                    this.f12095b |= 2097152;
                    continue;
                case 264:
                    this.f12092I = aVar.e();
                    this.f12095b |= 4194304;
                    continue;
                case 274:
                    this.f12119z = aVar.f();
                    this.f12095b |= 16384;
                    continue;
                case 282:
                    this.f12093J = aVar.f();
                    this.f12095b |= 8388608;
                    continue;
                case 290:
                    this.f12106m = aVar.f();
                    this.f12095b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 296:
                    this.f12095b |= 16777216;
                    o = aVar.o();
                    try {
                        this.f12094K = iz.m12843a(aVar.i());
                        this.f12095b |= 16777216;
                        continue;
                    } catch (IllegalArgumentException e3) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public static cv m12384a(byte[] bArr) {
        return (cv) C0757i.m4905a(new cv(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12385b(aVar);
    }
}
