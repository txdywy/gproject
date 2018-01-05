package com.google.android.finsky.pagesystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.a;
import android.support.v7.app.aa;
import android.support.v7.app.ac;
import android.view.MenuItem;
import com.google.android.finsky.a.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.v.b;

public final class com.google.android.finsky.pagesystem.a extends android.support.v7.app.aa implements com.google.android.finsky.pagesystem.e
{

    public com.google.android.finsky.recoverymode.a q;

    a() {
        android.support.v7.app.aa();
    }

    public final com.google.android.finsky.v.b A() {
        return 0;
    }

    public final void a(int p0, int p1, int p2, boolean p3) {
    }

    public final void a(int p0, int p1, boolean p2) {
    }

    public final void a(int p0, boolean p1) {
    }

    public final void a(String p0, String p1, com.google.android.finsky.d.w p2) {
    }

    public final void a_(com.google.android.finsky.d.w p0) {
    }

    public final void c(int p0) {
    }

    public final void c(String p0) {
        this.G_().a().a(p0);
    }

    public final void d(String p0) {
    }

    public final com.google.android.finsky.a.c l() {
        return 0;
    }

    public final void m() {
        this.onBackPressed();
    }

    public abstract Fragment n();

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.pagesystem.h)com.google.android.finsky.providers.d.a(com.google.android.finsky.pagesystem.h)).a(this);
        if (this.q.b()) {
            this.q.f();
            this.finish();
        }
        else {
            v0 = this.G_().a();
            if (v0 != 0)
                v0.a(1);
            if (this.H_().a(16908290) == 0)
                this.H_().a().a(16908290, this.n()).c();
        }
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

    public final com.google.android.finsky.navigationmanager.a y_() {
        return 0;
    }

    public final void z() {
    }

}
