package com.google.android.gms.internal;

public final class xk extends wu {
    public static volatile xk[] f27704a;
    public long f27705b;
    public String f27706c;
    public xj[] f27707d;

    public xk() {
        this.f27705b = 0;
        this.f27706c = "";
        this.f27707d = xj.m25973b();
        this.ah = null;
        this.ai = -1;
    }

    public static xk[] m25977b() {
        if (f27704a == null) {
            synchronized (wy.f27652b) {
                if (f27704a == null) {
                    f27704a = new xk[0];
                }
            }
        }
        return f27704a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f27705b = wsVar.m25879h();
                    continue;
                case 18:
                    this.f27706c = wsVar.m25872c();
                    continue;
                case 26:
                    int a2 = xc.m25935a(wsVar, 26);
                    a = this.f27707d == null ? 0 : this.f27707d.length;
                    Object obj = new xj[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27707d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new xj();
                        wsVar.m25868a(obj[a]);
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = new xj();
                    wsVar.m25868a(obj[a]);
                    this.f27707d = obj;
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
        if (this.f27705b != 0) {
            long j = this.f27705b;
            wtVar.m25910c(1, 1);
            wtVar.m25911c(j);
        }
        if (!(this.f27706c == null || this.f27706c.equals(""))) {
            wtVar.m25904a(2, this.f27706c);
        }
        if (this.f27707d != null && this.f27707d.length > 0) {
            for (wz wzVar : this.f27707d) {
                if (wzVar != null) {
                    wtVar.m25903a(3, wzVar);
                }
            }
        }
        super.mo4702a(wtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj;
        if (this.f27705b != xkVar.f27705b) {
            return false;
        }
        if (this.f27706c == null) {
            if (xkVar.f27706c != null) {
                return false;
            }
        } else if (!this.f27706c.equals(xkVar.f27706c)) {
            return false;
        }
        return !wy.m25928a(this.f27707d, xkVar.f27707d) ? false : (this.ah == null || this.ah.m25913a()) ? xkVar.ah == null || xkVar.ah.m25913a() : this.ah.equals(xkVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f27706c == null ? 0 : this.f27706c.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f27705b ^ (this.f27705b >>> 32)))) * 31)) * 31) + wy.m25922a(this.f27707d)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27705b != 0) {
            a += wt.m25896c(8) + 8;
        }
        if (!(this.f27706c == null || this.f27706c.equals(""))) {
            a += wt.m25892b(2, this.f27706c);
        }
        if (this.f27707d == null || this.f27707d.length <= 0) {
            return a;
        }
        int i = a;
        for (wz wzVar : this.f27707d) {
            if (wzVar != null) {
                i += wt.m25891b(3, wzVar);
            }
        }
        return i;
    }
}
