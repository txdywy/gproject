package com.google.android.finsky.frameworkviews;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.ew;
import android.support.v7.widget.fo;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.play.p203b.C6275o;
import com.squareup.leakcanary.C7582R;

public final class C3145o extends ev {
    public final float[] f16271a = new float[2];
    public final Transformation f16272b = new Transformation();
    public final Drawable f16273c;
    public final Drawable f16274d;
    public final Drawable f16275e;
    public final Drawable f16276f;
    public final Paint f16277g = new Paint();

    public C3145o(Resources resources) {
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_card_default_radius);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.play_card_default_elevation);
        ColorStateList colorStateList = resources.getColorStateList(C7582R.color.white);
        this.f16273c = new af(resources, colorStateList, (float) dimensionPixelSize, 0.0f, (float) dimensionPixelSize2, false, true);
        this.f16274d = new af(resources, colorStateList, 0.0f, 0.0f, (float) dimensionPixelSize2, true, true);
        this.f16275e = new C6275o(resources, colorStateList, (float) dimensionPixelSize, (float) dimensionPixelSize2, 0.0f);
        this.f16276f = new af(resources, colorStateList, 0.0f, (float) dimensionPixelSize, (float) dimensionPixelSize2, true, false);
        this.f16277g.setColor(resources.getColor(C7582R.color.flat_card_stroke_color));
    }

    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        ew layoutManager = recyclerView.getLayoutManager();
        int p = layoutManager.m3060p();
        for (int i = 0; i < p; i++) {
            View f = layoutManager.m3051f(i);
            if (f instanceof C3075q) {
                View view;
                View view2;
                Drawable drawable;
                C3075q c3075q = (C3075q) f;
                boolean ap_ = c3075q.ap_();
                int dividerSize = ap_ ? 0 : c3075q.getDividerSize();
                View f2 = layoutManager.m3051f(i - 1);
                if (ap_) {
                    view = null;
                } else {
                    view = f2;
                }
                View f3 = layoutManager.m3051f(i + 1);
                if ((f3 instanceof C3074r) && ((C3074r) f3).ap_()) {
                    view2 = null;
                } else {
                    view2 = f3;
                }
                Object obj = (view == null || !(view instanceof C3075q)) ? null : 1;
                Object obj2 = (view2 == null || !(view2 instanceof C3075q)) ? null : 1;
                if (obj != null && obj2 != null) {
                    drawable = this.f16274d;
                } else if (obj == null && obj2 != null) {
                    drawable = this.f16273c;
                } else if (obj == null || obj2 != null) {
                    drawable = this.f16275e;
                } else {
                    drawable = this.f16276f;
                }
                int i2 = 0;
                int i3 = 0;
                if (f instanceof C3146p) {
                    C3146p c3146p = (C3146p) f;
                    i2 = c3146p.mo4092a(c3146p.ap_());
                    i3 = c3146p.getBottomPadding();
                }
                int left = f.getLeft();
                int right = f.getRight();
                drawable.setBounds(left, Math.round((((float) f.getTop()) + f.getTranslationY()) - ((float) i2)), right, Math.round(((float) i3) + (((float) f.getBottom()) + f.getTranslationY())));
                drawable.draw(canvas);
                if (dividerSize > 0) {
                    float top = (float) f.getTop();
                    Animation animation = f.getAnimation();
                    if (animation != null) {
                        this.f16272b.clear();
                        animation.getTransformation(f.getDrawingTime(), this.f16272b);
                        this.f16271a[0] = 0.0f;
                        this.f16271a[1] = 0.0f;
                        this.f16272b.getMatrix().mapPoints(this.f16271a);
                        top += this.f16271a[1];
                    }
                    i3 = Math.round(top + f.getTranslationY());
                    canvas.drawRect((float) left, (float) (i3 - dividerSize), (float) right, (float) i3, this.f16277g);
                }
            }
        }
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        rect.set(0, 0, 0, 0);
        if (view instanceof C3075q) {
            C3075q c3075q = (C3075q) view;
            rect.top = c3075q.getDividerSize();
            if (c3075q.aq_()) {
                rect.bottom = c3075q.getSectionBottomSpacerSize();
            }
        }
        if (view instanceof C3146p) {
            C3146p c3146p = (C3146p) view;
            rect.top += c3146p.mo4092a(c3146p.ap_());
            rect.bottom += c3146p.getBottomPadding();
        }
    }
}
