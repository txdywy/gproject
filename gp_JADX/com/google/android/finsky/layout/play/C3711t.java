package com.google.android.finsky.layout.play;

import android.content.Context;
import com.google.android.finsky.C1473m;

final class C3711t implements Runnable {
    public final /* synthetic */ int f18794a;
    public final /* synthetic */ Context f18795b;
    public final /* synthetic */ FinskyDrawerLayout f18796c;

    C3711t(FinskyDrawerLayout finskyDrawerLayout, int i, Context context) {
        this.f18796c = finskyDrawerLayout;
        this.f18794a = i;
        this.f18795b = context;
    }

    public final void run() {
        int i;
        switch (this.f18794a) {
            case 1:
                i = 106;
                break;
            case 2:
                i = 104;
                break;
            case 4:
                i = 105;
                break;
            case 6:
                i = 107;
                break;
            default:
                i = 103;
                break;
        }
        this.f18796c.m17537b(i);
        switch (this.f18794a) {
            case 1:
            case 2:
            case 4:
            case 6:
                if (C1473m.f7980a.bn().mo2703a(this.f18795b.getPackageManager(), this.f18794a)) {
                    this.f18795b.startActivity(C1473m.f7980a.bn().mo2684a(this.f18795b, this.f18794a, C1473m.f7980a.db()));
                    return;
                }
                this.f18796c.f18667P.mo3684b(this.f18794a);
                return;
            default:
                this.f18796c.f18667P.mo3650a(this.f18796c.f18673V, null, false, this.f18796c.ad);
                return;
        }
    }
}
