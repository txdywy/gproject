package com.google.android.finsky.layout;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailspage.TextModule.DetailsIconDescription;
import com.google.android.finsky.detailspage.gm;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class DetailsTextIconContainer extends ViewGroup implements gm {
    public final int f18129a;

    public DetailsTextIconContainer(Context context) {
        this(context, null);
    }

    public DetailsTextIconContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18129a = context.getResources().getDimensionPixelSize(C7582R.dimen.details_text_section_icon_gap);
    }

    public final void mo3556a(List list) {
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        LayoutInflater from = LayoutInflater.from(getContext());
        for (int max = Math.max(0, list.size() - getChildCount()); max > 0; max--) {
            addView((FifeImageView) from.inflate(C7582R.layout.details_text_icon_single, this, false));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            FifeImageView fifeImageView = (FifeImageView) getChildAt(i);
            if (i < list.size()) {
                fifeImageView.setVisibility(0);
                DetailsIconDescription detailsIconDescription = (DetailsIconDescription) list.get(i);
                bd bdVar = detailsIconDescription.f14121a;
                C1473m.f7980a.ar().m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
                fifeImageView.setContentDescription(detailsIconDescription.f14122b);
            } else {
                fifeImageView.setVisibility(8);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int size = (((int) (((float) MeasureSpec.getSize(i)) * 0.75f)) - l) - m;
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams.width <= size) {
                childAt.setVisibility(0);
                childAt.measure(MeasureSpec.makeMeasureSpec(layoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(layoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
                size -= layoutParams.width + this.f18129a;
                i4 += layoutParams.width + this.f18129a;
                i3 = Math.max(i3, layoutParams.height);
            } else {
                childAt.setVisibility(8);
            }
        }
        setMeasuredDimension((i4 + l) + m, (i3 + getPaddingTop()) + getPaddingBottom());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int height = getHeight();
        int childCount = getChildCount();
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int i6 = 0;
        int i7 = 0;
        for (i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                i7++;
                i6 += childAt.getMeasuredWidth();
            }
        }
        if (i7 > 1) {
            i6 += (i7 - 1) * this.f18129a;
        }
        i7 = l + ((((width - i6) - l) - m) / 2);
        i5 = getPaddingTop();
        height = (height - i5) - getPaddingBottom();
        i6 = i7;
        for (i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() == 0) {
                m = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                int i8 = ((height - measuredHeight) / 2) + i5;
                int a = k.a(width, m, z2, i6);
                childAt2.layout(a, i8, a + m, measuredHeight + i8);
                i6 += this.f18129a + m;
            }
        }
    }
}
