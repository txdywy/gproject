package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.p040a.C0394a;
import android.support.v7.widget.hc;

final class af implements C0406f {
    public final /* synthetic */ ad f2263a;

    af(ad adVar) {
        this.f2263a = adVar;
    }

    public final Drawable mo509a() {
        hc a = hc.m3768a(this.f2263a.m2389n(), null, new int[]{C0394a.homeAsUpIndicator});
        Drawable a2 = a.m3771a(0);
        a.f3558b.recycle();
        return a2;
    }

    public final Context mo512b() {
        return this.f2263a.m2389n();
    }

    public final boolean mo513c() {
        C0404a a = this.f2263a.mo500a();
        return (a == null || (a.mo569b() & 4) == 0) ? false : true;
    }

    public final void mo511a(Drawable drawable, int i) {
        C0404a a = this.f2263a.mo500a();
        if (a != null) {
            a.mo575c(drawable);
            a.mo570b(i);
        }
    }

    public final void mo510a(int i) {
        C0404a a = this.f2263a.mo500a();
        if (a != null) {
            a.mo570b(i);
        }
    }
}
