package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.play.b.i;
import com.google.android.play.b.j;

public class CardLinearLayout extends LinearLayout {
    public CardLinearLayout(Context context) {
        this(context, null);
    }

    public CardLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().a(this, context, attributeSet, 0);
    }

    public CardLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    public i getCardViewGroupDelegate() {
        return j.a;
    }
}
