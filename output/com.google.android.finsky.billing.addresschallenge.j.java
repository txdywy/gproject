package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import java.util.List;

public abstract class com.google.android.finsky.billing.addresschallenge.j extends FrameLayout
{

    public ProgressBar a;
    public LinearLayout b;
    public ProgressBar c;

    j(Context p0) {
        com.google.android.finsky.billing.addresschallenge.j(p0, 0);
    }

    j(Context p0, AttributeSet p1) {
        com.google.android.finsky.billing.addresschallenge.j(p0, p1, 0);
    }

    j(Context p0, AttributeSet p1, int p2) {
        FrameLayout(p0, p1, p2);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public void e() {
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ProgressBar)this.findViewById(2131755336);
        this.b = (LinearLayout)this.findViewById(2131755335);
        this.c = (ProgressBar)this.findViewById(2131755337);
    }

    public abstract void setFields(List p0);

    public abstract void setOnHeightOffsetChangedListener(com.google.android.finsky.billing.addresschallenge.s p0);

}
