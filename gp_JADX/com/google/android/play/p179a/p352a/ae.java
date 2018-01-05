package com.google.android.play.p179a.p352a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class ae extends C0758b {
    public int f30753a;
    public long f30754b;
    public String f30755c;
    public long f30756d;
    public int f30757e;
    public String f30758f;
    public String f30759g;
    public String f30760h;
    public String f30761i;
    public String f30762j;
    public String f30763k;
    public String f30764l;
    public String f30765m;
    public String f30766n;
    public String f30767o;
    public String f30768p;
    public String f30769q;
    public String f30770r;
    public String f30771s;
    public int f30772t;
    public boolean f30773u;
    public int f30774v;

    public final ae m28546a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f30753a |= 512;
        this.f30763k = str;
        return this;
    }

    public ae() {
        this.f30753a = 0;
        this.f30754b = 0;
        this.f30755c = "";
        this.f30756d = 0;
        this.f30757e = 0;
        this.f30758f = "";
        this.f30759g = "";
        this.f30760h = "";
        this.f30761i = "";
        this.f30762j = "";
        this.f30763k = "";
        this.f30764l = "";
        this.f30765m = "";
        this.f30766n = "";
        this.f30767o = "";
        this.f30768p = "";
        this.f30769q = "";
        this.f30770r = "";
        this.f30771s = "";
        this.f30772t = 0;
        this.f30773u = false;
        this.f30774v = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        if ((this.f30753a & 1) != (aeVar.f30753a & 1)) {
            return false;
        }
        if (this.f30754b != aeVar.f30754b) {
            return false;
        }
        if ((this.f30753a & 2) != (aeVar.f30753a & 2)) {
            return false;
        }
        if (!this.f30755c.equals(aeVar.f30755c)) {
            return false;
        }
        if ((this.f30753a & 4) != (aeVar.f30753a & 4)) {
            return false;
        }
        if (this.f30756d != aeVar.f30756d) {
            return false;
        }
        if ((this.f30753a & 8) != (aeVar.f30753a & 8)) {
            return false;
        }
        if (this.f30757e != aeVar.f30757e) {
            return false;
        }
        if ((this.f30753a & 16) != (aeVar.f30753a & 16)) {
            return false;
        }
        if (!this.f30758f.equals(aeVar.f30758f)) {
            return false;
        }
        if ((this.f30753a & 32) != (aeVar.f30753a & 32)) {
            return false;
        }
        if (!this.f30759g.equals(aeVar.f30759g)) {
            return false;
        }
        if ((this.f30753a & 64) != (aeVar.f30753a & 64)) {
            return false;
        }
        if (!this.f30760h.equals(aeVar.f30760h)) {
            return false;
        }
        if ((this.f30753a & 128) != (aeVar.f30753a & 128)) {
            return false;
        }
        if (!this.f30761i.equals(aeVar.f30761i)) {
            return false;
        }
        if ((this.f30753a & 256) != (aeVar.f30753a & 256)) {
            return false;
        }
        if (!this.f30762j.equals(aeVar.f30762j)) {
            return false;
        }
        if ((this.f30753a & 512) != (aeVar.f30753a & 512)) {
            return false;
        }
        if (!this.f30763k.equals(aeVar.f30763k)) {
            return false;
        }
        if ((this.f30753a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (aeVar.f30753a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f30764l.equals(aeVar.f30764l)) {
            return false;
        }
        if ((this.f30753a & eq.FLAG_MOVED) != (aeVar.f30753a & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f30765m.equals(aeVar.f30765m)) {
            return false;
        }
        if ((this.f30753a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (aeVar.f30753a & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (!this.f30766n.equals(aeVar.f30766n)) {
            return false;
        }
        if ((this.f30753a & 8192) != (aeVar.f30753a & 8192)) {
            return false;
        }
        if (!this.f30767o.equals(aeVar.f30767o)) {
            return false;
        }
        if ((this.f30753a & 16384) != (aeVar.f30753a & 16384)) {
            return false;
        }
        if (!this.f30768p.equals(aeVar.f30768p)) {
            return false;
        }
        if ((this.f30753a & 32768) != (aeVar.f30753a & 32768)) {
            return false;
        }
        if (!this.f30769q.equals(aeVar.f30769q)) {
            return false;
        }
        if ((this.f30753a & 65536) != (aeVar.f30753a & 65536)) {
            return false;
        }
        if (!this.f30770r.equals(aeVar.f30770r)) {
            return false;
        }
        if ((this.f30753a & 131072) != (aeVar.f30753a & 131072)) {
            return false;
        }
        if (!this.f30771s.equals(aeVar.f30771s)) {
            return false;
        }
        if ((this.f30753a & 262144) != (aeVar.f30753a & 262144)) {
            return false;
        }
        if (this.f30772t != aeVar.f30772t) {
            return false;
        }
        if ((this.f30753a & 524288) != (aeVar.f30753a & 524288)) {
            return false;
        }
        if (this.f30773u != aeVar.f30773u) {
            return false;
        }
        if ((this.f30753a & 1048576) != (aeVar.f30753a & 1048576)) {
            return false;
        }
        if (this.f30774v != aeVar.f30774v) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(aeVar.aO);
        }
        if (aeVar.aO == null || aeVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30754b;
        hashCode = (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30755c.hashCode();
        j = this.f30756d;
        int hashCode2 = ((((this.f30773u ? 1231 : 1237) + (((((((((((((((((((((((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30757e) * 31) + this.f30758f.hashCode()) * 31) + this.f30759g.hashCode()) * 31) + this.f30760h.hashCode()) * 31) + this.f30761i.hashCode()) * 31) + this.f30762j.hashCode()) * 31) + this.f30763k.hashCode()) * 31) + this.f30764l.hashCode()) * 31) + this.f30765m.hashCode()) * 31) + this.f30766n.hashCode()) * 31) + this.f30767o.hashCode()) * 31) + this.f30768p.hashCode()) * 31) + this.f30769q.hashCode()) * 31) + this.f30770r.hashCode()) * 31) + this.f30771s.hashCode()) * 31) + this.f30772t) * 31)) * 31) + this.f30774v) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + hashCode2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30753a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30754b);
        }
        if ((this.f30753a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30755c);
        }
        if ((this.f30753a & 8) != 0) {
            codedOutputByteBufferNano.a(3, this.f30757e);
        }
        if ((this.f30753a & 16) != 0) {
            codedOutputByteBufferNano.a(4, this.f30758f);
        }
        if ((this.f30753a & 32) != 0) {
            codedOutputByteBufferNano.a(5, this.f30759g);
        }
        if ((this.f30753a & 256) != 0) {
            codedOutputByteBufferNano.a(6, this.f30762j);
        }
        if ((this.f30753a & 512) != 0) {
            codedOutputByteBufferNano.a(7, this.f30763k);
        }
        if ((this.f30753a & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f30760h);
        }
        if ((this.f30753a & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f30761i);
        }
        if ((this.f30753a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(10, this.f30764l);
        }
        if ((this.f30753a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(11, this.f30765m);
        }
        if ((this.f30753a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(12, this.f30766n);
        }
        if ((this.f30753a & 8192) != 0) {
            codedOutputByteBufferNano.a(13, this.f30767o);
        }
        if ((this.f30753a & 16384) != 0) {
            codedOutputByteBufferNano.a(14, this.f30768p);
        }
        if ((this.f30753a & 32768) != 0) {
            codedOutputByteBufferNano.a(15, this.f30769q);
        }
        if ((this.f30753a & 65536) != 0) {
            codedOutputByteBufferNano.a(16, this.f30770r);
        }
        if ((this.f30753a & 131072) != 0) {
            codedOutputByteBufferNano.a(17, this.f30771s);
        }
        if ((this.f30753a & 4) != 0) {
            codedOutputByteBufferNano.b(18, this.f30756d);
        }
        if ((this.f30753a & 262144) != 0) {
            codedOutputByteBufferNano.a(19, this.f30772t);
        }
        if ((this.f30753a & 524288) != 0) {
            codedOutputByteBufferNano.a(20, this.f30773u);
        }
        if ((this.f30753a & 1048576) != 0) {
            codedOutputByteBufferNano.a(21, this.f30774v);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30753a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30754b);
        }
        if ((this.f30753a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30755c);
        }
        if ((this.f30753a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f30757e);
        }
        if ((this.f30753a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30758f);
        }
        if ((this.f30753a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30759g);
        }
        if ((this.f30753a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30762j);
        }
        if ((this.f30753a & 512) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f30763k);
        }
        if ((this.f30753a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f30760h);
        }
        if ((this.f30753a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f30761i);
        }
        if ((this.f30753a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(10, this.f30764l);
        }
        if ((this.f30753a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(11, this.f30765m);
        }
        if ((this.f30753a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.b(12, this.f30766n);
        }
        if ((this.f30753a & 8192) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f30767o);
        }
        if ((this.f30753a & 16384) != 0) {
            b += CodedOutputByteBufferNano.b(14, this.f30768p);
        }
        if ((this.f30753a & 32768) != 0) {
            b += CodedOutputByteBufferNano.b(15, this.f30769q);
        }
        if ((this.f30753a & 65536) != 0) {
            b += CodedOutputByteBufferNano.b(16, this.f30770r);
        }
        if ((this.f30753a & 131072) != 0) {
            b += CodedOutputByteBufferNano.b(17, this.f30771s);
        }
        if ((this.f30753a & 4) != 0) {
            b += CodedOutputByteBufferNano.f(18, this.f30756d);
        }
        if ((this.f30753a & 262144) != 0) {
            b += CodedOutputByteBufferNano.d(19, this.f30772t);
        }
        if ((this.f30753a & 524288) != 0) {
            b += CodedOutputByteBufferNano.d(20) + 1;
        }
        if ((this.f30753a & 1048576) != 0) {
            return b + CodedOutputByteBufferNano.d(21, this.f30774v);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.ae m28545b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
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
            case 168: goto L_0x0126;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0002;
    L_0x000f:
        return r7;
    L_0x0010:
        r0 = r8.j();
        r7.f30754b = r0;
        r0 = r7.f30753a;
        r0 = r0 | 1;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x001d:
        r0 = r8.f();
        r7.f30755c = r0;
        r0 = r7.f30753a;
        r0 = r0 | 2;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x002a:
        r0 = r8.i();
        r7.f30757e = r0;
        r0 = r7.f30753a;
        r0 = r0 | 8;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0037:
        r0 = r8.f();
        r7.f30758f = r0;
        r0 = r7.f30753a;
        r0 = r0 | 16;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0044:
        r0 = r8.f();
        r7.f30759g = r0;
        r0 = r7.f30753a;
        r0 = r0 | 32;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0051:
        r0 = r8.f();
        r7.f30762j = r0;
        r0 = r7.f30753a;
        r0 = r0 | 256;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x005e:
        r0 = r8.f();
        r7.f30763k = r0;
        r0 = r7.f30753a;
        r0 = r0 | 512;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x006b:
        r0 = r8.f();
        r7.f30760h = r0;
        r0 = r7.f30753a;
        r0 = r0 | 64;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0078:
        r0 = r8.f();
        r7.f30761i = r0;
        r0 = r7.f30753a;
        r0 = r0 | 128;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0086:
        r0 = r8.f();
        r7.f30764l = r0;
        r0 = r7.f30753a;
        r0 = r0 | 1024;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0094:
        r0 = r8.f();
        r7.f30765m = r0;
        r0 = r7.f30753a;
        r0 = r0 | 2048;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x00a2:
        r0 = r8.f();
        r7.f30766n = r0;
        r0 = r7.f30753a;
        r0 = r0 | 4096;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x00b0:
        r0 = r8.f();
        r7.f30767o = r0;
        r0 = r7.f30753a;
        r0 = r0 | 8192;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x00be:
        r0 = r8.f();
        r7.f30768p = r0;
        r0 = r7.f30753a;
        r0 = r0 | 16384;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x00cc:
        r0 = r8.f();
        r7.f30769q = r0;
        r0 = r7.f30753a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x00dc:
        r0 = r8.f();
        r7.f30770r = r0;
        r0 = r7.f30753a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r1;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x00eb:
        r0 = r8.f();
        r7.f30771s = r0;
        r0 = r7.f30753a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x00fa:
        r0 = r8.j();
        r7.f30756d = r0;
        r0 = r7.f30753a;
        r0 = r0 | 4;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0108:
        r0 = r8.i();
        r7.f30772t = r0;
        r0 = r7.f30753a;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 | r1;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0117:
        r0 = r8.e();
        r7.f30773u = r0;
        r0 = r7.f30753a;
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r1;
        r7.f30753a = r0;
        goto L_0x0002;
    L_0x0126:
        r1 = r7.f30753a;
        r1 = r1 | r6;
        r7.f30753a = r1;
        r1 = r8.o();
        r2 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0151 }
        switch(r2) {
            case 0: goto L_0x015a;
            case 1: goto L_0x015a;
            case 2: goto L_0x015a;
            default: goto L_0x0136;
        };	 Catch:{ IllegalArgumentException -> 0x0151 }
    L_0x0136:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0151 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0151 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0151 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0151 }
        r4 = " is not a valid enum PairedDeviceType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0151 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0151 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0151 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0151 }
    L_0x0151:
        r2 = move-exception;
        r8.e(r1);
        r7.m4918a(r8, r0);
        goto L_0x0002;
    L_0x015a:
        r7.f30774v = r2;	 Catch:{ IllegalArgumentException -> 0x0151 }
        r2 = r7.f30753a;	 Catch:{ IllegalArgumentException -> 0x0151 }
        r2 = r2 | r6;
        r7.f30753a = r2;	 Catch:{ IllegalArgumentException -> 0x0151 }
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.ae.b(com.google.protobuf.nano.a):com.google.android.play.a.a.ae");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28545b(aVar);
    }
}
