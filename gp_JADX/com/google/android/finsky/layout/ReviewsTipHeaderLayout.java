package com.google.android.finsky.layout;

import android.content.Context;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class ReviewsTipHeaderLayout extends LinearLayout {
    public TextView f18332a;
    public TextView f18333b;
    public View f18334c;
    public TextView f18335d;
    public TextView f18336e;
    public boolean f18337f;
    public boolean f18338g;

    public ReviewsTipHeaderLayout(Context context) {
        this(context, null);
    }

    public ReviewsTipHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18334c = findViewById(C7582R.id.tip_header_fullline);
        this.f18332a = (TextView) findViewById(C7582R.id.tip_title);
        this.f18333b = (TextView) findViewById(C7582R.id.tip_info);
        this.f18335d = (TextView) findViewById(C7582R.id.tip_title_line1);
        this.f18336e = (TextView) findViewById(C7582R.id.tip_info_line2);
    }

    public final void m17342a(CharSequence charSequence, CharSequence charSequence2) {
        this.f18332a.setText(charSequence);
        this.f18335d.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2)) {
            this.f18333b.setVisibility(4);
            this.f18336e.setVisibility(4);
            return;
        }
        this.f18333b.setVisibility(0);
        this.f18333b.setText(charSequence2);
        this.f18336e.setVisibility(0);
        this.f18336e.setText(charSequence2);
    }

    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        if (!this.f18338g) {
            this.f18334c.measure(0, 0);
        }
        boolean z = !this.f18338g && this.f18334c.getMeasuredWidth() <= size;
        this.f18337f = z;
        if (this.f18337f) {
            this.f18334c.measure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        } else {
            this.f18335d.measure(makeMeasureSpec, 0);
            this.f18336e.measure(makeMeasureSpec, 0);
        }
        if (this.f18337f) {
            measuredHeight = this.f18334c.getMeasuredHeight();
        } else {
            measuredHeight = this.f18335d.getMeasuredHeight() + this.f18336e.getMeasuredHeight();
        }
        setMeasuredDimension(MeasureSpec.getSize(i), measuredHeight + (getPaddingTop() + getPaddingBottom()));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int l = ai.f1848a.mo401l(this);
        if (this.f18337f) {
            int measuredWidth = this.f18334c.getMeasuredWidth();
            this.f18334c.setVisibility(0);
            this.f18335d.setVisibility(8);
            this.f18336e.setVisibility(8);
            int measuredHeight = this.f18334c.getMeasuredHeight();
            int a = k.a(width, measuredWidth, z2, l);
            width = getPaddingTop();
            this.f18334c.layout(a, width, measuredWidth + a, measuredHeight + width);
            return;
        }
        this.f18334c.setVisibility(8);
        this.f18335d.setVisibility(0);
        this.f18336e.setVisibility(0);
        a = this.f18335d.getMeasuredWidth();
        measuredHeight = this.f18336e.getMeasuredWidth();
        measuredWidth = this.f18335d.getMeasuredHeight();
        int measuredHeight2 = this.f18336e.getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int i5 = paddingTop + measuredWidth;
        width = (width - (l * 2)) / 2;
        l = width - (a / 2);
        width -= measuredHeight / 2;
        this.f18335d.layout(l, paddingTop, a + l, measuredWidth + paddingTop);
        this.f18336e.layout(width, i5, measuredHeight + width, i5 + measuredHeight2);
    }
}
