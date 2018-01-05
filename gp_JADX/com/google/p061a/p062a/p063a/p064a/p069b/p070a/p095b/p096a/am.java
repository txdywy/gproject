package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class am extends C0758b {
    public int f5368a;
    public String f5369b;
    public int f5370c;

    public am() {
        this.f5368a = 0;
        this.f5369b = "";
        this.f5370c = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5368a != 0) {
            codedOutputByteBufferNano.a(1, this.f5368a);
        }
        if (!(this.f5369b == null || this.f5369b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5369b);
        }
        if (this.f5370c != 0) {
            codedOutputByteBufferNano.a(3, this.f5370c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5368a != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5368a);
        }
        if (!(this.f5369b == null || this.f5369b.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5369b);
        }
        if (this.f5370c != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f5370c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.am m5308b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x0025;
            case 24: goto L_0x002c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x001d }
        r2 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at.m5343a(r2);	 Catch:{ IllegalArgumentException -> 0x001d }
        r6.f5368a = r2;	 Catch:{ IllegalArgumentException -> 0x001d }
        goto L_0x0000;
    L_0x001d:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0025:
        r0 = r7.f();
        r6.f5369b = r0;
        goto L_0x0000;
    L_0x002c:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0052 }
        switch(r2) {
            case 0: goto L_0x005a;
            case 1: goto L_0x005a;
            case 2: goto L_0x005a;
            default: goto L_0x0037;
        };	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0037:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r4 = " is not a valid enum DisplayType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0052 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x005a:
        r6.f5370c = r2;	 Catch:{ IllegalArgumentException -> 0x0052 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.am.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.am");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5308b(aVar);
    }
}
