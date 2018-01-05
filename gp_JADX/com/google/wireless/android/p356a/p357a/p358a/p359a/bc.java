package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class bc extends b {
    public int f35737a;
    public int f35738b;
    public int f35739c;
    public String f35740d;
    public int f35741e;
    public int f35742f;
    public String f35743g;
    public int f35744h;
    public long f35745i;
    public long f35746j;
    public int f35747k;
    public long f35748l;
    public long f35749m;
    public boolean f35750n;
    public int f35751o;
    public int f35752p;
    public long f35753q;
    public int f35754r;
    public boolean f35755s;
    public int f35756t;
    public int f35757u;

    public bc() {
        this.f35737a = 0;
        this.f35738b = 0;
        this.f35739c = 0;
        this.f35740d = "";
        this.f35741e = 0;
        this.f35742f = 0;
        this.f35743g = "";
        this.f35744h = 0;
        this.f35745i = 0;
        this.f35746j = 0;
        this.f35747k = 0;
        this.f35748l = 0;
        this.f35749m = 0;
        this.f35750n = false;
        this.f35751o = 0;
        this.f35752p = 0;
        this.f35753q = 0;
        this.f35754r = 0;
        this.f35755s = false;
        this.f35756t = 0;
        this.f35757u = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34165a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35737a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35738b);
        }
        if ((this.f35737a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35739c);
        }
        if ((this.f35737a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35740d);
        }
        if ((this.f35737a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35741e);
        }
        if ((this.f35737a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35742f);
        }
        if ((this.f35737a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f35743g);
        }
        if ((this.f35737a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f35744h);
        }
        if ((this.f35737a & 128) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f35745i);
        }
        if ((this.f35737a & 256) != 0) {
            codedOutputByteBufferNano.m33531b(9, this.f35746j);
        }
        if ((this.f35737a & 512) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f35747k);
        }
        if ((this.f35737a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33531b(11, this.f35748l);
        }
        if ((this.f35737a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33531b(12, this.f35749m);
        }
        if ((this.f35737a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33522a(13, this.f35750n);
        }
        if ((this.f35737a & 8192) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f35751o);
        }
        if ((this.f35737a & 16384) != 0) {
            codedOutputByteBufferNano.m33518a(15, this.f35752p);
        }
        if ((this.f35737a & 32768) != 0) {
            codedOutputByteBufferNano.m33531b(16, this.f35753q);
        }
        if ((this.f35737a & 65536) != 0) {
            codedOutputByteBufferNano.m33518a(17, this.f35754r);
        }
        if ((this.f35737a & 131072) != 0) {
            codedOutputByteBufferNano.m33522a(18, this.f35755s);
        }
        if ((this.f35737a & 262144) != 0) {
            codedOutputByteBufferNano.m33518a(19, this.f35756t);
        }
        if ((this.f35737a & 524288) != 0) {
            codedOutputByteBufferNano.m33518a(20, this.f35757u);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34166b() {
        int b = super.b();
        if ((this.f35737a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35738b);
        }
        if ((this.f35737a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35739c);
        }
        if ((this.f35737a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f35740d);
        }
        if ((this.f35737a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35741e);
        }
        if ((this.f35737a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f35742f);
        }
        if ((this.f35737a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f35743g);
        }
        if ((this.f35737a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f35744h);
        }
        if ((this.f35737a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f35745i);
        }
        if ((this.f35737a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33508f(9, this.f35746j);
        }
        if ((this.f35737a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f35747k);
        }
        if ((this.f35737a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33508f(11, this.f35748l);
        }
        if ((this.f35737a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33508f(12, this.f35749m);
        }
        if ((this.f35737a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33501d(13) + 1;
        }
        if ((this.f35737a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33502d(14, this.f35751o);
        }
        if ((this.f35737a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33502d(15, this.f35752p);
        }
        if ((this.f35737a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33508f(16, this.f35753q);
        }
        if ((this.f35737a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33502d(17, this.f35754r);
        }
        if ((this.f35737a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33501d(18) + 1;
        }
        if ((this.f35737a & 262144) != 0) {
            b += CodedOutputByteBufferNano.m33502d(19, this.f35756t);
        }
        if ((this.f35737a & 524288) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(20, this.f35757u);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.bc m34163b(com.google.protobuf.nano.C7213a r9) {
        /*
        r8 = this;
        r7 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r6 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
    L_0x0004:
        r0 = r9.m33550a();
        switch(r0) {
            case 0: goto L_0x0011;
            case 8: goto L_0x0012;
            case 16: goto L_0x004f;
            case 26: goto L_0x008d;
            case 32: goto L_0x009b;
            case 40: goto L_0x00a9;
            case 50: goto L_0x00e8;
            case 56: goto L_0x00f6;
            case 64: goto L_0x0104;
            case 72: goto L_0x0112;
            case 80: goto L_0x0120;
            case 88: goto L_0x012e;
            case 96: goto L_0x013c;
            case 104: goto L_0x014a;
            case 112: goto L_0x0158;
            case 120: goto L_0x0197;
            case 128: goto L_0x01d6;
            case 136: goto L_0x01e6;
            case 144: goto L_0x0223;
            case 152: goto L_0x0232;
            case 160: goto L_0x026f;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = super.a(r9, r0);
        if (r0 != 0) goto L_0x0004;
    L_0x0011:
        return r8;
    L_0x0012:
        r1 = r8.f35737a;
        r1 = r1 | 1;
        r8.f35737a = r1;
        r1 = r9.m33573o();
        r2 = r9.m33567i();	 Catch:{ IllegalArgumentException -> 0x003e }
        switch(r2) {
            case 0: goto L_0x0046;
            case 1: goto L_0x0046;
            case 2: goto L_0x0046;
            case 3: goto L_0x0046;
            case 4: goto L_0x0046;
            case 5: goto L_0x0046;
            case 6: goto L_0x0046;
            default: goto L_0x0023;
        };	 Catch:{ IllegalArgumentException -> 0x003e }
    L_0x0023:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003e }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003e }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003e }
        r4 = " is not a valid enum ApiResult";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003e }
    L_0x003e:
        r2 = move-exception;
        r9.m33562e(r1);
        r8.a(r9, r0);
        goto L_0x0004;
    L_0x0046:
        r8.f35738b = r2;	 Catch:{ IllegalArgumentException -> 0x003e }
        r2 = r8.f35737a;	 Catch:{ IllegalArgumentException -> 0x003e }
        r2 = r2 | 1;
        r8.f35737a = r2;	 Catch:{ IllegalArgumentException -> 0x003e }
        goto L_0x0004;
    L_0x004f:
        r1 = r8.f35737a;
        r1 = r1 | 2;
        r8.f35737a = r1;
        r1 = r9.m33573o();
        r2 = r9.m33560d();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r2) {
            case 0: goto L_0x0083;
            case 1: goto L_0x0083;
            case 2: goto L_0x0083;
            case 3: goto L_0x0083;
            default: goto L_0x0060;
        };	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0060:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = " is not a valid enum AuthTosState";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x007b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r2 = move-exception;
        r9.m33562e(r1);
        r8.a(r9, r0);
        goto L_0x0004;
    L_0x0083:
        r8.f35739c = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r8.f35737a;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2 | 2;
        r8.f35737a = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0004;
    L_0x008d:
        r0 = r9.m33564f();
        r8.f35740d = r0;
        r0 = r8.f35737a;
        r0 = r0 | 4;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x009b:
        r0 = r9.m33560d();
        r8.f35741e = r0;
        r0 = r8.f35737a;
        r0 = r0 | 8;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x00a9:
        r1 = r8.f35737a;
        r1 = r1 | 16;
        r8.f35737a = r1;
        r1 = r9.m33573o();
        r2 = r9.m33560d();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        switch(r2) {
            case 0: goto L_0x00de;
            case 1: goto L_0x00de;
            case 2: goto L_0x00de;
            case 3: goto L_0x00de;
            case 4: goto L_0x00de;
            default: goto L_0x00ba;
        };	 Catch:{ IllegalArgumentException -> 0x00d5 }
    L_0x00ba:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r4 = " is not a valid enum InstallProgress";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00d5 }
    L_0x00d5:
        r2 = move-exception;
        r9.m33562e(r1);
        r8.a(r9, r0);
        goto L_0x0004;
    L_0x00de:
        r8.f35742f = r2;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2 = r8.f35737a;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2 = r2 | 16;
        r8.f35737a = r2;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        goto L_0x0004;
    L_0x00e8:
        r0 = r9.m33564f();
        r8.f35743g = r0;
        r0 = r8.f35737a;
        r0 = r0 | 32;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x00f6:
        r0 = r9.m33560d();
        r8.f35744h = r0;
        r0 = r8.f35737a;
        r0 = r0 | 64;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x0104:
        r0 = r9.m33559c();
        r8.f35745i = r0;
        r0 = r8.f35737a;
        r0 = r0 | 128;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x0112:
        r0 = r9.m33559c();
        r8.f35746j = r0;
        r0 = r8.f35737a;
        r0 = r0 | 256;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x0120:
        r0 = r9.m33560d();
        r8.f35747k = r0;
        r0 = r8.f35737a;
        r0 = r0 | 512;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x012e:
        r0 = r9.m33559c();
        r8.f35748l = r0;
        r0 = r8.f35737a;
        r0 = r0 | 1024;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x013c:
        r0 = r9.m33559c();
        r8.f35749m = r0;
        r0 = r8.f35737a;
        r0 = r0 | 2048;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x014a:
        r0 = r9.m33563e();
        r8.f35750n = r0;
        r0 = r8.f35737a;
        r0 = r0 | 4096;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x0158:
        r1 = r8.f35737a;
        r1 = r1 | 8192;
        r8.f35737a = r1;
        r1 = r9.m33573o();
        r2 = r9.m33560d();	 Catch:{ IllegalArgumentException -> 0x0184 }
        switch(r2) {
            case 0: goto L_0x018d;
            case 1: goto L_0x018d;
            case 2: goto L_0x018d;
            case 3: goto L_0x018d;
            default: goto L_0x0169;
        };	 Catch:{ IllegalArgumentException -> 0x0184 }
    L_0x0169:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0184 }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0184 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0184 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0184 }
        r4 = " is not a valid enum EvaluateResult";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0184 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0184 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0184 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0184 }
    L_0x0184:
        r2 = move-exception;
        r9.m33562e(r1);
        r8.a(r9, r0);
        goto L_0x0004;
    L_0x018d:
        r8.f35751o = r2;	 Catch:{ IllegalArgumentException -> 0x0184 }
        r2 = r8.f35737a;	 Catch:{ IllegalArgumentException -> 0x0184 }
        r2 = r2 | 8192;
        r8.f35737a = r2;	 Catch:{ IllegalArgumentException -> 0x0184 }
        goto L_0x0004;
    L_0x0197:
        r1 = r8.f35737a;
        r1 = r1 | 16384;
        r8.f35737a = r1;
        r1 = r9.m33573o();
        r2 = r9.m33560d();	 Catch:{ IllegalArgumentException -> 0x01c3 }
        switch(r2) {
            case 0: goto L_0x01cc;
            case 1: goto L_0x01cc;
            case 2: goto L_0x01cc;
            case 3: goto L_0x01cc;
            case 4: goto L_0x01cc;
            default: goto L_0x01a8;
        };	 Catch:{ IllegalArgumentException -> 0x01c3 }
    L_0x01a8:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r4 = " is not a valid enum FrostingState";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x01c3 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x01c3 }
    L_0x01c3:
        r2 = move-exception;
        r9.m33562e(r1);
        r8.a(r9, r0);
        goto L_0x0004;
    L_0x01cc:
        r8.f35752p = r2;	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r2 = r8.f35737a;	 Catch:{ IllegalArgumentException -> 0x01c3 }
        r2 = r2 | 16384;
        r8.f35737a = r2;	 Catch:{ IllegalArgumentException -> 0x01c3 }
        goto L_0x0004;
    L_0x01d6:
        r0 = r9.m33559c();
        r8.f35753q = r0;
        r0 = r8.f35737a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x01e6:
        r1 = r8.f35737a;
        r1 = r1 | r6;
        r8.f35737a = r1;
        r1 = r9.m33573o();
        r2 = r9.m33560d();	 Catch:{ IllegalArgumentException -> 0x0211 }
        switch(r2) {
            case 0: goto L_0x021a;
            case 1: goto L_0x021a;
            case 2: goto L_0x021a;
            case 3: goto L_0x021a;
            default: goto L_0x01f6;
        };	 Catch:{ IllegalArgumentException -> 0x0211 }
    L_0x01f6:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0211 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0211 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0211 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0211 }
        r4 = " is not a valid enum InstallResult";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0211 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0211 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0211 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0211 }
    L_0x0211:
        r2 = move-exception;
        r9.m33562e(r1);
        r8.a(r9, r0);
        goto L_0x0004;
    L_0x021a:
        r8.f35754r = r2;	 Catch:{ IllegalArgumentException -> 0x0211 }
        r2 = r8.f35737a;	 Catch:{ IllegalArgumentException -> 0x0211 }
        r2 = r2 | r6;
        r8.f35737a = r2;	 Catch:{ IllegalArgumentException -> 0x0211 }
        goto L_0x0004;
    L_0x0223:
        r0 = r9.m33563e();
        r8.f35755s = r0;
        r0 = r8.f35737a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r8.f35737a = r0;
        goto L_0x0004;
    L_0x0232:
        r1 = r8.f35737a;
        r1 = r1 | r7;
        r8.f35737a = r1;
        r1 = r9.m33573o();
        r2 = r9.m33560d();	 Catch:{ IllegalArgumentException -> 0x025d }
        switch(r2) {
            case 0: goto L_0x0266;
            case 1: goto L_0x0266;
            case 2: goto L_0x0266;
            case 3: goto L_0x0266;
            default: goto L_0x0242;
        };	 Catch:{ IllegalArgumentException -> 0x025d }
    L_0x0242:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x025d }
        r4 = 49;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x025d }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x025d }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x025d }
        r4 = " is not a valid enum AcquisitionResult";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x025d }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x025d }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x025d }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x025d }
    L_0x025d:
        r2 = move-exception;
        r9.m33562e(r1);
        r8.a(r9, r0);
        goto L_0x0004;
    L_0x0266:
        r8.f35756t = r2;	 Catch:{ IllegalArgumentException -> 0x025d }
        r2 = r8.f35737a;	 Catch:{ IllegalArgumentException -> 0x025d }
        r2 = r2 | r7;
        r8.f35737a = r2;	 Catch:{ IllegalArgumentException -> 0x025d }
        goto L_0x0004;
    L_0x026f:
        r0 = r9.m33560d();
        r8.f35757u = r0;
        r0 = r8.f35737a;
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r1;
        r8.f35737a = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.bc.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.bc");
    }

    public final /* synthetic */ i m34164a(C7213a c7213a) {
        return m34163b(c7213a);
    }
}
