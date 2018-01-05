package com.google.android.finsky.billing.myaccount;

import android.support.v4.app.Fragment;

final /* synthetic */ class al implements Runnable {
    public final af f10199a;

    al(af afVar) {
        this.f10199a = afVar;
    }

    public final void run() {
        Fragment fragment = this.f10199a;
        fragment.m580a(fragment.m601g().getPackageManager().getLaunchIntentForPackage(fragment.m601g().getPackageName()).addFlags(67108864).addFlags(32768).addFlags(268435456).addCategory("android.intent.category.HOME"));
    }
}
