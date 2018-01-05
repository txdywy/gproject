package com.google.android.finsky.bg;

import android.view.View;

public final class com.google.android.finsky.bg.x implements Runnable
{

    public final View a;
    public final com.google.android.finsky.bg.z b;

    x(View p0, com.google.android.finsky.bg.z p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.startAnimation(com.google.android.finsky.bg.v.b(this.a.getContext(), 150, new com.google.android.finsky.bg.y(this)));
    }

}
