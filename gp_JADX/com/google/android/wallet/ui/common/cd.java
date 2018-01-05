package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.support.v4.view.r;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.aj;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;

public final class cd extends C6665h {
    @TargetApi(17)
    public final Dialog mo5575W() {
        aj ajVar = (aj) ParcelableProto.m29887a(this.q, "tooltipProto");
        View inflate = m30140Y().inflate(C6623g.view_tooltip_dialog, null);
        InfoMessageView infoMessageView = (InfoMessageView) inflate.findViewById(C6622f.info_message);
        infoMessageView.setInfoMessage(ajVar.c);
        if ((this.r instanceof C6527m) && ci.m30892f(m30139X())) {
            infoMessageView.setUrlClickListener((C6527m) this.r);
        }
        if (ajVar.d != null) {
            LayoutParams layoutParams;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C6622f.images_container);
            linearLayout.setVisibility(0);
            for (int i = 0; i < ajVar.d.length; i++) {
                LayoutParams layoutParams2;
                ad adVar = ajVar.d[i];
                View imageWithCaptionView = new ImageWithCaptionView(m30139X());
                if (C6600l.m29953a(adVar.c)) {
                    layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                } else if (adVar.e <= 0 || adVar.f <= 0) {
                    layoutParams2 = new LinearLayout.LayoutParams(i().getDimensionPixelSize(C6620d.wallet_uic_tooltip_dialog_image_default_width), -2);
                } else {
                    layoutParams2 = new LinearLayout.LayoutParams(adVar.e, adVar.f);
                }
                if (i != 0) {
                    layoutParams2.topMargin = i().getDimensionPixelSize(C6620d.wallet_uic_tooltip_margin_between_images);
                }
                imageWithCaptionView.m30637a(adVar, C6600l.m29933a(h().getApplicationContext()), ((Boolean) C6489e.f32495a.a()).booleanValue());
                imageWithCaptionView.setFadeIn(true);
                imageWithCaptionView.setAdjustViewBounds(true);
                linearLayout.addView(imageWithCaptionView, layoutParams2);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) infoMessageView.getLayoutParams();
            switch (ajVar.e) {
                case 1:
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(ci.m30835a(10));
                    layoutParams3.addRule(ci.m30835a(3), linearLayout.getId());
                    layoutParams3.topMargin = i().getDimensionPixelSize(C6620d.wallet_uic_tooltip_margin_between_image_text_vertical);
                    break;
                case 3:
                    layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(ci.m30835a(20));
                    layoutParams3.addRule(ci.m30835a(17), linearLayout.getId());
                    r.a(layoutParams3, i().getDimensionPixelSize(C6620d.wallet_uic_tooltip_margin_between_image_text_horizontal));
                    break;
                case 4:
                    layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(ci.m30835a(21));
                    layoutParams3.addRule(ci.m30835a(16), linearLayout.getId());
                    r.b(layoutParams3, i().getDimensionPixelSize(C6620d.wallet_uic_tooltip_margin_between_image_text_horizontal));
                    break;
                default:
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams3.addRule(ci.m30835a(10));
                    layoutParams.addRule(ci.m30835a(3), infoMessageView.getId());
                    layoutParams.topMargin = i().getDimensionPixelSize(C6620d.wallet_uic_tooltip_margin_between_image_text_vertical);
                    break;
            }
            infoMessageView.setLayoutParams(layoutParams3);
            linearLayout.setLayoutParams(layoutParams);
        }
        return new C6760a(m30139X()).m30717a(ajVar.b).m30716a(inflate).m30715a(C6625i.wallet_uic_close, null).m30713a();
    }
}
