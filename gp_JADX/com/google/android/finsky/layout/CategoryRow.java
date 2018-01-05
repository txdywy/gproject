package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class CategoryRow extends LinearLayout implements ad, C2625e {
    public TextView f18094a;
    public FifeImageView f18095b;
    public ce f18096c;
    public ad f18097d;
    public int[] f18098e;

    public CategoryRow(Context context) {
        this(context, null);
    }

    public CategoryRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18096c = C2482j.m13283a(100);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18094a = (TextView) findViewById(C7582R.id.category_item_title);
        this.f18095b = (FifeImageView) findViewById(C7582R.id.category_item_image);
        this.f18098e = new int[]{5, 0};
    }

    public ce getPlayStoreUiElement() {
        return this.f18096c;
    }

    public ad getParentNode() {
        return this.f18097d;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
