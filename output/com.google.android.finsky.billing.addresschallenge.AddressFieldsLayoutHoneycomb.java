package com.google.android.finsky.billing.addresschallenge;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ProgressBar;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;
import java.util.List;

public class AddressFieldsLayoutHoneycomb extends com.google.android.finsky.billing.addresschallenge.j implements Animator$AnimatorListener, ValueAnimator$AnimatorUpdateListener, View$OnFocusChangeListener
{

    public int d;
    public List e;
    public boolean f;
    public ValueAnimator g;
    public ValueAnimator h;
    public ValueAnimator i;
    public com.google.android.finsky.billing.addresschallenge.s j;
    public boolean k;
    public CharSequence l;

    AddressFieldsLayoutHoneycomb(Context p0) {
        AddressFieldsLayoutHoneycomb(p0, 0);
    }

    AddressFieldsLayoutHoneycomb(Context p0, AttributeSet p1) {
        AddressFieldsLayoutHoneycomb(p0, p1, 0);
    }

    AddressFieldsLayoutHoneycomb(Context p0, AttributeSet p1, int p2) {
        com.google.android.finsky.billing.addresschallenge.j(p0, p1, p2);
        this.d = 0;
        this.k = 1;
    }

    private final void a(float p0) {
        if (this.j != 0)
            this.j.a(p0);
    }

    private final void a(int p0) {
        v0 = 0;
        while (v0 < this.b.getChildCount()) {
            this.b.getChildAt(v0).setVisibility(p0);
            v0 = v0 + 1;
        }
    }

    private final void a(List p0) {
        this.b.removeAllViews();
        v1 = p0.iterator();
        while (v1.hasNext()) {
            v0 = (View)v1.next();
            v0.setLayerType(2, 0);
            this.b.addView(v0, new LinearLayout$LayoutParams(-1, -2));
        }
    }

    private final void f() {
        this.a(8);
        if (this.b.getChildCount() > 0)
            this.b.getChildAt(0).setVisibility(0);
    }

    private final int g() {
        if (this.d == 6 && this.b.getChildCount() > 0)
            v0 = this.b.getChildAt(0).getHeight();
        else
            v0 = this.a.getMeasuredHeight();
        return v0;
    }

    public final void a() {
        this.c.setVisibility(0);
        this.c.setAlpha(0);
        this.c.animate().alpha(1065353216);
    }

    public final void b() {
        this.c.animate().alpha(0).setListener(new com.google.android.finsky.billing.addresschallenge.k(this));
    }

    public final void c() {
        switch (this.d) {
            case 0:
                if (this.k != 0) {
                    this.f();
                    this.d = 5;
                }
                else {
                    this.a(0);
                    this.d = 4;
                }
                this.i.setFloatValues(new float[2]{0, 1065353216});
                this.i.start();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                this.f = 1;
                break;
            default:
                break;
        }
    }

    public final void d() {
        switch (this.d) {
            case 1:
                this.d = 3;
                this.a.setVisibility(0);
                this.i.setFloatValues(new float[2]{1065353216, 0});
                this.i.setStartDelay(200);
                this.i.setCurrentPlayTime(0);
                this.i.start();
                break;
            case 2:
                this.d = 3;
                this.a.setVisibility(0);
                this.i.setFloatValues(new float[2]{1065353216, 0});
                this.i.setStartDelay(200);
                this.i.setCurrentPlayTime(0);
                this.i.start();
                break;
            case 3:
                break;
            case 4:
                this.d = 3;
                this.i.reverse();
                break;
            case 5:
                this.d = 3;
                this.i.reverse();
                break;
            case 6:
                this.d = 3;
                this.i.reverse();
                break;
            default:
                break;
        }
    }

    public final void e() {
        this.k = 0;
        switch (this.d) {
            case 2:
                this.a(0);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                this.i.end();
                this.d = 1;
                this.a(0);
                break;
            default:
                break;
        }
    }

    public void onAnimationCancel(Animator p0) {
    }

