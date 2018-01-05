package com.google.android.finsky.verifier.impl;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.squareup.leakcanary.C7582R;

final class ad implements OnClickListener {
    public final /* synthetic */ View f24378a;
    public final /* synthetic */ ImageView f24379b;

    ad(View view, ImageView imageView) {
        this.f24378a = view;
        this.f24379b = imageView;
    }

    public final void onClick(View view) {
        if (this.f24378a.getVisibility() != 0) {
            this.f24378a.setVisibility(0);
            this.f24379b.setImageResource(C7582R.drawable.ic_menu_expander_maximized_light);
            return;
        }
        this.f24378a.setVisibility(8);
        this.f24379b.setImageResource(C7582R.drawable.ic_menu_expander_minimized_light);
    }
}
