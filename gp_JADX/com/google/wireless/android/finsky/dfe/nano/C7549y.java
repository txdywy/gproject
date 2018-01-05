package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7549y extends b {
    public int f39242a;
    public String f39243b;
    public int f39244c;
    public ab[] f39245d;
    public int f39246e;
    public int f39247f;
    public int f39248g;
    public int f39249h;
    public ae f39250i;
    public String f39251j;
    public byte[] f39252k;
    public String f39253l;
    public String f39254m;
    public C7548x[] f39255n;
    public C7548x[] f39256o;
    public boolean f39257p;
    public ag[] f39258q;
    public ad f39259r;

    public C7549y() {
        this.f39242a = 0;
        this.f39243b = "";
        this.f39244c = 0;
        this.f39245d = ab.m35966d();
        this.f39246e = 0;
        this.f39247f = 0;
        this.f39248g = 0;
        this.f39249h = 0;
        this.f39250i = null;
        this.f39251j = "";
        this.f39252k = C7222l.f35479l;
        this.f39253l = "";
        this.f39254m = "";
        this.f39255n = C7548x.m36594d();
        this.f39256o = C7548x.m36594d();
        this.f39257p = false;
        this.f39258q = ag.m35988d();
        this.f39259r = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36600a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        codedOutputByteBufferNano.m33521a(1, this.f39253l);
        if ((this.f39242a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39254m);
        }
        if (this.f39255n != null && this.f39255n.length > 0) {
            for (i iVar : this.f39255n) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (this.f39256o != null && this.f39256o.length > 0) {
            for (i iVar2 : this.f39256o) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar2);
                }
            }
        }
        if (this.f39258q != null && this.f39258q.length > 0) {
            for (i iVar22 : this.f39258q) {
                if (iVar22 != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar22);
                }
            }
        }
        if ((this.f39242a & 128) != 0) {
            codedOutputByteBufferNano.m33523a(6, this.f39252k);
        }
        if ((this.f39242a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f39243b);
        }
        if ((this.f39242a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f39244c);
        }
        if (this.f39245d != null && this.f39245d.length > 0) {
            while (i < this.f39245d.length) {
                i iVar3 = this.f39245d[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(9, iVar3);
                }
                i++;
            }
        }
        if ((this.f39242a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f39246e);
        }
        if ((this.f39242a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(11, this.f39247f);
        }
        if ((this.f39242a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f39248g);
        }
        if ((this.f39242a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(14, this.f39257p);
        }
        if ((this.f39242a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(15, this.f39249h);
        }
        if (this.f39259r != null) {
            codedOutputByteBufferNano.m33532b(16, this.f39259r);
        }
        if (this.f39250i != null) {
            codedOutputByteBufferNano.m33532b(17, this.f39250i);
        }
        if ((this.f39242a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(18, this.f39251j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36601b() {
        int i;
        int i2 = 0;
        int b = super.b() + CodedOutputByteBufferNano.m33493b(1, this.f39253l);
        if ((this.f39242a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39254m);
        }
        if (this.f39255n != null && this.f39255n.length > 0) {
            i = b;
            for (i iVar : this.f39255n) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
            b = i;
        }
        if (this.f39256o != null && this.f39256o.length > 0) {
            i = b;
            for (i iVar2 : this.f39256o) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(4, iVar2);
                }
            }
            b = i;
        }
        if (this.f39258q != null && this.f39258q.length > 0) {
            i = b;
            for (i iVar22 : this.f39258q) {
                if (iVar22 != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar22);
                }
            }
            b = i;
        }
        if ((this.f39242a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33494b(6, this.f39252k);
        }
        if ((this.f39242a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f39243b);
        }
        if ((this.f39242a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f39244c);
        }
        if (this.f39245d != null && this.f39245d.length > 0) {
            while (i2 < this.f39245d.length) {
                i iVar3 = this.f39245d[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(9, iVar3);
                }
                i2++;
            }
        }
        if ((this.f39242a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f39246e);
        }
        if ((this.f39242a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(11, this.f39247f);
        }
        if ((this.f39242a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(12, this.f39248g);
        }
        if ((this.f39242a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(14) + 1;
        }
        if ((this.f39242a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(15, this.f39249h);
        }
        if (this.f39259r != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f39259r);
        }
        if (this.f39250i != null) {
            b += CodedOutputByteBufferNano.m33503d(17, this.f39250i);
        }
        if ((this.f39242a & 64) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(18, this.f39251j);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.C7549y m36598b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 26: goto L_0x0023;
            case 34: goto L_0x0062;
            case 42: goto L_0x00a2;
            case 50: goto L_0x00e2;
            case 58: goto L_0x00f0;
            case 64: goto L_0x00fe;
            case 74: goto L_0x0123;
            case 80: goto L_0x0163;
            case 88: goto L_0x0171;
            case 96: goto L_0x017f;
            case 112: goto L_0x018d;
            case 120: goto L_0x019b;
            case 130: goto L_0x01da;
            case 138: goto L_0x01ec;
            case 146: goto L_0x01fe;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.m33564f();
        r7.f39253l = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r8.m33564f();
        r7.f39254m = r0;
        r0 = r7.f39242a;
        r0 = r0 | 256;
        r7.f39242a = r0;
        goto L_0x0001;
    L_0x0023:
        r0 = 26;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39255n;
        if (r0 != 0) goto L_0x004f;
    L_0x002d:
        r0 = r1;
    L_0x002e:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.C7548x[r2];
        if (r0 == 0) goto L_0x0038;
    L_0x0033:
        r3 = r7.f39255n;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0038:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0053;
    L_0x003d:
        r3 = new com.google.wireless.android.finsky.dfe.nano.x;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0038;
    L_0x004f:
        r0 = r7.f39255n;
        r0 = r0.length;
        goto L_0x002e;
    L_0x0053:
        r3 = new com.google.wireless.android.finsky.dfe.nano.x;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f39255n = r2;
        goto L_0x0001;
    L_0x0062:
        r0 = 34;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39256o;
        if (r0 != 0) goto L_0x008e;
    L_0x006c:
        r0 = r1;
    L_0x006d:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.C7548x[r2];
        if (r0 == 0) goto L_0x0077;
    L_0x0072:
        r3 = r7.f39256o;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0077:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0092;
    L_0x007c:
        r3 = new com.google.wireless.android.finsky.dfe.nano.x;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0077;
    L_0x008e:
        r0 = r7.f39256o;
        r0 = r0.length;
        goto L_0x006d;
    L_0x0092:
        r3 = new com.google.wireless.android.finsky.dfe.nano.x;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f39256o = r2;
        goto L_0x0001;
    L_0x00a2:
        r0 = 42;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39258q;
        if (r0 != 0) goto L_0x00ce;
    L_0x00ac:
        r0 = r1;
    L_0x00ad:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.ag[r2];
        if (r0 == 0) goto L_0x00b7;
    L_0x00b2:
        r3 = r7.f39258q;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00b7:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00d2;
    L_0x00bc:
        r3 = new com.google.wireless.android.finsky.dfe.nano.ag;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x00b7;
    L_0x00ce:
        r0 = r7.f39258q;
        r0 = r0.length;
        goto L_0x00ad;
    L_0x00d2:
        r3 = new com.google.wireless.android.finsky.dfe.nano.ag;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f39258q = r2;
        goto L_0x0001;
    L_0x00e2:
        r0 = r8.m33565g();
        r7.f39252k = r0;
        r0 = r7.f39242a;
        r0 = r0 | 128;
        r7.f39242a = r0;
        goto L_0x0001;
    L_0x00f0:
        r0 = r8.m33564f();
        r7.f39243b = r0;
        r0 = r7.f39242a;
        r0 = r0 | 1;
        r7.f39242a = r0;
        goto L_0x0001;
    L_0x00fe:
        r2 = r7.f39242a;
        r2 = r2 | 2;
        r7.f39242a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x011a }
        r3 = com.google.android.finsky.cv.a.aw.a(r3);	 Catch:{ IllegalArgumentException -> 0x011a }
        r7.f39244c = r3;	 Catch:{ IllegalArgumentException -> 0x011a }
        r3 = r7.f39242a;	 Catch:{ IllegalArgumentException -> 0x011a }
        r3 = r3 | 2;
        r7.f39242a = r3;	 Catch:{ IllegalArgumentException -> 0x011a }
        goto L_0x0001;
    L_0x011a:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0123:
        r0 = 74;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39245d;
        if (r0 != 0) goto L_0x014f;
    L_0x012d:
        r0 = r1;
    L_0x012e:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.ab[r2];
        if (r0 == 0) goto L_0x0138;
    L_0x0133:
        r3 = r7.f39245d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0138:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0153;
    L_0x013d:
        r3 = new com.google.wireless.android.finsky.dfe.nano.ab;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0138;
    L_0x014f:
        r0 = r7.f39245d;
        r0 = r0.length;
        goto L_0x012e;
    L_0x0153:
        r3 = new com.google.wireless.android.finsky.dfe.nano.ab;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f39245d = r2;
        goto L_0x0001;
    L_0x0163:
        r0 = r8.m33567i();
        r7.f39246e = r0;
        r0 = r7.f39242a;
        r0 = r0 | 4;
        r7.f39242a = r0;
        goto L_0x0001;
    L_0x0171:
        r0 = r8.m33567i();
        r7.f39247f = r0;
        r0 = r7.f39242a;
        r0 = r0 | 8;
        r7.f39242a = r0;
        goto L_0x0001;
    L_0x017f:
        r0 = r8.m33567i();
        r7.f39248g = r0;
        r0 = r7.f39242a;
        r0 = r0 | 16;
        r7.f39242a = r0;
        goto L_0x0001;
    L_0x018d:
        r0 = r8.m33563e();
        r7.f39257p = r0;
        r0 = r7.f39242a;
        r0 = r0 | 512;
        r7.f39242a = r0;
        goto L_0x0001;
    L_0x019b:
        r2 = r7.f39242a;
        r2 = r2 | 32;
        r7.f39242a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x01c7 }
        switch(r3) {
            case 0: goto L_0x01d0;
            case 1: goto L_0x01d0;
            case 2: goto L_0x01d0;
            case 3: goto L_0x01d0;
            default: goto L_0x01ac;
        };	 Catch:{ IllegalArgumentException -> 0x01c7 }
    L_0x01ac:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r5 = 40;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r5 = " is not a valid enum TabStyle";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x01c7 }
    L_0x01c7:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x01d0:
        r7.f39249h = r3;	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r3 = r7.f39242a;	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r3 = r3 | 32;
        r7.f39242a = r3;	 Catch:{ IllegalArgumentException -> 0x01c7 }
        goto L_0x0001;
    L_0x01da:
        r0 = r7.f39259r;
        if (r0 != 0) goto L_0x01e5;
    L_0x01de:
        r0 = new com.google.wireless.android.finsky.dfe.nano.ad;
        r0.<init>();
        r7.f39259r = r0;
    L_0x01e5:
        r0 = r7.f39259r;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x01ec:
        r0 = r7.f39250i;
        if (r0 != 0) goto L_0x01f7;
    L_0x01f0:
        r0 = new com.google.wireless.android.finsky.dfe.nano.ae;
        r0.<init>();
        r7.f39250i = r0;
    L_0x01f7:
        r0 = r7.f39250i;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x01fe:
        r0 = r8.m33564f();
        r7.f39251j = r0;
        r0 = r7.f39242a;
        r0 = r0 | 64;
        r7.f39242a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.y.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.y");
    }

    public final /* synthetic */ i m36599a(C7213a c7213a) {
        return m36598b(c7213a);
    }
}
