package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class ac extends C0996o implements OnClickListener {
    public final Document f6025f;

    ac(Context context, int i, Document document, ad adVar, C2495w c2495w) {
        super(context, i, c2495w, adVar);
        this.f6025f = document;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6025f.f14885a.f12099f, this.a.getResources().getString(C7582R.string.enable), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        m5894c();
        this.a.getPackageManager().setApplicationEnabledSetting(this.f6025f.f14885a.f12096c, 1, 0);
    }

    public final int mo1200a() {
        return 220;
    }
}
