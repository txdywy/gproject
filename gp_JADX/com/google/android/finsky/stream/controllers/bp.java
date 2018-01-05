package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v7.widget.ff;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.stream.controllers.view.PlayCardMerchClusterViewV2;
import com.squareup.leakcanary.C7582R;

public final class bp extends C4348b {
    public bp(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w);
    }

    protected final int mo4152b() {
        return C7582R.layout.play_card_mini;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_card_merch_cluster_v2;
    }

    public final void mo1510a(View view, int i) {
        boolean z;
        super.mo1510a(view, i);
        Document document = this.g.f14908a;
        PlayCardMerchClusterViewV2 playCardMerchClusterViewV2 = (PlayCardMerchClusterViewV2) view;
        OnClickListener a = this.f.mo3625a(new bq(this, document, playCardMerchClusterViewV2), document);
        C1473m.f7980a.be();
        bd bdVar = (bd) document.m14644c(14).get(0);
        String str = document.f14885a.f12100g;
        playCardMerchClusterViewV2.f23011n = C1607g.m9236a(bdVar, playCardMerchClusterViewV2.f23012o);
        playCardMerchClusterViewV2.f23010m.setVisibility(0);
        playCardMerchClusterViewV2.f23010m.setOnLoadedListener(playCardMerchClusterViewV2);
        playCardMerchClusterViewV2.f23006a.m9288a(playCardMerchClusterViewV2.f23010m, bdVar.f11860f, bdVar.f11863i);
        if (playCardMerchClusterViewV2.f23010m.getDrawable() != null) {
            playCardMerchClusterViewV2.m21033c();
        } else {
            playCardMerchClusterViewV2.f23010m.m16023b();
        }
        playCardMerchClusterViewV2.f23010m.setOnClickListener(a);
        FadingEdgeImageView fadingEdgeImageView = playCardMerchClusterViewV2.f23010m;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        fadingEdgeImageView.setClickable(z);
        playCardMerchClusterViewV2.f23010m.setContentDescription(a != null ? str : null);
        playCardMerchClusterViewV2.f23009l.setVisibility(0);
        playCardMerchClusterViewV2.f23009l.setBackgroundColor(playCardMerchClusterViewV2.f23011n);
    }
}
