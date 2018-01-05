package com.google.android.finsky.billing.profile;

import android.view.View;
import com.google.android.finsky.billing.common.s;

public final class com.google.android.finsky.billing.profile.b implements com.google.android.finsky.billing.common.t
{

    public final com.google.android.finsky.billing.profile.a a;

    b(com.google.android.finsky.billing.profile.a p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        v0 = 0;
        if (p0.ag != this.a.d) {
            this.a.d = p0.ag;
            this.a.ah.setVisibility(8);
            if (this.a.ai != 0)
                this.a.ai.setVisibility(8);
            this.a.ag.setVisibility(8);
            switch (p0.l) {
                case 0:
                    this.a.ae();
                    break;
                case 1:
                    this.a.W();
                    this.a.ag.setVisibility(8);
                    this.a.ah.setVisibility(0);
                    if (this.a.ai != 0)
                        this.a.ai.setVisibility(8);
                    break;
                case 2:
                    this.a.f = this.a.e.al;
                    this.a.i = 1;
                    this.a.Y();
                    break;
                case 3:
                    this.a.X();
                    break;
                case 4:
                    this.a.a(this.a.e.aq, this.a.e.ar);
                    v0 = this.a.e.X();
                    break;
                case 5:
                    this.a.a(this.a.e.ap);
                    v0 = this.a.e.X();
                    break;
                default:
                    break;
            }
            if (v0 != 0)
                this.a.Z();
        }
    }

}
