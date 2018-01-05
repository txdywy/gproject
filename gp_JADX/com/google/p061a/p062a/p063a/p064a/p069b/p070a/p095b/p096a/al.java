package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class al extends C0758b {
    public static volatile al[] f5347b;
    public int f5348a;
    public String f5349c;
    public long f5350d;
    public boolean f5351e;
    public boolean f5352f;
    public boolean f5353g;
    public String f5354h;
    public String f5355i;
    public aj f5356j;
    public ad[] f5357k;
    public int f5358l;
    public byte[] f5359m;
    public int f5360n;
    public boolean f5361o;
    public int f5362p;
    public ar f5363q;
    public ap f5364r;
    public am f5365s;
    public ao f5366t;
    public an f5367u;

    public static al[] m5297a() {
        if (f5347b == null) {
            synchronized (h.b) {
                if (f5347b == null) {
                    f5347b = new al[0];
                }
            }
        }
        return f5347b;
    }

    public final ar m5303c() {
        if (this.f5348a == 0) {
            return this.f5363q;
        }
        return null;
    }

    public final ap m5304d() {
        if (this.f5348a == 1) {
            return this.f5364r;
        }
        return null;
    }

    public final am m5305e() {
        if (this.f5348a == 2) {
            return this.f5365s;
        }
        return null;
    }

    public final ao m5306f() {
        if (this.f5348a == 3) {
            return this.f5366t;
        }
        return null;
    }

    public final an m5307g() {
        if (this.f5348a == 4) {
            return this.f5367u;
        }
        return null;
    }

    public final al m5299a(an anVar) {
        this.f5348a = -1;
        this.f5348a = 4;
        this.f5367u = anVar;
        return this;
    }

    public al() {
        this.f5348a = -1;
        this.f5349c = "";
        this.f5350d = 0;
        this.f5351e = false;
        this.f5352f = false;
        this.f5353g = false;
        this.f5354h = "";
        this.f5355i = "";
        this.f5356j = null;
        this.f5357k = ad.m5268a();
        this.f5358l = 1;
        this.f5359m = l.l;
        this.f5360n = 0;
        this.f5361o = false;
        this.f5362p = 0;
        this.f5348a = -1;
        this.f5363q = null;
        this.f5348a = -1;
        this.f5364r = null;
        this.f5348a = -1;
        this.f5365s = null;
        this.f5348a = -1;
        this.f5366t = null;
        this.f5348a = -1;
        this.f5367u = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5349c == null || this.f5349c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5349c);
        }
        if (this.f5351e) {
            codedOutputByteBufferNano.a(2, this.f5351e);
        }
        if (this.f5352f) {
            codedOutputByteBufferNano.a(3, this.f5352f);
        }
        if (!(this.f5354h == null || this.f5354h.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5354h);
        }
        if (this.f5348a == 0) {
            codedOutputByteBufferNano.b(6, this.f5363q);
        }
        if (this.f5348a == 1) {
            codedOutputByteBufferNano.b(7, this.f5364r);
        }
        if (this.f5357k != null && this.f5357k.length > 0) {
            for (C0757i c0757i : this.f5357k) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(8, c0757i);
                }
            }
        }
        if (this.f5356j != null) {
            codedOutputByteBufferNano.b(9, this.f5356j);
        }
        if (this.f5348a == 2) {
            codedOutputByteBufferNano.b(10, this.f5365s);
        }
        if (this.f5353g) {
            codedOutputByteBufferNano.a(11, this.f5353g);
        }
        if (this.f5348a == 3) {
            codedOutputByteBufferNano.b(13, this.f5366t);
        }
        if (!Arrays.equals(this.f5359m, l.l)) {
            codedOutputByteBufferNano.a(14, this.f5359m);
        }
        if (this.f5350d != 0) {
            codedOutputByteBufferNano.b(15, this.f5350d);
        }
        if (this.f5348a == 4) {
            codedOutputByteBufferNano.b(16, this.f5367u);
        }
        if (this.f5360n != 0) {
            codedOutputByteBufferNano.a(17, this.f5360n);
        }
        if (this.f5362p != 0) {
            codedOutputByteBufferNano.a(18, this.f5362p);
        }
        if (this.f5361o) {
            codedOutputByteBufferNano.a(20, this.f5361o);
        }
        if (!(this.f5355i == null || this.f5355i.equals(""))) {
            codedOutputByteBufferNano.a(22, this.f5355i);
        }
        if (this.f5358l != 1) {
            codedOutputByteBufferNano.a(23, this.f5358l);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5349c == null || this.f5349c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5349c);
        }
        if (this.f5351e) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (this.f5352f) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if (!(this.f5354h == null || this.f5354h.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5354h);
        }
        if (this.f5348a == 0) {
            b += CodedOutputByteBufferNano.d(6, this.f5363q);
        }
        if (this.f5348a == 1) {
            b += CodedOutputByteBufferNano.d(7, this.f5364r);
        }
        if (this.f5357k != null && this.f5357k.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5357k) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(8, c0757i);
                }
            }
            b = i;
        }
        if (this.f5356j != null) {
            b += CodedOutputByteBufferNano.d(9, this.f5356j);
        }
        if (this.f5348a == 2) {
            b += CodedOutputByteBufferNano.d(10, this.f5365s);
        }
        if (this.f5353g) {
            b += CodedOutputByteBufferNano.d(11) + 1;
        }
        if (this.f5348a == 3) {
            b += CodedOutputByteBufferNano.d(13, this.f5366t);
        }
        if (!Arrays.equals(this.f5359m, l.l)) {
            b += CodedOutputByteBufferNano.b(14, this.f5359m);
        }
        if (this.f5350d != 0) {
            b += CodedOutputByteBufferNano.f(15, this.f5350d);
        }
        if (this.f5348a == 4) {
            b += CodedOutputByteBufferNano.d(16, this.f5367u);
        }
        if (this.f5360n != 0) {
            b += CodedOutputByteBufferNano.d(17, this.f5360n);
        }
        if (this.f5362p != 0) {
            b += CodedOutputByteBufferNano.d(18, this.f5362p);
        }
        if (this.f5361o) {
            b += CodedOutputByteBufferNano.d(20) + 1;
        }
        if (!(this.f5355i == null || this.f5355i.equals(""))) {
            b += CodedOutputByteBufferNano.b(22, this.f5355i);
        }
        if (this.f5358l != 1) {
            return b + CodedOutputByteBufferNano.d(23, this.f5358l);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al m5298b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 16: goto L_0x0016;
            case 24: goto L_0x001d;
            case 34: goto L_0x0024;
            case 50: goto L_0x002b;
            case 58: goto L_0x003e;
            case 66: goto L_0x0052;
            case 74: goto L_0x0092;
            case 82: goto L_0x00a4;
            case 88: goto L_0x00b9;
            case 106: goto L_0x00c1;
            case 114: goto L_0x00d6;
            case 120: goto L_0x00de;
            case 130: goto L_0x00e6;
            case 136: goto L_0x00fb;
            case 144: goto L_0x0114;
            case 160: goto L_0x0147;
            case 178: goto L_0x014f;
            case 184: goto L_0x0157;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f5349c = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r8.e();
        r7.f5351e = r0;
        goto L_0x0001;
    L_0x001d:
        r0 = r8.e();
        r7.f5352f = r0;
        goto L_0x0001;
    L_0x0024:
        r0 = r8.f();
        r7.f5354h = r0;
        goto L_0x0001;
    L_0x002b:
        r0 = r7.f5363q;
        if (r0 != 0) goto L_0x0036;
    L_0x002f:
        r0 = new com.google.a.a.a.a.b.a.b.a.ar;
        r0.<init>();
        r7.f5363q = r0;
    L_0x0036:
        r0 = r7.f5363q;
        r8.a(r0);
        r7.f5348a = r1;
        goto L_0x0001;
    L_0x003e:
        r0 = r7.f5364r;
        if (r0 != 0) goto L_0x0049;
    L_0x0042:
        r0 = new com.google.a.a.a.a.b.a.b.a.ap;
        r0.<init>();
        r7.f5364r = r0;
    L_0x0049:
        r0 = r7.f5364r;
        r8.a(r0);
        r0 = 1;
        r7.f5348a = r0;
        goto L_0x0001;
    L_0x0052:
        r0 = 66;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5357k;
        if (r0 != 0) goto L_0x007e;
    L_0x005c:
        r0 = r1;
    L_0x005d:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad[r2];
        if (r0 == 0) goto L_0x0067;
    L_0x0062:
        r3 = r7.f5357k;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0067:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0082;
    L_0x006c:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0067;
    L_0x007e:
        r0 = r7.f5357k;
        r0 = r0.length;
        goto L_0x005d;
    L_0x0082:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5357k = r2;
        goto L_0x0001;
    L_0x0092:
        r0 = r7.f5356j;
        if (r0 != 0) goto L_0x009d;
    L_0x0096:
        r0 = new com.google.a.a.a.a.b.a.b.a.aj;
        r0.<init>();
        r7.f5356j = r0;
    L_0x009d:
        r0 = r7.f5356j;
        r8.a(r0);
        goto L_0x0001;
    L_0x00a4:
        r0 = r7.f5365s;
        if (r0 != 0) goto L_0x00af;
    L_0x00a8:
        r0 = new com.google.a.a.a.a.b.a.b.a.am;
        r0.<init>();
        r7.f5365s = r0;
    L_0x00af:
        r0 = r7.f5365s;
        r8.a(r0);
        r0 = 2;
        r7.f5348a = r0;
        goto L_0x0001;
    L_0x00b9:
        r0 = r8.e();
        r7.f5353g = r0;
        goto L_0x0001;
    L_0x00c1:
        r0 = r7.f5366t;
        if (r0 != 0) goto L_0x00cc;
    L_0x00c5:
        r0 = new com.google.a.a.a.a.b.a.b.a.ao;
        r0.<init>();
        r7.f5366t = r0;
    L_0x00cc:
        r0 = r7.f5366t;
        r8.a(r0);
        r0 = 3;
        r7.f5348a = r0;
        goto L_0x0001;
    L_0x00d6:
        r0 = r8.g();
        r7.f5359m = r0;
        goto L_0x0001;
    L_0x00de:
        r2 = r8.j();
        r7.f5350d = r2;
        goto L_0x0001;
    L_0x00e6:
        r0 = r7.f5367u;
        if (r0 != 0) goto L_0x00f1;
    L_0x00ea:
        r0 = new com.google.a.a.a.a.b.a.b.a.an;
        r0.<init>();
        r7.f5367u = r0;
    L_0x00f1:
        r0 = r7.f5367u;
        r8.a(r0);
        r0 = 4;
        r7.f5348a = r0;
        goto L_0x0001;
    L_0x00fb:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x010b }
        r3 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.au.m5353a(r3);	 Catch:{ IllegalArgumentException -> 0x010b }
        r7.f5360n = r3;	 Catch:{ IllegalArgumentException -> 0x010b }
        goto L_0x0001;
    L_0x010b:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0114:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x013a }
        switch(r3) {
            case 0: goto L_0x0143;
            case 1: goto L_0x0143;
            case 2: goto L_0x0143;
            case 3: goto L_0x0143;
            case 4: goto L_0x0143;
            case 5: goto L_0x0143;
            default: goto L_0x011f;
        };	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x011f:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x013a }
        r5 = 44;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x013a }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x013a }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x013a }
        r5 = " is not a valid enum SemanticHint";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x013a }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x013a }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x013a }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x013a:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0143:
        r7.f5362p = r3;	 Catch:{ IllegalArgumentException -> 0x013a }
        goto L_0x0001;
    L_0x0147:
        r0 = r8.e();
        r7.f5361o = r0;
        goto L_0x0001;
    L_0x014f:
        r0 = r8.f();
        r7.f5355i = r0;
        goto L_0x0001;
    L_0x0157:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x017d }
        switch(r3) {
            case 0: goto L_0x0186;
            case 1: goto L_0x0186;
            case 2: goto L_0x0186;
            default: goto L_0x0162;
        };	 Catch:{ IllegalArgumentException -> 0x017d }
    L_0x0162:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x017d }
        r5 = 48;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x017d }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x017d }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x017d }
        r5 = " is not a valid enum ImageDisplayType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x017d }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x017d }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x017d }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x017d }
    L_0x017d:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0186:
        r7.f5358l = r3;	 Catch:{ IllegalArgumentException -> 0x017d }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.al.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.al");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5298b(aVar);
    }
}
