package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class BottomScrollView extends ScrollView {
    public C0618b f3962a;
    public int f3963b;
    public boolean f3964c = false;
    public final Runnable f3965d = new C0617a(this);

    public BottomScrollView(Context context) {
        super(context);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setBottomScrollListener(C0618b c0618b) {
        this.f3962a = c0618b;
    }

    public int getScrollThreshold() {
        return this.f3963b;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f3963b = Math.max(0, ((childAt.getMeasuredHeight() - i4) + i2) - getPaddingBottom());
        }
        if (i4 - i2 > 0) {
            post(this.f3965d);
        }
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i4 != i2) {
            m4253a();
        }
    }

    final void m4253a() {
        if (this.f3962a == null) {
            return;
        }
        if (getScrollY() >= this.f3963b) {
            this.f3962a.m4269a();
        } else if (!this.f3964c) {
            this.f3964c = true;
            this.f3962a.m4270b();
        }
    }
}
