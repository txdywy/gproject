package com.google.android.finsky.u;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.a;
import android.support.v7.app.ac;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class com.google.android.finsky.u.a extends PreferenceActivity
{

    public android.support.v7.app.ac h;

    a() {
        PreferenceActivity();
    }

    public void addContentView(View p0, ViewGroup$LayoutParams p1) {
        this.d().b(p0, p1);
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public final android.support.v7.app.ac d() {
        if (this.h == 0)
            this.h = android.support.v7.app.ac.a(this, 0);
        return this.h;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public MenuInflater getMenuInflater() {
        return this.d().b();
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public void invalidateOptionsMenu() {
        this.d().h();
    }

    protected boolean isValidFragment(String p0) {
        return 0;
    }

    public void onConfigurationChanged(Configuration p0) {
        super.onConfigurationChanged(p0);
        this.d().d();
    }

    public void onCreate(Bundle p0) {
        this.d().k();
        this.d().a(p0);
        super.onCreate(p0);
        this.d().a().a(1);
    }

    public void onDestroy() {
        super.onDestroy();
        this.d().i();
    }

    public boolean onOptionsItemSelected(MenuItem p0) {
        switch (p0.getItemId()) {
            case 16908332:
                this.onBackPressed();
                v0 = 1;
                break;
            default:
                v0 = super.onOptionsItemSelected(p0);
                break;
        }
        return v0;
    }

    protected void onPostCreate(Bundle p0) {
        super.onPostCreate(p0);
        this.d().c();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.d().g();
    }

    protected void onStop() {
        super.onStop();
        this.d().f();
    }

    protected void onTitleChanged(CharSequence p0, int p1) {
        super.onTitleChanged(p0, p1);
        this.d().a(p0);
    }

    public void setContentView(int p0) {
        this.d().b(p0);
    }

    public void setContentView(View p0) {
        this.d().a(p0);
    }

    public void setContentView(View p0, ViewGroup$LayoutParams p1) {
        this.d().a(p0, p1);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
