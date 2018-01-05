package com.google.android.finsky.stream.controllers.quicklinks.view;

import android.content.Context;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.stream.base.p143a.p144a.C4246b;
import com.google.android.finsky.stream.base.p143a.p144a.C4247c;
import java.util.List;

public final class C4483c extends C1137h {
    public final Context f22782c;
    public ad f22783d;
    public int f22784e;
    public C4247c f22785f;
    public List f22786g;

    public C4483c(Context context) {
        this.f22782c = context;
    }

    public final int mo1039a() {
        if (this.f22786g != null) {
            return this.f22786g.size();
        }
        return 0;
    }

    public final /* synthetic */ void mo1132a(fr frVar) {
        View view = ((C1155g) frVar).a;
        if (view instanceof ae) {
            ((ae) view).Z_();
        }
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        ((QuickLinksBannerItemPillView) ((C1155g) frVar).a).mo4225a((C4246b) this.f22786g.get(i), i, this.f22783d, this.f22785f);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C1155g(LayoutInflater.from(this.f22782c).inflate(this.f22784e, viewGroup, false));
    }
}
