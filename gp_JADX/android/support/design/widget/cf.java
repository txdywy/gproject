package android.support.design.widget;

import android.database.DataSetObserver;

final class cf extends DataSetObserver {
    public final /* synthetic */ TabLayout f919a;

    cf(TabLayout tabLayout) {
        this.f919a = tabLayout;
    }

    public final void onChanged() {
        this.f919a.m524a();
    }

    public final void onInvalidated() {
        this.f919a.m524a();
    }
}
