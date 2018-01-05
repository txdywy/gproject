package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7708o extends b {
    public int[] f40134a;
    public C7697d f40135b;
    public int f40136c;
    public String f40137d;
    public int f40138e;
    public int f40139f;
    public String f40140g;
    public bq f40141h;

    public C7708o() {
        this.f40134a = C7222l.f35472e;
        this.f40135b = null;
        this.f40136c = Integer.MIN_VALUE;
        this.f40137d = null;
        this.f40138e = Integer.MIN_VALUE;
        this.f40139f = Integer.MIN_VALUE;
        this.f40140g = null;
        this.f40141h = null;
        this.aP = -1;
    }

    public final void m37283a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40134a != null && this.f40134a.length > 0) {
            for (int a : this.f40134a) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        if (this.f40135b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f40135b);
        }
        if (this.f40136c != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(3, this.f40136c);
        }
        if (this.f40137d != null) {
            codedOutputByteBufferNano.m33521a(4, this.f40137d);
        }
        if (this.f40138e != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(5, this.f40138e);
        }
        if (this.f40139f != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(6, this.f40139f);
        }
        if (this.f40140g != null) {
            codedOutputByteBufferNano.m33521a(7, this.f40140g);
        }
        if (this.f40141h != null) {
            codedOutputByteBufferNano.m33532b(8, this.f40141h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37284b() {
        int i = 0;
        int b = super.b();
        if (this.f40134a == null || this.f40134a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f40134a.length) {
                i2 += CodedOutputByteBufferNano.m33498c(this.f40134a[i]);
                i++;
            }
            i = (b + i2) + (this.f40134a.length * 1);
        }
        if (this.f40135b != null) {
            i += CodedOutputByteBufferNano.m33503d(2, this.f40135b);
        }
        if (this.f40136c != Integer.MIN_VALUE) {
            i += CodedOutputByteBufferNano.m33502d(3, this.f40136c);
        }
        if (this.f40137d != null) {
            i += CodedOutputByteBufferNano.m33493b(4, this.f40137d);
        }
        if (this.f40138e != Integer.MIN_VALUE) {
            i += CodedOutputByteBufferNano.m33502d(5, this.f40138e);
        }
        if (this.f40139f != Integer.MIN_VALUE) {
            i += CodedOutputByteBufferNano.m33502d(6, this.f40139f);
        }
        if (this.f40140g != null) {
            i += CodedOutputByteBufferNano.m33493b(7, this.f40140g);
        }
        if (this.f40141h != null) {
            return i + CodedOutputByteBufferNano.m33503d(8, this.f40141h);
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.C7708o m37281b(com.google.protobuf.nano.C7213a r10) {
        /*
        r9 = this;
        r8 = 8;
        r1 = 0;
    L_0x0003:
        r3 = r10.m33550a();
        switch(r3) {
            case 0: goto L_0x0010;
            case 8: goto L_0x0011;
            case 10: goto L_0x005f;
            case 18: goto L_0x00ba;
            case 24: goto L_0x00cc;
            case 34: goto L_0x00ff;
            case 40: goto L_0x0107;
            case 48: goto L_0x013a;
            case 58: goto L_0x016d;
            case 66: goto L_0x0175;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.a(r10, r3);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r9;
    L_0x0011:
        r4 = com.google.protobuf.nano.C7222l.m33624a(r10, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x0019:
        if (r2 >= r4) goto L_0x003b;
    L_0x001b:
        if (r2 == 0) goto L_0x0020;
    L_0x001d:
        r10.m33550a();
    L_0x0020:
        r6 = r10.m33573o();
        r7 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x0033 }
        r7 = p541h.p542a.p543a.p544a.p545a.p546a.p547a.C7749a.m37523a(r7);	 Catch:{ IllegalArgumentException -> 0x0033 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0033 }
        r0 = r0 + 1;
    L_0x0030:
        r2 = r2 + 1;
        goto L_0x0019;
    L_0x0033:
        r7 = move-exception;
        r10.m33562e(r6);
        r9.a(r10, r3);
        goto L_0x0030;
    L_0x003b:
        if (r0 == 0) goto L_0x0003;
    L_0x003d:
        r2 = r9.f40134a;
        if (r2 != 0) goto L_0x004a;
    L_0x0041:
        r2 = r1;
    L_0x0042:
        if (r2 != 0) goto L_0x004e;
    L_0x0044:
        r3 = r5.length;
        if (r0 != r3) goto L_0x004e;
    L_0x0047:
        r9.f40134a = r5;
        goto L_0x0003;
    L_0x004a:
        r2 = r9.f40134a;
        r2 = r2.length;
        goto L_0x0042;
    L_0x004e:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0059;
    L_0x0054:
        r4 = r9.f40134a;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0059:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r9.f40134a = r3;
        goto L_0x0003;
    L_0x005f:
        r0 = r10.m33567i();
        r3 = r10.m33558c(r0);
        r2 = r10.m33573o();
        r0 = r1;
    L_0x006c:
        r4 = r10.m33571m();
        if (r4 <= 0) goto L_0x007c;
    L_0x0072:
        r4 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x0187 }
        p541h.p542a.p543a.p544a.p545a.p546a.p547a.C7749a.m37523a(r4);	 Catch:{ IllegalArgumentException -> 0x0187 }
        r0 = r0 + 1;
        goto L_0x006c;
    L_0x007c:
        if (r0 == 0) goto L_0x00b5;
    L_0x007e:
        r10.m33562e(r2);
        r2 = r9.f40134a;
        if (r2 != 0) goto L_0x00a7;
    L_0x0085:
        r2 = r1;
    L_0x0086:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0090;
    L_0x008b:
        r4 = r9.f40134a;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0090:
        r4 = r10.m33571m();
        if (r4 <= 0) goto L_0x00b3;
    L_0x0096:
        r4 = r10.m33573o();
        r5 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x00ab }
        r5 = p541h.p542a.p543a.p544a.p545a.p546a.p547a.C7749a.m37523a(r5);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r2 + 1;
        goto L_0x0090;
    L_0x00a7:
        r2 = r9.f40134a;
        r2 = r2.length;
        goto L_0x0086;
    L_0x00ab:
        r5 = move-exception;
        r10.m33562e(r4);
        r9.a(r10, r8);
        goto L_0x0090;
    L_0x00b3:
        r9.f40134a = r0;
    L_0x00b5:
        r10.m33561d(r3);
        goto L_0x0003;
    L_0x00ba:
        r0 = r9.f40135b;
        if (r0 != 0) goto L_0x00c5;
    L_0x00be:
        r0 = new d.a.a.a.a.a.d;
        r0.<init>();
        r9.f40135b = r0;
    L_0x00c5:
        r0 = r9.f40135b;
        r10.m33552a(r0);
        goto L_0x0003;
    L_0x00cc:
        r0 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x00f2 }
        switch(r2) {
            case 0: goto L_0x00fb;
            case 1: goto L_0x00fb;
            case 2: goto L_0x00fb;
            case 3: goto L_0x00fb;
            case 4: goto L_0x00fb;
            case 5: goto L_0x00fb;
            case 6: goto L_0x00fb;
            case 7: goto L_0x00fb;
            case 8: goto L_0x00fb;
            case 9: goto L_0x00fb;
            default: goto L_0x00d7;
        };	 Catch:{ IllegalArgumentException -> 0x00f2 }
    L_0x00d7:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r5 = " is not a valid enum ProvisionMode";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00f2 }
    L_0x00f2:
        r2 = move-exception;
        r10.m33562e(r0);
        r9.a(r10, r3);
        goto L_0x0003;
    L_0x00fb:
        r9.f40136c = r2;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        goto L_0x0003;
    L_0x00ff:
        r0 = r10.m33564f();
        r9.f40137d = r0;
        goto L_0x0003;
    L_0x0107:
        r0 = r10.m33573o();
        r2 = r10.m33560d();	 Catch:{ IllegalArgumentException -> 0x012d }
        switch(r2) {
            case 0: goto L_0x0136;
            case 1: goto L_0x0136;
            case 2: goto L_0x0136;
            case 3: goto L_0x0136;
            default: goto L_0x0112;
        };	 Catch:{ IllegalArgumentException -> 0x012d }
    L_0x0112:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x012d }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012d }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x012d }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x012d }
        r5 = " is not a valid enum EventState";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x012d }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x012d }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x012d }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x012d }
    L_0x012d:
        r2 = move-exception;
        r10.m33562e(r0);
        r9.a(r10, r3);
        goto L_0x0003;
    L_0x0136:
        r9.f40138e = r2;	 Catch:{ IllegalArgumentException -> 0x012d }
        goto L_0x0003;
    L_0x013a:
        r0 = r10.m33573o();
        r2 = r10.m33560d();	 Catch:{ IllegalArgumentException -> 0x0160 }
        switch(r2) {
            case 0: goto L_0x0169;
            case 1: goto L_0x0169;
            case 2: goto L_0x0169;
            default: goto L_0x0145;
        };	 Catch:{ IllegalArgumentException -> 0x0160 }
    L_0x0145:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x0160 }
        r5 = " is not a valid enum Mitigation";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0160 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0160 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0160 }
    L_0x0160:
        r2 = move-exception;
        r10.m33562e(r0);
        r9.a(r10, r3);
        goto L_0x0003;
    L_0x0169:
        r9.f40139f = r2;	 Catch:{ IllegalArgumentException -> 0x0160 }
        goto L_0x0003;
    L_0x016d:
        r0 = r10.m33564f();
        r9.f40140g = r0;
        goto L_0x0003;
    L_0x0175:
        r0 = r9.f40141h;
        if (r0 != 0) goto L_0x0180;
    L_0x0179:
        r0 = new d.a.a.a.a.a.bq;
        r0.<init>();
        r9.f40141h = r0;
    L_0x0180:
        r0 = r9.f40141h;
        r10.m33552a(r0);
        goto L_0x0003;
    L_0x0187:
        r4 = move-exception;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.o.b(com.google.protobuf.nano.a):d.a.a.a.a.a.o");
    }

    public final /* synthetic */ i m37282a(C7213a c7213a) {
        return m37281b(c7213a);
    }
}
