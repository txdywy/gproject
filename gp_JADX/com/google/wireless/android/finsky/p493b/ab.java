package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.lf;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p519j.p520a.C7513e;
import com.google.wireless.android.finsky.dfe.p519j.p520a.C7514f;
import com.google.wireless.android.finsky.dfe.p519j.p520a.C7515g;
import com.google.wireless.android.finsky.dfe.p519j.p520a.C7517i;

public final class ab extends b {
    public static volatile ab[] f36666a;
    public int f36667b;
    public int f36668c;
    public String f36669d;
    public long f36670e;
    public ax f36671f;
    public String f36672g;
    public String f36673h;
    public C7367w f36674i;
    public C7347c f36675j;
    public C7345a f36676k;
    public ac f36677l;
    public ag f36678m;
    public C7357m f36679n;
    public C7358n f36680o;
    public lf f36681p;
    public boolean f36682q;
    public C7514f f36683r;
    public af f36684s;
    public C7514f f36685t;
    public String f36686u;
    public ad f36687v;
    public C7513e f36688w;
    public C7517i f36689x;
    public C7515g f36690y;

    public static ab[] m34804d() {
        if (f36666a == null) {
            synchronized (C7219h.f35465b) {
                if (f36666a == null) {
                    f36666a = new ab[0];
                }
            }
        }
        return f36666a;
    }

