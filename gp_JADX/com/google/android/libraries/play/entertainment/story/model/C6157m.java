package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6127s;
import com.google.wireless.android.finsky.dfe.g.a.ai;

final class C6157m extends C6150g {
    C6157m() {
        super();
    }

    final C6161s mo5339a(SVGImageView sVGImageView, C6127s c6127s) {
        return new C6162q(sVGImageView, c6127s);
    }

    protected final /* synthetic */ void mo5337a(bb bbVar, C6164u c6164u, C6121g c6121g, C2980a c2980a, View view, View view2) {
        boolean z;
        boolean z2 = true;
        ao aoVar = (ao) bbVar;
        View view3 = (SVGImageView) c6121g.m28117a(SVGImageView.class, C6089g.playback_button);
        C6127s c6127s = c6164u.f30666a;
        ai aiVar = aoVar.n;
        if (aoVar.m28353b()) {
            z = false;
        } else {
            z = true;
        }
        if (view2 != view3) {
            z2 = false;
        }
        c6127s.mo5301a(aoVar, aiVar, view, z, view3, z2, c2980a);
    }

    final /* synthetic */ int mo5338c(bb bbVar) {
        if (((ao) bbVar).n == null) {
            return C6098k.pe__content_description_track;
        }
        return C6098k.pe__content_description_album;
    }
}
