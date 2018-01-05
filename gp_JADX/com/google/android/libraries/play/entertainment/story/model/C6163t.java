package com.google.android.libraries.play.entertainment.story.model;

import com.caverock.androidsvg.SVGImageView;
import com.google.android.agera.C0893t;
import com.google.android.libraries.play.entertainment.story.C6127s;

final class C6163t extends C6161s {
    C6163t(SVGImageView sVGImageView, C6127s c6127s) {
        super(sVGImageView, c6127s);
    }

    final boolean mo5343a(bb bbVar) {
        return (bbVar instanceof bg) || (bbVar instanceof bn);
    }

    final C0893t mo5342a() {
        return this.d.mo5306b();
    }

    public final void ad_() {
        int i = 0;
        if (this.e != null) {
            int i2;
            if (this.d.mo5305a(this.e) && ((Integer) this.d.mo5306b().i_()).intValue() == 2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            SVGImageView sVGImageView = this.c;
            if (i2 != 0) {
                i = 8;
            }
            sVGImageView.setVisibility(i);
        }
    }
}
