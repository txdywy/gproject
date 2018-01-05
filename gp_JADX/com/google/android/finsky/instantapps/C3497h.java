package com.google.android.finsky.instantapps;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class C3497h implements OnCancelListener {
    public final /* synthetic */ EphemeralInstallerActivity f17701a;

    C3497h(EphemeralInstallerActivity ephemeralInstallerActivity) {
        this.f17701a = ephemeralInstallerActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f17701a.f17292J.mo5136a(1644);
        dialogInterface.dismiss();
        this.f17701a.m16852d(2513);
    }
}
