package com.google.android.finsky.headerlistlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.headerlist.i;
import com.google.android.play.search.PlaySearchToolbar;

public class com.google.android.finsky.headerlistlayout.f extends com.google.android.play.headerlist.i
{

    public View e;

    f(Context p0) {
        com.google.android.play.headerlist.i(p0);
    }

    public abstract int a();

    public int a(Context p0) {
        return PlaySearchToolbar.a(p0);
    }

    public void a(LayoutInflater p0, ViewGroup p1) {
    }

    public void a(ViewGroup p0) {
    }

    protected final void c(LayoutInflater p0, ViewGroup p1) {
        v0 = this.v();
        if (v0 <= 0) {
            this.e = p0.inflate(this.a(), p1, 0);
            p1.addView(this.e);
        }
        else {
            p0.inflate(this.a(), p1, 1);
            this.e = p1.findViewById(v0);
        }
    }

    public int d() {
        return 1;
    }

    public boolean f() {
        return 0;
    }

    public int i() {
        return 0;
    }

    public boolean j() {
        return 1;
    }

    public int o() {
        return 0;
    }

    public com.google.android.finsky.headerlistlayout.c p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public int t() {
        return PlaySearchToolbar.a(this.f);
    }

    public int u() {
        return 2;
    }

    public int v() {
        return -1;
    }

}
