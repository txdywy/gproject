package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import com.squareup.leakcanary.C7582R;

public class OutlinedForegroundLinearLayout extends ForegroundLinearLayout implements C3075q {
    public boolean f15981g;
    public boolean f15982h;
    public int f15983i;
    public int f15984j;

    public OutlinedForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public OutlinedForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OutlinedForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }

    public void setIsFirstRow(boolean z) {
        this.f15981g = z;
    }

    public void setIsLastRow(boolean z) {
        this.f15982h = z;
    }

    public void setDividerSize(int i) {
        this.f15983i = i;
    }

    public void setBottomMargin(int i) {
        this.f15984j = i;
    }

    public final boolean ap_() {
        return this.f15981g;
    }

    public final boolean aq_() {
        return this.f15982h;
    }

    public int getDividerSize() {
        return this.f15983i;
    }

    public int getSectionBottomSpacerSize() {
        return this.f15984j;
    }
}
