package com.google.android.finsky.activities;

import com.google.android.finsky.dx.a;
import com.google.android.finsky.dx.h;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.e implements Runnable
{

    public final boolean[] a;
    public final com.google.android.finsky.dx.h b;
    public final boolean c;
    public final com.google.android.finsky.activities.b d;

    e(com.google.android.finsky.activities.b p0, boolean[] p1, com.google.android.finsky.dx.h p2, boolean p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        if (this.a[0] != 0) {
            FinskyLog.c("Timeout waiting for UserSettings, continuing start anyways.", new Object[0]);
            this.d.D.b(this.b);
            this.d.g(this.c);
        }
    }

}
