package com.google.android.finsky.appdiscoveryservice;

import android.content.pm.PackageManager;

class com.google.android.finsky.appdiscoveryservice.o
{

    public static final String[] b;
    public final PackageManager a;

    static {
        v0 = new String[2];
        v0[0] = "android.permission.VIEW_INSTANT_APPS";
        v0[1] = "android.permission.ACCESS_INSTANT_APPS";
        com.google.android.finsky.appdiscoveryservice.o.b = v0;
    }

    o(PackageManager p0) {
        this.a = p0;
    }

}
