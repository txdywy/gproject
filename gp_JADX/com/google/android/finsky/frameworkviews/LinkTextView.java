package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.C1620u;

public class LinkTextView extends TextView {
    public final C1620u f16207a;

    public LinkTextView(Context context) {
        this(context, null);
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16207a = new C1620u(this);
        ai.m1829a((View) this, this.f16207a);
    }

    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f16207a.m2170a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }
}
