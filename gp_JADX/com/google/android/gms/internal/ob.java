package com.google.android.gms.internal;

public final class ob extends wu {
    public static volatile ob[] f27220a;
    public int f27221b;
    public oc f27222c;

    public ob() {
        this.f27221b = 1;
        this.f27222c = null;
        this.ah = null;
        this.ai = -1;
    }

    public static ob[] m25255b() {
        if (f27220a == null) {
            synchronized (wy.f27652b) {
                if (f27220a == null) {
                    f27220a = new ob[0];
                }
            }
        }
        return f27220a;
    }

    protected final int mo4701a() {
        int a = super.mo4701a() + wt.m25889b(1, this.f27221b);
        return this.f27222c != null ? a + wt.m25891b(2, this.f27222c) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int j = wsVar.m25881j();
                    int e = wsVar.m25875e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            this.f27221b = e;
                            break;
                        default:
                            wsVar.m25876e(j);
                            m24220a(wsVar, a);
                            continue;
                    }
                case 18:
                    if (this.f27222c == null) {
                        this.f27222c = new oc();
                    }
                    wsVar.m25868a(this.f27222c);
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
        wtVar.m25901a(1, this.f27221b);
        if (this.f27222c != null) {
            wtVar.m25903a(2, this.f27222c);
        }
        super.mo4702a(wtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        if (this.f27221b != obVar.f27221b) {
            return false;
        }
        if (this.f27222c == null) {
            if (obVar.f27222c != null) {
                return false;
            }
        } else if (!this.f27222c.equals(obVar.f27222c)) {
            return false;
        }
        return (this.ah == null || this.ah.m25913a()) ? obVar.ah == null || obVar.ah.m25913a() : this.ah.equals(obVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f27222c == null ? 0 : this.f27222c.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f27221b) * 31)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }
}
