package com.google.android.finsky.activities;

public final class com.google.android.finsky.activities.f implements Runnable
{

    public int a;
    public final boolean b;
    public final com.google.android.finsky.activities.b c;

    f(com.google.android.finsky.activities.b p0, boolean p1) {
        this.c = p0;
        this.b = p1;
        this.a = 0;
    }

    public final void run() {
        this.a = this.a + 1;
        if (this.a == 2)
            this.c.c(this.b);
    }

}
