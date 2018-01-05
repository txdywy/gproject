package com.google.android.finsky.permissionui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

final class C3877c implements OnClickListener {
    public final /* synthetic */ TextView f19295a;
    public final /* synthetic */ ImageView f19296b;
    public final /* synthetic */ C3875a f19297c;

    C3877c(C3875a c3875a, TextView textView, ImageView imageView) {
        this.f19297c = c3875a;
        this.f19295a = textView;
        this.f19296b = imageView;
    }

    public final void onClick(View view) {
        if (this.f19295a.getVisibility() == 8) {
            this.f19296b.setImageResource(C7582R.drawable.ic_menu_expander_maximized_light);
            this.f19296b.setContentDescription(this.f19297c.f19288d.getString(C7582R.string.content_description_toggle_collapse));
            this.f19295a.setVisibility(0);
            return;
        }
        this.f19296b.setImageResource(C7582R.drawable.ic_menu_expander_minimized_light);
        this.f19296b.setContentDescription(this.f19297c.f19288d.getString(C7582R.string.content_description_toggle_expand));
        this.f19295a.setVisibility(8);
    }
}
