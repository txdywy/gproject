package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class DetailsSummaryExtraLabelsSection extends LinearLayout {
    public ViewGroup f13698a;
    public ViewGroup f13699b;
    public LayoutInflater f13700c;

    public DetailsSummaryExtraLabelsSection(Context context) {
        this(context, null);
    }

    public DetailsSummaryExtraLabelsSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13700c = LayoutInflater.from(context);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13698a = (ViewGroup) findViewById(C7582R.id.extra_labels_bottom_leading);
        this.f13699b = (ViewGroup) findViewById(C7582R.id.extra_labels_bottom_trailing);
    }

    public static void m13577a(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(C7582R.layout.details_summary_extra_label_bottom, viewGroup, false);
        textView.setText(charSequence);
        viewGroup.addView(textView);
    }
}
