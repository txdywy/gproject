package com.google.wireless.android.finsky.dfe.nano;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class gp extends C0758b {
    public String f31753A;
    public String f31754B;
    public String f31755C;
    public String f31756D;
    public go[] f31757E;
    public int f31758a;
    public gj[] f31759b;
    public String f31760c;
    public String f31761d;
    public String f31762e;
    public boolean f31763f;
    public gl f31764g;
    public String f31765h;
    public String f31766i;
    public gk f31767j;
    public du f31768k;
    public String f31769l;
    public gn f31770m;
    public boolean f31771n;
    public gi f31772o;
    public String f31773p;
    public boolean f31774q;
    public boolean f31775r;
    public boolean f31776s;
    public String f31777t;
    public int f31778u;
    public String f31779v;
    public String f31780w;
    public gm f31781x;
    public boolean f31782y;
    public String f31783z;

    public gp() {
        this.f31758a = 0;
        this.f31759b = gj.d();
        this.f31760c = "";
        this.f31761d = "";
        this.f31762e = "";
        this.f31763f = false;
        this.f31764g = null;
        this.f31765h = "";
        this.f31766i = "";
        this.f31767j = null;
        this.f31768k = null;
        this.f31769l = "";
        this.f31770m = null;
        this.f31771n = false;
        this.f31772o = null;
        this.f31773p = "";
        this.f31774q = false;
        this.f31775r = false;
        this.f31776s = false;
        this.f31777t = "";
        this.f31778u = 0;
        this.f31779v = "";
        this.f31780w = "";
        this.f31781x = null;
        this.f31782y = false;
        this.f31783z = "";
        this.f31753A = "";
        this.f31754B = "";
        this.f31755C = "";
        this.f31756D = "";
        this.f31757E = go.d();
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f31759b != null && this.f31759b.length > 0) {
            for (C0757i c0757i : this.f31759b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f31758a & 1) != 0) {
            codedOutputByteBufferNano.a(3, this.f31760c);
        }
        if ((this.f31758a & 16) != 0) {
            codedOutputByteBufferNano.a(4, this.f31765h);
        }
        if (this.f31767j != null) {
            codedOutputByteBufferNano.b(5, this.f31767j);
        }
        if ((this.f31758a & 2097152) != 0) {
            codedOutputByteBufferNano.a(6, this.f31756D);
        }
        if ((this.f31758a & 2) != 0) {
            codedOutputByteBufferNano.a(7, this.f31761d);
        }
        if (this.f31768k != null) {
            codedOutputByteBufferNano.b(8, this.f31768k);
        }
        if ((this.f31758a & 64) != 0) {
            codedOutputByteBufferNano.a(9, this.f31769l);
        }
        if (this.f31770m != null) {
            codedOutputByteBufferNano.b(10, this.f31770m);
        }
        if ((this.f31758a & 128) != 0) {
            codedOutputByteBufferNano.a(11, this.f31771n);
        }
        if (this.f31772o != null) {
            codedOutputByteBufferNano.b(12, this.f31772o);
        }
        if ((this.f31758a & 256) != 0) {
            codedOutputByteBufferNano.a(13, this.f31773p);
        }
        if ((this.f31758a & 512) != 0) {
            codedOutputByteBufferNano.a(16, this.f31774q);
        }
        if ((this.f31758a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(17, this.f31775r);
        }
        if ((this.f31758a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(18, this.f31776s);
        }
        if ((this.f31758a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(19, this.f31777t);
        }
        if ((this.f31758a & 8192) != 0) {
            codedOutputByteBufferNano.a(20, this.f31778u);
        }
        if ((this.f31758a & 32) != 0) {
            codedOutputByteBufferNano.a(21, this.f31766i);
        }
        if ((this.f31758a & 16384) != 0) {
            codedOutputByteBufferNano.a(22, this.f31779v);
        }
        if ((this.f31758a & 4) != 0) {
            codedOutputByteBufferNano.a(23, this.f31762e);
        }
        if ((this.f31758a & 32768) != 0) {
            codedOutputByteBufferNano.a(24, this.f31780w);
        }
        if (this.f31781x != null) {
            codedOutputByteBufferNano.b(25, this.f31781x);
        }
        if ((this.f31758a & 65536) != 0) {
            codedOutputByteBufferNano.a(26, this.f31782y);
        }
        if ((this.f31758a & 8) != 0) {
            codedOutputByteBufferNano.a(27, this.f31763f);
        }
        if ((this.f31758a & 131072) != 0) {
            codedOutputByteBufferNano.a(28, this.f31783z);
        }
        if ((this.f31758a & 262144) != 0) {
            codedOutputByteBufferNano.a(29, this.f31753A);
        }
        if ((this.f31758a & 524288) != 0) {
            codedOutputByteBufferNano.a(30, this.f31754B);
        }
        if ((this.f31758a & 1048576) != 0) {
            codedOutputByteBufferNano.a(31, this.f31755C);
        }
        if (this.f31764g != null) {
            codedOutputByteBufferNano.b(32, this.f31764g);
        }
        if (this.f31757E != null && this.f31757E.length > 0) {
            while (i < this.f31757E.length) {
                C0757i c0757i2 = this.f31757E[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(33, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f31759b != null && this.f31759b.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f31759b) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i2;
        }
        if ((this.f31758a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f31760c);
        }
        if ((this.f31758a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f31765h);
        }
        if (this.f31767j != null) {
            b += CodedOutputByteBufferNano.d(5, this.f31767j);
        }
        if ((this.f31758a & 2097152) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f31756D);
        }
        if ((this.f31758a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f31761d);
        }
        if (this.f31768k != null) {
            b += CodedOutputByteBufferNano.d(8, this.f31768k);
        }
        if ((this.f31758a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f31769l);
        }
        if (this.f31770m != null) {
            b += CodedOutputByteBufferNano.d(10, this.f31770m);
        }
        if ((this.f31758a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(11) + 1;
        }
        if (this.f31772o != null) {
            b += CodedOutputByteBufferNano.d(12, this.f31772o);
        }
        if ((this.f31758a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f31773p);
        }
        if ((this.f31758a & 512) != 0) {
            b += CodedOutputByteBufferNano.d(16) + 1;
        }
        if ((this.f31758a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.d(17) + 1;
        }
        if ((this.f31758a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.d(18) + 1;
        }
        if ((this.f31758a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.b(19, this.f31777t);
        }
        if ((this.f31758a & 8192) != 0) {
            b += CodedOutputByteBufferNano.d(20, this.f31778u);
        }
        if ((this.f31758a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(21, this.f31766i);
        }
        if ((this.f31758a & 16384) != 0) {
            b += CodedOutputByteBufferNano.b(22, this.f31779v);
        }
        if ((this.f31758a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(23, this.f31762e);
        }
        if ((this.f31758a & 32768) != 0) {
            b += CodedOutputByteBufferNano.b(24, this.f31780w);
        }
        if (this.f31781x != null) {
            b += CodedOutputByteBufferNano.d(25, this.f31781x);
        }
        if ((this.f31758a & 65536) != 0) {
            b += CodedOutputByteBufferNano.d(26) + 1;
        }
        if ((this.f31758a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(27) + 1;
        }
        if ((this.f31758a & 131072) != 0) {
            b += CodedOutputByteBufferNano.b(28, this.f31783z);
        }
        if ((this.f31758a & 262144) != 0) {
            b += CodedOutputByteBufferNano.b(29, this.f31753A);
        }
        if ((this.f31758a & 524288) != 0) {
            b += CodedOutputByteBufferNano.b(30, this.f31754B);
        }
        if ((this.f31758a & 1048576) != 0) {
            b += CodedOutputByteBufferNano.b(31, this.f31755C);
        }
        if (this.f31764g != null) {
            b += CodedOutputByteBufferNano.d(32, this.f31764g);
        }
        if (this.f31757E != null && this.f31757E.length > 0) {
            while (i < this.f31757E.length) {
                C0757i c0757i2 = this.f31757E[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(33, c0757i2);
                }
                i++;
            }
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.gp m29015b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 26: goto L_0x004e;
            case 34: goto L_0x005b;
            case 42: goto L_0x0068;
            case 50: goto L_0x0079;
            case 58: goto L_0x0088;
            case 66: goto L_0x0096;
            case 74: goto L_0x00a8;
            case 82: goto L_0x00b6;
            case 88: goto L_0x00c8;
            case 98: goto L_0x00d6;
            case 106: goto L_0x00e8;
            case 128: goto L_0x00f6;
            case 136: goto L_0x0104;
            case 144: goto L_0x0112;
            case 154: goto L_0x0120;
            case 160: goto L_0x012e;
            case 170: goto L_0x016d;
            case 178: goto L_0x017b;
            case 186: goto L_0x0189;
            case 194: goto L_0x0197;
            case 202: goto L_0x01a7;
            case 208: goto L_0x01b9;
            case 216: goto L_0x01c8;
            case 226: goto L_0x01d6;
            case 234: goto L_0x01e5;
            case 242: goto L_0x01f4;
            case 250: goto L_0x0203;
            case 258: goto L_0x0212;
            case 266: goto L_0x0224;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = 10;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31759b;
        if (r0 != 0) goto L_0x003b;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.gj[r2];
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r7.f31759b;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0024:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x003f;
    L_0x0029:
        r3 = new com.google.wireless.android.finsky.dfe.nano.gj;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x003b:
        r0 = r7.f31759b;
        r0 = r0.length;
        goto L_0x001a;
    L_0x003f:
        r3 = new com.google.wireless.android.finsky.dfe.nano.gj;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f31759b = r2;
        goto L_0x0001;
    L_0x004e:
        r0 = r8.f();
        r7.f31760c = r0;
        r0 = r7.f31758a;
        r0 = r0 | 1;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x005b:
        r0 = r8.f();
        r7.f31765h = r0;
        r0 = r7.f31758a;
        r0 = r0 | 16;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0068:
        r0 = r7.f31767j;
        if (r0 != 0) goto L_0x0073;
    L_0x006c:
        r0 = new com.google.wireless.android.finsky.dfe.nano.gk;
        r0.<init>();
        r7.f31767j = r0;
    L_0x0073:
        r0 = r7.f31767j;
        r8.a(r0);
        goto L_0x0001;
    L_0x0079:
        r0 = r8.f();
        r7.f31756D = r0;
        r0 = r7.f31758a;
        r2 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r0 = r0 | r2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0088:
        r0 = r8.f();
        r7.f31761d = r0;
        r0 = r7.f31758a;
        r0 = r0 | 2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0096:
        r0 = r7.f31768k;
        if (r0 != 0) goto L_0x00a1;
    L_0x009a:
        r0 = new com.google.wireless.android.finsky.dfe.nano.du;
        r0.<init>();
        r7.f31768k = r0;
    L_0x00a1:
        r0 = r7.f31768k;
        r8.a(r0);
        goto L_0x0001;
    L_0x00a8:
        r0 = r8.f();
        r7.f31769l = r0;
        r0 = r7.f31758a;
        r0 = r0 | 64;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x00b6:
        r0 = r7.f31770m;
        if (r0 != 0) goto L_0x00c1;
    L_0x00ba:
        r0 = new com.google.wireless.android.finsky.dfe.nano.gn;
        r0.<init>();
        r7.f31770m = r0;
    L_0x00c1:
        r0 = r7.f31770m;
        r8.a(r0);
        goto L_0x0001;
    L_0x00c8:
        r0 = r8.e();
        r7.f31771n = r0;
        r0 = r7.f31758a;
        r0 = r0 | 128;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x00d6:
        r0 = r7.f31772o;
        if (r0 != 0) goto L_0x00e1;
    L_0x00da:
        r0 = new com.google.wireless.android.finsky.dfe.nano.gi;
        r0.<init>();
        r7.f31772o = r0;
    L_0x00e1:
        r0 = r7.f31772o;
        r8.a(r0);
        goto L_0x0001;
    L_0x00e8:
        r0 = r8.f();
        r7.f31773p = r0;
        r0 = r7.f31758a;
        r0 = r0 | 256;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x00f6:
        r0 = r8.e();
        r7.f31774q = r0;
        r0 = r7.f31758a;
        r0 = r0 | 512;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0104:
        r0 = r8.e();
        r7.f31775r = r0;
        r0 = r7.f31758a;
        r0 = r0 | 1024;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0112:
        r0 = r8.e();
        r7.f31776s = r0;
        r0 = r7.f31758a;
        r0 = r0 | 2048;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0120:
        r0 = r8.f();
        r7.f31777t = r0;
        r0 = r7.f31758a;
        r0 = r0 | 4096;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x012e:
        r2 = r7.f31758a;
        r2 = r2 | 8192;
        r7.f31758a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x015a }
        switch(r3) {
            case 0: goto L_0x0163;
            case 1: goto L_0x0163;
            default: goto L_0x013f;
        };	 Catch:{ IllegalArgumentException -> 0x015a }
    L_0x013f:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x015a }
        r5 = 34;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x015a }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x015a }
        r5 = " is not a valid enum Id";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x015a }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x015a }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x015a }
    L_0x015a:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0163:
        r7.f31778u = r3;	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r7.f31758a;	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3 | 8192;
        r7.f31758a = r3;	 Catch:{ IllegalArgumentException -> 0x015a }
        goto L_0x0001;
    L_0x016d:
        r0 = r8.f();
        r7.f31766i = r0;
        r0 = r7.f31758a;
        r0 = r0 | 32;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x017b:
        r0 = r8.f();
        r7.f31779v = r0;
        r0 = r7.f31758a;
        r0 = r0 | 16384;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0189:
        r0 = r8.f();
        r7.f31762e = r0;
        r0 = r7.f31758a;
        r0 = r0 | 4;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0197:
        r0 = r8.f();
        r7.f31780w = r0;
        r0 = r7.f31758a;
        r2 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x01a7:
        r0 = r7.f31781x;
        if (r0 != 0) goto L_0x01b2;
    L_0x01ab:
        r0 = new com.google.wireless.android.finsky.dfe.nano.gm;
        r0.<init>();
        r7.f31781x = r0;
    L_0x01b2:
        r0 = r7.f31781x;
        r8.a(r0);
        goto L_0x0001;
    L_0x01b9:
        r0 = r8.e();
        r7.f31782y = r0;
        r0 = r7.f31758a;
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x01c8:
        r0 = r8.e();
        r7.f31763f = r0;
        r0 = r7.f31758a;
        r0 = r0 | 8;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x01d6:
        r0 = r8.f();
        r7.f31783z = r0;
        r0 = r7.f31758a;
        r2 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x01e5:
        r0 = r8.f();
        r7.f31753A = r0;
        r0 = r7.f31758a;
        r2 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 | r2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x01f4:
        r0 = r8.f();
        r7.f31754B = r0;
        r0 = r7.f31758a;
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0203:
        r0 = r8.f();
        r7.f31755C = r0;
        r0 = r7.f31758a;
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 | r2;
        r7.f31758a = r0;
        goto L_0x0001;
    L_0x0212:
        r0 = r7.f31764g;
        if (r0 != 0) goto L_0x021d;
    L_0x0216:
        r0 = new com.google.wireless.android.finsky.dfe.nano.gl;
        r0.<init>();
        r7.f31764g = r0;
    L_0x021d:
        r0 = r7.f31764g;
        r8.a(r0);
        goto L_0x0001;
    L_0x0224:
        r0 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31757E;
        if (r0 != 0) goto L_0x0250;
    L_0x022e:
        r0 = r1;
    L_0x022f:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.go[r2];
        if (r0 == 0) goto L_0x0239;
    L_0x0234:
        r3 = r7.f31757E;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0239:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0254;
    L_0x023e:
        r3 = new com.google.wireless.android.finsky.dfe.nano.go;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0239;
    L_0x0250:
        r0 = r7.f31757E;
        r0 = r0.length;
        goto L_0x022f;
    L_0x0254:
        r3 = new com.google.wireless.android.finsky.dfe.nano.go;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f31757E = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.gp.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.gp");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m29015b(aVar);
    }
}
