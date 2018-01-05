package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7500y extends b {
    public int f38158a;
    public int f38159b;
    public C7491p f38160c;
    public String f38161d;
    public String f38162e;
    public String f38163f;
    public String f38164g;
    public C7492q[] f38165h;
    public String f38166i;
    public C7493r f38167j;
    public String f38168k;

    public C7500y() {
        this.f38158a = 0;
        this.f38159b = 0;
        this.f38160c = null;
        this.f38161d = "";
        this.f38162e = "";
        this.f38163f = "";
        this.f38164g = "";
        this.f38165h = C7492q.m35836d();
        this.f38166i = "";
        this.f38167j = null;
        this.f38168k = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35866a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38160c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38160c);
        }
        if (this.f38165h != null && this.f38165h.length > 0) {
            for (i iVar : this.f38165h) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if ((this.f38158a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38162e);
        }
        if ((this.f38158a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38163f);
        }
        if ((this.f38158a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38164g);
        }
        if ((this.f38158a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38159b);
        }
        if ((this.f38158a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38161d);
        }
        if ((this.f38158a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38168k);
        }
        if ((this.f38158a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38166i);
        }
        if (this.f38167j != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38167j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35867b() {
        int b = super.b();
        if (this.f38160c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38160c);
        }
        if (this.f38165h != null && this.f38165h.length > 0) {
            int i = b;
            for (i iVar : this.f38165h) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if ((this.f38158a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38162e);
        }
        if ((this.f38158a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38163f);
        }
        if ((this.f38158a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38164g);
        }
        if ((this.f38158a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f38159b);
        }
        if ((this.f38158a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f38161d);
        }
        if ((this.f38158a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f38168k);
        }
        if ((this.f38158a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38166i);
        }
        if (this.f38167j != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f38167j);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.C7500y m35864b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0020;
            case 26: goto L_0x005f;
            case 34: goto L_0x006c;
            case 42: goto L_0x0079;
            case 48: goto L_0x0087;
            case 58: goto L_0x00c6;
            case 66: goto L_0x00d4;
            case 74: goto L_0x00e2;
            case 82: goto L_0x00f0;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r7.f38160c;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.wireless.android.finsky.dfe.h.a.p;
        r0.<init>();
        r7.f38160c = r0;
    L_0x001a:
        r0 = r7.f38160c;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0020:
        r0 = 18;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38165h;
        if (r0 != 0) goto L_0x004c;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.p515h.p516a.C7492q[r2];
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r3 = r7.f38165h;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0035:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0050;
    L_0x003a:
        r3 = new com.google.wireless.android.finsky.dfe.h.a.q;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0035;
    L_0x004c:
        r0 = r7.f38165h;
        r0 = r0.length;
        goto L_0x002b;
    L_0x0050:
        r3 = new com.google.wireless.android.finsky.dfe.h.a.q;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f38165h = r2;
        goto L_0x0001;
    L_0x005f:
        r0 = r8.m33564f();
        r7.f38162e = r0;
        r0 = r7.f38158a;
        r0 = r0 | 4;
        r7.f38158a = r0;
        goto L_0x0001;
    L_0x006c:
        r0 = r8.m33564f();
        r7.f38163f = r0;
        r0 = r7.f38158a;
        r0 = r0 | 8;
        r7.f38158a = r0;
        goto L_0x0001;
    L_0x0079:
        r0 = r8.m33564f();
        r7.f38164g = r0;
        r0 = r7.f38158a;
        r0 = r0 | 16;
        r7.f38158a = r0;
        goto L_0x0001;
    L_0x0087:
        r2 = r7.f38158a;
        r2 = r2 | 1;
        r7.f38158a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00b3 }
        switch(r3) {
            case 0: goto L_0x00bc;
            case 1: goto L_0x00bc;
            case 2: goto L_0x00bc;
            case 3: goto L_0x00bc;
            default: goto L_0x0098;
        };	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x0098:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = 54;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = " is not a valid enum PurchaseSettingVersion";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x00b3:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00bc:
        r7.f38159b = r3;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r7.f38158a;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r3 | 1;
        r7.f38158a = r3;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        goto L_0x0001;
    L_0x00c6:
        r0 = r8.m33564f();
        r7.f38161d = r0;
        r0 = r7.f38158a;
        r0 = r0 | 2;
        r7.f38158a = r0;
        goto L_0x0001;
    L_0x00d4:
        r0 = r8.m33564f();
        r7.f38168k = r0;
        r0 = r7.f38158a;
        r0 = r0 | 64;
        r7.f38158a = r0;
        goto L_0x0001;
    L_0x00e2:
        r0 = r8.m33564f();
        r7.f38166i = r0;
        r0 = r7.f38158a;
        r0 = r0 | 32;
        r7.f38158a = r0;
        goto L_0x0001;
    L_0x00f0:
        r0 = r7.f38167j;
        if (r0 != 0) goto L_0x00fb;
    L_0x00f4:
        r0 = new com.google.wireless.android.finsky.dfe.h.a.r;
        r0.<init>();
        r7.f38167j = r0;
    L_0x00fb:
        r0 = r7.f38167j;
        r8.m33552a(r0);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.y.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.y");
    }

    public final /* synthetic */ i m35865a(C7213a c7213a) {
        return m35864b(c7213a);
    }
}
