package com.google.android.finsky.at;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

final class C1515j implements OnShowListener {
    public final /* synthetic */ Dialog f8205a;

    C1515j(Dialog dialog) {
        this.f8205a = dialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        ((TextView) this.f8205a.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
