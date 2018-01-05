package com.google.android.finsky.p112u;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.ac;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class C1032a extends PreferenceActivity {
    public ac f6305h;

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
        m6034d().mo541k();
        m6034d().mo523a(bundle);
        super.onCreate(bundle);
        m6034d().mo500a().mo566a(true);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m6034d().mo534c();
    }

    public MenuInflater getMenuInflater() {
        return m6034d().mo502b();
    }

    public void setContentView(int i) {
        m6034d().mo531b(i);
    }

    public void setContentView(View view) {
        m6034d().mo526a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m6034d().mo527a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m6034d().mo532b(view, layoutParams);
    }

    protected void onPostResume() {
        super.onPostResume();
        m6034d().mo539g();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m6034d().mo501a(charSequence);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m6034d().mo536d();
    }

    protected void onStop() {
        super.onStop();
        m6034d().mo505f();
    }

    public void onDestroy() {
        super.onDestroy();
        m6034d().mo506i();
    }

    public void invalidateOptionsMenu() {
        m6034d().mo540h();
    }

    public final ac m6034d() {
        if (this.f6305h == null) {
            this.f6305h = ac.m2348a((Activity) this, null);
        }
        return this.f6305h;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    protected boolean isValidFragment(String str) {
        return false;
    }
}
