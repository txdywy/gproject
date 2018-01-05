package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.headerlistlayout.FinskyTabStrip;
import com.google.android.finsky.headerlistlayout.c;
import com.google.android.finsky.headerlistlayout.f;
import com.google.android.finsky.ia2.Ia2SubNavView;
import com.google.android.finsky.m;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.android.play.search.PlaySearchToolbar;

protected final class com.google.android.finsky.activities.gr extends com.google.android.finsky.headerlistlayout.f
{

    public final int a;
    public final boolean b;
    public final com.google.android.finsky.activities.gn c;

    gr(com.google.android.finsky.activities.gn p0, Context p1, int p2, boolean p3) {
        this.c = p0;
        com.google.android.finsky.headerlistlayout.f(p1);
        this.a = p2;
        this.b = p3;
    }

    protected final int a() {
        return 2130968963;
    }

    protected final int a(Context p0) {
        if (!this.c.N_()) {
            if (this.c.al != 0 && !this.c.aj())
                v0 = PlaySearchToolbar.a(this.f) + this.c.i().getDimensionPixelSize(2131624396);
            else
                v0 = super.a(p0);
        }
        return v0;
    }

    protected final PlayHeaderListTabStrip a(Context p0, LayoutInflater p1) {
        this.c.aA = (FinskyTabStrip)p1.inflate(2130968872, 0);
        this.c.aA.setUseHomeScrollingTabs(this.c.aj());
        if (this.c.aB == 0)
            this.c.aB = new com.google.android.finsky.headerlistlayout.c(p0);
        this.c.aA.setControlsContainerBackgroundCoordinator(this.c.aB);
        return this.c.aA;
    }

    protected final void a(LayoutInflater p0, ViewGroup p1) {
        this.c.aw = p1;
    }

    protected final void a(ViewGroup p0) {
        this.c.az = p0;
    }

    protected final int b() {
        return 2131755428;
    }

    protected final void b(LayoutInflater p0, ViewGroup p1) {
        if (this.c.ao()) {
            this.c.aM = (Ia2SubNavView)p0.inflate(2130968980, p1, 0);
            p1.addView(this.c.aM);
            p1.setVisibility(0);
        }
    }

    protected final int c() {
        v0 = 3;
        if (!this.c.aj() && !this.c.ao() && this.a == 1)
            v0 = 2;
        return v0;
    }

    protected final int d() {
        if (this.b != 0)
            v0 = 0;
        else
            v0 = 1;
        return v0;
    }

    protected final int e() {
        return 3;
    }

    protected final boolean f() {
        return 1;
    }

    protected final int g() {
        return 2131756034;
    }

    protected final int h() {
        return 1;
    }

    protected final int i() {
        if (this.c.aj() && com.google.android.finsky.m.a.dj().a(12624222))
            v0 = 0;
        else if (this.c.ao())
            v0 = this.c.aN;
        else
            v0 = 1;
        return v0;
    }

    protected final boolean j() {
        return 0;
    }

    protected final float k() {
        return 1061997773;
    }

    protected final boolean l() {
        if (!this.c.ao())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int m() {
        return this.f.getResources().getColor(2131558832);
    }

    protected final int n() {
        return com.google.android.finsky.bg.h.a(this.f, this.c.e);
    }

    public final int o() {
        return this.c.ah();
    }

    public final com.google.android.finsky.headerlistlayout.c p() {
        return this.c.aB;
    }

    protected final int q() {
        if (this.c.al != 0 || this.b != 0)
            v0 = 1;
        else
            v0 = super.q();
        return v0;
    }

    protected final boolean r() {
  4:    if (!super.r()) goto 28;
 10:    if (this.c.al != 0) {
 18:        if (!this.c.N_() && this.c.aq == 0)
 26:            v0 = 1;
            else
 28:            v0 = 0;
        }
 27:    return v0;
    }

    protected final int s() {
        if (this.c.ao())
            v0 = this.f.getResources().getDimensionPixelSize(2131624607);
        else
            v0 = 0;
        return v0;
    }

}
