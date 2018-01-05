package com.android.ex.photo.views;

import android.widget.ProgressBar;

public final class com.android.ex.photo.views.f
{

    public final ProgressBar a;
    public final ProgressBar b;
    public boolean c;

    f(ProgressBar p0, ProgressBar p1) {
        this.a = p0;
        this.b = p1;
        this.c = 1;
        this.a(this.c);
    }

    private final void a(boolean p0) {
        v2 = 8;
        if (p0 != 0)
            v0 = 0;
        else
            v0 = 8;
        this.b.setVisibility(v0);
        if (p0 == 0)
            v2 = 0;
        this.a.setVisibility(v2);
    }

    public final void a(int p0) {
        if (p0 == 4 || p0 == 8) {
            this.b.setVisibility(p0);
            this.a.setVisibility(p0);
        }
        else
            this.a(this.c);
    }

}
