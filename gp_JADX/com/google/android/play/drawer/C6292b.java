package com.google.android.play.drawer;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.p025c.p026a.C0439b;
import com.google.android.play.utils.b;
import com.squareup.haha.perflib.HprofParser;

public final class C6292b extends C0439b {
    public static final boolean f31462n = (VERSION.SDK_INT >= 11);
    public ValueAnimator f31463o;

    public C6292b(Context context) {
        super(context);
    }

    @TargetApi(11)
    public final void m28911a(int i, int i2) {
        float f = 0.0f;
        if (f31462n) {
            switch (i2) {
                case 0:
                    if (i != 0) {
                        f = 1.0f;
                    }
                    m28912b(f);
                    return;
                case 1:
                    if (i != 0) {
                        f = 1.0f;
                    }
                    m28912b(f);
                    ObjectAnimator duration = ObjectAnimator.ofInt(this, "alpha", new int[]{0, HprofParser.ROOT_UNKNOWN}).setDuration(400);
                    duration.setInterpolator(b.a);
                    duration.start();
                    return;
                case 2:
                    long j;
                    if (this.f31463o != null) {
                        this.f31463o.cancel();
                    }
                    float f2 = this.f2524k;
                    float[] fArr = new float[2];
                    fArr[0] = f2;
                    if (i != 0) {
                        f = 1.0f;
                    }
                    fArr[1] = f;
                    this.f31463o = ValueAnimator.ofFloat(fArr);
                    ValueAnimator valueAnimator = this.f31463o;
                    if (i == 0) {
                        j = (long) (f2 * 350.0f);
                    } else {
                        j = (long) ((1.0f - f2) * 350.0f);
                    }
                    valueAnimator.setDuration(j);
                    this.f31463o.setInterpolator(b.a);
                    this.f31463o.addUpdateListener(new C6293c(this));
                    this.f31463o.start();
                    return;
                default:
                    return;
            }
        }
        if (i != 0) {
            f = 1.0f;
        }
        m28912b(f);
    }

    public final void m28912b(float f) {
        if (f == 1.0f) {
            m2655a(true);
        } else if (f == 0.0f) {
            m2655a(false);
        }
        m2654a(f);
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        invalidateSelf();
    }
}
