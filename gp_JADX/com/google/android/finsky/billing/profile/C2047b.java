package com.google.android.finsky.billing.profile;

import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;

final class C2047b implements C1087t {
    public final /* synthetic */ C2046a f10543a;

    C2047b(C2046a c2046a) {
        this.f10543a = c2046a;
    }

    public final void mo1423a(C1089s c1089s) {
        int i = 0;
        if (c1089s.ag != this.f10543a.f10534d) {
            this.f10543a.f10534d = c1089s.ag;
            this.f10543a.ah.setVisibility(8);
            if (this.f10543a.ai != null) {
                this.f10543a.ai.setVisibility(8);
            }
            this.f10543a.ag.setVisibility(8);
            C2046a c2046a;
            switch (c1089s.f6948l) {
                case 0:
                    this.f10543a.ae();
                    break;
                case 1:
                    c2046a = this.f10543a;
                    c2046a.mo968W();
                    c2046a.ag.setVisibility(8);
                    c2046a.ah.setVisibility(0);
                    if (c2046a.ai != null) {
                        c2046a.ai.setVisibility(8);
                        break;
                    }
                    break;
                case 2:
                    c2046a = this.f10543a;
                    c2046a.f10536f = this.f10543a.f10535e.al;
                    c2046a.f10539i = true;
                    c2046a.mo2598Y();
                    break;
                case 3:
                    this.f10543a.mo2597X();
                    break;
                case 4:
                    this.f10543a.mo2603a(this.f10543a.f10535e.aq, this.f10543a.f10535e.ar);
                    i = this.f10543a.f10535e.m10809X();
                    break;
                case 5:
                    this.f10543a.mo2601a(this.f10543a.f10535e.ap);
                    i = this.f10543a.f10535e.m10809X();
                    break;
            }
            if (i != 0) {
                this.f10543a.mo2599Z();
            }
        }
    }
}
