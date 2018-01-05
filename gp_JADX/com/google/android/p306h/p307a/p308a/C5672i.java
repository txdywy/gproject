package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5672i extends C0758b {
    public Integer f28759a;
    public Integer f28760b;
    public C5668e[] f28761c;

    public C5672i() {
        this.f28760b = null;
        this.f28761c = C5668e.m26866a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28759a != null) {
            codedOutputByteBufferNano.a(1, this.f28759a.intValue());
        }
        if (this.f28760b != null) {
            codedOutputByteBufferNano.a(2, this.f28760b.intValue());
        }
        if (this.f28761c != null && this.f28761c.length > 0) {
            for (C0757i c0757i : this.f28761c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28759a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f28759a.intValue());
        }
        if (this.f28760b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f28760b.intValue());
        }
        if (this.f28761c == null || this.f28761c.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f28761c) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(3, c0757i);
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.p306h.p307a.p308a.C5672i m26881b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x0044;
            case 26: goto L_0x004f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r3) {
            case 0: goto L_0x003d;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 38;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum TaskId";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x003d:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r7.f28759a = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0044:
        r0 = r8.i();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f28760b = r0;
        goto L_0x0001;
    L_0x004f:
        r0 = 26;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f28761c;
        if (r0 != 0) goto L_0x007b;
    L_0x0059:
        r0 = r1;
    L_0x005a:
        r2 = r2 + r0;
        r2 = new com.google.android.p306h.p307a.p308a.C5668e[r2];
        if (r0 == 0) goto L_0x0064;
    L_0x005f:
        r3 = r7.f28761c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0064:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x007f;
    L_0x0069:
        r3 = new com.google.android.h.a.a.e;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0064;
    L_0x007b:
        r0 = r7.f28761c;
        r0 = r0.length;
        goto L_0x005a;
    L_0x007f:
        r3 = new com.google.android.h.a.a.e;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f28761c = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.h.a.a.i.b(com.google.protobuf.nano.a):com.google.android.h.a.a.i");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m26881b(aVar);
    }
}
