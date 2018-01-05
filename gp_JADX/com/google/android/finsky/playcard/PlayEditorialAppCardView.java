package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.navigationmanager.C3759c;
import com.google.android.play.layout.d;

public class PlayEditorialAppCardView extends d implements C3759c, ad {
    public static final int[] f19534a = new int[]{2, 4, 0};

    public PlayEditorialAppCardView(Context context) {
        this(context, null);
    }

    public PlayEditorialAppCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getCardType() {
        return 5;
    }

    public int[] getImageTypePreference() {
        return f19534a;
    }

    protected void onMeasure(int i, int i2) {
        this.am = 0.48828125f;
        c(i);
        super.onMeasure(i, i2);
    }
}
