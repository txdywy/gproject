package com.google.android.finsky.billing.lightpurchase.p118d;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.bg.C1618s;

final class C1917c implements OnClickListener {
    public final /* synthetic */ C1086a f9842a;

    C1917c(C1086a c1086a) {
        this.f9842a = c1086a;
    }

    public final void onClick(View view) {
        if (this.f9842a.ax != null && this.f9842a.az) {
            C1618s.m9293a(this.f9842a.m603h(), this.f9842a.ax.f746R);
            if (view == this.f9842a.aG) {
                this.f9842a.ax.mo1405X();
            } else if (view == this.f9842a.aH) {
                this.f9842a.ax.mo2535Z();
            }
        }
    }
}
