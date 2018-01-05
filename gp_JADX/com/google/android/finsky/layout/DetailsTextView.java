package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.layout.PlayTextView;

public class DetailsTextView extends PlayTextView {
    public DetailsTextView(Context context) {
        this(context, null);
    }

    public DetailsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, 0);
    }
}
