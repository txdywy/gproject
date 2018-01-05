package com.google.android.finsky.stream.controllers.taglinks.view;

import android.content.Context;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.stream.base.p143a.p144a.C4247c;
import java.util.List;

public final class C4498c extends C1137h {
    public final Context f22850c;
    public ad f22851d;
    public int f22852e;
    public C4247c f22853f;
    public List f22854g;

    public C4498c(Context context) {
        this.f22850c = context;
    }

    public final int mo1039a() {
        if (this.f22854g != null) {
            return this.f22854g.size();
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
        ((TagLinksBannerItemRectangularView) ((C1155g) frVar).a).m20975a((C4496a) this.f22854g.get(i), i, this.f22851d, this.f22853f);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C1155g(LayoutInflater.from(this.f22850c).inflate(this.f22852e, viewGroup, false));
    }
}
