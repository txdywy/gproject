package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.agera.am;
import com.google.android.libraries.play.entertainment.C6095j;

final class ax implements am {
    public final C0722q f30453a;
    public final C0722q f30454b;
    public final /* synthetic */ ar f30455c;

    public ax(ar arVar, Context context) {
        this.f30455c = arVar;
        this.f30453a = C0722q.m4784a(context, C6095j.ic_pause);
        this.f30454b = C0722q.m4784a(context, C6095j.ic_play);
    }

    public final void ad_() {
        SVGImageView sVGImageView = this.f30455c.f30412i.f30340y;
        int i = (this.f30455c.f30412i.f30309D == 2 && this.f30455c.f30414k.f30446i) ? 0 : 8;
        sVGImageView.setVisibility(i);
        this.f30455c.f30412i.f30340y.setSVG(this.f30455c.f30414k.m28286g() ? this.f30453a : this.f30454b);
    }
}