    public ab() {
        this.f36667b = 0;
        this.f36668c = 1;
        this.f36669d = "";
        this.f36670e = 0;
        this.f36671f = null;
        this.f36672g = "";
        this.f36673h = "";
        this.f36674i = null;
        this.f36675j = null;
        this.f36676k = null;
        this.f36677l = null;
        this.f36678m = null;
        this.f36679n = null;
        this.f36680o = null;
        this.f36681p = null;
        this.f36682q = true;
        this.f36683r = null;
        this.f36684s = null;
        this.f36685t = null;
        this.f36686u = "";
        this.f36687v = null;
        this.f36688w = null;
        this.f36689x = null;
        this.f36690y = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34806a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36668c);
        if ((this.f36667b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36670e);
        }
        if (this.f36671f != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36671f);
        }
        if ((this.f36667b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36672g);
        }
        if ((this.f36667b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36673h);
        }
        if (this.f36675j != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36675j);
        }
        if (this.f36676k != null) {
            codedOutputByteBufferNano.m33532b(8, this.f36676k);
        }
        if (this.f36677l != null) {
            codedOutputByteBufferNano.m33532b(9, this.f36677l);
        }
        if (this.f36678m != null) {
            codedOutputByteBufferNano.m33532b(10, this.f36678m);
        }
        if (this.f36679n != null) {
            codedOutputByteBufferNano.m33532b(11, this.f36679n);
        }
        if ((this.f36667b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f36669d);
        }
        if (this.f36674i != null) {
            codedOutputByteBufferNano.m33532b(14, this.f36674i);
        }
        if (this.f36680o != null) {
            codedOutputByteBufferNano.m33532b(15, this.f36680o);
        }
        if (this.f36681p != null) {
            codedOutputByteBufferNano.m33532b(16, this.f36681p);
        }
        if ((this.f36667b & 16) != 0) {
            codedOutputByteBufferNano.m33522a(17, this.f36682q);
        }
        if (this.f36683r != null) {
            codedOutputByteBufferNano.m33532b(18, this.f36683r);
        }
        if (this.f36684s != null) {
            codedOutputByteBufferNano.m33532b(19, this.f36684s);
        }
        if (this.f36685t != null) {
            codedOutputByteBufferNano.m33532b(20, this.f36685t);
        }
        if ((this.f36667b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(21, this.f36686u);
        }
        if (this.f36687v != null) {
            codedOutputByteBufferNano.m33532b(22, this.f36687v);
        }
        if (this.f36688w != null) {
            codedOutputByteBufferNano.m33532b(23, this.f36688w);
        }
        if (this.f36689x != null) {
            codedOutputByteBufferNano.m33532b(24, this.f36689x);
        }
        if (this.f36690y != null) {
            codedOutputByteBufferNano.m33532b(25, this.f36690y);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34807b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f36668c);
        if ((this.f36667b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f36670e);
        }
        if (this.f36671f != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f36671f);
        }
        if ((this.f36667b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36672g);
        }
        if ((this.f36667b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36673h);
        }
        if (this.f36675j != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36675j);
        }
        if (this.f36676k != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f36676k);
        }
        if (this.f36677l != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f36677l);
        }
        if (this.f36678m != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f36678m);
        }
        if (this.f36679n != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f36679n);
        }
        if ((this.f36667b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f36669d);
        }
        if (this.f36674i != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f36674i);
        }
        if (this.f36680o != null) {
            b += CodedOutputByteBufferNano.m33503d(15, this.f36680o);
        }
        if (this.f36681p != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f36681p);
        }
        if ((this.f36667b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(17) + 1;
        }
        if (this.f36683r != null) {
            b += CodedOutputByteBufferNano.m33503d(18, this.f36683r);
        }
        if (this.f36684s != null) {
            b += CodedOutputByteBufferNano.m33503d(19, this.f36684s);
        }
        if (this.f36685t != null) {
            b += CodedOutputByteBufferNano.m33503d(20, this.f36685t);
        }
        if ((this.f36667b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(21, this.f36686u);
        }
        if (this.f36687v != null) {
            b += CodedOutputByteBufferNano.m33503d(22, this.f36687v);
        }
        if (this.f36688w != null) {
            b += CodedOutputByteBufferNano.m33503d(23, this.f36688w);
        }
        if (this.f36689x != null) {
            b += CodedOutputByteBufferNano.m33503d(24, this.f36689x);
        }
        if (this.f36690y != null) {
            return b + CodedOutputByteBufferNano.m33503d(25, this.f36690y);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p493b.ab m34803b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 24: goto L_0x003f;
            case 34: goto L_0x004c;
            case 42: goto L_0x005d;
            case 50: goto L_0x006a;
            case 58: goto L_0x0077;
            case 66: goto L_0x0089;
            case 74: goto L_0x009b;
            case 82: goto L_0x00ad;
            case 90: goto L_0x00bf;
            case 106: goto L_0x00d1;
            case 114: goto L_0x00df;
            case 122: goto L_0x00f1;
            case 130: goto L_0x0103;
            case 136: goto L_0x0115;
            case 146: goto L_0x0123;
            case 154: goto L_0x0135;
            case 162: goto L_0x0147;
            case 170: goto L_0x0159;
            case 178: goto L_0x0167;
            case 186: goto L_0x0179;
            case 194: goto L_0x018b;
            case 202: goto L_0x019d;
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
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            case 10: goto L_0x003c;
            case 11: goto L_0x003c;
            case 12: goto L_0x003c;
            case 13: goto L_0x003c;
            case 14: goto L_0x003c;
            case 15: goto L_0x003c;
            case 16: goto L_0x003c;
            case 17: goto L_0x003c;
            case 18: goto L_0x003c;
            case 19: goto L_0x003c;
            case 20: goto L_0x003c;
            case 21: goto L_0x003c;
            case 22: goto L_0x003c;
            case 23: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum NotificationType";
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
        r6.f36668c = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33559c();
        r6.f36670e = r0;
        r0 = r6.f36667b;
        r0 = r0 | 2;
        r6.f36667b = r0;
        goto L_0x0000;
    L_0x004c:
        r0 = r6.f36671f;
        if (r0 != 0) goto L_0x0057;
    L_0x0050:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r6.f36671f = r0;
    L_0x0057:
        r0 = r6.f36671f;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x005d:
        r0 = r7.m33564f();
        r6.f36672g = r0;
        r0 = r6.f36667b;
        r0 = r0 | 4;
        r6.f36667b = r0;
        goto L_0x0000;
    L_0x006a:
        r0 = r7.m33564f();
        r6.f36673h = r0;
        r0 = r6.f36667b;
        r0 = r0 | 8;
        r6.f36667b = r0;
        goto L_0x0000;
    L_0x0077:
        r0 = r6.f36675j;
        if (r0 != 0) goto L_0x0082;
    L_0x007b:
        r0 = new com.google.wireless.android.finsky.b.c;
        r0.<init>();
        r6.f36675j = r0;
    L_0x0082:
        r0 = r6.f36675j;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0089:
        r0 = r6.f36676k;
        if (r0 != 0) goto L_0x0094;
    L_0x008d:
        r0 = new com.google.wireless.android.finsky.b.a;
        r0.<init>();
        r6.f36676k = r0;
    L_0x0094:
        r0 = r6.f36676k;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x009b:
        r0 = r6.f36677l;
        if (r0 != 0) goto L_0x00a6;
    L_0x009f:
        r0 = new com.google.wireless.android.finsky.b.ac;
        r0.<init>();
        r6.f36677l = r0;
    L_0x00a6:
        r0 = r6.f36677l;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00ad:
        r0 = r6.f36678m;
        if (r0 != 0) goto L_0x00b8;
    L_0x00b1:
        r0 = new com.google.wireless.android.finsky.b.ag;
        r0.<init>();
        r6.f36678m = r0;
    L_0x00b8:
        r0 = r6.f36678m;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00bf:
        r0 = r6.f36679n;
        if (r0 != 0) goto L_0x00ca;
    L_0x00c3:
        r0 = new com.google.wireless.android.finsky.b.m;
        r0.<init>();
        r6.f36679n = r0;
    L_0x00ca:
        r0 = r6.f36679n;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00d1:
        r0 = r7.m33564f();
        r6.f36669d = r0;
        r0 = r6.f36667b;
        r0 = r0 | 1;
        r6.f36667b = r0;
        goto L_0x0000;
    L_0x00df:
        r0 = r6.f36674i;
        if (r0 != 0) goto L_0x00ea;
    L_0x00e3:
        r0 = new com.google.wireless.android.finsky.b.w;
        r0.<init>();
        r6.f36674i = r0;
    L_0x00ea:
        r0 = r6.f36674i;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00f1:
        r0 = r6.f36680o;
        if (r0 != 0) goto L_0x00fc;
    L_0x00f5:
        r0 = new com.google.wireless.android.finsky.b.n;
        r0.<init>();
        r6.f36680o = r0;
    L_0x00fc:
        r0 = r6.f36680o;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0103:
        r0 = r6.f36681p;
        if (r0 != 0) goto L_0x010e;
    L_0x0107:
        r0 = new com.google.android.finsky.cv.a.lf;
        r0.<init>();
        r6.f36681p = r0;
    L_0x010e:
        r0 = r6.f36681p;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0115:
        r0 = r7.m33563e();
        r6.f36682q = r0;
        r0 = r6.f36667b;
        r0 = r0 | 16;
        r6.f36667b = r0;
        goto L_0x0000;
    L_0x0123:
        r0 = r6.f36683r;
        if (r0 != 0) goto L_0x012e;
    L_0x0127:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.f;
        r0.<init>();
        r6.f36683r = r0;
    L_0x012e:
        r0 = r6.f36683r;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0135:
        r0 = r6.f36684s;
        if (r0 != 0) goto L_0x0140;
    L_0x0139:
        r0 = new com.google.wireless.android.finsky.b.af;
        r0.<init>();
        r6.f36684s = r0;
    L_0x0140:
        r0 = r6.f36684s;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0147:
        r0 = r6.f36685t;
        if (r0 != 0) goto L_0x0152;
    L_0x014b:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.f;
        r0.<init>();
        r6.f36685t = r0;
    L_0x0152:
        r0 = r6.f36685t;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0159:
        r0 = r7.m33564f();
        r6.f36686u = r0;
        r0 = r6.f36667b;
        r0 = r0 | 32;
        r6.f36667b = r0;
        goto L_0x0000;
    L_0x0167:
        r0 = r6.f36687v;
        if (r0 != 0) goto L_0x0172;
    L_0x016b:
        r0 = new com.google.wireless.android.finsky.b.ad;
        r0.<init>();
        r6.f36687v = r0;
    L_0x0172:
        r0 = r6.f36687v;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0179:
        r0 = r6.f36688w;
        if (r0 != 0) goto L_0x0184;
    L_0x017d:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.e;
        r0.<init>();
        r6.f36688w = r0;
    L_0x0184:
        r0 = r6.f36688w;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x018b:
        r0 = r6.f36689x;
        if (r0 != 0) goto L_0x0196;
    L_0x018f:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.i;
        r0.<init>();
        r6.f36689x = r0;
    L_0x0196:
        r0 = r6.f36689x;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x019d:
        r0 = r6.f36690y;
        if (r0 != 0) goto L_0x01a8;
    L_0x01a1:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.g;
        r0.<init>();
        r6.f36690y = r0;
    L_0x01a8:
        r0 = r6.f36690y;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.b.ab.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.b.ab");
    }

    public final /* synthetic */ i m34805a(C7213a c7213a) {
        return m34803b(c7213a);
    }
}
