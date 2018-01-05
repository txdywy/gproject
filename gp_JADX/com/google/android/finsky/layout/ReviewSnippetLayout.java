package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;

public class ReviewSnippetLayout extends LinearLayout {
    public final NumberFormat f18326a;
    public TextView f18327b;
    public ReviewsTipHeaderLayout f18328c;
    public boolean f18329d;

    public ReviewSnippetLayout(Context context) {
        this(context, null);
    }

    public ReviewSnippetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18326a = NumberFormat.getIntegerInstance();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18327b = (TextView) findViewById(C7582R.id.snippet_body);
        this.f18328c = (ReviewsTipHeaderLayout) findViewById(C7582R.id.snippet_header);
    }

    protected void onMeasure(int i, int i2) {
        this.f18328c.measure(MeasureSpec.makeMeasureSpec((MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE), i2);
        this.f18329d = !this.f18328c.f18337f;
        if (this.f18329d) {
            this.f18327b.setGravity(1);
        } else {
            this.f18327b.setGravity(8388611);
        }
        super.onMeasure(i, i2);
    }
}
