package com.google.android.libraries.play.entertainment.story.model;

import android.content.Context;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.agera.C0893t;
import com.google.android.libraries.play.entertainment.C6095j;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.story.C6127s;

final class C6162q extends C6161s {
    C6162q(SVGImageView sVGImageView, C6127s c6127s) {
        super(sVGImageView, c6127s);
    }

    final boolean mo5343a(bb bbVar) {
        return bbVar instanceof ao;
    }

    final C0893t mo5342a() {
        return this.d.mo5297a();
    }

    public final void ad_() {
        if (this.e != null) {
            C0722q c0722q;
            int i;
            boolean a = this.d.mo5305a(this.e);
            Context context = this.c.getContext();
            if (a) {
                if (C6161s.f30660a == null) {
                    C6161s.f30660a = C0722q.m4784a(context, C6095j.ic_pause);
                }
                c0722q = C6161s.f30660a;
            } else {
                if (C6161s.f30661b == null) {
                    C6161s.f30661b = C0722q.m4784a(context, C6095j.ic_play);
                }
                c0722q = C6161s.f30661b;
            }
            if (a) {
                i = C6098k.pe__content_description_pause;
            } else {
                i = C6098k.pe__content_description_play;
            }
            CharSequence string = context.getString(i);
            this.c.setVisibility(0);
            this.c.setSVG(c0722q);
            this.c.setContentDescription(string);
        }
    }
}
