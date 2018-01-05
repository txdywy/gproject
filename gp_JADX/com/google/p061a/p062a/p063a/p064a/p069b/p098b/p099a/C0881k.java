package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0881k extends C0758b {
    public C0873c f5610a;
    public C0872b f5611b;
    public int f5612c;

    public C0881k() {
        this.f5610a = null;
        this.f5611b = null;
        this.f5612c = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5610a != null) {
            codedOutputByteBufferNano.b(1, this.f5610a);
        }
        if (this.f5611b != null) {
            codedOutputByteBufferNano.b(2, this.f5611b);
        }
        if (this.f5612c != 0) {
            codedOutputByteBufferNano.a(3, this.f5612c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5610a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5610a);
        }
        if (this.f5611b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5611b);
        }
        if (this.f5612c != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f5612c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a.C0881k m5505b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001f;
            case 24: goto L_0x0030;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f5610a;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.a.a.a.a.b.b.a.c;
        r0.<init>();
        r6.f5610a = r0;
    L_0x0019:
        r0 = r6.f5610a;
        r7.a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r6.f5611b;
        if (r0 != 0) goto L_0x002a;
    L_0x0023:
        r0 = new com.google.a.a.a.a.b.b.a.b;
        r0.<init>();
        r6.f5611b = r0;
    L_0x002a:
        r0 = r6.f5611b;
        r7.a(r0);
        goto L_0x0000;
    L_0x0030:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0056 }
        switch(r2) {
            case 0: goto L_0x005e;
            case 1: goto L_0x005e;
            case 2: goto L_0x005e;
            case 3: goto L_0x005e;
            default: goto L_0x003b;
        };	 Catch:{ IllegalArgumentException -> 0x0056 }
    L_0x003b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r4 = " is not a valid enum FlowType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0056 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0056 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0056 }
    L_0x0056:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x005e:
        r6.f5612c = r2;	 Catch:{ IllegalArgumentException -> 0x0056 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.b.a.k.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.b.a.k");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5505b(aVar);
    }
}
