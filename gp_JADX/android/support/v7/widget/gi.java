package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class gi implements OnItemClickListener {
    public final /* synthetic */ SearchView f3509a;

    gi(SearchView searchView) {
        this.f3509a = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f3509a.onItemClicked(i, 0, null);
    }
}
