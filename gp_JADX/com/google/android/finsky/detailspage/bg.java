package com.google.android.finsky.detailspage;

import android.content.Context;
import android.support.v7.widget.dn;
import android.util.DisplayMetrics;
import android.view.View;

public final class bg extends dn {
    public int f14289n;

    public bg(Context context, int i) {
        super(context);
        this.f14289n = i;
    }

    public final int mo3052a(View view, int i) {
        return super.mo3052a(view, -1) + this.f14289n;
    }

    protected final float mo3051a(DisplayMetrics displayMetrics) {
        return 65.0f / ((float) displayMetrics.densityDpi);
    }
}
