package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout implements Checkable {
    public boolean f3969a = false;

    public CheckableLinearLayout(Context context) {
        super(context);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(11)
    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected int[] onCreateDrawableState(int i) {
        if (!this.f3969a) {
            return super.onCreateDrawableState(i);
        }
        return mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{16842912});
    }

    public void setChecked(boolean z) {
        this.f3969a = z;
        refreshDrawableState();
    }

    public boolean isChecked() {
        return this.f3969a;
    }

    public void toggle() {
        setChecked(!isChecked());
    }
}
