package com.google.android.finsky.installer;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.HashMap;

@TargetApi(17)
public class MultiUserCoordinatorService extends Service {
    public final HashMap f16851a = new HashMap();
    public final HashMap f16852b = new HashMap();
    public final boolean f16853c;
    public final C3319e f16854d;

    public MultiUserCoordinatorService() {
        boolean z = VERSION.SDK_INT > 22 || VERSION.CODENAME.equals("MNC");
        this.f16853c = z;
        this.f16854d = new C3323l(this);
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

    public IBinder onBind(Intent intent) {
        return this.f16854d;
    }
}
