package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ap extends C0758b {
    public aq[] f5382a;
    public String f5383b;
    public String f5384c;
    public int f5385d;

    public ap() {
        this.f5382a = aq.m5323a();
        this.f5383b = "";
        this.f5384c = "";
        this.f5385d = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5382a != null && this.f5382a.length > 0) {
            for (C0757i c0757i : this.f5382a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (!(this.f5383b == null || this.f5383b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5383b);
        }
        if (!(this.f5384c == null || this.f5384c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5384c);
        }
        if (this.f5385d != 0) {
            codedOutputByteBufferNano.a(4, this.f5385d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5382a != null && this.f5382a.length > 0) {
            for (C0757i c0757i : this.f5382a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if (!(this.f5383b == null || this.f5383b.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5383b);
        }
        if (!(this.f5384c == null || this.f5384c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5384c);
        }
        if (this.f5385d != 0) {
            return b + CodedOutputByteBufferNano.d(4, this.f5385d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ap m5319b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x004e;
            case 26: goto L_0x0055;
            case 32: goto L_0x005c;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = 10;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5382a;
        if (r0 != 0) goto L_0x003b;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.aq[r2];
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r7.f5382a;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0024:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x003f;
    L_0x0029:
        r3 = new com.google.a.a.a.a.b.a.b.a.aq;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x003b:
        r0 = r7.f5382a;
        r0 = r0.length;
        goto L_0x001a;
    L_0x003f:
        r3 = new com.google.a.a.a.a.b.a.b.a.aq;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5382a = r2;
        goto L_0x0001;
    L_0x004e:
        r0 = r8.f();
        r7.f5383b = r0;
        goto L_0x0001;
    L_0x0055:
        r0 = r8.f();
        r7.f5384c = r0;
        goto L_0x0001;
    L_0x005c:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0082 }
        switch(r3) {
            case 0: goto L_0x008b;
            case 1: goto L_0x008b;
            case 2: goto L_0x008b;
            case 3: goto L_0x008b;
            default: goto L_0x0067;
        };	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0067:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r5 = 43;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r5 = " is not a valid enum DisplayType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0082 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0082 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0082:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x008b:
        r7.f5385d = r3;	 Catch:{ IllegalArgumentException -> 0x0082 }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.ap.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.ap");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5319b(aVar);
    }
}
