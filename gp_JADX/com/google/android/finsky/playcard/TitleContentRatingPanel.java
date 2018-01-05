package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public class TitleContentRatingPanel extends LinearLayout {
    public TitleContentRatingPanel(Context context) {
        this(context, null);
    }

    public TitleContentRatingPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo2004g();
        super.onFinishInflate();
        findViewById(C7582R.id.title_content_rating_icon);
        findViewById(C7582R.id.title_content_rating);
    }
}
