package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.controllers.view.FlatCardCreatorAvatarClusterView;
import com.squareup.leakcanary.C7582R;

public final class C4484r extends C4302k {
    public final int f22787t;
    public Document f22788u;

    public C4484r(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, ao aoVar, C4254d c4254d, boolean z, ac acVar) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w, afVar, aoVar, c4254d, z, acVar);
        this.f22787t = acVar.m18478a(false);
    }

    protected final int mo4099b() {
        return this.f22787t;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_card_creator_avatar_cluster;
    }

    public final void mo1510a(View view, int i) {
        bd bdVar;
        bd bdVar2 = null;
        super.mo1510a(view, i);
        Document document = this.g.f14908a;
        FlatCardCreatorAvatarClusterView flatCardCreatorAvatarClusterView = (FlatCardCreatorAvatarClusterView) view;
        Document k = mo4229k();
        String str = document.f14885a.f12100g;
        String string = this.e.getString(C7582R.string.more);
        if (k.m14647d(14)) {
            bdVar = (bd) k.m14644c(14).get(0);
        } else {
            bdVar = null;
        }
        if (bdVar == null) {
            if (k.m14647d(2)) {
                bdVar = (bd) k.m14644c(2).get(0);
            } else {
                bdVar = null;
            }
        }
        if (k.m14647d(4)) {
            bdVar2 = (bd) k.m14644c(4).get(0);
        }
        flatCardCreatorAvatarClusterView.m20998a(bdVar, bdVar2, str, string, this.f.mo3625a(new C4485s(this, flatCardCreatorAvatarClusterView), k));
    }

    protected final boolean mo4101d() {
        return true;
    }

    final Document mo4229k() {
        if (this.f22788u == null) {
            this.f22788u = new Document(this.g.f14908a.aB().f12363a);
        }
        return this.f22788u;
    }
}
