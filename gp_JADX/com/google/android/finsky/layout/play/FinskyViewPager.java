package com.google.android.finsky.layout.play;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;

public class FinskyViewPager extends ViewPager {
    public boolean ah;
    public ag ai;

    public FinskyViewPager(Context context) {
        this(context, null);
    }

    public FinskyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah = false;
    }

    public void setMeasureOverrider(ag agVar) {
        this.ai = agVar;
    }

    protected void onMeasure(int i, int i2) {
        if (this.ai == null) {
            super.onMeasure(i, i2);
            return;
        }
        Pair a = this.ai.m17577a();
        super.onMeasure(((Integer) a.first).intValue(), ((Integer) a.second).intValue());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.ah && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.ah && super.onTouchEvent(motionEvent);
    }
}
