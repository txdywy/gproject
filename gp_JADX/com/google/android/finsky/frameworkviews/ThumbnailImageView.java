package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class ThumbnailImageView extends FifeImageView {
    public C1294w A_;
    public bd f16228b;
    public float f16229c;

    public ThumbnailImageView(Context context) {
        this(context, null);
    }

    public ThumbnailImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16229c = Float.NaN;
    }

    protected void onFinishInflate() {
        ((C1387u) C3947d.m18649a(C1387u.class)).mo1845a(this);
        super.onFinishInflate();
    }

    public float getAspectRatio() {
        return this.f16229c;
    }

    public final void m16033a() {
        super.a();
        this.f16228b = null;
        this.f16229c = Float.NaN;
        setBackgroundColor(0);
    }

    protected final synchronized void m16034a(boolean z, Bitmap bitmap) {
        super.a(z, bitmap);
        if (z) {
            setBackgroundColor(0);
        } else {
            setBackgroundColor(C0216d.m1116c(getContext(), C7582R.color.placeholder_grey));
        }
    }
}
