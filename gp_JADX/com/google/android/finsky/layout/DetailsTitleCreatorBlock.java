package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class DetailsTitleCreatorBlock extends RelativeLayout {
    public FifeImageView f18130a;
    public DecoratedTextView f18131b;
    public TextView f18132c;
    public TextView f18133d;

    public DetailsTitleCreatorBlock(Context context) {
        this(context, null);
    }

    public DetailsTitleCreatorBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18130a = (FifeImageView) findViewById(C7582R.id.creator_image);
        this.f18130a.setBitmapTransformation(C3730w.f18859a);
        this.f18131b = (DecoratedTextView) findViewById(C7582R.id.creator_title);
        this.f18132c = (TextView) findViewById(C7582R.id.creator_publisher);
        this.f18133d = (TextView) findViewById(C7582R.id.creator_date);
    }
}
