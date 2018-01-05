package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.setupwizardlib.C0612f;

public class StatusBarBackgroundLayout extends FrameLayout {
    public Drawable f3985a;
    public Object f3986b;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
        m4266a(context, null, 0);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4266a(context, attributeSet, 0);
    }

    @TargetApi(11)
    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4266a(context, attributeSet, i);
    }

    private final void m4266a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0612f.SuwStatusBarBackgroundLayout, i, 0);
        setStatusBarBackground(obtainStyledAttributes.getDrawable(C0612f.SuwStatusBarBackgroundLayout_suwStatusBarBackground));
        obtainStyledAttributes.recycle();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (VERSION.SDK_INT >= 21 && this.f3986b == null) {
            requestApplyInsets();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT >= 21 && this.f3986b != null) {
            int systemWindowInsetTop = ((WindowInsets) this.f3986b).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f3985a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f3985a.draw(canvas);
            }
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z = true;
        this.f3985a = drawable;
        if (VERSION.SDK_INT >= 21) {
            boolean z2;
            if (drawable == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            setWillNotDraw(z2);
            if (drawable == null) {
                z = false;
            }
            setFitsSystemWindows(z);
            invalidate();
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f3985a;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f3986b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }
}
