package com.google.android.finsky.appdiscoveryservice;

import a.a.c;
import android.content.Context;
import android.content.pm.PackageManager;
import c.a.a;

public final class com.google.android.finsky.appdiscoveryservice.g implements c.a.a
{

    public final c.a.a a;

    g(c.a.a p0) {
        this.a = p0;
    }

    public final Object a() {
        return (PackageManager)a.a.c.a(((Context)this.a.a()).getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }

}
