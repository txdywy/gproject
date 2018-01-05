package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.be;

final class ah implements OnClickListener {
    public final /* synthetic */ C6121g f30571a;
    public final /* synthetic */ C6164u f30572b;

    ah(C6121g c6121g, C6164u c6164u) {
        this.f30571a = c6121g;
        this.f30572b = c6164u;
    }

    public final void onClick(View view) {
        this.f30572b.f30666a.mo5300a(be.m28307b((af) this.f30571a.m28117a(af.class, C6089g.panel_model)), (C2980a) this.f30571a.m28117a(C2980a.class, C6089g.read_more_button_node));
    }
}
