package com.google.android.finsky.layout;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class DetailsExpandedExtraSecondaryView extends LinearLayout {
    public TextView f18117a;
    public TextView f18118b;

    public DetailsExpandedExtraSecondaryView(Context context) {
        this(context, null);
    }

    public DetailsExpandedExtraSecondaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18117a = (TextView) findViewById(C7582R.id.extra_title);
        this.f18118b = (TextView) findViewById(C7582R.id.extra_description);
        this.f18118b.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
