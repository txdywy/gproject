package com.google.android.finsky.instantapps;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class InstantAppsSharedPreferencesService extends IntentService {
    public InstantAppsSharedPreferencesService() {
        super("InstantAppsSharedPreferencesService");
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void onCreate() {
        super.onCreate();
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3504a();
    }

    protected void onHandleIntent(Intent intent) {
        CharSequence action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            String valueOf = String.valueOf(intent);
            Log.e("SharedPreferenceServiceDelegate", new StringBuilder(String.valueOf(valueOf).length() + 26).append("Intent is missing action: ").append(valueOf).toString());
        } else if ("com.google.android.instantapps.installer.PUT_BOOLEAN_SHARED_PREF".equals(action)) {
            Object stringExtra = intent.getStringExtra("com.google.android.instantapps.installer.SHARED_PREF_NAME");
            if (TextUtils.isEmpty(stringExtra)) {
                Log.e("SharedPreferenceServiceDelegate", "Shared pref name is empty");
                return;
            }
            getSharedPreferences("com.google.android.instantapps.installer.prefs", 0).edit().putBoolean(stringExtra, intent.getBooleanExtra("com.google.android.instantapps.installer.SHARED_PREF_VALUE", false)).commit();
        }
    }
}
