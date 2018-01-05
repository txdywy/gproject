package com.google.android.finsky.instantapps.p220f;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.instantapps.common.p219f.C3474b;
import com.squareup.leakcanary.C7582R;

final class C3483j extends C3474b {
    public final ImageView f17683t;
    public final TextView f17684u;
    public final ImageView f17685v;

    C3483j(View view) {
        super(view);
        this.f17683t = (ImageView) view.findViewById(C7582R.id.icon_view);
        this.f17684u = (TextView) view.findViewById(C7582R.id.aia_excluded_app_title);
        this.f17685v = (ImageView) view.findViewById(C7582R.id.aia_excluded_app_remove);
    }
}
