package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.frameworkviews.C3076f;
import com.squareup.leakcanary.C7582R;

public class MyAppsUpdatesEmptyView extends LinearLayout implements C3076f {
    public final Drawable f22995a;
    public ProgressBar f22996b;
    public TextView f22997c;
    public ImageView f22998d;
    public C4352w f22999e;
    public FrameLayout f23000f;
    public int f23001g;

    public MyAppsUpdatesEmptyView(Context context) {
        this(context, null);
    }

    public MyAppsUpdatesEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22995a = C0259a.m1526e(C0216d.m1112a(context, (int) C7582R.drawable.ic_refresh_white_48dp));
        this.f23001g = C1608h.m9243a(context, 3);
        C0259a.m1514a(this.f22995a.mutate(), this.f23001g);
    }

    protected void onMeasure(int i, int i2) {
        if (ai.f1848a.mo400k(this) == 1 && this.f22997c.getVisibility() != 8) {
            this.f22997c.setGravity(5);
        }
        super.onMeasure(i, i2);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22997c = (TextView) findViewById(C7582R.id.updates_empty_title);
        this.f22998d = (ImageView) findViewById(C7582R.id.updates_refresh_button);
        this.f22998d.setImageDrawable(this.f22995a);
        this.f23000f = (FrameLayout) findViewById(C7582R.id.progress_bar_frame_layout);
        this.f22996b = (ProgressBar) findViewById(C7582R.id.progress_bar);
        this.f22996b.setIndeterminateDrawable(C0259a.m1526e(this.f22996b.getIndeterminateDrawable()));
        C0259a.m1514a(this.f22996b.getIndeterminateDrawable().mutate(), this.f23001g);
        this.f22998d.setOnClickListener(new C4518v(this));
    }

    public final void m21030a(boolean z, boolean z2, C4352w c4352w) {
        if (z && z2) {
            throw new IllegalArgumentException("Cannot set loading and error to true at same time");
        }
        if (z2) {
            this.f22997c.setText(C7582R.string.myapps_checking_updates_failed);
            this.f22998d.setVisibility(0);
            this.f23000f.setVisibility(8);
        } else if (z) {
            this.f22997c.setText(C7582R.string.myapps_checking_updates);
            this.f22998d.setVisibility(8);
            this.f23000f.setVisibility(0);
        } else {
            this.f22997c.setText(C7582R.string.myapps_no_updates);
            this.f22998d.setVisibility(0);
            this.f23000f.setVisibility(8);
        }
        this.f22999e = c4352w;
    }
}
