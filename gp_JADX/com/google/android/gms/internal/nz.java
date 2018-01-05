package com.google.android.gms.internal;

public final class nz extends wu {
    public oa[] f27216a;

    public nz() {
        this.f27216a = oa.m25251b();
        this.ah = null;
        this.ai = -1;
    }

    public static nz m25246a(byte[] bArr) {
        return (nz) wz.m24211a(new nz(), bArr, bArr.length);
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27216a != null && this.f27216a.length > 0) {
            for (wz wzVar : this.f27216a) {
                if (wzVar != null) {
                    a += wt.m25891b(1, wzVar);
                }
            }
        }
        return a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = xc.m25935a(wsVar, 10);
                    a = this.f27216a == null ? 0 : this.f27216a.length;
                    Object obj = new oa[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27216a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oa();
                        wsVar.m25868a(obj[a]);
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = new oa();
                    wsVar.m25868a(obj[a]);
                    this.f27216a = obj;
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
        if (this.f27216a != null && this.f27216a.length > 0) {
            for (wz wzVar : this.f27216a) {
                if (wzVar != null) {
                    wtVar.m25903a(1, wzVar);
                }
            }
        }
        super.mo4702a(wtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nz)) {
            return false;
        }
        nz nzVar = (nz) obj;
        return !wy.m25928a(this.f27216a, nzVar.f27216a) ? false : (this.ah == null || this.ah.m25913a()) ? nzVar.ah == null || nzVar.ah.m25913a() : this.ah.equals(nzVar.ah);
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + wy.m25922a(this.f27216a)) * 31;
        int hashCode2 = (this.ah == null || this.ah.m25913a()) ? 0 : this.ah.hashCode();
        return hashCode2 + hashCode;
    }
}
