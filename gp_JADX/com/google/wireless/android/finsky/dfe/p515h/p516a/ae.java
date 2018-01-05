package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public static volatile ae[] f38024a;
    public int f38025b;
    public bd f38026c;
    public String f38027d;
    public String f38028e;
    public ax f38029f;
    public String f38030g;
    public String f38031h;
    public int f38032i;
    public boolean f38033j;
    public boolean f38034k;
    public cv f38035l;

    public static ae[] m35734d() {
        if (f38024a == null) {
            synchronized (C7219h.f35465b) {
                if (f38024a == null) {
                    f38024a = new ae[0];
                }
            }
        }
        return f38024a;
    }

    public final ae m35738e() {
        this.f38025b |= 32;
        this.f38033j = true;
        return this;
    }

    public ae() {
        this.f38025b = 0;
        this.f38026c = null;
        this.f38027d = "";
        this.f38028e = "";
        this.f38029f = null;
        this.f38030g = "";
        this.f38031h = "";
        this.f38032i = 0;
        this.f38033j = false;
        this.f38034k = false;
        this.f38035l = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35736a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38026c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38026c);
        }
        if ((this.f38025b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38027d);
        }
        if ((this.f38025b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38028e);
        }
        if (this.f38029f != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38029f);
        }
        if ((this.f38025b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38030g);
        }
        if ((this.f38025b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38031h);
        }
        if ((this.f38025b & 16) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f38032i);
        }
        if ((this.f38025b & 32) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f38033j);
        }
        if ((this.f38025b & 64) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f38034k);
        }
        if (this.f38035l != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38035l);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35737b() {
        int b = super.b();
        if (this.f38026c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38026c);
        }
        if ((this.f38025b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38027d);
        }
        if ((this.f38025b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38028e);
        }
        if (this.f38029f != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38029f);
        }
        if ((this.f38025b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38030g);
        }
        if ((this.f38025b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38031h);
        }
        if ((this.f38025b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f38032i);
        }
        if ((this.f38025b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f38025b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if (this.f38035l != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f38035l);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.ae m35733b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001f;
            case 26: goto L_0x002c;
            case 34: goto L_0x0039;
            case 42: goto L_0x004a;
            case 50: goto L_0x0057;
            case 56: goto L_0x0064;
            case 64: goto L_0x00a3;
            case 72: goto L_0x00b1;
            case 82: goto L_0x00bf;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f38026c;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f38026c = r0;
    L_0x0019:
        r0 = r6.f38026c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r7.m33564f();
        r6.f38027d = r0;
        r0 = r6.f38025b;
        r0 = r0 | 1;
        r6.f38025b = r0;
        goto L_0x0000;
    L_0x002c:
        r0 = r7.m33564f();
        r6.f38028e = r0;
        r0 = r6.f38025b;
        r0 = r0 | 2;
        r6.f38025b = r0;
        goto L_0x0000;
    L_0x0039:
        r0 = r6.f38029f;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r6.f38029f = r0;
    L_0x0044:
        r0 = r6.f38029f;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x004a:
        r0 = r7.m33564f();
        r6.f38030g = r0;
        r0 = r6.f38025b;
        r0 = r0 | 4;
        r6.f38025b = r0;
        goto L_0x0000;
    L_0x0057:
        r0 = r7.m33564f();
        r6.f38031h = r0;
        r0 = r6.f38025b;
        r0 = r0 | 8;
        r6.f38025b = r0;
        goto L_0x0000;
    L_0x0064:
        r1 = r6.f38025b;
        r1 = r1 | 16;
        r6.f38025b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0090 }
        switch(r2) {
            case 0: goto L_0x0099;
            case 1: goto L_0x0099;
            case 2: goto L_0x0099;
            case 3: goto L_0x0099;
            case 4: goto L_0x0099;
            default: goto L_0x0075;
        };	 Catch:{ IllegalArgumentException -> 0x0090 }
    L_0x0075:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0090 }
        r4 = " is not a valid enum Type";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0090 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0090 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0090 }
    L_0x0090:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0099:
        r6.f38032i = r2;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r6.f38025b;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r2 | 16;
        r6.f38025b = r2;	 Catch:{ IllegalArgumentException -> 0x0090 }
        goto L_0x0000;
    L_0x00a3:
        r0 = r7.m33563e();
        r6.f38033j = r0;
        r0 = r6.f38025b;
        r0 = r0 | 32;
        r6.f38025b = r0;
        goto L_0x0000;
    L_0x00b1:
        r0 = r7.m33563e();
        r6.f38034k = r0;
        r0 = r6.f38025b;
        r0 = r0 | 64;
        r6.f38025b = r0;
        goto L_0x0000;
    L_0x00bf:
        r0 = r6.f38035l;
        if (r0 != 0) goto L_0x00ca;
    L_0x00c3:
        r0 = new com.google.android.finsky.cv.a.cv;
        r0.<init>();
        r6.f38035l = r0;
    L_0x00ca:
        r0 = r6.f38035l;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.ae.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.ae");
    }

    public final /* synthetic */ i m35735a(C7213a c7213a) {
        return m35733b(c7213a);
    }
}
