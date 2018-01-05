package com.google.android.finsky.adapters;

import android.content.res.Resources;
import android.support.v4.view.r;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.finsky.stream.base.s;

public final class com.google.android.finsky.adapters.l extends com.google.android.finsky.stream.base.s
{

    l() {
        com.google.android.finsky.stream.base.s();
    }

    public final int a() {
        return 1;
    }

    public final int a(int p0) {
        return 2130968863;
    }

    public final void a(View p0, int p1) {
        p0.setTag(2131755026, "");
        v1 = p0.getResources().getDimensionPixelSize(2131624375);
        v0 = (ViewGroup$MarginLayoutParams)p0.getLayoutParams();
        android.support.v4.view.r.a(v0, v1);
        android.support.v4.view.r.b(v0, v1);
        p0.setLayoutParams(v0);
    }

    public final void b(View p0, int p1) {
    }

}
