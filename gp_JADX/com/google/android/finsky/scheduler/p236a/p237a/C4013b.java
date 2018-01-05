package com.google.android.finsky.scheduler.p236a.p237a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C4013b extends C0758b {
    public int f20153a;
    public long f20154b;
    public long f20155c;
    public int f20156d;
    public boolean f20157e;
    public boolean f20158f;
    public int f20159g;
    public boolean f20160h;
    public boolean f20161i;

    public final C4013b m18768a(long j) {
        this.f20153a |= 1;
        this.f20154b = j;
        return this;
    }

    public C4013b() {
        this.f20153a = 0;
        this.f20154b = 0;
        this.f20155c = -1;
        this.f20156d = 0;
        this.f20157e = false;
        this.f20158f = false;
        this.f20159g = 3;
        this.f20160h = false;
        this.f20161i = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f20153a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f20154b);
        }
        if ((this.f20153a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f20155c);
        }
        if ((this.f20153a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f20156d);
        }
        if ((this.f20153a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f20157e);
        }
        if ((this.f20153a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f20158f);
        }
        if ((this.f20153a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f20159g);
        }
        if ((this.f20153a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f20160h);
        }
        if ((this.f20153a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f20161i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f20153a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f20154b);
        }
        if ((this.f20153a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f20155c);
        }
        if ((this.f20153a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f20156d);
        }
        if ((this.f20153a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f20153a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if ((this.f20153a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f20159g);
        }
        if ((this.f20153a & 64) != 0) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if ((this.f20153a & 128) != 0) {
            return b + (CodedOutputByteBufferNano.d(8) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.scheduler.p236a.p237a.C4013b m18767b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0065;
            case 40: goto L_0x0072;
            case 48: goto L_0x007f;
            case 56: goto L_0x00be;
            case 64: goto L_0x00cc;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.j();
        r6.f20154b = r0;
        r0 = r6.f20153a;
        r0 = r0 | 1;
        r6.f20153a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.j();
        r6.f20155c = r0;
        r0 = r6.f20153a;
        r0 = r0 | 2;
        r6.f20153a = r0;
        goto L_0x0000;
    L_0x0028:
        r1 = r6.f20153a;
        r1 = r1 | 4;
        r6.f20153a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0054 }
        switch(r2) {
            case 0: goto L_0x005c;
            case 1: goto L_0x005c;
            case 2: goto L_0x005c;
            case 3: goto L_0x005c;
            default: goto L_0x0039;
        };	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0039:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = " is not a valid enum NetworkType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0054:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x005c:
        r6.f20156d = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r6.f20153a;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2 | 4;
        r6.f20153a = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;
    L_0x0065:
        r0 = r7.e();
        r6.f20157e = r0;
        r0 = r6.f20153a;
        r0 = r0 | 8;
        r6.f20153a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.e();
        r6.f20158f = r0;
        r0 = r6.f20153a;
        r0 = r0 | 16;
        r6.f20153a = r0;
        goto L_0x0000;
    L_0x007f:
        r1 = r6.f20153a;
        r1 = r1 | 32;
        r6.f20153a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x00ab }
        switch(r2) {
            case 0: goto L_0x00b4;
            case 1: goto L_0x00b4;
            case 2: goto L_0x0090;
            case 3: goto L_0x00b4;
            case 4: goto L_0x0090;
            case 5: goto L_0x00b4;
            default: goto L_0x0090;
        };	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x0090:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r4 = " is not a valid enum Priority";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00ab }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x00ab:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00b4:
        r6.f20159g = r2;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r6.f20153a;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r2 | 32;
        r6.f20153a = r2;	 Catch:{ IllegalArgumentException -> 0x00ab }
        goto L_0x0000;
    L_0x00be:
        r0 = r7.e();
        r6.f20160h = r0;
        r0 = r6.f20153a;
        r0 = r0 | 64;
        r6.f20153a = r0;
        goto L_0x0000;
    L_0x00cc:
        r0 = r7.e();
        r6.f20161i = r0;
        r0 = r6.f20153a;
        r0 = r0 | 128;
        r6.f20153a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.scheduler.a.a.b.b(com.google.protobuf.nano.a):com.google.android.finsky.scheduler.a.a.b");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m18767b(aVar);
    }
}
