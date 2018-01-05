package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bq extends b {
    public int f40023a;
    public Integer f40024b;

    public bq() {
        this.f40023a = Integer.MIN_VALUE;
        this.f40024b = null;
        this.aP = -1;
    }

    public final void m37212a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40023a != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(1, this.f40023a);
        }
        if (this.f40024b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f40024b.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37213b() {
        int b = super.b();
        if (this.f40023a != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40023a);
        }
        if (this.f40024b != null) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f40024b.intValue());
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.bq m37210b(com.google.protobuf.nano.C7213a r7) {
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
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 49;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum TaskFailureReason";
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
        r6.f40023a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f40024b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.bq.b(com.google.protobuf.nano.a):d.a.a.a.a.a.bq");
    }

    public final /* synthetic */ i m37211a(C7213a c7213a) {
        return m37210b(c7213a);
    }
}
