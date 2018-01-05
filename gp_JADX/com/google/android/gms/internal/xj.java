package com.google.android.gms.internal;

public final class xj extends wu {
    public static volatile xj[] f27701a;
    public long f27702b;
    public long f27703c;

    public xj() {
        this.f27702b = 0;
        this.f27703c = 0;
        this.ah = null;
        this.ai = -1;
    }

    public static xj[] m25973b() {
        if (f27701a == null) {
            synchronized (wy.f27652b) {
                if (f27701a == null) {
                    f27701a = new xj[0];
                }
            }
        }
        return f27701a;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27702b != 0) {
            a += wt.m25890b(1, this.f27702b);
        }
        return this.f27703c != 0 ? a + wt.m25890b(2, this.f27703c) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27702b = wsVar.m25877f();
                    continue;
                case 16:
                    this.f27703c = wsVar.m25877f();
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
        if (this.f27702b != 0) {
            wtVar.m25902a(1, this.f27702b);
        }
        if (this.f27703c != 0) {
            wtVar.m25902a(2, this.f27703c);
        }
        super.mo4702a(wtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) obj;
        return this.f27702b != xjVar.f27702b ? false : this.f27703c != xjVar.f27703c ? false : (this.ah == null || this.ah.m25913a()) ? xjVar.ah == null || xjVar.ah.m25913a() : this.ah.equals(xjVar.ah);
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f27702b ^ (this.f27702b >>> 32)))) * 31) + ((int) (this.f27703c ^ (this.f27703c >>> 32)))) * 31;
        int hashCode2 = (this.ah == null || this.ah.m25913a()) ? 0 : this.ah.hashCode();
        return hashCode2 + hashCode;
    }
}
