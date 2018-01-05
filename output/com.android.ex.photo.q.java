package com.android.ex.photo;

import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewTreeObserver;

public final class com.android.ex.photo.q implements ViewTreeObserver$OnGlobalLayoutListener
{

    public final View a;
    public final com.android.ex.photo.j b;

    q(com.android.ex.photo.j p0, View p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onGlobalLayout() {
        if (Build$VERSION.SDK_INT >= 16)
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        else
            this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.b.k();
    }

}
