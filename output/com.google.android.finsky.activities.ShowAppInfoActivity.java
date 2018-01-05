package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.br.a;
import com.google.android.finsky.m;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class ShowAppInfoActivity extends Activity
{

    ShowAppInfoActivity() {
        Activity();
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        v0 = this.getIntent();
        if (!com.google.android.finsky.m.a.dj().a(12630204) && v0.hasExtra("android.intent.extra.PACKAGE_NAME")) {
            v1 = com.google.android.finsky.activities.ej.a.buildUpon();
            v1.appendQueryParameter("id", v0.getStringExtra("android.intent.extra.PACKAGE_NAME"));
            v0 = new Intent("android.intent.action.VIEW");
            v0.setData(v1.build());
            v0 = com.google.android.finsky.m.a.bn().a(this, v0);
        }
        else
            v0 = 0;
        if (v0 != 0)
            this.startActivity(v0);
        this.finish();
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
