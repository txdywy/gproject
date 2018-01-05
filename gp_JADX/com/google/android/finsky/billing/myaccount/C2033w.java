package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.wireless.android.finsky.dfe.c.a.bb;

public final class C2033w extends C1137h {
    public static final Typeface f10485c = Typeface.create("sans-serif-medium", 0);
    public final Context f10486d;
    public final C1612l f10487e;
    public final C2495w f10488f;
    public final ad f10489g;
    public final int f10490h;
    public af f10491i;
    public ab[] f10492j = new ab[0];

    C2033w(Context context, C1612l c1612l, C2495w c2495w, ad adVar) {
        this.f10486d = context;
        this.f10487e = c1612l;
        this.f10488f = c2495w;
        this.f10489g = adVar;
        this.f10490h = FinskyHeaderListLayout.m16068a(context, 2, 0);
    }

    public final int mo1040a(int i) {
        return this.f10492j[i].f10176b;
    }

    public final int mo1039a() {
        return this.f10492j.length;
    }

    static void m10717a(ab abVar, ad adVar) {
        bb bbVar = abVar.f10175a.c;
        if (bbVar != null && bbVar.d()) {
            adVar.mo1219a(new C2473o(bbVar.b, bbVar.c, adVar));
        }
    }

    static void m10718a(ab abVar, ad adVar, C2495w c2495w) {
        bb bbVar = abVar.f10175a.c;
        if (bbVar != null && bbVar.d()) {
            c2495w.m13379b(new C2475d(adVar).m13256a(bbVar.b).m13258a(bbVar.c));
        }
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        if (c1155g instanceof ac) {
            ((ac) c1155g).mo2573a(this.f10492j[i], this.f10489g, this.f10488f);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.f10486d);
        switch (i) {
            case 0:
                return new C2036z(from, viewGroup, this.f10490h);
            case 1:
                return new C2034x(this, from, viewGroup);
            case 2:
                return new aa(viewGroup);
            default:
                throw new IllegalStateException("Unknown type in onCreateViewHolder " + i);
        }
    }
}
