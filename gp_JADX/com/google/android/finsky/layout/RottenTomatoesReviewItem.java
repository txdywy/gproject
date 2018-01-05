package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class RottenTomatoesReviewItem extends RelativeLayout {
    public FifeImageView f18343a;
    public View f18344b;
    public TextView f18345c;
    public TextView f18346d;
    public TextView f18347e;

    public RottenTomatoesReviewItem(Context context) {
        this(context, null);
    }

    public RottenTomatoesReviewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18343a = (FifeImageView) findViewById(C7582R.id.sentiment_image);
        this.f18344b = findViewById(C7582R.id.external_link_action_image);
        this.f18345c = (TextView) findViewById(C7582R.id.review_comment);
        this.f18346d = (TextView) findViewById(C7582R.id.review_author);
        this.f18347e = (TextView) findViewById(C7582R.id.review_source);
    }
}
