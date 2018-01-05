package com.google.android.play.animation;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

@TargetApi(21)
public final class C6242e {
    public static Interpolator f31248a;
    public static Interpolator f31249b;

    public static Interpolator m28755a(Context context) {
        if (f31248a == null) {
            f31248a = AnimationUtils.loadInterpolator(context.getApplicationContext(), 17563661);
        }
        return f31248a;
    }
}
