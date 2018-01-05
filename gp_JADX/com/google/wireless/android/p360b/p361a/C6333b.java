package com.google.wireless.android.p360b.p361a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.google.wireless.android.b.a.c;

public final class C6333b extends C0758b {
    public int f31727a;
    public int f31728b;
    public int f31729c;
    public int f31730d;
    public int f31731e;
    public int f31732f;
    public boolean f31733g;
    public boolean f31734h;
    public int f31735i;
    public int f31736j;
    public int f31737k;
    public int f31738l;
    public String[] f31739m;
    public String[] f31740n;
    public c[] f31741o;
    public String[] f31742p;
    public String[] f31743q;
    public String[] f31744r;
    public int f31745s;
    public int f31746t;
    public boolean f31747u;
    public long f31748v;
    public int f31749w;
    public String[] f31750x;
    public String f31751y;
    public boolean f31752z;

    public static int m29004a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum ScreenLayout");
        }
    }

    public final C6333b m29011b(int i) {
        this.f31727a |= 2;
        this.f31736j = i;
        return this;
    }

    public final C6333b m29012c(int i) {
        this.f31727a |= 4;
        this.f31737k = i;
        return this;
    }

    public final C6333b m29013d(int i) {
        this.f31727a |= 16;
        this.f31746t = i;
        return this;
    }

    public final C6333b m29008a(boolean z) {
        this.f31727a |= 32;
        this.f31747u = z;
        return this;
    }

    public final C6333b m29007a(long j) {
        this.f31727a |= 64;
        this.f31748v = j;
        return this;
    }

    public final C6333b m29014e(int i) {
        this.f31727a |= 128;
        this.f31749w = i;
        return this;
    }

    public C6333b() {
        this.f31727a = 0;
        this.f31728b = 0;
        this.f31729c = 0;
        this.f31730d = 0;
        this.f31731e = 0;
        this.f31732f = 0;
        this.f31733g = false;
        this.f31734h = false;
        this.f31735i = 0;
        this.f31736j = 0;
        this.f31737k = 0;
        this.f31738l = 0;
        this.f31739m = l.j;
        this.f31740n = l.j;
        this.f31741o = c.d();
        this.f31742p = l.j;
        this.f31743q = l.j;
        this.f31744r = l.j;
        this.f31745s = 50;
        this.f31746t = 0;
        this.f31747u = false;
        this.f31748v = 0;
        this.f31749w = 0;
        this.f31750x = l.j;
        this.f31751y = "";
        this.f31752z = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        codedOutputByteBufferNano.a(1, this.f31728b);
        codedOutputByteBufferNano.a(2, this.f31729c);
        codedOutputByteBufferNano.a(3, this.f31730d);
        codedOutputByteBufferNano.a(4, this.f31731e);
        codedOutputByteBufferNano.a(5, this.f31733g);
        codedOutputByteBufferNano.a(6, this.f31734h);
        codedOutputByteBufferNano.a(7, this.f31735i);
        codedOutputByteBufferNano.a(8, this.f31738l);
        if (this.f31739m != null && this.f31739m.length > 0) {
            for (String str : this.f31739m) {
                if (str != null) {
                    codedOutputByteBufferNano.a(9, str);
                }
            }
        }
        if (this.f31740n != null && this.f31740n.length > 0) {
            for (String str2 : this.f31740n) {
                if (str2 != null) {
                    codedOutputByteBufferNano.a(10, str2);
                }
            }
        }
        if (this.f31742p != null && this.f31742p.length > 0) {
            for (String str22 : this.f31742p) {
                if (str22 != null) {
                    codedOutputByteBufferNano.a(11, str22);
                }
            }
        }
        if ((this.f31727a & 2) != 0) {
            codedOutputByteBufferNano.a(12, this.f31736j);
        }
        if ((this.f31727a & 4) != 0) {
            codedOutputByteBufferNano.a(13, this.f31737k);
        }
        if (this.f31743q != null && this.f31743q.length > 0) {
            for (String str222 : this.f31743q) {
                if (str222 != null) {
                    codedOutputByteBufferNano.a(14, str222);
                }
            }
        }
        if (this.f31744r != null && this.f31744r.length > 0) {
            for (String str2222 : this.f31744r) {
                if (str2222 != null) {
                    codedOutputByteBufferNano.a(15, str2222);
                }
            }
        }
        if ((this.f31727a & 8) != 0) {
            codedOutputByteBufferNano.a(17, this.f31745s);
        }
        if ((this.f31727a & 16) != 0) {
            codedOutputByteBufferNano.a(18, this.f31746t);
        }
        if ((this.f31727a & 32) != 0) {
            codedOutputByteBufferNano.a(19, this.f31747u);
        }
        if ((this.f31727a & 64) != 0) {
            codedOutputByteBufferNano.b(20, this.f31748v);
        }
        if ((this.f31727a & 128) != 0) {
            codedOutputByteBufferNano.a(21, this.f31749w);
        }
        if (this.f31750x != null && this.f31750x.length > 0) {
            for (String str22222 : this.f31750x) {
                if (str22222 != null) {
                    codedOutputByteBufferNano.a(22, str22222);
                }
            }
        }
        if (this.f31741o != null && this.f31741o.length > 0) {
            while (i < this.f31741o.length) {
                C0757i c0757i = this.f31741o[i];
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(26, c0757i);
                }
                i++;
            }
        }
        if ((this.f31727a & 1) != 0) {
            codedOutputByteBufferNano.a(27, this.f31732f);
        }
        if ((this.f31727a & 512) != 0) {
            codedOutputByteBufferNano.a(28, this.f31752z);
        }
        if ((this.f31727a & 256) != 0) {
            codedOutputByteBufferNano.a(29, this.f31751y);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = (((((((super.mo1128b() + CodedOutputByteBufferNano.d(1, this.f31728b)) + CodedOutputByteBufferNano.d(2, this.f31729c)) + CodedOutputByteBufferNano.d(3, this.f31730d)) + CodedOutputByteBufferNano.d(4, this.f31731e)) + (CodedOutputByteBufferNano.d(5) + 1)) + (CodedOutputByteBufferNano.d(6) + 1)) + CodedOutputByteBufferNano.d(7, this.f31735i)) + CodedOutputByteBufferNano.d(8, this.f31738l);
        if (this.f31739m == null || this.f31739m.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f31739m) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f31740n != null && this.f31740n.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2 : this.f31740n) {
                if (str2 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str2);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (this.f31742p != null && this.f31742p.length > 0) {
            i3 = 0;
            b = 0;
            for (String str22 : this.f31742p) {
                if (str22 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str22);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if ((this.f31727a & 2) != 0) {
            i += CodedOutputByteBufferNano.d(12, this.f31736j);
        }
        if ((this.f31727a & 4) != 0) {
            i += CodedOutputByteBufferNano.d(13, this.f31737k);
        }
        if (this.f31743q != null && this.f31743q.length > 0) {
            i3 = 0;
            b = 0;
            for (String str222 : this.f31743q) {
                if (str222 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str222);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (this.f31744r != null && this.f31744r.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2222 : this.f31744r) {
                if (str2222 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str2222);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if ((this.f31727a & 8) != 0) {
            i += CodedOutputByteBufferNano.d(17, this.f31745s);
        }
        if ((this.f31727a & 16) != 0) {
            i += CodedOutputByteBufferNano.d(18, this.f31746t);
        }
        if ((this.f31727a & 32) != 0) {
            i += CodedOutputByteBufferNano.d(19) + 1;
        }
        if ((this.f31727a & 64) != 0) {
            i += CodedOutputByteBufferNano.f(20, this.f31748v);
        }
        if ((this.f31727a & 128) != 0) {
            i += CodedOutputByteBufferNano.d(21, this.f31749w);
        }
        if (this.f31750x != null && this.f31750x.length > 0) {
            i3 = 0;
            b = 0;
            for (String str22222 : this.f31750x) {
                if (str22222 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str22222);
                }
            }
            i = (i + i3) + (b * 2);
        }
        if (this.f31741o != null && this.f31741o.length > 0) {
            while (i4 < this.f31741o.length) {
                C0757i c0757i = this.f31741o[i4];
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(26, c0757i);
                }
                i4++;
            }
        }
        if ((this.f31727a & 1) != 0) {
            i += CodedOutputByteBufferNano.d(27, this.f31732f);
        }
        if ((this.f31727a & 512) != 0) {
            i += CodedOutputByteBufferNano.d(28) + 1;
        }
        if ((this.f31727a & 256) != 0) {
            return i + CodedOutputByteBufferNano.b(29, this.f31751y);
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p360b.p361a.C6333b m29005b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x0040;
            case 24: goto L_0x0071;
            case 32: goto L_0x00a4;
            case 40: goto L_0x00bd;
            case 48: goto L_0x00c5;
            case 56: goto L_0x00cd;
            case 64: goto L_0x00d5;
            case 74: goto L_0x00dd;
            case 82: goto L_0x0111;
            case 90: goto L_0x0145;
            case 96: goto L_0x0179;
            case 104: goto L_0x0187;
            case 114: goto L_0x0195;
            case 122: goto L_0x01c9;
            case 136: goto L_0x01fd;
            case 144: goto L_0x020b;
            case 152: goto L_0x0219;
            case 160: goto L_0x0227;
            case 168: goto L_0x0235;
            case 178: goto L_0x0243;
            case 210: goto L_0x0277;
            case 216: goto L_0x02b7;
            case 224: goto L_0x02dc;
            case 234: goto L_0x02ea;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r3) {
            case 0: goto L_0x003d;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            case 3: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 43;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum TouchScreen";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x003d:
        r7.f31728b = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0040:
        r2 = r8.o();
        r3 = r8.d();	 Catch:{ IllegalArgumentException -> 0x0066 }
        switch(r3) {
            case 0: goto L_0x006e;
            case 1: goto L_0x006e;
            case 2: goto L_0x006e;
            case 3: goto L_0x006e;
            default: goto L_0x004b;
        };	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x004b:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r5 = 40;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r5 = " is not a valid enum Keyboard";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0066 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0066 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0066:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x006e:
        r7.f31729c = r3;	 Catch:{ IllegalArgumentException -> 0x0066 }
        goto L_0x0001;
    L_0x0071:
        r2 = r8.o();
        r3 = r8.d();	 Catch:{ IllegalArgumentException -> 0x0097 }
        switch(r3) {
            case 0: goto L_0x00a0;
            case 1: goto L_0x00a0;
            case 2: goto L_0x00a0;
            case 3: goto L_0x00a0;
            case 4: goto L_0x00a0;
            default: goto L_0x007c;
        };	 Catch:{ IllegalArgumentException -> 0x0097 }
    L_0x007c:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r5 = " is not a valid enum Navigation";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0097 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0097 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0097 }
    L_0x0097:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00a0:
        r7.f31730d = r3;	 Catch:{ IllegalArgumentException -> 0x0097 }
        goto L_0x0001;
    L_0x00a4:
        r2 = r8.o();
        r3 = r8.d();	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r3 = com.google.wireless.android.p360b.p361a.C6333b.m29004a(r3);	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r7.f31731e = r3;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        goto L_0x0001;
    L_0x00b4:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00bd:
        r0 = r8.e();
        r7.f31733g = r0;
        goto L_0x0001;
    L_0x00c5:
        r0 = r8.e();
        r7.f31734h = r0;
        goto L_0x0001;
    L_0x00cd:
        r0 = r8.d();
        r7.f31735i = r0;
        goto L_0x0001;
    L_0x00d5:
        r0 = r8.d();
        r7.f31738l = r0;
        goto L_0x0001;
    L_0x00dd:
        r0 = 74;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31739m;
        if (r0 != 0) goto L_0x0103;
    L_0x00e7:
        r0 = r1;
    L_0x00e8:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x00f2;
    L_0x00ed:
        r3 = r7.f31739m;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00f2:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0107;
    L_0x00f7:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x00f2;
    L_0x0103:
        r0 = r7.f31739m;
        r0 = r0.length;
        goto L_0x00e8;
    L_0x0107:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f31739m = r2;
        goto L_0x0001;
    L_0x0111:
        r0 = 82;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31740n;
        if (r0 != 0) goto L_0x0137;
    L_0x011b:
        r0 = r1;
    L_0x011c:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0126;
    L_0x0121:
        r3 = r7.f31740n;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0126:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x013b;
    L_0x012b:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0126;
    L_0x0137:
        r0 = r7.f31740n;
        r0 = r0.length;
        goto L_0x011c;
    L_0x013b:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f31740n = r2;
        goto L_0x0001;
    L_0x0145:
        r0 = 90;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31742p;
        if (r0 != 0) goto L_0x016b;
    L_0x014f:
        r0 = r1;
    L_0x0150:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x015a;
    L_0x0155:
        r3 = r7.f31742p;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x015a:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x016f;
    L_0x015f:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x015a;
    L_0x016b:
        r0 = r7.f31742p;
        r0 = r0.length;
        goto L_0x0150;
    L_0x016f:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f31742p = r2;
        goto L_0x0001;
    L_0x0179:
        r0 = r8.d();
        r7.f31736j = r0;
        r0 = r7.f31727a;
        r0 = r0 | 2;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x0187:
        r0 = r8.d();
        r7.f31737k = r0;
        r0 = r7.f31727a;
        r0 = r0 | 4;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x0195:
        r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31743q;
        if (r0 != 0) goto L_0x01bb;
    L_0x019f:
        r0 = r1;
    L_0x01a0:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x01aa;
    L_0x01a5:
        r3 = r7.f31743q;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x01aa:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01bf;
    L_0x01af:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x01aa;
    L_0x01bb:
        r0 = r7.f31743q;
        r0 = r0.length;
        goto L_0x01a0;
    L_0x01bf:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f31743q = r2;
        goto L_0x0001;
    L_0x01c9:
        r0 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31744r;
        if (r0 != 0) goto L_0x01ef;
    L_0x01d3:
        r0 = r1;
    L_0x01d4:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x01de;
    L_0x01d9:
        r3 = r7.f31744r;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x01de:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01f3;
    L_0x01e3:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x01de;
    L_0x01ef:
        r0 = r7.f31744r;
        r0 = r0.length;
        goto L_0x01d4;
    L_0x01f3:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f31744r = r2;
        goto L_0x0001;
    L_0x01fd:
        r0 = r8.d();
        r7.f31745s = r0;
        r0 = r7.f31727a;
        r0 = r0 | 8;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x020b:
        r0 = r8.d();
        r7.f31746t = r0;
        r0 = r7.f31727a;
        r0 = r0 | 16;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x0219:
        r0 = r8.e();
        r7.f31747u = r0;
        r0 = r7.f31727a;
        r0 = r0 | 32;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x0227:
        r2 = r8.c();
        r7.f31748v = r2;
        r0 = r7.f31727a;
        r0 = r0 | 64;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x0235:
        r0 = r8.d();
        r7.f31749w = r0;
        r0 = r7.f31727a;
        r0 = r0 | 128;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x0243:
        r0 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31750x;
        if (r0 != 0) goto L_0x0269;
    L_0x024d:
        r0 = r1;
    L_0x024e:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0258;
    L_0x0253:
        r3 = r7.f31750x;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0258:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x026d;
    L_0x025d:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0258;
    L_0x0269:
        r0 = r7.f31750x;
        r0 = r0.length;
        goto L_0x024e;
    L_0x026d:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f31750x = r2;
        goto L_0x0001;
    L_0x0277:
        r0 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f31741o;
        if (r0 != 0) goto L_0x02a3;
    L_0x0281:
        r0 = r1;
    L_0x0282:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.b.a.c[r2];
        if (r0 == 0) goto L_0x028c;
    L_0x0287:
        r3 = r7.f31741o;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x028c:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x02a7;
    L_0x0291:
        r3 = new com.google.wireless.android.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x028c;
    L_0x02a3:
        r0 = r7.f31741o;
        r0 = r0.length;
        goto L_0x0282;
    L_0x02a7:
        r3 = new com.google.wireless.android.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f31741o = r2;
        goto L_0x0001;
    L_0x02b7:
        r2 = r7.f31727a;
        r2 = r2 | 1;
        r7.f31727a = r2;
        r2 = r8.o();
        r3 = r8.d();	 Catch:{ IllegalArgumentException -> 0x02d3 }
        r3 = com.google.wireless.android.p360b.p361a.C6333b.m29004a(r3);	 Catch:{ IllegalArgumentException -> 0x02d3 }
        r7.f31732f = r3;	 Catch:{ IllegalArgumentException -> 0x02d3 }
        r3 = r7.f31727a;	 Catch:{ IllegalArgumentException -> 0x02d3 }
        r3 = r3 | 1;
        r7.f31727a = r3;	 Catch:{ IllegalArgumentException -> 0x02d3 }
        goto L_0x0001;
    L_0x02d3:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x02dc:
        r0 = r8.e();
        r7.f31752z = r0;
        r0 = r7.f31727a;
        r0 = r0 | 512;
        r7.f31727a = r0;
        goto L_0x0001;
    L_0x02ea:
        r0 = r8.f();
        r7.f31751y = r0;
        r0 = r7.f31727a;
        r0 = r0 | 256;
        r7.f31727a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.b.a.b.b(com.google.protobuf.nano.a):com.google.wireless.android.b.a.b");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m29005b(aVar);
    }
}
