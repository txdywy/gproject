package com.google.android.finsky.instantapps.p212d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class C3429f implements OnCancelListener {
    public final /* synthetic */ String f17561a;
    public final /* synthetic */ C3425c f17562b;

    C3429f(C3425c c3425c, String str) {
        this.f17562b = c3425c;
        this.f17561a = str;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f17562b.f17547b.mo5136a(2905);
        this.f17562b.f17550e.m16894a(this.f17561a);
        dialogInterface.dismiss();
        this.f17562b.m16970a(this.f17561a);
    }
}
