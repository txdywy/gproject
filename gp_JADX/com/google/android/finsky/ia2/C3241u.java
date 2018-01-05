package com.google.android.finsky.ia2;

import android.content.Context;
import android.support.v7.widget.ff;
import android.view.LayoutInflater;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ak;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.pagesystem.C1041g;
import com.google.android.finsky.pagesystem.C1044f;

final class C3241u {
    public final Context f16712a;
    public final C3748a f16713b;
    public final int f16714c;
    public final ah f16715d;
    public final LayoutInflater f16716e;
    public final C1254c f16717f;
    public final ff f16718g;
    public final FinskyHeaderListLayout f16719h;
    public final boolean f16720i;
    public final C2495w f16721j;
    public final ak f16722k;
    public final C1044f f16723l;
    public final al f16724m;
    public final C1041g f16725n;

    C3241u(Context context, C3748a c3748a, int i, ah ahVar, LayoutInflater layoutInflater, ff ffVar, FinskyHeaderListLayout finskyHeaderListLayout, boolean z, C1254c c1254c, C2495w c2495w, ak akVar, C1044f c1044f, al alVar, C1041g c1041g) {
        this.f16712a = context;
        this.f16713b = c3748a;
        this.f16714c = i;
        this.f16715d = ahVar;
        this.f16716e = layoutInflater;
        this.f16718g = ffVar;
        this.f16719h = finskyHeaderListLayout;
        this.f16720i = z;
        this.f16717f = c1254c;
        this.f16721j = c2495w;
        this.f16722k = akVar;
        this.f16723l = c1044f;
        this.f16724m = alVar;
        this.f16725n = c1041g;
    }

    C3241u(Context context, C3748a c3748a, int i, ah ahVar, LayoutInflater layoutInflater, ff ffVar, FinskyHeaderListLayout finskyHeaderListLayout, boolean z, C1254c c1254c, C2495w c2495w, C1044f c1044f, al alVar) {
        this(context, c3748a, i, ahVar, layoutInflater, ffVar, finskyHeaderListLayout, z, c1254c, c2495w, null, c1044f, alVar, null);
    }
}
