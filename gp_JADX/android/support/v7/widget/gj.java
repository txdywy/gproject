package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class gj implements OnItemSelectedListener {
    public final /* synthetic */ SearchView f3510a;

    gj(SearchView searchView) {
        this.f3510a = searchView;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f3510a.onItemSelected(i);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
