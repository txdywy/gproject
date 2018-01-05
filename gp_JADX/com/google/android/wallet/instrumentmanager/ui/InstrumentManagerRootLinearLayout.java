package com.google.android.wallet.instrumentmanager.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.google.android.wallet.instrumentmanager.C6643f;

public class InstrumentManagerRootLinearLayout extends LinearLayout {
    public int f32835a;

    public InstrumentManagerRootLinearLayout(Context context) {
        super(context);
    }

    public InstrumentManagerRootLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30047a(context, attributeSet);
    }

    public InstrumentManagerRootLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30047a(context, attributeSet);
    }

    @TargetApi(21)
    public InstrumentManagerRootLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m30047a(context, attributeSet);
    }

    public View focusSearch(View view, int i) {
        return FocusFinder.getInstance().findNextFocus(this, view, i);
    }

    private final void m30047a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6643f.WalletImMaxWidthView);
        this.f32835a = obtainStyledAttributes.getDimensionPixelSize(C6643f.WalletImMaxWidthView_maxWidth, 0);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (this.f32835a > 0 && this.f32835a < size) {
            i = MeasureSpec.makeMeasureSpec(this.f32835a, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
