package com.google.android.gms.internal;

public final class xd extends wu implements Cloneable {
    public String[] f27661a;
    public String[] f27662b;
    public int[] f27663c;
    public long[] f27664d;
    public long[] f27665e;

    public xd() {
        this.f27661a = xc.f27658d;
        this.f27662b = xc.f27658d;
        this.f27663c = xc.f27655a;
        this.f27664d = xc.f27656b;
        this.f27665e = xc.f27656b;
        this.ah = null;
        this.ai = -1;
    }

    private final xd m25936b() {
        try {
            xd xdVar = (xd) super.mo4948c();
            if (this.f27661a != null && this.f27661a.length > 0) {
                xdVar.f27661a = (String[]) this.f27661a.clone();
            }
            if (this.f27662b != null && this.f27662b.length > 0) {
                xdVar.f27662b = (String[]) this.f27662b.clone();
            }
            if (this.f27663c != null && this.f27663c.length > 0) {
                xdVar.f27663c = (int[]) this.f27663c.clone();
            }
            if (this.f27664d != null && this.f27664d.length > 0) {
                xdVar.f27664d = (long[]) this.f27664d.clone();
            }
            if (this.f27665e != null && this.f27665e.length > 0) {
                xdVar.f27665e = (long[]) this.f27665e.clone();
            }
            return xdVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    protected final int mo4701a() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int a = super.mo4701a();
        if (this.f27661a == null || this.f27661a.length <= 0) {
            i = a;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f27661a) {
                if (str != null) {
                    i3++;
                    i2 += wt.m25885a(str);
                }
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.f27662b != null && this.f27662b.length > 0) {
            i3 = 0;
            a = 0;
            for (String str2 : this.f27662b) {
                if (str2 != null) {
                    a++;
                    i3 += wt.m25885a(str2);
                }
            }
            i = (i + i3) + (a * 1);
        }
        if (this.f27663c != null && this.f27663c.length > 0) {
            i3 = 0;
            for (int a2 : this.f27663c) {
                i3 += wt.m25882a(a2);
            }
            i = (i + i3) + (this.f27663c.length * 1);
        }
        if (this.f27664d != null && this.f27664d.length > 0) {
            i3 = 0;
            for (long b : this.f27664d) {
                i3 += wt.m25894b(b);
            }
            i = (i + i3) + (this.f27664d.length * 1);
        }
        if (this.f27665e == null || this.f27665e.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i4 < this.f27665e.length) {
            i2 += wt.m25894b(this.f27665e[i4]);
            i4++;
        }
        return (i + i2) + (this.f27665e.length * 1);
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            int a2;
            Object obj;
            int c;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = xc.m25935a(wsVar, 10);
                    a = this.f27661a == null ? 0 : this.f27661a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27661a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25872c();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25872c();
                    this.f27661a = obj;
                    continue;
                case 18:
                    a2 = xc.m25935a(wsVar, 18);
                    a = this.f27662b == null ? 0 : this.f27662b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27662b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25872c();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25872c();
                    this.f27662b = obj;
                    continue;
                case 24:
                    a2 = xc.m25935a(wsVar, 24);
                    a = this.f27663c == null ? 0 : this.f27663c.length;
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27663c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25875e();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25875e();
                    this.f27663c = obj;
                    continue;
                case 26:
                    c = wsVar.m25871c(wsVar.m25875e());
                    a2 = wsVar.m25881j();
                    a = 0;
                    while (wsVar.m25880i() > 0) {
                        wsVar.m25875e();
                        a++;
                    }
                    wsVar.m25876e(a2);
                    a2 = this.f27663c == null ? 0 : this.f27663c.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f27663c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = wsVar.m25875e();
                        a2++;
                    }
                    this.f27663c = obj2;
                    wsVar.m25873d(c);
                    continue;
                case 32:
                    a2 = xc.m25935a(wsVar, 32);
                    a = this.f27664d == null ? 0 : this.f27664d.length;
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27664d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25877f();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25877f();
                    this.f27664d = obj;
                    continue;
                case 34:
                    c = wsVar.m25871c(wsVar.m25875e());
                    a2 = wsVar.m25881j();
                    a = 0;
                    while (wsVar.m25880i() > 0) {
                        wsVar.m25877f();
                        a++;
                    }
                    wsVar.m25876e(a2);
                    a2 = this.f27664d == null ? 0 : this.f27664d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f27664d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = wsVar.m25877f();
                        a2++;
                    }
                    this.f27664d = obj2;
                    wsVar.m25873d(c);
                    continue;
                case 40:
                    a2 = xc.m25935a(wsVar, 40);
                    a = this.f27665e == null ? 0 : this.f27665e.length;
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27665e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25877f();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25877f();
                    this.f27665e = obj;
                    continue;
                case 42:
                    c = wsVar.m25871c(wsVar.m25875e());
                    a2 = wsVar.m25881j();
                    a = 0;
                    while (wsVar.m25880i() > 0) {
                        wsVar.m25877f();
                        a++;
                    }
                    wsVar.m25876e(a2);
                    a2 = this.f27665e == null ? 0 : this.f27665e.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f27665e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = wsVar.m25877f();
                        a2++;
                    }
                    this.f27665e = obj2;
                    wsVar.m25873d(c);
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
        int i = 0;
        if (this.f27661a != null && this.f27661a.length > 0) {
            for (String str : this.f27661a) {
                if (str != null) {
                    wtVar.m25904a(1, str);
                }
            }
        }
        if (this.f27662b != null && this.f27662b.length > 0) {
            for (String str2 : this.f27662b) {
                if (str2 != null) {
                    wtVar.m25904a(2, str2);
                }
            }
        }
        if (this.f27663c != null && this.f27663c.length > 0) {
            for (int a : this.f27663c) {
                wtVar.m25901a(3, a);
            }
        }
        if (this.f27664d != null && this.f27664d.length > 0) {
            for (long a2 : this.f27664d) {
                wtVar.m25902a(4, a2);
            }
        }
        if (this.f27665e != null && this.f27665e.length > 0) {
            while (i < this.f27665e.length) {
                wtVar.m25902a(5, this.f27665e[i]);
                i++;
            }
        }
        super.mo4702a(wtVar);
    }

    public final /* synthetic */ wu mo4948c() {
        return (xd) clone();
    }

    public final /* synthetic */ Object clone() {
        return m25936b();
    }

    public final /* synthetic */ wz mo4704d() {
        return (xd) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        return !wy.m25928a(this.f27661a, xdVar.f27661a) ? false : !wy.m25928a(this.f27662b, xdVar.f27662b) ? false : !wy.m25926a(this.f27663c, xdVar.f27663c) ? false : !wy.m25927a(this.f27664d, xdVar.f27664d) ? false : !wy.m25927a(this.f27665e, xdVar.f27665e) ? false : (this.ah == null || this.ah.m25913a()) ? xdVar.ah == null || xdVar.ah.m25913a() : this.ah.equals(xdVar.ah);
    }

    public final int hashCode() {
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + wy.m25922a(this.f27661a)) * 31) + wy.m25922a(this.f27662b)) * 31) + wy.m25920a(this.f27663c)) * 31) + wy.m25921a(this.f27664d)) * 31) + wy.m25921a(this.f27665e)) * 31;
        int hashCode2 = (this.ah == null || this.ah.m25913a()) ? 0 : this.ah.hashCode();
        return hashCode2 + hashCode;
    }
}
