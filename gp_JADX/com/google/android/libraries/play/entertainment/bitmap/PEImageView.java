package com.google.android.libraries.play.entertainment.bitmap;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6114l;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class PEImageView extends ImageView implements C6028r {
    public final C6047p f30120a;
    public boolean f30121b;
    public boolean f30122c;
    public float f30123d;
    public long f30124e;
    public boolean f30125f;
    public boolean f30126g;
    public Drawable f30127h;
    public boolean f30128i;
    public boolean f30129j;
    public Animator f30130k;

    public PEImageView(Context context) {
        this(context, null, 0);
    }

    public PEImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PEImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30120a = m27918a(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public PEImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f30120a = m27918a(context, attributeSet, i, i2);
    }

    private final C6047p m27918a(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6114l.PEImageView, i, i2);
        this.f30121b = obtainStyledAttributes.getBoolean(C6114l.PEImageView_fadesInImage, false);
        float f = obtainStyledAttributes.getFloat(C6114l.PEImageView_bindScale, 1.0f);
        this.f30122c = obtainStyledAttributes.getBoolean(C6114l.PEImageView_hidesBackgroundWhenBound, false);
        int integer = obtainStyledAttributes.getInteger(C6114l.PEImageView_overrideRequestQuality, -1);
        obtainStyledAttributes.recycle();
        C6047p c6047p = new C6047p(C2998a.m15496l().m15514q(), this);
        addOnAttachStateChangeListener(c6047p);
        addOnLayoutChangeListener(c6047p);
        C6116b.m28106b(f > 0.0f);
        c6047p.f30164i = f;
        if (integer >= 0 && integer <= 100) {
            if (integer < 0 || integer > 100) {
                z = false;
            }
            C6116b.m28107b(z, "quality out of [0, 100]");
            c6047p.f30162g = integer;
        }
        return c6047p;
    }

    public final void m27924a(String str, int i, float f, C6032d... c6032dArr) {
        this.f30123d = f;
        this.f30124e = SystemClock.elapsedRealtime();
        this.f30120a.m27946a(ImageInfo.m27915a(str, true, 0, 0), i, c6032dArr);
    }

    public final void m27923a(ImageInfo imageInfo, int i, C6032d... c6032dArr) {
        this.f30123d = ((float) imageInfo.f30114c) / ((float) imageInfo.f30115d);
        this.f30124e = SystemClock.elapsedRealtime();
        this.f30120a.m27946a(imageInfo, i, c6032dArr);
    }

    public final void m27921a() {
        this.f30123d = 0.0f;
        C6047p c6047p = this.f30120a;
        c6047p.f30168m = null;
        C6047p.f30158c.m28054a("%x unbound", Integer.valueOf(c6047p.hashCode()));
        c6047p.m27945a();
    }

    @TargetApi(16)
    public void setBackground(Drawable drawable) {
        if (!m27920b(drawable)) {
            super.setBackground(drawable);
        }
    }

    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m27920b(drawable)) {
            super.setBackgroundDrawable(drawable);
        }
    }

    private final boolean m27920b(Drawable drawable) {
        if (this.f30129j) {
            return false;
        }
        this.f30127h = drawable;
        return this.f30128i;
    }

    final void m27922a(Drawable drawable) {
        this.f30129j = true;
        C6122h.m28132a((View) this, drawable);
        this.f30129j = false;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = MeasureSpec.getMode(i) == MemoryMappedFileBuffer.DEFAULT_SIZE && MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE;
        this.f30125f = z;
        if (this.f30125f || !getAdjustViewBounds()) {
            super.onMeasure(i, i2);
            return;
        }
        int[] a = C6122h.m28134a(i, i2, this.f30123d);
        if (a == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(a[0], a[1]);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f30126g = this.f30125f;
        this.f30128i = bitmap != null;
        if (this.f30128i) {
            this.f30123d = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        }
        super.setImageBitmap(bitmap);
        if (this.f30122c && !this.f30128i) {
            m27922a(this.f30127h);
        }
        this.f30126g = false;
        if (this.f30121b) {
            m27919b();
            if (!this.f30128i) {
                setImageAlpha(HprofParser.ROOT_UNKNOWN);
            } else if (SystemClock.elapsedRealtime() <= this.f30124e + 50) {
                setImageAlpha(HprofParser.ROOT_UNKNOWN);
                if (this.f30122c) {
                    m27922a(null);
                }
            } else {
                this.f30130k = ObjectAnimator.ofInt(this, "imageAlpha", new int[]{0, HprofParser.ROOT_UNKNOWN});
                if (this.f30122c) {
                    ((Animator) C6116b.m28100a(this.f30130k)).addListener(new C6051s(this));
                }
                this.f30130k.start();
            }
        }
    }

    public void requestLayout() {
        if (!this.f30126g) {
            super.requestLayout();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m27919b();
    }

    private final void m27919b() {
        Animator animator = this.f30130k;
        if (animator != null) {
            this.f30130k = null;
            animator.cancel();
        }
    }
}
