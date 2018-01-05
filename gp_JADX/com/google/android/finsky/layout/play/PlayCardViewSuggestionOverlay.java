package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import com.squareup.leakcanary.C7582R;

public class PlayCardViewSuggestionOverlay extends View {
    public final Drawable f18700a;

    public PlayCardViewSuggestionOverlay(Context context) {
        this(context, null);
    }

    public PlayCardViewSuggestionOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18700a = C0216d.m1112a(context, (int) C7582R.drawable.ic_hidden_cards);
        setBackgroundResource(C7582R.drawable.card_suggestion_overlay);
        setWillNotDraw(false);
    }

    protected void onDraw(Canvas canvas) {
        float f = 1.0f;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int intrinsicWidth = this.f18700a.getIntrinsicWidth();
        int intrinsicHeight = this.f18700a.getIntrinsicHeight();
        float f2 = intrinsicWidth <= width ? 1.0f : ((float) width) / ((float) intrinsicWidth);
        if (intrinsicHeight > height) {
            f = ((float) height) / ((float) intrinsicHeight);
        }
        f = Math.min(f2, f);
        int i = (int) (((float) intrinsicWidth) * f);
        int i2 = (int) (f * ((float) intrinsicHeight));
        width = (width - i) / 2;
        height = (height - i2) / 2;
        this.f18700a.setBounds(width, height, i + width, i2 + height);
        this.f18700a.draw(canvas);
    }
}
