package com.google.android.gms.internal;

public final class br extends wu {
    public bt f26513a;
    public cd f26514b;

    public br() {
        this.f26513a = null;
        this.f26514b = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26513a != null) {
            a += wt.m25891b(1, this.f26513a);
        }
        return this.f26514b != null ? a + wt.m25891b(2, this.f26514b) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26513a == null) {
                        this.f26513a = new bt();
                    }
                    wsVar.m25868a(this.f26513a);
                    continue;
                case 18:
                    if (this.f26514b == null) {
                        this.f26514b = new cd();
                    }
                    wsVar.m25868a(this.f26514b);
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
        if (this.f26513a != null) {
            wtVar.m25903a(1, this.f26513a);
        }
        if (this.f26514b != null) {
            wtVar.m25903a(2, this.f26514b);
        }
        super.mo4702a(wtVar);
    }
}
