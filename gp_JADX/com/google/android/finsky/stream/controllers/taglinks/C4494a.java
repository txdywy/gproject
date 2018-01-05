package com.google.android.finsky.stream.controllers.taglinks;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.kl;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.p143a.p144a.C4246b;
import com.google.android.finsky.stream.base.p143a.p144a.C4247c;
import com.google.android.finsky.stream.controllers.taglinks.view.C4496a;
import com.google.android.finsky.stream.controllers.taglinks.view.C4497b;
import com.google.android.finsky.stream.controllers.taglinks.view.C4498c;
import com.google.android.finsky.stream.controllers.taglinks.view.TagLinksBannerRecyclerView;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C4494a extends C4250b implements C4247c {
    public final ab f22837a;
    public C4497b f22838b;

    public C4494a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, ab abVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22837a = abVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document[] b = this.g.f14908a.m14643b();
        C4497b c4497b = new C4497b();
        c4497b.f22849b = new ArrayList();
        c4497b.f22848a = this.g.f14908a.f14885a.f12087D;
        for (Document document : b) {
            boolean z;
            List list = c4497b.f22849b;
            C4496a c4496a = new C4496a();
            c4496a.f22846a = new C4246b();
            c4496a.f22846a.f21479a = document.f14885a.f12100g;
            c4496a.f22846a.f21480b = document.f14885a.f12099f;
            c4496a.f22846a.f21482d = C1600a.m9198a(document);
            c4496a.f22846a.f21481c = document.f14885a.f12087D;
            C2440m c2440m = document.f14885a.f12115v;
            if (c2440m == null || c2440m.f13111R == null) {
                z = false;
            } else {
                kl klVar = c2440m.f13111R;
                z = ((klVar.f12891a & 1) != 0 ? 1 : null) != null && klVar.f12892b;
            }
            c4496a.f22847b = z;
            list.add(c4496a);
        }
        this.f22838b = c4497b;
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_taglinks_recycler_view;
    }

    public final void mo1510a(View view, int i) {
        Bundle bundle = this.D != null ? ((C4495b) this.D).f22839a : null;
        TagLinksBannerRecyclerView tagLinksBannerRecyclerView = (TagLinksBannerRecyclerView) view;
        C4497b c4497b = this.f22838b;
        ad adVar = this.h;
        tagLinksBannerRecyclerView.m19714a(c4497b.f22848a, adVar);
        if (tagLinksBannerRecyclerView.getAdapter() == null) {
            tagLinksBannerRecyclerView.aO = new C4498c(tagLinksBannerRecyclerView.getContext());
            tagLinksBannerRecyclerView.setAdapter(tagLinksBannerRecyclerView.aO);
        } else {
            tagLinksBannerRecyclerView.aO = (C4498c) tagLinksBannerRecyclerView.getAdapter();
        }
        C4498c c4498c = tagLinksBannerRecyclerView.aO;
        List arrayList = new ArrayList(c4497b.f22849b);
        c4498c.f22852e = C7582R.layout.flat_taglinks_banner_item;
        c4498c.f22851d = adVar;
        c4498c.f22853f = this;
        c4498c.f22854g = arrayList;
        tagLinksBannerRecyclerView.aO.f3433a.m3638b();
        tagLinksBannerRecyclerView.aJ = bundle;
    }

    public final void mo1511b(View view, int i) {
        if (this.D == null) {
            this.D = new C4495b();
            ((C4495b) this.D).f22839a = new Bundle();
        }
        ((C4495b) this.D).f22839a.clear();
        TagLinksBannerRecyclerView tagLinksBannerRecyclerView = (TagLinksBannerRecyclerView) view;
        tagLinksBannerRecyclerView.m19713a(((C4495b) this.D).f22839a);
        tagLinksBannerRecyclerView.Z_();
    }

    public final void mo4224a(int i, ad adVar) {
        if (i >= 0 && i < this.g.f14908a.m14638a()) {
            Document a = this.g.f14908a.m14641a(i);
            this.f.mo3643a(a.m14657l().f12324d, a.f14885a.f12100g, a.f14885a.f12099f, this.f22837a.dn(), adVar, 6, this.i);
        }
    }
}
