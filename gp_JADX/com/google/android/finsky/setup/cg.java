package com.google.android.finsky.setup;

import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

final class cg {
    public static final int[] f20918a = new int[]{C7582R.string.setup_wizard_ellipse_single, C7582R.string.setup_wizard_ellipse_double, C7582R.string.setup_wizard_ellipse_triple};
    public TextView f20919b;
    public int f20920c = 0;
    public boolean f20921d = false;
    public Runnable f20922e = new ch(this);

    public cg(TextView textView) {
        this.f20919b = textView;
    }
}
