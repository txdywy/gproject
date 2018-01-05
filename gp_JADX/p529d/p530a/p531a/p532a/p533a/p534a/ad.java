package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public static volatile ad[] f39828a;
    public int f39829b;
    public Float f39830c;
    public Integer f39831d;

    public static ad[] m37068d() {
        if (f39828a == null) {
            synchronized (C7219h.f35465b) {
                if (f39828a == null) {
                    f39828a = new ad[0];
                }
            }
        }
        return f39828a;
    }

    public ad() {
        this.f39829b = Integer.MIN_VALUE;
        this.f39830c = null;
        this.f39831d = null;
        this.aP = -1;
    }

    public final void m37070a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39829b != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(1, this.f39829b);
        }
        if (this.f39830c != null) {
            codedOutputByteBufferNano.m33517a(2, this.f39830c.floatValue());
        }
        if (this.f39831d != null) {
            codedOutputByteBufferNano.m33518a(3, this.f39831d.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37071b() {
        int b = super.b();
        if (this.f39829b != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39829b);
        }
        if (this.f39830c != null) {
            this.f39830c.floatValue();
            b += CodedOutputByteBufferNano.m33501d(2) + 4;
        }
        if (this.f39831d != null) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f39831d.intValue());
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.ad m37067b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 21: goto L_0x003f;
            case 24: goto L_0x004e;
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
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 50;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum InstallErrorReason";
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
        r6.f39829b = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33569k();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r0 = java.lang.Float.valueOf(r0);
        r6.f39830c = r0;
        goto L_0x0000;
    L_0x004e:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f39831d = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.ad.b(com.google.protobuf.nano.a):d.a.a.a.a.a.ad");
    }

    public final /* synthetic */ i m37069a(C7213a c7213a) {
        return m37067b(c7213a);
    }
}
