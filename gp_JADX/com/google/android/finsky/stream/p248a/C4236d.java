package com.google.android.finsky.stream.p248a;

import android.content.Context;
import android.provider.SearchRecentSuggestions;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ff;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2724o;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C1114y;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C1472b;
import com.google.android.finsky.stream.base.C4279n;
import com.google.wireless.android.finsky.dfe.nano.ag;

public final class C4236d {
    public final C0988c f21426a;
    public final C4229a f21427b;
    public final C1472b f21428c;
    public final C4225f f21429d;
    public final C2721l f21430e;
    public final C1461c f21431f;
    public final C1556d f21432g;
    public final SearchRecentSuggestions f21433h;
    public final C2116a f21434i;
    public final C4237g f21435j;

    public C4236d(C0988c c0988c, C4229a c4229a, C1472b c1472b, C4225f c4225f, C2721l c2721l, C1461c c1461c, C1556d c1556d, SearchRecentSuggestions searchRecentSuggestions, C2116a c2116a, C4237g c4237g) {
        this.f21426a = c0988c;
        this.f21427b = c4229a;
        this.f21428c = c1472b;
        this.f21430e = c2721l;
        this.f21431f = c1461c;
        this.f21432g = c1556d;
        this.f21433h = searchRecentSuggestions;
        this.f21429d = c4225f;
        this.f21434i = c2116a;
        this.f21435j = c4237g;
    }

    public final C4234b m19665a(C2730u c2730u, C4279n c4279n, RecyclerView recyclerView, Context context, C3748a c3748a, ad adVar, C2495w c2495w, int i, ag[] agVarArr, ah ahVar, C2724o c2724o, boolean z, C2720j c2720j, boolean z2, boolean z3, C1114y c1114y, ff ffVar, boolean z4) {
        return new C4234b(this.f21428c.mo2246h(this.f21426a.cZ()), this, c2730u, c4279n, recyclerView, context, c3748a, adVar, c2495w, i, agVarArr, ahVar, c2724o, z, c2720j, z4, z2, z3, c1114y, ffVar, this.f21427b, this.f21432g, this.f21429d.mo4025a(context), this.f21431f, this.f21433h, this.f21434i, this.f21435j);
    }
}
