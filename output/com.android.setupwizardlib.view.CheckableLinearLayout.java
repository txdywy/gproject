package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout implements Checkable
{

    public boolean a;

    CheckableLinearLayout(Context p0) {
        LinearLayout(p0);
        this.a = 0;
    }

    CheckableLinearLayout(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
        this.a = 0;
    }

    CheckableLinearLayout(Context p0, AttributeSet p1, int p2) {
        LinearLayout(p0, p1, p2);
        this.a = 0;
    }

    CheckableLinearLayout(Context p0, AttributeSet p1, int p2, int p3) {
        LinearLayout(p0, p1, p2, p3);
        this.a = 0;
    }

    public boolean isChecked() {
        return this.a;
    }

    protected int[] onCreateDrawableState(int p0) {
        if (this.a != 0) {
            v1 = new int[1];
            v1[0] = 16842912;
            v0 = CheckableLinearLayout.mergeDrawableStates(super.onCreateDrawableState(p0 + 1), v1);
        }
        else
            v0 = super.onCreateDrawableState(p0);
        return v0;
    }

    public void setChecked(boolean p0) {
        this.a = p0;
        this.refreshDrawableState();
    }

    public void toggle() {
        if (!this.isChecked())
            v0 = 1;
        else
            v0 = 0;
        this.setChecked(v0);
    }

}
