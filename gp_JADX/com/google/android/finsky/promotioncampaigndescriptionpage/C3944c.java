package com.google.android.finsky.promotioncampaigndescriptionpage;

import android.os.Bundle;
import android.transition.Transition;
import android.view.LayoutInflater;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.hm;
import com.google.android.finsky.layout.PromotionCampaignDescriptionContainer;
import com.google.android.finsky.layout.PromotionCampaignDescriptionRowView;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.promotioncampaigndescriptionpage.PromotionCampaignDescriptionData.PromotionCampaignDescriptionRow;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C3944c extends C1045b {
    public PromotionCampaignDescriptionData f19934a;
    public ce f19935c = C2482j.m13283a(26);

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.bw.m13370a(new C2488p().m13345b(this));
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.f19934a = (PromotionCampaignDescriptionData) this.f760q.getParcelable("reward_details_data");
        ac();
        cg_();
        this.bq.mo1267c();
    }

    protected final Transition ae() {
        return null;
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3166e(contentFrame, C7582R.id.page_content, C7582R.id.page_error_indicator, C7582R.id.loading_indicator, this, 2);
    }

    public final void ac() {
        this.bm.mo1241c(m605i().getString(C7582R.string.reward_details_page_title));
        this.bm.mo1237a(this.f19934a.f19932a, false);
        this.bm.mo1246z();
    }

    protected final int mo1298Z() {
        return C7582R.layout.promotion_campaign_description_page_fragment;
    }

    protected final void aa() {
    }

    protected final void cg_() {
        PromotionCampaignDescriptionContainer promotionCampaignDescriptionContainer = (PromotionCampaignDescriptionContainer) this.f746R.findViewById(C7582R.id.details_container);
        PromotionCampaignDescriptionData promotionCampaignDescriptionData = this.f19934a;
        promotionCampaignDescriptionContainer.f18279a.removeAllViews();
        LayoutInflater from = LayoutInflater.from(promotionCampaignDescriptionContainer.getContext());
        C1473m.f7980a.be();
        List list = promotionCampaignDescriptionData.f19933b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PromotionCampaignDescriptionRowView promotionCampaignDescriptionRowView = (PromotionCampaignDescriptionRowView) from.inflate(C7582R.layout.promotion_campaign_description_row, promotionCampaignDescriptionContainer.f18279a, false);
            hm hmVar = ((PromotionCampaignDescriptionRow) list.get(i)).f19931a;
            if (hmVar.f12582c == null) {
                promotionCampaignDescriptionRowView.f18280a.setVisibility(4);
            } else {
                C1473m.f7980a.bR();
                af.m9224a(promotionCampaignDescriptionRowView.f18280a, hmVar.f12582c);
                C1473m.f7980a.ar().m9288a(promotionCampaignDescriptionRowView.f18280a, hmVar.f12582c.f11860f, hmVar.f12582c.f11863i);
                promotionCampaignDescriptionRowView.f18280a.setVisibility(0);
            }
            ae.m9217a(promotionCampaignDescriptionRowView.f18281b, hmVar.f12583d);
            promotionCampaignDescriptionContainer.f18279a.addView(promotionCampaignDescriptionRowView);
        }
        this.bq.mo1263a(m605i().getString(C7582R.string.reward_details_page_title), promotionCampaignDescriptionContainer);
    }

    public final void mo138d() {
        this.bq.mo1273h();
        super.mo138d();
    }

    public final int Y_() {
        return this.bn.getResources().getColor(C7582R.color.play_fg_primary);
    }

    public final ce getPlayStoreUiElement() {
        return this.f19935c;
    }
}
