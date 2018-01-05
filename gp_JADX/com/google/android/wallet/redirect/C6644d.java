package com.google.android.wallet.redirect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class C6644d extends Activity {
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

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(mo5545a(getIntent().getData()));
        finish();
    }

    public Intent mo5545a(Uri uri) {
        return StartAndroidAppRedirectActivity.m30040a(this, uri);
    }
}
