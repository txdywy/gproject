package com.google.android.finsky.verifier.p259a.p260a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C4699c extends C0758b {
    public static volatile C4699c[] f24134a;
    public boolean f24135A;
    public boolean f24136B;
    public boolean f24137C;
    public boolean f24138D;
    public C4708l f24139E;
    public boolean f24140F;
    public boolean f24141G;
    public boolean f24142H;
    public int f24143b;
    public String f24144c;
    public C4704h f24145d;
    public long f24146e;
    public C4709m[] f24147f;
    public C4710n f24148g;
    public boolean f24149h;
    public String[] f24150i;
    public String f24151j;
    public int f24152k;
    public String f24153l;
    public C4700d f24154m;
    public long f24155n;
    public String[] f24156o;
    public byte[] f24157p;
    public C4710n f24158q;
    public String[] f24159r;
    public C4710n f24160s;
    public String f24161t;
    public boolean f24162u;
    public C4706j f24163v;
    public C4706j f24164w;
    public String f24165x;
    public boolean f24166y;
    public boolean f24167z;

    public static C4699c[] ch_() {
        if (f24134a == null) {
            synchronized (h.b) {
                if (f24134a == null) {
                    f24134a = new C4699c[0];
                }
            }
        }
        return f24134a;
    }

    public final C4699c ci_() {
        this.f24152k = 2;
        this.f24143b |= 4;
        return this;
    }

    public final C4699c m21881d() {
        this.f24143b |= 128;
        this.f24162u = true;
        return this;
    }

    public final C4699c m21882e() {
        this.f24143b |= 512;
        this.f24166y = true;
        return this;
    }

    public final C4699c m21883f() {
        this.f24143b |= 8192;
        this.f24137C = true;
        return this;
    }

    public final C4699c m21877a(boolean z) {
        this.f24143b |= 65536;
        this.f24141G = z;
        return this;
    }

    public C4699c() {
        this.f24143b = 0;
        this.f24144c = "";
        this.f24145d = null;
        this.f24146e = 0;
        this.f24147f = C4709m.cp_();
        this.f24148g = null;
        this.f24149h = false;
        this.f24150i = l.j;
        this.f24151j = "";
        this.f24152k = 0;
        this.f24153l = "";
        this.f24154m = null;
        this.f24155n = 0;
        this.f24156o = l.j;
        this.f24157p = l.l;
        this.f24158q = null;
        this.f24159r = l.j;
        this.f24160s = null;
        this.f24161t = "";
        this.f24162u = false;
        this.f24163v = null;
        this.f24164w = null;
        this.f24165x = "";
        this.f24166y = false;
        this.f24167z = false;
        this.f24135A = false;
        this.f24136B = false;
        this.f24137C = false;
        this.f24138D = false;
        this.f24139E = null;
        this.f24140F = false;
        this.f24141G = false;
        this.f24142H = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        codedOutputByteBufferNano.a(1, this.f24144c);
        if (this.f24145d != null) {
            codedOutputByteBufferNano.b(2, this.f24145d);
        }
        codedOutputByteBufferNano.b(3, this.f24146e);
        if (this.f24147f != null && this.f24147f.length > 0) {
            for (C0757i c0757i : this.f24147f) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if (this.f24148g != null) {
            codedOutputByteBufferNano.b(5, this.f24148g);
        }
        if ((this.f24143b & 1) != 0) {
            codedOutputByteBufferNano.a(6, this.f24149h);
        }
        if (this.f24150i != null && this.f24150i.length > 0) {
            for (String str : this.f24150i) {
                if (str != null) {
                    codedOutputByteBufferNano.a(8, str);
                }
            }
        }
        if ((this.f24143b & 2) != 0) {
            codedOutputByteBufferNano.a(9, this.f24151j);
        }
        if ((this.f24143b & 4) != 0) {
            codedOutputByteBufferNano.a(10, this.f24152k);
        }
        if ((this.f24143b & 8) != 0) {
            codedOutputByteBufferNano.a(11, this.f24153l);
        }
        if (this.f24154m != null) {
            codedOutputByteBufferNano.b(12, this.f24154m);
        }
        if ((this.f24143b & 16) != 0) {
            codedOutputByteBufferNano.c(13, this.f24155n);
        }
        if (this.f24156o != null && this.f24156o.length > 0) {
            for (String str2 : this.f24156o) {
                if (str2 != null) {
                    codedOutputByteBufferNano.a(15, str2);
                }
            }
        }
        if ((this.f24143b & 32) != 0) {
            codedOutputByteBufferNano.a(16, this.f24157p);
        }
        if (this.f24158q != null) {
            codedOutputByteBufferNano.b(17, this.f24158q);
        }
        if (this.f24159r != null && this.f24159r.length > 0) {
            while (i < this.f24159r.length) {
                String str3 = this.f24159r[i];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(20, str3);
                }
                i++;
            }
        }
        if (this.f24160s != null) {
            codedOutputByteBufferNano.b(21, this.f24160s);
        }
        if ((this.f24143b & 64) != 0) {
            codedOutputByteBufferNano.a(23, this.f24161t);
        }
        if ((this.f24143b & 128) != 0) {
            codedOutputByteBufferNano.a(25, this.f24162u);
        }
        if (this.f24163v != null) {
            codedOutputByteBufferNano.b(29, this.f24163v);
        }
        if (this.f24164w != null) {
            codedOutputByteBufferNano.b(30, this.f24164w);
        }
        if ((this.f24143b & 256) != 0) {
            codedOutputByteBufferNano.a(32, this.f24165x);
        }
        if ((this.f24143b & 512) != 0) {
            codedOutputByteBufferNano.a(34, this.f24166y);
        }
        if ((this.f24143b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(37, this.f24167z);
        }
        if ((this.f24143b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(38, this.f24135A);
        }
        if ((this.f24143b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(41, this.f24136B);
        }
        if ((this.f24143b & 8192) != 0) {
            codedOutputByteBufferNano.a(42, this.f24137C);
        }
        if ((this.f24143b & 16384) != 0) {
            codedOutputByteBufferNano.a(43, this.f24138D);
        }
        if (this.f24139E != null) {
            codedOutputByteBufferNano.b(44, this.f24139E);
        }
        if ((this.f24143b & 32768) != 0) {
            codedOutputByteBufferNano.a(45, this.f24140F);
        }
        if ((this.f24143b & 65536) != 0) {
            codedOutputByteBufferNano.a(46, this.f24141G);
        }
        if ((this.f24143b & 131072) != 0) {
            codedOutputByteBufferNano.a(47, this.f24142H);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo1128b() + CodedOutputByteBufferNano.b(1, this.f24144c);
        if (this.f24145d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f24145d);
        }
        b += CodedOutputByteBufferNano.f(3, this.f24146e);
        if (this.f24147f != null && this.f24147f.length > 0) {
            i = b;
            for (C0757i c0757i : this.f24147f) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if (this.f24148g != null) {
            b += CodedOutputByteBufferNano.d(5, this.f24148g);
        }
        if ((this.f24143b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f24150i != null && this.f24150i.length > 0) {
            i2 = 0;
            i3 = 0;
            for (String str : this.f24150i) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f24143b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f24151j);
        }
        if ((this.f24143b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(10, this.f24152k);
        }
        if ((this.f24143b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(11, this.f24153l);
        }
        if (this.f24154m != null) {
            b += CodedOutputByteBufferNano.d(12, this.f24154m);
        }
        if ((this.f24143b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(13) + 8;
        }
        if (this.f24156o != null && this.f24156o.length > 0) {
            i2 = 0;
            i3 = 0;
            for (String str2 : this.f24156o) {
                if (str2 != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str2);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f24143b & 32) != 0) {
            b += CodedOutputByteBufferNano.b(16, this.f24157p);
        }
        if (this.f24158q != null) {
            b += CodedOutputByteBufferNano.d(17, this.f24158q);
        }
        if (this.f24159r != null && this.f24159r.length > 0) {
            i = 0;
            i2 = 0;
            while (i4 < this.f24159r.length) {
                String str3 = this.f24159r[i4];
                if (str3 != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.b(str3);
                }
                i4++;
            }
            b = (b + i) + (i2 * 2);
        }
        if (this.f24160s != null) {
            b += CodedOutputByteBufferNano.d(21, this.f24160s);
        }
        if ((this.f24143b & 64) != 0) {
            b += CodedOutputByteBufferNano.b(23, this.f24161t);
        }
        if ((this.f24143b & 128) != 0) {
            b += CodedOutputByteBufferNano.d(25) + 1;
        }
        if (this.f24163v != null) {
            b += CodedOutputByteBufferNano.d(29, this.f24163v);
        }
        if (this.f24164w != null) {
            b += CodedOutputByteBufferNano.d(30, this.f24164w);
        }
        if ((this.f24143b & 256) != 0) {
            b += CodedOutputByteBufferNano.b(32, this.f24165x);
        }
        if ((this.f24143b & 512) != 0) {
            b += CodedOutputByteBufferNano.d(34) + 1;
        }
        if ((this.f24143b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.d(37) + 1;
        }
        if ((this.f24143b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.d(38) + 1;
        }
        if ((this.f24143b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.d(41) + 1;
        }
        if ((this.f24143b & 8192) != 0) {
            b += CodedOutputByteBufferNano.d(42) + 1;
        }
        if ((this.f24143b & 16384) != 0) {
            b += CodedOutputByteBufferNano.d(43) + 1;
        }
        if (this.f24139E != null) {
            b += CodedOutputByteBufferNano.d(44, this.f24139E);
        }
        if ((this.f24143b & 32768) != 0) {
            b += CodedOutputByteBufferNano.d(45) + 1;
        }
        if ((this.f24143b & 65536) != 0) {
            b += CodedOutputByteBufferNano.d(46) + 1;
        }
        if ((this.f24143b & 131072) != 0) {
            return b + (CodedOutputByteBufferNano.d(47) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.verifier.p259a.p260a.C4699c m21876b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 24: goto L_0x0027;
            case 34: goto L_0x002e;
            case 42: goto L_0x006d;
            case 48: goto L_0x007e;
            case 66: goto L_0x008c;
            case 74: goto L_0x00c0;
            case 80: goto L_0x00ce;
            case 90: goto L_0x010d;
            case 98: goto L_0x011b;
            case 105: goto L_0x012d;
            case 122: goto L_0x013b;
            case 130: goto L_0x016f;
            case 138: goto L_0x017d;
            case 162: goto L_0x018f;
            case 170: goto L_0x01c3;
            case 186: goto L_0x01d5;
            case 200: goto L_0x01e3;
            case 234: goto L_0x01f1;
            case 242: goto L_0x0203;
            case 258: goto L_0x0215;
            case 272: goto L_0x0223;
            case 296: goto L_0x0231;
            case 304: goto L_0x023f;
            case 328: goto L_0x024d;
            case 336: goto L_0x025b;
            case 344: goto L_0x0269;
            case 354: goto L_0x0277;
            case 360: goto L_0x0289;
            case 368: goto L_0x0299;
            case 376: goto L_0x02a8;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f24144c = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r7.f24145d;
        if (r0 != 0) goto L_0x0021;
    L_0x001a:
        r0 = new com.google.android.finsky.verifier.a.a.h;
        r0.<init>();
        r7.f24145d = r0;
    L_0x0021:
        r0 = r7.f24145d;
        r8.a(r0);
        goto L_0x0001;
    L_0x0027:
        r2 = r8.j();
        r7.f24146e = r2;
        goto L_0x0001;
    L_0x002e:
        r0 = 34;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f24147f;
        if (r0 != 0) goto L_0x005a;
    L_0x0038:
        r0 = r1;
    L_0x0039:
        r2 = r2 + r0;
        r2 = new com.google.android.finsky.verifier.p259a.p260a.C4709m[r2];
        if (r0 == 0) goto L_0x0043;
    L_0x003e:
        r3 = r7.f24147f;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0043:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x005e;
    L_0x0048:
        r3 = new com.google.android.finsky.verifier.a.a.m;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0043;
    L_0x005a:
        r0 = r7.f24147f;
        r0 = r0.length;
        goto L_0x0039;
    L_0x005e:
        r3 = new com.google.android.finsky.verifier.a.a.m;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f24147f = r2;
        goto L_0x0001;
    L_0x006d:
        r0 = r7.f24148g;
        if (r0 != 0) goto L_0x0078;
    L_0x0071:
        r0 = new com.google.android.finsky.verifier.a.a.n;
        r0.<init>();
        r7.f24148g = r0;
    L_0x0078:
        r0 = r7.f24148g;
        r8.a(r0);
        goto L_0x0001;
    L_0x007e:
        r0 = r8.e();
        r7.f24149h = r0;
        r0 = r7.f24143b;
        r0 = r0 | 1;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x008c:
        r0 = 66;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f24150i;
        if (r0 != 0) goto L_0x00b2;
    L_0x0096:
        r0 = r1;
    L_0x0097:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x00a1;
    L_0x009c:
        r3 = r7.f24150i;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00a1:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00b6;
    L_0x00a6:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x00a1;
    L_0x00b2:
        r0 = r7.f24150i;
        r0 = r0.length;
        goto L_0x0097;
    L_0x00b6:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f24150i = r2;
        goto L_0x0001;
    L_0x00c0:
        r0 = r8.f();
        r7.f24151j = r0;
        r0 = r7.f24143b;
        r0 = r0 | 2;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x00ce:
        r2 = r7.f24143b;
        r2 = r2 | 4;
        r7.f24143b = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00fa }
        switch(r3) {
            case 0: goto L_0x0103;
            case 1: goto L_0x00df;
            case 2: goto L_0x0103;
            default: goto L_0x00df;
        };	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00df:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r5 = 44;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00fa }
        r5 = " is not a valid enum DownloadType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00fa }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00fa }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00fa:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0103:
        r7.f24152k = r3;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r7.f24143b;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r3 | 4;
        r7.f24143b = r3;	 Catch:{ IllegalArgumentException -> 0x00fa }
        goto L_0x0001;
    L_0x010d:
        r0 = r8.f();
        r7.f24153l = r0;
        r0 = r7.f24143b;
        r0 = r0 | 8;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x011b:
        r0 = r7.f24154m;
        if (r0 != 0) goto L_0x0126;
    L_0x011f:
        r0 = new com.google.android.finsky.verifier.a.a.d;
        r0.<init>();
        r7.f24154m = r0;
    L_0x0126:
        r0 = r7.f24154m;
        r8.a(r0);
        goto L_0x0001;
    L_0x012d:
        r2 = r8.l();
        r7.f24155n = r2;
        r0 = r7.f24143b;
        r0 = r0 | 16;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x013b:
        r0 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f24156o;
        if (r0 != 0) goto L_0x0161;
    L_0x0145:
        r0 = r1;
    L_0x0146:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0150;
    L_0x014b:
        r3 = r7.f24156o;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0150:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0165;
    L_0x0155:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0150;
    L_0x0161:
        r0 = r7.f24156o;
        r0 = r0.length;
        goto L_0x0146;
    L_0x0165:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f24156o = r2;
        goto L_0x0001;
    L_0x016f:
        r0 = r8.g();
        r7.f24157p = r0;
        r0 = r7.f24143b;
        r0 = r0 | 32;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x017d:
        r0 = r7.f24158q;
        if (r0 != 0) goto L_0x0188;
    L_0x0181:
        r0 = new com.google.android.finsky.verifier.a.a.n;
        r0.<init>();
        r7.f24158q = r0;
    L_0x0188:
        r0 = r7.f24158q;
        r8.a(r0);
        goto L_0x0001;
    L_0x018f:
        r0 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f24159r;
        if (r0 != 0) goto L_0x01b5;
    L_0x0199:
        r0 = r1;
    L_0x019a:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x01a4;
    L_0x019f:
        r3 = r7.f24159r;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x01a4:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01b9;
    L_0x01a9:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x01a4;
    L_0x01b5:
        r0 = r7.f24159r;
        r0 = r0.length;
        goto L_0x019a;
    L_0x01b9:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f24159r = r2;
        goto L_0x0001;
    L_0x01c3:
        r0 = r7.f24160s;
        if (r0 != 0) goto L_0x01ce;
    L_0x01c7:
        r0 = new com.google.android.finsky.verifier.a.a.n;
        r0.<init>();
        r7.f24160s = r0;
    L_0x01ce:
        r0 = r7.f24160s;
        r8.a(r0);
        goto L_0x0001;
    L_0x01d5:
        r0 = r8.f();
        r7.f24161t = r0;
        r0 = r7.f24143b;
        r0 = r0 | 64;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x01e3:
        r0 = r8.e();
        r7.f24162u = r0;
        r0 = r7.f24143b;
        r0 = r0 | 128;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x01f1:
        r0 = r7.f24163v;
        if (r0 != 0) goto L_0x01fc;
    L_0x01f5:
        r0 = new com.google.android.finsky.verifier.a.a.j;
        r0.<init>();
        r7.f24163v = r0;
    L_0x01fc:
        r0 = r7.f24163v;
        r8.a(r0);
        goto L_0x0001;
    L_0x0203:
        r0 = r7.f24164w;
        if (r0 != 0) goto L_0x020e;
    L_0x0207:
        r0 = new com.google.android.finsky.verifier.a.a.j;
        r0.<init>();
        r7.f24164w = r0;
    L_0x020e:
        r0 = r7.f24164w;
        r8.a(r0);
        goto L_0x0001;
    L_0x0215:
        r0 = r8.f();
        r7.f24165x = r0;
        r0 = r7.f24143b;
        r0 = r0 | 256;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x0223:
        r0 = r8.e();
        r7.f24166y = r0;
        r0 = r7.f24143b;
        r0 = r0 | 512;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x0231:
        r0 = r8.e();
        r7.f24167z = r0;
        r0 = r7.f24143b;
        r0 = r0 | 1024;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x023f:
        r0 = r8.e();
        r7.f24135A = r0;
        r0 = r7.f24143b;
        r0 = r0 | 2048;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x024d:
        r0 = r8.e();
        r7.f24136B = r0;
        r0 = r7.f24143b;
        r0 = r0 | 4096;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x025b:
        r0 = r8.e();
        r7.f24137C = r0;
        r0 = r7.f24143b;
        r0 = r0 | 8192;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x0269:
        r0 = r8.e();
        r7.f24138D = r0;
        r0 = r7.f24143b;
        r0 = r0 | 16384;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x0277:
        r0 = r7.f24139E;
        if (r0 != 0) goto L_0x0282;
    L_0x027b:
        r0 = new com.google.android.finsky.verifier.a.a.l;
        r0.<init>();
        r7.f24139E = r0;
    L_0x0282:
        r0 = r7.f24139E;
        r8.a(r0);
        goto L_0x0001;
    L_0x0289:
        r0 = r8.e();
        r7.f24140F = r0;
        r0 = r7.f24143b;
        r2 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r2;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x0299:
        r0 = r8.e();
        r7.f24141G = r0;
        r0 = r7.f24143b;
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r2;
        r7.f24143b = r0;
        goto L_0x0001;
    L_0x02a8:
        r0 = r8.e();
        r7.f24142H = r0;
        r0 = r7.f24143b;
        r2 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r2;
        r7.f24143b = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.a.a.c.b(com.google.protobuf.nano.a):com.google.android.finsky.verifier.a.a.c");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m21876b(aVar);
    }
}
