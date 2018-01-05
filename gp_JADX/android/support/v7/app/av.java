package android.support.v7.app;

import android.support.v4.view.ai;

final class av implements Runnable {
    public final /* synthetic */ aq f2310a;

    av(aq aqVar) {
        this.f2310a = aqVar;
    }

    public final void run() {
        this.f2310a.f2270D.showAtLocation(this.f2310a.f2269C, 55, 0, 0);
        this.f2310a.m2442q();
        if (this.f2310a.m2441p()) {
            this.f2310a.f2269C.setAlpha(0.0f);
            this.f2310a.f2272F = ai.m1852h(this.f2310a.f2269C).m1993a(1.0f);
            this.f2310a.f2272F.m1995a(new aw(this));
            return;
        }
        this.f2310a.f2269C.setAlpha(1.0f);
        this.f2310a.f2269C.setVisibility(0);
    }
}
