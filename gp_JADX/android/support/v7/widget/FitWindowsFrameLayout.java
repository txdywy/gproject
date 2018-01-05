package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout implements cq {
    public cr f2940a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(cr crVar) {
        this.f2940a = crVar;
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (this.f2940a != null) {
            this.f2940a.mo550a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
