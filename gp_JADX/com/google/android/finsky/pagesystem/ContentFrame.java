package com.google.android.finsky.pagesystem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.C0629a;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.squareup.leakcanary.C7582R;

public class ContentFrame extends InsetsFrameLayout {
    public ViewGroup f14025b;
    public final LayoutInflater f14026c;

    public ContentFrame(Context context) {
        this(context, null, 0);
    }

    public ContentFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14026c = (LayoutInflater) context.getSystemService("layout_inflater");
        View inflate = this.f14026c.inflate(getLoadingIndicatorLayoutResId(), this, false);
        inflate.setVisibility(8);
        addView(inflate);
        inflate = this.f14026c.inflate(getErrorIndicatorLayoutResId(), this, false);
        inflate.setVisibility(8);
        addView(inflate);
        this.f14026c.inflate(getErrorIndicatorLayoutWithNotifyResId(), this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.ContentFrame);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            addView(m13770a(this.f14026c, resourceId, resourceId2));
        }
    }

    public final ViewGroup m13770a(LayoutInflater layoutInflater, int i, int i2) {
        if (i == 0) {
            return null;
        }
        this.f14025b = (ViewGroup) layoutInflater.inflate(i, this, false);
        if (i2 != 0) {
            this.f14025b.setId(i2);
        }
        return this.f14025b;
    }

    public int getLoadingIndicatorLayoutResId() {
        return C7582R.layout.page_loading_indicator;
    }

    public int getErrorIndicatorLayoutResId() {
        return C7582R.layout.page_error_indicator;
    }

    protected int getErrorIndicatorLayoutWithNotifyResId() {
        return C7582R.layout.page_error_indicator_with_notify;
    }
}
