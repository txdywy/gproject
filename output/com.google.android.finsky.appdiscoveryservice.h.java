package com.google.android.finsky.appdiscoveryservice;

import a.a.c;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import c.a.a;

public final class com.google.android.finsky.appdiscoveryservice.h implements c.a.a
{

    public final c.a.a a;

    h(c.a.a p0) {
        this.a = p0;
    }

    public final Object a() {
        return (UsageStatsManager)a.a.c.a((UsageStatsManager)((Context)this.a.a()).getSystemService("usagestats"), "Cannot return null from a non-@Nullable @Provides method");
    }

}
