package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p089i.p090a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0833d extends C0758b {
    public static volatile C0833d[] f5283a;
    public String f5284b;
    public int f5285c;
    public int f5286d;
    public String f5287e;
    public byte[] f5288f;
    public String f5289g;
    public String f5290h;
    public int f5291i;
    public boolean f5292j;

    public static int m5241a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum TokenProvider");
        }
    }

    public static C0833d[] m5242a() {
        if (f5283a == null) {
            synchronized (h.b) {
                if (f5283a == null) {
                    f5283a = new C0833d[0];
                }
            }
        }
        return f5283a;
    }

    public C0833d() {
        this.f5284b = "";
        this.f5285c = 0;
        this.f5286d = 0;
        this.f5287e = "";
        this.f5288f = l.l;
        this.f5289g = "";
        this.f5290h = "";
        this.f5291i = 0;
        this.f5292j = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5284b == null || this.f5284b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5284b);
        }
        if (this.f5285c != 0) {
            codedOutputByteBufferNano.a(2, this.f5285c);
        }
        if (!(this.f5287e == null || this.f5287e.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5287e);
        }
        if (!Arrays.equals(this.f5288f, l.l)) {
            codedOutputByteBufferNano.a(5, this.f5288f);
        }
        if (!(this.f5289g == null || this.f5289g.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5289g);
        }
        if (this.f5291i != 0) {
            codedOutputByteBufferNano.a(7, this.f5291i);
        }
        if (this.f5286d != 0) {
            codedOutputByteBufferNano.a(8, this.f5286d);
        }
        if (!(this.f5290h == null || this.f5290h.equals(""))) {
            codedOutputByteBufferNano.a(9, this.f5290h);
        }
        if (this.f5292j) {
            codedOutputByteBufferNano.a(10, this.f5292j);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5284b == null || this.f5284b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5284b);
        }
        if (this.f5285c != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f5285c);
        }
        if (!(this.f5287e == null || this.f5287e.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5287e);
        }
        if (!Arrays.equals(this.f5288f, l.l)) {
            b += CodedOutputByteBufferNano.b(5, this.f5288f);
        }
        if (!(this.f5289g == null || this.f5289g.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f5289g);
        }
        if (this.f5291i != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f5291i);
        }
        if (this.f5286d != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f5286d);
        }
        if (!(this.f5290h == null || this.f5290h.equals(""))) {
            b += CodedOutputByteBufferNano.b(9, this.f5290h);
        }
        if (this.f5292j) {
            return b + (CodedOutputByteBufferNano.d(10) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p089i.p090a.C0833d m5243b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            case 26: goto L_0x002c;
            case 42: goto L_0x0033;
            case 50: goto L_0x003a;
            case 56: goto L_0x0041;
            case 64: goto L_0x0072;
            case 74: goto L_0x00a5;
            case 80: goto L_0x00ad;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f5284b = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0024 }
        r2 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p089i.p090a.C0833d.m5241a(r2);	 Catch:{ IllegalArgumentException -> 0x0024 }
        r6.f5285c = r2;	 Catch:{ IllegalArgumentException -> 0x0024 }
        goto L_0x0000;
    L_0x0024:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x002c:
        r0 = r7.f();
        r6.f5287e = r0;
        goto L_0x0000;
    L_0x0033:
        r0 = r7.g();
        r6.f5288f = r0;
        goto L_0x0000;
    L_0x003a:
        r0 = r7.f();
        r6.f5289g = r0;
        goto L_0x0000;
    L_0x0041:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0067 }
        switch(r2) {
            case 0: goto L_0x006f;
            case 1: goto L_0x006f;
            case 2: goto L_0x006f;
            case 3: goto L_0x006f;
            default: goto L_0x004c;
        };	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x004c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r4 = " is not a valid enum TokenType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0067 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x006f:
        r6.f5291i = r2;	 Catch:{ IllegalArgumentException -> 0x0067 }
        goto L_0x0000;
    L_0x0072:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0098 }
        switch(r2) {
            case 0: goto L_0x00a1;
            case 1: goto L_0x00a1;
            case 2: goto L_0x00a1;
            case 3: goto L_0x00a1;
            case 4: goto L_0x00a1;
            case 5: goto L_0x00a1;
            case 6: goto L_0x00a1;
            case 7: goto L_0x00a1;
            case 8: goto L_0x00a1;
            case 9: goto L_0x00a1;
            case 10: goto L_0x00a1;
            case 11: goto L_0x00a1;
            case 12: goto L_0x00a1;
            case 13: goto L_0x00a1;
            case 14: goto L_0x00a1;
            case 15: goto L_0x00a1;
            default: goto L_0x007d;
        };	 Catch:{ IllegalArgumentException -> 0x0098 }
    L_0x007d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4 = " is not a valid enum CardType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0098 }
    L_0x0098:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00a1:
        r6.f5286d = r2;	 Catch:{ IllegalArgumentException -> 0x0098 }
        goto L_0x0000;
    L_0x00a5:
        r0 = r7.f();
        r6.f5290h = r0;
        goto L_0x0000;
    L_0x00ad:
        r0 = r7.e();
        r6.f5292j = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.i.a.d.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.i.a.d");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5243b(aVar);
    }
}
