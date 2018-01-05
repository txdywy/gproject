package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class aj extends C0996o implements OnClickListener {
    public final C3748a f6053f;
    public final Document f6054g;

    aj(Context context, int i, C3748a c3748a, Document document, ad adVar, C2495w c2495w) {
        super(context, i, c2495w, adVar);
        this.f6053f = c3748a;
        this.f6054g = document;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6054g.f14885a.f12099f, this.a.getResources().getString(C7582R.string.more_info), this.f6053f.mo3625a((OnClickListener) this, this.f6054g));
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final int mo1200a() {
        return 2919;
    }

    public final void onClick(View view) {
        this.f6053f.mo3655a(this.f6054g, this.d, this.c);
    }
}
