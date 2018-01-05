package com.google.android.finsky.detailspage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class dx extends ck implements OnClickListener, ad {
    public final C1552e f14444d = C1473m.f7980a.dj();
    public final boolean f14445e = this.f14444d.mo2294a(12620435);
    public final boolean f14446f = this.f14444d.mo2294a(12620436);
    public final boolean f14447g = this.f14444d.mo2294a(12620437);
    public ce f14448h;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.reviews_statistics_module;
    }

    public final boolean mo2979f() {
        if (this.b != null) {
            Object obj;
            if (!((dy) this.b).f14449a.bn() || ((dy) this.b).f14449a.m14622K() == 0) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (document2 != null && !TextUtils.isEmpty(document2.f14885a.f12118y) && z) {
            C1473m.f7980a.mo2253l();
            if (!C2833a.m14982c(document2) && this.b == null) {
                this.b = new dy();
                ((dy) this.b).f14449a = document2;
            }
        }
    }

    public final void mo2976b(View view, int i) {
        ReviewsStatisticsModuleLayout reviewsStatisticsModuleLayout = (ReviewsStatisticsModuleLayout) view;
        if (!reviewsStatisticsModuleLayout.f14043a) {
            String string;
            long K = ((dy) this.b).f14449a.m14622K();
            float a = aa.m9201a(((dy) this.b).f14449a.m14621J());
            int[] L = ((dy) this.b).f14449a.m14623L();
            String str = "";
            Resources resources = this.t.getResources();
            if (((dy) this.b).f14449a.f14885a.f12099f == 3) {
                if (this.f14445e) {
                    string = resources.getString(C7582R.string.review_statistics_6_months_title);
                } else if (this.f14446f) {
                    string = resources.getString(C7582R.string.review_statistics_3_months_title);
                } else if (this.f14447g) {
                    string = resources.getString(C7582R.string.review_statistics_30_days_title);
                }
                string = string.toUpperCase(this.t.getResources().getConfiguration().locale);
                reviewsStatisticsModuleLayout.f14043a = true;
                reviewsStatisticsModuleLayout.f14047e = string;
                reviewsStatisticsModuleLayout.f14044b.m17307a(K, a, L);
                if (TextUtils.isEmpty(reviewsStatisticsModuleLayout.f14047e)) {
                    reviewsStatisticsModuleLayout.setWillNotDraw(false);
                    reviewsStatisticsModuleLayout.f14045c.setText(reviewsStatisticsModuleLayout.f14047e);
                    reviewsStatisticsModuleLayout.f14045c.setVisibility(0);
                    ((MarginLayoutParams) reviewsStatisticsModuleLayout.f14044b.getLayoutParams()).topMargin = 0;
                    reviewsStatisticsModuleLayout.f14044b.setPadding(reviewsStatisticsModuleLayout.f14044b.getPaddingLeft(), 0, reviewsStatisticsModuleLayout.f14044b.getPaddingRight(), reviewsStatisticsModuleLayout.f14044b.getPaddingBottom());
                } else {
                    reviewsStatisticsModuleLayout.setWillNotDraw(true);
                    reviewsStatisticsModuleLayout.f14045c.setVisibility(8);
                }
                if (!C1473m.f7980a.mo2035O().m8839b()) {
                    reviewsStatisticsModuleLayout.setOnClickListener(this);
                }
                getParentNode().mo1219a(this);
            }
            string = str;
            string = string.toUpperCase(this.t.getResources().getConfiguration().locale);
            reviewsStatisticsModuleLayout.f14043a = true;
            reviewsStatisticsModuleLayout.f14047e = string;
            reviewsStatisticsModuleLayout.f14044b.m17307a(K, a, L);
            if (TextUtils.isEmpty(reviewsStatisticsModuleLayout.f14047e)) {
                reviewsStatisticsModuleLayout.setWillNotDraw(true);
                reviewsStatisticsModuleLayout.f14045c.setVisibility(8);
            } else {
                reviewsStatisticsModuleLayout.setWillNotDraw(false);
                reviewsStatisticsModuleLayout.f14045c.setText(reviewsStatisticsModuleLayout.f14047e);
                reviewsStatisticsModuleLayout.f14045c.setVisibility(0);
                ((MarginLayoutParams) reviewsStatisticsModuleLayout.f14044b.getLayoutParams()).topMargin = 0;
                reviewsStatisticsModuleLayout.f14044b.setPadding(reviewsStatisticsModuleLayout.f14044b.getPaddingLeft(), 0, reviewsStatisticsModuleLayout.f14044b.getPaddingRight(), reviewsStatisticsModuleLayout.f14044b.getPaddingBottom());
            }
            if (C1473m.f7980a.mo2035O().m8839b()) {
                reviewsStatisticsModuleLayout.setOnClickListener(this);
            }
            getParentNode().mo1219a(this);
        }
    }

    public void onClick(View view) {
        this.J.m13379b(new C2475d(this));
        this.z.mo3660a(((dy) this.b).f14449a, ((dy) this.b).f14449a.f14885a.f12118y, false, this.J);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14448h == null) {
            this.f14448h = C2482j.m13283a(1218);
        }
        return this.f14448h;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
