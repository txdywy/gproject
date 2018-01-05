package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5682s extends C0758b {
    public Long f28813a;
    public Integer f28814b;

    public C5682s() {
        this.f28813a = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28813a != null) {
            codedOutputByteBufferNano.b(1, this.f28813a.longValue());
        }
        if (this.f28814b != null) {
            codedOutputByteBufferNano.a(2, this.f28814b.intValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28813a != null) {
            b += CodedOutputByteBufferNano.f(1, this.f28813a.longValue());
        }
        if (this.f28814b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f28814b.intValue());
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.p306h.p307a.p308a.C5682s m26915b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x0019;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.j();
        r0 = java.lang.Long.valueOf(r0);
        r6.f28813a = r0;
        goto L_0x0000;
    L_0x0019:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003f }
        switch(r2) {
            case 0: goto L_0x0047;
            case 1: goto L_0x0047;
            case 2: goto L_0x0047;
            case 3: goto L_0x0047;
            default: goto L_0x0024;
        };	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x0024:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003f }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003f }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003f }
        r4 = " is not a valid enum Source";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0047:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x003f }
        r6.f28814b = r2;	 Catch:{ IllegalArgumentException -> 0x003f }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.h.a.a.s.b(com.google.protobuf.nano.a):com.google.android.h.a.a.s");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m26915b(aVar);
    }
}
