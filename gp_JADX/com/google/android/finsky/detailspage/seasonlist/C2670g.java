package com.google.android.finsky.detailspage.seasonlist;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class C2670g implements OnItemClickListener {
    public final /* synthetic */ SeasonListModuleLayout f14751a;

    C2670g(SeasonListModuleLayout seasonListModuleLayout) {
        this.f14751a = seasonListModuleLayout;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f14751a.f14729k != null) {
            this.f14751a.f14729k.mo3103b((int) j);
        }
    }
}
