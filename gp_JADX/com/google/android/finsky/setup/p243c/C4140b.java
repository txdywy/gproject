package com.google.android.finsky.setup.p243c;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.p177a.es;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C4140b extends C0758b {
    public int f20887a;
    public int f20888b;
    public String f20889c;
    public int f20890d;
    public String f20891e;
    public String f20892f;
    public int f20893g;
    public String f20894h;
    public boolean f20895i;
    public String f20896j;
    public boolean f20897k;
    public int f20898l;
    public es f20899m;
    public int f20900n;

    public final C4140b m19373a(int i) {
        this.f20898l = i;
        this.f20887a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        return this;
    }

    public C4140b() {
        this.f20887a = 0;
        this.f20888b = 0;
        this.f20889c = "";
        this.f20890d = 0;
        this.f20891e = "";
        this.f20892f = "";
        this.f20893g = 0;
        this.f20894h = "";
        this.f20895i = false;
        this.f20896j = "";
        this.f20897k = false;
        this.f20898l = 0;
        this.f20899m = null;
        this.f20900n = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f20887a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f20888b);
        }
        if ((this.f20887a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f20889c);
        }
        if ((this.f20887a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f20890d);
        }
        if ((this.f20887a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f20891e);
        }
        if ((this.f20887a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f20892f);
        }
        if ((this.f20887a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f20893g);
        }
        if ((this.f20887a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f20894h);
        }
        if ((this.f20887a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f20895i);
        }
        if ((this.f20887a & 256) != 0) {
            codedOutputByteBufferNano.a(9, this.f20896j);
        }
        if ((this.f20887a & 512) != 0) {
            codedOutputByteBufferNano.a(10, this.f20897k);
        }
        if ((this.f20887a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(11, this.f20898l);
        }
        if (this.f20899m != null) {
            codedOutputByteBufferNano.b(12, this.f20899m);
        }
        if ((this.f20887a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(13, this.f20900n);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f20887a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f20888b);
        }
        if ((this.f20887a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f20889c);
        }
        if ((this.f20887a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f20890d);
        }
        if ((this.f20887a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f20891e);
        }
        if ((this.f20887a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f20892f);
        }
        if ((this.f20887a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f20893g);
        }
        if ((this.f20887a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f20894h);
        }
        if ((this.f20887a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if ((this.f20887a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f20896j);
        }
        if ((this.f20887a & 512) != 0) {
            b += CodedOutputByteBufferNano.d(10) + 1;
        }
        if ((this.f20887a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.d(11, this.f20898l);
        }
        if (this.f20899m != null) {
            b += CodedOutputByteBufferNano.d(12, this.f20899m);
        }
        if ((this.f20887a & eq.FLAG_MOVED) != 0) {
            return b + CodedOutputByteBufferNano.d(13, this.f20900n);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.setup.p243c.C4140b m19372b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x0028;
            case 34: goto L_0x0035;
            case 42: goto L_0x0042;
            case 48: goto L_0x004f;
            case 58: goto L_0x005c;
            case 64: goto L_0x0069;
            case 74: goto L_0x0076;
            case 80: goto L_0x0084;
            case 88: goto L_0x0092;
            case 98: goto L_0x00d1;
            case 104: goto L_0x00e3;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.i();
        r6.f20888b = r0;
        r0 = r6.f20887a;
        r0 = r0 | 1;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.f();
        r6.f20889c = r0;
        r0 = r6.f20887a;
        r0 = r0 | 2;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.i();
        r6.f20890d = r0;
        r0 = r6.f20887a;
        r0 = r0 | 4;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.f();
        r6.f20891e = r0;
        r0 = r6.f20887a;
        r0 = r0 | 8;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = r7.f();
        r6.f20892f = r0;
        r0 = r6.f20887a;
        r0 = r0 | 16;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x004f:
        r0 = r7.i();
        r6.f20893g = r0;
        r0 = r6.f20887a;
        r0 = r0 | 32;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x005c:
        r0 = r7.f();
        r6.f20894h = r0;
        r0 = r6.f20887a;
        r0 = r0 | 64;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x0069:
        r0 = r7.e();
        r6.f20895i = r0;
        r0 = r6.f20887a;
        r0 = r0 | 128;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x0076:
        r0 = r7.f();
        r6.f20896j = r0;
        r0 = r6.f20887a;
        r0 = r0 | 256;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x0084:
        r0 = r7.e();
        r6.f20897k = r0;
        r0 = r6.f20887a;
        r0 = r0 | 512;
        r6.f20887a = r0;
        goto L_0x0000;
    L_0x0092:
        r1 = r6.f20887a;
        r1 = r1 | 1024;
        r6.f20887a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x00be }
        switch(r2) {
            case 0: goto L_0x00c7;
            case 1: goto L_0x00c7;
            default: goto L_0x00a3;
        };	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x00a3:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00be }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00be }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00be }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00be }
        r4 = " is not a valid enum NetworkType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00be }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00be }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00be }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x00be:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00c7:
        r6.f20898l = r2;	 Catch:{ IllegalArgumentException -> 0x00be }
        r2 = r6.f20887a;	 Catch:{ IllegalArgumentException -> 0x00be }
        r2 = r2 | 1024;
        r6.f20887a = r2;	 Catch:{ IllegalArgumentException -> 0x00be }
        goto L_0x0000;
    L_0x00d1:
        r0 = r6.f20899m;
        if (r0 != 0) goto L_0x00dc;
    L_0x00d5:
        r0 = new com.google.android.finsky.cv.a.es;
        r0.<init>();
        r6.f20899m = r0;
    L_0x00dc:
        r0 = r6.f20899m;
        r7.a(r0);
        goto L_0x0000;
    L_0x00e3:
        r1 = r6.f20887a;
        r1 = r1 | 2048;
        r6.f20887a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x010f }
        switch(r2) {
            case 0: goto L_0x0118;
            case 1: goto L_0x0118;
            case 2: goto L_0x0118;
            case 3: goto L_0x0118;
            default: goto L_0x00f4;
        };	 Catch:{ IllegalArgumentException -> 0x010f }
    L_0x00f4:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x010f }
        r4 = 37;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x010f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x010f }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x010f }
        r4 = " is not a valid enum State";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x010f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x010f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x010f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x010f }
    L_0x010f:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0118:
        r6.f20900n = r2;	 Catch:{ IllegalArgumentException -> 0x010f }
        r2 = r6.f20887a;	 Catch:{ IllegalArgumentException -> 0x010f }
        r2 = r2 | 2048;
        r6.f20887a = r2;	 Catch:{ IllegalArgumentException -> 0x010f }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.setup.c.b.b(com.google.protobuf.nano.a):com.google.android.finsky.setup.c.b");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m19372b(aVar);
    }
}
