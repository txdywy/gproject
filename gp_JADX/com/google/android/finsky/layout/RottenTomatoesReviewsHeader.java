package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class RottenTomatoesReviewsHeader extends RelativeLayout {
    public TextView f18348a;
    public FifeImageView f18349b;
    public TextView f18350c;
    public TextView f18351d;
    public RottenTomatoesMeter f18352e;
    public TextView f18353f;
    public final int f18354g;
    public final Paint f18355h;
    public final int f18356i;

    public RottenTomatoesReviewsHeader(Context context) {
        this(context, null);
    }

    public RottenTomatoesReviewsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness);
        this.f18354g = ((dimensionPixelSize + 2) - 1) / 2;
        this.f18355h = new Paint();
        this.f18355h.setColor(resources.getColor(C7582R.color.play_translucent_separator_line));
        this.f18355h.setStrokeWidth((float) dimensionPixelSize);
        this.f18356i = resources.getDimensionPixelSize(C7582R.dimen.details_new_content_margin);
        setWillNotDraw(false);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18348a = (TextView) findViewById(C7582R.id.title);
        this.f18349b = (FifeImageView) findViewById(C7582R.id.sentiment_image);
        this.f18350c = (TextView) findViewById(C7582R.id.favorable_percent_value);
        this.f18351d = (TextView) findViewById(C7582R.id.reviews_count);
        this.f18352e = (RottenTomatoesMeter) findViewById(C7582R.id.favorable_percent_bar);
        this.f18353f = (TextView) findViewById(C7582R.id.source);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() - this.f18354g;
        canvas.drawLine((float) this.f18356i, (float) height, (float) (getWidth() - this.f18356i), (float) height, this.f18355h);
    }
}
