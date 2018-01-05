package com.google.android.libraries.play.entertainment.story.model;

import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.agera.C0893t;
import com.google.android.agera.am;
import com.google.android.libraries.play.entertainment.story.C6127s;

abstract class C6161s implements am {
    public static C0722q f30660a;
    public static C0722q f30661b;
    public final SVGImageView f30662c;
    public final C6127s f30663d;
    public bb f30664e;
    public C0893t f30665f;

    C6161s(SVGImageView sVGImageView, C6127s c6127s) {
        this.f30662c = sVGImageView;
        this.f30663d = c6127s;
    }

    abstract C0893t mo5342a();

    abstract boolean mo5343a(bb bbVar);

    final void m28473b() {
        if (this.f30665f != null) {
            this.f30665f.mo1145b(this);
            this.f30665f = null;
        }
        this.f30664e = null;
    }
}
