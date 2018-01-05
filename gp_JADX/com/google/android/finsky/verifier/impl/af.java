package com.google.android.finsky.verifier.impl;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.support.v7.app.C0433y;
import android.widget.Button;

final class af implements OnShowListener {
    public final /* synthetic */ PackageWarningDialogView f24381a;

    af(PackageWarningDialogView packageWarningDialogView) {
        this.f24381a = packageWarningDialogView;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Button a = ((C0433y) dialogInterface).m2636a(-2);
        a.setTextColor(-7829368);
        a.setOnClickListener(this.f24381a);
    }
}
