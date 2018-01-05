package com.google.android.finsky.bg;

import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class com.google.android.finsky.bg.p implements ViewTreeObserver$OnGlobalLayoutListener
{

    public ViewGroup c;

    p(ViewGroup p0) {
        this.c = p0;
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void a() {
        if (Build$VERSION.SDK_INT >= 16) {
            if (this.c != 0) {
                this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.c = 0;
            }
        }
        else if (this.c != 0) {
            this.c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            this.c = 0;
        }
    }

}
