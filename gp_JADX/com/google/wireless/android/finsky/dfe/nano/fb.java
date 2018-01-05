package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ip;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fb extends b {
    public int f38892a;
    public int f38893b;
    public String f38894c;
    public int f38895d;
    public String f38896e;
    public String f38897f;
    public ip f38898g;

    public fb() {
        this.f38892a = 0;
        this.f38893b = 0;
        this.f38894c = "";
        this.f38895d = 0;
        this.f38896e = "";
        this.f38897f = "";
        this.f38898g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36398a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38892a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38893b);
        }
        if ((this.f38892a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38894c);
        }
        if ((this.f38892a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38895d);
        }
        if ((this.f38892a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38896e);
        }
        if ((this.f38892a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38897f);
        }
        if (this.f38898g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f38898g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36399b() {
        int b = super.b();
        if ((this.f38892a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38893b);
        }
        if ((this.f38892a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38894c);
        }
        if ((this.f38892a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f38895d);
        }
        if ((this.f38892a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38896e);
        }
        if ((this.f38892a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38897f);
        }
        if (this.f38898g != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f38898g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.fb m36396b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 24: goto L_0x0058;
            case 34: goto L_0x0097;
            case 42: goto L_0x00a5;
            case 50: goto L_0x00b3;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f38892a;
        r1 = r1 | 1;
        r6.f38892a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f38893b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38892a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38892a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f38894c = r0;
        r0 = r6.f38892a;
        r0 = r0 | 2;
        r6.f38892a = r0;
        goto L_0x0000;
    L_0x0058:
        r1 = r6.f38892a;
        r1 = r1 | 4;
        r6.f38892a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0084 }
        switch(r2) {
            case 0: goto L_0x008d;
            case 1: goto L_0x008d;
            case 2: goto L_0x008d;
            case 3: goto L_0x008d;
            case 4: goto L_0x008d;
            case 5: goto L_0x008d;
            case 6: goto L_0x008d;
            case 7: goto L_0x008d;
            case 8: goto L_0x008d;
            case 9: goto L_0x008d;
            case 10: goto L_0x008d;
            case 11: goto L_0x008d;
            case 12: goto L_0x008d;
            case 13: goto L_0x0069;
            case 14: goto L_0x008d;
            case 15: goto L_0x008d;
            case 16: goto L_0x008d;
            case 17: goto L_0x008d;
            case 18: goto L_0x008d;
            case 19: goto L_0x008d;
            case 20: goto L_0x008d;
            case 21: goto L_0x008d;
            case 22: goto L_0x008d;
            case 23: goto L_0x008d;
            case 24: goto L_0x008d;
            case 25: goto L_0x008d;
            case 26: goto L_0x008d;
            case 27: goto L_0x008d;
            case 28: goto L_0x008d;
            case 29: goto L_0x008d;
            case 30: goto L_0x008d;
            case 31: goto L_0x008d;
            case 32: goto L_0x008d;
            default: goto L_0x0069;
        };	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0069:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r4 = " is not a valid enum PermissionCode";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0084 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0084 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0084:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x008d:
        r6.f38895d = r2;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r2 = r6.f38892a;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r2 = r2 | 4;
        r6.f38892a = r2;	 Catch:{ IllegalArgumentException -> 0x0084 }
        goto L_0x0000;
    L_0x0097:
        r0 = r7.m33564f();
        r6.f38896e = r0;
        r0 = r6.f38892a;
        r0 = r0 | 8;
        r6.f38892a = r0;
        goto L_0x0000;
    L_0x00a5:
        r0 = r7.m33564f();
        r6.f38897f = r0;
        r0 = r6.f38892a;
        r0 = r0 | 16;
        r6.f38892a = r0;
        goto L_0x0000;
    L_0x00b3:
        r0 = r6.f38898g;
        if (r0 != 0) goto L_0x00be;
    L_0x00b7:
        r0 = new com.google.android.finsky.cv.a.ip;
        r0.<init>();
        r6.f38898g = r0;
    L_0x00be:
        r0 = r6.f38898g;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.fb.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.fb");
    }

    public final /* synthetic */ i m36397a(C7213a c7213a) {
        return m36396b(c7213a);
    }
}
