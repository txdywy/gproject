package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.squareup.leakcanary.C7582R;

public class PlayCardViewRateOverlay extends View {
    public final TextPaint f19527a;
    public final TextPaint f19528b;
    public final Rect f19529c;
    public final Rect f19530d;
    public final int f19531e;
    public String f19532f;
    public String f19533g;

    public PlayCardViewRateOverlay(Context context) {
        this(context, null);
    }

    public PlayCardViewRateOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f19527a = new TextPaint();
        this.f19527a.setAntiAlias(true);
        this.f19527a.setTextSize((float) resources.getDimensionPixelSize(C7582R.dimen.rate_card_stars_size));
        if (VERSION.SDK_INT >= 16) {
            this.f19527a.setTypeface(Typeface.create("sans-serif-light", 0));
        }
        this.f19528b = new TextPaint();
        this.f19528b.setAntiAlias(true);
        this.f19528b.setTextSize((float) resources.getDimensionPixelSize(C7582R.dimen.rate_card_label_size));
        this.f19528b.setTypeface(Typeface.create("sans-serif", 0));
        this.f19529c = new Rect();
        this.f19530d = new Rect();
        this.f19531e = resources.getDimensionPixelSize(C7582R.dimen.rate_card_overlay_top_margin);
        setWillNotDraw(false);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int height2 = this.f19529c.height();
        height = (((height - ((this.f19530d.height() * 2) + height2)) / 2) + (getPaddingTop() + this.f19531e)) + height2;
        if (!TextUtils.isEmpty(this.f19532f)) {
            canvas.drawText(this.f19532f, (float) (((width - this.f19529c.width()) / 2) - this.f19529c.left), (float) height, this.f19527a);
        }
        if (!TextUtils.isEmpty(this.f19533g)) {
            width = ((width - this.f19530d.width()) / 2) - this.f19530d.left;
            canvas.drawText(this.f19533g, (float) width, (float) (height + (this.f19530d.height() * 2)), this.f19528b);
        }
    }
}
