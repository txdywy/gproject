package com.google.android.finsky.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.finsky.navigationmanager.a;

public class com.google.android.finsky.adapters.t extends BaseAdapter implements com.google.android.finsky.dfemodel.w, com.google.android.finsky.frameworkviews.i
{

    public final LayoutInflater f;
    public final Context g;
    public final com.google.android.finsky.navigationmanager.a h;
    public int i;

    t(Context p0, com.google.android.finsky.navigationmanager.a p1) {
        BaseAdapter();
        this.g = p0;
        this.h = p1;
        this.f = LayoutInflater.from(p0);
        this.i = 1;
    }

    private final void a(int p0) {
        this.i = p0;
        this.notifyDataSetChanged();
    }

    public final void Q_() {
        if (this.i == 2)
            this.a();
        this.a(1);
    }

    public final View a(int p0, ViewGroup p1) {
        return this.f.inflate(p0, p1, 0);
    }

    public abstract void a();

    public abstract String b();

    public abstract boolean c();

    public long getItemId(int p0) {
        return (long)p0;
    }

    public void m_() {
        if (this.c())
            this.a(1);
        else
            this.a(0);
    }

}
