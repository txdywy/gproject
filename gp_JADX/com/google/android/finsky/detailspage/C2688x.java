package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class C2688x extends ej implements C0999d {
    public boolean f14816d;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.bundle_card_cluster_module;
    }

    protected final ek mo3047a(Document document) {
        if (document.f14885a.f12098e != 6 || !document.bp() || TextUtils.isEmpty(document.bq())) {
            return null;
        }
        ek ekVar = new ek();
        ekVar.f14357d = document.bq();
        return ekVar;
    }

    public final boolean mo2979f() {
        return super.mo2979f() && ((ek) this.b).f14358e.m14698m() != 0;
    }

    public final void mo2976b(View view, int i) {
        BundleCardClusterModuleLayout bundleCardClusterModuleLayout = (BundleCardClusterModuleLayout) view;
        if (!bundleCardClusterModuleLayout.f13936e || this.f14816d) {
            this.f14816d = false;
            bundleCardClusterModuleLayout.m13743a(((ek) this.b).f14358e, this.z, this.I, 17, this.J);
        }
    }

    protected final void aa_() {
        this.D.mo2814a((C0999d) this);
        super.aa_();
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        super.mo2980h();
    }

    private final void m14527b() {
        if (mo2979f()) {
            this.f14816d = true;
            this.u.mo3033a(this, false);
        }
    }

    public final void m_() {
        m14527b();
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m14527b();
    }
}
