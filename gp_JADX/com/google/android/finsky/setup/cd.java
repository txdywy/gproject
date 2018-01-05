package com.google.android.finsky.setup;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class cd implements OnPreDrawListener {
    public final /* synthetic */ View f20915a;

    cd(View view) {
        this.f20915a = view;
    }

    public final boolean onPreDraw() {
        this.f20915a.setSystemUiVisibility(this.f20915a.getSystemUiVisibility() | 5634);
        return true;
    }
}
