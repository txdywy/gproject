package com.android.setupwizardlib.view;

import android.support.v7.widget.em;
import android.support.v7.widget.eo;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;

public final class com.android.setupwizardlib.view.c extends android.support.v7.widget.em
{

    public android.support.v7.widget.em c;
    public View d;
    public final android.support.v7.widget.eo e;

    c(android.support.v7.widget.em p0) {
        android.support.v7.widget.em();
        this.e = new com.android.setupwizardlib.view.d(this);
        this.c = p0;
        this.c.a(this.e);
        this.b_(this.c.b);
    }

    public final int a() {
        v0 = this.c.a();
        if (this.d != 0)
            v0 = v0 + 1;
        return v0;
    }

    public final int a(int p0) {
        if (this.d != 0)
            p0 = p0 - 1;
        if (p0 < 0)
            v0 = 2147483647;
        else
            v0 = this.c.a(p0);
        return v0;
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        if (p1 == 2147483647) {
            v1 = new FrameLayout(p0.getContext());
            v1.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
            v0 = new com.android.setupwizardlib.view.e(v1);
        }
        else
            v0 = this.c.a(p0, p1);
        return v0;
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        if (this.d != 0)
            p1 = p1 - 1;
        if (p0 instanceof com.android.setupwizardlib.view.e) {
            if (this.d == 0)
                throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
            if (this.d.getParent() != 0)
                ((ViewGroup)this.d.getParent()).removeView(this.d);
            ((FrameLayout)p0.a).addView(this.d);
        }
        else
            this.c.a(p0, p1);
    }

    public final long b(int p0) {
        if (this.d != 0)
            p0 = p0 - 1;
        if (p0 < 0)
            v0 = 9223372036854775807;
        else
            v0 = this.c.b(p0);
        return v0;
    }

}
