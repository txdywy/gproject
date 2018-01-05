package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.p198f.C3027b;
import com.squareup.leakcanary.C7582R;

public final class as extends C0996o implements OnClickListener {
    public final Document f6090f;
    public final C3026a f6091g;
    public final String f6092h = this.f6090f.m14625N().f13171k;
    public final Fragment f6093i;
    public final C2233o f6094j;
    public final C3300k f6095k;

    as(Context context, int i, Document document, ad adVar, Fragment fragment, C2495w c2495w, C3027b c3027b, C2233o c2233o, C3300k c3300k) {
        super(context, i, c2495w, adVar);
        this.f6090f = document;
        this.f6093i = fragment;
        this.f6091g = c3027b.m15626a(this.f6092h);
        this.f6094j = c2233o;
        this.f6095k = c3300k;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6090f.f14885a.f12099f, this.a.getResources().getString(C7582R.string.uninstall), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        boolean a = this.f6094j.m11650a(this.f6092h);
        m5894c();
        at.m5929a(this.f6092h, this.f6093i, this.f6091g.f15822j, this.f6091g.f15821i, a);
    }

    public final int mo1200a() {
        return 215;
    }
}
