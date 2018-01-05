package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ArticlePanelView extends BackgroundPanelView {
    public ArticlePanelView(Context context) {
        super(context);
    }

    public ArticlePanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ArticlePanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            super.onMeasure(i, i2);
            return;
        }
        C6116b.m28104a(MeasureSpec.getMode(i) != 0, "Can't deal with UNSPECIFIED width spec");
        int size = (MeasureSpec.getSize(i) * 5) / 4;
        ViewParent parent = getParent();
        if (parent instanceof RecyclerView) {
            int measuredHeight;
            RecyclerView recyclerView = (RecyclerView) parent;
            i3 = recyclerView.getHeight();
            if (i3 == 0) {
                measuredHeight = recyclerView.getMeasuredHeight();
            } else {
                measuredHeight = i3;
            }
            i3 = measuredHeight - getResources().getDimensionPixelOffset(ab.pe__article_panel_height_reduction);
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(Math.max(i3, size), MemoryMappedFileBuffer.DEFAULT_SIZE));
    }
}
