package com.google.android.finsky.detailspage;

import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class cr extends ck implements ad {
    public ce f14369d;

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.footer_text_module;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null && z) {
            Object obj;
            if (c2719i.f14925a == null || c2719i.f14925a.f.length() == 0) {
                obj = null;
            } else {
                String str = c2719i.f14925a.f;
            }
            if (!TextUtils.isEmpty(obj)) {
                this.b = new cs();
                ((cs) this.b).f14370a = obj;
            }
        }
    }

    public final void mo2976b(View view, int i) {
        FooterTextModuleLayout footerTextModuleLayout = (FooterTextModuleLayout) view;
        if (!footerTextModuleLayout.f14021a) {
            footerTextModuleLayout.setText(Html.fromHtml(((cs) this.b).f14370a));
            footerTextModuleLayout.f14021a = true;
            getParentNode().mo1219a(this);
        }
    }

    public ce getPlayStoreUiElement() {
        if (this.f14369d == null) {
            this.f14369d = C2482j.m13283a(1876);
        }
        return this.f14369d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
