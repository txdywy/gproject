package com.google.android.finsky.activities;

public final class com.google.android.finsky.activities.l implements Runnable
{

    public final boolean a;
    public final com.google.android.finsky.activities.b b;

    l(com.google.android.finsky.activities.b p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.e(this.a);
    }

}
