package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.google.android.finsky.settings.SettingsActivity;

public final class com.google.android.finsky.billing.n implements DialogInterface$OnClickListener
{

    public final com.google.android.finsky.billing.l a;

    n(com.google.android.finsky.billing.l p0) {
        this.a = p0;
    }

    public final void onClick(DialogInterface p0, int p1) {
        this.a.a(6326);
        this.a.W().W_();
        v0 = new Intent(this.a.g(), SettingsActivity);
        v0.putExtra("setting-key-to-scroll", "download-mode");
        this.a.a(v0);
    }

}
