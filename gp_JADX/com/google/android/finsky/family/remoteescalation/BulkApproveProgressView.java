package com.google.android.finsky.family.remoteescalation;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.at.C1516l;
import com.squareup.leakcanary.C7582R;

public class BulkApproveProgressView extends LinearLayout implements C1516l {
    public ProgressBar f15979a;
    public TextView f15980b;

    public BulkApproveProgressView(Context context) {
        super(context);
    }

    public BulkApproveProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BulkApproveProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15979a = (ProgressBar) findViewById(C7582R.id.progress_bar);
        this.f15980b = (TextView) findViewById(C7582R.id.message);
    }

    public final void mo3298a(Bundle bundle) {
        this.f15979a.setMax(bundle.getInt("max"));
    }

    public Bundle getResult() {
        return null;
    }

    public void setText(String str) {
        this.f15980b.setText(str);
    }
}
