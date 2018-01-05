package com.google.android.gms.internal;

public final class of extends wu {
    public og[] f27250a;

    public of() {
        this.f27250a = og.m25276b();
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27250a != null && this.f27250a.length > 0) {
            for (wz wzVar : this.f27250a) {
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
                    a = this.f27250a == null ? 0 : this.f27250a.length;
                    Object obj = new og[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27250a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new og();
                        wsVar.m25868a(obj[a]);
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = new og();
                    wsVar.m25868a(obj[a]);
                    this.f27250a = obj;
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
        if (this.f27250a != null && this.f27250a.length > 0) {
            for (wz wzVar : this.f27250a) {
                if (wzVar != null) {
                    wtVar.m25903a(1, wzVar);
                }
            }
        }
        super.mo4702a(wtVar);
    }
}
