package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0853q extends C0758b {
    public long[] f5476a;
    public int f5477b;
    public int f5478c;

    public C0853q() {
        this.f5476a = l.f;
        this.f5477b = 0;
        this.f5478c = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5476a != null && this.f5476a.length > 0) {
            int i2 = 0;
            for (long c : this.f5476a) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(10);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5476a.length) {
                codedOutputByteBufferNano.b(this.f5476a[i]);
                i++;
            }
        }
        if (this.f5477b != 0) {
            codedOutputByteBufferNano.a(2, this.f5477b);
        }
        if (this.f5478c != 0) {
            codedOutputByteBufferNano.a(3, this.f5478c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5476a == null || this.f5476a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f5476a.length) {
                i2 += CodedOutputByteBufferNano.c(this.f5476a[i]);
                i++;
            }
            i = ((b + i2) + 1) + CodedOutputByteBufferNano.f(i2);
        }
        if (this.f5477b != 0) {
            i += CodedOutputByteBufferNano.d(2, this.f5477b);
        }
        if (this.f5478c != 0) {
            return i + CodedOutputByteBufferNano.d(3, this.f5478c);
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0853q m5408b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 10: goto L_0x0042;
            case 16: goto L_0x0084;
            case 24: goto L_0x00b7;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = 8;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5476a;
        if (r0 != 0) goto L_0x0035;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r7.f5476a;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0024:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0039;
    L_0x0029:
        r4 = r8.j();
        r2[r0] = r4;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x0035:
        r0 = r7.f5476a;
        r0 = r0.length;
        goto L_0x001a;
    L_0x0039:
        r4 = r8.j();
        r2[r0] = r4;
        r7.f5476a = r2;
        goto L_0x0001;
    L_0x0042:
        r0 = r8.i();
        r3 = r8.c(r0);
        r2 = r8.o();
        r0 = r1;
    L_0x004f:
        r4 = r8.m();
        if (r4 <= 0) goto L_0x005b;
    L_0x0055:
        r8.j();
        r0 = r0 + 1;
        goto L_0x004f;
    L_0x005b:
        r8.e(r2);
        r2 = r7.f5476a;
        if (r2 != 0) goto L_0x0079;
    L_0x0062:
        r2 = r1;
    L_0x0063:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x006d;
    L_0x0068:
        r4 = r7.f5476a;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x006d:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x007d;
    L_0x0070:
        r4 = r8.j();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x006d;
    L_0x0079:
        r2 = r7.f5476a;
        r2 = r2.length;
        goto L_0x0063;
    L_0x007d:
        r7.f5476a = r0;
        r8.d(r3);
        goto L_0x0001;
    L_0x0084:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00aa }
        switch(r3) {
            case 0: goto L_0x00b3;
            case 1: goto L_0x00b3;
            case 2: goto L_0x00b3;
            default: goto L_0x008f;
        };	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x008f:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r5 = " is not a valid enum ModifyType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00aa }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00aa }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x00aa:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00b3:
        r7.f5477b = r3;	 Catch:{ IllegalArgumentException -> 0x00aa }
        goto L_0x0001;
    L_0x00b7:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00dd }
        switch(r3) {
            case 0: goto L_0x00e6;
            case 1: goto L_0x00e6;
            case 2: goto L_0x00e6;
            default: goto L_0x00c2;
        };	 Catch:{ IllegalArgumentException -> 0x00dd }
    L_0x00c2:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r5 = 40;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00dd }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00dd }
        r5 = " is not a valid enum ListType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00dd }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00dd }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00dd }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00dd }
    L_0x00dd:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00e6:
        r7.f5478c = r3;	 Catch:{ IllegalArgumentException -> 0x00dd }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.q.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.q");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5408b(aVar);
    }
}
