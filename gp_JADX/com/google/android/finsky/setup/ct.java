package com.google.android.finsky.setup;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class ct implements OnPreDrawListener {
    public final /* synthetic */ View f20956a;
    public final /* synthetic */ int f20957b;

    ct(View view, int i) {
        this.f20956a = view;
        this.f20957b = i;
    }

    public final boolean onPreDraw() {
        this.f20956a.setSystemUiVisibility(this.f20957b);
        return true;
    }
}
