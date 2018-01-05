package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0827c extends C0758b {
    public static volatile C0827c[] f5247a;
    public int f5248b;
    public String f5249c;
    public int f5250d;
    public String f5251e;
    public String f5252f;
    public String[] f5253g;
    public C0825a[] f5254h;
    public String[] f5255i;
    public String f5256j;
    public boolean f5257k;

    public static C0827c[] m5219a() {
        if (f5247a == null) {
            synchronized (h.b) {
                if (f5247a == null) {
                    f5247a = new C0827c[0];
                }
            }
        }
        return f5247a;
    }

    public C0827c() {
        this.f5248b = 0;
        this.f5249c = "";
        this.f5250d = -1;
        this.f5251e = "";
        this.f5252f = "";
        this.f5253g = l.j;
        this.f5254h = C0825a.m5209a();
        this.f5255i = l.j;
        this.f5256j = "";
        this.f5257k = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f5249c == null || this.f5249c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5249c);
        }
        if (this.f5250d != -1) {
            codedOutputByteBufferNano.a(2, this.f5250d);
        }
        if (!(this.f5251e == null || this.f5251e.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5251e);
        }
        if (!(this.f5252f == null || this.f5252f.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5252f);
        }
        if (this.f5253g != null && this.f5253g.length > 0) {
            for (String str : this.f5253g) {
                if (str != null) {
                    codedOutputByteBufferNano.a(5, str);
                }
            }
        }
        if (this.f5248b != 0) {
            codedOutputByteBufferNano.a(6, this.f5248b);
        }
        if (this.f5254h != null && this.f5254h.length > 0) {
            for (C0757i c0757i : this.f5254h) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(7, c0757i);
                }
            }
        }
        if (this.f5255i != null && this.f5255i.length > 0) {
            while (i < this.f5255i.length) {
                String str2 = this.f5255i[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(8, str2);
                }
                i++;
            }
        }
        if (!(this.f5256j == null || this.f5256j.equals(""))) {
            codedOutputByteBufferNano.a(9, this.f5256j);
        }
        if (this.f5257k) {
            codedOutputByteBufferNano.a(10, this.f5257k);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if (!(this.f5249c == null || this.f5249c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5249c);
        }
        if (this.f5250d != -1) {
            b += CodedOutputByteBufferNano.d(2, this.f5250d);
        }
        if (!(this.f5251e == null || this.f5251e.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5251e);
        }
        if (!(this.f5252f == null || this.f5252f.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5252f);
        }
        if (this.f5253g != null && this.f5253g.length > 0) {
            i = 0;
            int i4 = 0;
            for (String str : this.f5253g) {
                if (str != null) {
                    i4++;
                    i += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i) + (i4 * 1);
        }
        if (this.f5248b != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f5248b);
        }
        if (this.f5254h != null && this.f5254h.length > 0) {
            i2 = b;
            for (C0757i c0757i : this.f5254h) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(7, c0757i);
                }
            }
            b = i2;
        }
        if (this.f5255i != null && this.f5255i.length > 0) {
            i2 = 0;
            i = 0;
            while (i3 < this.f5255i.length) {
                String str2 = this.f5255i[i3];
                if (str2 != null) {
                    i++;
                    i2 += CodedOutputByteBufferNano.b(str2);
                }
                i3++;
            }
            b = (b + i2) + (i * 1);
        }
        if (!(this.f5256j == null || this.f5256j.equals(""))) {
            b += CodedOutputByteBufferNano.b(9, this.f5256j);
        }
        if (this.f5257k) {
            return b + (CodedOutputByteBufferNano.d(10) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a.C0827c m5220b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 16: goto L_0x0016;
            case 26: goto L_0x001d;
            case 34: goto L_0x0024;
            case 42: goto L_0x002b;
            case 48: goto L_0x005e;
            case 58: goto L_0x0091;
            case 66: goto L_0x00d1;
            case 74: goto L_0x0105;
            case 80: goto L_0x010d;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f5249c = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r8.i();
        r7.f5250d = r0;
        goto L_0x0001;
    L_0x001d:
        r0 = r8.f();
        r7.f5251e = r0;
        goto L_0x0001;
    L_0x0024:
        r0 = r8.f();
        r7.f5252f = r0;
        goto L_0x0001;
    L_0x002b:
        r0 = 42;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5253g;
        if (r0 != 0) goto L_0x0051;
    L_0x0035:
        r0 = r1;
    L_0x0036:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0040;
    L_0x003b:
        r3 = r7.f5253g;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0040:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0055;
    L_0x0045:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0040;
    L_0x0051:
        r0 = r7.f5253g;
        r0 = r0.length;
        goto L_0x0036;
    L_0x0055:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f5253g = r2;
        goto L_0x0001;
    L_0x005e:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0084 }
        switch(r3) {
            case 0: goto L_0x008d;
            case 1: goto L_0x008d;
            case 2: goto L_0x008d;
            default: goto L_0x0069;
        };	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0069:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r5 = 47;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r5 = " is not a valid enum AppRedirectType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0084 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0084 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0084:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x008d:
        r7.f5248b = r3;	 Catch:{ IllegalArgumentException -> 0x0084 }
        goto L_0x0001;
    L_0x0091:
        r0 = 58;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5254h;
        if (r0 != 0) goto L_0x00bd;
    L_0x009b:
        r0 = r1;
    L_0x009c:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a.C0825a[r2];
        if (r0 == 0) goto L_0x00a6;
    L_0x00a1:
        r3 = r7.f5254h;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00a6:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00c1;
    L_0x00ab:
        r3 = new com.google.a.a.a.a.b.a.a.h.a.a;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x00a6;
    L_0x00bd:
        r0 = r7.f5254h;
        r0 = r0.length;
        goto L_0x009c;
    L_0x00c1:
        r3 = new com.google.a.a.a.a.b.a.a.h.a.a;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5254h = r2;
        goto L_0x0001;
    L_0x00d1:
        r0 = 66;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5255i;
        if (r0 != 0) goto L_0x00f7;
    L_0x00db:
        r0 = r1;
    L_0x00dc:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x00e6;
    L_0x00e1:
        r3 = r7.f5255i;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00e6:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00fb;
    L_0x00eb:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x00e6;
    L_0x00f7:
        r0 = r7.f5255i;
        r0 = r0.length;
        goto L_0x00dc;
    L_0x00fb:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f5255i = r2;
        goto L_0x0001;
    L_0x0105:
        r0 = r8.f();
        r7.f5256j = r0;
        goto L_0x0001;
    L_0x010d:
        r0 = r8.e();
        r7.f5257k = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.h.a.c.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.h.a.c");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5220b(aVar);
    }
}
