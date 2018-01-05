package com.google.android.finsky.appdiscoveryservice;

import a.a.c;
import android.content.Context;
import android.content.SharedPreferences;
import c.a.a;

public final class com.google.android.finsky.appdiscoveryservice.e implements c.a.a
{

    public final c.a.a a;

    e(c.a.a p0) {
        this.a = p0;
    }

    public final Object a() {
        return (SharedPreferences)a.a.c.a(((Context)this.a.a()).getSharedPreferences("InstantAppsStatsPreference", 0), "Cannot return null from a non-@Nullable @Provides method");
    }

}
