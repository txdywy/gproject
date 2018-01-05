package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;

public class EditorialReviewModuleLayout extends ForegroundLinearLayout implements C2625e {
    public PlayTextView f13982a;
    public PlayTextView f13983b;
    public FifeImageView f13984c;
    public LinearLayout f13985d;
    public TextView f13986e;

    public EditorialReviewModuleLayout(Context context) {
        this(context, null);
    }

    public EditorialReviewModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13982a = (PlayTextView) findViewById(C7582R.id.title);
        this.f13983b = (PlayTextView) findViewById(C7582R.id.subtitle);
        this.f13984c = (FifeImageView) findViewById(C7582R.id.icon_image);
        this.f13985d = (LinearLayout) findViewById(C7582R.id.key_points_container);
        this.f13986e = (TextView) findViewById(C7582R.id.footer_message);
    }
}
