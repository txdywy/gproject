package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.frameworkviews.HistogramBar;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HistogramTable extends TableLayout {
    public final boolean f18205a;
    public final int f18206b;
    public final int f18207c;
    public final int f18208d;
    public final List f18209e;

    public HistogramTable(Context context) {
        this(context, null);
    }

    public HistogramTable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18209e = new ArrayList(5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.HistogramTable);
        this.f18205a = obtainStyledAttributes.getBoolean(0, false);
        this.f18206b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f18207c = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.f18208d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        obtainStyledAttributes.recycle();
    }

    public void setHistogram(int[] iArr) {
        removeAllViews();
        this.f18209e.clear();
        double d = 0.0d;
        int i = 0;
        while (i < 5) {
            double d2;
            if (((double) iArr[i]) > d) {
                d2 = (double) iArr[i];
            } else {
                d2 = d;
            }
            i++;
            d = d2;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        Resources resources = getResources();
        for (int i2 = 0; i2 < 5; i2++) {
            TableRow tableRow = (TableRow) from.inflate(C7582R.layout.histogram_row, this, false);
            StarLabel starLabel = (StarLabel) tableRow.findViewById(C7582R.id.star_label);
            TextView textView = (TextView) tableRow.findViewById(C7582R.id.count_label);
            starLabel.setMaxStars(5);
            starLabel.setStarHeight(this.f18206b);
            if (this.f18205a) {
                starLabel.setNumStars(5 - i2);
                textView.setText(integerInstance.format((long) iArr[i2]));
                tableRow.setBaselineAlignedChildIndex(2);
            } else {
                starLabel.setVisibility(8);
                textView.setVisibility(8);
                tableRow.setBaselineAlignedChildIndex(1);
            }
            HistogramBar histogramBar = (HistogramBar) tableRow.findViewById(C7582R.id.histogram_bar);
            histogramBar.setMaxBarWidth((double) this.f18207c);
            histogramBar.setBarHeight(this.f18206b);
            histogramBar.setWidthPercentage(((double) iArr[i2]) / d);
            LayoutParams layoutParams = new TableLayout.LayoutParams(-2, -2);
            if (i2 != 0) {
                layoutParams.setMargins(0, this.f18208d, 0, 0);
            }
            switch (i2) {
                case 0:
                    i = C7582R.color.review_histogram_5_bar;
                    break;
                case 1:
                    i = C7582R.color.review_histogram_4_bar;
                    break;
                case 2:
                    i = C7582R.color.review_histogram_3_bar;
                    break;
                case 3:
                    i = C7582R.color.review_histogram_2_bar;
                    break;
                case 4:
                    i = C7582R.color.review_histogram_1_bar;
                    break;
                default:
                    i = C7582R.color.review_histogram_1_bar;
                    break;
            }
            histogramBar.setColor(i);
            this.f18209e.add(histogramBar);
            tableRow.setContentDescription(resources.getQuantityString(C7582R.plurals.content_description_review_histogram_row, iArr[i2], new Object[]{Integer.valueOf(iArr[i2]), Integer.valueOf(5 - i2)}));
            addView(tableRow, layoutParams);
        }
    }

    public int getBaseline() {
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        if (childCount == 0) {
            return measuredHeight;
        }
        View childAt = getChildAt(childCount - 1);
        return (measuredHeight - childAt.getMeasuredHeight()) + childAt.getBaseline();
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        super.onMeasure(i, i2);
        if (this.f18205a && !this.f18209e.isEmpty()) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < getChildCount()) {
                int measuredWidth;
                View childAt = getChildAt(i4);
                if (childAt instanceof TableRow) {
                    TableRow tableRow = (TableRow) childAt;
                    int i6 = 0;
                    for (int i7 = 0; i7 < tableRow.getChildCount(); i7++) {
                        View childAt2 = tableRow.getChildAt(i7);
                        TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) childAt2.getLayoutParams();
                        i6 += layoutParams.rightMargin + (childAt2.getMeasuredWidth() + layoutParams.leftMargin);
                    }
                    if (i6 - tableRow.getMeasuredWidth() > i5) {
                        measuredWidth = i6 - tableRow.getMeasuredWidth();
                        i4++;
                        i5 = measuredWidth;
                    }
                }
                measuredWidth = i5;
                i4++;
                i5 = measuredWidth;
            }
            if (i5 > 0) {
                while (i3 < this.f18209e.size()) {
                    ((HistogramBar) this.f18209e.get(i3)).setMaxBarWidth((double) (this.f18207c - i5));
                    i3++;
                }
                this.f18209e.clear();
            }
        }
    }
}
