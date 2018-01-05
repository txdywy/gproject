package com.google.android.finsky.instantapps;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.C0254u;
import android.text.TextUtils;
import com.google.android.finsky.instantapps.p220f.C3478e;
import com.squareup.leakcanary.C7582R;

final class C3527m implements C3478e {
    public final /* synthetic */ SettingsActivity f17778a;

    C3527m(SettingsActivity settingsActivity) {
        this.f17778a = settingsActivity;
    }

    public final void mo3540a(String str) {
        this.f17778a.f17329G = this.f17778a.f17328F;
        this.f17778a.f17325C.m17042a(str);
        Context context;
        if (str == null) {
            context = this.f17778a;
            new Builder(context).setTitle(context.getString(C7582R.string.instant_apps_settings_opt_out_dialog_title)).setMessage(context.getString(C7582R.string.instant_apps_settings_opt_out_dialog_description)).setOnDismissListener(new C3543p(context)).setPositiveButton(context.getString(C7582R.string.instant_apps_settings_opt_out_dialog_ok).toUpperCase(), new C3542o(context)).setNegativeButton(context.getString(C7582R.string.instant_apps_settings_opt_out_dialog_cancel).toUpperCase(), new C3541n()).create().show();
        } else if (TextUtils.equals(str, this.f17778a.f17328F) || this.f17778a.f17329G == null) {
            C0254u c0254u = this.f17778a;
            if (c0254u.f17328F != null) {
                c0254u.m16874n();
            }
            c0254u.f17328F = str;
            Intent flags = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.instantapps.settings.OptInActivity").putExtra("lastChance", true).setFlags(65536);
            if (!TextUtils.isEmpty(str)) {
                flags.putExtra("defaultAccount", str);
            }
            c0254u.startActivityForResult(flags, 10);
        } else {
            context = this.f17778a;
            new Builder(context).setTitle(context.getString(C7582R.string.instant_apps_settings_change_account_dialog_title)).setMessage(context.getString(C7582R.string.instant_apps_settings_change_account_dialog_description)).setOnDismissListener(new aa(context)).setPositiveButton(context.getString(C7582R.string.instant_apps_settings_change_account_dialog_ok).toUpperCase(), new C3563z(context, str)).setNegativeButton(context.getString(C7582R.string.instant_apps_settings_change_account_dialog_cancel).toUpperCase(), new C3562y(context)).create().show();
        }
    }
}
