package com.google.android.libraries.play.entertainment.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.play.entertainment.C6071d;
import com.google.android.libraries.play.entertainment.p351m.C6119e;

public class TimeBar extends View {
    public final Paint f30293a;
    public final Runnable f30294b;
    public int f30295c;
    public float f30296d;
    public int f30297e;
    public float f30298f;
    public C2125d f30299g;

    public TimeBar(Context context) {
        this(context, null, 0);
    }

    public TimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30294b = new C6124e(this);
        this.f30293a = new Paint(1);
        this.f30297e = -7829368;
        this.f30295c = C0216d.m1116c(context, C6071d.play_music_primary);
    }

    public void setPlayedColor(int i) {
        if (this.f30295c != i) {
            this.f30295c = i;
            invalidate();
        }
    }

    public void setTimeProvider(C2125d c2125d) {
        if (!C6119e.m28112a(this.f30299g, c2125d)) {
            this.f30299g = c2125d;
            m28135a();
        }
    }

    final void m28135a() {
        float min;
        float f = 0.0f;
        if (this.f30299g != null) {
            min = Math.min(1.0f, Math.max(0.0f, this.f30299g.mo2655c()));
            f = Math.min(1.0f, Math.max(0.0f, this.f30299g.mo2656d()));
        } else {
            min = 0.0f;
        }
        if (this.f30296d != min || this.f30298f != f) {
            this.f30296d = min;
            this.f30298f = f;
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f30293a.setColor(this.f30297e);
        canvas.drawRect(0.0f, 0.0f, ((float) getWidth()) * this.f30298f, (float) getHeight(), this.f30293a);
        this.f30293a.setColor(this.f30295c);
        canvas.drawRect(0.0f, 0.0f, ((float) getWidth()) * this.f30296d, (float) getHeight(), this.f30293a);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30294b.run();
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.f30294b);
        super.onDetachedFromWindow();
    }
}
