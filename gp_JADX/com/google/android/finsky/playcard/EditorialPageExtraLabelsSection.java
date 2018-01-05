package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class EditorialPageExtraLabelsSection extends LinearLayout {
    public ViewGroup f19331a;
    public ViewGroup f19332b;
    public LayoutInflater f19333c;

    public EditorialPageExtraLabelsSection(Context context) {
        this(context, null);
    }

    public EditorialPageExtraLabelsSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19333c = LayoutInflater.from(context);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19331a = (ViewGroup) findViewById(C7582R.id.extra_labels_bottom_leading);
        this.f19332b = (ViewGroup) findViewById(C7582R.id.extra_labels_bottom_trailing);
    }

    static void m18393a(ViewGroup viewGroup, int i) {
        while (viewGroup.getChildCount() > i) {
            viewGroup.removeView(viewGroup.getChildAt(0));
        }
    }

    final void m18395b(ViewGroup viewGroup, int i) {
        while (viewGroup.getChildCount() < i) {
            viewGroup.addView(this.f19333c.inflate(C7582R.layout.details_summary_extra_label_bottom, viewGroup, false));
        }
    }

    static void m18394a(String[] strArr, int i, ViewGroup viewGroup) {
        for (int i2 = 0; i2 < i; i2++) {
            ((TextView) viewGroup.getChildAt(i2)).setText(strArr[i2]);
        }
    }
}
