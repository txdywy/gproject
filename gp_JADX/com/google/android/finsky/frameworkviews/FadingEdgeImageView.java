package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import com.google.android.play.image.FifeImageView;

public class FadingEdgeImageView extends FifeImageView {
    public boolean f16188a;
    public boolean f16189b;
    public int f16190c;

    public FadingEdgeImageView(Context context) {
        super(context);
    }

    public FadingEdgeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void m16022a(boolean z, boolean z2, int i, int i2) {
        this.f16188a = z;
        this.f16189b = z2;
        if (this.f16188a || this.f16189b) {
            setHorizontalFadingEdgeEnabled(true);
            setFadingEdgeLength(i);
            this.f16190c = i2;
            invalidate();
        }
    }

    public final void m16023b() {
        setHorizontalFadingEdgeEnabled(false);
        setFadingEdgeLength(0);
        this.f16188a = false;
        this.f16189b = false;
        invalidate();
    }

    protected float getLeftFadingEdgeStrength() {
        return this.f16188a ? 1.0f : 0.0f;
    }

    protected float getRightFadingEdgeStrength() {
        return this.f16189b ? 1.0f : 0.0f;
    }

    @ExportedProperty(category = "drawing")
    public int getSolidColor() {
        if (this.f16188a || this.f16189b) {
            return this.f16190c;
        }
        return super.getSolidColor();
    }

    public boolean hasOverlappingRendering() {
        return true;
    }

    protected boolean onSetAlpha(int i) {
        return false;
    }
}
