package com.google.android.finsky.billing.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.finsky.bg.ag;
import com.google.android.play.utils.k;

public class LightPurchaseButtonBarLayout extends ViewGroup
{

    public View a;
    public View b;
    public View c;
    public View d;
    public View e;
    public boolean f;
    public int g;
    public final int h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public final Rect w;

    LightPurchaseButtonBarLayout(Context p0) {
        LightPurchaseButtonBarLayout(p0, 0);
    }

    LightPurchaseButtonBarLayout(Context p0, AttributeSet p1) {
        ViewGroup(p0, p1);
        this.f = 1;
        v0 = this.getResources();
        v1 = v0.getDimensionPixelSize(2131624755);
        v2 = v0.getDimensionPixelSize(2131624754);
        this.h = v0.getDimensionPixelOffset(2131625400);
        this.i = v0.getDimensionPixelOffset(2131625401);
        this.j = v0.getDimensionPixelOffset(2131625404);
        android.support.v4.view.ai.a(this, v2, v1, v2, v1);
        this.q = v0.getDimensionPixelSize(2131624753);
        this.r = v0.getDimensionPixelSize(2131624756);
        this.s = v0.getDimensionPixelSize(2131625403);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
    }

    private final void a(int p0, int p1) {
        v1 = 0;
        if (this.k > (p0 - p1) / 2)
            v0 = this.k - (p0 - p1) / 2;
        else
            v0 = 0;
        this.l = v0;
        if (this.m > (p0 - p1) / 2)
            v1 = this.m - (p0 - p1) / 2;
        this.n = v1;
    }

