package com.google.wireless.android.finsky.dfe.p505c.p506a;

import android.support.v7.widget.eq;
import com.google.p443h.p447b.p448a.p449a.p450a.C7149a;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.ez;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class ac extends b {
    public int f37013a;
    public C7433w f37014b;
    public ez f37015c;
    public byte[] f37016d;
    public byte[][] f37017e;
    public String f37018f;
    public String f37019g;
    public int f37020h;
    public C7422l f37021i;
    public ad[] f37022j;
    public C7149a f37023k;
    public int f37024l;
    public C7415e f37025m;
    public boolean f37026n;
    public int f37027o;
    public boolean f37028p;
    public eb f37029q;
    public String f37030r;
    public String f37031s;
    public String f37032t;
    public boolean f37033u;
    public String f37034v;
    public boolean f37035w;
    public boolean f37036x;

    public final boolean m35071d() {
        return (this.f37013a & 1) != 0;
    }

    public final ac m35068a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f37013a |= 2;
        this.f37018f = str;
        return this;
    }

    public ac() {
        this.f37013a = 0;
        this.f37014b = null;
        this.f37015c = null;
        this.f37016d = C7222l.f35479l;
        this.f37017e = C7222l.f35478k;
        this.f37018f = "";
        this.f37019g = "";
        this.f37020h = 0;
        this.f37021i = null;
        this.f37022j = ad.m35072d();
        this.f37023k = null;
        this.f37024l = 0;
        this.f37025m = null;
        this.f37026n = false;
        this.f37027o = 0;
        this.f37028p = false;
        this.f37029q = null;
        this.f37030r = "";
        this.f37031s = "";
        this.f37032t = "";
        this.f37033u = false;
        this.f37034v = "";
        this.f37035w = false;
        this.f37036x = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35069a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37014b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37014b);
        }
        if (this.f37015c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37015c);
        }
        if ((this.f37013a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f37016d);
        }
        if (this.f37017e != null && this.f37017e.length > 0) {
            for (byte[] bArr : this.f37017e) {
                if (bArr != null) {
                    codedOutputByteBufferNano.m33523a(4, bArr);
                }
            }
        }
        if ((this.f37013a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37018f);
        }
        if ((this.f37013a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37019g);
        }
        if ((this.f37013a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f37020h);
        }
        if (this.f37021i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f37021i);
        }
        if (this.f37022j != null && this.f37022j.length > 0) {
            while (i < this.f37022j.length) {
                i iVar = this.f37022j[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(9, iVar);
                }
                i++;
            }
        }
        if (this.f37023k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f37023k);
        }
        if ((this.f37013a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(11, this.f37024l);
        }
        if (this.f37025m != null) {
            codedOutputByteBufferNano.m33532b(12, this.f37025m);
        }
        if ((this.f37013a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(13, this.f37026n);
        }
        if ((this.f37013a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f37027o);
        }
        if ((this.f37013a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(15, this.f37028p);
        }
        if (this.f37029q != null) {
            codedOutputByteBufferNano.m33532b(16, this.f37029q);
        }
        if ((this.f37013a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f37030r);
        }
        if ((this.f37013a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f37031s);
        }
        if ((this.f37013a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(20, this.f37032t);
        }
        if ((this.f37013a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33522a(21, this.f37033u);
        }
        if ((this.f37013a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33521a(22, this.f37034v);
        }
        if ((this.f37013a & 8192) != 0) {
            codedOutputByteBufferNano.m33522a(23, this.f37035w);
        }
        if ((this.f37013a & 16384) != 0) {
            codedOutputByteBufferNano.m33522a(24, this.f37036x);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35070b() {
        int i = 0;
        int b = super.b();
        if (this.f37014b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37014b);
        }
        if (this.f37015c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37015c);
        }
        if ((this.f37013a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f37016d);
        }
        if (this.f37017e != null && this.f37017e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (byte[] bArr : this.f37017e) {
                if (bArr != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33496b(bArr);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f37013a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37018f);
        }
        if ((this.f37013a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37019g);
        }
        if ((this.f37013a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f37020h);
        }
        if (this.f37021i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f37021i);
        }
        if (this.f37022j != null && this.f37022j.length > 0) {
            while (i < this.f37022j.length) {
                i iVar = this.f37022j[i];
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(9, iVar);
                }
                i++;
            }
        }
        if (this.f37023k != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f37023k);
        }
        if ((this.f37013a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(11, this.f37024l);
        }
        if (this.f37025m != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f37025m);
        }
        if ((this.f37013a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(13) + 1;
        }
        if ((this.f37013a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(14, this.f37027o);
        }
        if ((this.f37013a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(15) + 1;
        }
        if (this.f37029q != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f37029q);
        }
        if ((this.f37013a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f37030r);
        }
        if ((this.f37013a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(19, this.f37031s);
        }
        if ((this.f37013a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(20, this.f37032t);
        }
        if ((this.f37013a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33501d(21) + 1;
        }
        if ((this.f37013a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33493b(22, this.f37034v);
        }
        if ((this.f37013a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33501d(23) + 1;
        }
        if ((this.f37013a & 16384) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(24) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.ac m35066b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0020;
            case 26: goto L_0x0031;
            case 34: goto L_0x003e;
            case 42: goto L_0x0071;
            case 50: goto L_0x007e;
            case 56: goto L_0x008c;
            case 66: goto L_0x00b1;
            case 74: goto L_0x00c3;
            case 82: goto L_0x0103;
            case 88: goto L_0x0115;
            case 98: goto L_0x0123;
            case 104: goto L_0x0135;
            case 112: goto L_0x0143;
            case 120: goto L_0x0182;
            case 130: goto L_0x0190;
            case 138: goto L_0x01a2;
            case 154: goto L_0x01b0;
            case 162: goto L_0x01be;
            case 168: goto L_0x01cc;
            case 178: goto L_0x01da;
            case 184: goto L_0x01e8;
            case 192: goto L_0x01f6;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r7.f37014b;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.w;
        r0.<init>();
        r7.f37014b = r0;
    L_0x001a:
        r0 = r7.f37014b;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0020:
        r0 = r7.f37015c;
        if (r0 != 0) goto L_0x002b;
    L_0x0024:
        r0 = new com.google.wireless.android.finsky.dfe.nano.ez;
        r0.<init>();
        r7.f37015c = r0;
    L_0x002b:
        r0 = r7.f37015c;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0031:
        r0 = r8.m33565g();
        r7.f37016d = r0;
        r0 = r7.f37013a;
        r0 = r0 | 1;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x003e:
        r0 = 34;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f37017e;
        if (r0 != 0) goto L_0x0064;
    L_0x0048:
        r0 = r1;
    L_0x0049:
        r2 = r2 + r0;
        r2 = new byte[r2][];
        if (r0 == 0) goto L_0x0053;
    L_0x004e:
        r3 = r7.f37017e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0053:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0068;
    L_0x0058:
        r3 = r8.m33565g();
        r2[r0] = r3;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0053;
    L_0x0064:
        r0 = r7.f37017e;
        r0 = r0.length;
        goto L_0x0049;
    L_0x0068:
        r3 = r8.m33565g();
        r2[r0] = r3;
        r7.f37017e = r2;
        goto L_0x0001;
    L_0x0071:
        r0 = r8.m33564f();
        r7.f37018f = r0;
        r0 = r7.f37013a;
        r0 = r0 | 2;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x007e:
        r0 = r8.m33564f();
        r7.f37019g = r0;
        r0 = r7.f37013a;
        r0 = r0 | 4;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x008c:
        r2 = r7.f37013a;
        r2 = r2 | 8;
        r7.f37013a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r3 = com.google.wireless.android.finsky.dfe.nano.eb.m36311a(r3);	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r7.f37020h = r3;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r3 = r7.f37013a;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r3 = r3 | 8;
        r7.f37013a = r3;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        goto L_0x0001;
    L_0x00a8:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00b1:
        r0 = r7.f37021i;
        if (r0 != 0) goto L_0x00bc;
    L_0x00b5:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.l;
        r0.<init>();
        r7.f37021i = r0;
    L_0x00bc:
        r0 = r7.f37021i;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00c3:
        r0 = 74;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f37022j;
        if (r0 != 0) goto L_0x00ef;
    L_0x00cd:
        r0 = r1;
    L_0x00ce:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.p505c.p506a.ad[r2];
        if (r0 == 0) goto L_0x00d8;
    L_0x00d3:
        r3 = r7.f37022j;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00d8:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00f3;
    L_0x00dd:
        r3 = new com.google.wireless.android.finsky.dfe.c.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x00d8;
    L_0x00ef:
        r0 = r7.f37022j;
        r0 = r0.length;
        goto L_0x00ce;
    L_0x00f3:
        r3 = new com.google.wireless.android.finsky.dfe.c.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f37022j = r2;
        goto L_0x0001;
    L_0x0103:
        r0 = r7.f37023k;
        if (r0 != 0) goto L_0x010e;
    L_0x0107:
        r0 = new com.google.h.b.a.a.a.a;
        r0.<init>();
        r7.f37023k = r0;
    L_0x010e:
        r0 = r7.f37023k;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0115:
        r0 = r8.m33567i();
        r7.f37024l = r0;
        r0 = r7.f37013a;
        r0 = r0 | 16;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x0123:
        r0 = r7.f37025m;
        if (r0 != 0) goto L_0x012e;
    L_0x0127:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.e;
        r0.<init>();
        r7.f37025m = r0;
    L_0x012e:
        r0 = r7.f37025m;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0135:
        r0 = r8.m33563e();
        r7.f37026n = r0;
        r0 = r7.f37013a;
        r0 = r0 | 32;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x0143:
        r2 = r7.f37013a;
        r2 = r2 | 64;
        r7.f37013a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x016f }
        switch(r3) {
            case 0: goto L_0x0178;
            case 1: goto L_0x0178;
            case 2: goto L_0x0178;
            default: goto L_0x0154;
        };	 Catch:{ IllegalArgumentException -> 0x016f }
    L_0x0154:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x016f }
        r5 = 36;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x016f }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x016f }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x016f }
        r5 = " is not a valid enum Type";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x016f }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x016f }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x016f }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x016f }
    L_0x016f:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0178:
        r7.f37027o = r3;	 Catch:{ IllegalArgumentException -> 0x016f }
        r3 = r7.f37013a;	 Catch:{ IllegalArgumentException -> 0x016f }
        r3 = r3 | 64;
        r7.f37013a = r3;	 Catch:{ IllegalArgumentException -> 0x016f }
        goto L_0x0001;
    L_0x0182:
        r0 = r8.m33563e();
        r7.f37028p = r0;
        r0 = r7.f37013a;
        r0 = r0 | 128;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x0190:
        r0 = r7.f37029q;
        if (r0 != 0) goto L_0x019b;
    L_0x0194:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.eb;
        r0.<init>();
        r7.f37029q = r0;
    L_0x019b:
        r0 = r7.f37029q;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x01a2:
        r0 = r8.m33564f();
        r7.f37030r = r0;
        r0 = r7.f37013a;
        r0 = r0 | 256;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x01b0:
        r0 = r8.m33564f();
        r7.f37031s = r0;
        r0 = r7.f37013a;
        r0 = r0 | 512;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x01be:
        r0 = r8.m33564f();
        r7.f37032t = r0;
        r0 = r7.f37013a;
        r0 = r0 | 1024;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x01cc:
        r0 = r8.m33563e();
        r7.f37033u = r0;
        r0 = r7.f37013a;
        r0 = r0 | 2048;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x01da:
        r0 = r8.m33564f();
        r7.f37034v = r0;
        r0 = r7.f37013a;
        r0 = r0 | 4096;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x01e8:
        r0 = r8.m33563e();
        r7.f37035w = r0;
        r0 = r7.f37013a;
        r0 = r0 | 8192;
        r7.f37013a = r0;
        goto L_0x0001;
    L_0x01f6:
        r0 = r8.m33563e();
        r7.f37036x = r0;
        r0 = r7.f37013a;
        r0 = r0 | 16384;
        r7.f37013a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.ac.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.ac");
    }

    public final /* synthetic */ i m35067a(C7213a c7213a) {
        return m35066b(c7213a);
    }
}
