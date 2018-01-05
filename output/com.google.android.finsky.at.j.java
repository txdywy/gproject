package com.google.android.finsky.at;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public final class com.google.android.finsky.at.j implements DialogInterface$OnShowListener
{

    public final Dialog a;

    j(Dialog p0) {
        this.a = p0;
    }

    public final void onShow(DialogInterface p0) {
        ((TextView)this.a.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }

}
