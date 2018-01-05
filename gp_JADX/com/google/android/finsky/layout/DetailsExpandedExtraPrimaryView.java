package com.google.android.finsky.layout;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class DetailsExpandedExtraPrimaryView extends RelativeLayout {
    public FifeImageView f18114a;
    public TextView f18115b;
    public TextView f18116c;

    public DetailsExpandedExtraPrimaryView(Context context) {
        this(context, null);
    }

    public DetailsExpandedExtraPrimaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18114a = (FifeImageView) findViewById(C7582R.id.extra_thumbnail);
        this.f18115b = (TextView) findViewById(C7582R.id.extra_title);
        this.f18116c = (TextView) findViewById(C7582R.id.extra_description);
        this.f18116c.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
