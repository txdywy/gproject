package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class dn extends ck implements ad, du {
    public boolean f14426d;
    public ce f14427e;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.review_snippets_module;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((dr) this.b).f14431b == null || ((dr) this.b).f14431b.isEmpty()) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (document != null && !TextUtils.isEmpty(document.f14885a.f12084A) && z) {
            C1473m.f7980a.mo2253l();
            if (!C2833a.m14982c(document2)) {
                if (this.b == null) {
                    this.b = new dr();
                    this.w.mo1639d(document.f14885a.f12084A, new C2640do(this), new dp());
                }
                ((dr) this.b).f14430a = document;
            }
        }
    }

    public final void mo2980h() {
        this.f14426d = true;
    }

    public final void mo2976b(View view, int i) {
        ReviewSnippetsModuleLayout reviewSnippetsModuleLayout = (ReviewSnippetsModuleLayout) view;
        if (!reviewSnippetsModuleLayout.f13925h) {
            boolean z = !C1473m.f7980a.mo2035O().m8839b();
            reviewSnippetsModuleLayout.m13779b(((dr) this.b).f14431b, ((dr) this.b).f14430a, z, this.z, this.I);
            reviewSnippetsModuleLayout.setReviewSnippetClickListener(this);
            if (z) {
                reviewSnippetsModuleLayout.setAllReviewsClickListener(new dq(this));
            }
            this.I.mo1219a(this);
        }
    }

    public final void mo3072a(dv dvVar) {
        if (!TextUtils.isEmpty(dvVar.f14438d)) {
            this.J.m13379b(new C2475d(this).m13256a(1216));
            this.z.mo3660a(((dr) this.b).f14430a, dvVar.f14438d, false, this.J);
        }
    }

    public ce getPlayStoreUiElement() {
        if (this.f14427e == null) {
            this.f14427e = C2482j.m13283a(1215);
        }
        return this.f14427e;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
