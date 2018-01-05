package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v4.p028a.p029a.C0207g;
import android.support.v4.widget.C0373d;
import android.support.v7.p040a.C0403j;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

class bd {
    public final TextView f3185a;
    public ha f3186b;
    public ha f3187c;
    public ha f3188d;
    public ha f3189e;
    public final bh f3190f;
    public int f3191g = 0;
    public Typeface f3192h;
    public boolean f3193i;

    static bd m3230a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new bf(textView);
        }
        return new bd(textView);
    }

    bd(TextView textView) {
        this.f3185a = textView;
        this.f3190f = new bh(this.f3185a);
    }

    @SuppressLint({"NewApi"})
    void mo757a(AttributeSet attributeSet, int i) {
        hc a;
        ColorStateList colorStateList;
        Context context = this.f3185a.getContext();
        ag a2 = ag.m3175a();
        hc a3 = hc.m3769a(context, attributeSet, C0403j.AppCompatTextHelper, i, 0);
        int g = a3.m3783g(C0403j.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.m3782f(C0403j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3186b = m3231a(context, a2, a3.m3783g(C0403j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.m3782f(C0403j.AppCompatTextHelper_android_drawableTop)) {
            this.f3187c = m3231a(context, a2, a3.m3783g(C0403j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.m3782f(C0403j.AppCompatTextHelper_android_drawableRight)) {
            this.f3188d = m3231a(context, a2, a3.m3783g(C0403j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.m3782f(C0403j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3189e = m3231a(context, a2, a3.m3783g(C0403j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a3.f3558b.recycle();
        boolean z = this.f3185a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z2 = false;
        Object obj = null;
        ColorStateList colorStateList2 = null;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            a = hc.m3767a(context, g, C0403j.TextAppearance);
            if (!z && a.m3782f(C0403j.TextAppearance_textAllCaps)) {
                obj = 1;
                z2 = a.m3772a(C0403j.TextAppearance_textAllCaps, false);
            }
            m3232a(context, a);
            if (VERSION.SDK_INT < 23) {
                if (a.m3782f(C0403j.TextAppearance_android_textColor)) {
                    colorStateList2 = a.m3780e(C0403j.TextAppearance_android_textColor);
                }
                if (a.m3782f(C0403j.TextAppearance_android_textColorHint)) {
                    colorStateList3 = a.m3780e(C0403j.TextAppearance_android_textColorHint);
                }
                if (a.m3782f(C0403j.TextAppearance_android_textColorLink)) {
                    colorStateList = colorStateList2;
                    colorStateList2 = a.m3780e(C0403j.TextAppearance_android_textColorLink);
                } else {
                    colorStateList = colorStateList2;
                    colorStateList2 = null;
                }
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            a.f3558b.recycle();
        } else {
            colorStateList = null;
            colorStateList2 = null;
        }
        a = hc.m3769a(context, attributeSet, C0403j.TextAppearance, i, 0);
        if (!z && a.m3782f(C0403j.TextAppearance_textAllCaps)) {
            obj = 1;
            z2 = a.m3772a(C0403j.TextAppearance_textAllCaps, false);
        }
        if (VERSION.SDK_INT < 23) {
            if (a.m3782f(C0403j.TextAppearance_android_textColor)) {
                colorStateList = a.m3780e(C0403j.TextAppearance_android_textColor);
            }
            if (a.m3782f(C0403j.TextAppearance_android_textColorHint)) {
                colorStateList3 = a.m3780e(C0403j.TextAppearance_android_textColorHint);
            }
            if (a.m3782f(C0403j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a.m3780e(C0403j.TextAppearance_android_textColorLink);
            }
        }
        m3232a(context, a);
        a.f3558b.recycle();
        if (colorStateList != null) {
            this.f3185a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.f3185a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f3185a.setLinkTextColor(colorStateList2);
        }
        if (!(z || r0 == null)) {
            m3240a(z2);
        }
        if (this.f3192h != null) {
            this.f3185a.setTypeface(this.f3192h, this.f3191g);
        }
        bh bhVar = this.f3190f;
        float f = -1.0f;
        float f2 = -1.0f;
        float f3 = -1.0f;
        TypedArray obtainStyledAttributes = bhVar.f3209l.obtainStyledAttributes(attributeSet, C0403j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0403j.AppCompatTextView_autoSizeTextType)) {
            bhVar.f3200c = obtainStyledAttributes.getInt(C0403j.AppCompatTextView_autoSizeTextType, 0);
        }
        if (obtainStyledAttributes.hasValue(C0403j.AppCompatTextView_autoSizeStepGranularity)) {
            f3 = obtainStyledAttributes.getDimension(C0403j.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(C0403j.AppCompatTextView_autoSizeMinTextSize)) {
            f = obtainStyledAttributes.getDimension(C0403j.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(C0403j.AppCompatTextView_autoSizeMaxTextSize)) {
            f2 = obtainStyledAttributes.getDimension(C0403j.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(C0403j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0403j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    for (resourceId = 0; resourceId < length; resourceId++) {
                        iArr[resourceId] = obtainTypedArray.getDimensionPixelSize(resourceId, -1);
                    }
                    bhVar.f3205h = bh.m3249a(iArr);
                    bhVar.m3252a();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!bhVar.m3256e()) {
            bhVar.f3200c = 0;
        } else if (bhVar.f3200c == 1) {
            if (!bhVar.f3206i) {
                DisplayMetrics displayMetrics = bhVar.f3209l.getResources().getDisplayMetrics();
                if (f == -1.0f) {
                    f = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = 1.0f;
                }
                bhVar.m3250a(f, f2, f3);
            }
            bhVar.m3253b();
        }
        if (C0373d.f2142a && this.f3190f.f3200c != 0) {
            int[] iArr2 = this.f3190f.f3205h;
            if (iArr2.length <= 0) {
                return;
            }
            if (((float) this.f3185a.getAutoSizeStepGranularity()) != -1.0f) {
                this.f3185a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f3190f.f3203f), Math.round(this.f3190f.f3204g), Math.round(this.f3190f.f3202e), 0);
            } else {
                this.f3185a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
            }
        }
    }

    private final void m3232a(Context context, hc hcVar) {
        this.f3191g = hcVar.m3770a(C0403j.TextAppearance_android_textStyle, this.f3191g);
        if (hcVar.m3782f(C0403j.TextAppearance_android_fontFamily) || hcVar.m3782f(C0403j.TextAppearance_fontFamily)) {
            this.f3192h = null;
            int i = hcVar.m3782f(C0403j.TextAppearance_fontFamily) ? C0403j.TextAppearance_fontFamily : C0403j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                C0207g beVar = new be(this, new WeakReference(this.f3185a));
                try {
                    Typeface typeface;
                    boolean z;
                    int i2 = this.f3191g;
                    int resourceId = hcVar.f3558b.getResourceId(i, 0);
                    if (resourceId == 0) {
                        typeface = null;
                    } else {
                        if (hcVar.f3559c == null) {
                            hcVar.f3559c = new TypedValue();
                        }
                        Context context2 = hcVar.f3557a;
                        TypedValue typedValue = hcVar.f3559c;
                        if (context2.isRestricted()) {
                            typeface = null;
                        } else {
                            Resources resources = context2.getResources();
                            resources.getValue(resourceId, typedValue, true);
                            typeface = C0206f.m1064a(context2, resources, typedValue, resourceId, i2, beVar);
                        }
                    }
                    this.f3192h = typeface;
                    if (this.f3192h == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f3193i = z;
                } catch (UnsupportedOperationException e) {
                } catch (NotFoundException e2) {
                }
            }
            if (this.f3192h == null) {
                String d = hcVar.m3778d(i);
                if (d != null) {
                    this.f3192h = Typeface.create(d, this.f3191g);
                }
            }
        } else if (hcVar.m3782f(C0403j.TextAppearance_android_typeface)) {
            this.f3193i = false;
            switch (hcVar.m3770a(C0403j.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.f3192h = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f3192h = Typeface.SERIF;
                    return;
                case 3:
                    this.f3192h = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    final void m3237a(Context context, int i) {
        hc a = hc.m3767a(context, i, C0403j.TextAppearance);
        if (a.m3782f(C0403j.TextAppearance_textAllCaps)) {
            m3240a(a.m3772a(C0403j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.m3782f(C0403j.TextAppearance_android_textColor)) {
            ColorStateList e = a.m3780e(C0403j.TextAppearance_android_textColor);
            if (e != null) {
                this.f3185a.setTextColor(e);
            }
        }
        m3232a(context, a);
        a.f3558b.recycle();
        if (this.f3192h != null) {
            this.f3185a.setTypeface(this.f3192h, this.f3191g);
        }
    }

    final void m3240a(boolean z) {
        this.f3185a.setAllCaps(z);
    }

    void mo756a() {
        if (this.f3186b != null || this.f3187c != null || this.f3188d != null || this.f3189e != null) {
            Drawable[] compoundDrawables = this.f3185a.getCompoundDrawables();
            m3238a(compoundDrawables[0], this.f3186b);
            m3238a(compoundDrawables[1], this.f3187c);
            m3238a(compoundDrawables[2], this.f3188d);
            m3238a(compoundDrawables[3], this.f3189e);
        }
    }

    final void m3238a(Drawable drawable, ha haVar) {
        if (drawable != null && haVar != null) {
            ag.m3177a(drawable, haVar, this.f3185a.getDrawableState());
        }
    }

    protected static ha m3231a(Context context, ag agVar, int i) {
        ColorStateList b = agVar.m3186b(context, i);
        if (b == null) {
            return null;
        }
        ha haVar = new ha();
        haVar.f3555d = true;
        haVar.f3552a = b;
        return haVar;
    }

    final void m3242b() {
        if (!C0373d.f2142a) {
            this.f3190f.m3254c();
        }
    }

    final void m3235a(int i, float f) {
        if (!C0373d.f2142a && !this.f3190f.m3255d()) {
            this.f3190f.m3251a(i, f);
        }
    }

    final void m3234a(int i) {
        bh bhVar = this.f3190f;
        if (bhVar.m3256e()) {
            switch (i) {
                case 0:
                    bhVar.f3200c = 0;
                    bhVar.f3203f = -1.0f;
                    bhVar.f3204g = -1.0f;
                    bhVar.f3202e = -1.0f;
                    bhVar.f3205h = new int[0];
                    bhVar.f3201d = false;
                    return;
                case 1:
                    DisplayMetrics displayMetrics = bhVar.f3209l.getResources().getDisplayMetrics();
                    bhVar.m3250a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (bhVar.m3253b()) {
                        bhVar.m3254c();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    final void m3236a(int i, int i2, int i3, int i4) {
        bh bhVar = this.f3190f;
        if (bhVar.m3256e()) {
            DisplayMetrics displayMetrics = bhVar.f3209l.getResources().getDisplayMetrics();
            bhVar.m3250a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (bhVar.m3253b()) {
                bhVar.m3254c();
            }
        }
    }

    final void m3241a(int[] iArr, int i) {
        int i2 = 0;
        bh bhVar = this.f3190f;
        if (bhVar.m3256e()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = bhVar.f3209l.getResources().getDisplayMetrics();
                    while (i2 < length) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    }
                }
                bhVar.f3205h = bh.m3249a(iArr2);
                if (!bhVar.m3252a()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            }
            bhVar.f3206i = false;
            if (bhVar.m3253b()) {
                bhVar.m3254c();
            }
        }
    }
}
