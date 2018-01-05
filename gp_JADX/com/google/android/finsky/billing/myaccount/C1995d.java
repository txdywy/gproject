package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.billing.myaccount.layout.AccountSimpleRowView;
import com.google.android.finsky.billing.myaccount.layout.C2014c;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import java.util.ArrayList;
import java.util.List;

public abstract class C1995d extends C1137h {
    public final List f10163i = new ArrayList();
    public final C2495w f10164j;
    public final Bundle f10165k;
    public final ad f10166l;
    public final Context f10167m;
    public final LayoutInflater f10168n;

    public C1995d(Context context, Bundle bundle, ad adVar, C2495w c2495w) {
        this.f10167m = context;
        this.f10168n = LayoutInflater.from(context);
        this.f10165k = bundle;
        this.f10166l = adVar;
        this.f10164j = c2495w;
    }

    public abstract void mo2571a(View view, int i, int i2);

    public abstract int mo2572e(int i);

    public final int mo1040a(int i) {
        return ((Integer) this.f10163i.get(i)).intValue();
    }

    public final int mo1039a() {
        return this.f10163i.size();
    }

    protected final C2014c m10556a(OnClickListener onClickListener, int i, int i2, int i3, int i4) {
        C2014c c2014c = new C2014c();
        c2014c.f10408a = i;
        c2014c.f10412e = i2;
        c2014c.f10414g = i3;
        c2014c.f10418k = i4;
        c2014c.f10416i = onClickListener;
        c2014c.f10417j = this.f10166l;
        m10561a(c2014c);
        return c2014c;
    }

    public final void m10560a(View view, OnClickListener onClickListener, int i, int i2, int i3, int i4) {
        ((AccountSimpleRowView) view).m10688a(m10556a(onClickListener, i, i2, i3, i4), this.f10164j);
    }

    public final void m10561a(C2014c c2014c) {
        String valueOf = String.valueOf("SeenLandingRow_");
        String valueOf2 = String.valueOf(String.valueOf(c2014c.f10418k));
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        c2014c.f10415h = Boolean.valueOf(this.f10165k.getBoolean(valueOf2));
        this.f10165k.putBoolean(valueOf2, true);
    }

    public final void m10558a(View view) {
        view.getLayoutParams().height = FinskyHeaderListLayout.m16068a(this.f10167m, 2, 0);
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        mo2571a(c1155g.a, c1155g.f3216f, i);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C1155g(this.f10168n.inflate(mo2572e(i), viewGroup, false));
    }
}
