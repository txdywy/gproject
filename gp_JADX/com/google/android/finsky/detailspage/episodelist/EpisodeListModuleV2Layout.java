package com.google.android.finsky.detailspage.episodelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.layout.EpisodeSnippet;
import com.google.android.finsky.layout.af;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public class EpisodeListModuleV2Layout extends LinearLayout implements af {
    public boolean f14499a;
    public ad f14500b;
    public C2495w f14501c;
    public C3748a f14502d;
    public LinearLayout f14503e;
    public LinearLayout f14504f;
    public Button f14505g;
    public View f14506h;
    public TextView f14507i;
    public C2643h f14508j;

    public EpisodeListModuleV2Layout(Context context) {
        super(context);
    }

    public EpisodeListModuleV2Layout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EpisodeListModuleV2Layout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14503e = (LinearLayout) findViewById(C7582R.id.episodes);
        this.f14506h = findViewById(C7582R.id.overlay);
        this.f14504f = (LinearLayout) findViewById(C7582R.id.error_indicator);
        this.f14505g = (Button) findViewById(C7582R.id.retry_button);
        this.f14507i = (TextView) findViewById(C7582R.id.filter_toggle);
    }

    public final void mo3002a(EpisodeSnippet episodeSnippet) {
        int childCount = this.f14503e.getChildCount();
        for (int i = 0; i < childCount; i++) {
            EpisodeSnippet episodeSnippet2 = (EpisodeSnippet) this.f14503e.getChildAt(i);
            if (episodeSnippet2 != episodeSnippet) {
                episodeSnippet2.m17301b();
            }
        }
        if (episodeSnippet.m17302c()) {
            this.f14508j.mo3089a(episodeSnippet.getEpisode());
        } else {
            this.f14508j.mo3089a(null);
        }
    }
}
