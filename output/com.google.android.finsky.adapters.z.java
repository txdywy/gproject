package com.google.android.finsky.adapters;

import android.os.Bundle;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.adapters.a.e;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.layout.structuredreviews.a;
import com.google.android.finsky.recyclerview.h;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.adapters.z extends com.google.android.finsky.recyclerview.h
{

    public com.google.android.finsky.cv.a.iu c;
    public com.google.android.finsky.adapters.ab d;
    public Bundle e;
    public final com.google.android.finsky.adapters.ac f;
    public List g;

    z(com.google.android.finsky.adapters.ac p0) {
        com.google.android.finsky.recyclerview.h();
        this.g = new ArrayList();
        this.f = p0;
    }

    public final int a() {
        return this.g.size();
    }

    public final int a(int p0) {
        return ((com.google.android.finsky.adapters.a.e)this.g.get(p0)).h();
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        return new com.google.android.finsky.adapters.aa(this, LayoutInflater.from(p0.getContext()).inflate(p1, p0, 0));
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        v0 = (com.google.android.finsky.adapters.a.e)this.g.get(p1);
        this.a();
        v0.a((com.google.android.finsky.layout.structuredreviews.a)((com.google.android.finsky.adapters.aa)p0).a, this.c, this.e);
        v0.a((com.google.android.finsky.layout.structuredreviews.a)((com.google.android.finsky.adapters.aa)p0).a);
    }

    public final com.google.android.finsky.adapters.a.e e(int p0) {
        return (com.google.android.finsky.adapters.a.e)this.g.get(p0);
    }

    public final void f(int p0) {
        if (this.f != 0) {
            ((com.google.android.finsky.adapters.a.e)this.g.get(p0)).f();
            if (p0 < this.g.size() - 1)
                this.f.a(p0 + 1);
            else if (this.d != 0)
                this.d.a();
        }
    }

}
