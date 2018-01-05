package com.google.android.finsky.instantapps;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class C3542o implements OnClickListener {
    public final /* synthetic */ SettingsActivity f17801a;

    C3542o(SettingsActivity settingsActivity) {
        this.f17801a = settingsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17801a.m16874n();
        dialogInterface.dismiss();
    }
}
