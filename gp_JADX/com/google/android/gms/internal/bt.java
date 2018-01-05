package com.google.android.gms.internal;

public final class bt extends wu {
    public Integer f26515a;

    public bt() {
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        return this.f26515a != null ? a + wt.m25889b(27, this.f26515a.intValue()) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 216:
                    int j = wsVar.m25881j();
                    int e = wsVar.m25875e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f26515a = Integer.valueOf(e);
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
        if (this.f26515a != null) {
            wtVar.m25901a(27, this.f26515a.intValue());
        }
        super.mo4702a(wtVar);
    }
}
