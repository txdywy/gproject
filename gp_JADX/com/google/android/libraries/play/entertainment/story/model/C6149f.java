package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6126a;

final class C6149f implements OnClickListener {
    public final /* synthetic */ C6121g f30648a;
    public final /* synthetic */ C6164u f30649b;

    C6149f(C6121g c6121g, C6164u c6164u) {
        this.f30648a = c6121g;
        this.f30649b = c6164u;
    }

    public final void onClick(View view) {
        C6147d c6147d = (C6147d) this.f30648a.m28117a(C6147d.class, C6089g.panel_model);
        C2980a c2980a = (C2980a) this.f30648a.m28117a(C2980a.class, C6089g.read_more_button_node);
        switch (c6147d.f30645a.k) {
            case 1:
                this.f30649b.f30666a.mo5304a(c6147d.f30645a, c2980a);
                return;
            case 2:
                this.f30649b.f30666a.mo5300a(C6126a.m28193a(c6147d.f30645a.d, c2980a), c2980a);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }
}
