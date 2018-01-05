package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ay extends b {
    public int f39925a;
    public Integer f39926b;
    public int[] f39927c;

    public ay() {
        this.f39925a = Integer.MIN_VALUE;
        this.f39926b = null;
        this.f39927c = C7222l.f35472e;
        this.aP = -1;
    }

    public final void m37140a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39925a != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(1, this.f39925a);
        }
        if (this.f39926b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39926b.intValue());
        }
        if (this.f39927c != null && this.f39927c.length > 0) {
            for (int a : this.f39927c) {
                codedOutputByteBufferNano.m33518a(3, a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37141b() {
        int i = 0;
        int b = super.b();
        if (this.f39925a != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39925a);
        }
        if (this.f39926b != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39926b.intValue());
        }
        if (this.f39927c == null || this.f39927c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f39927c.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f39927c[i]);
            i++;
        }
        return (b + i2) + (this.f39927c.length * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.ay m37138b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x0040;
            case 24: goto L_0x004b;
            case 26: goto L_0x007e;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r3) {
            case 0: goto L_0x003d;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 51;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum PrimesHeapDumpError";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x003d:
        r7.f39925a = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0040:
        r0 = r8.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39926b = r0;
        goto L_0x0001;
    L_0x004b:
        r0 = 24;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39927c;
        if (r0 != 0) goto L_0x0071;
    L_0x0055:
        r0 = r1;
    L_0x0056:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x0060;
    L_0x005b:
        r3 = r7.f39927c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0060:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0075;
    L_0x0065:
        r3 = r8.m33560d();
        r2[r0] = r3;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0060;
    L_0x0071:
        r0 = r7.f39927c;
        r0 = r0.length;
        goto L_0x0056;
    L_0x0075:
        r3 = r8.m33560d();
        r2[r0] = r3;
        r7.f39927c = r2;
        goto L_0x0001;
    L_0x007e:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x008b:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x0097;
    L_0x0091:
        r8.m33560d();
        r0 = r0 + 1;
        goto L_0x008b;
    L_0x0097:
        r8.m33562e(r2);
        r2 = r7.f39927c;
        if (r2 != 0) goto L_0x00b5;
    L_0x009e:
        r2 = r1;
    L_0x009f:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00a9;
    L_0x00a4:
        r4 = r7.f39927c;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00a9:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00b9;
    L_0x00ac:
        r4 = r8.m33560d();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00a9;
    L_0x00b5:
        r2 = r7.f39927c;
        r2 = r2.length;
        goto L_0x009f;
    L_0x00b9:
        r7.f39927c = r0;
        r8.m33561d(r3);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.ay.b(com.google.protobuf.nano.a):d.a.a.a.a.a.ay");
    }

    public final /* synthetic */ i m37139a(C7213a c7213a) {
        return m37138b(c7213a);
    }
}
