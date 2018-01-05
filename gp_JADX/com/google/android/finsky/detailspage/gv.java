package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.widget.bg;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.lk;
import com.squareup.leakcanary.C7582R;

final class gv extends em {
    public final Context f14655c;
    public final int f14656d = C1608h.m9243a(this.f14655c, 3);
    public lk[] f14657e;
    public int f14658f = this.f14655c.getResources().getDimensionPixelOffset(C7582R.dimen.vetted_app_feature_text_padding);

    public gv(Context context) {
        this.f14655c = context;
    }

    public final int mo1039a() {
        return this.f14657e != null ? this.f14657e.length : 0;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        gu guVar = (gu) frVar;
        lk lkVar = this.f14657e[i];
        if (lkVar != null) {
            guVar.f14652t.setText(lkVar.f13017c);
            guVar.f14653u.setText(lkVar.f13019e);
            guVar.f14652t.setVisibility(0);
            guVar.f14653u.setVisibility(0);
            guVar.f14654v.setPadding(this.f14658f, guVar.f14652t.getPaddingTop(), this.f14658f, guVar.f14652t.getPaddingBottom());
            return;
        }
        guVar.f14652t.setVisibility(8);
        guVar.f14653u.setVisibility(8);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        fr guVar = new gu(LayoutInflater.from(this.f14655c).inflate(C7582R.layout.vetted_app_features_item, viewGroup, false));
        Drawable e = C0259a.m1526e(C0216d.m1112a(this.f14655c, (int) C7582R.drawable.ic_thumb_up));
        C0259a.m1514a(e.mutate(), this.f14656d);
        bg.m2222a(guVar.f14653u, e, null, null, null);
        return guVar;
    }
}