    private final boolean a() {
        if (this.a.getVisibility() == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final boolean b() {
        if (this.d != 0 && this.d.getVisibility() == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public int getPaddingBottom() {
        return this.m;
    }

    public int getPaddingEnd() {
        return this.p;
    }

    public int getPaddingLeft() {
        return this.o;
    }

    public int getPaddingRight() {
        return this.p;
    }

    public int getPaddingStart() {
        return this.o;
    }

    public int getPaddingTop() {
        return this.k;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.findViewById(2131755333);
        this.b = this.findViewById(2131756144);
        this.c = (Button)this.findViewById(2131755791);
        this.d = this.findViewById(2131756145);
        this.e = (Button)this.findViewById(2131755776);
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        if (android.support.v4.view.ai.a.k(this) == 0)
            v0 = 1;
        else
            v0 = 0;
        v4 = this.getWidth();
        v5 = this.getHeight() - this.l - this.n;
        if (this.a()) {
            v6 = this.a.getMeasuredWidth();
            v7 = this.a.getMeasuredHeight();
            if (this.g == 0)
                v1 = this.l + (v5 - v7) / 2;
            else if (this.g == 3) {
                v1 = (this.b.getMeasuredHeight() - this.c.getMeasuredHeight()) / 2;
                if (this.r > v1)
                    v1 = this.r - v1;
                else
                    v1 = 0;
                v1 = v1 + this.l + this.b.getMeasuredHeight();
            }
            else
                v1 = this.l;
            v2 = com.google.android.play.utils.k.a(v4, v6, v0, this.o);
            if (this.g == 3)
                v2 = v2 + (v4 - this.o - this.p - v6) / 2;
            this.a.layout(v2, v1, v6 + v2, v7 + v1);
        }
        v6 = this.b.getMeasuredWidth();
        v7 = this.b.getMeasuredHeight();
        switch (this.g) {
            case 0:
                v1 = this.l + (v5 - v7) / 2;
                break;
            case 1:
                v1 = (v7 - this.c.getMeasuredHeight()) / 2;
                if (this.r > v1)
                    v1 = this.r - v1;
                else
                    v1 = 0;
                v1 = v1 + this.l + this.a.getMeasuredHeight();
                break;
            case 2:
                v1 = this.l;
                break;
            case 3:
                v1 = this.l;
                break;
            case 4:
                v1 = this.l + (v5 - v7) / 2;
                break;
            default:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(this.g);
                throw new IllegalStateException(String.format("Unknown ContentFormat for button bar: %d", v2));
        }
        v2 = com.google.android.play.utils.k.b(v4, v6, v0, this.p);
        this.b.layout(v2, v1, v2 + v6, v1 + v7);
        if (this.b()) {
            v3 = this.d.getMeasuredWidth();
            v8 = this.d.getMeasuredHeight();
            if (this.g == 0) {
                v2 = (v5 - v8) / 2 + this.l;
                v1 = this.q + v3 + v6;
            }
            else {
                v2 = (v7 - this.c.getMeasuredHeight()) / 2;
                v5 = (v8 - this.e.getMeasuredHeight()) / 2;
                if (this.r > v2 + v5)
                    v2 = this.r - (v2 + v5);
                else
                    v2 = 0;
                v2 = v1 + v7 + v2;
                v1 = v3;
            }
            v0 = com.google.android.play.utils.k.b(v4, v1, v0, this.p);
            this.d.layout(v0, v2, v3 + v0, v2 + v8);
        }
        com.google.android.finsky.bg.ag.a(this.c, this.t, this.u, this.s);
        com.google.android.finsky.bg.ag.a(this.e, this.v, this.w, this.s);
    }

    protected void onMeasure(int p0, int p1) {
        v1 = 0;
        this.b.setVisibility(this.c.getVisibility());
        if (this.d != 0 && this.e != 0) {
            this.d.setVisibility(this.e.getVisibility());
            if (this.f == 0 || this.c.getVisibility() == 0 && this.e.getVisibility() == 0)
                this.a.setVisibility(8);
            else
                this.a.setVisibility(0);
        }
        v6 = View$MeasureSpec.getSize(p0);
        if (this.a()) {
            this.a.measure(0, 0);
            v2 = this.q + this.a.getMeasuredWidth();
            v0 = this.a.getMeasuredHeight();
        }
        else {
            v0 = 0;
            v2 = 0;
        }
        if (this.c.getVisibility() == 0) {
            this.c.setMinimumHeight(this.h);
            this.c.setMinimumWidth(this.i);
            android.support.v4.view.ai.a(this.c, this.j, this.c.getPaddingTop(), this.j, this.c.getPaddingBottom());
        }
        if (this.e.getVisibility() == 0) {
            this.e.setMinimumHeight(this.h);
            this.e.setMinimumWidth(this.i);
            android.support.v4.view.ai.a(this.e, this.j, this.e.getPaddingTop(), this.j, this.e.getPaddingBottom());
        }
        this.b.measure(0, 0);
        v5 = this.b.getMeasuredWidth();
        v4 = this.b.getMeasuredHeight();
        v3 = this.c.getMeasuredHeight();
        if (this.b()) {
            this.d.measure(0, 0);
            v4 = Math.max(v4, this.d.getMeasuredHeight());
            v3 = Math.max(v3, this.e.getMeasuredHeight());
            v5 = v5 + this.d.getMeasuredWidth() + this.q;
        }
        if (v2 + v5 <= v6 - this.o - this.p) {
            this.g = 0;
            if (v0 < v4)
                this.a(v4, v3);
            v0 = Math.max(v0, v4);
        }
        else if (!this.b()) {
            this.b.measure(View$MeasureSpec.makeMeasureSpec(v6 - this.o - this.p, -2147483648), 0);
            if (this.g != 3) {
                this.g = 4;
                this.a.setVisibility(8);
                this.a(this.b.getMeasuredHeight(), this.c.getMeasuredHeight());
                v0 = this.b.getMeasuredHeight();
            }
            else {
                this.l = this.k;
                if (this.r > (v4 - v3) / 2)
                    v2 = this.r - (v4 - v3) / 2;
                else
                    v2 = 0;
                if (this.g == 3) {
                    if (this.k > (v4 - v3) / 2)
                        v1 = this.k - (v4 - v3) / 2;
                    this.l = v1;
                    v1 = this.m;
                    v3 = this;
                }
                else if (this.m > (v4 - v3) / 2) {
                    v1 = this.m - (v4 - v3) / 2;
                    v3 = this;
                }
                else
                    v3 = this;
                v3.n = v1;
                v0 = v0 + this.b.getMeasuredHeight() + v2;
            }
        }
        else {
            this.b.measure(View$MeasureSpec.makeMeasureSpec(v6 - this.o - this.p, -2147483648), 0);
            this.d.measure(View$MeasureSpec.makeMeasureSpec(v6 - this.o - this.p, -2147483648), 0);
            this.g = 2;
            v3 = (this.b.getMeasuredHeight() - this.c.getMeasuredHeight()) / 2;
            if (this.k > v3)
                v0 = this.k - v3;
            else
                v0 = 0;
            this.l = v0;
            v2 = (this.d.getMeasuredHeight() - this.e.getMeasuredHeight()) / 2;
            if (this.m > v2)
                v0 = this.m - v2;
            else
                v0 = 0;
            this.n = v0;
            if (this.r > v3 + v2)
                v1 = this.r - (v3 + v2);
            v0 = this.b.getMeasuredHeight() + v1 + this.d.getMeasuredHeight();
        }
        this.setMeasuredDimension(v6, v0 + this.l + this.n);
    }

    public void setPadding(int p0, int p1, int p2, int p3) {
        this.k = p1;
        this.m = p3;
        this.o = p0;
        this.p = p2;
        super.setPadding(p0, p1, p2, p3);
    }

    public void setPaddingRelative(int p0, int p1, int p2, int p3) {
        this.k = p1;
        this.m = p3;
        this.o = p0;
        this.p = p2;
        super.setPaddingRelative(p0, p1, p2, p3);
    }

    public void setShouldShowLogo(boolean p0) {
        this.f = p0;
    }

}
