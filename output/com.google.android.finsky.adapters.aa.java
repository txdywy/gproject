package com.google.android.finsky.adapters;

import android.support.v7.widget.fr;
import android.view.View;
import com.google.android.finsky.layout.structuredreviews.a;
import com.google.android.finsky.recyclerview.g;

public final class com.google.android.finsky.adapters.aa extends com.google.android.finsky.recyclerview.g implements com.google.android.finsky.layout.structuredreviews.b
{

    public final com.google.android.finsky.adapters.z t;

    aa(com.google.android.finsky.adapters.z p0, View p1) {
        this.t = p0;
        com.google.android.finsky.recyclerview.g(p1);
        ((com.google.android.finsky.layout.structuredreviews.a)p1).setOnReviewActionListener(this);
    }

    public final void t() {
        this.t.f(this.d());
    }

}
