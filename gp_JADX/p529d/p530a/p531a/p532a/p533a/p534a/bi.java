package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bi extends b {
    public static volatile bi[] f39975a;
    public bh[] f39976b;
    public int f39977c;

    public static bi[] m37179d() {
        if (f39975a == null) {
            synchronized (C7219h.f35465b) {
                if (f39975a == null) {
                    f39975a = new bi[0];
                }
            }
        }
        return f39975a;
    }

    public bi() {
        this.f39976b = bh.m37174d();
        this.f39977c = Integer.MIN_VALUE;
        this.aP = -1;
    }

    public final void m37181a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39976b != null && this.f39976b.length > 0) {
            for (i iVar : this.f39976b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f39977c != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(2, this.f39977c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37182b() {
        int b = super.b();
        if (this.f39976b != null && this.f39976b.length > 0) {
            for (i iVar : this.f39976b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if (this.f39977c != Integer.MIN_VALUE) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f39977c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.bi m37178b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 16: goto L_0x004e;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = 10;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39976b;
        if (r0 != 0) goto L_0x003b;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        r2 = r2 + r0;
        r2 = new p529d.p530a.p531a.p532a.p533a.p534a.bh[r2];
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r7.f39976b;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0024:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x003f;
    L_0x0029:
        r3 = new d.a.a.a.a.a.bh;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x003b:
        r0 = r7.f39976b;
        r0 = r0.length;
        goto L_0x001a;
    L_0x003f:
        r3 = new d.a.a.a.a.a.bh;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f39976b = r2;
        goto L_0x0001;
    L_0x004e:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0074 }
        switch(r3) {
            case 0: goto L_0x007c;
            case 1: goto L_0x007c;
            default: goto L_0x0059;
        };	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0059:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0074 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0074 }
        r5 = " is not a valid enum ResizedByType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0074 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0074 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0074 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x007c:
        r7.f39977c = r3;	 Catch:{ IllegalArgumentException -> 0x0074 }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.bi.b(com.google.protobuf.nano.a):d.a.a.a.a.a.bi");
    }

    public final /* synthetic */ i m37180a(C7213a c7213a) {
        return m37178b(c7213a);
    }
}
