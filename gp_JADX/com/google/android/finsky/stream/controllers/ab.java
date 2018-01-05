package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.support.v7.widget.ff;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.controllers.view.C4505c;
import com.google.android.finsky.stream.controllers.view.FlatCardMerchClusterView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class ab extends C4302k {
    public int mo1509a(int i) {
        return C7582R.layout.flat_card_merch_cluster;
    }

    public ab(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, ao aoVar, C4254d c4254d, boolean z, ac acVar) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w, afVar, aoVar, c4254d, z, acVar);
    }

    protected final int mo4099b() {
        return this.p.m18478a(false);
    }

    public final void mo1510a(View view, int i) {
        boolean z;
        Bundle bundle;
        CharSequence charSequence = null;
        boolean z2 = true;
        super.mo1510a(view, i);
        Document document = this.g.f14908a;
        FlatCardMerchClusterView flatCardMerchClusterView = (FlatCardMerchClusterView) view;
        bd c = m19943c(20);
        bd c2 = m19943c(19);
        if (c != null) {
            c2 = c;
            z = true;
        } else if (c2 != null) {
            z = false;
        } else {
            c2 = null;
            z = true;
        }
        if (this.D != null) {
            bundle = ((C4470o) this.D).f22725a;
        } else {
            bundle = null;
        }
        if (c2 != null) {
            boolean z3;
            OnClickListener a = this.f.mo3625a(new ac(this, document, flatCardMerchClusterView), document);
            String str = document.f14885a.f12100g;
            flatCardMerchClusterView.f22878l = z;
            if (z) {
                flatCardMerchClusterView.f22880n = C1607g.m9236a(c2, flatCardMerchClusterView.f22881o);
            } else {
                flatCardMerchClusterView.f22880n = C0216d.m1116c(flatCardMerchClusterView.getContext(), C7582R.color.flat_card_cluster_light_background);
            }
            flatCardMerchClusterView.getCardViewGroupDelegate().mo3864a(flatCardMerchClusterView, flatCardMerchClusterView.f22880n);
            flatCardMerchClusterView.f22883q = 2;
            flatCardMerchClusterView.f22876j.m9288a(flatCardMerchClusterView.f22877k, c2.f11860f, c2.f11863i);
            flatCardMerchClusterView.f22877k.setOnClickListener(a);
            FadingEdgeImageView fadingEdgeImageView = flatCardMerchClusterView.f22877k;
            if (a != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            fadingEdgeImageView.setClickable(z3);
            FadingEdgeImageView fadingEdgeImageView2 = flatCardMerchClusterView.f22877k;
            if (a != null) {
                charSequence = str;
            }
            fadingEdgeImageView2.setContentDescription(charSequence);
            if (z) {
                flatCardMerchClusterView.f22879m.setVisibility(0);
            } else {
                flatCardMerchClusterView.f22879m.setVisibility(8);
            }
            if (bundle != null) {
                flatCardMerchClusterView.f22884r = bundle.getFloat("FlatCardMerchClusterView.interpolationAmount", 0.0f);
                FifeImageView fifeImageView = flatCardMerchClusterView.f22877k;
                if (flatCardMerchClusterView.f22884r != 0.0f) {
                    z2 = false;
                }
                fifeImageView.setToFadeInAfterLoad(z2);
                flatCardMerchClusterView.m21000a(z);
            }
            flatCardMerchClusterView.f22882p = new C4505c(flatCardMerchClusterView, z);
            flatCardMerchClusterView.c.mo2951a(flatCardMerchClusterView.f22882p);
            return;
        }
        FinskyLog.m21667d("Missing Feature Image for Cardster Editorial Cluster", new Object[0]);
    }

    protected final int mo4102e() {
        if (m19943c(20) == null && m19943c(19) != null) {
            return 0;
        }
        return 2;
    }

    protected boolean mo4101d() {
        if ((this.g.f14908a.cw().f12352a & 1) != 0) {
            return this.g.f14908a.cw().f12353b;
        }
        FinskyLog.m21669e("Editorial Cluster Theme not defined.", new Object[0]);
        return false;
    }

    final bd m19943c(int i) {
        List c = this.g.f14908a.m14644c(i);
        if (c != null) {
            return (bd) c.get(0);
        }
        return null;
    }
}
