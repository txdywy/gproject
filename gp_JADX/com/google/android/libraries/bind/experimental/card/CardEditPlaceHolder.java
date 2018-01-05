package com.google.android.libraries.bind.experimental.card;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.bind.widget.BindingFrameLayout;

public class CardEditPlaceHolder extends BindingFrameLayout {
    public CardEditPlaceHolder(Context context) {
        this(context, null, 0);
    }

    public CardEditPlaceHolder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardEditPlaceHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
