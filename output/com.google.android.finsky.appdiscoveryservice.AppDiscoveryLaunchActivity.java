package com.google.android.finsky.appdiscoveryservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.e;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.google.wireless.android.a.a.a.a.br;

public class AppDiscoveryLaunchActivity extends Activity
{

    public com.google.android.finsky.d.a a;
    public com.google.android.finsky.d.w b;

    AppDiscoveryLaunchActivity() {
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

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.appdiscoveryservice.b)com.google.android.finsky.providers.d.a(com.google.android.finsky.appdiscoveryservice.b)).a(this);
        v0 = this.getIntent();
        if (v0 == 0) {
            FinskyLog.d("No intent found.", new Object[0]);
            this.finish();
        }
        else {
            v1 = String.valueOf(v0);
            FinskyLog.b((String.valueOf(v1).length() + 25) + "Found suggestion intent: " + v1, new Object[0]);
            v1 = v0.getData();
            if (v1 == 0) {
                FinskyLog.d("Failed to obtain intent URI.", new Object[0]);
                this.finish();
            }
            else {
                this.b = this.a.a(p0, v0);
                if (this.b != 0) {
                    v3 = new com.google.android.finsky.d.e(12);
                    if (v0.hasExtra("callingPackageName"))
                        v3.a.a(v0.getStringExtra("callingPackageName"));
                    if (v0.hasExtra("callingVersionCode")) {
                        v3.a.a = v3.a.a | 2048;
                        v3.a.m = v0.getIntExtra("callingVersionCode", -1);
                    }
                    if (v0.hasExtra("serverLogsCookie"))
                        v3.a(v0.getByteArrayExtra("serverLogsCookie"));
                    this.b.a(v3);
                    v0 = 1;
                    if (!v1.toString().startsWith("https://play.google.com/store/apps/details"))
                        v0 = 24;
                    this.b.a(new com.google.android.finsky.d.e(v0));
                }
                else
                    FinskyLog.d("Failed to create logging context.", new Object[0]);
                this.startActivity(new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(this.getIntent().getData()));
                this.finish();
            }
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
