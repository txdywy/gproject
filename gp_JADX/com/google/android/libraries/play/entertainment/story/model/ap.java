package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;

final class ap extends bc {
    public static final ax f30587a = new ap();
    public static final int[] f30588b = new int[]{C6089g.subtitle};

    private ap() {
        super(C6091h.panel_music);
    }

    public final C6121g mo5335b(View view, C6164u c6164u) {
        return super.mo5335b(view, c6164u).m28116a(view, C6089g.subtitle, TextView.class);
    }

    private final void m28390a(ao aoVar, C6121g c6121g, C2980a c2980a, C6164u c6164u) {
        super.mo5333a((bb) aoVar, c6121g, c2980a, c6164u);
        ax.m28360a(aoVar, c6121g, e, f, f30588b, -1);
        c6121g.m28130b(aoVar.f30582a, C6089g.subtitle);
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        return mo5335b(view, c6164u);
    }
}
