package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class ac extends b {
    public int f35566a;
    public long f35567b;
    public long f35568c;
    public int f35569d;
    public long f35570e;
    public long f35571f;
    public String f35572g;
    public int f35573h;
    public int f35574i;
    public int f35575j;
    public int f35576k;
    public boolean f35577l;
    public int f35578m;
    public int f35579n;
    public int f35580o;

    public final ac m34056a(int i) {
        this.f35569d = i;
        this.f35566a |= 4;
        return this;
    }

    public final ac m34057a(long j) {
        this.f35566a |= 8;
        this.f35570e = j;
        return this;
    }

    public final ac m34058a(boolean z) {
        this.f35566a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        this.f35577l = z;
        return this;
    }

    public ac() {
        this.f35566a = 0;
        this.f35567b = 0;
        this.f35568c = 0;
        this.f35569d = 0;
        this.f35570e = 0;
        this.f35571f = 0;
        this.f35572g = "";
        this.f35573h = 0;
        this.f35574i = 0;
        this.f35575j = 0;
        this.f35576k = 0;
        this.f35577l = false;
        this.f35578m = 0;
        this.f35579n = 0;
        this.f35580o = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34059a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35566a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35567b);
        }
        if ((this.f35566a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35568c);
        }
        if ((this.f35566a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35569d);
        }
        if ((this.f35566a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f35570e);
        }
        if ((this.f35566a & 16) != 0) {
            codedOutputByteBufferNano.m33531b(5, this.f35571f);
        }
        if ((this.f35566a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f35572g);
        }
        if ((this.f35566a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f35573h);
        }
        if ((this.f35566a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f35574i);
        }
        if ((this.f35566a & 256) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35575j);
        }
        if ((this.f35566a & 512) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f35576k);
        }
        if ((this.f35566a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f35577l);
        }
        if ((this.f35566a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f35578m);
        }
        if ((this.f35566a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33518a(13, this.f35579n);
        }
        if ((this.f35566a & 8192) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f35580o);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34060b() {
        int b = super.b();
        if ((this.f35566a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35567b);
        }
        if ((this.f35566a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f35568c);
        }
        if ((this.f35566a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35569d);
        }
        if ((this.f35566a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f35570e);
        }
        if ((this.f35566a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(5, this.f35571f);
        }
        if ((this.f35566a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f35572g);
        }
        if ((this.f35566a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f35573h);
        }
        if ((this.f35566a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f35574i);
        }
        if ((this.f35566a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f35575j);
        }
        if ((this.f35566a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f35576k);
        }
        if ((this.f35566a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f35566a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33502d(12, this.f35578m);
        }
        if ((this.f35566a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33502d(13, this.f35579n);
        }
        if ((this.f35566a & 8192) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(14, this.f35580o);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.ac m34054b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0065;
            case 40: goto L_0x0072;
            case 50: goto L_0x007f;
            case 56: goto L_0x008d;
            case 64: goto L_0x009b;
            case 72: goto L_0x00a9;
            case 80: goto L_0x00b7;
            case 88: goto L_0x00c5;
            case 96: goto L_0x00d3;
            case 104: goto L_0x0112;
            case 112: goto L_0x0120;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33568j();
        r6.f35567b = r0;
        r0 = r6.f35566a;
        r0 = r0 | 1;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33568j();
        r6.f35568c = r0;
        r0 = r6.f35566a;
        r0 = r0 | 2;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x0028:
        r1 = r6.f35566a;
        r1 = r1 | 4;
        r6.f35566a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0054 }
        switch(r2) {
            case 0: goto L_0x005c;
            case 1: goto L_0x005c;
            case 2: goto L_0x005c;
            case 3: goto L_0x005c;
            case 4: goto L_0x005c;
            default: goto L_0x0039;
        };	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0039:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = " is not a valid enum CacheState";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0054:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x005c:
        r6.f35569d = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r6.f35566a;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2 | 4;
        r6.f35566a = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;
    L_0x0065:
        r0 = r7.m33559c();
        r6.f35570e = r0;
        r0 = r6.f35566a;
        r0 = r0 | 8;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33559c();
        r6.f35571f = r0;
        r0 = r6.f35566a;
        r0 = r0 | 16;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r7.m33564f();
        r6.f35572g = r0;
        r0 = r6.f35566a;
        r0 = r0 | 32;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r7.m33560d();
        r6.f35573h = r0;
        r0 = r6.f35566a;
        r0 = r0 | 64;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x009b:
        r0 = r7.m33560d();
        r6.f35574i = r0;
        r0 = r6.f35566a;
        r0 = r0 | 128;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x00a9:
        r0 = r7.m33560d();
        r6.f35575j = r0;
        r0 = r6.f35566a;
        r0 = r0 | 256;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x00b7:
        r0 = r7.m33560d();
        r6.f35576k = r0;
        r0 = r6.f35566a;
        r0 = r0 | 512;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x00c5:
        r0 = r7.m33563e();
        r6.f35577l = r0;
        r0 = r6.f35566a;
        r0 = r0 | 1024;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x00d3:
        r1 = r6.f35566a;
        r1 = r1 | 2048;
        r6.f35566a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x00ff }
        switch(r2) {
            case 0: goto L_0x0108;
            case 1: goto L_0x0108;
            case 2: goto L_0x0108;
            case 3: goto L_0x0108;
            case 4: goto L_0x0108;
            case 5: goto L_0x0108;
            default: goto L_0x00e4;
        };	 Catch:{ IllegalArgumentException -> 0x00ff }
    L_0x00e4:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ff }
        r4 = 49;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ff }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00ff }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ff }
        r4 = " is not a valid enum SyncScheduleState";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ff }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00ff }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00ff }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00ff }
    L_0x00ff:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0108:
        r6.f35578m = r2;	 Catch:{ IllegalArgumentException -> 0x00ff }
        r2 = r6.f35566a;	 Catch:{ IllegalArgumentException -> 0x00ff }
        r2 = r2 | 2048;
        r6.f35566a = r2;	 Catch:{ IllegalArgumentException -> 0x00ff }
        goto L_0x0000;
    L_0x0112:
        r0 = r7.m33560d();
        r6.f35579n = r0;
        r0 = r6.f35566a;
        r0 = r0 | 4096;
        r6.f35566a = r0;
        goto L_0x0000;
    L_0x0120:
        r0 = r7.m33560d();
        r6.f35580o = r0;
        r0 = r6.f35566a;
        r0 = r0 | 8192;
        r6.f35566a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.ac.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.ac");
    }

    public final /* synthetic */ i m34055a(C7213a c7213a) {
        return m34054b(c7213a);
    }
}
