package com.google.android.finsky.family.library;

import android.content.res.Resources;
import android.support.v7.p045f.C0443j;
import android.support.v7.p045f.C0445b;
import android.support.v7.p045f.C0447d;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.family.p199a.C3031a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C3058i extends C3031a {
    public final OnClickListener f15931c;
    public final C2495w f15932d;
    public final ad f15933e;
    public final int f15934f;
    public String f15935g;
    public List f15936h = new ArrayList();

    public C3058i(Resources resources, int i, OnClickListener onClickListener, C2495w c2495w, ad adVar, int i2) {
        super(resources);
        this.f15935g = resources.getString(i);
        this.f15931c = onClickListener;
        this.f15932d = c2495w;
        this.f15933e = adVar;
        this.f15934f = i2;
    }

    public final int mo1508a() {
        if (this.f15936h.size() == 0) {
            return 0;
        }
        return this.f15936h.size() + 1;
    }

    public final int mo1509a(int i) {
        if ((i == 0 ? 1 : null) != null) {
            return C7582R.layout.family_list_text;
        }
        return C7582R.layout.family_library_card_flat;
    }

    public final void mo1510a(View view, int i) {
        super.mo1510a(view, i);
        if ((i == 0 ? 1 : 0) != 0) {
            ((TextView) view.findViewById(C7582R.id.text)).setText(C1473m.f7980a.f7981b.getResources().getString(C7582R.string.family_library_filter_title, new Object[]{this.f15935g, Integer.valueOf(this.f15936h.size())}));
            return;
        }
        d dVar = (d) view;
        Document document = (Document) this.f15936h.get(i - 1);
        C1473m.f7980a.cr().m18518a(dVar, document, null, null, this.f15933e, this.f15932d);
        dVar.setTag(document);
        dVar.setOnClickListener(this.f15931c);
    }

    public final void mo1511b(View view, int i) {
    }

    final void m15727a(List list) {
        C0447d c3059j = new C3059j(this, this.f15936h, mo1508a());
        this.f15936h = list;
        C0445b.m2665a(c3059j).m2678a((C0443j) this);
    }
}
