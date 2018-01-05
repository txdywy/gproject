package android.support.design.widget;

import android.support.v4.view.ViewPager;
import android.support.v4.view.af;
import android.support.v4.view.bh;

final class cd implements bh {
    public boolean f917a;
    public final /* synthetic */ TabLayout f918b;

    cd(TabLayout tabLayout) {
        this.f918b = tabLayout;
    }

    public final void mo178a(ViewPager viewPager, af afVar) {
        if (this.f918b.f679D == viewPager) {
            this.f918b.m528a(afVar, this.f917a);
        }
    }
}
