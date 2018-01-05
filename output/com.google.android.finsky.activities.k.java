package com.google.android.finsky.activities;

import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.k implements Runnable
{

    public final boolean a;
    public final com.google.android.finsky.activities.b b;

    k(com.google.android.finsky.activities.b p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.b.x != 0) {
            FinskyLog.a("onSaveInstanceState() called, not firing onReady().", new Object[0]);
            this.b.y = 1;
            this.b.B = this.a;
        }
        else
            this.b.b(this.a);
    }

}
