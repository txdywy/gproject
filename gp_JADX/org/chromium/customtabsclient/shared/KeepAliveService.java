package org.chromium.customtabsclient.shared;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class KeepAliveService extends Service {
    public static final Binder f40563a = new Binder();

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return c.b(this);
    }

    public Resources getResources() {
        return c.a(this);
    }

    public Theme getTheme() {
        return c.c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        c.a(this, i);
    }

    public IBinder onBind(Intent intent) {
        return f40563a;
    }
}
