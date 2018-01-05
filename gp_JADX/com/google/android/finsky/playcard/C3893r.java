package com.google.android.finsky.playcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.d;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.squareup.leakcanary.C7582R;

public abstract class C3893r extends d {
    public View f19347o;
    public C1503a f19348p;
    public C1461c f19349q;

    public C3893r(Context context) {
        this(context, null);
    }

    public C3893r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((ae) C3947d.m18649a(ae.class)).mo1889a(this);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.W = (TextView) findViewById(C7582R.id.li_ad_label_v2);
        this.f19347o = findViewById(C7582R.id.li_ad_label_container_v2);
        if (this.f19348p.f8184h && this.f19349q.dj().mo2294a(12638116)) {
            setForeground(getResources().getDrawable(C7582R.drawable.play_highlight_round_overlay_light_cros));
        }
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31325b;
    }

    public final void m18404a(int i, int i2, int i3, int i4) {
    }

    public final Drawable m18405c(boolean z) {
        int i;
        if (z) {
            i = C7582R.color.flat_overflow_menu_fill_color_dark_theme;
        } else if (this.f19349q.dj().mo2294a(12626522)) {
            i = C7582R.color.flat_overflow_menu_fill_color_dark;
        } else {
            i = C7582R.color.flat_overflow_menu_fill_color;
        }
        return C0722q.m4782a(getResources(), (int) C7582R.raw.ic_more_vert_black_24dp, new as().m4593b(C0216d.m1116c(getContext(), i)));
    }
}
