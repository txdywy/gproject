package com.google.android.gms.internal;

public final class oa extends wu {
    public static volatile oa[] f27217a;
    public String f27218b;
    public ob f27219c;

    public oa() {
        this.f27218b = "";
        this.f27219c = null;
        this.ah = null;
        this.ai = -1;
    }

    public static oa[] m25251b() {
        if (f27217a == null) {
            synchronized (wy.f27652b) {
                if (f27217a == null) {
                    f27217a = new oa[0];
                }
            }
        }
        return f27217a;
    }

    protected final int mo4701a() {
        int a = super.mo4701a() + wt.m25892b(1, this.f27218b);
        return this.f27219c != null ? a + wt.m25891b(2, this.f27219c) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27218b = wsVar.m25872c();
                    continue;
                case 18:
                    if (this.f27219c == null) {
                        this.f27219c = new ob();
                    }
                    wsVar.m25868a(this.f27219c);
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
        wtVar.m25904a(1, this.f27218b);
        if (this.f27219c != null) {
            wtVar.m25903a(2, this.f27219c);
        }
        super.mo4702a(wtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        if (this.f27218b == null) {
            if (oaVar.f27218b != null) {
                return false;
            }
        } else if (!this.f27218b.equals(oaVar.f27218b)) {
            return false;
        }
        if (this.f27219c == null) {
            if (oaVar.f27219c != null) {
                return false;
            }
        } else if (!this.f27219c.equals(oaVar.f27219c)) {
            return false;
        }
        return (this.ah == null || this.ah.m25913a()) ? oaVar.ah == null || oaVar.ah.m25913a() : this.ah.equals(oaVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f27219c == null ? 0 : this.f27219c.hashCode()) + (((this.f27218b == null ? 0 : this.f27218b.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }
}
