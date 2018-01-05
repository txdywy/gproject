package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class C1027w extends C0996o implements OnClickListener {
    public final Document f6283f;
    public final C3340g f6284g;

    C1027w(Context context, int i, Document document, ad adVar, C2495w c2495w, C3340g c3340g) {
        super(context, i, c2495w, adVar);
        this.f6283f = document;
        this.f6284g = c3340g;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.m6000a(this.f6283f.f14885a.f12099f, (int) C7582R.string.cancel_download_now, (OnClickListener) this);
        m5893b();
    }

    public final void onClick(View view) {
        m5894c();
        this.f6284g.m16742a(this.f6283f.m14625N().f13171k).mo4398a(C4831h.f25111a);
    }

    public final int mo1200a() {
        return 2917;
    }
}
