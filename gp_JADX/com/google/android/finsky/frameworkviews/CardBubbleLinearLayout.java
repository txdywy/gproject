package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6267e;

public class CardBubbleLinearLayout extends ForegroundLinearLayout {
    public CardBubbleLinearLayout(Context context) {
        this(context, null);
    }

    public CardBubbleLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
    }

    public CardBubbleLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6267e.f31323a;
    }
}
