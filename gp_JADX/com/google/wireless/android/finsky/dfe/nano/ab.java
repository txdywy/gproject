package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ab extends b {
    public static volatile ab[] f38291a;
    public int f38292b;
    public String f38293c;
    public byte[] f38294d;
    public ag[] f38295e;
    public String f38296f;
    public String f38297g;
    public aa f38298h;
    public C7548x[] f38299i;
    public String f38300j;
    public String f38301k;
    public int f38302l;
    public int f38303m;
    public int f38304n;
    public int f38305o;

    public static ab[] m35966d() {
        if (f38291a == null) {
            synchronized (C7219h.f35465b) {
                if (f38291a == null) {
                    f38291a = new ab[0];
                }
            }
        }
        return f38291a;
    }

    public final boolean m35970e() {
        return (this.f38292b & 128) != 0;
    }

    public final boolean m35971f() {
        return (this.f38292b & 256) != 0;
    }

    public ab() {
        this.f38292b = 0;
        this.f38293c = "";
        this.f38294d = C7222l.f35479l;
        this.f38295e = ag.m35988d();
        this.f38296f = "";
        this.f38297g = "";
        this.f38298h = null;
        this.f38299i = C7548x.m36594d();
        this.f38300j = "";
        this.f38301k = "";
        this.f38302l = 0;
        this.f38303m = 0;
        this.f38304n = 0;
        this.f38305o = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35968a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f38292b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38293c);
        }
        if ((this.f38292b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f38294d);
        }
        if ((this.f38292b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38296f);
        }
        if (this.f38299i != null && this.f38299i.length > 0) {
            for (i iVar : this.f38299i) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if (this.f38295e != null && this.f38295e.length > 0) {
            while (i < this.f38295e.length) {
                i iVar2 = this.f38295e[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar2);
                }
                i++;
            }
        }
        if ((this.f38292b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38300j);
        }
        if ((this.f38292b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38301k);
        }
        if ((this.f38292b & 64) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f38302l);
        }
        if ((this.f38292b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38297g);
        }
        if ((this.f38292b & 128) != 0) {
            codedOutputByteBufferNano.m33518a(11, this.f38303m);
        }
        if (this.f38298h != null) {
            codedOutputByteBufferNano.m33532b(12, this.f38298h);
        }
        if ((this.f38292b & 256) != 0) {
            codedOutputByteBufferNano.m33518a(13, this.f38304n);
        }
        if ((this.f38292b & 512) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f38305o);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35969b() {
        int i = 0;
        int b = super.b();
        if ((this.f38292b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38293c);
        }
        if ((this.f38292b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f38294d);
        }
        if ((this.f38292b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38296f);
        }
        if (this.f38299i != null && this.f38299i.length > 0) {
            int i2 = b;
            for (i iVar : this.f38299i) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i2;
        }
        if (this.f38295e != null && this.f38295e.length > 0) {
            while (i < this.f38295e.length) {
                i iVar2 = this.f38295e[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(5, iVar2);
                }
                i++;
            }
        }
        if ((this.f38292b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38300j);
        }
        if ((this.f38292b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f38301k);
        }
        if ((this.f38292b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f38302l);
        }
        if ((this.f38292b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38297g);
        }
        if ((this.f38292b & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(11, this.f38303m);
        }
        if (this.f38298h != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f38298h);
        }
        if ((this.f38292b & 256) != 0) {
            b += CodedOutputByteBufferNano.m33502d(13, this.f38304n);
        }
        if ((this.f38292b & 512) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(14, this.f38305o);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.ab m35965b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x001c;
            case 26: goto L_0x0029;
            case 34: goto L_0x0036;
            case 42: goto L_0x0075;
            case 50: goto L_0x00b5;
            case 58: goto L_0x00c3;
            case 64: goto L_0x00d1;
            case 74: goto L_0x00f6;
            case 88: goto L_0x0104;
            case 98: goto L_0x0143;
            case 104: goto L_0x0155;
            case 112: goto L_0x017a;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.m33564f();
        r7.f38293c = r0;
        r0 = r7.f38292b;
        r0 = r0 | 1;
        r7.f38292b = r0;
        goto L_0x0001;
    L_0x001c:
        r0 = r8.m33565g();
        r7.f38294d = r0;
        r0 = r7.f38292b;
        r0 = r0 | 2;
        r7.f38292b = r0;
        goto L_0x0001;
    L_0x0029:
        r0 = r8.m33564f();
        r7.f38296f = r0;
        r0 = r7.f38292b;
        r0 = r0 | 4;
        r7.f38292b = r0;
        goto L_0x0001;
    L_0x0036:
        r0 = 34;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38299i;
        if (r0 != 0) goto L_0x0062;
    L_0x0040:
        r0 = r1;
    L_0x0041:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.C7548x[r2];
        if (r0 == 0) goto L_0x004b;
    L_0x0046:
        r3 = r7.f38299i;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x004b:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0066;
    L_0x0050:
        r3 = new com.google.wireless.android.finsky.dfe.nano.x;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x004b;
    L_0x0062:
        r0 = r7.f38299i;
        r0 = r0.length;
        goto L_0x0041;
    L_0x0066:
        r3 = new com.google.wireless.android.finsky.dfe.nano.x;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f38299i = r2;
        goto L_0x0001;
    L_0x0075:
        r0 = 42;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38295e;
        if (r0 != 0) goto L_0x00a1;
    L_0x007f:
        r0 = r1;
    L_0x0080:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.ag[r2];
        if (r0 == 0) goto L_0x008a;
    L_0x0085:
        r3 = r7.f38295e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x008a:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00a5;
    L_0x008f:
        r3 = new com.google.wireless.android.finsky.dfe.nano.ag;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x008a;
    L_0x00a1:
        r0 = r7.f38295e;
        r0 = r0.length;
        goto L_0x0080;
    L_0x00a5:
        r3 = new com.google.wireless.android.finsky.dfe.nano.ag;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f38295e = r2;
        goto L_0x0001;
    L_0x00b5:
        r0 = r8.m33564f();
        r7.f38300j = r0;
        r0 = r7.f38292b;
        r0 = r0 | 16;
        r7.f38292b = r0;
        goto L_0x0001;
    L_0x00c3:
        r0 = r8.m33564f();
        r7.f38301k = r0;
        r0 = r7.f38292b;
        r0 = r0 | 32;
        r7.f38292b = r0;
        goto L_0x0001;
    L_0x00d1:
        r2 = r7.f38292b;
        r2 = r2 | 64;
        r7.f38292b = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r3 = com.google.android.finsky.cv.a.aw.a(r3);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r7.f38302l = r3;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r3 = r7.f38292b;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r3 = r3 | 64;
        r7.f38292b = r3;	 Catch:{ IllegalArgumentException -> 0x00ed }
        goto L_0x0001;
    L_0x00ed:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00f6:
        r0 = r8.m33564f();
        r7.f38297g = r0;
        r0 = r7.f38292b;
        r0 = r0 | 8;
        r7.f38292b = r0;
        goto L_0x0001;
    L_0x0104:
        r2 = r7.f38292b;
        r2 = r2 | 128;
        r7.f38292b = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0130 }
        switch(r3) {
            case 0: goto L_0x0139;
            case 1: goto L_0x0139;
            default: goto L_0x0115;
        };	 Catch:{ IllegalArgumentException -> 0x0130 }
    L_0x0115:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r5 = " is not a valid enum BrowseTabType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0130 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0130 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0130 }
    L_0x0130:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0139:
        r7.f38303m = r3;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r3 = r7.f38292b;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r3 = r3 | 128;
        r7.f38292b = r3;	 Catch:{ IllegalArgumentException -> 0x0130 }
        goto L_0x0001;
    L_0x0143:
        r0 = r7.f38298h;
        if (r0 != 0) goto L_0x014e;
    L_0x0147:
        r0 = new com.google.wireless.android.finsky.dfe.nano.aa;
        r0.<init>();
        r7.f38298h = r0;
    L_0x014e:
        r0 = r7.f38298h;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0155:
        r2 = r7.f38292b;
        r2 = r2 | 256;
        r7.f38292b = r2;
        r2 = r8.m33573o();
        r3 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x0171 }
        r3 = com.google.android.finsky.cv.a.iz.a(r3);	 Catch:{ IllegalArgumentException -> 0x0171 }
        r7.f38304n = r3;	 Catch:{ IllegalArgumentException -> 0x0171 }
        r3 = r7.f38292b;	 Catch:{ IllegalArgumentException -> 0x0171 }
        r3 = r3 | 256;
        r7.f38292b = r3;	 Catch:{ IllegalArgumentException -> 0x0171 }
        goto L_0x0001;
    L_0x0171:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x017a:
        r0 = r8.m33560d();
        r7.f38305o = r0;
        r0 = r7.f38292b;
        r0 = r0 | 512;
        r7.f38292b = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.ab.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.ab");
    }

    public final /* synthetic */ i m35967a(C7213a c7213a) {
        return m35965b(c7213a);
    }
}
