package android.support.v7.app;

import android.support.v7.widget.bu;

final class au implements bu {
    public final /* synthetic */ aq f2309a;

    au(aq aqVar) {
        this.f2309a = aqVar;
    }

    public final void mo551a() {
    }

    public final void mo552b() {
        aq aqVar = this.f2309a;
        if (aqVar.f2290y != null) {
            aqVar.f2290y.mo712h();
        }
        if (aqVar.f2270D != null) {
            aqVar.f.getDecorView().removeCallbacks(aqVar.f2271E);
            if (aqVar.f2270D.isShowing()) {
                try {
                    aqVar.f2270D.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            aqVar.f2270D = null;
        }
        aqVar.m2442q();
        bc g = aqVar.m2433g(0);
        if (g != null && g.f2336j != null) {
            g.f2336j.close();
        }
    }
}
