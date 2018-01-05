package com.google.android.finsky.verifier.impl;

import android.support.design.widget.C0138g;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.utils.C4671b;
import com.squareup.leakcanary.C7582R;

final class da extends C0138g {
    public ProgressBar f24575k;
    public ImageView f24576l;
    public ImageView f24577m;
    public TextView f24578n;

    da(LinearLayout linearLayout, View view) {
        super(linearLayout, view, new db());
        this.f24575k = (ProgressBar) view.findViewById(C7582R.id.loading_spinner);
        if (C4671b.m21787d()) {
            this.f24575k.setIndeterminateDrawable(this.f658d.getDrawable(C7582R.drawable.play_protect_spinner_white_animation));
        }
        this.f24576l = (ImageView) view.findViewById(C7582R.id.verified);
        this.f24577m = (ImageView) view.findViewById(C7582R.id.offline);
        this.f24578n = (TextView) view.findViewById(C7582R.id.scanning_bar_text);
        this.f661g = -2;
    }
}
