package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0403j;
import android.support.v7.p041b.p042a.C0436b;
import android.support.v7.p044e.C0442a;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton {
    public static final int[] f2986N = new int[]{16842912};
    public static final Property f2987a = new gw(Float.class, "thumbPos");
    public int f2988A;
    public int f2989B;
    public int f2990C;
    public int f2991D;
    public int f2992E;
    public int f2993F;
    public final TextPaint f2994G;
    public ColorStateList f2995H;
    public Layout f2996I;
    public Layout f2997J;
    public TransformationMethod f2998K;
    public ObjectAnimator f2999L;
    public final Rect f3000M;
    public Drawable f3001b;
    public ColorStateList f3002c;
    public Mode f3003d;
    public boolean f3004e;
    public boolean f3005f;
    public Drawable f3006g;
    public ColorStateList f3007h;
    public Mode f3008i;
    public boolean f3009j;
    public boolean f3010k;
    public int f3011l;
    public int f3012m;
    public int f3013n;
    public boolean f3014o;
    public CharSequence f3015p;
    public CharSequence f3016q;
    public boolean f3017r;
    public int f3018s;
    public int f3019t;
    public float f3020u;
    public float f3021v;
    public VelocityTracker f3022w;
    public int f3023x;
    public float f3024y;
    public int f3025z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3002c = null;
        this.f3003d = null;
        this.f3004e = false;
        this.f3005f = false;
        this.f3007h = null;
        this.f3008i = null;
        this.f3009j = false;
        this.f3010k = false;
        this.f3022w = VelocityTracker.obtain();
        this.f3000M = new Rect();
        this.f2994G = new TextPaint(1);
        Resources resources = getResources();
        this.f2994G.density = resources.getDisplayMetrics().density;
        hc a = hc.m3769a(context, attributeSet, C0403j.SwitchCompat, i, 0);
        this.f3001b = a.m3771a(C0403j.SwitchCompat_android_thumb);
        if (this.f3001b != null) {
            this.f3001b.setCallback(this);
        }
        this.f3006g = a.m3771a(C0403j.SwitchCompat_track);
        if (this.f3006g != null) {
            this.f3006g.setCallback(this);
        }
        this.f3015p = a.m3776c(C0403j.SwitchCompat_android_textOn);
        this.f3016q = a.m3776c(C0403j.SwitchCompat_android_textOff);
        this.f3017r = a.m3772a(C0403j.SwitchCompat_showText, true);
        this.f3011l = a.m3779e(C0403j.SwitchCompat_thumbTextPadding, 0);
        this.f3012m = a.m3779e(C0403j.SwitchCompat_switchMinWidth, 0);
        this.f3013n = a.m3779e(C0403j.SwitchCompat_switchPadding, 0);
        this.f3014o = a.m3772a(C0403j.SwitchCompat_splitTrack, false);
        ColorStateList e = a.m3780e(C0403j.SwitchCompat_thumbTint);
        if (e != null) {
            this.f3002c = e;
            this.f3004e = true;
        }
        Mode a2 = cj.m3399a(a.m3770a(C0403j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f3003d != a2) {
            this.f3003d = a2;
            this.f3005f = true;
        }
        if (this.f3004e || this.f3005f) {
            m3129b();
        }
        e = a.m3780e(C0403j.SwitchCompat_trackTint);
        if (e != null) {
            this.f3007h = e;
            this.f3009j = true;
        }
        a2 = cj.m3399a(a.m3770a(C0403j.SwitchCompat_trackTintMode, -1), null);
        if (this.f3008i != a2) {
            this.f3008i = a2;
            this.f3010k = true;
        }
        if (this.f3009j || this.f3010k) {
            m3128a();
        }
        int g = a.m3783g(C0403j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            Typeface typeface;
            hc a3 = hc.m3767a(context, g, C0403j.TextAppearance);
            e = a3.m3780e(C0403j.TextAppearance_android_textColor);
            if (e != null) {
                this.f2995H = e;
            } else {
                this.f2995H = getTextColors();
            }
            g = a3.m3779e(C0403j.TextAppearance_android_textSize, 0);
            if (!(g == 0 || ((float) g) == this.f2994G.getTextSize())) {
                this.f2994G.setTextSize((float) g);
                requestLayout();
            }
            g = a3.m3770a(C0403j.TextAppearance_android_typeface, -1);
            int a4 = a3.m3770a(C0403j.TextAppearance_android_textStyle, -1);
            switch (g) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
                default:
                    typeface = null;
                    break;
            }
            if (a4 > 0) {
                boolean z;
                float f;
                if (typeface == null) {
                    typeface = Typeface.defaultFromStyle(a4);
                } else {
                    typeface = Typeface.create(typeface, a4);
                }
                setSwitchTypeface(typeface);
                if (typeface != null) {
                    g = typeface.getStyle();
                } else {
                    g = 0;
                }
                a4 &= g ^ -1;
                TextPaint textPaint = this.f2994G;
                if ((a4 & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                textPaint.setFakeBoldText(z);
                TextPaint textPaint2 = this.f2994G;
                if ((a4 & 2) != 0) {
                    f = -0.25f;
                } else {
                    f = 0.0f;
                }
                textPaint2.setTextSkewX(f);
            } else {
                this.f2994G.setFakeBoldText(false);
                this.f2994G.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (a3.m3772a(C0403j.TextAppearance_textAllCaps, false)) {
                this.f2998K = new C0442a(getContext());
            } else {
                this.f2998K = null;
            }
            a3.f3558b.recycle();
        }
        a.f3558b.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3019t = viewConfiguration.getScaledTouchSlop();
        this.f3023x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f2994G.getTypeface() != null && !this.f2994G.getTypeface().equals(typeface)) || (this.f2994G.getTypeface() == null && typeface != null)) {
            this.f2994G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchPadding(int i) {
        this.f3013n = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.f3013n;
    }

    public void setSwitchMinWidth(int i) {
        this.f3012m = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.f3012m;
    }

    public void setThumbTextPadding(int i) {
        this.f3011l = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.f3011l;
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.f3006g != null) {
            this.f3006g.setCallback(null);
        }
        this.f3006g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0436b.m2650b(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.f3006g;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3007h = colorStateList;
        this.f3009j = true;
        m3128a();
    }

    public ColorStateList getTrackTintList() {
        return this.f3007h;
    }

    public void setTrackTintMode(Mode mode) {
        this.f3008i = mode;
        this.f3010k = true;
        m3128a();
    }

    public Mode getTrackTintMode() {
        return this.f3008i;
    }

    private final void m3128a() {
        if (this.f3006g == null) {
            return;
        }
        if (this.f3009j || this.f3010k) {
            this.f3006g = this.f3006g.mutate();
            if (this.f3009j) {
                C0259a.m1516a(this.f3006g, this.f3007h);
            }
            if (this.f3010k) {
                C0259a.m1519a(this.f3006g, this.f3008i);
            }
            if (this.f3006g.isStateful()) {
                this.f3006g.setState(getDrawableState());
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.f3001b != null) {
            this.f3001b.setCallback(null);
        }
        this.f3001b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0436b.m2650b(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.f3001b;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3002c = colorStateList;
        this.f3004e = true;
        m3129b();
    }

    public ColorStateList getThumbTintList() {
        return this.f3002c;
    }

    public void setThumbTintMode(Mode mode) {
        this.f3003d = mode;
        this.f3005f = true;
        m3129b();
    }

    public Mode getThumbTintMode() {
        return this.f3003d;
    }

    private final void m3129b() {
        if (this.f3001b == null) {
            return;
        }
        if (this.f3004e || this.f3005f) {
            this.f3001b = this.f3001b.mutate();
            if (this.f3004e) {
                C0259a.m1516a(this.f3001b, this.f3002c);
            }
            if (this.f3005f) {
                C0259a.m1519a(this.f3001b, this.f3003d);
            }
            if (this.f3001b.isStateful()) {
                this.f3001b.setState(getDrawableState());
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f3014o = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.f3014o;
    }

    public CharSequence getTextOn() {
        return this.f3015p;
    }

    public void setTextOn(CharSequence charSequence) {
        this.f3015p = charSequence;
        requestLayout();
    }

    public CharSequence getTextOff() {
        return this.f3016q;
    }

    public void setTextOff(CharSequence charSequence) {
        this.f3016q = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.f3017r != z) {
            this.f3017r = z;
            requestLayout();
        }
    }

    public boolean getShowText() {
        return this.f3017r;
    }

    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int max;
        int i3 = 0;
        if (this.f3017r) {
            if (this.f2996I == null) {
                this.f2996I = m3127a(this.f3015p);
            }
            if (this.f2997J == null) {
                this.f2997J = m3127a(this.f3016q);
            }
        }
        Rect rect = this.f3000M;
        if (this.f3001b != null) {
            this.f3001b.getPadding(rect);
            intrinsicWidth = (this.f3001b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3001b.getIntrinsicHeight();
        } else {
            intrinsicHeight = 0;
            intrinsicWidth = 0;
        }
        if (this.f3017r) {
            max = Math.max(this.f2996I.getWidth(), this.f2997J.getWidth()) + (this.f3011l * 2);
        } else {
            max = 0;
        }
        this.f2989B = Math.max(max, intrinsicWidth);
        if (this.f3006g != null) {
            this.f3006g.getPadding(rect);
            i3 = this.f3006g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        max = rect.left;
        intrinsicWidth = rect.right;
        if (this.f3001b != null) {
            rect = cj.m3400a(this.f3001b);
            max = Math.max(max, rect.left);
            intrinsicWidth = Math.max(intrinsicWidth, rect.right);
        }
        intrinsicWidth = Math.max(this.f3012m, intrinsicWidth + (max + (this.f2989B * 2)));
        intrinsicHeight = Math.max(i3, intrinsicHeight);
        this.f3025z = intrinsicWidth;
        this.f2988A = intrinsicHeight;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < intrinsicHeight) {
            setMeasuredDimension(getMeasuredWidthAndState(), intrinsicHeight);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        Object obj = isChecked() ? this.f3015p : this.f3016q;
        if (obj != null) {
            accessibilityEvent.getText().add(obj);
        }
    }

    private final Layout m3127a(CharSequence charSequence) {
        CharSequence transformation;
        if (this.f2998K != null) {
            transformation = this.f2998K.getTransformation(charSequence, this);
        } else {
            transformation = charSequence;
        }
        return new StaticLayout(transformation, this.f2994G, transformation != null ? (int) Math.ceil((double) Layout.getDesiredWidth(transformation, this.f2994G)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f = 1.0f;
        int i = 0;
        this.f3022w.addMovement(motionEvent);
        float x;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                f = motionEvent.getY();
                if (isEnabled()) {
                    if (this.f3001b != null) {
                        int d = m3131d();
                        this.f3001b.getPadding(this.f3000M);
                        int i2 = this.f2991D - this.f3019t;
                        d = (d + this.f2990C) - this.f3019t;
                        int i3 = (((this.f2989B + d) + this.f3000M.left) + this.f3000M.right) + this.f3019t;
                        int i4 = this.f2993F + this.f3019t;
                        if (x > ((float) d) && x < ((float) i3) && f > ((float) i2) && f < ((float) i4)) {
                            i = 1;
                        }
                    }
                    if (i != 0) {
                        this.f3018s = 1;
                        this.f3020u = x;
                        this.f3021v = f;
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.f3018s != 2) {
                    this.f3018s = 0;
                    this.f3022w.clear();
                    break;
                }
                this.f3018s = 0;
                boolean z = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z) {
                    this.f3022w.computeCurrentVelocity(1000);
                    x = this.f3022w.getXVelocity();
                    z = Math.abs(x) > ((float) this.f3023x) ? id.m3869a(this) ? x < 0.0f : x > 0.0f : m3130c();
                } else {
                    z = isChecked;
                }
                if (z != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            case 2:
                switch (this.f3018s) {
                    case 0:
                        break;
                    case 1:
                        x = motionEvent.getX();
                        f = motionEvent.getY();
                        if (Math.abs(x - this.f3020u) > ((float) this.f3019t) || Math.abs(f - this.f3021v) > ((float) this.f3019t)) {
                            this.f3018s = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f3020u = x;
                            this.f3021v = f;
                            return true;
                        }
                    case 2:
                        float x2 = motionEvent.getX();
                        int e = m3132e();
                        float f2 = x2 - this.f3020u;
                        x = e != 0 ? f2 / ((float) e) : f2 > 0.0f ? 1.0f : -1.0f;
                        if (id.m3869a(this)) {
                            x = -x;
                        }
                        x += this.f3024y;
                        if (x < 0.0f) {
                            f = 0.0f;
                        } else if (x <= 1.0f) {
                            f = x;
                        }
                        if (f == this.f3024y) {
                            return true;
                        }
                        this.f3020u = x2;
                        m3133a(f);
                        return true;
                    default:
                        break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private final boolean m3130c() {
        return this.f3024y > 0.5f;
    }

    final void m3133a(float f) {
        this.f3024y = f;
        invalidate();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setChecked(boolean z) {
        float f = 1.0f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !ai.f1848a.mo409s(this)) {
            if (this.f2999L != null) {
                this.f2999L.cancel();
            }
            if (!isChecked) {
                f = 0.0f;
            }
            m3133a(f);
            return;
        }
        if (!isChecked) {
            f = 0.0f;
        }
        this.f2999L = ObjectAnimator.ofFloat(this, f2987a, new float[]{f});
        this.f2999L.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f2999L.setAutoCancel(true);
        }
        this.f2999L.start();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int paddingLeft;
        int paddingTop;
        int i5 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3001b != null) {
            Rect rect = this.f3000M;
            if (this.f3006g != null) {
                this.f3006g.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = cj.m3400a(this.f3001b);
            max = Math.max(0, a.left - rect.left);
            i5 = Math.max(0, a.right - rect.right);
        } else {
            max = 0;
        }
        if (id.m3869a(this)) {
            paddingLeft = getPaddingLeft() + max;
            max = ((this.f3025z + paddingLeft) - max) - i5;
            i5 = paddingLeft;
        } else {
            paddingLeft = (getWidth() - getPaddingRight()) - i5;
            i5 += max + (paddingLeft - this.f3025z);
            max = paddingLeft;
        }
        switch (getGravity() & 112) {
            case 16:
                paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f2988A / 2);
                paddingLeft = this.f2988A + paddingTop;
                break;
            case 80:
                paddingLeft = getHeight() - getPaddingBottom();
                paddingTop = paddingLeft - this.f2988A;
                break;
            default:
                paddingTop = getPaddingTop();
                paddingLeft = this.f2988A + paddingTop;
                break;
        }
        this.f2990C = i5;
        this.f2991D = paddingTop;
        this.f2993F = paddingLeft;
        this.f2992E = max;
    }

    public void draw(Canvas canvas) {
        Rect a;
        int i;
        Rect rect = this.f3000M;
        int i2 = this.f2990C;
        int i3 = this.f2991D;
        int i4 = this.f2992E;
        int i5 = this.f2993F;
        int d = i2 + m3131d();
        if (this.f3001b != null) {
            a = cj.m3400a(this.f3001b);
        } else {
            a = cj.f3278a;
        }
        if (this.f3006g != null) {
            this.f3006g.getPadding(rect);
            int i6 = rect.left + d;
            if (a != null) {
                if (a.left > rect.left) {
                    i2 += a.left - rect.left;
                }
                if (a.top > rect.top) {
                    d = (a.top - rect.top) + i3;
                } else {
                    d = i3;
                }
                if (a.right > rect.right) {
                    i4 -= a.right - rect.right;
                }
                i = a.bottom > rect.bottom ? i5 - (a.bottom - rect.bottom) : i5;
            } else {
                i = i5;
                d = i3;
            }
            this.f3006g.setBounds(i2, d, i4, i);
            i = i6;
        } else {
            i = d;
        }
        if (this.f3001b != null) {
            this.f3001b.getPadding(rect);
            i2 = i - rect.left;
            i = (i + this.f2989B) + rect.right;
            this.f3001b.setBounds(i2, i3, i, i5);
            Drawable background = getBackground();
            if (background != null) {
                C0259a.m1515a(background, i2, i3, i, i5);
            }
        }
        super.draw(canvas);
    }

    protected void onDraw(Canvas canvas) {
        int save;
        super.onDraw(canvas);
        Rect rect = this.f3000M;
        Drawable drawable = this.f3006g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f2991D + rect.top;
        int i2 = this.f2993F - rect.bottom;
        Drawable drawable2 = this.f3001b;
        if (drawable != null) {
            if (!this.f3014o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = cj.m3400a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        save = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = m3130c() ? this.f2996I : this.f2997J;
        if (layout != null) {
            int i3;
            int[] drawableState = getDrawableState();
            if (this.f2995H != null) {
                this.f2994G.setColor(this.f2995H.getColorForState(drawableState, 0));
            }
            this.f2994G.drawableState = drawableState;
            if (drawable2 != null) {
                rect = drawable2.getBounds();
                i3 = rect.right + rect.left;
            } else {
                i3 = getWidth();
            }
            canvas.translate((float) ((i3 / 2) - (layout.getWidth() / 2)), (float) (((i + i2) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public int getCompoundPaddingLeft() {
        if (!id.m3869a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3025z;
        if (TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft;
        }
        return compoundPaddingLeft + this.f3013n;
    }

    public int getCompoundPaddingRight() {
        if (id.m3869a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3025z;
        if (TextUtils.isEmpty(getText())) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + this.f3013n;
    }

    private final int m3131d() {
        float f;
        if (id.m3869a(this)) {
            f = 1.0f - this.f3024y;
        } else {
            f = this.f3024y;
        }
        return (int) ((f * ((float) m3132e())) + 0.5f);
    }

    private final int m3132e() {
        if (this.f3006g == null) {
            return 0;
        }
        Rect a;
        Rect rect = this.f3000M;
        this.f3006g.getPadding(rect);
        if (this.f3001b != null) {
            a = cj.m3400a(this.f3001b);
        } else {
            a = cj.f3278a;
        }
        return ((((this.f3025z - this.f2989B) - rect.left) - rect.right) - a.left) - a.right;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f2986N);
        }
        return onCreateDrawableState;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.f3001b;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState) | 0;
        }
        drawable = this.f3006g;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f3001b != null) {
            C0259a.m1513a(this.f3001b, f, f2);
        }
        if (this.f3006g != null) {
            C0259a.m1513a(this.f3006g, f, f2);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3001b || drawable == this.f3006g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f3001b != null) {
            this.f3001b.jumpToCurrentState();
        }
        if (this.f3006g != null) {
            this.f3006g.jumpToCurrentState();
        }
        if (this.f2999L != null && this.f2999L.isStarted()) {
            this.f2999L.end();
            this.f2999L = null;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f3015p : this.f3016q;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            CharSequence stringBuilder = new StringBuilder();
            stringBuilder.append(text).append(' ').append(charSequence);
            accessibilityNodeInfo.setText(stringBuilder);
        }
    }
}
