package com.google.android.finsky.ia2;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.wireless.android.finsky.dfe.nano.z;
import com.squareup.leakcanary.C7582R;

final class C3245z extends em {
    public final Context f16733c;
    public z[] f16734d;
    public int f16735e;
    public int f16736f;
    public int f16737g;
    public String f16738h;
    public C3223k f16739i;
    public final /* synthetic */ Ia2SubNavView f16740j;

    C3245z(Ia2SubNavView ia2SubNavView, Context context, C3223k c3223k) {
        this.f16740j = ia2SubNavView;
        this.f16733c = context;
        this.f16739i = c3223k;
    }

    public final int mo1039a() {
        return this.f16734d != null ? this.f16734d.length : 0;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C3244y c3244y = (C3244y) frVar;
        z zVar = this.f16734d[i];
        Ia2SubNavItemView ia2SubNavItemView = (Ia2SubNavItemView) c3244y.a;
        int i2 = this.f16740j.f16566f;
        C3223k c3223k = this.f16739i;
        int i3 = this.f16735e == i ? 1 : 0;
        int i4 = this.f16736f;
        int i5 = this.f16737g;
        if (zVar != null) {
            ia2SubNavItemView.f16560e = i2;
            ia2SubNavItemView.f16559d = c3223k;
            ia2SubNavItemView.f16558c = i;
            ia2SubNavItemView.f16556a.setText(zVar.c);
            C1473m.f7980a.ar().m9287a(ia2SubNavItemView.f16557b, zVar.d, -1);
            String string = ia2SubNavItemView.getResources().getString(C1608h.m9252b(i4, i5));
            CharSequence string2 = ia2SubNavItemView.getResources().getString(C7582R.string.content_description_item_subtitle, new Object[]{string, zVar.c});
            if (i3 != 0) {
                i3 = C1608h.m9243a(ia2SubNavItemView.getContext(), i4);
                ia2SubNavItemView.f16556a.setTextColor(i3);
                ia2SubNavItemView.f16557b.setColorFilter(i3);
                ia2SubNavItemView.setContentDescription(ia2SubNavItemView.getResources().getString(C7582R.string.accessibility_event_tab_selected, new Object[]{string2}));
            } else {
                ia2SubNavItemView.f16556a.setTextColor(C0216d.m1116c(ia2SubNavItemView.getContext(), C7582R.color.play_primary_text_v2));
                ia2SubNavItemView.f16557b.setColorFilter(C0216d.m1116c(ia2SubNavItemView.getContext(), C7582R.color.play_icon_default));
                ia2SubNavItemView.setContentDescription(string2);
            }
            ia2SubNavItemView.f16556a.setVisibility(0);
            ia2SubNavItemView.f16557b.setVisibility(0);
            return;
        }
        ia2SubNavItemView.f16556a.setVisibility(8);
        ia2SubNavItemView.f16557b.setVisibility(8);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C3244y(LayoutInflater.from(this.f16733c).inflate(C7582R.layout.ia2_subnav_item, viewGroup, false));
    }
}
