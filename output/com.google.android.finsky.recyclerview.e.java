package com.google.android.finsky.recyclerview;

import android.content.Context;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.frameworkviews.ErrorFooter;

public abstract class com.google.android.finsky.recyclerview.e extends com.google.android.finsky.recyclerview.h implements com.google.android.finsky.frameworkviews.i
{

    public final LayoutInflater I;
    public final Context J;
    public int K;

    e(Context p0, boolean p1, boolean p2) {
        com.google.android.finsky.recyclerview.h();
        this.J = p0;
        this.I = LayoutInflater.from(p0);
        if (p1 != 0)
            this.K = 2;
        else if (p2 != 0)
            this.K = 1;
        else
            this.K = 0;
    }

    public final void Q_() {
        if (this.K == 2)
            this.j();
        this.e(1);
    }

    public final View a(int p0, ViewGroup p1) {
        return this.I.inflate(p0, p1, 0);
    }

    public View a(ViewGroup p0) {
        return this.a(2130968970, p0);
    }

    public final long b(int p0) {
        return (long)p0;
    }

    public final View b(View p0) {
        ((ErrorFooter)p0).a(this.l(), this);
        return (ErrorFooter)p0;
    }

    public final void e(int p0) {
        this.K = p0;
        this.a.b();
    }

    public abstract boolean i();

    public abstract void j();

    public abstract String l();

}
