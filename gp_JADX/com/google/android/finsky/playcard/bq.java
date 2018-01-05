package com.google.android.finsky.playcard;

import android.content.res.Resources;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dm.C2832a;
import com.google.android.play.layout.i;
import com.squareup.leakcanary.C7582R;

final class bq implements i {
    public final /* synthetic */ Resources f19688a;
    public final /* synthetic */ bl f19689b;

    bq(bl blVar, Resources resources) {
        this.f19689b = blVar;
        this.f19688a = resources;
    }

    public final void m18543a(int i) {
        String str;
        String string = this.f19688a.getString(C7582R.string.debug_info);
        Document document = this.f19689b.f19666e;
        if (document.m14613B()) {
            str = document.f14885a.f12093J;
        } else {
            str = "";
        }
        C2832a.m14981a(string, str, this.f19688a.getString(C7582R.string.close), this.f19688a.getString(C7582R.string.share)).m625a(this.f19689b.f19668g.mo3709k().f730B, "debugDialog");
    }
}
