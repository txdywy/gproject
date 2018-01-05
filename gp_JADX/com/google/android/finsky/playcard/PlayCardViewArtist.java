package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.play.layout.d;

public class PlayCardViewArtist extends d {
    public PlayCardViewArtist(Context context) {
        this(context, null);
    }

    public PlayCardViewArtist(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getCardType() {
        return 7;
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        this.U.getLayoutParams().height = (int) (((float) ((((size - paddingLeft) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin)) * this.am);
        super.onMeasure(i, i2);
    }
}
