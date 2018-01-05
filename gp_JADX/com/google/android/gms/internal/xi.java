package com.google.android.gms.internal;

public final class xi extends wu implements Cloneable {
    public int f27699a;
    public int f27700b;

    public xi() {
        this.f27699a = -1;
        this.f27700b = 0;
        this.ah = null;
        this.ai = -1;
    }

    private final xi m25967b() {
        try {
            return (xi) super.mo4948c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27699a != -1) {
            a += wt.m25889b(1, this.f27699a);
        }
        return this.f27700b != 0 ? a + wt.m25889b(2, this.f27700b) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            int j;
            int e;
            switch (a) {
                case 0:
                    break;
                case 8:
                    j = wsVar.m25881j();
                    e = wsVar.m25875e();
                    switch (e) {
                        case -1:
                        case 0:
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
                        case 16:
                        case 17:
                            this.f27699a = e;
                            break;
                        default:
                            wsVar.m25876e(j);
                            m24220a(wsVar, a);
                            continue;
                    }
                case 16:
                    j = wsVar.m25881j();
                    e = wsVar.m25875e();
                    switch (e) {
                        case 0:
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
                        case 16:
                        case 100:
                            this.f27700b = e;
                            break;
                        default:
                            wsVar.m25876e(j);
                            m24220a(wsVar, a);
                            continue;
                    }
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
        if (this.f27699a != -1) {
            wtVar.m25901a(1, this.f27699a);
        }
        if (this.f27700b != 0) {
            wtVar.m25901a(2, this.f27700b);
        }
        super.mo4702a(wtVar);
    }

    public final /* synthetic */ wu mo4948c() {
        return (xi) clone();
    }

    public final /* synthetic */ Object clone() {
        return m25967b();
    }

    public final /* synthetic */ wz mo4704d() {
        return (xi) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return this.f27699a != xiVar.f27699a ? false : this.f27700b != xiVar.f27700b ? false : (this.ah == null || this.ah.m25913a()) ? xiVar.ah == null || xiVar.ah.m25913a() : this.ah.equals(xiVar.ah);
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f27699a) * 31) + this.f27700b) * 31;
        int hashCode2 = (this.ah == null || this.ah.m25913a()) ? 0 : this.ah.hashCode();
        return hashCode2 + hashCode;
    }
}
