package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;

final class ba extends bc {
    public static final ax f30627a = new ba();

    private ba() {
        super(C6091h.panel_related_tv_show);
    }

    public final C6121g mo5335b(View view, C6164u c6164u) {
        return super.mo5335b(view, c6164u).m28128b(view, C6089g.broadcaster, TextView.class);
    }

    private final void m28418a(bk bkVar, C6121g c6121g, C2980a c2980a, C6164u c6164u) {
        super.mo5333a((bb) bkVar, c6121g, c2980a, c6164u);
        ax.m28360a(bkVar, c6121g, e, f, g, -1);
        c6121g.m28130b(bkVar.b.g, C6089g.broadcaster);
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        return mo5335b(view, c6164u);
    }
}
