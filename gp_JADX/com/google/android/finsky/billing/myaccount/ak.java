package com.google.android.finsky.billing.myaccount;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.wireless.android.finsky.dfe.c.a.bk;

final /* synthetic */ class ak implements OnCancelListener {
    public final af f10197a;
    public final bk f10198b;

    ak(af afVar, bk bkVar) {
        this.f10197a = afVar;
        this.f10198b = bkVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f10197a.m10584b(this.f10198b.g);
    }
}
