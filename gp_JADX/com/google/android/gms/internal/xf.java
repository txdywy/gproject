package com.google.android.gms.internal;

import java.util.Arrays;

public final class xf extends wu implements Cloneable {
    public byte[] f27669a;
    public String f27670b;
    public byte[][] f27671c;
    public boolean f27672d;

    public xf() {
        this.f27669a = xc.f27660f;
        this.f27670b = "";
        this.f27671c = xc.f27659e;
        this.f27672d = false;
        this.ah = null;
        this.ai = -1;
    }

    private final xf m25948b() {
        try {
            xf xfVar = (xf) super.mo4948c();
            if (this.f27671c != null && this.f27671c.length > 0) {
                xfVar.f27671c = (byte[][]) this.f27671c.clone();
            }
            return xfVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    protected final int mo4701a() {
        int i = 0;
        int a = super.mo4701a();
        if (!Arrays.equals(this.f27669a, xc.f27660f)) {
            a += wt.m25893b(1, this.f27669a);
        }
        if (this.f27671c != null && this.f27671c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f27671c.length) {
                byte[] bArr = this.f27671c[i];
                if (bArr != null) {
                    i3++;
                    i2 += wt.m25886a(bArr);
                }
                i++;
            }
            a = (a + i2) + (i3 * 1);
        }
        if (this.f27672d) {
            a += wt.m25896c(24) + 1;
        }
        return (this.f27670b == null || this.f27670b.equals("")) ? a : a + wt.m25892b(4, this.f27670b);
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27669a = wsVar.m25874d();
                    continue;
                case 18:
                    int a2 = xc.m25935a(wsVar, 18);
                    a = this.f27671c == null ? 0 : this.f27671c.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f27671c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25874d();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25874d();
                    this.f27671c = obj;
                    continue;
                case 24:
                    this.f27672d = wsVar.m25869b();
                    continue;
                case 34:
                    this.f27670b = wsVar.m25872c();
                    continue;
                default:
                    if (!super.m24220a(wsVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void mo4702a(wt wtVar) {
        if (!Arrays.equals(this.f27669a, xc.f27660f)) {
            wtVar.m25906a(1, this.f27669a);
        }
        if (this.f27671c != null && this.f27671c.length > 0) {
            for (byte[] bArr : this.f27671c) {
                if (bArr != null) {
                    wtVar.m25906a(2, bArr);
                }
            }
        }
        if (this.f27672d) {
            wtVar.m25905a(3, this.f27672d);
        }
        if (!(this.f27670b == null || this.f27670b.equals(""))) {
            wtVar.m25904a(4, this.f27670b);
        }
        super.mo4702a(wtVar);
    }

    public final /* synthetic */ wu mo4948c() {
        return (xf) clone();
    }

    public final /* synthetic */ Object clone() {
        return m25948b();
    }

    public final /* synthetic */ wz mo4704d() {
        return (xf) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        if (!Arrays.equals(this.f27669a, xfVar.f27669a)) {
            return false;
        }
        if (this.f27670b == null) {
            if (xfVar.f27670b != null) {
                return false;
            }
        } else if (!this.f27670b.equals(xfVar.f27670b)) {
            return false;
        }
        return !wy.m25929a(this.f27671c, xfVar.f27671c) ? false : this.f27672d != xfVar.f27672d ? false : (this.ah == null || this.ah.m25913a()) ? xfVar.ah == null || xfVar.ah.m25913a() : this.ah.equals(xfVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f27672d ? 1231 : 1237) + (((((this.f27670b == null ? 0 : this.f27670b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f27669a)) * 31)) * 31) + wy.m25923a(this.f27671c)) * 31)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }
}
