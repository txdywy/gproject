package com.google.android.gms.internal;

import java.util.Arrays;

public final class xg extends wu implements Cloneable {
    public long f27673a;
    public long f27674b;
    public long f27675c;
    public String f27676d;
    public int f27677e;
    public int f27678f;
    public boolean f27679g;
    public xh[] f27680h;
    public byte[] f27681i;
    public xe f27682j;
    public byte[] f27683k;
    public String f27684l;
    public String f27685m;
    public xd f27686n;
    public String f27687o;
    public long f27688p;
    public xf f27689q;
    public byte[] f27690r;
    public String f27691s;
    public int f27692t;
    public int[] f27693u;
    public long f27694v;
    public xi f27695w;

    public xg() {
        this.f27673a = 0;
        this.f27674b = 0;
        this.f27675c = 0;
        this.f27676d = "";
        this.f27677e = 0;
        this.f27678f = 0;
        this.f27679g = false;
        this.f27680h = xh.m25960b();
        this.f27681i = xc.f27660f;
        this.f27682j = null;
        this.f27683k = xc.f27660f;
        this.f27684l = "";
        this.f27685m = "";
        this.f27686n = null;
        this.f27687o = "";
        this.f27688p = 180000;
        this.f27689q = null;
        this.f27690r = xc.f27660f;
        this.f27691s = "";
        this.f27692t = 0;
        this.f27693u = xc.f27655a;
        this.f27694v = 0;
        this.f27695w = null;
        this.ah = null;
        this.ai = -1;
    }

