package com.google.android.finsky.bg;

public final class com.google.android.finsky.bg.w implements TimeInterpolator
{

    public final float a;

    w(float p0) {
        this.a = p0;
    }

    public final float getInterpolation(float p0) {
        return (1065353216 - p0) * this.a * (float)Math.sin((double)(1073741824 * p0 * 1078530011 * 1077936128));
    }

}
