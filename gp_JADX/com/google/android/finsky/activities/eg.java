package com.google.android.finsky.activities;

import android.support.v4.view.ai;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

final class eg implements C1031w {
    public final /* synthetic */ ef f6704a;

    eg(ef efVar) {
        this.f6704a = efVar;
    }

    public final void m_() {
        C1045b c1045b = this.f6704a;
        int min = Math.min(c1045b.aj.m14698m(), 3);
        if (min != 0) {
            String str;
            int i;
            Document document = c1045b.aj.f14908a;
            ad c2473o = new C2473o(400, document.f14885a.f12087D, c1045b);
            LayoutInflater from = LayoutInflater.from(c1045b.bn);
            ViewGroup viewGroup = (ViewGroup) c1045b.m6507b((int) C7582R.id.suggestion_cluster);
            viewGroup.removeAllViews();
            PlayCardClusterViewHeader playCardClusterViewHeader = (PlayCardClusterViewHeader) from.inflate(C7582R.layout.play_card_cluster_header, viewGroup, false);
            int dimensionPixelSize = c1045b.bn.getResources().getDimensionPixelSize(C7582R.dimen.inline_cluster_xpadding);
            ai.m1823a(playCardClusterViewHeader, dimensionPixelSize, 0, dimensionPixelSize, 0);
            Document document2 = c1045b.aj.f14908a;
            if (TextUtils.isEmpty(c1045b.ai.f12776c)) {
                str = document2.f14885a.f12100g;
            } else {
                str = c1045b.ai.f12776c;
            }
            eh ehVar = new eh(c1045b, str, c2473o);
            String a = c1045b.ag.ct().m19769a(c1045b.bn, document2, 3, c1045b.ai.f12779f, true);
            C2712a c2712a = c1045b.aj;
            if (c2712a.m14707c()) {
                i = c2712a.f14908a.f14885a.f12099f;
            } else {
                i = 0;
            }
            playCardClusterViewHeader.m19879a(i, str, null, a, ehVar);
            viewGroup.addView(playCardClusterViewHeader);
            for (int i2 = 0; i2 < min; i2++) {
                document2 = (Document) c1045b.aj.m14679a(i2, true);
                ViewGroup viewGroup2 = (ViewGroup) from.inflate(C7582R.layout.bucket_row, viewGroup, false);
                viewGroup2.setPadding(0, 0, 0, 0);
                d dVar = (d) from.inflate(C7582R.layout.play_card_wide, viewGroup2, false);
                C1473m.f7980a.cr().m18518a(dVar, document2, document.f14885a.f12096c, c1045b.bp, c2473o, c1045b.bw);
                viewGroup2.addView(dVar);
                viewGroup.addView(viewGroup2);
            }
            viewGroup.requestLayout();
        }
    }
}
