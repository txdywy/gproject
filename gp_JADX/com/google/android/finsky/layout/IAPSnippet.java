package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class IAPSnippet extends LinearLayout {
    public TextView f18241a;
    public TextView f18242b;
    public TextView f18243c;
    public View f18244d;

    public IAPSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18243c = (TextView) findViewById(C7582R.id.iap_index);
        this.f18241a = (TextView) findViewById(C7582R.id.iap_title);
        this.f18242b = (TextView) findViewById(C7582R.id.iap_price);
        this.f18244d = findViewById(C7582R.id.iap_divider);
    }
}
