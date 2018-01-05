package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.af;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C2626m;
import com.google.android.finsky.utils.C4685p;
import com.squareup.leakcanary.C7582R;

public class C2632a extends TextModule implements C2626m {
    public final int mo2978e() {
        return 1;
    }

    protected final ge mo3026a(Document document, boolean z) {
        af R = document.m14629R();
        CharSequence a = R != null ? C4685p.m21831a(R.f11774f) : null;
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        ge geVar = new ge();
        geVar.f14616a = document.f14885a.f12099f;
        geVar.f14617b = document.f14885a.f12098e;
        geVar.f14618c = null;
        geVar.f14619d = 8388611;
        geVar.f14620e = false;
        geVar.f14622g = a;
        geVar.f14621f = this.t.getResources().getString(C7582R.string.details_about_author).toUpperCase();
        geVar.f14629n = Integer.valueOf(this.t.getResources().getColor(C7582R.color.play_white));
        return geVar;
    }

    public final boolean mo2986a() {
        return true;
    }

    protected final int mo3027b() {
        return 1872;
    }

    public final void f_(int i) {
    }
}
