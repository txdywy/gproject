package com.google.android.play.p179a.p352a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Arrays;

public final class C6205p extends C0758b {
    public static volatile C6205p[] f30992a;
    public int f30993b;
    public long f30994c;
    public long f30995d;
    public long f30996e;
    public String f30997f;
    public int f30998g;
    public int f30999h;
    public boolean f31000i;
    public C6206q[] f31001j;
    public byte[] f31002k;
    public C6194e f31003l;
    public byte[] f31004m;
    public String f31005n;
    public String f31006o;
    public C6191b f31007p;
    public String f31008q;
    public long f31009r;
    public C6201l f31010s;
    public byte[] f31011t;
    public String f31012u;
    public int f31013v;
    public int[] f31014w;
    public long f31015x;
    public C6209t f31016y;
    public boolean f31017z;

    public static C6205p[] cG_() {
        if (f30992a == null) {
            synchronized (h.b) {
                if (f30992a == null) {
                    f30992a = new C6205p[0];
                }
            }
        }
        return f30992a;
    }

    public C6205p() {
        this.f30993b = 0;
        this.f30994c = 0;
        this.f30995d = 0;
        this.f30996e = 0;
        this.f30997f = "";
        this.f30998g = 0;
        this.f30999h = 0;
        this.f31000i = false;
        this.f31001j = C6206q.cH_();
        this.f31002k = l.l;
        this.f31003l = null;
        this.f31004m = l.l;
        this.f31005n = "";
        this.f31006o = "";
        this.f31007p = null;
        this.f31008q = "";
        this.f31009r = 180000;
        this.f31010s = null;
        this.f31011t = l.l;
        this.f31012u = "";
        this.f31013v = 0;
        this.f31014w = l.e;
        this.f31015x = 0;
        this.f31016y = null;
        this.f31017z = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6205p)) {
            return false;
        }
        C6205p c6205p = (C6205p) obj;
        if ((this.f30993b & 1) != (c6205p.f30993b & 1)) {
            return false;
        }
        if (this.f30994c != c6205p.f30994c) {
            return false;
        }
        if ((this.f30993b & 2) != (c6205p.f30993b & 2)) {
            return false;
        }
        if (this.f30995d != c6205p.f30995d) {
            return false;
        }
        if ((this.f30993b & 4) != (c6205p.f30993b & 4)) {
            return false;
        }
        if (this.f30996e != c6205p.f30996e) {
            return false;
        }
        if ((this.f30993b & 8) != (c6205p.f30993b & 8)) {
            return false;
        }
        if (!this.f30997f.equals(c6205p.f30997f)) {
            return false;
        }
        if ((this.f30993b & 16) != (c6205p.f30993b & 16)) {
            return false;
        }
        if (this.f30998g != c6205p.f30998g) {
            return false;
        }
        if ((this.f30993b & 32) != (c6205p.f30993b & 32)) {
            return false;
        }
        if (this.f30999h != c6205p.f30999h) {
            return false;
        }
        if ((this.f30993b & 64) != (c6205p.f30993b & 64)) {
            return false;
        }
        if (this.f31000i != c6205p.f31000i) {
            return false;
        }
        if (!h.a(this.f31001j, c6205p.f31001j)) {
            return false;
        }
        if ((this.f30993b & 128) != (c6205p.f30993b & 128)) {
            return false;
        }
        if (!Arrays.equals(this.f31002k, c6205p.f31002k)) {
            return false;
        }
        if (this.f31003l == null) {
            if (c6205p.f31003l != null) {
                return false;
            }
        } else if (!this.f31003l.equals(c6205p.f31003l)) {
            return false;
        }
        if ((this.f30993b & 256) != (c6205p.f30993b & 256)) {
            return false;
        }
        if (!Arrays.equals(this.f31004m, c6205p.f31004m)) {
            return false;
        }
        if ((this.f30993b & 512) != (c6205p.f30993b & 512)) {
            return false;
        }
        if (!this.f31005n.equals(c6205p.f31005n)) {
            return false;
        }
        if ((this.f30993b & MemoryMappedFileBuffer.DEFAULT_PADDING) != (c6205p.f30993b & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f31006o.equals(c6205p.f31006o)) {
            return false;
        }
        if (this.f31007p == null) {
            if (c6205p.f31007p != null) {
                return false;
            }
        } else if (!this.f31007p.equals(c6205p.f31007p)) {
            return false;
        }
        if ((this.f30993b & eq.FLAG_MOVED) != (c6205p.f30993b & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f31008q.equals(c6205p.f31008q)) {
            return false;
        }
        if ((this.f30993b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (c6205p.f30993b & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (this.f31009r != c6205p.f31009r) {
            return false;
        }
        if (this.f31010s == null) {
            if (c6205p.f31010s != null) {
                return false;
            }
        } else if (!this.f31010s.equals(c6205p.f31010s)) {
            return false;
        }
        if ((this.f30993b & 8192) != (c6205p.f30993b & 8192)) {
            return false;
        }
        if (!Arrays.equals(this.f31011t, c6205p.f31011t)) {
            return false;
        }
        if ((this.f30993b & 16384) != (c6205p.f30993b & 16384)) {
            return false;
        }
        if (!this.f31012u.equals(c6205p.f31012u)) {
            return false;
        }
        if ((this.f30993b & 32768) != (c6205p.f30993b & 32768)) {
            return false;
        }
        if (this.f31013v != c6205p.f31013v) {
            return false;
        }
        if (!h.a(this.f31014w, c6205p.f31014w)) {
            return false;
        }
        if ((this.f30993b & 65536) != (c6205p.f30993b & 65536)) {
            return false;
        }
        if (this.f31015x != c6205p.f31015x) {
            return false;
        }
        if (this.f31016y == null) {
            if (c6205p.f31016y != null) {
                return false;
            }
        } else if (!this.f31016y.equals(c6205p.f31016y)) {
            return false;
        }
        if ((this.f30993b & 131072) != (c6205p.f30993b & 131072)) {
            return false;
        }
        if (this.f31017z != c6205p.f31017z) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6205p.aO);
        }
        if (c6205p.aO == null || c6205p.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30994c;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f30995d;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f30996e;
        hashCode = (((((this.f31000i ? 1231 : 1237) + (((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30997f.hashCode()) * 31) + this.f30998g) * 31) + this.f30999h) * 31)) * 31) + h.a(this.f31001j)) * 31) + Arrays.hashCode(this.f31002k);
        C6194e c6194e = this.f31003l;
        hashCode = (((((((c6194e == null ? 0 : c6194e.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f31004m)) * 31) + this.f31005n.hashCode()) * 31) + this.f31006o.hashCode();
        C6191b c6191b = this.f31007p;
        hashCode = (((c6191b == null ? 0 : c6191b.hashCode()) + (hashCode * 31)) * 31) + this.f31008q.hashCode();
        j = this.f31009r;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        C6201l c6201l = this.f31010s;
        hashCode = (((((((((c6201l == null ? 0 : c6201l.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f31011t)) * 31) + this.f31012u.hashCode()) * 31) + this.f31013v) * 31) + h.a(this.f31014w);
        j = this.f31015x;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        C6209t c6209t = this.f31016y;
        hashCode = ((c6209t == null ? 0 : c6209t.hashCode()) + (hashCode * 31)) * 31;
        if (!this.f31017z) {
            i = 1237;
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f30993b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30994c);
        }
        if ((this.f30993b & 8) != 0) {
            codedOutputByteBufferNano.a(2, this.f30997f);
        }
        if (this.f31001j != null && this.f31001j.length > 0) {
            for (C0757i c0757i : this.f31001j) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if ((this.f30993b & 128) != 0) {
            codedOutputByteBufferNano.a(4, this.f31002k);
        }
        if ((this.f30993b & 256) != 0) {
            codedOutputByteBufferNano.a(6, this.f31004m);
        }
        if (this.f31007p != null) {
            codedOutputByteBufferNano.b(7, this.f31007p);
        }
        if ((this.f30993b & 512) != 0) {
            codedOutputByteBufferNano.a(8, this.f31005n);
        }
        if (this.f31003l != null) {
            codedOutputByteBufferNano.b(9, this.f31003l);
        }
        if ((this.f30993b & 64) != 0) {
            codedOutputByteBufferNano.a(10, this.f31000i);
        }
        if ((this.f30993b & 16) != 0) {
            codedOutputByteBufferNano.a(11, this.f30998g);
        }
        if ((this.f30993b & 32) != 0) {
            codedOutputByteBufferNano.a(12, this.f30999h);
        }
        if ((this.f30993b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(13, this.f31006o);
        }
        if ((this.f30993b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(14, this.f31008q);
        }
        if ((this.f30993b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.d(15, this.f31009r);
        }
        if (this.f31010s != null) {
            codedOutputByteBufferNano.b(16, this.f31010s);
        }
        if ((this.f30993b & 2) != 0) {
            codedOutputByteBufferNano.b(17, this.f30995d);
        }
        if ((this.f30993b & 8192) != 0) {
            codedOutputByteBufferNano.a(18, this.f31011t);
        }
        if ((this.f30993b & 32768) != 0) {
            codedOutputByteBufferNano.a(19, this.f31013v);
        }
        if (this.f31014w != null && this.f31014w.length > 0) {
            while (i < this.f31014w.length) {
                codedOutputByteBufferNano.a(20, this.f31014w[i]);
                i++;
            }
        }
        if ((this.f30993b & 4) != 0) {
            codedOutputByteBufferNano.b(21, this.f30996e);
        }
        if ((this.f30993b & 65536) != 0) {
            codedOutputByteBufferNano.b(22, this.f31015x);
        }
        if (this.f31016y != null) {
            codedOutputByteBufferNano.b(23, this.f31016y);
        }
        if ((this.f30993b & 16384) != 0) {
            codedOutputByteBufferNano.a(24, this.f31012u);
        }
        if ((this.f30993b & 131072) != 0) {
            codedOutputByteBufferNano.a(25, this.f31017z);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f30993b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30994c);
        }
        if ((this.f30993b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30997f);
        }
        if (this.f31001j != null && this.f31001j.length > 0) {
            i = b;
            for (C0757i c0757i : this.f31001j) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if ((this.f30993b & 128) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f31002k);
        }
        if ((this.f30993b & 256) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f31004m);
        }
        if (this.f31007p != null) {
            b += CodedOutputByteBufferNano.d(7, this.f31007p);
        }
        if ((this.f30993b & 512) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f31005n);
        }
        if (this.f31003l != null) {
            b += CodedOutputByteBufferNano.d(9, this.f31003l);
        }
        if ((this.f30993b & 64) != 0) {
            b += CodedOutputByteBufferNano.d(10) + 1;
        }
        if ((this.f30993b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(11, this.f30998g);
        }
        if ((this.f30993b & 32) != 0) {
            b += CodedOutputByteBufferNano.d(12, this.f30999h);
        }
        if ((this.f30993b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f31006o);
        }
        if ((this.f30993b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(14, this.f31008q);
        }
        if ((this.f30993b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.g(15, this.f31009r);
        }
        if (this.f31010s != null) {
            b += CodedOutputByteBufferNano.d(16, this.f31010s);
        }
        if ((this.f30993b & 2) != 0) {
            b += CodedOutputByteBufferNano.f(17, this.f30995d);
        }
        if ((this.f30993b & 8192) != 0) {
            b += CodedOutputByteBufferNano.b(18, this.f31011t);
        }
        if ((this.f30993b & 32768) != 0) {
            b += CodedOutputByteBufferNano.d(19, this.f31013v);
        }
        if (this.f31014w != null && this.f31014w.length > 0) {
            i = 0;
            while (i2 < this.f31014w.length) {
                i += CodedOutputByteBufferNano.c(this.f31014w[i2]);
                i2++;
            }
            b = (b + i) + (this.f31014w.length * 2);
        }
        if ((this.f30993b & 4) != 0) {
            b += CodedOutputByteBufferNano.f(21, this.f30996e);
        }
        if ((this.f30993b & 65536) != 0) {
            b += CodedOutputByteBufferNano.f(22, this.f31015x);
        }
        if (this.f31016y != null) {
            b += CodedOutputByteBufferNano.d(23, this.f31016y);
        }
        if ((this.f30993b & 16384) != 0) {
            b += CodedOutputByteBufferNano.b(24, this.f31012u);
        }
        if ((this.f30993b & 131072) != 0) {
            return b + (CodedOutputByteBufferNano.d(25) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6205p m28654b(com.google.protobuf.nano.a r10) {
        /*
        r9 = this;
        r8 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r1 = 0;
    L_0x0004:
        r0 = r10.a();
        switch(r0) {
            case 0: goto L_0x0011;
            case 8: goto L_0x0012;
            case 18: goto L_0x001f;
            case 26: goto L_0x002c;
            case 34: goto L_0x006b;
            case 50: goto L_0x0078;
            case 58: goto L_0x0085;
            case 66: goto L_0x0097;
            case 74: goto L_0x00a5;
            case 80: goto L_0x00b7;
            case 88: goto L_0x00c5;
            case 96: goto L_0x00d3;
            case 106: goto L_0x00e1;
            case 114: goto L_0x00ef;
            case 120: goto L_0x00fd;
            case 130: goto L_0x0113;
            case 136: goto L_0x0125;
            case 146: goto L_0x0133;
            case 152: goto L_0x0141;
            case 160: goto L_0x017e;
            case 162: goto L_0x01b2;
            case 168: goto L_0x01f4;
            case 176: goto L_0x0202;
            case 186: goto L_0x0211;
            case 194: goto L_0x0223;
            case 200: goto L_0x0231;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = super.m4918a(r10, r0);
        if (r0 != 0) goto L_0x0004;
    L_0x0011:
        return r9;
    L_0x0012:
        r2 = r10.j();
        r9.f30994c = r2;
        r0 = r9.f30993b;
        r0 = r0 | 1;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x001f:
        r0 = r10.f();
        r9.f30997f = r0;
        r0 = r9.f30993b;
        r0 = r0 | 8;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x002c:
        r0 = 26;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f31001j;
        if (r0 != 0) goto L_0x0058;
    L_0x0036:
        r0 = r1;
    L_0x0037:
        r2 = r2 + r0;
        r2 = new com.google.android.play.p179a.p352a.C6206q[r2];
        if (r0 == 0) goto L_0x0041;
    L_0x003c:
        r3 = r9.f31001j;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0041:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x005c;
    L_0x0046:
        r3 = new com.google.android.play.a.a.q;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r10.a(r3);
        r10.a();
        r0 = r0 + 1;
        goto L_0x0041;
    L_0x0058:
        r0 = r9.f31001j;
        r0 = r0.length;
        goto L_0x0037;
    L_0x005c:
        r3 = new com.google.android.play.a.a.q;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r10.a(r0);
        r9.f31001j = r2;
        goto L_0x0004;
    L_0x006b:
        r0 = r10.g();
        r9.f31002k = r0;
        r0 = r9.f30993b;
        r0 = r0 | 128;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0078:
        r0 = r10.g();
        r9.f31004m = r0;
        r0 = r9.f30993b;
        r0 = r0 | 256;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0085:
        r0 = r9.f31007p;
        if (r0 != 0) goto L_0x0090;
    L_0x0089:
        r0 = new com.google.android.play.a.a.b;
        r0.<init>();
        r9.f31007p = r0;
    L_0x0090:
        r0 = r9.f31007p;
        r10.a(r0);
        goto L_0x0004;
    L_0x0097:
        r0 = r10.f();
        r9.f31005n = r0;
        r0 = r9.f30993b;
        r0 = r0 | 512;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x00a5:
        r0 = r9.f31003l;
        if (r0 != 0) goto L_0x00b0;
    L_0x00a9:
        r0 = new com.google.android.play.a.a.e;
        r0.<init>();
        r9.f31003l = r0;
    L_0x00b0:
        r0 = r9.f31003l;
        r10.a(r0);
        goto L_0x0004;
    L_0x00b7:
        r0 = r10.e();
        r9.f31000i = r0;
        r0 = r9.f30993b;
        r0 = r0 | 64;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x00c5:
        r0 = r10.i();
        r9.f30998g = r0;
        r0 = r9.f30993b;
        r0 = r0 | 16;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x00d3:
        r0 = r10.i();
        r9.f30999h = r0;
        r0 = r9.f30993b;
        r0 = r0 | 32;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x00e1:
        r0 = r10.f();
        r9.f31006o = r0;
        r0 = r9.f30993b;
        r0 = r0 | 1024;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x00ef:
        r0 = r10.f();
        r9.f31008q = r0;
        r0 = r9.f30993b;
        r0 = r0 | 2048;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x00fd:
        r2 = r10.j();
        r0 = 1;
        r4 = r2 >>> r0;
        r6 = 1;
        r2 = r2 & r6;
        r2 = -r2;
        r2 = r2 ^ r4;
        r9.f31009r = r2;
        r0 = r9.f30993b;
        r0 = r0 | 4096;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0113:
        r0 = r9.f31010s;
        if (r0 != 0) goto L_0x011e;
    L_0x0117:
        r0 = new com.google.android.play.a.a.l;
        r0.<init>();
        r9.f31010s = r0;
    L_0x011e:
        r0 = r9.f31010s;
        r10.a(r0);
        goto L_0x0004;
    L_0x0125:
        r2 = r10.j();
        r9.f30995d = r2;
        r0 = r9.f30993b;
        r0 = r0 | 2;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0133:
        r0 = r10.g();
        r9.f31011t = r0;
        r0 = r9.f30993b;
        r0 = r0 | 8192;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0141:
        r2 = r9.f30993b;
        r2 = r2 | r8;
        r9.f30993b = r2;
        r2 = r10.o();
        r3 = r10.i();	 Catch:{ IllegalArgumentException -> 0x016c }
        switch(r3) {
            case 0: goto L_0x0175;
            case 1: goto L_0x0175;
            case 2: goto L_0x0175;
            default: goto L_0x0151;
        };	 Catch:{ IllegalArgumentException -> 0x016c }
    L_0x0151:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x016c }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x016c }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x016c }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x016c }
        r5 = " is not a valid enum InternalEvent";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x016c }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x016c }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x016c }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x016c }
    L_0x016c:
        r3 = move-exception;
        r10.e(r2);
        r9.m4918a(r10, r0);
        goto L_0x0004;
    L_0x0175:
        r9.f31013v = r3;	 Catch:{ IllegalArgumentException -> 0x016c }
        r3 = r9.f30993b;	 Catch:{ IllegalArgumentException -> 0x016c }
        r3 = r3 | r8;
        r9.f30993b = r3;	 Catch:{ IllegalArgumentException -> 0x016c }
        goto L_0x0004;
    L_0x017e:
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f31014w;
        if (r0 != 0) goto L_0x01a4;
    L_0x0188:
        r0 = r1;
    L_0x0189:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x0193;
    L_0x018e:
        r3 = r9.f31014w;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0193:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01a8;
    L_0x0198:
        r3 = r10.i();
        r2[r0] = r3;
        r10.a();
        r0 = r0 + 1;
        goto L_0x0193;
    L_0x01a4:
        r0 = r9.f31014w;
        r0 = r0.length;
        goto L_0x0189;
    L_0x01a8:
        r3 = r10.i();
        r2[r0] = r3;
        r9.f31014w = r2;
        goto L_0x0004;
    L_0x01b2:
        r0 = r10.i();
        r3 = r10.c(r0);
        r2 = r10.o();
        r0 = r1;
    L_0x01bf:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x01cb;
    L_0x01c5:
        r10.i();
        r0 = r0 + 1;
        goto L_0x01bf;
    L_0x01cb:
        r10.e(r2);
        r2 = r9.f31014w;
        if (r2 != 0) goto L_0x01e9;
    L_0x01d2:
        r2 = r1;
    L_0x01d3:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x01dd;
    L_0x01d8:
        r4 = r9.f31014w;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x01dd:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x01ed;
    L_0x01e0:
        r4 = r10.i();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x01dd;
    L_0x01e9:
        r2 = r9.f31014w;
        r2 = r2.length;
        goto L_0x01d3;
    L_0x01ed:
        r9.f31014w = r0;
        r10.d(r3);
        goto L_0x0004;
    L_0x01f4:
        r2 = r10.j();
        r9.f30996e = r2;
        r0 = r9.f30993b;
        r0 = r0 | 4;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0202:
        r2 = r10.j();
        r9.f31015x = r2;
        r0 = r9.f30993b;
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r2;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0211:
        r0 = r9.f31016y;
        if (r0 != 0) goto L_0x021c;
    L_0x0215:
        r0 = new com.google.android.play.a.a.t;
        r0.<init>();
        r9.f31016y = r0;
    L_0x021c:
        r0 = r9.f31016y;
        r10.a(r0);
        goto L_0x0004;
    L_0x0223:
        r0 = r10.f();
        r9.f31012u = r0;
        r0 = r9.f30993b;
        r0 = r0 | 16384;
        r9.f30993b = r0;
        goto L_0x0004;
    L_0x0231:
        r0 = r10.e();
        r9.f31017z = r0;
        r0 = r9.f30993b;
        r2 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r2;
        r9.f30993b = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.p.b(com.google.protobuf.nano.a):com.google.android.play.a.a.p");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28654b(aVar);
    }
}
