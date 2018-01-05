package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements cq {
    public cr f2941a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(cr crVar) {
        this.f2941a = crVar;
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (this.f2941a != null) {
            this.f2941a.mo550a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
