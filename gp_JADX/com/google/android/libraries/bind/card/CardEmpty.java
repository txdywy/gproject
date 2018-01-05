package com.google.android.libraries.bind.card;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.bind.widget.BindingFrameLayout;

@Deprecated
public class CardEmpty extends BindingFrameLayout {
    public CardEmpty(Context context) {
        this(context, null, 0);
    }

    public CardEmpty(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardEmpty(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
