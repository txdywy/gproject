package android.support.v4.view;

import android.database.DataSetObserver;

final class bk extends DataSetObserver {
    public final /* synthetic */ ViewPager f1881a;

    bk(ViewPager viewPager) {
        this.f1881a = viewPager;
    }

    public final void onChanged() {
        this.f1881a.m1755a();
    }

    public final void onInvalidated() {
        this.f1881a.m1755a();
    }
}
