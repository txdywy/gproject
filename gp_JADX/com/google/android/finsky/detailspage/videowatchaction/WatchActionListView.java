package com.google.android.finsky.detailspage.videowatchaction;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListView;

public class WatchActionListView extends ExpandableListView {
    public float f14765a;

    public WatchActionListView(Context context) {
        super(context);
    }

    public WatchActionListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WatchActionListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        if (isGroupExpanded(0)) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f14765a = 0.0f;
                break;
            case 2:
                if (this.f14765a != 0.0f) {
                    motionEvent.setLocation(motionEvent.getX(), this.f14765a);
                    break;
                }
                this.f14765a = motionEvent.getY();
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
