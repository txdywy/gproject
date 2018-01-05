package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0870h extends C0758b {
    public String f5537a;
    public int f5538b;
    public C0869g[] f5539c;
    public String f5540d;
    public String f5541e;
    public byte[] f5542f;

    public C0870h() {
        this.f5537a = "";
        this.f5538b = 1;
        this.f5539c = C0869g.m5466a();
        this.f5540d = "";
        this.f5541e = "";
        this.f5542f = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5537a == null || this.f5537a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5537a);
        }
        if (this.f5539c != null && this.f5539c.length > 0) {
            for (C0757i c0757i : this.f5539c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (!(this.f5540d == null || this.f5540d.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5540d);
        }
        if (!(this.f5541e == null || this.f5541e.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5541e);
        }
        if (this.f5538b != 1) {
            codedOutputByteBufferNano.a(5, this.f5538b);
        }
        if (!Arrays.equals(this.f5542f, l.l)) {
            codedOutputByteBufferNano.a(6, this.f5542f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5537a == null || this.f5537a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5537a);
        }
        if (this.f5539c != null && this.f5539c.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5539c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if (!(this.f5540d == null || this.f5540d.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5540d);
        }
        if (!(this.f5541e == null || this.f5541e.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5541e);
        }
        if (this.f5538b != 1) {
            b += CodedOutputByteBufferNano.d(5, this.f5538b);
        }
        if (Arrays.equals(this.f5542f, l.l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(6, this.f5542f);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0870h m5470b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 26: goto L_0x0055;
            case 34: goto L_0x005c;
            case 40: goto L_0x0063;
            case 50: goto L_0x0096;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f5537a = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = 18;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5539c;
        if (r0 != 0) goto L_0x0042;
    L_0x0020:
        r0 = r1;
    L_0x0021:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0869g[r2];
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r3 = r7.f5539c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x002b:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0046;
    L_0x0030:
        r3 = new com.google.a.a.a.a.b.a.c.g;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x002b;
    L_0x0042:
        r0 = r7.f5539c;
        r0 = r0.length;
        goto L_0x0021;
    L_0x0046:
        r3 = new com.google.a.a.a.a.b.a.c.g;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5539c = r2;
        goto L_0x0001;
    L_0x0055:
        r0 = r8.f();
        r7.f5540d = r0;
        goto L_0x0001;
    L_0x005c:
        r0 = r8.f();
        r7.f5541e = r0;
        goto L_0x0001;
    L_0x0063:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0089 }
        switch(r3) {
            case 1: goto L_0x0092;
            case 2: goto L_0x0092;
            default: goto L_0x006e;
        };	 Catch:{ IllegalArgumentException -> 0x0089 }
    L_0x006e:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r5 = 43;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0089 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0089 }
        r5 = " is not a valid enum ErrorAction";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0089 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0089 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0089 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0089 }
    L_0x0089:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0092:
        r7.f5538b = r3;	 Catch:{ IllegalArgumentException -> 0x0089 }
        goto L_0x0001;
    L_0x0096:
        r0 = r8.g();
        r7.f5542f = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.c.h.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.c.h");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5470b(aVar);
    }
}
