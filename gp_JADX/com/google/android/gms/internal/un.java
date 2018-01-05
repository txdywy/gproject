package com.google.android.gms.internal;

import java.util.Arrays;

final class un extends um {
    public final byte[] f27524c;
    public int f27525d;
    public int f27526e;
    public int f27527f;
    public int f27528g;
    public int f27529h;
    public int f27530i = Integer.MAX_VALUE;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25700i() {
        /*
        r5 = this;
        r0 = r5.f27527f;
        r1 = r5.f27525d;
        if (r1 == r0) goto L_0x006c;
    L_0x0006:
        r3 = r5.f27524c;
        r2 = r0 + 1;
        r0 = r3[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f27527f = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r5.f27525d;
        r1 = r1 - r2;
        r4 = 9;
        if (r1 < r4) goto L_0x006c;
    L_0x0018:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0026;
    L_0x0021:
        r0 = r0 ^ -128;
    L_0x0023:
        r5.f27527f = r1;
        goto L_0x0010;
    L_0x0026:
        r2 = r1 + 1;
        r1 = r3[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0033;
    L_0x002f:
        r0 = r0 ^ 16256;
        r1 = r2;
        goto L_0x0023;
    L_0x0033:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0041;
    L_0x003c:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0023;
    L_0x0041:
        r2 = r1 + 1;
        r1 = r3[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x0072;
    L_0x004e:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0054:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x005a:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0060:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x0066:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x006c:
        r0 = r5.mo4912f();
        r0 = (int) r0;
        goto L_0x0010;
    L_0x0072:
        r1 = r2;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.un.i():int");
    }

    private final void m25701j() {
        this.f27525d += this.f27526e;
        int i = this.f27525d - this.f27528g;
        if (i > this.f27530i) {
            this.f27526e = i - this.f27530i;
            this.f27525d -= this.f27526e;
            return;
        }
        this.f27526e = 0;
    }

    private final byte m25702k() {
        if (this.f27527f == this.f27525d) {
            throw zzfxb.m26055a();
        }
        byte[] bArr = this.f27524c;
        int i = this.f27527f;
        this.f27527f = i + 1;
        return bArr[i];
    }

    public final int mo4901a() {
        if (mo4913g()) {
            this.f27529h = 0;
            return 0;
        }
        this.f27529h = m25700i();
        if ((this.f27529h >>> 3) != 0) {
            return this.f27529h;
        }
        throw new zzfxb("Protocol message contained an invalid tag (zero).");
    }

    public final void mo4903a(int i) {
        if (this.f27529h != i) {
            throw new zzfxb("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int mo4904b() {
        return m25700i();
    }

    public final boolean mo4905b(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f27525d - this.f27527f >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f27524c;
                        int i3 = this.f27527f;
                        this.f27527f = i3 + 1;
                        if (bArr[i3] >= (byte) 0) {
                            return true;
                        }
                        i2++;
                    }
                    throw zzfxb.m26057c();
                }
                while (i2 < 10) {
                    if (m25702k() >= (byte) 0) {
                        return true;
                    }
                    i2++;
                }
                throw zzfxb.m26057c();
            case 1:
                mo4911e(8);
                return true;
            case 2:
                mo4911e(m25700i());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo4911e(4);
                return true;
            default:
                throw new zzfxc("Protocol message tag had invalid wire type.");
        }
        do {
            i2 = mo4901a();
            if (i2 != 0) {
            }
            mo4903a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo4905b(i2));
        mo4903a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int mo4906c(int i) {
        if (i < 0) {
            throw zzfxb.m26056b();
        }
        int h = mo4914h() + i;
        int i2 = this.f27530i;
        if (h > i2) {
            throw zzfxb.m26055a();
        }
        this.f27530i = h;
        m25701j();
        return i2;
    }

    public final ud mo4908d() {
        int i = m25700i();
        if (i > 0 && i <= this.f27525d - this.f27527f) {
            ud a = ud.m25654a(this.f27524c, this.f27527f, i);
            this.f27527f = i + this.f27527f;
            return a;
        } else if (i == 0) {
            return ud.f27511a;
        } else {
            byte[] copyOfRange;
            if (i > 0 && i <= this.f27525d - this.f27527f) {
                int i2 = this.f27527f;
                this.f27527f = i + this.f27527f;
                copyOfRange = Arrays.copyOfRange(this.f27524c, i2, this.f27527f);
            } else if (i > 0) {
                throw zzfxb.m26055a();
            } else if (i == 0) {
                copyOfRange = vd.f27561b;
            } else {
                throw zzfxb.m26056b();
            }
            return ud.m25655b(copyOfRange);
        }
    }

    public final void mo4909d(int i) {
        this.f27530i = i;
        m25701j();
    }

    public final int mo4910e() {
        return m25700i();
    }

    public final void mo4911e(int i) {
        if (i >= 0 && i <= this.f27525d - this.f27527f) {
            this.f27527f += i;
        } else if (i < 0) {
            throw zzfxb.m26056b();
        } else {
            throw zzfxb.m26055a();
        }
    }

    final long mo4912f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte k = m25702k();
            j |= ((long) (k & 127)) << i;
            if ((k & 128) == 0) {
                return j;
            }
        }
        throw zzfxb.m26057c();
    }

    public final boolean mo4913g() {
        return this.f27527f == this.f27525d;
    }

    public final int mo4914h() {
        return this.f27527f - this.f27528g;
    }

    un(byte[] bArr, int i, int i2) {
        this.f27524c = bArr;
        this.f27525d = i + i2;
        this.f27527f = i;
        this.f27528g = this.f27527f;
    }

    public final String mo4907c() {
        int i = m25700i();
        if (i > 0 && i <= this.f27525d - this.f27527f) {
            if ((wi.f27601a.mo4947a(this.f27524c, this.f27527f, this.f27527f + i) == 0 ? 1 : null) == null) {
                throw new zzfxb("Protocol message had invalid UTF-8.");
            }
            int i2 = this.f27527f;
            this.f27527f += i;
            return new String(this.f27524c, i2, i, vd.f27560a);
        } else if (i == 0) {
            return "";
        } else {
            if (i <= 0) {
                throw zzfxb.m26056b();
            }
            throw zzfxb.m26055a();
        }
    }

    public final uu mo4902a(uu uuVar, uq uqVar) {
        int i = m25700i();
        if (this.a >= this.b) {
            throw new zzfxb("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        i = mo4906c(i);
        this.a++;
        uu a = uu.m25291a(uuVar, (um) this, uqVar);
        mo4903a(0);
        this.a--;
        mo4909d(i);
        return a;
    }
}
