package com.google.android.finsky.verifier.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1128e;

public final class ak extends C1128e implements OnClickListener {
    public PerSourceInstallationConsentWarningDialogView af;

    public final Dialog mo143a(Bundle bundle) {
        Dialog a = super.mo143a(bundle);
        if (a != null) {
            this.af = (PerSourceInstallationConsentWarningDialogView) this.al;
            a.setOnKeyListener(new al(this));
        }
        return a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        aa();
    }

    public final void onClick(View view) {
        m6866Z();
    }
}
