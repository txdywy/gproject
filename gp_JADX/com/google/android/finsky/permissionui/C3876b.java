package com.google.android.finsky.permissionui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

final class C3876b implements OnClickListener {
    public final /* synthetic */ View f19290a;
    public final /* synthetic */ ImageView f19291b;
    public final /* synthetic */ ViewGroup f19292c;
    public final /* synthetic */ TextView f19293d;
    public final /* synthetic */ C3875a f19294e;

    C3876b(C3875a c3875a, View view, ImageView imageView, ViewGroup viewGroup, TextView textView) {
        this.f19294e = c3875a;
        this.f19290a = view;
        this.f19291b = imageView;
        this.f19292c = viewGroup;
        this.f19293d = textView;
    }

    public final void onClick(View view) {
        boolean booleanValue = ((Boolean) this.f19290a.getTag()).booleanValue();
        if (booleanValue) {
            this.f19291b.setImageResource(C7582R.drawable.ic_menu_expander_minimized_light);
            this.f19291b.setContentDescription(this.f19294e.f19288d.getString(C7582R.string.content_description_toggle_expand));
            this.f19292c.setVisibility(8);
            this.f19293d.setVisibility(0);
        } else {
            this.f19291b.setImageResource(C7582R.drawable.ic_menu_expander_maximized_light);
            this.f19291b.setContentDescription(this.f19294e.f19288d.getString(C7582R.string.content_description_toggle_collapse));
            this.f19292c.setVisibility(0);
            this.f19293d.setVisibility(8);
        }
        View view2 = this.f19290a;
        if (booleanValue) {
            booleanValue = false;
        } else {
            booleanValue = true;
        }
        view2.setTag(Boolean.valueOf(booleanValue));
    }
}
