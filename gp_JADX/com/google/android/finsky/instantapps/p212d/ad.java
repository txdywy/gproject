package com.google.android.finsky.instantapps.p212d;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.feedback.C5189b;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.C5211b;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.instantapps.common.C3423l;
import com.squareup.leakcanary.C7582R;

final class ad implements C3423l {
    public final /* synthetic */ Resources f17509a;

    ad(Resources resources) {
        this.f17509a = resources;
    }

    public final Intent mo3522a() {
        return new Intent().setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.instantapps.SettingsActivity"));
    }

    public final Intent mo3523a(String str) {
        Intent addCategory = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addCategory("android.intent.category.DEFAULT");
        String str2 = "package:";
        String valueOf = String.valueOf(str);
        return addCategory.setData(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
    }

    public final void mo3524a(Activity activity, String str, String str2) {
        Uri parse = Uri.parse("https://support.google.com/googleplay/?p=instant_apps");
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.f26280q = parse;
        C5189b c5189b = new C5189b();
        c5189b.f26203a = GoogleHelp.m23989a(activity);
        GoogleHelp a = googleHelp.m23991a(c5189b.m23962a(), activity.getCacheDir());
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.f26201a = 1;
        themeSettings.f26202b = this.f17509a.getColor(C7582R.color.instant_apps_settings_help_primary_color);
        a.f26282s = themeSettings;
        if (str2 != null) {
            a.f26266c = new Account(str2, "com.google");
        }
        new C5211b(activity).m23993a(a.m23990a());
    }
}
