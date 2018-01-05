package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7288t extends b {
    public int f36138a;
    public int f36139b;
    public int f36140c;
    public boolean f36141d;
    public boolean f36142e;
    public boolean f36143f;
    public boolean f36144g;
    public String f36145h;
    public boolean f36146i;
    public long f36147j;
    public int f36148k;
    public boolean f36149l;
    public int f36150m;
    public long f36151n;
    public int f36152o;
    public int f36153p;
    public ae f36154q;
    public String f36155r;
    public int f36156s;
    public int f36157t;
    public String f36158u;
    public String f36159v;
    public String f36160w;

    public final boolean m34463d() {
        return (this.f36138a & 1) != 0;
    }

    public final C7288t m34450a(int i) {
        this.f36138a |= 1;
        this.f36139b = i;
        return this;
    }

    public final C7288t m34456b(int i) {
        this.f36138a |= 2;
        this.f36140c = i;
        return this;
    }

    public final C7288t m34453a(boolean z) {
        this.f36138a |= 4;
        this.f36141d = z;
        return this;
    }

    public final C7288t m34464e() {
        this.f36142e = false;
        this.f36138a &= -9;
        return this;
    }

    public final C7288t m34466f() {
        this.f36138a |= 8;
        this.f36142e = true;
        return this;
    }

    public final C7288t m34468g() {
        this.f36143f = false;
        this.f36138a &= -17;
        return this;
    }

    public final C7288t m34459b(boolean z) {
        this.f36138a |= 16;
        this.f36143f = z;
        return this;
    }

    public final C7288t m34469h() {
        this.f36144g = false;
        this.f36138a &= -33;
        return this;
    }

    public final C7288t m34461c(boolean z) {
        this.f36138a |= 32;
        this.f36144g = z;
        return this;
    }

    public final C7288t m34451a(long j) {
        this.f36138a |= 256;
        this.f36147j = j;
        return this;
    }

    public final C7288t m34470i() {
        this.f36148k = 0;
        this.f36138a &= -513;
        return this;
    }

    public final C7288t m34460c(int i) {
        this.f36138a |= 512;
        this.f36148k = i;
        return this;
    }

    public final C7288t m34462d(int i) {
        this.f36150m = i;
        this.f36138a |= eq.FLAG_MOVED;
        return this;
    }

    public final C7288t m34457b(long j) {
        this.f36138a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.f36151n = j;
        return this;
    }

    public final C7288t m34465e(int i) {
        this.f36138a |= 8192;
        this.f36152o = i;
        return this;
    }

    public final C7288t m34467f(int i) {
        this.f36153p = i;
        this.f36138a |= 16384;
        return this;
    }

    public final C7288t m34452a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36138a |= 32768;
        this.f36155r = str;
        return this;
    }

    public final C7288t m34458b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36138a |= 524288;
        this.f36159v = str;
        return this;
    }

    public C7288t() {
        this.f36138a = 0;
        this.f36139b = 0;
        this.f36140c = 0;
        this.f36141d = false;
        this.f36142e = false;
        this.f36143f = false;
        this.f36144g = false;
        this.f36145h = "";
        this.f36146i = false;
        this.f36147j = 0;
        this.f36148k = 0;
        this.f36149l = false;
        this.f36150m = 0;
        this.f36151n = 0;
        this.f36152o = 0;
        this.f36153p = 0;
        this.f36154q = null;
        this.f36155r = "";
        this.f36156s = 0;
        this.f36157t = 0;
        this.f36158u = "";
        this.f36159v = "";
        this.f36160w = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34454a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36138a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36139b);
        }
        if ((this.f36138a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36140c);
        }
        if ((this.f36138a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36141d);
        }
        if ((this.f36138a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f36142e);
        }
        if ((this.f36138a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f36143f);
        }
        if ((this.f36138a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f36144g);
        }
        if ((this.f36138a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36145h);
        }
        if ((this.f36138a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f36146i);
        }
        if ((this.f36138a & 256) != 0) {
            codedOutputByteBufferNano.m33531b(9, this.f36147j);
        }
        if ((this.f36138a & 512) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f36148k);
        }
        if ((this.f36138a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f36149l);
        }
        if ((this.f36138a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f36150m);
        }
        if ((this.f36138a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33531b(13, this.f36151n);
        }
        if ((this.f36138a & 8192) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f36152o);
        }
        if ((this.f36138a & 16384) != 0) {
            codedOutputByteBufferNano.m33518a(15, this.f36153p);
        }
        if (this.f36154q != null) {
            codedOutputByteBufferNano.m33532b(16, this.f36154q);
        }
        if ((this.f36138a & 32768) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f36155r);
        }
        if ((this.f36138a & 65536) != 0) {
            codedOutputByteBufferNano.m33518a(18, this.f36156s);
        }
        if ((this.f36138a & 131072) != 0) {
            codedOutputByteBufferNano.m33518a(19, this.f36157t);
        }
        if ((this.f36138a & 262144) != 0) {
            codedOutputByteBufferNano.m33521a(20, this.f36158u);
        }
        if ((this.f36138a & 524288) != 0) {
            codedOutputByteBufferNano.m33521a(21, this.f36159v);
        }
        if ((this.f36138a & 1048576) != 0) {
            codedOutputByteBufferNano.m33521a(22, this.f36160w);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34455b() {
        int b = super.b();
        if ((this.f36138a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36139b);
        }
        if ((this.f36138a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36140c);
        }
        if ((this.f36138a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f36138a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f36138a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f36138a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f36138a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36145h);
        }
        if ((this.f36138a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f36138a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33508f(9, this.f36147j);
        }
        if ((this.f36138a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f36148k);
        }
        if ((this.f36138a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f36138a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33502d(12, this.f36150m);
        }
        if ((this.f36138a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33508f(13, this.f36151n);
        }
        if ((this.f36138a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33502d(14, this.f36152o);
        }
        if ((this.f36138a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33502d(15, this.f36153p);
        }
        if (this.f36154q != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f36154q);
        }
        if ((this.f36138a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f36155r);
        }
        if ((this.f36138a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33502d(18, this.f36156s);
        }
        if ((this.f36138a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33502d(19, this.f36157t);
        }
        if ((this.f36138a & 262144) != 0) {
            b += CodedOutputByteBufferNano.m33493b(20, this.f36158u);
        }
        if ((this.f36138a & 524288) != 0) {
            b += CodedOutputByteBufferNano.m33493b(21, this.f36159v);
        }
        if ((this.f36138a & 1048576) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(22, this.f36160w);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7288t m34448b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0035;
            case 40: goto L_0x0042;
            case 48: goto L_0x004f;
            case 58: goto L_0x005c;
            case 64: goto L_0x0069;
            case 72: goto L_0x0076;
            case 80: goto L_0x0084;
            case 88: goto L_0x0092;
            case 96: goto L_0x00a0;
            case 104: goto L_0x00df;
            case 112: goto L_0x00ed;
            case 120: goto L_0x00fb;
            case 130: goto L_0x0120;
            case 138: goto L_0x0132;
            case 144: goto L_0x0142;
            case 152: goto L_0x0151;
            case 162: goto L_0x0160;
            case 170: goto L_0x016f;
            case 178: goto L_0x017e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33567i();
        r6.f36139b = r0;
        r0 = r6.f36138a;
        r0 = r0 | 1;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33567i();
        r6.f36140c = r0;
        r0 = r6.f36138a;
        r0 = r0 | 2;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m33563e();
        r6.f36141d = r0;
        r0 = r6.f36138a;
        r0 = r0 | 4;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.m33563e();
        r6.f36142e = r0;
        r0 = r6.f36138a;
        r0 = r0 | 8;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = r7.m33563e();
        r6.f36143f = r0;
        r0 = r6.f36138a;
        r0 = r0 | 16;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x004f:
        r0 = r7.m33563e();
        r6.f36144g = r0;
        r0 = r6.f36138a;
        r0 = r0 | 32;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x005c:
        r0 = r7.m33564f();
        r6.f36145h = r0;
        r0 = r6.f36138a;
        r0 = r0 | 64;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0069:
        r0 = r7.m33563e();
        r6.f36146i = r0;
        r0 = r6.f36138a;
        r0 = r0 | 128;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0076:
        r0 = r7.m33568j();
        r6.f36147j = r0;
        r0 = r6.f36138a;
        r0 = r0 | 256;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0084:
        r0 = r7.m33567i();
        r6.f36148k = r0;
        r0 = r6.f36138a;
        r0 = r0 | 512;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0092:
        r0 = r7.m33563e();
        r6.f36149l = r0;
        r0 = r6.f36138a;
        r0 = r0 | 1024;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x00a0:
        r1 = r6.f36138a;
        r1 = r1 | 2048;
        r6.f36138a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x00cc }
        switch(r2) {
            case 0: goto L_0x00d5;
            case 1: goto L_0x00d5;
            case 2: goto L_0x00d5;
            case 3: goto L_0x00d5;
            case 4: goto L_0x00d5;
            default: goto L_0x00b1;
        };	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x00b1:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r4 = " is not a valid enum FileType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00cc }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x00cc:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00d5:
        r6.f36150m = r2;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r6.f36138a;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r2 | 2048;
        r6.f36138a = r2;	 Catch:{ IllegalArgumentException -> 0x00cc }
        goto L_0x0000;
    L_0x00df:
        r0 = r7.m33559c();
        r6.f36151n = r0;
        r0 = r6.f36138a;
        r0 = r0 | 4096;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x00ed:
        r0 = r7.m33560d();
        r6.f36152o = r0;
        r0 = r6.f36138a;
        r0 = r0 | 8192;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x00fb:
        r1 = r6.f36138a;
        r1 = r1 | 16384;
        r6.f36138a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0117 }
        r2 = com.google.android.finsky.cv.a.jt.a(r2);	 Catch:{ IllegalArgumentException -> 0x0117 }
        r6.f36153p = r2;	 Catch:{ IllegalArgumentException -> 0x0117 }
        r2 = r6.f36138a;	 Catch:{ IllegalArgumentException -> 0x0117 }
        r2 = r2 | 16384;
        r6.f36138a = r2;	 Catch:{ IllegalArgumentException -> 0x0117 }
        goto L_0x0000;
    L_0x0117:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0120:
        r0 = r6.f36154q;
        if (r0 != 0) goto L_0x012b;
    L_0x0124:
        r0 = new com.google.wireless.android.a.a.a.a.ae;
        r0.<init>();
        r6.f36154q = r0;
    L_0x012b:
        r0 = r6.f36154q;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0132:
        r0 = r7.m33564f();
        r6.f36155r = r0;
        r0 = r6.f36138a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0142:
        r0 = r7.m33560d();
        r6.f36156s = r0;
        r0 = r6.f36138a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r1;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0151:
        r0 = r7.m33560d();
        r6.f36157t = r0;
        r0 = r6.f36138a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x0160:
        r0 = r7.m33564f();
        r6.f36158u = r0;
        r0 = r6.f36138a;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 | r1;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x016f:
        r0 = r7.m33564f();
        r6.f36159v = r0;
        r0 = r6.f36138a;
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r1;
        r6.f36138a = r0;
        goto L_0x0000;
    L_0x017e:
        r0 = r7.m33564f();
        r6.f36160w = r0;
        r0 = r6.f36138a;
        r1 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 | r1;
        r6.f36138a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.t.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.t");
    }

    public final /* synthetic */ i m34449a(C7213a c7213a) {
        return m34448b(c7213a);
    }
}
