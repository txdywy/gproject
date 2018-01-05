package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.widget.SeekBar;

final class aw extends as {
    public final SeekBar f3130d;
    public Drawable f3131e;
    public ColorStateList f3132f = null;
    public Mode f3133g = null;
    public boolean f3134h = false;
    public boolean f3135i = false;

    aw(SeekBar seekBar) {
        super(seekBar);
        this.f3130d = seekBar;
    }

    final void mo752a(AttributeSet attributeSet, int i) {
        super.mo752a(attributeSet, i);
        hc a = hc.m3769a(this.f3130d.getContext(), attributeSet, C0403j.AppCompatSeekBar, i, 0);
        Drawable b = a.m3774b(C0403j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f3130d.setThumb(b);
        }
        b = a.m3771a(C0403j.AppCompatSeekBar_tickMark);
        if (this.f3131e != null) {
            this.f3131e.setCallback(null);
        }
        this.f3131e = b;
        if (b != null) {
            b.setCallback(this.f3130d);
            C0259a.m1523b(b, ai.f1848a.mo400k(this.f3130d));
            if (b.isStateful()) {
                b.setState(this.f3130d.getDrawableState());
            }
            m3202a();
        }
        this.f3130d.invalidate();
        if (a.m3782f(C0403j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3133g = cj.m3399a(a.m3770a(C0403j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3133g);
            this.f3135i = true;
        }
        if (a.m3782f(C0403j.AppCompatSeekBar_tickMarkTint)) {
            this.f3132f = a.m3780e(C0403j.AppCompatSeekBar_tickMarkTint);
            this.f3134h = true;
        }
        a.f3558b.recycle();
        m3202a();
    }

    private final void m3202a() {
        if (this.f3131e == null) {
            return;
        }
        if (this.f3134h || this.f3135i) {
            this.f3131e = C0259a.m1526e(this.f3131e.mutate());
            if (this.f3134h) {
                C0259a.m1516a(this.f3131e, this.f3132f);
            }
            if (this.f3135i) {
                C0259a.m1519a(this.f3131e, this.f3133g);
            }
            if (this.f3131e.isStateful()) {
                this.f3131e.setState(this.f3130d.getDrawableState());
            }
        }
    }
}
