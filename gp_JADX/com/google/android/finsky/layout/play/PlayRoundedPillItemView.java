package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class PlayRoundedPillItemView extends LinearLayout {
    public TextView f18740a;
    public final Paint f18741b;
    public final RectF f18742c;

    public PlayRoundedPillItemView(Context context) {
        this(context, null);
    }

    public PlayRoundedPillItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f18741b = new Paint();
        this.f18741b.setColor(-16777216);
        this.f18741b.setStrokeWidth((float) getResources().getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness));
        this.f18741b.setAntiAlias(true);
        this.f18741b.setStyle(Style.STROKE);
        this.f18741b.setAlpha(38);
        this.f18742c = new RectF();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18740a = (TextView) findViewById(C7582R.id.pill_title);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f18742c.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = this.f18742c.height();
        canvas.drawRoundRect(this.f18742c, height / 2.0f, height / 2.0f, this.f18741b);
    }
}
