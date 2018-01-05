package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.ad;
import java.util.List;

public abstract class C2624w extends ForegroundLinearLayout {
    public TextView f13920c;
    public TextView f13921d;
    public View f13922e;
    public final int f13923f;
    public final int f13924g;
    public boolean f13925h;
    public String f13926i;
    public LayoutInflater f13927j;
    public C3748a f13928k;
    public ad f13929l;

    public C2624w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13927j = LayoutInflater.from(context);
        Resources resources = context.getResources();
        this.f13923f = mo2987b(resources);
        this.f13924g = mo2984a(resources);
    }

    protected abstract int mo2984a(Resources resources);

    protected abstract View mo2985a(Object obj, Document document, ViewGroup viewGroup);

    protected abstract int mo2987b(Resources resources);

    protected abstract int getBucketRowLayout();

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13920c = getSectionTitleView();
        this.f13921d = getFooterView();
        this.f13922e = getFooterDividerView();
    }

    protected final void m13733a(List list, Document document, boolean z, C3748a c3748a, ad adVar) {
        int i;
        this.f13929l = adVar;
        this.f13928k = c3748a;
        this.f13926i = document.f14885a.f12096c;
        this.f13925h = true;
        int i2 = this.f13921d != null ? 1 : 0;
        if (i2 <= 0 || this.f13922e == null) {
            i = i2;
        } else {
            i = i2 + 1;
        }
        i2 = (this.f13920c != null ? 1 : 0) + i;
        if (getChildCount() > i2) {
            removeViews(1, getChildCount() - i2);
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        int min = Math.min(getMaxItemsToShow(), list.size());
        i2 = this.f13923f;
        int i3 = ((min + i2) - 1) / i2;
        for (int i4 = 0; i4 < i3; i4++) {
            BucketRowLayout bucketRowLayout = (BucketRowLayout) from.inflate(getBucketRowLayout(), this, false);
            bucketRowLayout.setSameChildHeight(true);
            for (int i5 = 0; i5 < this.f13923f; i5++) {
                int i6 = (this.f13923f * i4) + i5;
                if (i6 < min) {
                    bucketRowLayout.addView(mo2985a(list.get(i6), document, this));
                } else {
                    View view = new View(getContext());
                    view.setVisibility(4);
                    bucketRowLayout.addView(view);
                }
            }
            addView(bucketRowLayout, getChildCount() - i);
        }
        if (this.f13920c != null) {
            if (z) {
                this.f13920c.setText(getSectionTitleText());
                this.f13920c.setVisibility(0);
            } else {
                this.f13920c.setVisibility(8);
            }
        }
        if (this.f13921d == null) {
            return;
        }
        if (mo3009a(list)) {
            getContext();
            this.f13921d.setVisibility(0);
            this.f13921d.setText(getFooterText());
            this.f13921d.setTextColor(getResources().getColor(C1608h.m9241a(document.f14885a.f12099f)));
            if (this.f13922e != null) {
                this.f13922e.setVisibility(0);
                return;
            }
            return;
        }
        this.f13921d.setVisibility(8);
        if (this.f13922e != null) {
            this.f13922e.setVisibility(0);
        }
    }

    protected TextView getFooterView() {
        return null;
    }

    protected View getFooterDividerView() {
        return null;
    }

    protected TextView getSectionTitleView() {
        return null;
    }

    protected boolean mo3009a(List list) {
        return list.size() > getMaxItemsToShow();
    }

    public int getMaxItemsToShow() {
        return this.f13923f * this.f13924g;
    }

    protected String getFooterText() {
        return null;
    }

    protected String getSectionTitleText() {
        return null;
    }
}
