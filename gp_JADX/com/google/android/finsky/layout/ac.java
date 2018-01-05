package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class ac implements OnClickListener {
    public final /* synthetic */ EpisodeSnippet f18427a;

    ac(EpisodeSnippet episodeSnippet) {
        this.f18427a = episodeSnippet;
    }

    public final void onClick(View view) {
        EpisodeSnippet episodeSnippet = this.f18427a;
        episodeSnippet.m17297a(episodeSnippet.m17302c() ? 8 : 0);
        episodeSnippet = this.f18427a;
        episodeSnippet.f18186y.m13379b(new C2475d(episodeSnippet.f18185x).m13256a(episodeSnippet.m17302c() ? 271 : 272));
    }
}
