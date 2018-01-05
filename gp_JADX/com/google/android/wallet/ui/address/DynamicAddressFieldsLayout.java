package com.google.android.wallet.ui.address;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.ui.common.ci;
import java.util.ArrayList;

public class DynamicAddressFieldsLayout extends RelativeLayout implements AnimatorListener, AnimatorUpdateListener {
    public ValueAnimator f33084a;
    public ValueAnimator f33085b;
    public ValueAnimator f33086c;
    public int f33087d;
    public ArrayList f33088e;
    public boolean f33089f;
    public View f33090g;
    public RelativeLayout f33091h;
    public C6655w f33092i;
    public SparseBooleanArray f33093j;
    public final ArrayList f33094k;
    public final ArrayList f33095l;

    public DynamicAddressFieldsLayout(Context context) {
        this(context, null);
    }

    public DynamicAddressFieldsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicAddressFieldsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33087d = 1;
        this.f33094k = new ArrayList();
        this.f33095l = new ArrayList();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f33090g = ((ViewStub) findViewById(C6622f.progress_bar)).inflate();
        this.f33091h = (RelativeLayout) findViewById(C6622f.dynamic_address_fields_container);
        this.f33084a = ValueAnimator.ofFloat(new float[]{0.0f});
        this.f33084a.addUpdateListener(this);
        this.f33084a.addListener(this);
        this.f33085b = ValueAnimator.ofFloat(new float[]{0.0f});
        this.f33085b.addUpdateListener(this);
        this.f33085b.addListener(this);
        this.f33086c = this.f33084a;
    }

    public void setFields(ArrayList arrayList) {
        switch (this.f33087d) {
            case 1:
                m30370a(arrayList);
                setAddressFieldsVisibility(8);
                return;
            case 2:
                m30370a(arrayList);
                return;
            case 3:
            case 4:
                this.f33088e = arrayList;
                if (!this.f33094k.isEmpty()) {
                    this.f33094k.clear();
                    this.f33095l.clear();
                    return;
                }
                return;
            default:
                return;
        }
    }

    protected void setAddressFieldsVisibility(int i) {
        int childCount = this.f33091h.getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            View childAt = this.f33091h.getChildAt(i2);
            if (!this.f33093j.get(childAt.getId())) {
                childAt.setVisibility(i);
            }
        }
    }

    private final void m30370a(ArrayList arrayList) {
        this.f33091h.removeViews(1, this.f33091h.getChildCount() - 1);
        int size = arrayList.size();
        this.f33093j = new SparseBooleanArray(size);
        for (int i = 0; i < size; i++) {
            boolean z;
            View view = (View) arrayList.get(i);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (i > 0) {
                layoutParams.addRule(ci.m30835a(3), ((View) arrayList.get(i - 1)).getId());
            }
            SparseBooleanArray sparseBooleanArray = this.f33093j;
            int id = view.getId();
            if (view.getVisibility() != 0) {
                z = true;
            } else {
                z = false;
            }
            sparseBooleanArray.put(id, z);
            this.f33091h.addView(view, layoutParams);
        }
    }

    public final void m30372a(View view, View view2) {
        if (this.f33087d == 4 || this.f33087d == 3) {
            this.f33094k.add(view);
            this.f33095l.add(view2);
            return;
        }
        int indexOfChild = this.f33091h.indexOfChild(view);
        String valueOf;
        if (indexOfChild < 0) {
            valueOf = String.valueOf(view);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("oldView: ").append(valueOf).append(" is not present in the fields container").toString());
        } else if (this.f33091h.indexOfChild(view2) >= 0) {
            valueOf = String.valueOf(view2);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 52).append("newView: ").append(valueOf).append(" is already present in the fields container").toString());
        } else {
            if (indexOfChild > 1) {
                LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(ci.m30835a(3), this.f33091h.getChildAt(indexOfChild - 1).getId());
                view2.setLayoutParams(layoutParams);
                if (indexOfChild < this.f33091h.getChildCount() - 1) {
                    ((RelativeLayout.LayoutParams) this.f33091h.getChildAt(indexOfChild + 1).getLayoutParams()).addRule(ci.m30835a(3), view2.getId());
                }
            }
            this.f33091h.removeViewAt(indexOfChild);
            this.f33091h.addView(view2, indexOfChild);
        }
    }

    public final void m30371a() {
        switch (this.f33087d) {
            case 1:
                setAddressFieldsVisibility(0);
                this.f33087d = 4;
                this.f33086c.setFloatValues(new float[]{0.0f, 1.0f});
                this.f33086c.start();
                return;
            case 3:
                this.f33089f = true;
                return;
            default:
                return;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m30368a((1.0f - ((Float) this.f33086c.getAnimatedValue()).floatValue()) * ((float) (this.f33090g.getMeasuredHeight() - i2)));
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int childCount = this.f33091h.getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt = this.f33091h.getChildAt(i);
            childAt.setAlpha(floatValue);
            childAt.setY(((float) childAt.getTop()) * floatValue);
        }
        this.f33090g.setAlpha(1.0f - floatValue);
        m30368a((1.0f - floatValue) * ((float) (this.f33090g.getMeasuredHeight() - getMeasuredHeight())));
    }

    public void onAnimationStart(Animator animator) {
        m30369a(2);
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        m30369a(0);
        this.f33086c.setStartDelay(0);
        if (this.f33087d == 4) {
            this.f33087d = 2;
            int size = this.f33093j.size();
            int i2 = 0;
            for (i = 0; i < size; i++) {
                int i3;
                if (this.f33093j.valueAt(i)) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                i2 += i3;
            }
            this.f33090g.setVisibility(i2 == 0 ? 8 : 4);
        } else if (this.f33087d == 3) {
            this.f33087d = 1;
            setAddressFieldsVisibility(8);
        }
        if (this.f33088e != null) {
            setFields(this.f33088e);
            this.f33088e = null;
        }
        i = this.f33094k.size();
        for (int i4 = 0; i4 < i; i4++) {
            m30372a((View) this.f33094k.get(i4), (View) this.f33095l.get(i4));
        }
        this.f33094k.clear();
        this.f33095l.clear();
        if (this.f33089f && this.f33087d == 1) {
            this.f33089f = false;
            if (this.f33086c == this.f33084a) {
                this.f33086c = this.f33085b;
            } else {
                this.f33086c = this.f33084a;
            }
            m30371a();
        }
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    private final void m30368a(float f) {
        if (this.f33092i != null) {
            this.f33092i.mo5567a(f);
        }
    }

    private final void m30369a(int i) {
        int childCount = this.f33091h.getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            this.f33091h.getChildAt(i2).setLayerType(i, null);
        }
    }

    public void setOnHeightOffsetChangedListener(C6655w c6655w) {
        this.f33092i = c6655w;
    }
}
