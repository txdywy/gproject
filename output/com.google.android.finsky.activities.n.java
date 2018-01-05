package com.google.android.finsky.activities;

import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.n implements Runnable
{

    n() {
    }

    public final void run() {
        FinskyLog.a("Exiting process due to toc change", new Object[0]);
        System.exit(0);
    }

}
