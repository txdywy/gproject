package com.google.android.finsky.activities.myapps;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.android.volley.VolleyError;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.by.c;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.layoutswitcher.a;
import com.google.android.finsky.layoutswitcher.d;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.play.layout.d;

public class com.google.android.finsky.activities.myapps.m implements View$OnClickListener, com.android.volley.w, com.google.android.finsky.activities.gt, com.google.android.finsky.by.d, com.google.android.finsky.dfemodel.w, com.google.android.finsky.installqueue.o
{

    public final com.google.android.finsky.activities.b g;
    public final LayoutInflater h;
    public final com.google.android.finsky.api.c i;
    public final DfeToc j;
    public final com.google.android.finsky.navigationmanager.a k;
    public VolleyError l;
    public final com.google.android.finsky.by.c m;
    public com.google.android.finsky.dfemodel.k n;
    public final com.google.android.finsky.d.w o;

    m(com.google.android.finsky.activities.b p0, com.google.android.finsky.api.c p1, DfeToc p2, com.google.android.finsky.navigationmanager.a p3, com.google.android.finsky.d.w p4) {
        this.g = p0;
        this.h = LayoutInflater.from(this.g);
        this.i = p1;
        this.j = p2;
        this.k = p3;
        this.o = p4;
        com.google.android.finsky.m.a.o();
        com.google.android.finsky.m.a.bw().a(this);
        this.m = com.google.android.finsky.m.a.ah();
        this.m.a(this);
    }

    protected abstract Document a(View p0);

    public final void a(VolleyError p0) {
        this.l = p0;
        this.l();
    }

    public final void a(boolean p0) {
    }

    public final void ab_() {
    }

    public com.google.android.finsky.utils.ac b() {
        this.j();
        com.google.android.finsky.m.a.bw().b(this);
        this.m.b(this);
        return 0;
    }

    protected abstract com.google.android.finsky.activities.myapps.e d();

    protected abstract View e();

    protected abstract ListView f();

    protected abstract void g();

    protected abstract void h();

    protected final boolean i() {
        if (this.n != 0 && this.n.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final void j() {
        if (this.n != 0) {
            this.n.b(this);
            this.n.b(this);
            this.n = 0;
        }
    }

    protected final void l() {
        v1 = this.e();
        v2 = v1.findViewById(2131756116);
        v3 = v1.findViewById(2131756064);
        v0 = (ErrorIndicatorWithNotifyLayout)v1.findViewById(2131756336);
        v1 = (ListView)v1.findViewById(2131756290);
        if (this.l != 0) {
            com.google.android.finsky.layoutswitcher.a.a(v3, v0, new com.google.android.finsky.activities.myapps.n(this), com.google.android.finsky.m.a.u().a(), com.google.android.finsky.api.m.a(com.google.android.finsky.m.a.b, this.l));
            v2.setVisibility(8);
            v1.setVisibility(8);
        }
        else if (this.i()) {
            v1.setVisibility(0);
            v3.setVisibility(8);
            v0.setVisibility(8);
            v2.setVisibility(8);
        }
        else {
            v2.setVisibility(0);
            v3.setVisibility(8);
            v0.setVisibility(8);
            v1.setVisibility(8);
        }
    }

    public void m_() {
        this.l = 0;
    }

    public void onClick(View p0) {
  9:    if (p0.getId() == 2131755358)
 17:        v1 = (View)p0.getParent();
        else
115:        v1 = p0;
 22:    if (this.a(v1) != 0) goto 36;
 24:    v0 = -1;
 25:    if (v0 == -1)
 32:        FinskyLog.e("The position of the view is invalid", new Object[0]);
        else {
 69:        v1 = this.d().a(v0);
 89:        this.o.b(new com.google.android.finsky.d.d((com.google.android.finsky.d.ad)((com.google.android.play.layout.d)p0).getLoggingData()));
 96:        if (com.google.android.finsky.navigationmanager.e.a())
101:            v0 = p0.findViewById(2131755433);
            else
113:            v0 = 0;
109:        this.k.a(v1, 0, v0, this.o);
        }
 35:    return;
 36:    v4 = this.f();
 40:    v0 = v1;
 41:    if (v0 != 0) goto 45;
 43:    v0 = -1;
 44:    goto 25;
 45:    v0 = v0.getParent();
 49:    if (v0 == v4) goto 60;
 53:    if (v0 instanceof View) goto 57;
 55:    v0 = -1;
 56:    goto 25;
 57:    v0 = (View)v0;
 59:    goto 41;
 60:    v0 = v4.getPositionForView(v1);
 64:    goto 25;
    }

}
