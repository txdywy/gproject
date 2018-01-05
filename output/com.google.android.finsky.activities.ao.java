package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

public final class com.google.android.finsky.activities.ao implements Runnable
{

    public final boolean a;
    public final com.google.android.finsky.activities.t b;

    ao(com.google.android.finsky.activities.t p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        v0 = this.b.getBaseContext().getPackageManager().getLaunchIntentForPackage(this.b.getBaseContext().getPackageName()).addFlags(67108864).addFlags(32768).addFlags(268435456).addCategory("android.intent.category.HOME");
        if (this.a != 0)
            this.b.startActivityForResult(v0, 1);
        else
            this.b.startActivityForResult(v0, 0);
    }

}
