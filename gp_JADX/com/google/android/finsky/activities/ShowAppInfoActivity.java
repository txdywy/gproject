package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class ShowAppInfoActivity extends Activity {
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (C1473m.f7980a.dj().mo2294a(12630204) || !intent.hasExtra("android.intent.extra.PACKAGE_NAME")) {
            intent = null;
        } else {
            String stringExtra = intent.getStringExtra("android.intent.extra.PACKAGE_NAME");
            Builder buildUpon = ej.f6712a.buildUpon();
            buildUpon.appendQueryParameter("id", stringExtra);
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(buildUpon.build());
            intent = C1473m.f7980a.bn().mo2685a((Context) this, intent);
        }
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }
}
