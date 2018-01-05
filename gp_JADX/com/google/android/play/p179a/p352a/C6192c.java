package com.google.android.play.p179a.p352a;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.p177a.C2426a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C6192c extends C0758b {
    public String f30882A;
    public String f30883B;
    public boolean f30884C;
    public int f30885a;
    public long f30886b;
    public String f30887c;
    public long f30888d;
    public int f30889e;
    public String f30890f;
    public String f30891g;
    public String f30892h;
    public String f30893i;
    public String f30894j;
    public String f30895k;
    public String f30896l;
    public String f30897m;
    public String f30898n;
    public String f30899o;
    public String f30900p;
    public String f30901q;
    public String f30902r;
    public String f30903s;
    public int f30904t;
    public boolean f30905u;
    public boolean f30906v;
    public int f30907w;
    public C6193d f30908x;
    public C2426a f30909y;
    public String f30910z;

    public C6192c() {
        this.f30885a = 0;
        this.f30886b = 0;
        this.f30887c = "";
        this.f30888d = 0;
        this.f30889e = 0;
        this.f30890f = "";
        this.f30891g = "";
        this.f30892h = "";
        this.f30893i = "";
        this.f30894j = "";
        this.f30895k = "";
        this.f30896l = "";
        this.f30897m = "";
        this.f30898n = "";
        this.f30899o = "";
        this.f30900p = "";
        this.f30901q = "";
        this.f30902r = "";
        this.f30903s = "";
        this.f30904t = 0;
        this.f30905u = false;
        this.f30906v = false;
        this.f30907w = 0;
        this.f30908x = null;
        this.f30909y = null;
        this.f30910z = "";
        this.f30882A = "";
        this.f30883B = "";
        this.f30884C = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6192c)) {
            return false;
        }
        C6192c c6192c = (C6192c) obj;
        if ((this.f30885a & 1) != (c6192c.f30885a & 1)) {
            return false;
        }
        if (this.f30886b != c6192c.f30886b) {
            return false;
        }
        if ((this.f30885a & 2) != (c6192c.f30885a & 2)) {
            return false;
        }
        if (!this.f30887c.equals(c6192c.f30887c)) {
            return false;
        }
        if ((this.f30885a & 4) != (c6192c.f30885a & 4)) {
            return false;
        }
        if (this.f30888d != c6192c.f30888d) {
            return false;
        }
        if ((this.f30885a & 8) != (c6192c.f30885a & 8)) {
            return false;
        }
        if (this.f30889e != c6192c.f30889e) {
            return false;
        }
        if ((this.f30885a & 16) != (c6192c.f30885a & 16)) {
            return false;
        }
        if (!this.f30890f.equals(c6192c.f30890f)) {
            return false;
        }
        if ((this.f30885a & 32) != (c6192c.f30885a & 32)) {
            return false;
        }
        if (!this.f30891g.equals(c6192c.f30891g)) {
            return false;
        }
        if ((this.f30885a & 64) != (c6192c.f30885a & 64)) {
            return false;
        }
        if (!this.f30892h.equals(c6192c.f30892h)) {
            return false;
        }
        if ((this.f30885a & 128) != (c6192c.f30885a & 128)) {
            return false;
        }
        if (!this.f30893i.equals(c6192c.f30893i)) {
            return false;
        }
        if ((this.f30885a & 256) != (c6192c.f30885a & 256)) {
            return false;
        }
        if (!this.f30894j.equals(c6192c.f30894j)) {
            return false;
        }
        if ((this.f30885a & 512) != (c6192c.f30885a & 512)) {
            return false;
        }
        if (!this.f30895k.equals(c6192c.f30895k)) {
            return false;
        }
        if ((this.f30885a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (c6192c.f30885a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f30896l.equals(c6192c.f30896l)) {
            return false;
        }
        if ((this.f30885a & eq.FLAG_MOVED) != (c6192c.f30885a & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f30897m.equals(c6192c.f30897m)) {
            return false;
        }
        if ((this.f30885a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (c6192c.f30885a & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (!this.f30898n.equals(c6192c.f30898n)) {
            return false;
        }
        if ((this.f30885a & 8192) != (c6192c.f30885a & 8192)) {
            return false;
        }
        if (!this.f30899o.equals(c6192c.f30899o)) {
            return false;
        }
        if ((this.f30885a & 16384) != (c6192c.f30885a & 16384)) {
            return false;
        }
        if (!this.f30900p.equals(c6192c.f30900p)) {
            return false;
        }
        if ((this.f30885a & 32768) != (c6192c.f30885a & 32768)) {
            return false;
        }
        if (!this.f30901q.equals(c6192c.f30901q)) {
            return false;
        }
        if ((this.f30885a & 65536) != (c6192c.f30885a & 65536)) {
            return false;
        }
        if (!this.f30902r.equals(c6192c.f30902r)) {
            return false;
        }
        if ((this.f30885a & 131072) != (c6192c.f30885a & 131072)) {
            return false;
        }
        if (!this.f30903s.equals(c6192c.f30903s)) {
            return false;
        }
        if ((this.f30885a & 262144) != (c6192c.f30885a & 262144)) {
            return false;
        }
        if (this.f30904t != c6192c.f30904t) {
            return false;
        }
        if ((this.f30885a & 524288) != (c6192c.f30885a & 524288)) {
            return false;
        }
        if (this.f30905u != c6192c.f30905u) {
            return false;
        }
        if ((this.f30885a & 1048576) != (c6192c.f30885a & 1048576)) {
            return false;
        }
        if (this.f30906v != c6192c.f30906v) {
            return false;
        }
        if ((this.f30885a & 2097152) != (c6192c.f30885a & 2097152)) {
            return false;
        }
        if (this.f30907w != c6192c.f30907w) {
            return false;
        }
        if (this.f30908x == null) {
            if (c6192c.f30908x != null) {
                return false;
            }
        } else if (!this.f30908x.equals(c6192c.f30908x)) {
            return false;
        }
        if (this.f30909y == null) {
            if (c6192c.f30909y != null) {
                return false;
            }
        } else if (!this.f30909y.equals(c6192c.f30909y)) {
            return false;
        }
        if ((this.f30885a & 4194304) != (c6192c.f30885a & 4194304)) {
            return false;
        }
        if (!this.f30910z.equals(c6192c.f30910z)) {
            return false;
        }
        if ((this.f30885a & 8388608) != (c6192c.f30885a & 8388608)) {
            return false;
        }
        if (!this.f30882A.equals(c6192c.f30882A)) {
            return false;
        }
        if ((this.f30885a & 16777216) != (c6192c.f30885a & 16777216)) {
            return false;
        }
        if (!this.f30883B.equals(c6192c.f30883B)) {
            return false;
        }
        if ((this.f30885a & 33554432) != (c6192c.f30885a & 33554432)) {
            return false;
        }
        if (this.f30884C != c6192c.f30884C) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6192c.aO);
        }
        if (c6192c.aO == null || c6192c.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30886b;
        hashCode = (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30887c.hashCode();
        j = this.f30888d;
        int hashCode2 = ((this.f30905u ? 1231 : 1237) + (((((((((((((((((((((((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30889e) * 31) + this.f30890f.hashCode()) * 31) + this.f30891g.hashCode()) * 31) + this.f30892h.hashCode()) * 31) + this.f30893i.hashCode()) * 31) + this.f30894j.hashCode()) * 31) + this.f30895k.hashCode()) * 31) + this.f30896l.hashCode()) * 31) + this.f30897m.hashCode()) * 31) + this.f30898n.hashCode()) * 31) + this.f30899o.hashCode()) * 31) + this.f30900p.hashCode()) * 31) + this.f30901q.hashCode()) * 31) + this.f30902r.hashCode()) * 31) + this.f30903s.hashCode()) * 31) + this.f30904t) * 31)) * 31;
        if (this.f30906v) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode = ((hashCode + hashCode2) * 31) + this.f30907w;
        C6193d c6193d = this.f30908x;
        hashCode = (c6193d == null ? 0 : c6193d.hashCode()) + (hashCode * 31);
        C2426a c2426a = this.f30909y;
        hashCode = ((((((((c2426a == null ? 0 : c2426a.hashCode()) + (hashCode * 31)) * 31) + this.f30910z.hashCode()) * 31) + this.f30882A.hashCode()) * 31) + this.f30883B.hashCode()) * 31;
        if (!this.f30884C) {
            i = 1237;
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30885a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30886b);
        }
        if ((this.f30885a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30887c);
        }
        if ((this.f30885a & 8) != 0) {
            codedOutputByteBufferNano.a(3, this.f30889e);
        }
        if ((this.f30885a & 16) != 0) {
            codedOutputByteBufferNano.a(4, this.f30890f);
        }
        if ((this.f30885a & 32) != 0) {
            codedOutputByteBufferNano.a(5, this.f30891g);
        }
        if ((this.f30885a & 256) != 0) {
            codedOutputByteBufferNano.a(6, this.f30894j);
        }
        if ((this.f30885a & 512) != 0) {
            codedOutputByteBufferNano.a(7, this.f30895k);
        }
        if ((this.f30885a & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f30892h);
        }
        if ((this.f30885a & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f30893i);
        }
        if ((this.f30885a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(10, this.f30896l);
        }
        if ((this.f30885a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(11, this.f30897m);
        }
        if ((this.f30885a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(12, this.f30898n);
        }
        if ((this.f30885a & 8192) != 0) {
            codedOutputByteBufferNano.a(13, this.f30899o);
        }
        if ((this.f30885a & 16384) != 0) {
            codedOutputByteBufferNano.a(14, this.f30900p);
        }
        if ((this.f30885a & 32768) != 0) {
            codedOutputByteBufferNano.a(15, this.f30901q);
        }
        if ((this.f30885a & 65536) != 0) {
            codedOutputByteBufferNano.a(16, this.f30902r);
        }
        if ((this.f30885a & 131072) != 0) {
            codedOutputByteBufferNano.a(17, this.f30903s);
        }
        if ((this.f30885a & 4) != 0) {
            codedOutputByteBufferNano.b(18, this.f30888d);
        }
        if ((this.f30885a & 262144) != 0) {
            codedOutputByteBufferNano.a(19, this.f30904t);
        }
        if ((this.f30885a & 524288) != 0) {
            codedOutputByteBufferNano.a(20, this.f30905u);
        }
        if ((this.f30885a & 1048576) != 0) {
            codedOutputByteBufferNano.a(22, this.f30906v);
        }
        if ((this.f30885a & 2097152) != 0) {
            codedOutputByteBufferNano.a(23, this.f30907w);
        }
        if (this.f30908x != null) {
            codedOutputByteBufferNano.b(24, this.f30908x);
        }
        if (this.f30909y != null) {
            codedOutputByteBufferNano.b(25, this.f30909y);
        }
        if ((this.f30885a & 4194304) != 0) {
            codedOutputByteBufferNano.a(26, this.f30910z);
        }
        if ((this.f30885a & 8388608) != 0) {
            codedOutputByteBufferNano.a(27, this.f30882A);
        }
        if ((this.f30885a & 16777216) != 0) {
            codedOutputByteBufferNano.a(28, this.f30883B);
        }
        if ((this.f30885a & 33554432) != 0) {
            codedOutputByteBufferNano.a(29, this.f30884C);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30885a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30886b);
        }
        if ((this.f30885a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30887c);
        }
        if ((this.f30885a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f30889e);
        }
        if ((this.f30885a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30890f);
        }
        if ((this.f30885a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30891g);
        }
        if ((this.f30885a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30894j);
        }
        if ((this.f30885a & 512) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f30895k);
        }
        if ((this.f30885a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f30892h);
        }
        if ((this.f30885a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f30893i);
        }
        if ((this.f30885a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(10, this.f30896l);
        }
        if ((this.f30885a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(11, this.f30897m);
        }
        if ((this.f30885a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.b(12, this.f30898n);
        }
        if ((this.f30885a & 8192) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f30899o);
        }
        if ((this.f30885a & 16384) != 0) {
            b += CodedOutputByteBufferNano.b(14, this.f30900p);
        }
        if ((this.f30885a & 32768) != 0) {
            b += CodedOutputByteBufferNano.b(15, this.f30901q);
        }
        if ((this.f30885a & 65536) != 0) {
            b += CodedOutputByteBufferNano.b(16, this.f30902r);
        }
        if ((this.f30885a & 131072) != 0) {
            b += CodedOutputByteBufferNano.b(17, this.f30903s);
        }
        if ((this.f30885a & 4) != 0) {
            b += CodedOutputByteBufferNano.f(18, this.f30888d);
        }
        if ((this.f30885a & 262144) != 0) {
            b += CodedOutputByteBufferNano.d(19, this.f30904t);
        }
        if ((this.f30885a & 524288) != 0) {
            b += CodedOutputByteBufferNano.d(20) + 1;
        }
        if ((this.f30885a & 1048576) != 0) {
            b += CodedOutputByteBufferNano.d(22) + 1;
        }
        if ((this.f30885a & 2097152) != 0) {
            b += CodedOutputByteBufferNano.d(23, this.f30907w);
        }
        if (this.f30908x != null) {
            b += CodedOutputByteBufferNano.d(24, this.f30908x);
        }
        if (this.f30909y != null) {
            b += CodedOutputByteBufferNano.d(25, this.f30909y);
        }
        if ((this.f30885a & 4194304) != 0) {
            b += CodedOutputByteBufferNano.b(26, this.f30910z);
        }
        if ((this.f30885a & 8388608) != 0) {
            b += CodedOutputByteBufferNano.b(27, this.f30882A);
        }
        if ((this.f30885a & 16777216) != 0) {
            b += CodedOutputByteBufferNano.b(28, this.f30883B);
        }
        if ((this.f30885a & 33554432) != 0) {
            return b + (CodedOutputByteBufferNano.d(29) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6192c m28608b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r6 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
    L_0x0002:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000f;
            case 8: goto L_0x0010;
            case 18: goto L_0x001d;
            case 24: goto L_0x002a;
            case 34: goto L_0x0037;
            case 42: goto L_0x0044;
            case 50: goto L_0x0051;
            case 58: goto L_0x005e;
            case 66: goto L_0x006b;
            case 74: goto L_0x0078;
            case 82: goto L_0x0086;
            case 90: goto L_0x0094;
            case 98: goto L_0x00a2;
            case 106: goto L_0x00b0;
            case 114: goto L_0x00be;
            case 122: goto L_0x00cc;
            case 130: goto L_0x00dc;
            case 138: goto L_0x00eb;
            case 144: goto L_0x00fa;
            case 152: goto L_0x0108;
            case 160: goto L_0x0117;
            case 176: goto L_0x0126;
            case 184: goto L_0x0135;
            case 194: goto L_0x0172;
            case 202: goto L_0x0184;
            case 210: goto L_0x0196;
            case 218: goto L_0x01a5;
            case 226: goto L_0x01b4;
            case 232: goto L_0x01c3;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0002;
    L_0x000f:
        return r7;
    L_0x0010:
        r0 = r8.j();
        r7.f30886b = r0;
        r0 = r7.f30885a;
        r0 = r0 | 1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x001d:
        r0 = r8.f();
        r7.f30887c = r0;
        r0 = r7.f30885a;
        r0 = r0 | 2;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x002a:
        r0 = r8.i();
        r7.f30889e = r0;
        r0 = r7.f30885a;
        r0 = r0 | 8;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0037:
        r0 = r8.f();
        r7.f30890f = r0;
        r0 = r7.f30885a;
        r0 = r0 | 16;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0044:
        r0 = r8.f();
        r7.f30891g = r0;
        r0 = r7.f30885a;
        r0 = r0 | 32;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0051:
        r0 = r8.f();
        r7.f30894j = r0;
        r0 = r7.f30885a;
        r0 = r0 | 256;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x005e:
        r0 = r8.f();
        r7.f30895k = r0;
        r0 = r7.f30885a;
        r0 = r0 | 512;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x006b:
        r0 = r8.f();
        r7.f30892h = r0;
        r0 = r7.f30885a;
        r0 = r0 | 64;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0078:
        r0 = r8.f();
        r7.f30893i = r0;
        r0 = r7.f30885a;
        r0 = r0 | 128;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0086:
        r0 = r8.f();
        r7.f30896l = r0;
        r0 = r7.f30885a;
        r0 = r0 | 1024;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0094:
        r0 = r8.f();
        r7.f30897m = r0;
        r0 = r7.f30885a;
        r0 = r0 | 2048;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x00a2:
        r0 = r8.f();
        r7.f30898n = r0;
        r0 = r7.f30885a;
        r0 = r0 | 4096;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x00b0:
        r0 = r8.f();
        r7.f30899o = r0;
        r0 = r7.f30885a;
        r0 = r0 | 8192;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x00be:
        r0 = r8.f();
        r7.f30900p = r0;
        r0 = r7.f30885a;
        r0 = r0 | 16384;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x00cc:
        r0 = r8.f();
        r7.f30901q = r0;
        r0 = r7.f30885a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x00dc:
        r0 = r8.f();
        r7.f30902r = r0;
        r0 = r7.f30885a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x00eb:
        r0 = r8.f();
        r7.f30903s = r0;
        r0 = r7.f30885a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x00fa:
        r0 = r8.j();
        r7.f30888d = r0;
        r0 = r7.f30885a;
        r0 = r0 | 4;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0108:
        r0 = r8.i();
        r7.f30904t = r0;
        r0 = r7.f30885a;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0117:
        r0 = r8.e();
        r7.f30905u = r0;
        r0 = r7.f30885a;
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0126:
        r0 = r8.e();
        r7.f30906v = r0;
        r0 = r7.f30885a;
        r1 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x0135:
        r1 = r7.f30885a;
        r1 = r1 | r6;
        r7.f30885a = r1;
        r1 = r8.o();
        r2 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0160 }
        switch(r2) {
            case 0: goto L_0x0169;
            case 1: goto L_0x0169;
            case 2: goto L_0x0169;
            default: goto L_0x0145;
        };	 Catch:{ IllegalArgumentException -> 0x0160 }
    L_0x0145:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0160 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0160 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0160 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0160 }
    L_0x0160:
        r2 = move-exception;
        r8.e(r1);
        r7.m4918a(r8, r0);
        goto L_0x0002;
    L_0x0169:
        r7.f30907w = r2;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = r7.f30885a;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = r2 | r6;
        r7.f30885a = r2;	 Catch:{ IllegalArgumentException -> 0x0160 }
        goto L_0x0002;
    L_0x0172:
        r0 = r7.f30908x;
        if (r0 != 0) goto L_0x017d;
    L_0x0176:
        r0 = new com.google.android.play.a.a.d;
        r0.<init>();
        r7.f30908x = r0;
    L_0x017d:
        r0 = r7.f30908x;
        r8.a(r0);
        goto L_0x0002;
    L_0x0184:
        r0 = r7.f30909y;
        if (r0 != 0) goto L_0x018f;
    L_0x0188:
        r0 = new com.google.android.finsky.cv.a.a;
        r0.<init>();
        r7.f30909y = r0;
    L_0x018f:
        r0 = r7.f30909y;
        r8.a(r0);
        goto L_0x0002;
    L_0x0196:
        r0 = r8.f();
        r7.f30910z = r0;
        r0 = r7.f30885a;
        r1 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x01a5:
        r0 = r8.f();
        r7.f30882A = r0;
        r0 = r7.f30885a;
        r1 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x01b4:
        r0 = r8.f();
        r7.f30883B = r0;
        r0 = r7.f30885a;
        r1 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
    L_0x01c3:
        r0 = r8.e();
        r7.f30884C = r0;
        r0 = r7.f30885a;
        r1 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r0 = r0 | r1;
        r7.f30885a = r0;
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.c.b(com.google.protobuf.nano.a):com.google.android.play.a.a.c");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28608b(aVar);
    }
}
