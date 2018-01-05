package com.google.android.finsky.splitinstallservice.p245a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4196a extends C0758b {
    public int f21136a;
    public int f21137b;
    public String f21138c;
    public int f21139d;
    public int f21140e;
    public String[] f21141f;
    public int f21142g;
    public int f21143h;
    public long f21144i;
    public long f21145j;
    public long f21146k;
    public int f21147l;
    public String[] f21148m;

    public final C4196a m19536a(int i) {
        this.f21136a |= 16;
        this.f21142g = i;
        return this;
    }

    public final C4196a m19540b(int i) {
        this.f21147l = i;
        this.f21136a |= 512;
        return this;
    }

    public C4196a() {
        this.f21136a = 0;
        this.f21137b = 0;
        this.f21138c = "";
        this.f21139d = 0;
        this.f21140e = 0;
        this.f21141f = l.j;
        this.f21142g = 0;
        this.f21143h = 0;
        this.f21144i = 0;
        this.f21145j = 0;
        this.f21146k = 0;
        this.f21147l = 0;
        this.f21148m = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f21136a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f21137b);
        }
        if ((this.f21136a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f21138c);
        }
        if ((this.f21136a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f21139d);
        }
        if ((this.f21136a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f21140e);
        }
        if (this.f21141f != null && this.f21141f.length > 0) {
            for (String str : this.f21141f) {
                if (str != null) {
                    codedOutputByteBufferNano.a(5, str);
                }
            }
        }
        if ((this.f21136a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f21142g);
        }
        if ((this.f21136a & 32) != 0) {
            codedOutputByteBufferNano.a(7, this.f21143h);
        }
        if ((this.f21136a & 64) != 0) {
            codedOutputByteBufferNano.b(8, this.f21144i);
        }
        if ((this.f21136a & 128) != 0) {
            codedOutputByteBufferNano.b(9, this.f21145j);
        }
        if ((this.f21136a & 256) != 0) {
            codedOutputByteBufferNano.b(10, this.f21146k);
        }
        if ((this.f21136a & 512) != 0) {
            codedOutputByteBufferNano.a(11, this.f21147l);
        }
        if (this.f21148m != null && this.f21148m.length > 0) {
            while (i < this.f21148m.length) {
                String str2 = this.f21148m[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(12, str2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if ((this.f21136a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f21137b);
        }
        if ((this.f21136a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f21138c);
        }
        if ((this.f21136a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f21139d);
        }
        if ((this.f21136a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f21140e);
        }
        if (this.f21141f != null && this.f21141f.length > 0) {
            i = 0;
            int i4 = 0;
            for (String str : this.f21141f) {
                if (str != null) {
                    i4++;
                    i += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i) + (i4 * 1);
        }
        if ((this.f21136a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f21142g);
        }
        if ((this.f21136a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f21143h);
        }
        if ((this.f21136a & 64) != 0) {
            b += CodedOutputByteBufferNano.f(8, this.f21144i);
        }
        if ((this.f21136a & 128) != 0) {
            b += CodedOutputByteBufferNano.f(9, this.f21145j);
        }
        if ((this.f21136a & 256) != 0) {
            b += CodedOutputByteBufferNano.f(10, this.f21146k);
        }
        if ((this.f21136a & 512) != 0) {
            b += CodedOutputByteBufferNano.d(11, this.f21147l);
        }
        if (this.f21148m == null || this.f21148m.length <= 0) {
            return b;
        }
        i2 = 0;
        i = 0;
        while (i3 < this.f21148m.length) {
            String str2 = this.f21148m[i3];
            if (str2 != null) {
                i++;
                i2 += CodedOutputByteBufferNano.b(str2);
            }
            i3++;
        }
        return (b + i2) + (i * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.splitinstallservice.p245a.C4196a m19535b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x001c;
            case 24: goto L_0x0029;
            case 32: goto L_0x0036;
            case 42: goto L_0x0043;
            case 48: goto L_0x0076;
            case 56: goto L_0x0084;
            case 64: goto L_0x0092;
            case 72: goto L_0x00a0;
            case 80: goto L_0x00ae;
            case 88: goto L_0x00bc;
            case 98: goto L_0x00fb;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.i();
        r7.f21137b = r0;
        r0 = r7.f21136a;
        r0 = r0 | 1;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x001c:
        r0 = r8.f();
        r7.f21138c = r0;
        r0 = r7.f21136a;
        r0 = r0 | 2;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x0029:
        r0 = r8.i();
        r7.f21139d = r0;
        r0 = r7.f21136a;
        r0 = r0 | 4;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x0036:
        r0 = r8.i();
        r7.f21140e = r0;
        r0 = r7.f21136a;
        r0 = r0 | 8;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x0043:
        r0 = 42;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f21141f;
        if (r0 != 0) goto L_0x0069;
    L_0x004d:
        r0 = r1;
    L_0x004e:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0058;
    L_0x0053:
        r3 = r7.f21141f;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0058:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x006d;
    L_0x005d:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0058;
    L_0x0069:
        r0 = r7.f21141f;
        r0 = r0.length;
        goto L_0x004e;
    L_0x006d:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f21141f = r2;
        goto L_0x0001;
    L_0x0076:
        r0 = r8.i();
        r7.f21142g = r0;
        r0 = r7.f21136a;
        r0 = r0 | 16;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x0084:
        r0 = r8.i();
        r7.f21143h = r0;
        r0 = r7.f21136a;
        r0 = r0 | 32;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x0092:
        r2 = r8.j();
        r7.f21144i = r2;
        r0 = r7.f21136a;
        r0 = r0 | 64;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x00a0:
        r2 = r8.j();
        r7.f21145j = r2;
        r0 = r7.f21136a;
        r0 = r0 | 128;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x00ae:
        r2 = r8.j();
        r7.f21146k = r2;
        r0 = r7.f21136a;
        r0 = r0 | 256;
        r7.f21136a = r0;
        goto L_0x0001;
    L_0x00bc:
        r2 = r7.f21136a;
        r2 = r2 | 512;
        r7.f21136a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00e8 }
        switch(r3) {
            case 0: goto L_0x00f1;
            case 1: goto L_0x00f1;
            case 2: goto L_0x00f1;
            case 3: goto L_0x00f1;
            default: goto L_0x00cd;
        };	 Catch:{ IllegalArgumentException -> 0x00e8 }
    L_0x00cd:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r5 = 54;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r5 = " is not a valid enum ActiveInInstallerState";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00e8 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00e8 }
    L_0x00e8:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00f1:
        r7.f21147l = r3;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r3 = r7.f21136a;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r3 = r3 | 512;
        r7.f21136a = r3;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        goto L_0x0001;
    L_0x00fb:
        r0 = 98;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f21148m;
        if (r0 != 0) goto L_0x0121;
    L_0x0105:
        r0 = r1;
    L_0x0106:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0110;
    L_0x010b:
        r3 = r7.f21148m;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0110:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0125;
    L_0x0115:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0110;
    L_0x0121:
        r0 = r7.f21148m;
        r0 = r0.length;
        goto L_0x0106;
    L_0x0125:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f21148m = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.splitinstallservice.a.a.b(com.google.protobuf.nano.a):com.google.android.finsky.splitinstallservice.a.a");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m19535b(aVar);
    }
}
