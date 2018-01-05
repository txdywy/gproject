package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public final class C1576f extends C1574v {
    public C1612l f8389a;

    public final void mo1292a(Activity activity) {
        ((C1347t) C3947d.m18649a(C1347t.class)).mo1716a(this);
        super.mo1292a(activity);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        FifeImageView fifeImageView = (FifeImageView) a.findViewById(C7582R.id.family_library_step1_image);
        bd b = this.ag.mo2346b();
        if (b != null) {
            this.f8389a.m9288a(fifeImageView, b.f11860f, b.f11863i);
        }
        m9114a(a, (int) C7582R.id.future_purchase_title, 5);
        m9114a(a, (int) C7582R.id.future_purchase_body, 6);
        ((ImageView) a.findViewById(C7582R.id.family_library_icon)).setImageDrawable(C0722q.m4782a(m605i(), (int) C7582R.raw.ic_family_24px, new as()));
        m9114a(a, (int) C7582R.id.family_library_icon_description, 20);
        return a;
    }

    public final boolean am() {
        String a = this.ag.mo2345a(17);
        String a2 = this.ag.mo2345a(22);
        if (TextUtils.isEmpty(a2)) {
            aq();
        } else {
            new C1508k().m8859c(a).m8852a(a2).m8860d((int) C7582R.string.continue_sign_up).m8862e((int) C7582R.string.exit).m8851a(this, 1, null).mo2272a().m625a(this.f730B, "FamilyLibraryStep1.confirmDialog");
        }
        return true;
    }

    public final void mo1211b(int i, Bundle bundle) {
        aq();
    }

    protected final int aj() {
        return C7582R.layout.family_library_onboarding_step1;
    }

    protected final void ao() {
        C1581k c1581k = this.al;
        C1573p c1577g = new C1577g();
        c1577g.al = c1581k;
        c1581k.e.mo2348d().m9155a(c1577g, true);
    }

    protected final int ap() {
        return 5228;
    }
}
