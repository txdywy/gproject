package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.setupwizardlib.f;

public class StatusBarBackgroundLayout extends FrameLayout
{

    public Drawable a;
    public Object b;

    StatusBarBackgroundLayout(Context p0) {
        FrameLayout(p0);
        this.a(p0, 0, 0);
    }

    StatusBarBackgroundLayout(Context p0, AttributeSet p1) {
        FrameLayout(p0, p1);
        this.a(p0, p1, 0);
    }

    StatusBarBackgroundLayout(Context p0, AttributeSet p1, int p2) {
        FrameLayout(p0, p1, p2);
        this.a(p0, p1, p2);
    }

    private final void a(Context p0, AttributeSet p1, int p2) {
        v0 = p0.obtainStyledAttributes(p1, com.android.setupwizardlib.f.SuwStatusBarBackgroundLayout, p2, 0);
        this.setStatusBarBackground(v0.getDrawable(com.android.setupwizardlib.f.SuwStatusBarBackgroundLayout_suwStatusBarBackground));
        v0.recycle();
    }

    public Drawable getStatusBarBackground() {
        return this.a;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets p0) {
        this.b = p0;
        return super.onApplyWindowInsets(p0);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build$VERSION.SDK_INT >= 21 && this.b == 0)
            this.requestApplyInsets();
    }

    protected void onDraw(Canvas p0) {
        super.onDraw(p0);
        if (Build$VERSION.SDK_INT >= 21 && this.b != 0) {
            v0 = ((WindowInsets)this.b).getSystemWindowInsetTop();
            if (v0 > 0) {
                this.a.setBounds(0, 0, this.getWidth(), v0);
                this.a.draw(p0);
            }
        }
    }

    public void setStatusBarBackground(Drawable p0) {
        v1 = 1;
        this.a = p0;
        if (Build$VERSION.SDK_INT >= 21) {
            if (p0 == 0)
                v0 = 1;
            else
                v0 = 0;
            this.setWillNotDraw(v0);
            if (p0 == 0)
                v1 = 0;
            this.setFitsSystemWindows(v1);
            this.invalidate();
        }
    }

}
