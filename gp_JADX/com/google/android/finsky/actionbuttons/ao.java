package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class ao extends C0996o implements OnClickListener {
    public final C3748a f6069f;
    public final Document f6070g;
    public final C2454a f6071h;
    public final C2457d f6072i;

    ao(Context context, int i, C3748a c3748a, Document document, ad adVar, C2454a c2454a, C2495w c2495w, C2457d c2457d) {
        super(context, i, c2495w, adVar);
        this.f6069f = c3748a;
        this.f6070g = document;
        this.f6071h = c2454a;
        this.f6072i = c2457d;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        String str;
        int i = this.f6070g.f14885a.f12099f;
        if (this.f6071h == null) {
            str = "";
        } else {
            C2458e c2458e = new C2458e();
            if (this.a.getResources().getBoolean(C7582R.bool.use_wide_layout)) {
                this.f6072i.m13159b(this.f6071h, this.f6070g.f14885a.f12099f, c2458e);
            } else {
                this.f6072i.m13156a(this.f6071h, this.f6070g.f14885a.f12099f, c2458e);
            }
            str = c2458e.m13160a(this.a);
        }
        playActionButtonV2.mo2588a(i, str, this.f6069f.mo3625a((OnClickListener) this, this.f6070g));
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final int mo1200a() {
        return C1013j.m5980a(this.f6071h, this.f6070g.f14885a.f12099f);
    }

    public final void onClick(View view) {
        this.f6069f.mo3655a(this.f6070g, this.d, this.c);
    }
}
