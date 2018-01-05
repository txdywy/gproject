package android.support.v4.widget;

import android.database.DataSetObserver;

final class C0385q extends DataSetObserver {
    public final /* synthetic */ C0370o f2186a;

    C0385q(C0370o c0370o) {
        this.f2186a = c0370o;
    }

    public final void onChanged() {
        this.f2186a.f2080a = true;
        this.f2186a.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        this.f2186a.f2080a = false;
        this.f2186a.notifyDataSetInvalidated();
    }
}
