package com.google.android.finsky.activities;

import android.content.Intent;

final class ao implements Runnable {
    public final /* synthetic */ boolean f6458a;
    public final /* synthetic */ C1033t f6459b;

    ao(C1033t c1033t, boolean z) {
        this.f6459b = c1033t;
        this.f6458a = z;
    }

    public final void run() {
        Intent addCategory = this.f6459b.getBaseContext().getPackageManager().getLaunchIntentForPackage(this.f6459b.getBaseContext().getPackageName()).addFlags(67108864).addFlags(32768).addFlags(268435456).addCategory("android.intent.category.HOME");
        if (this.f6458a) {
            this.f6459b.startActivityForResult(addCategory, 1);
        } else {
            this.f6459b.startActivityForResult(addCategory, 0);
        }
    }
}
