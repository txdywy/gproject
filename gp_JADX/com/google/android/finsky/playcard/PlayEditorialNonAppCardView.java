package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.play.layout.d;

public class PlayEditorialNonAppCardView extends d implements ad {
    public static final int[] f19535a = new int[]{4, 0, 2};

    public PlayEditorialNonAppCardView(Context context) {
        this(context, null);
    }

    public PlayEditorialNonAppCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getCardType() {
        return 6;
    }

    public int[] getImageTypePreference() {
        return f19535a;
    }

    protected void onMeasure(int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        marginLayoutParams.width = (int) (((float) marginLayoutParams.height) / this.am);
        super.onMeasure(i, i2);
    }

    public void setThumbnailAspectRatio(float f) {
        this.am = f;
    }
}
