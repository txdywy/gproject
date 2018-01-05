package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0400g;
import android.support.v7.p040a.C0403j;
import android.support.v7.p041b.p042a.C0436b;
import android.support.v7.view.C0455e;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class AppCompatSpinner extends Spinner implements ah {
    public static final int[] f2928a = new int[]{16843505};
    public final ac f2929b;
    public final Context f2930c;
    public cs f2931d;
    public SpinnerAdapter f2932e;
    public final boolean f2933f;
    public az f2934g;
    public int f2935h;
    public final Rect f2936i;

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, C0394a.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Theme theme) {
        Context c0455e;
        AppCompatSpinner appCompatSpinner;
        TypedArray obtainStyledAttributes;
        Throwable e;
        C0491do azVar;
        hc a;
        CharSequence[] textArray;
        SpinnerAdapter arrayAdapter;
        super(context, attributeSet, i);
        this.f2936i = new Rect();
        hc a2 = hc.m3769a(context, attributeSet, C0403j.Spinner, i, 0);
        this.f2929b = new ac(this);
        if (theme != null) {
            c0455e = new C0455e(context, theme);
            appCompatSpinner = this;
        } else {
            int g = a2.m3783g(C0403j.Spinner_popupTheme, 0);
            if (g != 0) {
                c0455e = new C0455e(context, g);
                appCompatSpinner = this;
            } else if (VERSION.SDK_INT < 23) {
                c0455e = context;
                appCompatSpinner = this;
            } else {
                c0455e = null;
                appCompatSpinner = this;
            }
        }
        appCompatSpinner.f2930c = c0455e;
        if (this.f2930c != null) {
            if (i2 == -1) {
                try {
                    obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2928a, i, 0);
                    try {
                        if (obtainStyledAttributes.hasValue(0)) {
                            i2 = obtainStyledAttributes.getInt(0, 0);
                        }
                        if (obtainStyledAttributes != null) {
                            obtainStyledAttributes.recycle();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                            if (obtainStyledAttributes != null) {
                                obtainStyledAttributes.recycle();
                            }
                            if (i2 == 1) {
                                azVar = new az(this, this.f2930c, attributeSet, i);
                                a = hc.m3769a(this.f2930c, attributeSet, C0403j.Spinner, i, 0);
                                this.f2935h = a.m3781f(C0403j.Spinner_android_dropDownWidth, -2);
                                azVar.m3209a(a.m3771a(C0403j.Spinner_android_popupBackground));
                                azVar.f3174a = a2.m3778d(C0403j.Spinner_android_prompt);
                                a.f3558b.recycle();
                                this.f2934g = azVar;
                                this.f2931d = new ax(this, this, azVar);
                            }
                            textArray = a2.f3558b.getTextArray(C0403j.Spinner_android_entries);
                            if (textArray != null) {
                                arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
                                arrayAdapter.setDropDownViewResource(C0400g.support_simple_spinner_dropdown_item);
                                setAdapter(arrayAdapter);
                            }
                            a2.f3558b.recycle();
                            this.f2933f = true;
                            if (this.f2932e != null) {
                                setAdapter(this.f2932e);
                                this.f2932e = null;
                            }
                            this.f2929b.m3162a(attributeSet, i);
                        } catch (Throwable th) {
                            e = th;
                            if (obtainStyledAttributes != null) {
                                obtainStyledAttributes.recycle();
                            }
                            throw e;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    obtainStyledAttributes = null;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (obtainStyledAttributes != null) {
                        obtainStyledAttributes.recycle();
                    }
                    if (i2 == 1) {
                        azVar = new az(this, this.f2930c, attributeSet, i);
                        a = hc.m3769a(this.f2930c, attributeSet, C0403j.Spinner, i, 0);
                        this.f2935h = a.m3781f(C0403j.Spinner_android_dropDownWidth, -2);
                        azVar.m3209a(a.m3771a(C0403j.Spinner_android_popupBackground));
                        azVar.f3174a = a2.m3778d(C0403j.Spinner_android_prompt);
                        a.f3558b.recycle();
                        this.f2934g = azVar;
                        this.f2931d = new ax(this, this, azVar);
                    }
                    textArray = a2.f3558b.getTextArray(C0403j.Spinner_android_entries);
                    if (textArray != null) {
                        arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
                        arrayAdapter.setDropDownViewResource(C0400g.support_simple_spinner_dropdown_item);
                        setAdapter(arrayAdapter);
                    }
                    a2.f3558b.recycle();
                    this.f2933f = true;
                    if (this.f2932e != null) {
                        setAdapter(this.f2932e);
                        this.f2932e = null;
                    }
                    this.f2929b.m3162a(attributeSet, i);
                } catch (Throwable th2) {
                    e = th2;
                    obtainStyledAttributes = null;
                    if (obtainStyledAttributes != null) {
                        obtainStyledAttributes.recycle();
                    }
                    throw e;
                }
            }
            if (i2 == 1) {
                azVar = new az(this, this.f2930c, attributeSet, i);
                a = hc.m3769a(this.f2930c, attributeSet, C0403j.Spinner, i, 0);
                this.f2935h = a.m3781f(C0403j.Spinner_android_dropDownWidth, -2);
                azVar.m3209a(a.m3771a(C0403j.Spinner_android_popupBackground));
                azVar.f3174a = a2.m3778d(C0403j.Spinner_android_prompt);
                a.f3558b.recycle();
                this.f2934g = azVar;
                this.f2931d = new ax(this, this, azVar);
            }
        }
        textArray = a2.f3558b.getTextArray(C0403j.Spinner_android_entries);
        if (textArray != null) {
            arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(C0400g.support_simple_spinner_dropdown_item);
            setAdapter(arrayAdapter);
        }
        a2.f3558b.recycle();
        this.f2933f = true;
        if (this.f2932e != null) {
            setAdapter(this.f2932e);
            this.f2932e = null;
        }
        this.f2929b.m3162a(attributeSet, i);
    }

    public Context getPopupContext() {
        if (this.f2934g != null) {
            return this.f2930c;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f2934g != null) {
            this.f2934g.m3209a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0436b.m2650b(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        if (this.f2934g != null) {
            return this.f2934g.f3153K.getBackground();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f2934g != null) {
            this.f2934g.m3208a(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        if (this.f2934g != null) {
            return this.f2934g.m3218g();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f2934g != null) {
            this.f2934g.f3159l = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f2934g != null) {
            return this.f2934g.f3159l;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.f2934g != null) {
            this.f2935h = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.f2934g != null) {
            return this.f2935h;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f2933f) {
            super.setAdapter(spinnerAdapter);
            if (this.f2934g != null) {
                this.f2934g.mo753a(new ay(spinnerAdapter, (this.f2930c == null ? getContext() : this.f2930c).getTheme()));
                return;
            }
            return;
        }
        this.f2932e = spinnerAdapter;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2934g != null && this.f2934g.f3153K.isShowing()) {
            this.f2934g.mo674c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2931d == null || !this.f2931d.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2934g != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2972a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        if (this.f2934g == null) {
            return super.performClick();
        }
        if (!this.f2934g.f3153K.isShowing()) {
            this.f2934g.mo671b();
        }
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f2934g != null) {
            this.f2934g.f3174a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        if (this.f2934g != null) {
            return this.f2934g.f3174a;
        }
        return super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2929b != null) {
            this.f2929b.m3159a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2929b != null) {
            this.f2929b.m3158a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2929b != null) {
            this.f2929b.m3160a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2929b != null ? this.f2929b.m3163b() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2929b != null) {
            this.f2929b.m3161a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2929b != null ? this.f2929b.m3164c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2929b != null) {
            this.f2929b.m3165d();
        }
    }

    final int m2972a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i = 0;
        max = 0;
        while (max2 < min) {
            View view2;
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != max) {
                view2 = null;
            } else {
                itemViewType = max;
                view2 = view;
            }
            view = spinnerAdapter.getView(max2, view2, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
            max2++;
            max = itemViewType;
        }
        if (drawable == null) {
            return i;
        }
        drawable.getPadding(this.f2936i);
        return (this.f2936i.left + this.f2936i.right) + i;
    }
}
