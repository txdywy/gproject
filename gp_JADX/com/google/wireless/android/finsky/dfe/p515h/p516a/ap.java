package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ap extends b {
    public static volatile ap[] f38051a;
    public int f38052b;
    public String f38053c;
    public String f38054d;
    public int f38055e;

    public static ap[] m35768d() {
        if (f38051a == null) {
            synchronized (C7219h.f35465b) {
                if (f38051a == null) {
                    f38051a = new ap[0];
                }
            }
        }
        return f38051a;
    }

    public ap() {
        this.f38052b = 0;
        this.f38053c = "";
        this.f38054d = "";
        this.f38055e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35770a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38052b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38053c);
        }
        if ((this.f38052b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38054d);
        }
        if ((this.f38052b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38055e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35771b() {
        int b = super.b();
        if ((this.f38052b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38053c);
        }
        if ((this.f38052b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38054d);
        }
        if ((this.f38052b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f38055e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.ap m35767b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x0028;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f38053c = r0;
        r0 = r6.f38052b;
        r0 = r0 | 1;
        r6.f38052b = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33564f();
        r6.f38054d = r0;
        r0 = r6.f38052b;
        r0 = r0 | 2;
        r6.f38052b = r0;
        goto L_0x0000;
    L_0x0028:
        r1 = r6.f38052b;
        r1 = r1 | 4;
        r6.f38052b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0054 }
        switch(r2) {
            case 0: goto L_0x005c;
            case 1: goto L_0x005c;
            case 2: goto L_0x005c;
            default: goto L_0x0039;
        };	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0039:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = 53;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = " is not a valid enum RemoteEscalationState";
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
        r6.f38055e = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r6.f38052b;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2 | 4;
        r6.f38052b = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.ap.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.ap");
    }

    public final /* synthetic */ i m35769a(C7213a c7213a) {
        return m35767b(c7213a);
    }
}
