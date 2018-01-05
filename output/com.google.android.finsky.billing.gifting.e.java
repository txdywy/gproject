package com.google.android.finsky.billing.gifting;

import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v7.widget.fr;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.recyclerview.h;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.nano.ds;
import java.util.ArrayList;

public final class com.google.android.finsky.billing.gifting.e extends com.google.android.finsky.recyclerview.h
{

    public final Resources c;
    public final LayoutInflater d;
    public final com.google.android.finsky.billing.gifting.i e;
    public final com.google.android.finsky.d.ad f;
    public final com.google.android.finsky.d.w g;
    public final com.google.wireless.android.finsky.dfe.nano.ds h;
    public final ArrayList i;
    public final int j;
    public final int k;
    public final int l;
    public final com.google.android.finsky.bg.k m;

    e(Resources p0, LayoutInflater p1, com.google.android.finsky.billing.gifting.i p2, com.google.android.finsky.d.ad p3, com.google.wireless.android.finsky.dfe.nano.ds p4, int p5, int p6, com.google.android.finsky.d.w p7, com.google.android.finsky.bg.k p8) {
        v0 = 0;
        com.google.android.finsky.recyclerview.h();
        this.i = new ArrayList();
        this.c = p0;
        this.d = p1;
        this.e = p2;
        this.f = p3;
        this.g = p7;
        this.h = p4;
        this.j = p5;
        this.k = p6;
        this.i.add(Integer.valueOf(0));
        while (v0 < this.k) {
            this.i.add(Integer.valueOf(1));
            v0 = v0 + 1;
        }
        this.i.add(Integer.valueOf(2));
        this.l = this.i.indexOf(Integer.valueOf(1));
        this.m = p8;
    }

    public final int a() {
        return this.i.size();
    }

    public final int a(int p0) {
        return ((Integer)this.i.get(p0)).intValue();
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        switch (p1) {
            case 0:
                v1 = this.d.inflate(2130969247, p0, 0);
                v1.setId(2131755083);
                break;
            case 1:
                v1 = this.d.inflate(2130969248, p0, 0);
                v2 = this.m.a(this.c);
                ((PlayCreditGiftingRow)v1).c = this.j;
                ((PlayCreditGiftingRow)v1).d = new FifeImageView[this.j];
                ((PlayCreditGiftingRow)v1).e = new TextView[this.j];
                android.support.v4.view.ai.a((PlayCreditGiftingRow)v1, v2, 0, v2, 0);
                ((PlayCreditGiftingRow)v1).removeAllViews();
                v3 = 0;
                while (v3 < this.j) {
                    v7 = this.d.inflate(2130969245, (PlayCreditGiftingRow)v1, 0);
                    ((PlayCreditGiftingRow)v1).addView(v7);
                    ((PlayCreditGiftingRow)v1).d[v3] = (FifeImageView)v7.findViewById(2131755258);
                    ((PlayCreditGiftingRow)v1).e[v3] = (TextView)v7.findViewById(2131755851);
                    v3 = v3 + 1;
                }
                break;
            case 2:
                v1 = this.d.inflate(2130969246, p0, 0);
                break;
            default:
                throw new IllegalStateException(47 + "Unknown type for onCreateViewHolder " + p1);
        }
        return new com.google.android.finsky.recyclerview.g(v1);
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        switch (((com.google.android.finsky.recyclerview.g)p0).f) {
            case 0:
                v0 = (PlayCreditGiftingHeader)((com.google.android.finsky.recyclerview.g)p0).a;
                v0.c.setText(this.h.b);
                v0.d.setText(Html.fromHtml(this.h.c));
                v0.e.setOnLoadedListener(v0);
                v0.a.a(v0.e, this.h.d.f, this.h.d.i);
                break;
            case 1:
                v0 = (PlayCreditGiftingRow)((com.google.android.finsky.recyclerview.g)p0).a;
                v0.b = this.e;
                v2 = v0.c * (p1 - this.l);
                v1 = 0;
                while (v1 < v0.c) {
                    v8 = v0.getChildAt(v1);
                    if (v2 < this.h.f.length) {
                        v0.a.a(v0.d[v1], this.h.f[v2].p[0].f, this.h.f[v2].p[0].i);
                        v0.e[v1].setText(this.h.f[v2].n[0].g);
                        v9 = new com.google.android.finsky.d.o(500, this.h.f[v2].D, this.f);
                        v9.a();
                        v8.setOnClickListener(new com.google.android.finsky.billing.gifting.h(v0, this.h.f[v2], this.g, v9));
                        v2 = v2 + 1;
                    }
                    else
                        v8.setVisibility(4);
                    v1 = v1 + 1;
                }
                if (!(p1 - this.l)) {
                    v1 = new LinearLayout$LayoutParams(-1, -2);
                    v1.setMargins(0, v0.getResources().getDimensionPixelOffset(2131625120), 0, 0);
                    v0.setLayoutParams(v1);
                }
                break;
            case 2:
                ((PlayCreditGiftingFooter)((com.google.android.finsky.recyclerview.g)p0).a).setText(Html.fromHtml(this.h.e));
                ((PlayCreditGiftingFooter)((com.google.android.finsky.recyclerview.g)p0).a).setMovementMethod(LinkMovementMethod.getInstance());
                break;
            default:
                throw new IllegalStateException(45 + "Unknown type for onBindViewHolder " + ((com.google.android.finsky.recyclerview.g)p0).f);
        }
    }

}
