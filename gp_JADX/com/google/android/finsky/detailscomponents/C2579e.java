package com.google.android.finsky.detailscomponents;

import android.accounts.Account;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public final class C2579e {
    public Account f13764a;
    public DfeToc f13765b;
    public final C2233o f13766c;
    public C2206c f13767d;
    public C1461c f13768e;

    public C2579e(Account account, DfeToc dfeToc, C2233o c2233o, C2206c c2206c, C1461c c1461c) {
        this.f13764a = account;
        this.f13765b = dfeToc;
        this.f13766c = c2233o;
        this.f13767d = c2206c;
        this.f13768e = c1461c;
    }

    public final void m13630a(DetailsSummaryExtraLabelsSection detailsSummaryExtraLabelsSection, Document document, boolean z) {
        CharSequence charSequence;
        Object obj;
        Object obj2;
        Object obj3 = (this.f13768e.dj().mo2294a(12639546) || !document.m14658m()) ? null : 1;
        if (obj3 != null) {
            charSequence = document.m14659n().f13069c;
        } else {
            charSequence = null;
        }
        boolean ae = document.ae();
        boolean a = this.f13766c.m11649a(document, this.f13765b, this.f13767d.mo2811a(this.f13764a));
        C2441n N = document.m14625N();
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        boolean z2 = false;
        if (N != null) {
            String str;
            charSequence2 = N.f13170j;
            if (N.m13104d()) {
                str = N.f13184x;
            } else {
                str = null;
            }
            charSequence3 = str;
            z2 = N.f13180t;
        }
        Resources resources = detailsSummaryExtraLabelsSection.getContext().getResources();
        detailsSummaryExtraLabelsSection.f13698a.removeAllViews();
        detailsSummaryExtraLabelsSection.f13699b.removeAllViews();
        if (!z || TextUtils.isEmpty(charSequence2)) {
            obj = null;
        } else {
            DetailsSummaryExtraLabelsSection.m13577a(detailsSummaryExtraLabelsSection.f13700c, detailsSummaryExtraLabelsSection.f13698a, charSequence2);
            obj = 1;
        }
        if (obj3 != null) {
            DetailsSummaryExtraLabelsSection.m13577a(detailsSummaryExtraLabelsSection.f13700c, detailsSummaryExtraLabelsSection.f13698a, charSequence);
            obj2 = 1;
        } else {
            obj2 = obj;
        }
        if (!ae) {
            if (!TextUtils.isEmpty(charSequence3)) {
                DetailsSummaryExtraLabelsSection.m13577a(detailsSummaryExtraLabelsSection.f13700c, detailsSummaryExtraLabelsSection.f13699b, charSequence3);
                obj2 = 1;
            }
            if (z2) {
                DetailsSummaryExtraLabelsSection.m13577a(detailsSummaryExtraLabelsSection.f13700c, detailsSummaryExtraLabelsSection.f13699b, resources.getString(C7582R.string.in_app_purchases));
                obj2 = 1;
            }
        } else if (a) {
            DetailsSummaryExtraLabelsSection.m13577a(detailsSummaryExtraLabelsSection.f13700c, detailsSummaryExtraLabelsSection.f13699b, resources.getString(C7582R.string.preregistration_extra_label));
            obj2 = 1;
        }
        detailsSummaryExtraLabelsSection.setVisibility(obj2 != null ? 0 : 8);
    }
}
