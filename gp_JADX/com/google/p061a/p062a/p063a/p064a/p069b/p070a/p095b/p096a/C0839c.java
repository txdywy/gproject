package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0839c extends C0758b {
    public static volatile C0839c[] f5425b;
    public int f5426a;
    public int f5427c;
    public C0840d f5428d;
    public C0842f f5429e;
    public long f5430f;
    public String f5431g;
    public ad f5432h;
    public aj f5433i;
    public long[] f5434j;
    public int f5435k;
    public int f5436l;
    public int f5437m;
    public C0841e f5438n;
    public C0839c[] f5439o;

    public static C0839c[] m5355a() {
        if (f5425b == null) {
            synchronized (h.b) {
                if (f5425b == null) {
                    f5425b = new C0839c[0];
                }
            }
        }
        return f5425b;
    }

    public C0839c() {
        this.f5426a = -1;
        this.f5427c = 0;
        this.f5426a = -1;
        this.f5428d = null;
        this.f5426a = -1;
        this.f5429e = null;
        this.f5430f = 0;
        this.f5431g = "";
        this.f5432h = null;
        this.f5433i = null;
        this.f5434j = l.f;
        this.f5435k = -1;
        this.f5436l = -1;
        this.f5437m = 0;
        this.f5438n = null;
        this.f5439o = C0839c.m5355a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f5431g == null || this.f5431g.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5431g);
        }
        if (this.f5432h != null) {
            codedOutputByteBufferNano.b(2, this.f5432h);
        }
        if (this.f5433i != null) {
            codedOutputByteBufferNano.b(3, this.f5433i);
        }
        if (this.f5434j != null && this.f5434j.length > 0) {
            for (long b : this.f5434j) {
                codedOutputByteBufferNano.b(5, b);
            }
        }
        if (this.f5437m != 0) {
            codedOutputByteBufferNano.a(7, this.f5437m);
        }
        if (this.f5427c != 0) {
            codedOutputByteBufferNano.a(8, this.f5427c);
        }
        if (this.f5435k != -1) {
            codedOutputByteBufferNano.a(9, this.f5435k);
        }
        if (this.f5436l != -1) {
            codedOutputByteBufferNano.a(10, this.f5436l);
        }
        if (this.f5439o != null && this.f5439o.length > 0) {
            while (i < this.f5439o.length) {
                C0757i c0757i = this.f5439o[i];
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(11, c0757i);
                }
                i++;
            }
        }
        if (this.f5430f != 0) {
            codedOutputByteBufferNano.b(13, this.f5430f);
        }
        if (this.f5438n != null) {
            codedOutputByteBufferNano.b(14, this.f5438n);
        }
        if (this.f5426a == 0) {
            codedOutputByteBufferNano.b(16, this.f5428d);
        }
        if (this.f5426a == 1) {
            codedOutputByteBufferNano.b(17, this.f5429e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (!(this.f5431g == null || this.f5431g.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5431g);
        }
        if (this.f5432h != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5432h);
        }
        if (this.f5433i != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5433i);
        }
        if (this.f5434j != null && this.f5434j.length > 0) {
            int i2 = 0;
            for (long c : this.f5434j) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i2) + (this.f5434j.length * 1);
        }
        if (this.f5437m != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f5437m);
        }
        if (this.f5427c != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f5427c);
        }
        if (this.f5435k != -1) {
            b += CodedOutputByteBufferNano.d(9, this.f5435k);
        }
        if (this.f5436l != -1) {
            b += CodedOutputByteBufferNano.d(10, this.f5436l);
        }
        if (this.f5439o != null && this.f5439o.length > 0) {
            while (i < this.f5439o.length) {
                C0757i c0757i = this.f5439o[i];
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(11, c0757i);
                }
                i++;
            }
        }
        if (this.f5430f != 0) {
            b += CodedOutputByteBufferNano.f(13, this.f5430f);
        }
        if (this.f5438n != null) {
            b += CodedOutputByteBufferNano.d(14, this.f5438n);
        }
        if (this.f5426a == 0) {
            b += CodedOutputByteBufferNano.d(16, this.f5428d);
        }
        if (this.f5426a == 1) {
            return b + CodedOutputByteBufferNano.d(17, this.f5429e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0839c m5356b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 26: goto L_0x0027;
            case 40: goto L_0x0038;
            case 42: goto L_0x006b;
            case 56: goto L_0x00ad;
            case 64: goto L_0x00c6;
            case 72: goto L_0x00f9;
            case 80: goto L_0x0101;
            case 90: goto L_0x0109;
            case 104: goto L_0x0149;
            case 114: goto L_0x0151;
            case 130: goto L_0x0163;
            case 138: goto L_0x0177;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f5431g = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r7.f5432h;
        if (r0 != 0) goto L_0x0021;
    L_0x001a:
        r0 = new com.google.a.a.a.a.b.a.b.a.ad;
        r0.<init>();
        r7.f5432h = r0;
    L_0x0021:
        r0 = r7.f5432h;
        r8.a(r0);
        goto L_0x0001;
    L_0x0027:
        r0 = r7.f5433i;
        if (r0 != 0) goto L_0x0032;
    L_0x002b:
        r0 = new com.google.a.a.a.a.b.a.b.a.aj;
        r0.<init>();
        r7.f5433i = r0;
    L_0x0032:
        r0 = r7.f5433i;
        r8.a(r0);
        goto L_0x0001;
    L_0x0038:
        r0 = 40;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5434j;
        if (r0 != 0) goto L_0x005e;
    L_0x0042:
        r0 = r1;
    L_0x0043:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x004d;
    L_0x0048:
        r3 = r7.f5434j;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x004d:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0062;
    L_0x0052:
        r4 = r8.j();
        r2[r0] = r4;
        r8.a();
        r0 = r0 + 1;
        goto L_0x004d;
    L_0x005e:
        r0 = r7.f5434j;
        r0 = r0.length;
        goto L_0x0043;
    L_0x0062:
        r4 = r8.j();
        r2[r0] = r4;
        r7.f5434j = r2;
        goto L_0x0001;
    L_0x006b:
        r0 = r8.i();
        r3 = r8.c(r0);
        r2 = r8.o();
        r0 = r1;
    L_0x0078:
        r4 = r8.m();
        if (r4 <= 0) goto L_0x0084;
    L_0x007e:
        r8.j();
        r0 = r0 + 1;
        goto L_0x0078;
    L_0x0084:
        r8.e(r2);
        r2 = r7.f5434j;
        if (r2 != 0) goto L_0x00a2;
    L_0x008b:
        r2 = r1;
    L_0x008c:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x0096;
    L_0x0091:
        r4 = r7.f5434j;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0096:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00a6;
    L_0x0099:
        r4 = r8.j();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x0096;
    L_0x00a2:
        r2 = r7.f5434j;
        r2 = r2.length;
        goto L_0x008c;
    L_0x00a6:
        r7.f5434j = r0;
        r8.d(r3);
        goto L_0x0001;
    L_0x00ad:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00bd }
        r3 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.au.m5353a(r3);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r7.f5437m = r3;	 Catch:{ IllegalArgumentException -> 0x00bd }
        goto L_0x0001;
    L_0x00bd:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00c6:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00ec }
        switch(r3) {
            case 0: goto L_0x00f5;
            case 1: goto L_0x00f5;
            case 2: goto L_0x00d1;
            case 3: goto L_0x00f5;
            case 4: goto L_0x00f5;
            case 5: goto L_0x00f5;
            case 6: goto L_0x00f5;
            case 7: goto L_0x00d1;
            case 8: goto L_0x00f5;
            default: goto L_0x00d1;
        };	 Catch:{ IllegalArgumentException -> 0x00ec }
    L_0x00d1:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r5 = 38;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00ec }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ec }
        r5 = " is not a valid enum UiType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ec }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00ec }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00ec }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00ec }
    L_0x00ec:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00f5:
        r7.f5427c = r3;	 Catch:{ IllegalArgumentException -> 0x00ec }
        goto L_0x0001;
    L_0x00f9:
        r0 = r8.i();
        r7.f5435k = r0;
        goto L_0x0001;
    L_0x0101:
        r0 = r8.i();
        r7.f5436l = r0;
        goto L_0x0001;
    L_0x0109:
        r0 = 90;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5439o;
        if (r0 != 0) goto L_0x0135;
    L_0x0113:
        r0 = r1;
    L_0x0114:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0839c[r2];
        if (r0 == 0) goto L_0x011e;
    L_0x0119:
        r3 = r7.f5439o;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x011e:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0139;
    L_0x0123:
        r3 = new com.google.a.a.a.a.b.a.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x011e;
    L_0x0135:
        r0 = r7.f5439o;
        r0 = r0.length;
        goto L_0x0114;
    L_0x0139:
        r3 = new com.google.a.a.a.a.b.a.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5439o = r2;
        goto L_0x0001;
    L_0x0149:
        r2 = r8.j();
        r7.f5430f = r2;
        goto L_0x0001;
    L_0x0151:
        r0 = r7.f5438n;
        if (r0 != 0) goto L_0x015c;
    L_0x0155:
        r0 = new com.google.a.a.a.a.b.a.b.a.e;
        r0.<init>();
        r7.f5438n = r0;
    L_0x015c:
        r0 = r7.f5438n;
        r8.a(r0);
        goto L_0x0001;
    L_0x0163:
        r0 = r7.f5428d;
        if (r0 != 0) goto L_0x016e;
    L_0x0167:
        r0 = new com.google.a.a.a.a.b.a.b.a.d;
        r0.<init>();
        r7.f5428d = r0;
    L_0x016e:
        r0 = r7.f5428d;
        r8.a(r0);
        r7.f5426a = r1;
        goto L_0x0001;
    L_0x0177:
        r0 = r7.f5429e;
        if (r0 != 0) goto L_0x0182;
    L_0x017b:
        r0 = new com.google.a.a.a.a.b.a.b.a.f;
        r0.<init>();
        r7.f5429e = r0;
    L_0x0182:
        r0 = r7.f5429e;
        r8.a(r0);
        r0 = 1;
        r7.f5426a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.c.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.c");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5356b(aVar);
    }
}
