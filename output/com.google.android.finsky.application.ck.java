package com.google.android.finsky.application;

import com.google.android.finsky.m;
import com.google.android.finsky.wear.WearSupportService;

public final class com.google.android.finsky.application.ck implements Runnable
{

    public final com.google.android.finsky.application.d a;

    ck(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final void run() {
        WearSupportService.a(this.a.b);
    }

}
