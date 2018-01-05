package com.google.android.finsky.instantapps.p220f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.os.C0327a;

public final class C3491p {
    public static final ComponentName f17695a = new ComponentName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.InstantAppsSharedPreferencesService");
    public static final ComponentName f17696b = new ComponentName("com.android.vending", "com.google.android.finsky.instantapps.InstantAppsSharedPreferencesService");

    public static void m17061a(Context context, String str) {
        Intent intent = new Intent("com.google.android.instantapps.installer.PUT_BOOLEAN_SHARED_PREF");
        intent.putExtra("com.google.android.instantapps.installer.SHARED_PREF_NAME", str);
        intent.putExtra("com.google.android.instantapps.installer.SHARED_PREF_VALUE", true);
        if (C0327a.m1722b()) {
            intent.setComponent(f17696b);
        } else {
            intent.setComponent(f17695a);
        }
        context.startService(intent);
    }
}
