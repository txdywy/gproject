package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class ErrorFooter extends ViewGroup implements OnClickListener, ae {
    public TextView f16185a;
    public Button f16186b;
    public C1098i f16187c;

    public ErrorFooter(Context context) {
        this(context, null);
    }

    public ErrorFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16185a = (TextView) findViewById(C7582R.id.error_message);
        this.f16186b = (Button) findViewById(C7582R.id.retry_button);
        this.f16186b.setOnClickListener(this);
    }

    public final void m16021a(String str, C1098i c1098i) {
        this.f16185a.setText(str);
        this.f16186b.setText(C7582R.string.network_retry);
        this.f16187c = c1098i;
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        this.f16186b.measure(MeasureSpec.makeMeasureSpec(paddingLeft / 2, Integer.MIN_VALUE), 0);
        this.f16185a.measure(MeasureSpec.makeMeasureSpec(paddingLeft - this.f16186b.getMeasuredWidth(), Integer.MIN_VALUE), 0);
        setMeasuredDimension(size, (getPaddingTop() + getPaddingBottom()) + Math.max(this.f16185a.getMeasuredHeight(), this.f16186b.getMeasuredHeight()));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = this.f16186b.getMeasuredWidth();
        int measuredHeight = this.f16186b.getMeasuredHeight();
        int measuredWidth2 = this.f16185a.getMeasuredWidth();
        int measuredHeight2 = this.f16185a.getMeasuredHeight();
        int i5 = ((((height - paddingTop) - paddingBottom) - measuredHeight) / 2) + paddingTop;
        this.f16186b.layout((width - paddingRight) - measuredWidth, i5, width - paddingRight, measuredHeight + i5);
        height = ((((height - paddingTop) - paddingBottom) - measuredHeight2) / 2) + paddingTop;
        width = (((((width - paddingLeft) - paddingRight) - measuredWidth) - measuredWidth2) / 2) + paddingLeft;
        this.f16185a.layout(width, height, width + measuredWidth2, height + measuredHeight2);
    }

    public void onClick(View view) {
        this.f16187c.Q_();
    }

    public final void Z_() {
        this.f16187c = null;
    }
}
