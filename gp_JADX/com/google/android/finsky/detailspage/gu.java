package com.google.android.finsky.detailspage;

import android.support.v7.widget.fr;
import android.view.View;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

final class gu extends fr {
    public TextView f14652t;
    public TextView f14653u;
    public View f14654v;

    public gu(View view) {
        super(view);
        this.f14654v = view;
        this.f14652t = (TextView) view.findViewById(C7582R.id.feature_title);
        this.f14653u = (TextView) view.findViewById(C7582R.id.aggregate_value);
    }
}
