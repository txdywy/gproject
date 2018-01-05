package com.google.android.finsky.layout.actionbar;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class C3662e implements OnFocusChangeListener {
    public final /* synthetic */ C3658a f18470a;

    C3662e(C3658a c3658a) {
        this.f18470a = c3658a;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f18470a.f18464w.setQuery(this.f18470a.f18466y, false);
        } else {
            this.f18470a.m17389b();
        }
    }
}
