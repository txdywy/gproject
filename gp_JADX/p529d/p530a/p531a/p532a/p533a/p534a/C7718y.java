package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7718y extends b {
    public int f40167a;
    public int f40168b;
    public Integer f40169c;
    public aq f40170d;
    public int f40171e;
    public String f40172f;
    public C7714u f40173g;
    public int f40174h;
    public Boolean f40175i;
    public Integer f40176j;
    public Boolean f40177k;

    public C7718y() {
        this.f40167a = Integer.MIN_VALUE;
        this.f40168b = Integer.MIN_VALUE;
        this.f40169c = null;
        this.f40170d = null;
        this.f40171e = Integer.MIN_VALUE;
        this.f40172f = null;
        this.f40173g = null;
        this.f40174h = Integer.MIN_VALUE;
        this.f40175i = null;
        this.f40176j = null;
        this.f40177k = null;
        this.aP = -1;
    }

    public final void m37319a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40167a != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(1, this.f40167a);
        }
        if (this.f40168b != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(2, this.f40168b);
        }
        if (this.f40169c != null) {
            codedOutputByteBufferNano.m33518a(3, this.f40169c.intValue());
        }
        if (this.f40170d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f40170d);
        }
        if (this.f40171e != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(5, this.f40171e);
        }
        if (this.f40172f != null) {
            codedOutputByteBufferNano.m33521a(6, this.f40172f);
        }
        if (this.f40173g != null) {
            codedOutputByteBufferNano.m33532b(7, this.f40173g);
        }
        if (this.f40174h != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(8, this.f40174h);
        }
        if (this.f40175i != null) {
            codedOutputByteBufferNano.m33522a(9, this.f40175i.booleanValue());
        }
        if (this.f40176j != null) {
            codedOutputByteBufferNano.m33518a(10, this.f40176j.intValue());
        }
        if (this.f40177k != null) {
            codedOutputByteBufferNano.m33522a(11, this.f40177k.booleanValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37320b() {
        int b = super.b();
        if (this.f40167a != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40167a);
        }
        if (this.f40168b != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f40168b);
        }
        if (this.f40169c != null) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f40169c.intValue());
        }
        if (this.f40170d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f40170d);
        }
        if (this.f40171e != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f40171e);
        }
        if (this.f40172f != null) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f40172f);
        }
        if (this.f40173g != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f40173g);
        }
        if (this.f40174h != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f40174h);
        }
        if (this.f40175i != null) {
            this.f40175i.booleanValue();
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if (this.f40176j != null) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f40176j.intValue());
        }
        if (this.f40177k == null) {
            return b;
        }
        this.f40177k.booleanValue();
        return b + (CodedOutputByteBufferNano.m33501d(11) + 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.C7718y m37317b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x003f;
            case 24: goto L_0x0070;
            case 34: goto L_0x007b;
            case 40: goto L_0x008d;
            case 50: goto L_0x00c0;
            case 58: goto L_0x00c8;
            case 64: goto L_0x00da;
            case 72: goto L_0x010d;
            case 80: goto L_0x0119;
            case 88: goto L_0x0125;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum AccountType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f40167a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0065 }
        switch(r2) {
            case 0: goto L_0x006d;
            case 1: goto L_0x006d;
            case 2: goto L_0x006d;
            case 3: goto L_0x006d;
            case 4: goto L_0x006d;
            case 5: goto L_0x006d;
            case 6: goto L_0x006d;
            case 7: goto L_0x006d;
            case 8: goto L_0x006d;
            case 9: goto L_0x006d;
            case 10: goto L_0x006d;
            case 11: goto L_0x006d;
            case 12: goto L_0x006d;
            default: goto L_0x004a;
        };	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x004a:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = " is not a valid enum FolderType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x006d:
        r6.f40168b = r2;	 Catch:{ IllegalArgumentException -> 0x0065 }
        goto L_0x0000;
    L_0x0070:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f40169c = r0;
        goto L_0x0000;
    L_0x007b:
        r0 = r6.f40170d;
        if (r0 != 0) goto L_0x0086;
    L_0x007f:
        r0 = new d.a.a.a.a.a.aq;
        r0.<init>();
        r6.f40170d = r0;
    L_0x0086:
        r0 = r6.f40170d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x008d:
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x00b3 }
        switch(r2) {
            case 0: goto L_0x00bc;
            case 1: goto L_0x00bc;
            case 2: goto L_0x00bc;
            case 3: goto L_0x00bc;
            case 4: goto L_0x00bc;
            case 5: goto L_0x00bc;
            case 6: goto L_0x00bc;
            default: goto L_0x0098;
        };	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x0098:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4 = 50;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4 = " is not a valid enum CancellationReason";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x00b3:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00bc:
        r6.f40171e = r2;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        goto L_0x0000;
    L_0x00c0:
        r0 = r7.m33564f();
        r6.f40172f = r0;
        goto L_0x0000;
    L_0x00c8:
        r0 = r6.f40173g;
        if (r0 != 0) goto L_0x00d3;
    L_0x00cc:
        r0 = new d.a.a.a.a.a.u;
        r0.<init>();
        r6.f40173g = r0;
    L_0x00d3:
        r0 = r6.f40173g;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00da:
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0100 }
        switch(r2) {
            case 0: goto L_0x0109;
            case 1: goto L_0x0109;
            case 2: goto L_0x0109;
            case 3: goto L_0x0109;
            default: goto L_0x00e5;
        };	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x00e5:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0100 }
        r4 = " is not a valid enum DataLayer";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0100 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0100 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x0100:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0109:
        r6.f40174h = r2;	 Catch:{ IllegalArgumentException -> 0x0100 }
        goto L_0x0000;
    L_0x010d:
        r0 = r7.m33563e();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f40175i = r0;
        goto L_0x0000;
    L_0x0119:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f40176j = r0;
        goto L_0x0000;
    L_0x0125:
        r0 = r7.m33563e();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f40177k = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.y.b(com.google.protobuf.nano.a):d.a.a.a.a.a.y");
    }

    public final /* synthetic */ i m37318a(C7213a c7213a) {
        return m37317b(c7213a);
    }
}
