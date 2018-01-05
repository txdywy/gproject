package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.inlinedetails.f;
import com.google.android.finsky.inlinedetails.j;
import com.google.android.finsky.m;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class LaunchUrlHandlerActivity extends Activity implements com.google.android.finsky.inlinedetails.i
{

    public boolean a;
    public com.google.android.finsky.d.w b;
    public boolean c;
    public com.google.android.finsky.inlinedetails.f d;
    public com.google.android.finsky.inlinedetails.j e;

    LaunchUrlHandlerActivity() {
        Activity();
    }

    public final void a(com.google.android.finsky.inlinedetails.j p0) {
        v0 = p0.a();
        this.b.a(v0);
        this.e = p0;
        if (p0.a != 0 && com.google.android.finsky.m.a.dj().a(12613372)) {
            if (this.a == 0) {
                this.startActivityForResult(v0, 0);
                this.a = 1;
            }
        }
        else {
            this.startActivity(v0);
            this.finish();
        }
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public void finish() {
        super.finish();
        if (this.c != 0)
            this.overridePendingTransition(17432576, 17432577);
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

    protected void onActivityResult(int p0, int p1, Intent p2) {
        if (!this.d.a(p0, p1))
            this.finish();
    }

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.c = com.google.android.finsky.m.a.dj().a(12631898);
        this.b = com.google.android.finsky.m.a.dd().a("deep_link");
        if (com.google.android.finsky.m.a.dj().a(12629616))
            com.google.android.finsky.m.a.aP().a(this.b, 1722);
        if (p0 != 0)
            this.a = p0.getBoolean("LaunchUrlHandlerActivity.hasLaunchedInline");
        com.google.android.finsky.m.a.aJ();
        com.google.android.finsky.m.a.G();
        this.d = new com.google.android.finsky.inlinedetails.f(this, new com.google.android.finsky.activities.ej(this, com.google.android.finsky.m.a, com.google.android.finsky.m.a, com.google.android.finsky.m.a.bn(), com.google.android.finsky.m.a.I(), com.google.android.finsky.m.a.cx(), com.google.android.finsky.m.a.cW()), this, com.google.android.finsky.m.a.aN(), com.google.android.finsky.m.a.I(), com.google.android.finsky.m.a.Q(), com.google.android.finsky.m.a.O(), com.google.android.finsky.m.a.bK(), com.google.android.finsky.m.a.bo(), this.b);
        this.d.a(p0);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.d.a(this.e);
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putBoolean("LaunchUrlHandlerActivity.hasLaunchedInline", this.a);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

    public void startActivityForResult(Intent p0, int p1) {
        super.startActivityForResult(p0, p1);
        if (this.c != 0)
            this.overridePendingTransition(17432576, 17432577);
    }

}
