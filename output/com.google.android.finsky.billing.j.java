package com.google.android.finsky.billing;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.settings.SettingsActivity;

public final class com.google.android.finsky.billing.j implements View$OnClickListener
{

    public final com.google.android.finsky.billing.g a;

    j(com.google.android.finsky.billing.g p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        v0 = new Intent(p0.getContext(), SettingsActivity);
        v0.putExtra("setting-key-to-scroll", "download-mode");
        this.a.a(v0);
    }

}
