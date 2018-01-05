package com.google.android.wallet.ui.common;

import android.support.v4.view.by;
import android.view.View;
import android.widget.TextView;

final class bj extends by {
    public final /* synthetic */ TextView f33564a;
    public final /* synthetic */ MaterialFieldLayout f33565b;

    bj(MaterialFieldLayout materialFieldLayout, TextView textView) {
        this.f33565b = materialFieldLayout;
        this.f33564a = textView;
    }

    public final void m30749b(View view) {
        this.f33565b.f33435h.setVisibility(this.f33565b.f33447t);
        if (this.f33564a != null) {
            this.f33564a.setHint(this.f33565b.f33443p);
        }
    }
}
