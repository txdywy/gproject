package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.wireless.android.finsky.dfe.g.a.ai;

final class bd implements OnClickListener {
    public final C6164u f30628a;
    public final C6121g f30629b;

    bd(C6164u c6164u, C6121g c6121g) {
        this.f30628a = c6164u;
        this.f30629b = c6121g;
    }

    public final void onClick(View view) {
        bb bbVar = (bb) this.f30629b.m28117a(bb.class, C6089g.panel_model);
        C6150g a = C6150g.m28444a(bbVar);
        C6164u c6164u = this.f30628a;
        C6121g c6121g = this.f30629b;
        C2980a c2980a = (C2980a) c6121g.m28117a(C2980a.class, C6089g.panel_node);
        View view2 = (View) c6121g.m28117a(View.class, C6089g.image_media);
        if (bbVar.s == 1) {
            c6164u.f30668c.mo3231b(c2980a);
            c6164u.f30667b.mo3259a(view2, (ai) C6116b.m28100a(bbVar.n), c2980a);
            return;
        }
        a.mo5337a(bbVar, c6164u, c6121g, c2980a, view2, view);
    }
}
