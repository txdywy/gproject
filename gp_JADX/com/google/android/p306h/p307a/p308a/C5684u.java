package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5684u extends C0758b {
    public String f28821a;
    public Integer f28822b;
    public String f28823c;
    public String f28824d;
    public Integer f28825e;
    public Integer f28826f;
    public Integer f28827g;
    public Integer f28828h;
    public Boolean f28829i;
    public String f28830j;
    public String f28831k;
    public String f28832l;
    public String f28833m;
    public Integer f28834n;
    public Integer f28835o;
    public C5682s f28836p;

    public C5684u() {
        this.f28821a = null;
        this.f28822b = null;
        this.f28823c = null;
        this.f28824d = null;
        this.f28825e = null;
        this.f28826f = null;
        this.f28829i = null;
        this.f28830j = null;
        this.f28831k = null;
        this.f28832l = null;
        this.f28833m = null;
        this.f28834n = null;
        this.f28835o = null;
        this.f28836p = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28821a != null) {
            codedOutputByteBufferNano.a(1, this.f28821a);
        }
        if (this.f28822b != null) {
            codedOutputByteBufferNano.a(2, this.f28822b.intValue());
        }
        if (this.f28823c != null) {
            codedOutputByteBufferNano.a(3, this.f28823c);
        }
        if (this.f28824d != null) {
            codedOutputByteBufferNano.a(4, this.f28824d);
        }
        if (this.f28825e != null) {
            codedOutputByteBufferNano.a(5, this.f28825e.intValue());
        }
        if (this.f28826f != null) {
            codedOutputByteBufferNano.a(6, this.f28826f.intValue());
        }
        if (this.f28827g != null) {
            codedOutputByteBufferNano.a(7, this.f28827g.intValue());
        }
        if (this.f28828h != null) {
            codedOutputByteBufferNano.a(8, this.f28828h.intValue());
        }
        if (this.f28829i != null) {
            codedOutputByteBufferNano.a(9, this.f28829i.booleanValue());
        }
        if (this.f28830j != null) {
            codedOutputByteBufferNano.a(10, this.f28830j);
        }
        if (this.f28831k != null) {
            codedOutputByteBufferNano.a(11, this.f28831k);
        }
        if (this.f28832l != null) {
            codedOutputByteBufferNano.a(12, this.f28832l);
        }
        if (this.f28833m != null) {
            codedOutputByteBufferNano.a(13, this.f28833m);
        }
        if (this.f28834n != null) {
            codedOutputByteBufferNano.a(14, this.f28834n.intValue());
        }
        if (this.f28835o != null) {
            codedOutputByteBufferNano.a(15, this.f28835o.intValue());
        }
        if (this.f28836p != null) {
            codedOutputByteBufferNano.b(16, this.f28836p);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28821a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28821a);
        }
        if (this.f28822b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f28822b.intValue());
        }
        if (this.f28823c != null) {
            b += CodedOutputByteBufferNano.b(3, this.f28823c);
        }
        if (this.f28824d != null) {
            b += CodedOutputByteBufferNano.b(4, this.f28824d);
        }
        if (this.f28825e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f28825e.intValue());
        }
        if (this.f28826f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f28826f.intValue());
        }
        if (this.f28827g != null) {
            b += CodedOutputByteBufferNano.d(7, this.f28827g.intValue());
        }
        if (this.f28828h != null) {
            b += CodedOutputByteBufferNano.d(8, this.f28828h.intValue());
        }
        if (this.f28829i != null) {
            this.f28829i.booleanValue();
            b += CodedOutputByteBufferNano.d(9) + 1;
        }
        if (this.f28830j != null) {
            b += CodedOutputByteBufferNano.b(10, this.f28830j);
        }
        if (this.f28831k != null) {
            b += CodedOutputByteBufferNano.b(11, this.f28831k);
        }
        if (this.f28832l != null) {
            b += CodedOutputByteBufferNano.b(12, this.f28832l);
        }
        if (this.f28833m != null) {
            b += CodedOutputByteBufferNano.b(13, this.f28833m);
        }
        if (this.f28834n != null) {
            b += CodedOutputByteBufferNano.d(14, this.f28834n.intValue());
        }
        if (this.f28835o != null) {
            b += CodedOutputByteBufferNano.d(15, this.f28835o.intValue());
        }
        if (this.f28836p != null) {
            return b + CodedOutputByteBufferNano.d(16, this.f28836p);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.p306h.p307a.p308a.C5684u m26923b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            case 26: goto L_0x0020;
            case 34: goto L_0x0027;
            case 40: goto L_0x002e;
            case 48: goto L_0x0039;
            case 56: goto L_0x0044;
            case 64: goto L_0x0079;
            case 72: goto L_0x00b0;
            case 82: goto L_0x00bc;
            case 90: goto L_0x00c4;
            case 98: goto L_0x00cc;
            case 106: goto L_0x00d4;
            case 112: goto L_0x00dc;
            case 120: goto L_0x00e8;
            case 130: goto L_0x00f4;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f28821a = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.i();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f28822b = r0;
        goto L_0x0000;
    L_0x0020:
        r0 = r7.f();
        r6.f28823c = r0;
        goto L_0x0000;
    L_0x0027:
        r0 = r7.f();
        r6.f28824d = r0;
        goto L_0x0000;
    L_0x002e:
        r0 = r7.i();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f28825e = r0;
        goto L_0x0000;
    L_0x0039:
        r0 = r7.i();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f28826f = r0;
        goto L_0x0000;
    L_0x0044:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x006a }
        switch(r2) {
            case 0: goto L_0x0072;
            case 1: goto L_0x0072;
            case 2: goto L_0x0072;
            case 3: goto L_0x0072;
            case 4: goto L_0x0072;
            case 5: goto L_0x0072;
            case 6: goto L_0x0072;
            case 7: goto L_0x0072;
            case 8: goto L_0x0072;
            default: goto L_0x004f;
        };	 Catch:{ IllegalArgumentException -> 0x006a }
    L_0x004f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006a }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x006a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006a }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x006a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x006a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x006a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x006a }
    L_0x006a:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0072:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x006a }
        r6.f28827g = r2;	 Catch:{ IllegalArgumentException -> 0x006a }
        goto L_0x0000;
    L_0x0079:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x009f }
        switch(r2) {
            case 0: goto L_0x00a8;
            case 1: goto L_0x00a8;
            case 2: goto L_0x00a8;
            case 3: goto L_0x00a8;
            case 4: goto L_0x00a8;
            case 5: goto L_0x00a8;
            case 6: goto L_0x00a8;
            default: goto L_0x0084;
        };	 Catch:{ IllegalArgumentException -> 0x009f }
    L_0x0084:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009f }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x009f }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x009f }
        r4 = " is not a valid enum UserType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x009f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x009f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x009f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x009f }
    L_0x009f:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00a8:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x009f }
        r6.f28828h = r2;	 Catch:{ IllegalArgumentException -> 0x009f }
        goto L_0x0000;
    L_0x00b0:
        r0 = r7.e();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f28829i = r0;
        goto L_0x0000;
    L_0x00bc:
        r0 = r7.f();
        r6.f28830j = r0;
        goto L_0x0000;
    L_0x00c4:
        r0 = r7.f();
        r6.f28831k = r0;
        goto L_0x0000;
    L_0x00cc:
        r0 = r7.f();
        r6.f28832l = r0;
        goto L_0x0000;
    L_0x00d4:
        r0 = r7.f();
        r6.f28833m = r0;
        goto L_0x0000;
    L_0x00dc:
        r0 = r7.i();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f28834n = r0;
        goto L_0x0000;
    L_0x00e8:
        r0 = r7.i();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f28835o = r0;
        goto L_0x0000;
    L_0x00f4:
        r0 = r6.f28836p;
        if (r0 != 0) goto L_0x00ff;
    L_0x00f8:
        r0 = new com.google.android.h.a.a.s;
        r0.<init>();
        r6.f28836p = r0;
    L_0x00ff:
        r0 = r6.f28836p;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.h.a.a.u.b(com.google.protobuf.nano.a):com.google.android.h.a.a.u");
    }

    public static C5684u m26922a(byte[] bArr) {
        return (C5684u) C0757i.m4905a(new C5684u(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m26923b(aVar);
    }
}
