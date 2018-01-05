package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;

public class CheckableFrameLayout extends FrameLayout implements Checkable {
    public static final int[] f33307a = new int[]{16842912};
    public boolean f33308b = false;

    public CheckableFrameLayout(Context context) {
        super(context);
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public CheckableFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public boolean isChecked() {
        return this.f33308b;
    }

    public void setChecked(boolean z) {
        if (z != this.f33308b) {
            this.f33308b = z;
            refreshDrawableState();
            m30579a(this, z);
        }
    }

    public void toggle() {
        setChecked(!this.f33308b);
    }

    private final void m30579a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(z);
            } else if (childAt instanceof ViewGroup) {
                m30579a((ViewGroup) childAt, z);
            }
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f33307a);
        }
        return onCreateDrawableState;
    }
}
