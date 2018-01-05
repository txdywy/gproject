package com.google.android.finsky.instantapps;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.C0254u;
import android.text.TextUtils;

final class C3563z implements OnClickListener {
    public final /* synthetic */ String f17834a;
    public final /* synthetic */ SettingsActivity f17835b;

    C3563z(SettingsActivity settingsActivity, String str) {
        this.f17835b = settingsActivity;
        this.f17834a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0254u c0254u = this.f17835b;
        Object obj = this.f17834a;
        if (c0254u.f17328F != null) {
            c0254u.m16874n();
        }
        c0254u.f17328F = obj;
        Intent flags = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.instantapps.settings.OptInActivity").putExtra("lastChance", true).setFlags(65536);
        if (!TextUtils.isEmpty(obj)) {
            flags.putExtra("defaultAccount", obj);
        }
        c0254u.startActivityForResult(flags, 10);
        dialogInterface.dismiss();
    }
}
