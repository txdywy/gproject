package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6171o;

final class ak implements OnClickListener {
    public final /* synthetic */ C6121g f30577a;
    public final /* synthetic */ C6164u f30578b;

    ak(C6121g c6121g, C6164u c6164u) {
        this.f30577a = c6121g;
        this.f30578b = c6164u;
    }

    public final void onClick(View view) {
        C2980a c2980a = (C2980a) this.f30577a.m28117a(C2980a.class, C6089g.read_more_button_node);
        this.f30578b.f30666a.mo5300a(C6171o.m28490a(view.getContext(), (ai) this.f30577a.m28117a(ai.class, C6089g.panel_model), c2980a), c2980a);
    }
}
