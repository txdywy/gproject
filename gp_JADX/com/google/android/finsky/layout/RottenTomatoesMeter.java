package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class RottenTomatoesMeter extends View {
    public final Paint f18339a;
    public final int f18340b;
    public final int f18341c;
    public int f18342d;

    public RottenTomatoesMeter(Context context) {
        this(context, null);
    }

    public RottenTomatoesMeter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f18340b = resources.getColor(C7582R.color.play_main_background);
        this.f18341c = resources.getColor(C7582R.color.play_movies_primary);
        this.f18339a = new Paint();
        this.f18339a.setStyle(Style.FILL);
        this.f18339a.setAntiAlias(true);
        setWillNotDraw(false);
    }

    public void setPercentValue(int i) {
        if (this.f18342d != i) {
            this.f18342d = i;
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas) {
        int a;
        int width = getWidth();
        int height = getHeight();
        boolean z = ai.f1848a.mo400k(this) == 0;
        int i = (this.f18342d * width) / 100;
        if (i > 0) {
            a = k.a(width, i, z, 0);
            this.f18339a.setColor(this.f18341c);
            canvas.drawRect((float) a, 0.0f, (float) (a + i), (float) height, this.f18339a);
        }
        a = width - i;
        if (a > 0) {
            int b = k.b(width, a, z, 0);
            this.f18339a.setColor(this.f18340b);
            canvas.drawRect((float) b, 0.0f, (float) (a + b), (float) height, this.f18339a);
        }
    }
}
