package com.google.android.libraries.play.entertainment.story;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p347g.C6088a;
import com.google.wireless.android.finsky.dfe.g.a.ai;

final class C6173q implements OnClickListener {
    public final /* synthetic */ C2980a f30686a;
    public final /* synthetic */ ai f30687b;

    C6173q(C2980a c2980a, ai aiVar) {
        this.f30686a = c2980a;
        this.f30687b = aiVar;
    }

    public final void onClick(View view) {
        C6088a.m28049W().m15515r().mo3231b(this.f30686a);
        C6088a.m28049W().m15517t().mo3269c(view, this.f30687b);
    }
}
