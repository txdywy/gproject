package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;

public class C2630c extends FrameLayout {
    public C2630c(Context context) {
        this(context, null);
    }

    public C2630c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2630c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }
}
