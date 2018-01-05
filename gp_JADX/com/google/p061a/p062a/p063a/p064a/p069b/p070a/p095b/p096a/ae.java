package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ae extends C0758b {
    public static volatile ae[] f5321a;
    public long f5322b;
    public ad[] f5323c;
    public ag f5324d;
    public String f5325e;
    public String f5326f;
    public String f5327g;
    public int f5328h;
    public int f5329i;
    public boolean f5330j;
    public int f5331k;

    private static int m5272a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum DisplayType");
        }
    }

    public static ae[] m5273a() {
        if (f5321a == null) {
            synchronized (h.b) {
                if (f5321a == null) {
                    f5321a = new ae[0];
                }
            }
        }
        return f5321a;
    }

    public ae() {
        this.f5322b = 0;
        this.f5323c = ad.m5268a();
        this.f5324d = null;
        this.f5325e = "";
        this.f5326f = "";
        this.f5327g = "";
        this.f5328h = 0;
        this.f5329i = 0;
        this.f5330j = false;
        this.f5331k = 1;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5325e == null || this.f5325e.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5325e);
        }
        if (!(this.f5326f == null || this.f5326f.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5326f);
        }
        if (!(this.f5327g == null || this.f5327g.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5327g);
        }
        if (this.f5322b != 0) {
            codedOutputByteBufferNano.b(4, this.f5322b);
        }
        if (this.f5328h != 0) {
            codedOutputByteBufferNano.a(5, this.f5328h);
        }
        if (this.f5323c != null && this.f5323c.length > 0) {
            for (C0757i c0757i : this.f5323c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(6, c0757i);
                }
            }
        }
        if (this.f5324d != null) {
            codedOutputByteBufferNano.b(11, this.f5324d);
        }
        if (this.f5329i != 0) {
            codedOutputByteBufferNano.a(12, this.f5329i);
        }
        if (this.f5331k != 1) {
            codedOutputByteBufferNano.a(14, this.f5331k);
        }
        if (this.f5330j) {
            codedOutputByteBufferNano.a(15, this.f5330j);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5325e == null || this.f5325e.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5325e);
        }
        if (!(this.f5326f == null || this.f5326f.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5326f);
        }
        if (!(this.f5327g == null || this.f5327g.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5327g);
        }
        if (this.f5322b != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f5322b);
        }
        if (this.f5328h != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f5328h);
        }
        if (this.f5323c != null && this.f5323c.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5323c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(6, c0757i);
                }
            }
            b = i;
        }
        if (this.f5324d != null) {
            b += CodedOutputByteBufferNano.d(11, this.f5324d);
        }
        if (this.f5329i != 0) {
            b += CodedOutputByteBufferNano.d(12, this.f5329i);
        }
        if (this.f5331k != 1) {
            b += CodedOutputByteBufferNano.d(14, this.f5331k);
        }
        if (this.f5330j) {
            return b + (CodedOutputByteBufferNano.d(15) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae m5274b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 26: goto L_0x001d;
            case 32: goto L_0x0024;
            case 40: goto L_0x002b;
            case 50: goto L_0x0042;
            case 90: goto L_0x0081;
            case 96: goto L_0x0093;
            case 112: goto L_0x00ac;
            case 120: goto L_0x00df;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f5325e = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r8.f();
        r7.f5326f = r0;
        goto L_0x0001;
    L_0x001d:
        r0 = r8.f();
        r7.f5327g = r0;
        goto L_0x0001;
    L_0x0024:
        r2 = r8.j();
        r7.f5322b = r2;
        goto L_0x0001;
    L_0x002b:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae.m5272a(r3);	 Catch:{ IllegalArgumentException -> 0x003a }
        r7.f5328h = r3;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0001;
    L_0x003a:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0042:
        r0 = 50;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5323c;
        if (r0 != 0) goto L_0x006e;
    L_0x004c:
        r0 = r1;
    L_0x004d:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad[r2];
        if (r0 == 0) goto L_0x0057;
    L_0x0052:
        r3 = r7.f5323c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0057:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0072;
    L_0x005c:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0057;
    L_0x006e:
        r0 = r7.f5323c;
        r0 = r0.length;
        goto L_0x004d;
    L_0x0072:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5323c = r2;
        goto L_0x0001;
    L_0x0081:
        r0 = r7.f5324d;
        if (r0 != 0) goto L_0x008c;
    L_0x0085:
        r0 = new com.google.a.a.a.a.b.a.b.a.ag;
        r0.<init>();
        r7.f5324d = r0;
    L_0x008c:
        r0 = r7.f5324d;
        r8.a(r0);
        goto L_0x0001;
    L_0x0093:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae.m5272a(r3);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r7.f5329i = r3;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x0001;
    L_0x00a3:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00ac:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00d2 }
        switch(r3) {
            case 0: goto L_0x00db;
            case 1: goto L_0x00db;
            case 2: goto L_0x00db;
            case 3: goto L_0x00db;
            default: goto L_0x00b7;
        };	 Catch:{ IllegalArgumentException -> 0x00d2 }
    L_0x00b7:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r5 = 41;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r5 = " is not a valid enum Alignment";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00d2 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00d2 }
    L_0x00d2:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00db:
        r7.f5331k = r3;	 Catch:{ IllegalArgumentException -> 0x00d2 }
        goto L_0x0001;
    L_0x00df:
        r0 = r8.e();
        r7.f5330j = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.ae.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.ae");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5274b(aVar);
    }
}
