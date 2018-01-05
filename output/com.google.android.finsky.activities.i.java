package com.google.android.finsky.activities;

public final class com.google.android.finsky.activities.i implements Runnable
{

    public final String a;
    public final com.google.android.finsky.activities.b b;

    i(com.google.android.finsky.activities.b p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.a(this.a, 0);
    }

}
