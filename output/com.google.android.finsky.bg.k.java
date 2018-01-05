package com.google.android.finsky.bg;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;

public final class com.google.android.finsky.bg.k
{

    public final Context a;
    public final com.google.android.finsky.ba.c b;
    public final com.google.android.finsky.as.a c;
    public float d;

    k(Context p0, com.google.android.finsky.ba.c p1, com.google.android.finsky.as.a p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public static int a(int p0, Resources p1) {
        return (int)(p1.getDisplayMetrics().density * (float)p0 + 1056964608);
    }

    public static int b(Resources p0) {
        return (com.google.android.finsky.bg.k.l(p0) - p0.getDimensionPixelSize(2131625679)) / 2;
    }

    public static int l(Resources p0) {
        return com.google.android.finsky.bg.k.a(p0.getConfiguration().screenWidthDp, p0);
    }

    public static int m(Resources p0) {
        return com.google.android.finsky.bg.k.a(p0.getConfiguration().screenHeightDp, p0);
    }

    public static boolean n(Resources p0) {
        if (com.google.android.finsky.bg.k.m(p0) > com.google.android.finsky.bg.k.l(p0))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final float a() {
        if (this.b.dj().a(12636089) && this.c.h != 0)
            v0 = 0;
        else
            v0 = 1048576000;
        return v0;
    }

    public final int a(Context p0, int p1) {
        if (this.d == 0)
            this.d = p0.getResources().getDisplayMetrics().density;
        return Math.round((float)p1 / this.d);
    }

    public final int a(Resources p0) {
        v0 = this.b.dj();
        if (v0.a(12631598)) {
            if (v0.a(12632714))
                v0 = p0.getDimensionPixelSize(2131624419);
            else
                v0 = p0.getDimensionPixelSize(2131624420);
        }
        else
            v0 = p0.getDimensionPixelSize(2131624418);
        return v0;
    }

    public final int b() {
        return this.a.getResources().getDisplayMetrics().widthPixels;
    }

    public final int c() {
        return this.a.getResources().getDisplayMetrics().heightPixels;
    }

    public final int c(Resources p0) {
        if (this.b.dj().a(12631598))
            v0 = p0.getDimensionPixelSize(2131624415);
        else
            v0 = p0.getDimensionPixelSize(2131624414);
        return v0;
    }

    public final int d(Resources p0) {
        if (this.b.dj().a(12631598))
            v0 = p0.getDimensionPixelSize(2131624511);
        else
            v0 = p0.getDimensionPixelSize(2131624510);
        return v0;
    }

    public final int e(Resources p0) {
        if (this.b.dj().a(12632714))
            v0 = p0.getDimensionPixelSize(2131624502);
        else
            v0 = p0.getDimensionPixelSize(2131624501);
        return v0;
    }

    public final int f(Resources p0) {
        return com.google.android.finsky.bg.k.l(p0) - this.a(p0) * 2;
    }

    public final int g(Resources p0) {
        if (p0.getBoolean(2131492883))
            v0 = Math.min((int)((double)this.f(p0) * 4607182418800017408) / p0.getDimensionPixelSize(2131624853), 5);
        else
            v0 = p0.getInteger(2131820580);
        return v0;
    }

    public final int h(Resources p0) {
        if (p0.getBoolean(2131492883))
            v0 = Math.min(this.f(p0) / p0.getDimensionPixelSize(2131624853), 5);
        else
            v0 = p0.getInteger(2131820581);
        return v0;
    }

    public final int i(Resources p0) {
        v1 = this.b.dj();
        if (v1.a(12632714))
            v0 = p0.getInteger(2131820559);
        else
            v0 = p0.getInteger(2131820557);
        if (v1.a(12630054)) {
            if (v1.a(12632714))
                v0 = p0.getInteger(2131820561);
            else
                v0 = p0.getInteger(2131820560);
        }
        return v0;
    }

    public final boolean j(Resources p0) {
        if (this.b.dj().a(12636865) && p0.getBoolean(2131492898))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean k(Resources p0) {
        v0 = p0.getBoolean(2131492903);
        if (this.b.dj().a(12636865)) {
            if (v0 != 0 && !this.j(p0))
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

}
