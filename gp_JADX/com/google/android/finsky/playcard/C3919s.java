package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.C0629a;
import com.google.android.play.p203b.C3918i;
import com.squareup.leakcanary.C7582R;

public final class C3919s implements C3918i {
    public static final C3919s f19853a = new C3919s();

    public final void mo3865a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayCardViewGroup, i, 0);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        Resources resources = context.getResources();
        int round = Math.round(resources.getDisplayMetrics().density);
        dimension += (float) round;
        dimensionPixelSize -= round;
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(round, resources.getColor(C7582R.color.flat_card_stroke_color));
        gradientDrawable.setColor(0);
        view.setBackgroundDrawable(new C3920t(gradientDrawable, dimensionPixelSize));
        if (VERSION.SDK_INT >= 21) {
            view.setClipToOutline(obtainStyledAttributes.getBoolean(8, true));
        }
        obtainStyledAttributes.recycle();
    }

    public final void mo3864a(View view, int i) {
    }

    public final void mo3866b(View view, int i) {
    }
}
