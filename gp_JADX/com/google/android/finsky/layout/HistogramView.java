package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.bg.aa;
import com.google.android.play.layout.StarRatingBar;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;

public class HistogramView extends LinearLayout {
    public LinearLayout f18210a;
    public HistogramTable f18211b;
    public TextView f18212c;
    public StarRatingBar f18213d;
    public TextView f18214e;
    public NumberFormat f18215f;
    public final boolean f18216g;
    public final boolean f18217h;
    public final int f18218i;
    public final Paint f18219j;
    public final int f18220k;

    public HistogramView(Context context) {
        this(context, null);
    }

    public HistogramView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18215f = NumberFormat.getIntegerInstance();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.HistogramView);
        this.f18216g = obtainStyledAttributes.getBoolean(0, false);
        this.f18217h = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness);
        this.f18218i = ((dimensionPixelSize + 2) - 1) / 2;
        this.f18219j = new Paint();
        this.f18219j.setColor(resources.getColor(C7582R.color.play_translucent_separator_line));
        this.f18219j.setStrokeWidth((float) dimensionPixelSize);
        this.f18220k = resources.getDimensionPixelSize(C7582R.dimen.details_new_content_margin);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18210a = (LinearLayout) findViewById(C7582R.id.ratings_summary_box);
        this.f18211b = (HistogramTable) findViewById(C7582R.id.histogram);
        this.f18212c = (TextView) findViewById(C7582R.id.average_value);
        this.f18213d = (StarRatingBar) this.f18210a.findViewById(C7582R.id.summary_rating_bar);
        this.f18214e = (TextView) this.f18210a.findViewById(C7582R.id.num_reviews);
    }

    public View getSummaryBox() {
        return this.f18210a;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18216g) {
            int size = MeasureSpec.getSize(i);
            int measuredHeight = this.f18212c.getMeasuredHeight() + this.f18210a.getMeasuredHeight();
            int measuredHeight2 = this.f18211b.getMeasuredHeight();
            if (measuredHeight > measuredHeight2) {
                measuredHeight += this.f18211b.getMeasuredHeight() - this.f18211b.getBaseline();
            } else {
                measuredHeight = (this.f18214e.getMeasuredHeight() - this.f18214e.getBaseline()) + measuredHeight2;
            }
            setMeasuredDimension(size, (measuredHeight + getPaddingBottom()) + getPaddingTop());
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18217h) {
            int height = getHeight() - this.f18218i;
            canvas.drawLine((float) this.f18220k, (float) height, (float) (getWidth() - this.f18220k), (float) height, this.f18219j);
        }
    }

    public final void m17307a(long j, float f, int[] iArr) {
        setVisibility(0);
        Resources resources = getResources();
        this.f18214e.setText(this.f18215f.format(j));
        this.f18214e.setContentDescription(resources.getQuantityString(C7582R.plurals.content_description_review_histogram_review_count, (int) j, new Object[]{Long.valueOf(j)}));
        this.f18212c.setText(aa.m9202b(f));
        this.f18212c.setContentDescription(resources.getString(C7582R.string.content_description_review_histogram_rating, new Object[]{r1}));
        this.f18213d.setRating(f);
        this.f18213d.setShowEmptyStars(true);
        this.f18211b.setHistogram(iArr);
    }
}
