package android.support.v7.widget;

import android.content.res.Configuration;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

public final class fz extends HorizontalScrollView implements OnItemSelectedListener {
    public dh f3498a;
    public Spinner f3499b;

    public final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    public final void setAllowCollapse(boolean z) {
    }

    public final void setTabSelected(int i) {
        int childCount = this.f3498a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            boolean z;
            View childAt = this.f3498a.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                throw new NoSuchMethodError();
            }
        }
        if (this.f3499b != null && i >= 0) {
            this.f3499b.setSelection(i);
        }
    }

    public final void setContentHeight(int i) {
        requestLayout();
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        throw new NoSuchMethodError();
    }

    public final void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    public final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        throw new NoSuchMethodError();
    }

    public final void onNothingSelected(AdapterView adapterView) {
        throw new NoSuchMethodError();
    }

    static {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    }
}
