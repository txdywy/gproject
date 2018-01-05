package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.squareup.leakcanary.C7582R;

public final class ao extends ev {
    public final int f14254a;
    public final Paint f14255b = new Paint();

    public ao(Context context) {
        Resources resources = context.getResources();
        this.f14254a = resources.getDimensionPixelSize(C7582R.dimen.details_cluster_background_peeking);
        this.f14255b.setStyle(Style.FILL);
        this.f14255b.setColor(resources.getColor(C7582R.color.play_main_background));
    }

    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        int childCount = recyclerView.getChildCount();
        int i = 0;
        Object obj = null;
        while (i < childCount) {
            Object obj2;
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof ap) {
                int top = childAt.getTop();
                if (obj == null) {
                    top -= this.f14254a;
                }
                canvas.drawRect(0.0f, (float) top, (float) recyclerView.getWidth(), (float) childAt.getBottom(), this.f14255b);
                obj2 = 1;
            } else {
                obj2 = null;
            }
            i++;
            obj = obj2;
        }
    }
}
