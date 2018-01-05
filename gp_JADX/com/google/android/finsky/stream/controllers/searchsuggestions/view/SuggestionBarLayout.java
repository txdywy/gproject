package com.google.android.finsky.stream.controllers.searchsuggestions.view;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class SuggestionBarLayout extends RelativeLayout {
    public LinearLayout f22818a;
    public TextView f22819b;
    public TextView f22820c;
    public TextView f22821d;
    public TextView f22822e;
    public int f22823f;
    public View f22824g;
    public boolean f22825h;
    public int f22826i;
    public int f22827j;
    public int f22828k;

    public SuggestionBarLayout(Context context) {
        this(context, null);
    }

    public SuggestionBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22827j = getResources().getDimensionPixelSize(C7582R.dimen.suggestion_bar_vertical_padding);
        this.f22828k = getResources().getDimensionPixelSize(C7582R.dimen.play_cluster_header_height);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22818a = (LinearLayout) findViewById(C7582R.id.suggestion_line_full);
        this.f22819b = (TextView) findViewById(C7582R.id.suggestion_line_text);
        this.f22820c = (TextView) findViewById(C7582R.id.suggestion_line_query);
        this.f22821d = (TextView) findViewById(C7582R.id.suggestion_line1);
        this.f22822e = (TextView) findViewById(C7582R.id.suggestion_line2);
        this.f22823f = this.f22822e.getCurrentTextColor();
        this.f22824g = findViewById(C7582R.id.suggestion_underline);
    }

    public final void m20965a(C4492c c4492c) {
        int i;
        CharSequence a = ae.m9214a(c4492c.f22834b);
        if (c4492c.f22835c == 0) {
            i = this.f22823f;
        } else {
            i = C0216d.m1116c(getContext(), c4492c.f22835c);
        }
        this.f22821d.setText(c4492c.f22833a);
        this.f22822e.setText(a);
        this.f22822e.setSelected(true);
        this.f22822e.setTextColor(i);
        this.f22819b.setText(c4492c.f22833a);
        this.f22820c.setText(a);
        this.f22820c.setTextColor(i);
    }

    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        boolean z = false;
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        this.f22818a.measure(0, 0);
        this.f22821d.measure(makeMeasureSpec, 0);
        this.f22822e.measure(makeMeasureSpec, 0);
        this.f22824g.measure(0, MeasureSpec.makeMeasureSpec(this.f22824g.getLayoutParams().height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        if (this.f22818a.getMeasuredWidth() <= size) {
            z = true;
        }
        this.f22825h = z;
        if (this.f22825h) {
            measuredHeight = this.f22818a.getMeasuredHeight();
        } else {
            measuredHeight = this.f22821d.getMeasuredHeight() + this.f22822e.getMeasuredHeight();
        }
        this.f22826i = measuredHeight;
        this.f22826i += this.f22827j * 2;
        this.f22826i += this.f22824g.getMeasuredHeight();
        if (this.f22826i < this.f22828k) {
            this.f22826i = this.f22828k;
        }
        setMeasuredDimension(MeasureSpec.getSize(i), this.f22826i);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int measuredWidth = this.f22818a.getMeasuredWidth();
        int measuredWidth2 = this.f22821d.getMeasuredWidth();
        int measuredWidth3 = this.f22822e.getMeasuredWidth();
        height = (height - this.f22824g.getMeasuredHeight()) / 2;
        if (this.f22825h) {
            this.f22818a.setVisibility(0);
            this.f22821d.setVisibility(8);
            this.f22822e.setVisibility(8);
            measuredWidth2 = this.f22818a.getMeasuredHeight();
            this.f22818a.layout(paddingLeft, height - (measuredWidth2 / 2), measuredWidth + paddingLeft, height + (measuredWidth2 / 2));
        } else {
            this.f22818a.setVisibility(8);
            this.f22821d.setVisibility(0);
            this.f22822e.setVisibility(0);
            measuredWidth = this.f22821d.getMeasuredHeight();
            int measuredHeight = this.f22822e.getMeasuredHeight();
            height -= (measuredWidth + measuredHeight) / 2;
            measuredWidth += height;
            this.f22821d.layout(paddingLeft, height, measuredWidth2 + paddingLeft, measuredWidth);
            this.f22822e.layout(paddingLeft, measuredWidth, paddingLeft + measuredWidth3, measuredWidth + measuredHeight);
        }
        this.f22824g.layout(0, this.f22826i - this.f22824g.getMeasuredHeight(), width, this.f22826i);
    }
}
