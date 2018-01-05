package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.squareup.leakcanary.C7582R;

public class VerticallyStackedModuleLayout extends CardClusterModuleLayout {
    public ViewGroup f14199e;
    public TextView f14200f;
    public final int f14201g = getPaddingTop();

    public VerticallyStackedModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        this.f14199e = (ViewGroup) findViewById(C7582R.id.bucket_parent);
        super.onFinishInflate();
        this.f14200f = (TextView) findViewById(C7582R.id.footer_more);
        if (C1473m.f7980a.av().m9286k(getResources())) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f14199e.getLayoutParams();
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.leftMargin = 0;
        }
    }

    protected final int mo3014a(Resources resources) {
        return C7582R.layout.play_card_verically_stacked;
    }

    protected final int mo3016b(Resources resources) {
        return 1;
    }

    protected ViewGroup getBucketParent() {
        return this.f14199e;
    }

    public final void mo3015a(C1158a c1158a, int i, String str, String str2, String str3, int i2, OnClickListener onClickListener) {
        super.mo3015a(c1158a, i, str, str2, str3, i2, onClickListener);
        if (TextUtils.isEmpty(str3)) {
            this.f14200f.setVisibility(8);
            this.f14199e.setPadding(0, this.f14201g, 0, this.f14201g);
            return;
        }
        this.f14200f.setVisibility(0);
        this.f14200f.setText(str3.toUpperCase());
        this.f14200f.setOnClickListener(onClickListener);
        this.f14200f.setTextColor(getResources().getColor(C1608h.m9256d(i)));
        this.f14199e.setPadding(0, this.f14201g, 0, 0);
        if (this.f14200f != this.f14199e.getChildAt(this.f14199e.getChildCount() - 1)) {
            this.f14199e.removeView(this.f14200f);
            this.f14199e.addView(this.f14200f);
        }
    }
}
