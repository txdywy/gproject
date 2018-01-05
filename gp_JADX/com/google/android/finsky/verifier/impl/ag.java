package com.google.android.finsky.verifier.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1128e;

public final class ag extends C1128e implements OnClickListener {
    public PackageWarningDialogView af;

    public final Dialog mo143a(Bundle bundle) {
        Dialog a = super.mo143a(bundle);
        if (a != null) {
            this.af = (PackageWarningDialogView) this.al;
            this.af.setOnContinueAnywayClickListener(this);
            a.setOnKeyListener(new ah(this));
            PackageWarningDialogView packageWarningDialogView = this.af;
            if (packageWarningDialogView.f24325a == 4) {
                a.setOnShowListener(new af(packageWarningDialogView));
            }
        }
        return a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.af.getAction() == 2) {
            aa();
        } else {
            m6866Z();
        }
    }

    public final void onClick(View view) {
        aa();
    }
}
