package com.google.android.wallet.ui.p393e;

import android.support.v4.view.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.a.a.a.a.b.a.b.a.ak;
import com.google.android.wallet.p383e.C6623g;

final class C6806d implements Runnable {
    public final ViewGroup f33743a;
    public final ak f33744b;
    public final LayoutInflater f33745c;

    public C6806d(ViewGroup viewGroup, ak akVar, LayoutInflater layoutInflater) {
        this.f33743a = viewGroup;
        this.f33744b = akVar;
        this.f33745c = layoutInflater;
    }

    public final void run() {
        int i;
        int measuredWidth = (this.f33743a.getMeasuredWidth() - this.f33743a.getPaddingLeft()) - this.f33743a.getPaddingRight();
        int childCount = this.f33743a.getChildCount();
        int i2 = 0;
        for (i = 0; i < childCount; i++) {
            View childAt = this.f33743a.getChildAt(i);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            i2 += r.b(marginLayoutParams) + (childAt.getMeasuredWidth() + r.a(marginLayoutParams));
        }
        if (i2 < measuredWidth) {
            i = this.f33744b.e.length;
            for (int i3 = 0; i3 < i; i3++) {
                this.f33743a.addView(this.f33745c.inflate(C6623g.view_splitting_view, this.f33743a, false), (this.f33744b.e[i3] - this.f33744b.b) + i3);
            }
        }
    }
}
