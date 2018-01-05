package com.google.android.finsky.instantapps;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.provider.Settings.Secure;

final class C3561x implements OnClickListener {
    public final /* synthetic */ SettingsActivity f17832a;

    C3561x(SettingsActivity settingsActivity) {
        this.f17832a = settingsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Secure.putInt(this.f17832a.getContentResolver(), SettingsActivity.m16870o(), 1);
        dialogInterface.dismiss();
    }
}
