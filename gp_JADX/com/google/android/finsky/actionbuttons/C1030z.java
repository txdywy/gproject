package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class C1030z extends C0996o implements OnClickListener {
    public final Document f6290f;
    public final Fragment f6291g;

    C1030z(Context context, int i, Document document, ad adVar, Fragment fragment, C2495w c2495w) {
        super(context, i, c2495w, adVar);
        this.f6290f = document;
        this.f6291g = fragment;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6290f.f14885a.f12099f, this.a.getResources().getString(C7582R.string.deactivate), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        ab abVar = this.f6291g.f730B;
        if (abVar.mo283a("deactivate_dialog") == null) {
            m5894c();
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.deactivate_device_admin_msg).m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(abVar, "deactivate_dialog");
        }
    }

    public final int mo1200a() {
        return 216;
    }
}
