package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7327i;

public final class as extends b {
    public int f38379a;
    public int f38380b;
    public String f38381c;
    public String f38382d;
    public C7327i f38383e;

    public as() {
        this.f38379a = 0;
        this.f38380b = 0;
        this.f38381c = "";
        this.f38382d = "";
        this.f38383e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36026a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f38380b);
        if ((this.f38379a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38381c);
        }
        if ((this.f38379a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38382d);
        }
        if (this.f38383e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38383e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36027b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f38380b);
        if ((this.f38379a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38381c);
        }
        if ((this.f38379a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38382d);
        }
        if (this.f38383e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f38383e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.as m36024b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 26: goto L_0x004c;
            case 34: goto L_0x0059;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            case 10: goto L_0x003c;
            case 11: goto L_0x003c;
            case 12: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum Result";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f38380b = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33564f();
        r6.f38381c = r0;
        r0 = r6.f38379a;
        r0 = r0 | 1;
        r6.f38379a = r0;
        goto L_0x0000;
    L_0x004c:
        r0 = r7.m33564f();
        r6.f38382d = r0;
        r0 = r6.f38379a;
        r0 = r0 | 2;
        r6.f38379a = r0;
        goto L_0x0000;
    L_0x0059:
        r0 = r6.f38383e;
        if (r0 != 0) goto L_0x0064;
    L_0x005d:
        r0 = new com.google.wireless.android.finsky.a.a.i;
        r0.<init>();
        r6.f38383e = r0;
    L_0x0064:
        r0 = r6.f38383e;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.as.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.as");
    }

    public final /* synthetic */ i m36025a(C7213a c7213a) {
        return m36024b(c7213a);
    }
}
