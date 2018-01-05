package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.adapters.t;
import com.google.android.finsky.api.c;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.by.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.installer.b.a.e;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.layout.play.PlayListView;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.utils.ac;
import com.google.android.play.b.o;

public final class com.google.android.finsky.activities.myapps.b extends com.google.android.finsky.activities.myapps.m
{

    public final com.google.android.finsky.by.a a;
    public ViewGroup b;
    public final com.google.android.finsky.activities.myapps.a c;
    public com.google.android.finsky.utils.ac d;
    public PlayListView e;
    public boolean f;

    b(com.google.android.finsky.activities.b p0, com.google.android.finsky.api.c p1, DfeToc p2, com.google.android.finsky.navigationmanager.a p3, com.google.android.finsky.by.a p4, com.google.android.finsky.d.ad p5, com.google.android.finsky.d.w p6) {
        com.google.android.finsky.activities.myapps.m(p0, p1, p2, p3, p6);
        this.d = com.google.android.finsky.utils.ac.a;
        this.a = p4;
        this.c = new com.google.android.finsky.activities.myapps.a(p0, p3, p5, p6);
    }

    public final View a() {
        if (this.b == 0)
            this.b = (ViewGroup)this.h.inflate(2130969103, 0);
        return this.b;
    }

    protected final Document a(View p0) {
        return (Document)p0.getTag();
    }

    public final void a(com.google.android.finsky.by.a p0) {
    }

    public final void a(com.google.android.finsky.installqueue.m p0) {
        if (p0.c.d == 6 || p0.c.d == 8) {
            this.c.m_();
            this.c.notifyDataSetChanged();
        }
    }

    public final void a(com.google.android.finsky.utils.ac p0) {
        if (p0 != 0)
            this.d = p0;
    }

    public final com.google.android.finsky.utils.ac b() {
        v1 = new com.google.android.finsky.utils.ac();
        if (this.n != 0 && ((com.google.android.finsky.dfemodel.j)this.n).a())
            v1.a("MyAppsEarlyAccessTab.ListData", this.n);
        if (this.e != 0)
            v1.a("MyAppsEarlyAccessTab.KeyListParcel", this.e.onSaveInstanceState());
        super.b();
        return v1;
    }

    protected final com.google.android.finsky.activities.myapps.e d() {
        return this.c;
    }

    protected final View e() {
        return this.b;
    }

    protected final ListView f() {
        return this.e;
    }

    protected final void g() {
  1:    this.j();
 17:    v1 = this.i.a(3, "u-tpl", 1, this.a.f("u-tpl"));
 23:    if (this.d == 0) goto 92;
 33:    if (!this.d.a("MyAppsEarlyAccessTab.ListData")) goto 92;
 43:    v0 = (com.google.android.finsky.dfemodel.j)this.d.b("MyAppsEarlyAccessTab.ListData");
 51:    if (!v1.equals(v0.d)) goto 92;
 55:    v0.b = this.i;
 57:    this.n = v0;
 63:    ((com.google.android.finsky.dfemodel.j)this.n).a(this);
 70:    ((com.google.android.finsky.dfemodel.j)this.n).a(this);
 77:    ((com.google.android.finsky.dfemodel.j)this.n).n();
 86:    this.c.a = (com.google.android.finsky.dfemodel.j)this.n;
 88:    this.c.notifyDataSetChanged();
 91:    return;
 94:    com.google.android.finsky.m.a.aO();
 99:    v0 = com.google.android.finsky.dfemodel.l.a(this.i, v1, 1, 1);
103:    goto 57;
    }

    protected final void h() {
        ((com.google.android.finsky.dfemodel.j)this.n).ac_();
        ((com.google.android.finsky.dfemodel.j)this.n).l = 0;
        ((com.google.android.finsky.dfemodel.j)this.n).n();
    }

    public final void m_() {
        super.m_();
        if (this.f == 0) {
            this.f = 1;
            this.e = (PlayListView)this.b.findViewById(2131756290);
            v0 = com.google.android.finsky.m.a.av().a(this.e.getResources());
            android.support.v4.view.ai.a(this.e, v0, this.e.getPaddingTop(), v0, this.e.getPaddingBottom());
            this.e.setAnimateChanges(1);
            this.e.setAdapter(this.c);
            this.e.setItemsCanFocus(1);
            this.e.setRecyclerListener(this.c);
            if (this.d.a("MyAppsEarlyAccessTab.KeyListParcel"))
                this.e.onRestoreInstanceState((Parcelable)this.d.b("MyAppsEarlyAccessTab.KeyListParcel"));
            this.e.d = 1;
            v1 = this.e.getContext().getResources();
            this.e.f = new com.google.android.play.b.o(v1, v1.getColorStateList(2131558657), (float)v1.getDimensionPixelSize(2131625406), (float)v1.getDimensionPixelSize(2131625040), 0);
        }
        this.l();
        this.c.m_();
        if (((com.google.android.finsky.dfemodel.j)this.n).t == 0 && this.c.getCount() == 0) {
            v0 = (MyAppsEmptyView)this.e().findViewById(2131755302);
            if (v0 != 0) {
                v0.a(this.j, this.k, 0, 2131952628, this.o);
                this.f().setEmptyView(v0);
            }
        }
    }

}
