package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

class C2674v extends C2641k {
    public final C1461c f14758g;

    C2674v(C1461c c1461c) {
        this.f14758g = c1461c;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.books_related_reviews_samples_module;
    }

    protected final boolean mo3076a(boolean z, Document document) {
        return this.f14758g.dj().mo2294a(12642043) && z && document != null && document.f14885a.f12098e == 64 && !TextUtils.isEmpty(document.bQ()) && TextUtils.isEmpty(document.f14885a.f12084A);
    }

    protected final String mo3074a(Document document) {
        return document.bQ();
    }

    protected final boolean mo3075a() {
        return true;
    }
}
