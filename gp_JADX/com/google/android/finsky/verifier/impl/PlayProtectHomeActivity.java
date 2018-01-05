package com.google.android.finsky.verifier.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class PlayProtectHomeActivity extends Activity {
    public C2471a f24334a;

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

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ac) C3947d.m18649a(ac.class)).mo1977a(this);
        FinskyLog.m21659a("Launching Play Protect Home", new Object[0]);
        this.f24334a.m13184a("play_protect_link").m13367a(new C2474c(559));
        cs.m22278a((Context) this, (String) C0955b.hZ.m28964b());
        finish();
    }
}
