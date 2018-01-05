package com.google.android.finsky.billing.addresschallenge;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.List;

@TargetApi(12)
public class AddressFieldsLayoutHoneycomb extends C1702j implements AnimatorListener, AnimatorUpdateListener, OnFocusChangeListener {
    public int f8759d;
    public List f8760e;
    public boolean f8761f;
    public ValueAnimator f8762g;
    public ValueAnimator f8763h;
    public ValueAnimator f8764i;
    public C1703s f8765j;
    public boolean f8766k;
    public CharSequence f8767l;

    public AddressFieldsLayoutHoneycomb(Context context) {
        this(context, null);
    }

    public AddressFieldsLayoutHoneycomb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddressFieldsLayoutHoneycomb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8759d = 0;
        this.f8766k = true;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("parent_instance_state", super.onSaveInstanceState());
        bundle.putBoolean("support_showing_one_field", this.f8766k);
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f8766k = bundle.getBoolean("support_showing_one_field");
            super.onRestoreInstanceState(bundle.getParcelable("parent_instance_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f8762g = ValueAnimator.ofFloat(new float[]{0.0f});
        this.f8762g.addUpdateListener(this);
        this.f8762g.addListener(this);
        this.f8763h = ValueAnimator.ofFloat(new float[]{0.0f});
        this.f8763h.addUpdateListener(this);
        this.f8763h.addListener(this);
        this.f8764i = this.f8762g;
    }

    public final void mo2404a() {
        this.c.setVisibility(0);
        this.c.setAlpha(0.0f);
        this.c.animate().alpha(1.0f);
    }

    public final void mo2405b() {
        this.c.animate().alpha(0.0f).setListener(new C1739k(this));
    }

    public void setFields(List list) {
        if (this.f8766k && list.size() > 1 && (list.get(0) instanceof EditText)) {
            int i = 1;
        } else {
            boolean z = false;
        }
        switch (this.f8759d) {
            case 0:
                m9504a(list);
                m9503a(8);
                break;
            case 1:
                m9504a(list);
                break;
            case 2:
                m9504a(list);
                m9505f();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                this.f8760e = list;
                break;
            default:
                FinskyLog.m21669e("enum %d", Integer.valueOf(this.f8759d));
                break;
        }
        if (i != 0) {
            EditText editText = (EditText) list.get(0);
            this.f8767l = editText.getHint();
            editText.setHint(C7582R.string.address);
            editText.setOnFocusChangeListener(this);
        } else if (this.f8766k) {
            this.f8766k = false;
        }
    }

    public final void mo2406c() {
        switch (this.f8759d) {
            case 0:
                if (this.f8766k) {
                    m9505f();
                    this.f8759d = 5;
                } else {
                    m9503a(0);
                    this.f8759d = 4;
                }
                this.f8764i.setFloatValues(new float[]{0.0f, 1.0f});
                this.f8764i.start();
                return;
            case 3:
                this.f8761f = true;
                return;
            default:
                return;
        }
    }

    public final void mo2407d() {
        switch (this.f8759d) {
            case 1:
            case 2:
                this.f8759d = 3;
                this.a.setVisibility(0);
                this.f8764i.setFloatValues(new float[]{1.0f, 0.0f});
                this.f8764i.setStartDelay(200);
                this.f8764i.setCurrentPlayTime(0);
                this.f8764i.start();
                return;
            case 4:
            case 5:
            case 6:
                this.f8759d = 3;
                this.f8764i.reverse();
                return;
            default:
                return;
        }
    }

    public final void mo2408e() {
        this.f8766k = false;
        switch (this.f8759d) {
            case 2:
                m9503a(0);
                return;
            case 5:
                this.f8764i.end();
                this.f8759d = 1;
                m9503a(0);
                return;
            default:
                return;
        }
    }

    public void setOnHeightOffsetChangedListener(C1703s c1703s) {
        this.f8765j = c1703s;
    }

    private final void m9502a(float f) {
        if (this.f8765j != null) {
            this.f8765j.mo2412a(f);
        }
    }

    private final void m9505f() {
        m9503a(8);
        if (this.b.getChildCount() > 0) {
            this.b.getChildAt(0).setVisibility(0);
        }
    }

    private final void m9503a(int i) {
        int childCount = this.b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.b.getChildAt(i2).setVisibility(i);
        }
    }

    private final void m9504a(List list) {
        this.b.removeAllViews();
        for (View view : list) {
            view.setLayerType(2, null);
            this.b.addView(view, new LayoutParams(-1, -2));
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m9502a((1.0f - ((Float) this.f8764i.getAnimatedValue()).floatValue()) * ((float) (m9506g() - i2)));
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            return;
        }
        if (this.f8759d == 2 || this.f8759d == 5) {
            view.setOnFocusChangeListener(null);
            this.f8766k = false;
            this.f8759d = 6;
            m9503a(0);
            this.f8764i.setFloatValues(new float[]{0.0f, 1.0f});
            this.f8764i.setStartDelay(200);
            this.f8764i.setCurrentPlayTime(0);
            this.f8764i.start();
            ((EditText) view).setHint(this.f8767l);
            onAnimationUpdate(this.f8764i);
        }
    }

    private final int m9506g() {
        if (this.f8759d != 6 || this.b.getChildCount() <= 0) {
            return this.a.getMeasuredHeight();
        }
        return this.b.getChildAt(0).getHeight();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (i != 0 || this.f8759d != 6) {
                childAt.setAlpha(floatValue);
            }
            childAt.setY(((float) childAt.getTop()) * floatValue);
        }
        if (this.f8759d != 6 || this.b.getChildCount() <= 0) {
            this.a.setAlpha(1.0f - floatValue);
        } else {
            this.a.setAlpha(0.0f);
        }
        m9502a((1.0f - floatValue) * ((float) (m9506g() - getMeasuredHeight())));
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f8764i.setStartDelay(0);
        if (this.f8759d == 4) {
            this.f8759d = 1;
            this.a.setVisibility(4);
        } else if (this.f8759d == 5) {
            this.f8759d = 2;
            this.a.setVisibility(4);
        } else if (this.f8759d == 3) {
            this.f8759d = 0;
            m9503a(8);
        } else if (this.f8759d == 6) {
            this.f8759d = 1;
        }
        if (this.f8760e != null) {
            setFields(this.f8760e);
            this.f8760e = null;
        }
        if (this.f8761f && this.f8759d == 0 && this.f8761f) {
            this.f8761f = false;
            if (this.f8764i == this.f8762g) {
                this.f8764i = this.f8763h;
            } else {
                this.f8764i = this.f8762g;
            }
            mo2406c();
        }
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
