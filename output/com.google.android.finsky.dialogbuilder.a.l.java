package com.google.android.finsky.dialogbuilder.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.dialogbuilder.e;

public abstract class com.google.android.finsky.dialogbuilder.a.l
{

    public final LayoutInflater f;

    l(LayoutInflater p0) {
        this.f = p0;
    }

    public abstract int a();

    public View a(com.google.android.finsky.dialogbuilder.e p0, ViewGroup p1) {
        v0 = this.f.inflate(this.a(), p1, 0);
        this.a(p0, v0);
        return v0;
    }

    public abstract void a(com.google.android.finsky.dialogbuilder.e p0, View p1);

}
