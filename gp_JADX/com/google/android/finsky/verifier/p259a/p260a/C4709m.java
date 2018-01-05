package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C4709m extends C0758b {
    public static volatile C4709m[] f24219a;
    public int f24220b;
    public String f24221c;
    public int f24222d;
    public byte[] f24223e;
    public String f24224f;

    public static C4709m[] cp_() {
        if (f24219a == null) {
            synchronized (h.b) {
                if (f24219a == null) {
                    f24219a = new C4709m[0];
                }
            }
        }
        return f24219a;
    }

    public C4709m() {
        this.f24220b = 0;
        this.f24221c = "";
        this.f24222d = 0;
        this.f24223e = l.l;
        this.f24224f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(1, this.f24221c);
        codedOutputByteBufferNano.a(2, this.f24222d);
        if ((this.f24220b & 1) != 0) {
            codedOutputByteBufferNano.a(3, this.f24223e);
        }
        if ((this.f24220b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f24224f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = (super.mo1128b() + CodedOutputByteBufferNano.b(1, this.f24221c)) + CodedOutputByteBufferNano.d(2, this.f24222d);
        if ((this.f24220b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f24223e);
        }
        if ((this.f24220b & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f24224f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.verifier.p259a.p260a.C4709m m21920b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            case 26: goto L_0x0046;
            case 34: goto L_0x0053;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f24221c = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r2) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0020;
            case 2: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = " is not a valid enum ResourceType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0043:
        r6.f24222d = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
    L_0x0046:
        r0 = r7.g();
        r6.f24223e = r0;
        r0 = r6.f24220b;
        r0 = r0 | 1;
        r6.f24220b = r0;
        goto L_0x0000;
    L_0x0053:
        r0 = r7.f();
        r6.f24224f = r0;
        r0 = r6.f24220b;
        r0 = r0 | 2;
        r6.f24220b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.a.a.m.b(com.google.protobuf.nano.a):com.google.android.finsky.verifier.a.a.m");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m21920b(aVar);
    }
}
