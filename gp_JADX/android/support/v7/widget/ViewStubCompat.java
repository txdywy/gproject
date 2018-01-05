package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    public int f3069a;
    public int f3070b;
    public WeakReference f3071c;
    public LayoutInflater f3072d;
    public ic f3073e;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3069a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.ViewStubCompat, i, 0);
        this.f3070b = obtainStyledAttributes.getResourceId(C0403j.ViewStubCompat_android_inflatedId, -1);
        this.f3069a = obtainStyledAttributes.getResourceId(C0403j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0403j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final int getInflatedId() {
        return this.f3070b;
    }

    public final void setInflatedId(int i) {
        this.f3070b = i;
    }

    public final int getLayoutResource() {
        return this.f3069a;
    }

    public final void setLayoutResource(int i) {
        this.f3069a = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3072d = layoutInflater;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.f3072d;
    }

    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    protected final void dispatchDraw(Canvas canvas) {
    }

    public final void setVisibility(int i) {
        if (this.f3071c != null) {
            View view = (View) this.f3071c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m3156a();
        }
    }

    public final View m3156a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f3069a != 0) {
            LayoutInflater layoutInflater;
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.f3072d != null) {
                layoutInflater = this.f3072d;
            } else {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f3069a, viewGroup, false);
            if (this.f3070b != -1) {
                inflate.setId(this.f3070b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f3071c = new WeakReference(inflate);
            if (this.f3073e != null) {
                this.f3073e.m3867a();
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setOnInflateListener(ic icVar) {
        this.f3073e = icVar;
    }
}
