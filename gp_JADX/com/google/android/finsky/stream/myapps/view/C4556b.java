package com.google.android.finsky.stream.myapps.view;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0054l;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.p029a.C0206f;
import android.view.View;
import android.widget.ImageView;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C4556b {
    public Integer f23298a;
    public Drawable f23299b;

    public final int m21179a(Resources resources) {
        if (this.f23298a == null) {
            this.f23298a = Integer.valueOf(resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin));
        }
        return this.f23298a.intValue();
    }

    public final void m21180a(Resources resources, ImageView imageView) {
        if (this.f23299b == null) {
            Drawable a = C0054l.m66a(resources, C7582R.drawable.play_card_view_action_button_close, null);
            if (a == null) {
                FinskyLog.m21669e("Couldn't parse vector drawable for close button", new Object[0]);
                return;
            }
            this.f23299b = C0259a.m1526e(a).mutate();
            C0259a.m1514a(this.f23299b, C0206f.m1066b(resources, C7582R.color.assist_card_dismiss_x_color, null));
        }
        imageView.setImageDrawable(this.f23299b);
    }

    public static void m21178a(C4542a c4542a, View view) {
        if (c4542a != null) {
            c4542a.mo4262a(view);
        }
    }
}
