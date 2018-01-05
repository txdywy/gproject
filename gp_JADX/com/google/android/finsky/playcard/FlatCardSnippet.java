package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.layout.PlayCardSnippet;

public class FlatCardSnippet extends PlayCardSnippet {
    public FlatCardSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final int m18414a(boolean z) {
        if (z) {
            return 0;
        }
        return super.a(z);
    }
}
