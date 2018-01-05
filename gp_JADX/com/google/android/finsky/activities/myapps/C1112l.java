package com.google.android.finsky.activities.myapps;

import android.support.v7.widget.fr;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public final class C1112l extends fr {
    public TextView f7021t;
    public TextView f7022u;
    public RadioButton f7023v;

    public C1112l(View view) {
        super(view);
        this.f7021t = (TextView) view.findViewById(C7582R.id.title);
        this.f7022u = (TextView) view.findViewById(C7582R.id.subtitle);
        this.f7023v = (RadioButton) view.findViewById(C7582R.id.radio);
    }
}
