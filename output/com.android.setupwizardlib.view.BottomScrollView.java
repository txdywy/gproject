package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class BottomScrollView extends ScrollView
{

    public com.android.setupwizardlib.view.b a;
    public int b;
    public boolean c;
    public final Runnable d;

    BottomScrollView(Context p0) {
        ScrollView(p0);
        this.c = 0;
        this.d = new com.android.setupwizardlib.view.a(this);
    }

    BottomScrollView(Context p0, AttributeSet p1) {
        ScrollView(p0, p1);
        this.c = 0;
        this.d = new com.android.setupwizardlib.view.a(this);
    }

    BottomScrollView(Context p0, AttributeSet p1, int p2) {
        ScrollView(p0, p1, p2);
        this.c = 0;
        this.d = new com.android.setupwizardlib.view.a(this);
    }

    final void a() {
        if (this.a != 0) {
            if (this.getScrollY() >= this.b)
                this.a.a();
            else if (this.c == 0) {
                this.c = 1;
                this.a.b();
            }
        }
    }

    public int getScrollThreshold() {
        return this.b;
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        v0 = this.getChildAt(0);
        if (v0 != 0)
            this.b = Math.max(0, v0.getMeasuredHeight() - p4 + p2 - this.getPaddingBottom());
        if (p4 - p2 > 0)
            this.post(this.d);
    }

    protected void onScrollChanged(int p0, int p1, int p2, int p3) {
        super.onScrollChanged(p0, p1, p2, p3);
        if (p3 != p1)
            this.a();
    }

    public void setBottomScrollListener(com.android.setupwizardlib.view.b p0) {
        this.a = p0;
    }

}