    public void onAnimationEnd(Animator p0) {
        this.i.setStartDelay(0);
        if (this.d == 4) {
            this.d = 1;
            this.a.setVisibility(4);
        }
        else if (this.d == 5) {
            this.d = 2;
            this.a.setVisibility(4);
        }
        else if (this.d == 3) {
            this.d = 0;
            this.a(8);
        }
        else if (this.d == 6)
            this.d = 1;
        if (this.e != 0) {
            this.setFields(this.e);
            this.e = 0;
        }
        if (this.f != 0 && this.d == 0 && this.f != 0) {
            this.f = 0;
            if (this.i == this.g)
                this.i = this.h;
            else
                this.i = this.g;
            this.c();
        }
    }

    public void onAnimationRepeat(Animator p0) {
    }

    public void onAnimationStart(Animator p0) {
    }

    public void onAnimationUpdate(ValueAnimator p0) {
        v1 = ((Float)p0.getAnimatedValue()).floatValue();
        v0 = 0;
        while (v0 < this.b.getChildCount()) {
            v3 = this.b.getChildAt(v0);
            if (v0 != 0 || this.d != 6)
                v3.setAlpha(v1);
            v3.setY((float)v3.getTop() * v1);
            v0 = v0 + 1;
        }
        if (this.d == 6 && this.b.getChildCount() > 0)
            this.a.setAlpha(0);
        else
            this.a.setAlpha(1065353216 - v1);
        this.a((1065353216 - v1) * (float)(this.g() - this.getMeasuredHeight()));
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        v0 = new float[1];
        v0[0] = 0;
        this.g = ValueAnimator.ofFloat(v0);
        this.g.addUpdateListener(this);
        this.g.addListener(this);
        v0 = new float[1];
        v0[0] = 0;
        this.h = ValueAnimator.ofFloat(v0);
        this.h.addUpdateListener(this);
        this.h.addListener(this);
        this.i = this.g;
    }

    public void onFocusChange(View p0, boolean p1) {
        if (p1 != 0 && (this.d == 2 || this.d == 5)) {
            p0.setOnFocusChangeListener(0);
            this.k = 0;
            this.d = 6;
            this.a(0);
            this.i.setFloatValues(new float[2]{0, 1065353216});
            this.i.setStartDelay(200);
            this.i.setCurrentPlayTime(0);
            this.i.start();
            ((EditText)p0).setHint(this.l);
            this.onAnimationUpdate(this.i);
        }
    }

    protected void onRestoreInstanceState(Parcelable p0) {
        if (p0 instanceof Bundle) {
            this.k = ((Bundle)p0).getBoolean("support_showing_one_field");
            super.onRestoreInstanceState(((Bundle)p0).getParcelable("parent_instance_state"));
        }
        else
            super.onRestoreInstanceState(p0);
    }

    protected Parcelable onSaveInstanceState() {
        v0 = new Bundle();
        v0.putParcelable("parent_instance_state", super.onSaveInstanceState());
        v0.putBoolean("support_showing_one_field", this.k);
        return v0;
    }

    protected void onSizeChanged(int p0, int p1, int p2, int p3) {
        super.onSizeChanged(p0, p1, p2, p3);
        this.a((1065353216 - ((Float)this.i.getAnimatedValue()).floatValue()) * (float)(this.g() - p1));
    }

    public void setFields(List p0) {
        if (this.k != 0 && p0.size() > 1 && p0.get(0) instanceof EditText)
            v0 = 1;
        else
            v0 = 0;
        switch (this.d) {
            case 0:
                this.a(p0);
                this.a(8);
                break;
            case 1:
                this.a(p0);
                break;
            case 2:
                this.a(p0);
                this.f();
                break;
            case 3:
                this.e = p0;
                break;
            case 4:
                this.e = p0;
                break;
            case 5:
                this.e = p0;
                break;
            case 6:
                this.e = p0;
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.d);
                FinskyLog.e("enum %d", v1);
                break;
        }
        if (v0 != 0) {
            v0 = (EditText)p0.get(0);
            this.l = v0.getHint();
            v0.setHint(2131951670);
            v0.setOnFocusChangeListener(this);
        }
        else if (this.k != 0)
            this.k = 0;
    }

    public void setOnHeightOffsetChangedListener(com.google.android.finsky.billing.addresschallenge.s p0) {
        this.j = p0;
    }

}
