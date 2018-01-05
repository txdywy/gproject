package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7367w extends b {
    public static volatile C7367w[] f36828a;
    public int f36829b;
    public int f36830c;
    public int f36831d;
    public String f36832e;
    public byte[] f36833f;
    public C7364t[] f36834g;
    public boolean f36835h;

    public static C7367w[] m34905d() {
        if (f36828a == null) {
            synchronized (C7219h.f35465b) {
                if (f36828a == null) {
                    f36828a = new C7367w[0];
                }
            }
        }
        return f36828a;
    }

    public C7367w() {
        this.f36829b = 0;
        this.f36830c = 1;
        this.f36831d = 0;
        this.f36832e = "";
        this.f36833f = C7222l.f35479l;
        this.f36834g = C7364t.m34894d();
        this.f36835h = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34907a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36830c);
        if ((this.f36829b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36831d);
        }
        if ((this.f36829b & 4) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f36833f);
        }
        if (this.f36834g != null && this.f36834g.length > 0) {
            for (i iVar : this.f36834g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if ((this.f36829b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f36835h);
        }
        if ((this.f36829b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36832e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34908b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f36830c);
        if ((this.f36829b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36831d);
        }
        if ((this.f36829b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f36833f);
        }
        if (this.f36834g != null && this.f36834g.length > 0) {
            int i = b;
            for (i iVar : this.f36834g) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i;
        }
        if ((this.f36829b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f36829b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f36832e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p493b.C7367w m34904b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x0040;
            case 26: goto L_0x0063;
            case 34: goto L_0x0070;
            case 40: goto L_0x00b0;
            case 50: goto L_0x00be;
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
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            case 3: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 38;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum Status";
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
        r7.f36830c = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0040:
        r2 = r7.f36829b;
        r2 = r2 | 1;
        r7.f36829b = r2;
        r2 = r8.m33573o();
        r3 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = com.google.android.finsky.cv.a.aw.a(r3);	 Catch:{ IllegalArgumentException -> 0x005b }
        r7.f36831d = r3;	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = r7.f36829b;	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = r3 | 1;
        r7.f36829b = r3;	 Catch:{ IllegalArgumentException -> 0x005b }
        goto L_0x0001;
    L_0x005b:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0063:
        r0 = r8.m33565g();
        r7.f36833f = r0;
        r0 = r7.f36829b;
        r0 = r0 | 4;
        r7.f36829b = r0;
        goto L_0x0001;
    L_0x0070:
        r0 = 34;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f36834g;
        if (r0 != 0) goto L_0x009c;
    L_0x007a:
        r0 = r1;
    L_0x007b:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.p493b.C7364t[r2];
        if (r0 == 0) goto L_0x0085;
    L_0x0080:
        r3 = r7.f36834g;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0085:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00a0;
    L_0x008a:
        r3 = new com.google.wireless.android.finsky.b.t;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0085;
    L_0x009c:
        r0 = r7.f36834g;
        r0 = r0.length;
        goto L_0x007b;
    L_0x00a0:
        r3 = new com.google.wireless.android.finsky.b.t;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f36834g = r2;
        goto L_0x0001;
    L_0x00b0:
        r0 = r8.m33563e();
        r7.f36835h = r0;
        r0 = r7.f36829b;
        r0 = r0 | 8;
        r7.f36829b = r0;
        goto L_0x0001;
    L_0x00be:
        r0 = r8.m33564f();
        r7.f36832e = r0;
        r0 = r7.f36829b;
        r0 = r0 | 2;
        r7.f36829b = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.b.w.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.b.w");
    }

    public final /* synthetic */ i m34906a(C7213a c7213a) {
        return m34904b(c7213a);
    }
}
