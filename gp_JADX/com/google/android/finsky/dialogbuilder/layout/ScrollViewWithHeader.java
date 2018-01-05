package com.google.android.finsky.dialogbuilder.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.squareup.leakcanary.C7582R;

public class ScrollViewWithHeader extends LinearLayout {
    public final ViewGroup f15147a;
    public final ViewGroup f15148b;

    public ScrollViewWithHeader(Context context) {
        this(context, null);
    }

    public ScrollViewWithHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = inflate(context, C7582R.layout.scrollview_with_header, this);
        this.f15147a = (ViewGroup) inflate.findViewById(C7582R.id.header);
        this.f15148b = (ViewGroup) inflate.findViewById(C7582R.id.content);
    }

    public void addView(View view) {
        this.f15148b.addView(view);
    }

    public void removeAllViews() {
        this.f15147a.removeAllViews();
        this.f15148b.removeAllViews();
    }
}
