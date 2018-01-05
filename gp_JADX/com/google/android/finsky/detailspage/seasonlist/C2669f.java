package com.google.android.finsky.detailspage.seasonlist;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.finsky.dfemodel.Document;

final class C2669f implements OnItemSelectedListener {
    public final /* synthetic */ SeasonListModuleLayout f14750a;

    C2669f(SeasonListModuleLayout seasonListModuleLayout) {
        this.f14750a = seasonListModuleLayout;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f14750a.f14728j = (Document) adapterView.getAdapter().getItem(i);
        if (this.f14750a.f14729k != null) {
            this.f14750a.f14729k.mo3101a(this.f14750a.f14728j);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
