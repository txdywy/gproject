package com.google.android.finsky.billing.common;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.u;
import android.support.v7.app.ac;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public class com.google.android.finsky.billing.common.b extends android.support.v4.app.u
{

    public android.support.v7.app.ac x;

    b() {
        android.support.v4.app.u();
    }

    private final android.support.v7.app.ac f() {
        v0 = 0;
        if (!this.g()) {
            if (this.x == 0)
                this.x = android.support.v7.app.ac.a(this, 0);
            v0 = this.x;
        }
        return v0;
    }

    public void addContentView(View p0, ViewGroup$LayoutParams p1) {
        v0 = this.f();
        if (v0 != 0)
            v0.b(p0, p1);
        else
            super.addContentView(p0, p1);
    }

    public boolean g() {
        return 0;
    }

    public MenuInflater getMenuInflater() {
        v0 = this.f();
        if (v0 != 0)
            v0 = v0.b();
        else
            v0 = super.getMenuInflater();
        return v0;
    }

    public void invalidateOptionsMenu() {
        v0 = this.f();
        if (v0 != 0)
            v0.h();
        else
            super.invalidateOptionsMenu();
    }

    public void onConfigurationChanged(Configuration p0) {
        super.onConfigurationChanged(p0);
        v0 = this.f();
        if (v0 != 0)
            v0.d();
    }

    public void onCreate(Bundle p0) {
        v0 = this.f();
        if (v0 != 0) {
            v0.k();
            v0.a(p0);
        }
        super.onCreate(p0);
    }

    public void onDestroy() {
        super.onDestroy();
        v0 = this.f();
        if (v0 != 0)
            v0.i();
    }

    protected void onPostCreate(Bundle p0) {
        super.onPostCreate(p0);
        v0 = this.f();
        if (v0 != 0)
            v0.c();
    }

    protected void onPostResume() {
        super.onPostResume();
        v0 = this.f();
        if (v0 != 0)
            v0.g();
    }

    public void onStop() {
        super.onStop();
        v0 = this.f();
        if (v0 != 0)
            v0.f();
    }

    protected void onTitleChanged(CharSequence p0, int p1) {
        super.onTitleChanged(p0, p1);
        v0 = this.f();
        if (v0 != 0)
            v0.a(p0);
    }

    public void setContentView(int p0) {
        v0 = this.f();
        if (v0 != 0)
            v0.b(p0);
        else
            super.setContentView(p0);
    }

    public void setContentView(View p0) {
        v0 = this.f();
        if (v0 != 0)
            v0.a(p0);
        else
            super.setContentView(p0);
    }

    public void setContentView(View p0, ViewGroup$LayoutParams p1) {
        v0 = this.f();
        if (v0 != 0)
            v0.a(p0, p1);
        else
            super.setContentView(p0, p1);
    }

}
