package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class br extends b {
    public String f40025a;
    public int f40026b;

    public br() {
        this.f40025a = null;
        this.f40026b = Integer.MIN_VALUE;
        this.aP = -1;
    }

    public final void m37216a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40025a != null) {
            codedOutputByteBufferNano.m33521a(1, this.f40025a);
        }
        if (this.f40026b != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(2, this.f40026b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37217b() {
        int b = super.b();
        if (this.f40025a != null) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f40025a);
        }
        if (this.f40026b != Integer.MIN_VALUE) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f40026b);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.br m37214b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f40025a = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r2) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            case 2: goto L_0x0043;
            case 3: goto L_0x0043;
            case 4: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = " is not a valid enum Metric";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0043:
        r6.f40026b = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.br.b(com.google.protobuf.nano.a):d.a.a.a.a.a.br");
    }

    public final /* synthetic */ i m37215a(C7213a c7213a) {
        return m37214b(c7213a);
    }
}
