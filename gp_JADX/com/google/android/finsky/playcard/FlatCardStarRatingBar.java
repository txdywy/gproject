package com.google.android.finsky.playcard;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import com.google.android.play.layout.StarRatingBar;
import com.squareup.leakcanary.C7582R;

public class FlatCardStarRatingBar extends StarRatingBar {
    public int f19367a;
    public int f19368b;

    public FlatCardStarRatingBar(Context context) {
        this(context, null);
    }

    public FlatCardStarRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUseDarkTheme(false);
    }

    protected int getStarColor() {
        return this.f19367a;
    }

    protected int getTextColor() {
        return this.f19368b;
    }

    public void setUseDarkTheme(boolean z) {
        int i = C7582R.color.flat_card_subtitle_text_color;
        this.f19367a = C0216d.m1116c(getContext(), z ? C7582R.color.flat_card_star_icon_color_dark_theme : C7582R.color.flat_card_subtitle_text_color);
        Context context = getContext();
        if (z) {
            i = C7582R.color.flat_card_subtitle_text_color_dark_theme;
        }
        this.f19368b = C0216d.m1116c(context, i);
    }
}
