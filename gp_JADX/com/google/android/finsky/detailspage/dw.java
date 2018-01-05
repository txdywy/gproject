package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class dw extends C2641k {
    protected final boolean mo3076a(boolean z, Document document) {
        return z && document != null && !TextUtils.isEmpty(document.f14885a.f12118y) && TextUtils.isEmpty(document.f14885a.f12084A);
    }

    protected final String mo3074a(Document document) {
        return document.f14885a.f12118y;
    }

    protected final boolean mo3075a() {
        Document document = ((C2658m) this.b).f14702a;
        return (document.f14885a == null || document.f14885a.f12090G == null || document.f14885a.f12090G.length <= 0) ? false : true;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.reviews_samples_module;
    }
}
