package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.m;
import com.google.wireless.android.finsky.dfe.h.a.c;
import com.google.wireless.android.finsky.dfe.h.a.d;
import com.squareup.leakcanary.C7582R;

public final class C1575e extends C1574v implements OnClickListener, m {
    public C1612l f8388a;

    public final void mo1292a(Activity activity) {
        ((C1347t) C3947d.m18649a(C1347t.class)).mo1715a(this);
        super.mo1292a(activity);
    }

    protected final int aj() {
        return C7582R.layout.family_onboarding_benefits;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        d c = this.ag.mo2347c();
        ((TextView) a.findViewById(C7582R.id.family_benefits_title)).setText(c.d);
        ae.m9218a((TextView) a.findViewById(C7582R.id.family_benefits_footer), c.f, (m) this);
        ((TextView) a.findViewById(C7582R.id.continue_text)).setText(c.g);
        ViewGroup viewGroup2 = (ViewGroup) a.findViewById(C7582R.id.benefits_list);
        for (c cVar : c.e) {
            View inflate = layoutInflater.inflate(C7582R.layout.family_benefits_row, viewGroup2, false);
            this.f8388a.m9288a((FifeImageView) inflate.findViewById(C7582R.id.family_benefit_row_image), cVar.e.f11860f, cVar.e.f11863i);
            ((TextView) inflate.findViewById(C7582R.id.family_benefit_row_headline_text)).setText(cVar.c);
            ((TextView) inflate.findViewById(C7582R.id.family_benefit_row_summary_text)).setText(cVar.d);
            viewGroup2.addView(inflate);
        }
        ((C1587s) m603h()).mo3311a(a, c, this);
        return a;
    }

    protected final void ao() {
        this.ag.mo2348d().m9156b();
    }

    protected final int ap() {
        return 5227;
    }

    public final void m9120a(View view, String str) {
        ((C1587s) m603h()).mo3310C();
    }
}
