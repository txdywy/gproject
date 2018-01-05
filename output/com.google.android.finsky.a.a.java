package com.google.android.finsky.a;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.os.Build$VERSION;
import android.view.View;
import android.view.Window;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.search.PlaySearchToolbar;

public final class com.google.android.finsky.a.a implements com.google.android.play.headerlist.m, com.google.android.play.search.aj
{

    public PlayHeaderListLayout a;
    public Window b;
    public final Drawable c;
    public final Drawable d;
    public Drawable e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public ObjectAnimator j;
    public ObjectAnimator k;

    a(Window p0, PlayHeaderListLayout p1) {
        this.b = p0;
        this.a = p1;
        this.c = new ColorDrawable(0);
        v2 = new int[2];
        v2[0] = this.a.getResources().getColor(2131558832);
        v2[1] = 0;
        this.d = new com.google.android.finsky.a.b(GradientDrawable$Orientation.TOP_BOTTOM, v2, PlaySearchToolbar.a(this.a.getContext()));
        this.e = this.d;
        this.i = p1.getResources().getColor(2131558760);
        this.f = this.a.e();
        this.h = this.a.d();
        this.b();
    }

    private final void a(Drawable p0) {
        if (this.a != 0)
            this.a.getToolbarContainer().setBackgroundDrawable(p0);
    }

    private final void f() {
        if (Build$VERSION.SDK_INT >= 21 && this.a != 0) {
            if (this.g != 0 && this.h == 0)
                v0 = 1;
            else
                v0 = 0;
            if (this.j != 0)
                this.j.cancel();
            if (v0 != 0)
                v3 = this.i;
            else
                v3 = this.a.getResources().getColor(2131558832);
            v6 = new int[1];
            v6[0] = v3;
            this.j = ObjectAnimator.ofArgb(this.b, "statusBarColor", v6);
            this.j.setDuration(300).start();
            if (this.k != 0)
                this.k.cancel();
            if (v0 != 0)
                v0 = 0;
            else
                v0 = 255;
            v1 = new int[1];
            v1[0] = v0;
            this.k = ObjectAnimator.ofInt(this.d, "alpha", v1);
            this.k.setDuration(300).start();
        }
    }

    public final void a() {
        if (this.a != 0) {
            v0 = this.a.e();
            if (this.f != v0) {
                this.f = v0;
                this.b();
            }
            v0 = this.a.d();
            if (this.h != v0) {
                this.h = v0;
                if (this.g != 0)
                    this.f();
            }
        }
    }

    public final void a(boolean p0) {
        if (this.g != p0) {
            this.g = p0;
            if (this.h == 0)
                this.f();
        }
    }

    public final void b() {
        if (this.f != 0)
            v0 = this.c;
        else
            v0 = this.d;
        this.e = v0;
        this.a(this.e);
    }

    public final void c() {
        this.a(1);
    }

    public final void d() {
        this.a(0);
    }

    public final void e() {
        this.a(this.c);
        this.b = 0;
        this.a = 0;
    }

}
