package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.wireless.android.finsky.dfe.nano.fo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.activities.myapps.j extends android.support.v7.widget.em
{

    public final Context c;
    public final ArrayList d;
    public final com.google.android.finsky.activities.myapps.f e;

    j(com.google.android.finsky.activities.myapps.f p0, Context p1, ArrayList p2) {
        this.e = p0;
        android.support.v7.widget.em();
        this.c = p1;
        this.d = p2;
    }

    public final int a() {
        return this.d.size();
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        v0 = LayoutInflater.from(p0.getContext()).inflate(2130969109, p0, 0);
        v1 = new com.google.android.finsky.activities.myapps.l(v0);
        v0.setTag(v1);
        v0.setOnClickListener(new com.google.android.finsky.activities.myapps.k(this));
        return v1;
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        v0 = (com.google.android.finsky.activities.myapps.i)this.d.get(p1);
        ((com.google.android.finsky.activities.myapps.l)p0).t.setText(v0.a.d);
        v4 = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - v0.a.f);
        v1 = this.c.getResources();
        if (v4 == 0)
            v1 = v1.getString(2131953146);
        else {
            v7 = new Object[1];
            v7[0] = Long.valueOf(v4);
            v1 = v1.getQuantityString(2131886102, (int)v4, v7);
        }
        ((com.google.android.finsky.activities.myapps.l)p0).u.setText(v1);
        ((com.google.android.finsky.activities.myapps.l)p0).v.setChecked(v0.b);
    }

}
