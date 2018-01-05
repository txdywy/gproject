package android.support.v7.widget;

import android.support.v7.view.menu.C0471p;
import android.view.View;

final class C0505n implements Runnable {
    public C0508q f3646a;
    public final /* synthetic */ C0502k f3647b;

    public C0505n(C0502k c0502k, C0508q c0508q) {
        this.f3647b = c0502k;
        this.f3646a = c0508q;
    }

    public final void run() {
        if (this.f3647b.c != null) {
            C0471p c0471p = this.f3647b.c;
            if (c0471p.f2719f != null) {
                c0471p.f2719f.mo524a(c0471p);
            }
        }
        View view = (View) this.f3647b.h;
        if (!(view == null || view.getWindowToken() == null || !this.f3646a.m2790b())) {
            this.f3647b.f3641x = this.f3646a;
        }
        this.f3647b.f3643z = null;
    }
}
