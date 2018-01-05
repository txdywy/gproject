package android.support.v7.widget;

import android.database.DataSetObserver;

final class ds extends DataSetObserver {
    public final /* synthetic */ C0491do f3412a;

    ds(C0491do c0491do) {
        this.f3412a = c0491do;
    }

    public final void onChanged() {
        if (this.f3412a.f3153K.isShowing()) {
            this.f3412a.mo671b();
        }
    }

    public final void onInvalidated() {
        this.f3412a.mo674c();
    }
}
