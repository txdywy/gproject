package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.squareup.leakcanary.C7582R;

public class WarningMessageSection extends LinearLayout implements C2621k, C2622l {
    public TextView f18422a;
    public TextView f18423b;
    public ImageView f18424c;

    public WarningMessageSection(Context context) {
        super(context);
    }

    public WarningMessageSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18422a = (TextView) findViewById(C7582R.id.details_warning_info_first_line);
        this.f18423b = (TextView) findViewById(C7582R.id.details_warning_info_second_line);
        this.f18424c = (ImageView) findViewById(C7582R.id.details_warning_info_icon);
    }
}
