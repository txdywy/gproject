package com.google.android.finsky.adapters;

import android.view.View;

public final class com.google.android.finsky.adapters.r implements View$OnClickListener
{

    public final int a;
    public final com.google.android.finsky.adapters.q b;

    r(com.google.android.finsky.adapters.q p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.e.a(this.a);
    }

}
