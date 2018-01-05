package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.p184e.C2629a;

public class HighlightsViewPager extends FinskyViewPager implements C2629a {
    public HighlightsViewPager(Context context) {
        super(context);
    }

    public HighlightsViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean mo2996a(float f, float f2) {
        return true;
    }

    public final void as_() {
    }

    public int getHorizontalScrollerTop() {
        return 0;
    }

    public int getHorizontalScrollerBottom() {
        return getHeight();
    }
}
