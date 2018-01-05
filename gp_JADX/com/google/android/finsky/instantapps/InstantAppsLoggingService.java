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
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.instantapps.common.p221d.p317b.C5736a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class InstantAppsLoggingService extends IntentService {
    public C5736a f17317a;

    public InstantAppsLoggingService() {
        super("InstantAppsLoggingService");
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
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3509a(this);
    }

    protected void onHandleIntent(Intent intent) {
        C5736a c5736a = this.f17317a;
        CharSequence action = intent.getAction();
        String valueOf;
        if (TextUtils.isEmpty(action)) {
            valueOf = String.valueOf(intent);
            Log.e("LoggingServiceDelegate", new StringBuilder(String.valueOf(valueOf).length() + 26).append("Intent is missing action: ").append(valueOf).toString());
        } else if ("com.google.android.instantapps.common.logging.LOG_ODYSSEY".equals(action)) {
            int intExtra = intent.getIntExtra("com.google.android.instantapps.common.logging.EVENT_TYPE_EXTRA", -1);
            long longExtra = intent.getLongExtra("com.google.android.instantapps.common.logging.EVENT_TIME_MS", -1);
            if (intExtra == -1 || longExtra == -1) {
                valueOf = String.valueOf(intent);
                Log.e("LoggingServiceDelegate", new StringBuilder(String.valueOf(valueOf).length() + 156).append("Intent is missing extra: com.google.android.instantapps.common.logging.EVENT_TYPE_EXTRA and/or com.google.android.instantapps.common.logging.EVENT_TIME_MS :").append(valueOf).toString());
                return;
            }
            C5710a c5710a = c5736a.f29022a;
            ad adVar = new ad(intExtra);
            adVar.f28914g = longExtra;
            c5710a.mo5139a(adVar.m26987a());
        }
    }
}
