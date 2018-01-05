package android.support.v7.widget;

import android.support.v4.view.ai;

final class dv implements Runnable {
    public final /* synthetic */ C0491do f3415a;

    dv(C0491do c0491do) {
        this.f3415a = c0491do;
    }

    public final void run() {
        if (this.f3415a.f3156i != null) {
            if (ai.f1848a.mo410t(this.f3415a.f3156i) && this.f3415a.f3156i.getCount() > this.f3415a.f3156i.getChildCount() && this.f3415a.f3156i.getChildCount() <= this.f3415a.f3168u) {
                this.f3415a.f3153K.setInputMethodMode(2);
                this.f3415a.mo671b();
            }
        }
    }
}
