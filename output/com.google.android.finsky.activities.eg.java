package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.jf;
import com.google.android.finsky.d.o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.m;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.d;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.play.layout.d;

public final class com.google.android.finsky.activities.eg implements com.google.android.finsky.dfemodel.w
{

    public final com.google.android.finsky.activities.ef a;

    eg(com.google.android.finsky.activities.ef p0) {
        this.a = p0;
    }

    public final void m_() {
        v11 = Math.min(this.a.aj.m(), 3);
        if (v11 == 0)
            return;
        v13 = new com.google.android.finsky.d.o(400, this.a.aj.a.a.D, this.a);
        v14 = LayoutInflater.from(this.a.bn);
        v7 = (ViewGroup)this.a.b(2131756075);
        v7.removeAllViews();
        v6 = (PlayCardClusterViewHeader)v14.inflate(2130969215, v7, 0);
        v0 = this.a.bn.getResources().getDimensionPixelSize(2131624631);
        android.support.v4.view.ai.a(v6, v0, 0, v0, 0);
        if (TextUtils.isEmpty(this.a.ai.c))
            v8 = this.a.aj.a.a.g;
        else
            v8 = this.a.ai.c;
        if (this.a.aj.c())
            v1 = this.a.aj.a.a.f;
        else
            v1 = 0;
        v6.a(v1, v8, 0, this.a.ag.ct().a(this.a.bn, this.a.aj.a, 3, this.a.ai.f, 1), new com.google.android.finsky.activities.eh(this.a, v8, v13));
        v7.addView(v6);
        v9 = 0;
        while (v9 < v11) {
            v8 = (ViewGroup)v14.inflate(2130968667, v7, 0);
            v8.setPadding(0, 0, 0, 0);
            v1 = (com.google.android.play.layout.d)v14.inflate(2130969242, v8, 0);
            com.google.android.finsky.m.a.cr().a(v1, (Document)this.a.aj.a(v9, 1), this.a.aj.a.a.c, this.a.bp, v13, this.a.bw);
            v8.addView(v1);
            v7.addView(v8);
            v9 = v9 + 1;
        }
        v7.requestLayout();
    }

}
