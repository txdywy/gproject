package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.android.vending.C0629a;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class DetailsSummaryDynamic extends ViewGroup {
    public boolean f6005a;
    public aa f6006b;
    public ViewGroup f6007c;
    public View f6008d;
    public View f6009e;
    public int f6010f;

    public DetailsSummaryDynamic(Context context) {
        this(context, null);
    }

    public DetailsSummaryDynamic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6010f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.DetailsSummaryDynamic);
        this.f6005a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6007c = (ViewGroup) findViewById(C7582R.id.button_container);
        this.f6008d = findViewById(C7582R.id.download_progress_panel);
        this.f6009e = findViewById(C7582R.id.summary_dynamic_status);
    }

    public void setRefreshListener(aa aaVar) {
        this.f6006b = aaVar;
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        this.f6007c.measure(i, i2);
        int measuredWidth = this.f6007c.getMeasuredWidth();
        int measuredHeight = this.f6007c.getMeasuredHeight();
        if (this.f6005a && (this.f6007c instanceof DetailsButtonLayout)) {
            this.f6010f = ((DetailsButtonLayout) this.f6007c).getFirstVisibleActionButtonXPadding();
            i = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i) - this.f6010f, mode);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, MemoryMappedFileBuffer.DEFAULT_SIZE);
        if (this.f6008d.getVisibility() == 8 || mode != MemoryMappedFileBuffer.DEFAULT_SIZE) {
            this.f6008d.measure(makeMeasureSpec, i2);
        } else {
            this.f6008d.measure(i, i2);
        }
        measuredWidth = Math.max(measuredWidth, this.f6008d.getMeasuredWidth());
        measuredHeight = Math.max(measuredHeight, this.f6008d.getMeasuredHeight());
        if (this.f6009e.getVisibility() == 8 || mode != MemoryMappedFileBuffer.DEFAULT_SIZE) {
            this.f6009e.measure(makeMeasureSpec, i2);
        } else {
            this.f6009e.measure(i, i2);
        }
        setMeasuredDimension(Math.max(measuredWidth, this.f6009e.getMeasuredWidth()), Math.max(measuredHeight, this.f6009e.getMeasuredHeight()));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int measuredWidth = getMeasuredWidth();
        int paddingTop = getPaddingTop();
        int l = ai.f1848a.mo401l(this);
        while (i5 < getChildCount()) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6;
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = paddingTop + childAt.getMeasuredHeight();
                if (childAt instanceof DetailsButtonLayout) {
                    i6 = l;
                } else {
                    i6 = this.f6010f + l;
                }
                i6 = k.a(measuredWidth, measuredWidth2, z2, i6);
                childAt.layout(i6, paddingTop, measuredWidth2 + i6, measuredHeight);
            }
            i5++;
        }
    }

    public int getXStartOffset() {
        return this.f6010f;
    }

    public int getVisibleButtonsCount() {
        int i = 0;
        if (this.f6007c.getVisibility() != 0) {
            return 0;
        }
        int i2 = 0;
        while (i < this.f6007c.getChildCount()) {
            if (this.f6007c.getChildAt(i).getVisibility() == 0) {
                i2++;
            }
            i++;
        }
        return i2;
    }

    public void setForceWideLayout(boolean z) {
        if (this.f6007c instanceof DetailsButtonLayout) {
            ((DetailsButtonLayout) this.f6007c).setForceWideLayout(z);
        }
    }
}
