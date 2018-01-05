package com.google.android.finsky.adapters;

import android.support.v4.view.C0361r;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.stream.base.C1169s;
import com.squareup.leakcanary.C7582R;

public final class C1170l extends C1169s {
    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.family_safe_search_header;
    }

    public final void mo1510a(View view, int i) {
        view.setTag(C7582R.id.accept_page_margin, "");
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C7582R.dimen.family_safe_search_title_margin_left);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        C0361r.m2050a(marginLayoutParams, dimensionPixelSize);
        C0361r.m2052b(marginLayoutParams, dimensionPixelSize);
        view.setLayoutParams(marginLayoutParams);
    }

    public final void mo1511b(View view, int i) {
    }
}
