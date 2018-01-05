package com.android.setupwizardlib.view;

import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.support.v7.widget.eo;

public final class com.android.setupwizardlib.view.d extends android.support.v7.widget.eo
{

    public final com.android.setupwizardlib.view.c a;

    d(com.android.setupwizardlib.view.c p0) {
        this.a = p0;
        android.support.v7.widget.eo();
    }

    public final void a() {
        this.a.a.b();
    }

    public final void a(int p0, int p1) {
        if (this.a.d != 0)
            p0 = p0 + 1;
        this.a.a(p0, p1);
    }

    public final void a(int p0, int p1, int p2) {
        if (this.a.d != 0) {
            p0 = p0 + 1;
            p1 = p1 + 1;
        }
        v0 = 0;
        while (v0 < p2) {
            this.a.b(p0 + v0, p1 + v0);
            v0 = v0 + 1;
        }
    }

    public final void b(int p0, int p1) {
        if (this.a.d != 0)
            p0 = p0 + 1;
        this.a.c(p0, p1);
    }

    public final void c(int p0, int p1) {
        if (this.a.d != 0)
            p0 = p0 + 1;
        this.a.d(p0, p1);
    }

}
