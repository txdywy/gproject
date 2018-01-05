package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.Fragment;

public final class com.google.android.finsky.billing.myaccount.al implements Runnable
{

    public final com.google.android.finsky.billing.myaccount.af a;

    al(com.google.android.finsky.billing.myaccount.af p0) {
        this.a = p0;
    }

    public final void run() {
        this.a.a(this.a.g().getPackageManager().getLaunchIntentForPackage(this.a.g().getPackageName()).addFlags(67108864).addFlags(32768).addFlags(268435456).addCategory("android.intent.category.HOME"));
    }

}
