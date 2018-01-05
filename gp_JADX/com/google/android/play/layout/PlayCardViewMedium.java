package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;

public class PlayCardViewMedium extends C6388d {
    public PlayCardViewMedium(Context context) {
        this(context, null);
    }

    public PlayCardViewMedium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        m29307a(i2);
        super.onMeasure(i, i2);
    }

    public int getCardType() {
        return 2;
    }
}