    private final xg m25954b() {
        try {
            xg xgVar = (xg) super.mo4948c();
            if (this.f27680h != null && this.f27680h.length > 0) {
                xgVar.f27680h = new xh[this.f27680h.length];
                for (int i = 0; i < this.f27680h.length; i++) {
                    if (this.f27680h[i] != null) {
                        xgVar.f27680h[i] = (xh) this.f27680h[i].clone();
                    }
                }
            }
            if (this.f27682j != null) {
                xgVar.f27682j = (xe) this.f27682j.clone();
            }
            if (this.f27686n != null) {
                xgVar.f27686n = (xd) this.f27686n.clone();
            }
            if (this.f27689q != null) {
                xgVar.f27689q = (xf) this.f27689q.clone();
            }
            if (this.f27693u != null && this.f27693u.length > 0) {
                xgVar.f27693u = (int[]) this.f27693u.clone();
            }
            if (this.f27695w != null) {
                xgVar.f27695w = (xi) this.f27695w.clone();
            }
            return xgVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void mo4702a(wt wtVar) {
        int i = 0;
        if (this.f27673a != 0) {
            wtVar.m25902a(1, this.f27673a);
        }
        if (!(this.f27676d == null || this.f27676d.equals(""))) {
            wtVar.m25904a(2, this.f27676d);
        }
        if (this.f27680h != null && this.f27680h.length > 0) {
            for (wz wzVar : this.f27680h) {
                if (wzVar != null) {
                    wtVar.m25903a(3, wzVar);
                }
            }
        }
        if (!Arrays.equals(this.f27681i, xc.f27660f)) {
            wtVar.m25906a(4, this.f27681i);
        }
        if (!Arrays.equals(this.f27683k, xc.f27660f)) {
            wtVar.m25906a(6, this.f27683k);
        }
        if (this.f27686n != null) {
            wtVar.m25903a(7, this.f27686n);
        }
        if (!(this.f27684l == null || this.f27684l.equals(""))) {
            wtVar.m25904a(8, this.f27684l);
        }
        if (this.f27682j != null) {
            wtVar.m25903a(9, this.f27682j);
        }
        if (this.f27679g) {
            wtVar.m25905a(10, this.f27679g);
        }
        if (this.f27677e != 0) {
            wtVar.m25901a(11, this.f27677e);
        }
        if (this.f27678f != 0) {
            wtVar.m25901a(12, this.f27678f);
        }
        if (!(this.f27685m == null || this.f27685m.equals(""))) {
            wtVar.m25904a(13, this.f27685m);
        }
        if (!(this.f27687o == null || this.f27687o.equals(""))) {
            wtVar.m25904a(14, this.f27687o);
        }
        if (this.f27688p != 180000) {
            long j = this.f27688p;
            wtVar.m25910c(15, 0);
            wtVar.m25907a(wt.m25898d(j));
        }
        if (this.f27689q != null) {
            wtVar.m25903a(16, this.f27689q);
        }
        if (this.f27674b != 0) {
            wtVar.m25902a(17, this.f27674b);
        }
        if (!Arrays.equals(this.f27690r, xc.f27660f)) {
            wtVar.m25906a(18, this.f27690r);
        }
        if (this.f27692t != 0) {
            wtVar.m25901a(19, this.f27692t);
        }
        if (this.f27693u != null && this.f27693u.length > 0) {
            while (i < this.f27693u.length) {
                wtVar.m25901a(20, this.f27693u[i]);
                i++;
            }
        }
        if (this.f27675c != 0) {
            wtVar.m25902a(21, this.f27675c);
        }
        if (this.f27694v != 0) {
            wtVar.m25902a(22, this.f27694v);
        }
        if (this.f27695w != null) {
            wtVar.m25903a(23, this.f27695w);
        }
        if (!(this.f27691s == null || this.f27691s.equals(""))) {
            wtVar.m25904a(24, this.f27691s);
        }
        super.mo4702a(wtVar);
    }

    public final /* synthetic */ wu mo4948c() {
        return (xg) clone();
    }

    public final /* synthetic */ Object clone() {
        return m25954b();
    }

    public final /* synthetic */ wz mo4704d() {
        return (xg) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xg)) {
            return false;
        }
        xg xgVar = (xg) obj;
        if (this.f27673a != xgVar.f27673a) {
            return false;
        }
        if (this.f27674b != xgVar.f27674b) {
            return false;
        }
        if (this.f27675c != xgVar.f27675c) {
            return false;
        }
        if (this.f27676d == null) {
            if (xgVar.f27676d != null) {
                return false;
            }
        } else if (!this.f27676d.equals(xgVar.f27676d)) {
            return false;
        }
        if (this.f27677e != xgVar.f27677e) {
            return false;
        }
        if (this.f27678f != xgVar.f27678f) {
            return false;
        }
        if (this.f27679g != xgVar.f27679g) {
            return false;
        }
        if (!wy.m25928a(this.f27680h, xgVar.f27680h)) {
            return false;
        }
        if (!Arrays.equals(this.f27681i, xgVar.f27681i)) {
            return false;
        }
        if (this.f27682j == null) {
            if (xgVar.f27682j != null) {
                return false;
            }
        } else if (!this.f27682j.equals(xgVar.f27682j)) {
            return false;
        }
        if (!Arrays.equals(this.f27683k, xgVar.f27683k)) {
            return false;
        }
        if (this.f27684l == null) {
            if (xgVar.f27684l != null) {
                return false;
            }
        } else if (!this.f27684l.equals(xgVar.f27684l)) {
            return false;
        }
        if (this.f27685m == null) {
            if (xgVar.f27685m != null) {
                return false;
            }
        } else if (!this.f27685m.equals(xgVar.f27685m)) {
            return false;
        }
        if (this.f27686n == null) {
            if (xgVar.f27686n != null) {
                return false;
            }
        } else if (!this.f27686n.equals(xgVar.f27686n)) {
            return false;
        }
        if (this.f27687o == null) {
            if (xgVar.f27687o != null) {
                return false;
            }
        } else if (!this.f27687o.equals(xgVar.f27687o)) {
            return false;
        }
        if (this.f27688p != xgVar.f27688p) {
            return false;
        }
        if (this.f27689q == null) {
            if (xgVar.f27689q != null) {
                return false;
            }
        } else if (!this.f27689q.equals(xgVar.f27689q)) {
            return false;
        }
        if (!Arrays.equals(this.f27690r, xgVar.f27690r)) {
            return false;
        }
        if (this.f27691s == null) {
            if (xgVar.f27691s != null) {
                return false;
            }
        } else if (!this.f27691s.equals(xgVar.f27691s)) {
            return false;
        }
        if (this.f27692t != xgVar.f27692t) {
            return false;
        }
        if (!wy.m25926a(this.f27693u, xgVar.f27693u)) {
            return false;
        }
        if (this.f27694v != xgVar.f27694v) {
            return false;
        }
        if (this.f27695w == null) {
            if (xgVar.f27695w != null) {
                return false;
            }
        } else if (!this.f27695w.equals(xgVar.f27695w)) {
            return false;
        }
        return (this.ah == null || this.ah.m25913a()) ? xgVar.ah == null || xgVar.ah.m25913a() : this.ah.equals(xgVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f27695w == null ? 0 : this.f27695w.hashCode()) + (((((((((this.f27691s == null ? 0 : this.f27691s.hashCode()) + (((((this.f27689q == null ? 0 : this.f27689q.hashCode()) + (((((this.f27687o == null ? 0 : this.f27687o.hashCode()) + (((this.f27686n == null ? 0 : this.f27686n.hashCode()) + (((this.f27685m == null ? 0 : this.f27685m.hashCode()) + (((this.f27684l == null ? 0 : this.f27684l.hashCode()) + (((((this.f27682j == null ? 0 : this.f27682j.hashCode()) + (((((((this.f27679g ? 1231 : 1237) + (((((((this.f27676d == null ? 0 : this.f27676d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f27673a ^ (this.f27673a >>> 32)))) * 31) + ((int) (this.f27674b ^ (this.f27674b >>> 32)))) * 31) + ((int) (this.f27675c ^ (this.f27675c >>> 32)))) * 31)) * 31) + this.f27677e) * 31) + this.f27678f) * 31)) * 31) + wy.m25922a(this.f27680h)) * 31) + Arrays.hashCode(this.f27681i)) * 31)) * 31) + Arrays.hashCode(this.f27683k)) * 31)) * 31)) * 31)) * 31)) * 31) + ((int) (this.f27688p ^ (this.f27688p >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.f27690r)) * 31)) * 31) + this.f27692t) * 31) + wy.m25920a(this.f27693u)) * 31) + ((int) (this.f27694v ^ (this.f27694v >>> 32)))) * 31)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }

    protected final int mo4701a() {
        int i;
        int i2 = 0;
        int a = super.mo4701a();
        if (this.f27673a != 0) {
            a += wt.m25890b(1, this.f27673a);
        }
        if (!(this.f27676d == null || this.f27676d.equals(""))) {
            a += wt.m25892b(2, this.f27676d);
        }
        if (this.f27680h != null && this.f27680h.length > 0) {
            i = a;
            for (wz wzVar : this.f27680h) {
                if (wzVar != null) {
                    i += wt.m25891b(3, wzVar);
                }
            }
            a = i;
        }
        if (!Arrays.equals(this.f27681i, xc.f27660f)) {
            a += wt.m25893b(4, this.f27681i);
        }
        if (!Arrays.equals(this.f27683k, xc.f27660f)) {
            a += wt.m25893b(6, this.f27683k);
        }
        if (this.f27686n != null) {
            a += wt.m25891b(7, this.f27686n);
        }
        if (!(this.f27684l == null || this.f27684l.equals(""))) {
            a += wt.m25892b(8, this.f27684l);
        }
        if (this.f27682j != null) {
            a += wt.m25891b(9, this.f27682j);
        }
        if (this.f27679g) {
            a += wt.m25896c(80) + 1;
        }
        if (this.f27677e != 0) {
            a += wt.m25889b(11, this.f27677e);
        }
        if (this.f27678f != 0) {
            a += wt.m25889b(12, this.f27678f);
        }
        if (!(this.f27685m == null || this.f27685m.equals(""))) {
            a += wt.m25892b(13, this.f27685m);
        }
        if (!(this.f27687o == null || this.f27687o.equals(""))) {
            a += wt.m25892b(14, this.f27687o);
        }
        if (this.f27688p != 180000) {
            a += wt.m25894b(wt.m25898d(this.f27688p)) + wt.m25896c(120);
        }
        if (this.f27689q != null) {
            a += wt.m25891b(16, this.f27689q);
        }
        if (this.f27674b != 0) {
            a += wt.m25890b(17, this.f27674b);
        }
        if (!Arrays.equals(this.f27690r, xc.f27660f)) {
            a += wt.m25893b(18, this.f27690r);
        }
        if (this.f27692t != 0) {
            a += wt.m25889b(19, this.f27692t);
        }
        if (this.f27693u != null && this.f27693u.length > 0) {
            i = 0;
            while (i2 < this.f27693u.length) {
                i += wt.m25882a(this.f27693u[i2]);
                i2++;
            }
            a = (a + i) + (this.f27693u.length * 2);
        }
        if (this.f27675c != 0) {
            a += wt.m25890b(21, this.f27675c);
        }
        if (this.f27694v != 0) {
            a += wt.m25890b(22, this.f27694v);
        }
        if (this.f27695w != null) {
            a += wt.m25891b(23, this.f27695w);
        }
        return (this.f27691s == null || this.f27691s.equals("")) ? a : a + wt.m25892b(24, this.f27691s);
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            int a2;
            Object obj;
            int e;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27673a = wsVar.m25877f();
                    continue;
                case 18:
                    this.f27676d = wsVar.m25872c();
                    continue;
                case 26:
                    a2 = xc.m25935a(wsVar, 26);
                    a = this.f27680h == null ? 0 : this.f27680h.length;
                    obj = new xh[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27680h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new xh();
                        wsVar.m25868a(obj[a]);
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = new xh();
                    wsVar.m25868a(obj[a]);
                    this.f27680h = obj;
                    continue;
                case 34:
                    this.f27681i = wsVar.m25874d();
                    continue;
                case 50:
                    this.f27683k = wsVar.m25874d();
                    continue;
                case 58:
                    if (this.f27686n == null) {
                        this.f27686n = new xd();
                    }
                    wsVar.m25868a(this.f27686n);
                    continue;
                case 66:
                    this.f27684l = wsVar.m25872c();
                    continue;
                case 74:
                    if (this.f27682j == null) {
                        this.f27682j = new xe();
                    }
                    wsVar.m25868a(this.f27682j);
                    continue;
                case 80:
                    this.f27679g = wsVar.m25869b();
                    continue;
                case 88:
                    this.f27677e = wsVar.m25875e();
                    continue;
                case 96:
                    this.f27678f = wsVar.m25875e();
                    continue;
                case 106:
                    this.f27685m = wsVar.m25872c();
                    continue;
                case 114:
                    this.f27687o = wsVar.m25872c();
                    continue;
                case 120:
                    long f = wsVar.m25877f();
                    this.f27688p = (-(f & 1)) ^ (f >>> 1);
                    continue;
                case 130:
                    if (this.f27689q == null) {
                        this.f27689q = new xf();
                    }
                    wsVar.m25868a(this.f27689q);
                    continue;
                case 136:
                    this.f27674b = wsVar.m25877f();
                    continue;
                case 146:
                    this.f27690r = wsVar.m25874d();
                    continue;
                case 152:
                    a2 = wsVar.m25881j();
                    e = wsVar.m25875e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f27692t = e;
                            break;
                        default:
                            wsVar.m25876e(a2);
                            m24220a(wsVar, a);
                            continue;
                    }
                case 160:
                    a2 = xc.m25935a(wsVar, 160);
                    a = this.f27693u == null ? 0 : this.f27693u.length;
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27693u, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25875e();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25875e();
                    this.f27693u = obj;
                    continue;
                case 162:
                    e = wsVar.m25871c(wsVar.m25875e());
                    a2 = wsVar.m25881j();
                    a = 0;
                    while (wsVar.m25880i() > 0) {
                        wsVar.m25875e();
                        a++;
                    }
                    wsVar.m25876e(a2);
                    a2 = this.f27693u == null ? 0 : this.f27693u.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f27693u, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = wsVar.m25875e();
                        a2++;
                    }
                    this.f27693u = obj2;
                    wsVar.m25873d(e);
                    continue;
                case 168:
                    this.f27675c = wsVar.m25877f();
                    continue;
                case 176:
                    this.f27694v = wsVar.m25877f();
                    continue;
                case 186:
                    if (this.f27695w == null) {
                        this.f27695w = new xi();
                    }
                    wsVar.m25868a(this.f27695w);
                    continue;
                case 194:
                    this.f27691s = wsVar.m25872c();
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
}
