package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.support.v4.view.bt;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0403j;
import android.support.v7.view.C0453a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

class C0490a extends ViewGroup {
    public final C0492b f2866a;
    public final Context f2867b;
    public ActionMenuView f2868c;
    public C0502k f2869d;
    public int f2870e;
    public bt f2871f;
    public boolean f2872g;
    public boolean f2873h;

    C0490a(Context context) {
        this(context, null);
    }

    C0490a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0490a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2866a = new C0492b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0394a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2867b = context;
        } else {
            this.f2867b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0403j.ActionBar, C0394a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0403j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f2869d != null) {
            C0502k c0502k = this.f2869d;
            if (!c0502k.f3634q) {
                c0502k.f3633p = C0453a.m2684a(c0502k.b).m2685a();
            }
            if (c0502k.c != null) {
                c0502k.c.m2830b(true);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2872g = false;
        }
        if (!this.f2872g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2872g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2872g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2873h = false;
        }
        if (!this.f2873h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2873h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2873h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f2870e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.f2870e;
    }

    public int getAnimatedVisibility() {
        if (this.f2871f != null) {
            return this.f2866a.f3179b;
        }
        return getVisibility();
    }

    public bt mo696a(int i, long j) {
        if (this.f2871f != null) {
            this.f2871f.m1998a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            bt a = ai.m1852h(this).m1993a(1.0f);
            a.m1994a(j);
            a.m1995a(this.f2866a.m3226a(a, i));
            return a;
        }
        a = ai.m1852h(this).m1993a(0.0f);
        a.m1994a(j);
        a.m1995a(this.f2866a.m3226a(a, i));
        return a;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f2871f != null) {
                this.f2871f.m1998a();
            }
            super.setVisibility(i);
        }
    }

    public boolean mo697a() {
        if (this.f2869d != null) {
            return this.f2869d.m3884c();
        }
        return false;
    }

    protected static int m2931a(View view, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) + 0);
    }

    protected static int m2930a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected static int m2932a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
