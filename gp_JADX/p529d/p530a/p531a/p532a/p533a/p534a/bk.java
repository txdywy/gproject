package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bk extends b {
    public static volatile bk[] f39982a;
    public String f39983b;
    public Long f39984c;
    public Long f39985d;
    public Long f39986e;
    public Long f39987f;
    public Long f39988g;
    public int f39989h;

    public static bk[] m37187d() {
        if (f39982a == null) {
            synchronized (C7219h.f35465b) {
                if (f39982a == null) {
                    f39982a = new bk[0];
                }
            }
        }
        return f39982a;
    }

    public bk() {
        this.f39983b = null;
        this.f39984c = null;
        this.f39985d = null;
        this.f39986e = null;
        this.f39987f = null;
        this.f39988g = null;
        this.f39989h = Integer.MIN_VALUE;
        this.aP = -1;
    }

    public final void m37189a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39983b != null) {
            codedOutputByteBufferNano.m33521a(1, this.f39983b);
        }
        if (this.f39984c != null) {
            codedOutputByteBufferNano.m33535c(2, this.f39984c.longValue());
        }
        if (this.f39985d != null) {
            codedOutputByteBufferNano.m33535c(3, this.f39985d.longValue());
        }
        if (this.f39986e != null) {
            codedOutputByteBufferNano.m33531b(4, this.f39986e.longValue());
        }
        if (this.f39987f != null) {
            codedOutputByteBufferNano.m33531b(5, this.f39987f.longValue());
        }
        if (this.f39988g != null) {
            codedOutputByteBufferNano.m33531b(6, this.f39988g.longValue());
        }
        if (this.f39989h != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(7, this.f39989h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37190b() {
        int b = super.b();
        if (this.f39983b != null) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39983b);
        }
        if (this.f39984c != null) {
            this.f39984c.longValue();
            b += CodedOutputByteBufferNano.m33501d(2) + 8;
        }
        if (this.f39985d != null) {
            this.f39985d.longValue();
            b += CodedOutputByteBufferNano.m33501d(3) + 8;
        }
        if (this.f39986e != null) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f39986e.longValue());
        }
        if (this.f39987f != null) {
            b += CodedOutputByteBufferNano.m33508f(5, this.f39987f.longValue());
        }
        if (this.f39988g != null) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f39988g.longValue());
        }
        if (this.f39989h != Integer.MIN_VALUE) {
            return b + CodedOutputByteBufferNano.m33502d(7, this.f39989h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.bk m37186b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 17: goto L_0x0015;
            case 25: goto L_0x0020;
            case 32: goto L_0x002b;
            case 40: goto L_0x0036;
            case 48: goto L_0x0041;
            case 56: goto L_0x004c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f39983b = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.m33570l();
        r0 = java.lang.Long.valueOf(r0);
        r6.f39984c = r0;
        goto L_0x0000;
    L_0x0020:
        r0 = r7.m33570l();
        r0 = java.lang.Long.valueOf(r0);
        r6.f39985d = r0;
        goto L_0x0000;
    L_0x002b:
        r0 = r7.m33568j();
        r0 = java.lang.Long.valueOf(r0);
        r6.f39986e = r0;
        goto L_0x0000;
    L_0x0036:
        r0 = r7.m33568j();
        r0 = java.lang.Long.valueOf(r0);
        r6.f39987f = r0;
        goto L_0x0000;
    L_0x0041:
        r0 = r7.m33568j();
        r0 = java.lang.Long.valueOf(r0);
        r6.f39988g = r0;
        goto L_0x0000;
    L_0x004c:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0072 }
        switch(r2) {
            case 0: goto L_0x007a;
            case 1: goto L_0x007a;
            default: goto L_0x0057;
        };	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0057:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r4 = " is not a valid enum SpanType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0072 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0072:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x007a:
        r6.f39989h = r2;	 Catch:{ IllegalArgumentException -> 0x0072 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.bk.b(com.google.protobuf.nano.a):d.a.a.a.a.a.bk");
    }

    public final /* synthetic */ i m37188a(C7213a c7213a) {
        return m37186b(c7213a);
    }
}
