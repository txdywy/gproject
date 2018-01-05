package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.squareup.leakcanary.C7582R;

public class JpkrMiniTopChartsControlBar extends RelativeLayout {
    public PlayInstalledAppsFilterToggle f22959a;
    public AppCompatSpinner f22960b;
    public boolean f22961c;
    public int f22962d;

    public JpkrMiniTopChartsControlBar(Context context) {
        super(context);
    }

    public JpkrMiniTopChartsControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22959a = (PlayInstalledAppsFilterToggle) findViewById(C7582R.id.installed_apps_filter);
        this.f22960b = (AppCompatSpinner) findViewById(C7582R.id.category_spinner);
        this.f22962d = getResources().getDimensionPixelSize(C7582R.dimen.jpkr_mini_top_charts_header_vertical_distance_between_child_views);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f22961c = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight() < this.f22959a.getMeasuredWidth() + this.f22960b.getMeasuredWidth();
        if (this.f22961c) {
            setMeasuredDimension(getMeasuredWidth(), (((getPaddingTop() + getPaddingBottom()) + this.f22959a.getMeasuredHeight()) + this.f22962d) + this.f22960b.getMeasuredHeight());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f22961c) {
            int left = (this.f22959a.getLeft() + this.f22959a.getPaddingLeft()) - this.f22960b.getPaddingLeft();
            int bottom = this.f22959a.getBottom() + this.f22962d;
            this.f22960b.layout(left, bottom, this.f22960b.getMeasuredWidth() + left, this.f22960b.getMeasuredHeight() + bottom);
        }
    }
}
