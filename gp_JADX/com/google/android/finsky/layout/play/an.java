package com.google.android.finsky.layout.play;

import android.database.DataSetObserver;
import android.view.View;
import com.google.android.finsky.bg.ai;

final class an extends DataSetObserver {
    public final /* synthetic */ PlayListView f18770a;

    an(PlayListView playListView) {
        this.f18770a = playListView;
    }

    public final void onChanged() {
        View view = this.f18770a;
        view.f18736c.clear();
        if (ai.m9229a(view) && view.getChildCount() != 0) {
            view.m17570a(view);
        }
    }

    public final void onInvalidated() {
        View view = this.f18770a;
        view.f18736c.clear();
        if (ai.m9229a(view) && view.getChildCount() != 0) {
            view.m17570a(view);
        }
    }
}
