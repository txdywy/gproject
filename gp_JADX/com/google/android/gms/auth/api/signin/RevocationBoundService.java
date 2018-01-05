package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C4964r;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public final class RevocationBoundService extends Service {
    public final Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public final AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public final Resources getResources() {
        return C6331c.m28981a(this);
    }

    public final Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                Log.v("RevocationService", "RevocationBoundService handling disconnect.");
            }
            return new C4964r(this);
        }
        String str = "RevocationService";
        String str2 = "Unknown action sent to RevocationBoundService: ";
        String valueOf = String.valueOf(intent.getAction());
        Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return null;
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }
}
