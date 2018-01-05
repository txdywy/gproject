package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.ax;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class ag extends b {
    public int f37054a;
    public C7367w[] f37055b;
    public dr f37056c;
    public ax f37057d;
    public ar f37058e;
    public int f37059f;
    public byte[] f37060g;
    public String f37061h;

    public ag() {
        this.f37054a = 0;
        this.f37055b = C7367w.m34905d();
        this.f37056c = null;
        this.f37057d = null;
        this.f37058e = null;
        this.f37059f = 0;
        this.f37060g = C7222l.f35479l;
        this.f37061h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35085a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37055b != null && this.f37055b.length > 0) {
            for (i iVar : this.f37055b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (this.f37056c != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37056c);
        }
        if (this.f37057d != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37057d);
        }
        if (this.f37058e != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37058e);
        }
        if ((this.f37054a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f37059f);
        }
        if ((this.f37054a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(8, this.f37060g);
        }
        if ((this.f37054a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f37061h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35086b() {
        int b = super.b();
        if (this.f37055b != null && this.f37055b.length > 0) {
            for (i iVar : this.f37055b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
        }
        if (this.f37056c != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37056c);
        }
        if (this.f37057d != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37057d);
        }
        if (this.f37058e != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37058e);
        }
        if ((this.f37054a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f37059f);
        }
        if ((this.f37054a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(8, this.f37060g);
        }
        if ((this.f37054a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(9, this.f37061h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.ag m35083b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 26: goto L_0x000f;
            case 34: goto L_0x004e;
            case 42: goto L_0x005f;
            case 50: goto L_0x0070;
            case 56: goto L_0x0081;
            case 66: goto L_0x00c0;
            case 74: goto L_0x00ce;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = 26;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f37055b;
        if (r0 != 0) goto L_0x003b;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.p493b.C7367w[r2];
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r7.f37055b;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0024:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x003f;
    L_0x0029:
        r3 = new com.google.wireless.android.finsky.b.w;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x003b:
        r0 = r7.f37055b;
        r0 = r0.length;
        goto L_0x001a;
    L_0x003f:
        r3 = new com.google.wireless.android.finsky.b.w;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f37055b = r2;
        goto L_0x0001;
    L_0x004e:
        r0 = r7.f37056c;
        if (r0 != 0) goto L_0x0059;
    L_0x0052:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.dr;
        r0.<init>();
        r7.f37056c = r0;
    L_0x0059:
        r0 = r7.f37056c;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x005f:
        r0 = r7.f37057d;
        if (r0 != 0) goto L_0x006a;
    L_0x0063:
        r0 = new com.google.wireless.android.finsky.a.a.ax;
        r0.<init>();
        r7.f37057d = r0;
    L_0x006a:
        r0 = r7.f37057d;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0070:
        r0 = r7.f37058e;
        if (r0 != 0) goto L_0x007b;
    L_0x0074:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.ar;
        r0.<init>();
        r7.f37058e = r0;
    L_0x007b:
        r0 = r7.f37058e;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0081:
        r2 = r7.f37054a;
        r2 = r2 | 1;
        r7.f37054a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00ad }
        switch(r3) {
            case 0: goto L_0x00b6;
            case 1: goto L_0x00b6;
            case 2: goto L_0x00b6;
            default: goto L_0x0092;
        };	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x0092:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r5 = 36;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r5 = " is not a valid enum Type";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00ad }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00ad }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00ad:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00b6:
        r7.f37059f = r3;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = r7.f37054a;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = r3 | 1;
        r7.f37054a = r3;	 Catch:{ IllegalArgumentException -> 0x00ad }
        goto L_0x0001;
    L_0x00c0:
        r0 = r8.m33565g();
        r7.f37060g = r0;
        r0 = r7.f37054a;
        r0 = r0 | 2;
        r7.f37054a = r0;
        goto L_0x0001;
    L_0x00ce:
        r0 = r8.m33564f();
        r7.f37061h = r0;
        r0 = r7.f37054a;
        r0 = r0 | 4;
        r7.f37054a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.ag.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.ag");
    }

    public final /* synthetic */ i m35084a(C7213a c7213a) {
        return m35083b(c7213a);
    }
}
