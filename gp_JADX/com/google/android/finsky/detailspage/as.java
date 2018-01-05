package com.google.android.finsky.detailspage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;

final class as extends fe {
    public final /* synthetic */ aq f14257a;

    as(aq aqVar) {
        this.f14257a = aqVar;
    }

    public final void mo2913a(RecyclerView recyclerView, int i) {
        if (this.f14257a.aS && i == 1) {
            this.f14257a.aS = false;
            if (this.f14257a.aG != null) {
                this.f14257a.aG.setForceShowToolbar(false);
                this.f14257a.aG.setHeaderMode(0);
            }
            recyclerView.mo2952b((fe) this);
        }
    }
}
