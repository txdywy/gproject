package com.google.android.finsky.activities;

public final class com.google.android.finsky.activities.el implements Runnable
{

    public final com.google.android.finsky.activities.ek a;

    el(com.google.android.finsky.activities.ek p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.a.D != 0) {
            this.a.D.L_();
            this.a.D = 0;
        }
    }

}
