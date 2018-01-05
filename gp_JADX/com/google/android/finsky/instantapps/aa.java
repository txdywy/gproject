package com.google.android.finsky.instantapps;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class aa implements OnDismissListener {
    public final /* synthetic */ SettingsActivity f17345a;

    aa(SettingsActivity settingsActivity) {
        this.f17345a = settingsActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f17345a.f17331q.post(new ab(this));
    }
}
