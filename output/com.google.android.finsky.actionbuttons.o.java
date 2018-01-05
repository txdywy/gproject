package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.FinskyLog;

protected final class com.google.android.finsky.actionbuttons.o implements com.google.android.finsky.actionbuttons.a
{

    public final Context a;
    public final int b;
    public final com.google.android.finsky.d.w c;
    public final com.google.android.finsky.d.ad d;
    public com.google.android.finsky.d.ad e;

    o(Context p0, int p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.ad p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public PlayActionButtonV2 a(ViewGroup p0) {
        if (this.b == 3)
            v0 = (PlayActionButtonV2)LayoutInflater.from(this.a).inflate(2130969200, p0, 0);
        else
            v0 = (PlayActionButtonV2)LayoutInflater.from(this.a).inflate(2130969199, p0, 0);
        return v0;
    }

    protected final void b() {
        v0 = this.a();
        if (v0 == 0)
            FinskyLog.e("Invalid logging element type.", new Object[0]);
        else {
            if (this.e == 0)
                this.e = new com.google.android.finsky.d.o(v0, this.d);
            this.d.a(this.e);
        }
    }

    protected final void c() {
        v0 = this.a();
        if (v0 == 0)
            FinskyLog.e("Invalid logging element type.", new Object[0]);
        else {
            if (this.e == 0)
                this.e = new com.google.android.finsky.d.o(v0, this.d);
            this.c.b(new com.google.android.finsky.d.d(this.e));
        }
    }

}
