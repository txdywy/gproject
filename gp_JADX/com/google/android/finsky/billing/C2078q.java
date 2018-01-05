package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;

final class C2078q implements OnClickListener {
    public final /* synthetic */ boolean f10621a;
    public final /* synthetic */ CheckBox f10622b;
    public final /* synthetic */ boolean f10623c;
    public final /* synthetic */ C2039p f10624d;

    C2078q(C2039p c2039p, boolean z, CheckBox checkBox, boolean z2) {
        this.f10624d = c2039p;
        this.f10621a = z;
        this.f10622b = checkBox;
        this.f10623c = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10624d.mo968W().mo2499a(this.f10621a ? this.f10622b.isChecked() : this.f10623c ? 3 : 1, false);
    }
}
