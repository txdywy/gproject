package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.view.ai;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.squareup.leakcanary.C7582R;

public final class C3144j extends ev {
    public final int f16269a;
    public final Paint f16270b = new Paint();

    public C3144j(Context context) {
        Resources resources = context.getResources();
        this.f16269a = resources.getDimensionPixelSize(C7582R.dimen.details_new_content_margin);
        this.f16270b.setColor(-16777216);
        this.f16270b.setStrokeWidth((float) resources.getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness));
    }

    public final void mo789b(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        int childCount = recyclerView.getChildCount();
        int i = 0;
        float f = 1.0f;
        boolean z = false;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (!z) {
                z = childAt instanceof C2622l ? false : childAt instanceof C2639n ? ((C2639n) childAt).mo3071a() : true;
                if (z) {
                    int top = childAt.getTop() + Math.round(ai.m1850g(childAt));
                    this.f16270b.setAlpha(Math.round(Math.min(f, ai.m1836b(childAt)) * 38.0f));
                    canvas.drawLine((float) (childAt.getLeft() + this.f16269a), (float) top, (float) (childAt.getRight() - this.f16269a), (float) top, this.f16270b);
                }
            }
            if (!(childAt instanceof C2626m)) {
                z = childAt instanceof C2621k;
            } else if (((C2626m) childAt).mo2986a()) {
                z = false;
            } else {
                z = true;
            }
            i++;
            f = ai.m1836b(childAt);
        }
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        rect.set(0, 0, 0, 0);
    }
}
