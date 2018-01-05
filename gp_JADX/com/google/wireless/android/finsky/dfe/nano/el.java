package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.is;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7327i;
import com.google.wireless.android.finsky.p491a.p492a.ay;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class el extends b {
    public int f38767a;
    public int f38768b;
    public String f38769c;
    public em f38770d;
    public C7327i f38771e;
    public C7540p f38772f;
    public String f38773g;
    public String f38774h;
    public byte[] f38775i;
    public cv f38776j;
    public ax f38777k;
    public byte[] f38778l;
    public ay f38779m;
    public C7535k f38780n;
    public C7367w[] f38781o;
    public is f38782p;

    public el() {
        this.f38767a = 0;
        this.f38768b = 1;
        this.f38769c = "";
        this.f38770d = null;
        this.f38771e = null;
        this.f38772f = null;
        this.f38773g = "";
        this.f38774h = "";
        this.f38775i = C7222l.f35479l;
        this.f38776j = null;
        this.f38777k = null;
        this.f38778l = C7222l.f35479l;
        this.f38779m = null;
        this.f38780n = null;
        this.f38781o = C7367w.m34905d();
        this.f38782p = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36341a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38767a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38768b);
        }
        if ((this.f38767a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38769c);
        }
        if (this.f38770d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38770d);
        }
        if (this.f38771e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38771e);
        }
        if (this.f38772f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f38772f);
        }
        if ((this.f38767a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38773g);
        }
        if ((this.f38767a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38774h);
        }
        if (this.f38777k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38777k);
        }
        if (this.f38776j != null) {
            codedOutputByteBufferNano.m33532b(11, this.f38776j);
        }
        if ((this.f38767a & 32) != 0) {
            codedOutputByteBufferNano.m33523a(12, this.f38778l);
        }
        if (this.f38779m != null) {
            codedOutputByteBufferNano.m33532b(13, this.f38779m);
        }
        if (this.f38780n != null) {
            codedOutputByteBufferNano.m33532b(14, this.f38780n);
        }
        if (this.f38781o != null && this.f38781o.length > 0) {
            for (i iVar : this.f38781o) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(15, iVar);
                }
            }
        }
        if ((this.f38767a & 16) != 0) {
            codedOutputByteBufferNano.m33523a(16, this.f38775i);
        }
        if (this.f38782p != null) {
            codedOutputByteBufferNano.m33532b(17, this.f38782p);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36342b() {
        int b = super.b();
        if ((this.f38767a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38768b);
        }
        if ((this.f38767a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38769c);
        }
        if (this.f38770d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38770d);
        }
        if (this.f38771e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38771e);
        }
        if (this.f38772f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f38772f);
        }
        if ((this.f38767a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38773g);
        }
        if ((this.f38767a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f38774h);
        }
        if (this.f38777k != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f38777k);
        }
        if (this.f38776j != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f38776j);
        }
        if ((this.f38767a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33494b(12, this.f38778l);
        }
        if (this.f38779m != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f38779m);
        }
        if (this.f38780n != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f38780n);
        }
        if (this.f38781o != null && this.f38781o.length > 0) {
            int i = b;
            for (i iVar : this.f38781o) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(15, iVar);
                }
            }
            b = i;
        }
        if ((this.f38767a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33494b(16, this.f38775i);
        }
        if (this.f38782p != null) {
            return b + CodedOutputByteBufferNano.m33503d(17, this.f38782p);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.el m36339b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x004c;
            case 26: goto L_0x0059;
            case 34: goto L_0x006a;
            case 42: goto L_0x007b;
            case 50: goto L_0x008d;
            case 66: goto L_0x009b;
            case 82: goto L_0x00a9;
            case 90: goto L_0x00bb;
            case 98: goto L_0x00cd;
            case 106: goto L_0x00db;
            case 114: goto L_0x00ed;
            case 122: goto L_0x00ff;
            case 130: goto L_0x013f;
            case 138: goto L_0x014d;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f38767a;
        r2 = r2 | 1;
        r7.f38767a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r3) {
            case 1: goto L_0x0043;
            case 2: goto L_0x0043;
            case 3: goto L_0x0043;
            case 4: goto L_0x0043;
            case 5: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = " is not a valid enum ResultCode";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0043:
        r7.f38768b = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r7.f38767a;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3 | 1;
        r7.f38767a = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0001;
    L_0x004c:
        r0 = r8.m33564f();
        r7.f38769c = r0;
        r0 = r7.f38767a;
        r0 = r0 | 2;
        r7.f38767a = r0;
        goto L_0x0001;
    L_0x0059:
        r0 = r7.f38770d;
        if (r0 != 0) goto L_0x0064;
    L_0x005d:
        r0 = new com.google.wireless.android.finsky.dfe.nano.em;
        r0.<init>();
        r7.f38770d = r0;
    L_0x0064:
        r0 = r7.f38770d;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x006a:
        r0 = r7.f38771e;
        if (r0 != 0) goto L_0x0075;
    L_0x006e:
        r0 = new com.google.wireless.android.finsky.a.a.i;
        r0.<init>();
        r7.f38771e = r0;
    L_0x0075:
        r0 = r7.f38771e;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x007b:
        r0 = r7.f38772f;
        if (r0 != 0) goto L_0x0086;
    L_0x007f:
        r0 = new com.google.wireless.android.finsky.dfe.nano.p;
        r0.<init>();
        r7.f38772f = r0;
    L_0x0086:
        r0 = r7.f38772f;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x008d:
        r0 = r8.m33564f();
        r7.f38773g = r0;
        r0 = r7.f38767a;
        r0 = r0 | 4;
        r7.f38767a = r0;
        goto L_0x0001;
    L_0x009b:
        r0 = r8.m33564f();
        r7.f38774h = r0;
        r0 = r7.f38767a;
        r0 = r0 | 8;
        r7.f38767a = r0;
        goto L_0x0001;
    L_0x00a9:
        r0 = r7.f38777k;
        if (r0 != 0) goto L_0x00b4;
    L_0x00ad:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r7.f38777k = r0;
    L_0x00b4:
        r0 = r7.f38777k;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00bb:
        r0 = r7.f38776j;
        if (r0 != 0) goto L_0x00c6;
    L_0x00bf:
        r0 = new com.google.android.finsky.cv.a.cv;
        r0.<init>();
        r7.f38776j = r0;
    L_0x00c6:
        r0 = r7.f38776j;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00cd:
        r0 = r8.m33565g();
        r7.f38778l = r0;
        r0 = r7.f38767a;
        r0 = r0 | 32;
        r7.f38767a = r0;
        goto L_0x0001;
    L_0x00db:
        r0 = r7.f38779m;
        if (r0 != 0) goto L_0x00e6;
    L_0x00df:
        r0 = new com.google.wireless.android.finsky.a.a.ay;
        r0.<init>();
        r7.f38779m = r0;
    L_0x00e6:
        r0 = r7.f38779m;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00ed:
        r0 = r7.f38780n;
        if (r0 != 0) goto L_0x00f8;
    L_0x00f1:
        r0 = new com.google.wireless.android.finsky.dfe.nano.k;
        r0.<init>();
        r7.f38780n = r0;
    L_0x00f8:
        r0 = r7.f38780n;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00ff:
        r0 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38781o;
        if (r0 != 0) goto L_0x012b;
    L_0x0109:
        r0 = r1;
    L_0x010a:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.p493b.C7367w[r2];
        if (r0 == 0) goto L_0x0114;
    L_0x010f:
        r3 = r7.f38781o;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0114:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x012f;
    L_0x0119:
        r3 = new com.google.wireless.android.finsky.b.w;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0114;
    L_0x012b:
        r0 = r7.f38781o;
        r0 = r0.length;
        goto L_0x010a;
    L_0x012f:
        r3 = new com.google.wireless.android.finsky.b.w;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f38781o = r2;
        goto L_0x0001;
    L_0x013f:
        r0 = r8.m33565g();
        r7.f38775i = r0;
        r0 = r7.f38767a;
        r0 = r0 | 16;
        r7.f38767a = r0;
        goto L_0x0001;
    L_0x014d:
        r0 = r7.f38782p;
        if (r0 != 0) goto L_0x0158;
    L_0x0151:
        r0 = new com.google.android.finsky.cv.a.is;
        r0.<init>();
        r7.f38782p = r0;
    L_0x0158:
        r0 = r7.f38782p;
        r8.m33552a(r0);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.el.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.el");
    }

    public final /* synthetic */ i m36340a(C7213a c7213a) {
        return m36339b(c7213a);
    }
}
