package com.android.vending;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.m;
import com.google.android.finsky.recoverymode.a;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class AssetBrowserActivity extends Activity
{

    AssetBrowserActivity() {
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
        v0 = com.google.android.finsky.m.a.bK();
        if (v0.b()) {
            v0.f();
            this.finish();
        }
        else {
            v0 = this.getIntent();
            v0.setClass(this, MainActivity);
            v0.setFlags(v0.getFlags() & -2097153);
            this.startActivity(v0);
            this.finish();
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
