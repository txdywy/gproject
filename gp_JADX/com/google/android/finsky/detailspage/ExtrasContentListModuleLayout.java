package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.layout.ExtrasItemSnippet;
import com.google.android.finsky.layout.aj;
import com.squareup.leakcanary.C7582R;

public class ExtrasContentListModuleLayout extends LinearLayout implements aj {
    public boolean f14004a;
    public View f14005b;
    public TextView f14006c;
    public TextView f14007d;
    public cg f14008e;

    public ExtrasContentListModuleLayout(Context context) {
        super(context);
    }

    public ExtrasContentListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtrasContentListModuleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14005b = findViewById(C7582R.id.extras_item_header);
        this.f14006c = (TextView) findViewById(C7582R.id.extras_item_list_title);
        this.f14007d = (TextView) findViewById(C7582R.id.extras_item_list_subtitle);
    }

    public final void mo3003a(ExtrasItemSnippet extrasItemSnippet) {
        int childCount = getChildCount();
        for (int i = 1; i < childCount; i++) {
            ExtrasItemSnippet extrasItemSnippet2 = (ExtrasItemSnippet) getChildAt(i);
            if (!(extrasItemSnippet2 == extrasItemSnippet || extrasItemSnippet2.f18194e == null)) {
                extrasItemSnippet2.f18194e.setVisibility(8);
            }
        }
        if (extrasItemSnippet.m17306b()) {
            this.f14008e.mo3065b(extrasItemSnippet.getDocument());
        } else {
            this.f14008e.mo3065b(null);
        }
    }
}
