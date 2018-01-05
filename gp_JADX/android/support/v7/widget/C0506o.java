package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v7.p040a.C0394a;

final class C0506o extends ap implements C0464s {
    public final /* synthetic */ C0502k f3648a;

    public C0506o(C0502k c0502k, Context context) {
        this.f3648a = c0502k;
        super(context, null, C0394a.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        hn.m3839a(this, getContentDescription());
        setOnTouchListener(new C0507p(this, this));
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.f3648a.m3884c();
        }
        return true;
    }

    public final boolean mo624c() {
        return false;
    }

    public final boolean mo625d() {
        return false;
    }

    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C0259a.m1515a(background, width - max, height - max, width + max, height + max);
        }
        return frame;
    }
}
