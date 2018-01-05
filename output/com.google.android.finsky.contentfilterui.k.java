package com.google.android.finsky.contentfilterui;

import android.support.v4.app.Fragment;

public final class com.google.android.finsky.contentfilterui.k implements Runnable
{

    public final boolean a;
    public final com.google.android.finsky.contentfilterui.j b;

    k(com.google.android.finsky.contentfilterui.j p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.b.k())
            this.b.a(this.a);
    }

}
