package com.google.android.play.image;

import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.play.C6383k;
import com.google.android.play.a;

public class FifeImageView extends ImageView implements C6362y {
    public static boolean f31926h;
    public static boolean f31927i;
    public AnimationListener f31928A;
    public w A_;
    public AnimatorListener f31929B;
    public float f31930C;
    public ac f31931D;
    public AsyncTask f31932E;
    public Bitmap f31933F;
    public boolean f31934G;
    public boolean f31935H;
    public boolean f31936I;
    public boolean f31937J;
    public final float f31938K;
    public Handler f31939L;
    public boolean f31940j;
    public be f31941k;
    public String f31942l;
    public boolean f31943m;
    public Drawable f31944n;
    public Drawable f31945o;
    public final Rect f31946p;
    public boolean f31947q;
    public int f31948r;
    public int f31949s;
    public boolean f31950t;
    public float f31951u;
    public final PointF f31952v;
    public final Matrix f31953w;
    public boolean f31954x;
    public Animation f31955y;
    public int f31956z;

    public FifeImageView(Context context) {
        this(context, null);
    }

    public FifeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FifeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31946p = new Rect();
        this.f31947q = false;
        this.f31952v = new PointF(0.5f, 0.5f);
        this.f31953w = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.FifeImageView);
        this.f31954x = obtainStyledAttributes.getBoolean(C6383k.FifeImageView_fade_in_after_load, true);
        this.f31935H = obtainStyledAttributes.getBoolean(C6383k.FifeImageView_fixed_bounds, false);
        int i2 = getResources().getDisplayMetrics().densityDpi;
        if (obtainStyledAttributes.hasValue(C6383k.FifeImageView_cap_dpi)) {
            this.f31938K = Math.min(((float) obtainStyledAttributes.getInt(C6383k.FifeImageView_cap_dpi, i2)) / ((float) i2), bf.m29245a());
        } else {
            this.f31938K = bf.m29245a();
        }
        this.f31950t = obtainStyledAttributes.hasValue(C6383k.FifeImageView_zoom);
        if (this.f31950t) {
            this.f31951u = obtainStyledAttributes.getFraction(C6383k.FifeImageView_zoom, 1, 1, 1.0f);
            super.setScaleType(ScaleType.MATRIX);
        } else {
            this.f31951u = 1.0f;
        }
        Resources resources = context.getResources();
        if (obtainStyledAttributes.getBoolean(C6383k.FifeImageView_is_avatar, false)) {
            this.f31931D = C6363a.m29190a(resources);
        } else if (obtainStyledAttributes.getBoolean(C6383k.FifeImageView_is_avatar_no_ring, false)) {
            this.f31931D = C6363a.m29197b(resources);
        }
        this.f31930C = obtainStyledAttributes.getFraction(C6383k.FifeImageView_request_scale_factor, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f31956z = resources.getInteger(17694720);
        this.f31937J = true;
        this.f31939L = new Handler(Looper.getMainLooper());
    }

    public void setDefaultDrawable(Drawable drawable) {
        this.f31944n = drawable;
    }

    public void setForeground(Drawable drawable) {
        if (this.f31945o != drawable) {
            if (this.f31945o != null) {
                this.f31945o.setCallback(null);
                unscheduleDrawable(this.f31945o);
            }
            this.f31945o = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public final void m29182a(String str, boolean z, w wVar) {
        if (!str.equals(this.f31942l)) {
            this.f31942l = str;
            this.f31943m = z;
            m29184a(false, null);
        }
        this.A_ = wVar;
        m29175b(false);
    }

    public void m29179a() {
        this.f31944n = null;
        this.f31942l = null;
        C6365x c6365x = (C6365x) getTag();
        if (c6365x != null) {
            c6365x.mo5399a();
            setTag(null);
        }
        setImageBitmap(null);
        m29184a(false, null);
        m29176e();
    }

    public void setOnLoadedListener(be beVar) {
        this.f31941k = beVar;
    }

    public void setBitmapTransformation(ac acVar) {
        this.f31931D = acVar;
        setWillNotDraw(false);
    }

    public void setHasFixedBounds(boolean z) {
        this.f31935H = z;
    }

    public final synchronized boolean m29187c() {
        return this.f31940j;
    }

    public synchronized void m29184a(boolean z, Bitmap bitmap) {
        this.f31940j = z;
        if (this.f31940j && this.f31941k != null) {
            this.f31941k.mo5432a(this, bitmap);
        }
    }

    public void setToFadeInAfterLoad(boolean z) {
        this.f31954x = z;
    }

    public final void m29188d() {
        if (this.f31941k != null) {
            this.f31941k.mo5431a(this);
        }
    }

    public final void mo5394a(C6365x c6365x) {
        boolean z = false;
        if (!this.f31936I) {
            Bitmap b = c6365x.mo5401b();
            if (b == null) {
                m29184a(false, null);
                return;
            }
            if (!this.f31940j) {
                z = true;
            }
            m29176e();
            if (m29174a(b)) {
                m29173a(b, new ax(this, z));
            } else {
                m29180a(b, z);
            }
        }
    }

    final void m29180a(Bitmap bitmap, boolean z) {
        setImageBitmap(bitmap);
        m29184a(bitmap != null, bitmap);
        if (!z || !this.f31954x) {
            m29188d();
        } else if (f31927i) {
            ai_();
        } else {
            if (this.f31955y == null) {
                this.f31955y = AnimationUtils.loadAnimation(getContext(), a.play_fade_in);
            }
            if (this.f31928A == null && this.f31941k != null) {
                this.f31928A = new ay(this);
            }
            this.f31955y.setAnimationListener(this.f31928A);
            startAnimation(this.f31955y);
        }
    }

    @TargetApi(14)
    public void ai_() {
        if (this.f31929B == null && this.f31941k != null) {
            this.f31929B = new az(this);
        }
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration((long) this.f31956z).setListener(this.f31929B);
    }

    public void setScaleType(ScaleType scaleType) {
        if (this.f31950t) {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        }
        super.setScaleType(scaleType);
    }

    public void setImageMatrix(Matrix matrix) {
        if (this.f31950t) {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        }
        super.setImageMatrix(matrix);
    }

    private final void m29175b(boolean z) {
        boolean z2 = true;
        if (!this.f31936I) {
            int width = getWidth();
            int height = getHeight();
            if (width != 0 || height != 0) {
                float a;
                C6365x c6365x;
                this.f31948r = 0;
                this.f31949s = 0;
                LayoutParams layoutParams = getLayoutParams();
                boolean z3 = layoutParams.width == -1;
                if (layoutParams.height != -1) {
                    z2 = false;
                }
                if (!(z3 && z2)) {
                    if (z3) {
                        this.f31948r = getWidth();
                    } else if (layoutParams.width > 0) {
                        this.f31948r = getWidth();
                        if (layoutParams.height > 0) {
                            this.f31949s = layoutParams.height;
                        }
                    } else if (z2) {
                        this.f31949s = getHeight();
                    }
                    if (this.f31931D == null) {
                        width = this.f31931D.a(this.f31948r, this.f31949s);
                    } else {
                        width = 0;
                    }
                    if (this.f31948r > 0) {
                        this.f31948r -= width;
                    }
                    if (this.f31949s > 0) {
                        this.f31949s -= width;
                    }
                    a = (bf.m29246a(getContext()) * this.f31930C) * this.f31938K;
                    this.f31948r = (int) (((float) this.f31948r) * a);
                    this.f31949s = (int) (a * ((float) this.f31949s));
                    z2 = TextUtils.isEmpty(this.f31942l);
                    if (!z2 || (this.f31948r <= 0 && this.f31949s <= 0)) {
                        c6365x = (C6365x) getTag();
                        if (c6365x != null) {
                            c6365x.mo5399a();
                            setImageBitmap(null);
                        }
                        m29176e();
                        if (z2 && m29174a(this.f31933F)) {
                            m29173a(this.f31933F, new ba(this));
                            return;
                        }
                    }
                    int i;
                    if (this.f31943m) {
                        height = this.f31948r;
                        i = this.f31949s;
                    } else {
                        i = 0;
                        height = 0;
                    }
                    c6365x = (C6365x) getTag();
                    if (!(c6365x == null || c6365x.mo5402c() == null)) {
                        if (!c6365x.mo5402c().equals(this.f31942l) || c6365x.mo5403d() != height || c6365x.mo5404e() != i) {
                            c6365x.mo5399a();
                        } else {
                            return;
                        }
                    }
                    c6365x = this.A_.a(this.f31942l, height, i, this.f31937J, this, false);
                    setTag(c6365x);
                    Bitmap b = c6365x.mo5401b();
                    m29176e();
                    if (b == null) {
                        setImageDrawable(this.f31944n);
                        return;
                    } else if (m29174a(b)) {
                        m29173a(b, new bb(this, z));
                        return;
                    } else {
                        m29185b(b, z);
                        return;
                    }
                }
                this.f31948r = getWidth();
                this.f31949s = getHeight();
                if (this.f31931D == null) {
                    width = 0;
                } else {
                    width = this.f31931D.a(this.f31948r, this.f31949s);
                }
                if (this.f31948r > 0) {
                    this.f31948r -= width;
                }
                if (this.f31949s > 0) {
                    this.f31949s -= width;
                }
                a = (bf.m29246a(getContext()) * this.f31930C) * this.f31938K;
                this.f31948r = (int) (((float) this.f31948r) * a);
                this.f31949s = (int) (a * ((float) this.f31949s));
                z2 = TextUtils.isEmpty(this.f31942l);
                if (z2) {
                }
                c6365x = (C6365x) getTag();
                if (c6365x != null) {
                    c6365x.mo5399a();
                    setImageBitmap(null);
                }
                m29176e();
                if (z2) {
                }
            }
        }
    }

    final void m29185b(Bitmap bitmap, boolean z) {
        boolean z2 = bitmap != null;
        if (!z || this.f31935H) {
            m29186c(bitmap, z2);
        } else {
            this.f31939L.post(new bc(this, bitmap, z2));
        }
    }

    private final boolean m29174a(Bitmap bitmap) {
        return (this.f31931D == null || bitmap == null) ? false : true;
    }

    private final void m29173a(Bitmap bitmap, ad adVar) {
        this.f31932E = new bd(this, getWidth(), getHeight(), adVar);
        this.f31932E.execute(new Bitmap[]{bitmap});
    }

    private final void m29176e() {
        if (this.f31932E != null) {
            this.f31932E.cancel(true);
            this.f31932E = null;
        }
    }

    public void setLocalImageBitmap(Bitmap bitmap) {
        this.f31942l = null;
        this.f31933F = bitmap;
        m29175b(false);
    }

    public final void m29183a(boolean z) {
        this.f31936I = false;
        setTag(null);
        m29175b(z);
    }

    public void setUseCachedPlaceholder(boolean z) {
        this.f31937J = z;
    }

    final void m29186c(Bitmap bitmap, boolean z) {
        if (!this.f31936I) {
            setImageBitmap(bitmap);
            m29184a(z, bitmap);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m29175b(true);
        this.f31947q = true;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f31945o;
    }

    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (f31926h && this.f31945o != null) {
            this.f31945o.jumpToCurrentState();
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f31945o != null && this.f31945o.isStateful()) {
            this.f31945o.setState(getDrawableState());
        }
        if (this.f31931D != null) {
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f31945o != null) {
            this.f31945o.setHotspot(f, f2);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f31945o != null) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f31945o.setVisible(z, false);
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z = false;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f31931D != null) {
            if (isPressed() && (isDuplicateParentStateEnabled() || isClickable())) {
                z = true;
            }
            if (z) {
                this.f31931D.b(canvas, width, height);
            }
            if (isFocused()) {
                this.f31931D.a(canvas, width, height);
            }
        } else if (this.f31945o != null) {
            if (this.f31947q) {
                this.f31947q = false;
                Rect rect = this.f31946p;
                rect.set(0, 0, getWidth(), getHeight());
                this.f31945o.setBounds(rect);
            }
            this.f31945o.draw(canvas);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        m29177f();
        super.setImageDrawable(drawable);
        this.f31934G = false;
        if (this.f31950t) {
            m29178g();
        }
    }

    public void setImageResource(int i) {
        m29177f();
        super.setImageResource(i);
        this.f31934G = false;
        if (this.f31950t) {
            m29178g();
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f31950t) {
            m29178g();
        }
        this.f31947q = true;
    }

    public void setImageURI(Uri uri) {
        m29177f();
        super.setImageURI(uri);
        this.f31934G = false;
    }

    public void requestLayout() {
        if (!this.f31934G) {
            super.requestLayout();
        }
    }

    public void setDefaultZoom(float f) {
        if (!this.f31950t || this.f31951u != f) {
            this.f31950t = true;
            this.f31951u = f;
            super.setScaleType(ScaleType.MATRIX);
            m29178g();
        }
    }

    private final void m29177f() {
        if (this.f31935H) {
            this.f31934G = true;
        }
    }

    private final void m29178g() {
        Drawable drawable = getDrawable();
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (drawable != null && width != 0.0f && height != 0.0f) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0.0f || intrinsicHeight <= 0.0f) {
                this.f31953w.reset();
            } else {
                float max = Math.max(width / intrinsicWidth, height / intrinsicHeight);
                float max2 = Math.max(intrinsicWidth - (width / max), 0.0f);
                max = Math.max(intrinsicHeight - (height / max), 0.0f);
                float f = this.f31952v.x * max2;
                float f2 = this.f31952v.y * max;
                float f3 = (this.f31951u - 1.0f) * intrinsicWidth;
                float f4 = (this.f31951u - 1.0f) * intrinsicHeight;
                this.f31953w.setRectToRect(new RectF(f + (f3 / 2.0f), f2 + (f4 / 2.0f), (intrinsicWidth - (max2 - f)) - (f3 / 2.0f), (intrinsicHeight - (max - f2)) - (f4 / 2.0f)), new RectF(0.0f, 0.0f, width, height), ScaleToFit.FILL);
            }
            super.setImageMatrix(this.f31953w);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        mo5394a((C6365x) obj);
    }

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        } else {
            z = false;
        }
        f31926h = z;
        if (VERSION.SDK_INT < 14) {
            z2 = false;
        }
        f31927i = z2;
    }
}
