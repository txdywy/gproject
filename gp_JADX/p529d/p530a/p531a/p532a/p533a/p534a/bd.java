package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bd extends b {
    public static volatile bd[] f39954a;
    public int f39955b;
    public Integer f39956c;

    public static bd[] m37159d() {
        if (f39954a == null) {
            synchronized (C7219h.f35465b) {
                if (f39954a == null) {
                    f39954a = new bd[0];
                }
            }
        }
        return f39954a;
    }

    public bd() {
        this.f39955b = Integer.MIN_VALUE;
        this.f39956c = null;
        this.aP = -1;
    }

    public final void m37161a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39955b != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(1, this.f39955b);
        }
        if (this.f39956c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39956c.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37162b() {
        int b = super.b();
        if (this.f39955b != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39955b);
        }
        if (this.f39956c != null) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f39956c.intValue());
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.bd m37158b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x003f;
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
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            case 10: goto L_0x003c;
            case 11: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum PrimitiveType";
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
        r6.f39955b = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f39956c = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.bd.b(com.google.protobuf.nano.a):d.a.a.a.a.a.bd");
    }

    public final /* synthetic */ i m37160a(C7213a c7213a) {
        return m37158b(c7213a);
    }
}
