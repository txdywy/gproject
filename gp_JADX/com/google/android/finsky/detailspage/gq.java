package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.kt;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.play.PlayRoundedPillItemView;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class gq extends ck implements OnClickListener, ad {
    public ce f14644d = C2482j.m13283a(1871);

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.top_chart_ranking_info;
    }

    public final boolean mo2979f() {
        return (this.b == null || m14405a()) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (z && !m14405a() && document.cd()) {
            if (this.b == null) {
                this.b = new gr();
            }
            ((gr) this.b).f14648d = document.f14885a.f12099f;
            kt ktVar = document.cd() ? document.f14885a.f12115v.f13118Y : null;
            ((gr) this.b).f14645a = ktVar.f12959b;
            ((gr) this.b).f14646b = ktVar.f12961d;
            ((gr) this.b).f14647c = ktVar.f12960c;
        }
    }

    public final void mo2976b(View view, int i) {
        if (!TextUtils.isEmpty(((gr) this.b).f14645a)) {
            boolean a = C1473m.f7980a.dj().mo2294a(12632790);
            TopChartRankingInfoModuleLayout topChartRankingInfoModuleLayout = (TopChartRankingInfoModuleLayout) view;
            CharSequence charSequence = ((gr) this.b).f14645a;
            CharSequence charSequence2 = ((gr) this.b).f14646b;
            PlayRoundedPillItemView playRoundedPillItemView = topChartRankingInfoModuleLayout.f14197b;
            if (playRoundedPillItemView.f18740a != null) {
                playRoundedPillItemView.f18740a.setText(charSequence2);
            }
            if (a) {
                topChartRankingInfoModuleLayout.f14198c.setText(charSequence);
                topChartRankingInfoModuleLayout.f14198c.setVisibility(0);
                topChartRankingInfoModuleLayout.f14196a.setVisibility(8);
            } else {
                topChartRankingInfoModuleLayout.f14196a.setText(charSequence);
                topChartRankingInfoModuleLayout.f14196a.setVisibility(0);
                topChartRankingInfoModuleLayout.f14198c.setVisibility(8);
            }
            topChartRankingInfoModuleLayout.setOnClickListener(this);
            topChartRankingInfoModuleLayout.setOnClickListener(this);
            if (this.I != null) {
                this.I.mo1219a(this);
            }
        }
    }

    private static boolean m14405a() {
        return !C1473m.f7980a.dj().mo2294a(12632795);
    }

    public void onClick(View view) {
        this.J.m13379b(new C2475d(this));
        this.z.mo3641a(((gr) this.b).f14647c, null, this.v, this.t.getPackageManager(), null, null, 0, ((gr) this.b).f14648d, null, 0, this.J);
    }

    public ce getPlayStoreUiElement() {
        return this.f14644d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
