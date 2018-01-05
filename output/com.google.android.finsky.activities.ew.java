package com.google.android.finsky.activities;

public final class com.google.android.finsky.activities.ew implements Runnable
{

    public final MainActivity a;

    ew(MainActivity p0) {
        this.a = p0;
    }

    public final void run() {
        this.a.a(0, 0, 1, "content_level_changed");
    }

}
