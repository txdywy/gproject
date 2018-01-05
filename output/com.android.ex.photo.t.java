package com.android.ex.photo;

import android.view.View;

public final class com.android.ex.photo.t implements android.support.v4.view.bj
{

    t() {
    }

    public final void a(View p0, float p1) {
        if (p1 < 0 || p1 >= 1065353216) {
            p0.setTranslationX(0);
            p0.setAlpha(1065353216);
            p0.setScaleX(1065353216);
            p0.setScaleY(1065353216);
        }
        else {
            p0.setTranslationX(-p1 * (float)p0.getWidth());
            p0.setAlpha(Math.max(0, 1065353216 - p1));
            v0 = Math.max(0, 1065353216 - 1050253722 * p1);
            p0.setScaleX(v0);
            p0.setScaleY(v0);
        }
    }

}
