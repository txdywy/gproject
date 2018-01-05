package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7698e extends b {
    public String f40101a;
    public String f40102b;
    public int f40103c;
    public Long f40104d;
    public String f40105e;

    public C7698e() {
        this.f40101a = null;
        this.f40102b = null;
        this.f40103c = Integer.MIN_VALUE;
        this.f40104d = null;
        this.f40105e = null;
        this.aP = -1;
    }

    public final void m37247a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40101a != null) {
            codedOutputByteBufferNano.m33521a(1, this.f40101a);
        }
        if (this.f40102b != null) {
            codedOutputByteBufferNano.m33521a(2, this.f40102b);
        }
        if (this.f40103c != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(3, this.f40103c);
        }
        if (this.f40104d != null) {
            codedOutputByteBufferNano.m33531b(4, this.f40104d.longValue());
        }
        if (this.f40105e != null) {
            codedOutputByteBufferNano.m33521a(5, this.f40105e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37248b() {
        int b = super.b();
        if (this.f40101a != null) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f40101a);
        }
        if (this.f40102b != null) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f40102b);
        }
        if (this.f40103c != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f40103c);
        }
        if (this.f40104d != null) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f40104d.longValue());
        }
        if (this.f40105e != null) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f40105e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.C7698e m37245b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x0015;
            case 24: goto L_0x001c;
            case 32: goto L_0x004d;
            case 42: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f40101a = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.m33564f();
        r6.f40102b = r0;
        goto L_0x0000;
    L_0x001c:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0042 }
        switch(r2) {
            case 0: goto L_0x004a;
            case 1: goto L_0x004a;
            case 2: goto L_0x004a;
            default: goto L_0x0027;
        };	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0027:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = " is not a valid enum HardwareVariant";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0042 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004a:
        r6.f40103c = r2;	 Catch:{ IllegalArgumentException -> 0x0042 }
        goto L_0x0000;
    L_0x004d:
        r0 = r7.m33559c();
        r0 = java.lang.Long.valueOf(r0);
        r6.f40104d = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f40105e = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.e.b(com.google.protobuf.nano.a):d.a.a.a.a.a.e");
    }

    public final /* synthetic */ i m37246a(C7213a c7213a) {
        return m37245b(c7213a);
    }
}
