package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aq extends b {
    public int f39887a;
    public Integer f39888b;
    public Boolean f39889c;
    public Boolean f39890d;
    public Integer f39891e;
    public Boolean f39892f;
    public Integer f39893g;
    public String f39894h;

    public aq() {
        this.f39887a = Integer.MIN_VALUE;
        this.f39888b = null;
        this.f39889c = null;
        this.f39890d = null;
        this.f39891e = null;
        this.f39892f = null;
        this.f39893g = null;
        this.f39894h = null;
        this.aP = -1;
    }

    public final void m37114a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39887a != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(1, this.f39887a);
        }
        if (this.f39888b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39888b.intValue());
        }
        if (this.f39889c != null) {
            codedOutputByteBufferNano.m33522a(3, this.f39889c.booleanValue());
        }
        if (this.f39890d != null) {
            codedOutputByteBufferNano.m33522a(4, this.f39890d.booleanValue());
        }
        if (this.f39891e != null) {
            codedOutputByteBufferNano.m33518a(5, this.f39891e.intValue());
        }
        if (this.f39892f != null) {
            codedOutputByteBufferNano.m33522a(6, this.f39892f.booleanValue());
        }
        if (this.f39893g != null) {
            codedOutputByteBufferNano.m33518a(7, this.f39893g.intValue());
        }
        if (this.f39894h != null) {
            codedOutputByteBufferNano.m33521a(8, this.f39894h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37115b() {
        int b = super.b();
        if (this.f39887a != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39887a);
        }
        if (this.f39888b != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39888b.intValue());
        }
        if (this.f39889c != null) {
            this.f39889c.booleanValue();
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f39890d != null) {
            this.f39890d.booleanValue();
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if (this.f39891e != null) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f39891e.intValue());
        }
        if (this.f39892f != null) {
            this.f39892f.booleanValue();
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (this.f39893g != null) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f39893g.intValue());
        }
        if (this.f39894h != null) {
            return b + CodedOutputByteBufferNano.m33493b(8, this.f39894h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.aq m37112b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x003f;
            case 24: goto L_0x004a;
            case 32: goto L_0x0055;
            case 40: goto L_0x0060;
            case 48: goto L_0x006b;
            case 56: goto L_0x0076;
            case 66: goto L_0x0081;
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
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum ContentSource";
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
        r6.f39887a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f39888b = r0;
        goto L_0x0000;
    L_0x004a:
        r0 = r7.m33563e();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f39889c = r0;
        goto L_0x0000;
    L_0x0055:
        r0 = r7.m33563e();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f39890d = r0;
        goto L_0x0000;
    L_0x0060:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f39891e = r0;
        goto L_0x0000;
    L_0x006b:
        r0 = r7.m33563e();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f39892f = r0;
        goto L_0x0000;
    L_0x0076:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f39893g = r0;
        goto L_0x0000;
    L_0x0081:
        r0 = r7.m33564f();
        r6.f39894h = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.aq.b(com.google.protobuf.nano.a):d.a.a.a.a.a.aq");
    }

    public final /* synthetic */ i m37113a(C7213a c7213a) {
        return m37112b(c7213a);
    }
}
