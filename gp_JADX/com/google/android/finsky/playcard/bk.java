package com.google.android.finsky.playcard;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.d;

final class bk implements OnClickListener {
    public final /* synthetic */ C2495w f19654a;
    public final /* synthetic */ ad f19655b;
    public final /* synthetic */ boolean f19656c;
    public final /* synthetic */ Document f19657d;
    public final /* synthetic */ d f19658e;
    public final /* synthetic */ C3748a f19659f;
    public final /* synthetic */ C1254c f19660g;
    public final /* synthetic */ ao f19661h;

    bk(ao aoVar, C2495w c2495w, ad adVar, boolean z, Document document, d dVar, C3748a c3748a, C1254c c1254c) {
        this.f19661h = aoVar;
        this.f19654a = c2495w;
        this.f19655b = adVar;
        this.f19656c = z;
        this.f19657d = document;
        this.f19658e = dVar;
        this.f19659f = c3748a;
        this.f19660g = c1254c;
    }

    public final void onClick(View view) {
        int i;
        C2495w a = this.f19654a.m13368a(new C2475d(this.f19655b).m13256a(238));
        if (this.f19656c) {
            i = 205;
        } else {
            i = 204;
        }
        ao.m18498a(this.f19657d, !this.f19656c, this.f19658e);
        this.f19661h.m18505a(this.f19656c, this.f19657d, this.f19659f, this.f19658e, i, this.f19658e.getContext(), this.f19655b, this.f19660g, a);
    }
}
