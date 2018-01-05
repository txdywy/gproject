package android.support.v4.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class C0374e extends ImageView {
    public AnimationListener f2143a;
    public int f2144b;

    C0374e(Context context) {
        Drawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f2144b = (int) (3.5f * f);
        if (C0374e.m2267a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ai.m1851g(this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C0375f(this, this.f2144b));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f2144b, (float) i2, (float) i, 503316480);
            int i3 = this.f2144b;
            setPadding(i3, i3, i3, i3);
        }
        shapeDrawable.getPaint().setColor(-328966);
        ai.m1826a((View) this, shapeDrawable);
    }

    private static boolean m2267a() {
        return VERSION.SDK_INT >= 21;
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!C0374e.m2267a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f2144b * 2), getMeasuredHeight() + (this.f2144b * 2));
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f2143a != null) {
            this.f2143a.onAnimationStart(getAnimation());
        }
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f2143a != null) {
            this.f2143a.onAnimationEnd(getAnimation());
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
