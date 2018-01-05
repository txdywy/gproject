package com.google.android.finsky.activities;

import com.google.android.finsky.layout.play.FinskyDrawerLayout;

public final class com.google.android.finsky.activities.ex implements Runnable
{

    public final MainActivity a;

    ex(MainActivity p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.a.x == 0)
            this.a.N.g();
    }

}
