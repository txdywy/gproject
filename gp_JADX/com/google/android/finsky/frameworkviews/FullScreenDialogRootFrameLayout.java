package com.google.android.finsky.frameworkviews;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.C0352i;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.finsky.bg.C1614n;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4682m;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FullScreenDialogRootFrameLayout extends FrameLayout implements OnGestureListener {
    public C1038v f16196a;
    public C0352i f16197b;

    public FullScreenDialogRootFrameLayout(Context context) {
        super(context);
    }

    public FullScreenDialogRootFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullScreenDialogRootFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FullScreenDialogRootFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setListener(C1038v c1038v) {
        this.f16196a = c1038v;
    }

    public void setEnableCustomizedTapOutsideHandling(boolean z) {
        if (!z) {
            this.f16197b = null;
        } else if (this.f16197b == null) {
            this.f16197b = C1614n.m9290a(getContext(), this);
            this.f16197b.f1896a.mo446a();
        }
    }

    protected void onFinishInflate() {
        ((C1387u) C3947d.m18649a(C1387u.class)).mo2001d();
        super.onFinishInflate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16197b != null) {
            return this.f16197b.m2036a(motionEvent);
        }
        return m16025a() || super.onTouchEvent(motionEvent);
    }

    private final boolean m16025a() {
        if (this.f16196a != null) {
            this.f16196a.mo1247K();
        }
        Activity a = C4682m.m21821a(getContext(), Activity.class);
        if (a == null) {
            return false;
        }
        a.finish();
        a.overridePendingTransition(17432576, 17432577);
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.fullscreen_dialog_root_initial_width);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                Object obj = null;
                int i4 = 0;
                int i5 = dimensionPixelSize;
                while (i4 < 3) {
                    measureChild(childAt, MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    if (((childAt.getMeasuredWidthAndState() & 16777216) == 16777216 ? 1 : null) == null) {
                        obj = 1;
                        break;
                    } else {
                        i5 = (i5 + size) / 2;
                        i4++;
                    }
                }
                if (obj == null) {
                    measureChild(childAt, MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                measureChild(childAt, MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
            }
        }
        setMeasuredDimension((16777215 & size) | 16777216, (16777215 & size2) | 16777216);
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return m16025a();
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }
}
