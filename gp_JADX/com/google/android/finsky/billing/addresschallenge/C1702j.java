package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public abstract class C1702j extends FrameLayout {
    public ProgressBar f8756a;
    public LinearLayout f8757b;
    public ProgressBar f8758c;

    public C1702j(Context context) {
        this(context, null);
    }

    public abstract void mo2404a();

    public abstract void mo2405b();

    public abstract void mo2406c();

    public abstract void mo2407d();

    public abstract void setFields(List list);

    public abstract void setOnHeightOffsetChangedListener(C1703s c1703s);

    public C1702j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1702j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f8756a = (ProgressBar) findViewById(C7582R.id.address_progress_bar);
        this.f8757b = (LinearLayout) findViewById(C7582R.id.address_inner_layout);
        this.f8758c = (ProgressBar) findViewById(C7582R.id.upper_right_progress_bar);
    }

    public void mo2408e() {
    }
}
