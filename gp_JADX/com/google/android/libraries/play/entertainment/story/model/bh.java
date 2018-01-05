package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;

final class bh extends bc {
    public static final ax f30632a = new bh();

    private bh() {
        super(C6091h.panel_trailer);
    }

    public final C6121g mo5335b(View view, C6164u c6164u) {
        return super.mo5335b(view, c6164u).m28128b(view, C6089g.trailer_title, TextView.class);
    }

    private final void m28425a(bg bgVar, C6121g c6121g, C2980a c2980a, C6164u c6164u) {
        super.mo5333a((bb) bgVar, c6121g, c2980a, c6164u);
        ax.m28360a(bgVar, c6121g, e, f, g, -1);
        c6121g.m28130b(bgVar.f30631a.d, C6089g.trailer_title);
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        return mo5335b(view, c6164u);
    }
}
