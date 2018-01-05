package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.view.r;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.volley.a.q;
import com.google.a.a.a.a.b.a.b.a.aj;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6620d;

public final class ce extends LinearLayout implements OnClickListener, OnFocusChangeListener, C6756y {
    public aj f33624a;
    public cf f33625b;
    public boolean f33626c;
    public View f33627d;
    public ImageWithCaptionView f33628e;
    public int f33629f;
    public int f33630g = -1;
    public int f33631h = -1;

    public ce(Context context) {
        super(context, null);
    }

    public final void addView(View view) {
        throw new UnsupportedOperationException("Do not directly add views to TooltipUiFieldView.");
    }

    public final void m30834a(View view, aj ajVar, q qVar) {
        if (this.f33627d != null) {
            throw new IllegalStateException("setContent should only be called once.");
        } else if ((view instanceof TextView) || (view instanceof CheckboxView)) {
            this.f33627d = view;
            super.addView(view);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.width == -1) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            view.setLayoutParams(layoutParams);
            this.f33627d.setOnFocusChangeListener(this);
            this.f33624a = ajVar;
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6617a.uicFormTooltipIconSize, C6617a.uicClickableBackground, C6617a.internalUicNonFormFieldTextStartMargin});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            this.f33629f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            this.f33628e = new ImageWithCaptionView(getContext());
            ViewGroup.LayoutParams layoutParams2 = new LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams2.gravity = 17;
            r.a(layoutParams2, getResources().getDimensionPixelSize(C6620d.wallet_uic_icon_margin));
            r.b(layoutParams2, this.f33629f);
            addView(this.f33628e, layoutParams2);
            this.f33628e.setDefaultImageResId(ci.m30838a(getContext(), 104, -1));
            this.f33628e.m30637a(ajVar.a, qVar, ((Boolean) C6489e.f32495a.a()).booleanValue());
            this.f33628e.setBackgroundResource(resourceId);
            m30833a(false);
            this.f33628e.setOnClickListener(this);
        } else {
            throw new IllegalArgumentException("Tooltips are only supported for text, checkbox and date UI fields.");
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.f33630g || i6 != this.f33631h) {
            this.f33630g = i5;
            this.f33631h = i6;
            Rect rect = new Rect();
            rect.top = 0;
            rect.bottom = getHeight();
            if (this.f33627d.getLeft() < this.f33628e.getLeft()) {
                rect.left = this.f33627d.getRight();
                rect.right = getWidth();
            } else {
                rect.left = 0;
                rect.right = this.f33627d.getLeft();
            }
            setTouchDelegate(new TouchDelegate(rect, this.f33628e));
        }
    }

    public final View getInnerFieldView() {
        return this.f33627d;
    }

    public final void setIconHiddenWhenUnfocused(boolean z) {
        this.f33626c = z;
        if (this.f33627d != null) {
            m30833a(false);
        }
    }

    public final void setOnTooltipIconClickListener(cf cfVar) {
        this.f33625b = cfVar;
    }

    private final void m30833a(boolean z) {
        boolean z2 = !this.f33626c || this.f33627d.hasFocus();
        int i = z2 ? 0 : 4;
        if (this.f33628e.getVisibility() != i) {
            if (!z) {
                this.f33628e.setVisibility(i);
            } else if (z2) {
                ci.m30855a(this.f33628e, 0);
            } else {
                ci.m30876b(this.f33628e, 0, 0);
            }
            this.f33628e.setClickable(z2);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f33627d != null) {
            this.f33627d.setEnabled(z);
        }
        this.f33628e.setEnabled(z);
    }

    public final void onClick(View view) {
        if (view == this.f33628e && this.f33625b != null) {
            this.f33625b.mo5518a(this.f33624a);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f33627d) {
            m30833a(true);
        }
    }
}
