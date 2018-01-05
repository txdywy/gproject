package com.google.android.wallet.instrumentmanager.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.wallet.instrumentmanager.C6643f;

public class InstrumentManagerRootFrameLayout extends FrameLayout {
    public int f32834a;

    public InstrumentManagerRootFrameLayout(Context context) {
        super(context);
    }

    public InstrumentManagerRootFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30046a(context, attributeSet);
    }

    public InstrumentManagerRootFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30046a(context, attributeSet);
    }

    public View focusSearch(View view, int i) {
        return FocusFinder.getInstance().findNextFocus(this, view, i);
    }

    private final void m30046a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6643f.WalletImMaxWidthView);
        this.f32834a = obtainStyledAttributes.getDimensionPixelSize(C6643f.WalletImMaxWidthView_maxWidth, 0);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (this.f32834a > 0 && this.f32834a < size) {
            i = MeasureSpec.makeMeasureSpec(this.f32834a, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
