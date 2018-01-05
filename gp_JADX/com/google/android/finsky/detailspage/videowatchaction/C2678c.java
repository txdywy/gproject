package com.google.android.finsky.detailspage.videowatchaction;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class C2678c implements OnItemClickListener {
    public final /* synthetic */ VideoWatchActionsModuleLayout f14785a;

    C2678c(VideoWatchActionsModuleLayout videoWatchActionsModuleLayout) {
        this.f14785a = videoWatchActionsModuleLayout;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f14785a.f14764f != null) {
            this.f14785a.f14764f.mo3109b((int) j);
        }
    }
}
