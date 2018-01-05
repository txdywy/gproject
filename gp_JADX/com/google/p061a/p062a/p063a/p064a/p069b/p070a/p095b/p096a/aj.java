package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class aj extends C0758b {
    public ad f5337a;
    public String f5338b;
    public ae f5339c;
    public ad[] f5340d;
    public int f5341e;

    public aj() {
        this.f5337a = null;
        this.f5338b = "";
        this.f5339c = null;
        this.f5340d = ad.m5268a();
        this.f5341e = 2;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5337a != null) {
            codedOutputByteBufferNano.b(3, this.f5337a);
        }
        if (!(this.f5338b == null || this.f5338b.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5338b);
        }
        if (this.f5339c != null) {
            codedOutputByteBufferNano.b(5, this.f5339c);
        }
        if (this.f5340d != null && this.f5340d.length > 0) {
            for (C0757i c0757i : this.f5340d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(6, c0757i);
                }
            }
        }
        if (this.f5341e != 2) {
            codedOutputByteBufferNano.a(7, this.f5341e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5337a != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5337a);
        }
        if (!(this.f5338b == null || this.f5338b.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5338b);
        }
        if (this.f5339c != null) {
            b += CodedOutputByteBufferNano.d(5, this.f5339c);
        }
        if (this.f5340d != null && this.f5340d.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5340d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(6, c0757i);
                }
            }
            b = i;
        }
        if (this.f5341e != 2) {
            return b + CodedOutputByteBufferNano.d(7, this.f5341e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.aj m5289b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 26: goto L_0x000f;
            case 34: goto L_0x0020;
            case 42: goto L_0x0027;
            case 50: goto L_0x0038;
            case 56: goto L_0x0077;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r7.f5337a;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.a.a.a.a.b.a.b.a.ad;
        r0.<init>();
        r7.f5337a = r0;
    L_0x001a:
        r0 = r7.f5337a;
        r8.a(r0);
        goto L_0x0001;
    L_0x0020:
        r0 = r8.f();
        r7.f5338b = r0;
        goto L_0x0001;
    L_0x0027:
        r0 = r7.f5339c;
        if (r0 != 0) goto L_0x0032;
    L_0x002b:
        r0 = new com.google.a.a.a.a.b.a.b.a.ae;
        r0.<init>();
        r7.f5339c = r0;
    L_0x0032:
        r0 = r7.f5339c;
        r8.a(r0);
        goto L_0x0001;
    L_0x0038:
        r0 = 50;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5340d;
        if (r0 != 0) goto L_0x0064;
    L_0x0042:
        r0 = r1;
    L_0x0043:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad[r2];
        if (r0 == 0) goto L_0x004d;
    L_0x0048:
        r3 = r7.f5340d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x004d:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0068;
    L_0x0052:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x004d;
    L_0x0064:
        r0 = r7.f5340d;
        r0 = r0.length;
        goto L_0x0043;
    L_0x0068:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5340d = r2;
        goto L_0x0001;
    L_0x0077:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x009d }
        switch(r3) {
            case 0: goto L_0x00a6;
            case 1: goto L_0x00a6;
            case 2: goto L_0x00a6;
            case 3: goto L_0x00a6;
            case 4: goto L_0x00a6;
            default: goto L_0x0082;
        };	 Catch:{ IllegalArgumentException -> 0x009d }
    L_0x0082:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009d }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009d }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x009d }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x009d }
        r5 = " is not a valid enum ImagePosition";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x009d }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x009d }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x009d }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x009d }
    L_0x009d:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00a6:
        r7.f5341e = r3;	 Catch:{ IllegalArgumentException -> 0x009d }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.aj.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.aj");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5289b(aVar);
    }
}
