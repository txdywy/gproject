package com.google.android.finsky.dialogbuilder.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;

public class CheckedView extends CheckedTextView {
    public final OnClickListener f15129a = new C2803c(this);
    public OnClickListener f15130b;
    public C2801d f15131c;

    public CheckedView(Context context) {
        super(context);
        super.setOnClickListener(this.f15129a);
    }

    public CheckedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnClickListener(this.f15129a);
    }

    public CheckedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnClickListener(this.f15129a);
    }

    public CheckedView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        super.setOnClickListener(this.f15129a);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f15130b = onClickListener;
    }

    public boolean hasOnClickListeners() {
        return this.f15130b != null;
    }

    public void toggle() {
        if (!isChecked()) {
            setChecked(true);
        }
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        if (this.f15131c != null && isChecked()) {
            this.f15131c.mo3139a(this);
        }
    }
}
