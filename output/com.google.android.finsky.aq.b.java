package com.google.android.finsky.aq;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.finsky.packagemanager.a;

public class com.google.android.finsky.aq.b
{

    public final com.google.android.finsky.aq.a a;
    public final PackageManager b;
    public final com.google.android.finsky.packagemanager.a c;

    b(Context p0, com.google.android.finsky.aq.a p1, com.google.android.finsky.packagemanager.a p2) {
        this.a = p1;
        this.b = p0.getPackageManager();
        this.c = p2;
    }

}
