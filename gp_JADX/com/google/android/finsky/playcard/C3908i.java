package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.squareup.leakcanary.C7582R;

public final class C3908i extends ev {
    public final Paint f19739a = new Paint();

    public C3908i(Context context) {
        Resources resources = context.getResources();
        this.f19739a.setColor(resources.getColor(C7582R.color.play_cards_separator_color));
        this.f19739a.setStrokeWidth((float) resources.getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness));
    }

    public final void mo789b(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            View childAt2 = recyclerView.getChildAt(i + 1);
            if (C3908i.m18567a(childAt) && C3908i.m18567a(childAt2)) {
                int separatorMarginLeft;
                int separatorMarginRight;
                if (childAt instanceof C3897j) {
                    C3897j c3897j = (C3897j) childAt;
                    separatorMarginLeft = c3897j.getSeparatorMarginLeft();
                    separatorMarginRight = c3897j.getSeparatorMarginRight();
                } else {
                    separatorMarginRight = 0;
                    separatorMarginLeft = 0;
                }
                int round = Math.round(childAt.getTranslationY()) + childAt.getBottom();
                canvas.drawLine((float) (separatorMarginLeft + childAt.getLeft()), (float) round, (float) (childAt.getRight() - separatorMarginRight), (float) round, this.f19739a);
            }
        }
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        rect.set(0, 0, 0, 0);
    }

    private static boolean m18567a(View view) {
        if (view instanceof C3077k) {
            return true;
        }
        if ((view instanceof BucketRowLayout) && (((BucketRowLayout) view).getChildAt(0) instanceof C3077k)) {
            return true;
        }
        return false;
    }
}
