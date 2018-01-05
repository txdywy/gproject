package com.google.android.finsky.detailspage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.finsky.dfemodel.Document;

final class bz implements OnItemSelectedListener {
    public final /* synthetic */ EpisodeListModuleLayout f14352a;

    bz(EpisodeListModuleLayout episodeListModuleLayout) {
        this.f14352a = episodeListModuleLayout;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f14352a.f14001o.mo3060b((Document) adapterView.getAdapter().getItem(i));
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
