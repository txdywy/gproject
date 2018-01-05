package com.google.android.finsky.activities.myapps;

import android.content.res.Resources;
import android.support.v4.app.cr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.adapters.t;
import com.google.android.finsky.api.m;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.frameworkviews.ErrorFooter;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.play.layout.PlayCardLabelView;
import com.google.android.play.layout.d;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.activities.myapps.a extends com.google.android.finsky.adapters.t implements AbsListView$RecyclerListener, com.google.android.finsky.activities.myapps.e
{

    public com.google.android.finsky.dfemodel.j a;
    public List b;
    public com.google.android.finsky.d.ad c;
    public final com.google.android.finsky.d.w d;
    public final int e;

    a(com.google.android.finsky.activities.b p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.finsky.d.ad p2, com.google.android.finsky.d.w p3) {
        com.google.android.finsky.adapters.t(p0, p1);
        this.b = new ArrayList();
        this.c = p2;
        this.d = p3;
        this.e = p0.getResources().getDimensionPixelSize(2131624900) + FinskyHeaderListLayout.a(p0, 0, 0);
    }

    public final Document a(int p0) {
        v0 = this.getItem(p0);
        if (v0 instanceof Document)
            v0 = (Document)v0;
        else
            v0 = 0;
        return v0;
    }

    protected final void a() {
        if (this.a != 0)
            this.a.q();
    }

    protected final String b() {
        return com.google.android.finsky.api.m.a(this.g, this.a.g());
    }

    protected final boolean c() {
        if (this.a != 0 && this.a.t != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final int getCount() {
        v0 = 0;
        if (this.a != 0) {
            v1 = this.b.size();
            if (this.c())
                v1 = v1 + 1;
            if (v1 != 0)
                v0 = v1 + 1;
        }
        return v0;
    }

    public final Object getItem(int p0) {
        if (p0 == 0)
            v0 = 0;
        else
            v0 = this.b.get(p0 - 1);
        return v0;
    }

    public final int getItemViewType(int p0) {
        v0 = 0;
        if (p0 == 0) {
            v0 = 3;
            return v0;
        }
        if (p0 != this.getCount() - 1)
            return v0;
        switch (this.i) {
            case 0:
                break;
            case 1:
                v0 = 1;
                break;
            case 2:
                v0 = 2;
                break;
            default:
                throw new IllegalStateException(36 + "No footer or item at row " + p0);
        }
    }

    public final View getView(int p0, View p1, ViewGroup p2) {
        switch (this.getItemViewType(p0)) {
            case 0:
                v2 = this.a(p0);
                if (v2 != 0) {
                }
                if (p1 == 0)
                    v11 = this.f.inflate(2130969225, p2, 0);
                else
                    v11 = p1;
                if (v2 == 0)
                    ((com.google.android.play.layout.d)v11).b();
                else {
                    ((PlayCardViewMyAppsV2)(com.google.android.play.layout.d)v11).ah = (PlayCardLabelView)((PlayCardViewMyAppsV2)(com.google.android.play.layout.d)v11).findViewById(2131755915);
                    com.google.android.finsky.m.a.cr().a((com.google.android.play.layout.d)v11, v2, "my_apps:early_access", this.h, this.c, -1, this.d);
                }
                if (this.getItemViewType(p0) == 0 && p0 != this.getCount() - 1)
                    v5 = 1;
                else
                    v5 = 0;
                ((PlayCardViewMyAppsV2)(com.google.android.play.layout.d)v11).a(5, v5, 0, 0, 0, 0, 0);
                ((com.google.android.play.layout.d)v11).setTag(v2);
                v0 = v11;
                break;
            case 1:
                if (p1 != 0)
                    v0 = p1;
                else
                    v0 = this.a(2130969082, p2);
                v0 = (LinearLayout)v0;
                break;
            case 2:
                if (p1 != 0)
                    v0 = p1;
                else
                    v0 = this.a(2130968823, p2);
                v0 = (ErrorFooter)v0;
                v0.a(this.b(), this);
                break;
            case 3:
                if (p1 == 0)
                    p1 = this.f.inflate(2130968970, p2, 0);
                p1.getLayoutParams().height = this.e;
                v0 = p1;
                break;
            default:
                throw new IllegalStateException(36 + "Unknown type for getView " + p0);
        }
        return v0;
    }

    public final int getViewTypeCount() {
        return 4;
    }

    public final void m_() {
        super.m_();
        this.b.clear();
        v1 = 0;
        while (v1 < this.a.m()) {
            v0 = (Document)this.a.a(v1, 1);
            if (v0.N() != 0) {
                if (com.google.android.finsky.m.a.L().a(v0.N().k) != 0)
                    this.b.add(v0);
            }
            v1 = v1 + 1;
        }
    }

    public final void onMovedToScrapHeap(View p0) {
        if (p0 instanceof com.google.android.play.layout.d)
            com.google.android.finsky.playcard.ao.b((com.google.android.play.layout.d)p0);
    }

}
