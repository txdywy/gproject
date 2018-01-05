package com.google.android.finsky.uninstall;

import android.content.Context;
import android.support.p011c.p012a.C0054l;
import android.support.v4.widget.bg;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.recyclerview.C1155g;
import com.squareup.leakcanary.C7582R;

final class bi extends C1155g {
    public final Context f23562t;
    public final View f23563u;
    public final TextView f23564v;
    public final TextView f23565w;
    public final PlayActionButtonV2 f23566x;
    public final TextView f23567y;

    public bi(View view, Context context) {
        super(view);
        this.f23562t = context;
        this.f23563u = view;
        this.f23564v = (TextView) view.findViewById(C7582R.id.header_title);
        this.f23565w = (TextView) view.findViewById(C7582R.id.header_subtitle);
        this.f23566x = (PlayActionButtonV2) view.findViewById(C7582R.id.header_action_button);
        this.f23567y = (TextView) view.findViewById(C7582R.id.header_sort_action);
        bg.m2222a(this.f23567y, null, null, C0054l.m66a(this.f23562t.getResources(), C7582R.drawable.sort_icon, null), null);
    }
}
