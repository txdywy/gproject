package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.finsky.a.c;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.changesubscriptionprice.ChangeSubscriptionPriceActivity;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.updatesubscriptioninstrument.UpdateSubscriptionInstrumentActivity;
import com.google.android.finsky.cv.a.ai;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.fa;
import com.google.android.finsky.cv.a.gb;
import com.google.android.finsky.cv.a.hf;
import com.google.android.finsky.cv.a.hv;
import com.google.android.finsky.cv.a.ke;
import com.google.android.finsky.cx.a;
import com.google.android.finsky.cx.b;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.f.b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.billing.myaccount.h extends com.google.android.finsky.pagesystem.b implements com.google.android.finsky.at.m, com.google.android.finsky.billing.myaccount.layout.e, com.google.android.finsky.billing.myaccount.layout.n, com.google.android.finsky.billing.myaccount.layout.o, com.google.android.finsky.billing.myaccount.layout.p, com.google.android.finsky.billing.myaccount.layout.q, com.google.android.finsky.cx.f
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public long ag;
    public boolean ah;
    public boolean ai;
    public com.google.android.finsky.cv.a.ax aj;
    public boolean ak;
    public boolean al;
    public long am;
    public byte[] an;
    public boolean ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public String at;
    public PlayRecyclerView au;
    public com.google.android.finsky.billing.myaccount.g av;
    public Bundle aw;
    public String ax;
    public com.google.android.finsky.accounts.c b;
    public com.google.android.finsky.f.b c;
    public com.google.android.finsky.dfemodel.l e;
    public com.google.android.finsky.cx.b f;
    public String g;
    public com.google.android.finsky.dfemodel.j h;

    h() {
        com.google.android.finsky.pagesystem.b();
        this.a = com.google.android.finsky.d.j.a(11);
        this.ao = 1;
        this.ap = -1;
        this.aq = 0;
        this.ar = 20;
        this.aw = new Bundle();
    }

    public static com.google.android.finsky.billing.myaccount.h a(String p0, int p1, int p2, com.google.android.finsky.cv.a.ax p3, DfeToc p4, boolean p5, boolean p6, boolean p7, boolean p8, long p9, byte[] p11, com.google.android.finsky.d.w p12) {
        if (p7 != 0 && p3 == 0)
            throw new IllegalArgumentException("updateSubscriptionInstrument requires initialSelectedDocid");
        v0 = new Bundle();
        v0.putString("list_url", p0);
        v0.putInt("title_id", p1);
        v0.putInt("empty_page_string_id", p2);
        v0.putParcelable("selected_docid", ParcelableProto.a(p3));
        v0.putBoolean("is_order_history_page", p5);
        v0.putBoolean("is_subscription_page", p6);
        v0.putBoolean("update_subscription_instrument", p7);
        v0.putBoolean("change_subscription_price", p8);
        v0.putLong("instrument_id", p9);
        v0.putByteArray("payment_client_token", p11);
        v1 = new com.google.android.finsky.billing.myaccount.h();
        v1.f(v0);
        v1.a(p4);
        v1.a(p12);
        return v1;
    }

    private final void aj() {
        if (this.h != 0) {
            this.h.b(this);
            this.h.b(this);
            this.h = 0;
        }
    }

    private final void ao() {
        if (this.au == 0)
            FinskyLog.c("Recycler view null, ignoring.", new Object[0]);
        else if (this.av == 0) {
            this.av = new com.google.android.finsky.billing.myaccount.g(this.bo.b(), this.bn, this.h, this.bD, this.bp, this, this, this, this, this, this, this.k_, this.c, this.bw);
            this.au.setAdapter(this.av);
            if (!this.aw.isEmpty()) {
                v3 = this.aw.getParcelable("AccountDfeListAdapter.recyclerViewParcel");
                if (v3 != 0)
                    this.au.a(v3);
                this.av.e.b = this.aw.getInt("AccountDfeListAdapter.selectedPosition");
                this.aw.clear();
            }
            if (this.n_.dj().a(12643943) && this.ai != 0) {
                v1 = this.bt.findViewById(2131755303);
                ((PlayActionButtonV2)v1.findViewById(2131755304)).a(3, 2131952244, new com.google.android.finsky.billing.myaccount.j(this));
                this.au.setEmptyView(v1);
            }
            else {
                v0 = (TextView)this.bt.findViewById(2131755302);
                v0.setText(this.at);
                this.au.setEmptyView(v0);
            }
        }
        else {
            this.av.g.b(this.av);
            this.av.g = this.h;
            this.av.g.a(this.av);
            this.av.a.b();
        }
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.ah = this.q.getBoolean("is_order_history_page");
        this.ai = this.q.getBoolean("is_subscription_page");
        this.g = this.c(this.q.getInt("title_id"));
        this.at = this.c(this.q.getInt("empty_page_string_id"));
        this.aj = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "selected_docid");
        this.ak = this.q.getBoolean("update_subscription_instrument");
        this.al = this.q.getBoolean("change_subscription_price");
        this.am = this.q.getLong("instrument_id");
        this.an = this.q.getByteArray("payment_client_token");
        if (this.aj == 0)
            this.ao = 0;
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.billing.myaccount.i(((FinskyHeaderListLayout)this.bt).getContext()));
        this.au = (PlayRecyclerView)this.bt.findViewById(2131755301);
        this.au.setSaveEnabled(0);
        this.au.setLayoutManager(new LinearLayoutManager());
        this.au.setAdapter(new com.google.android.finsky.recyclerview.a());
        this.f.a(this);
        return super.a(p0, p1, p2);
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this);
    }

    public final void a(int p0, int p1, Intent p2) {
        if (p0 == 2 || p0 == 3 || p0 == 4 || p0 == 5 || p0 == 6) {
            this.aa();
            this.au();
        }
        else
            super.a(p0, p1, p2);
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 1) {
            v0 = p1.getString("package_name");
            this.ax = v0;
            this.f.a(this, v0, p1.getString("refund_account_name"), 1);
        }
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        super.a(p0);
    }

    protected final void a(com.google.android.finsky.d.w p0) {
        this.bw = p0;
    }

    public final void a(Document p0, com.google.android.finsky.cv.a.ai p1) {
        if (this.n_.dj().a(12636356)) {
            if (p1 == 0)
                throw new IllegalArgumentException("Cancellation dialog is required");
            v3 = new Intent(this.h(), CancelSubscriptionActivityNew);
            v3.putExtra("SubscriptionActionActivity.dialog", ParcelableProto.a(p1));
            this.startActivityForResult(com.google.android.finsky.billing.myaccount.bo.a(v3, this.bo.b(), p0, this.bw), 3);
        }
        else
            this.startActivityForResult(CancelSubscriptionActivity.a(this.h(), this.bo.b(), p0, p1, this.bw), 3);
    }

    public final void a(Document p0, com.google.android.finsky.cv.a.fa p1) {
        v1 = this.bo.b();
        if (p1 == 0)
            throw new IllegalArgumentException("manage dialog is required");
        if (p1.e == 0 || p1.e.length == 0)
            throw new IllegalArgumentException("Invalid manage dialog proto: no manage actions");
        v3 = new Intent(this.h(), ManageSubscriptionActivity);
        v3.putExtra("ManageSubscriptionDialog.document", p0);
        v3.putExtra("ManageSubscriptionDialog.account", v1);
        this.bw.a(v1).a(v3);
        v3.putExtra("ManageSubscriptionDialog.dialog", ParcelableProto.a(p1));
        com.google.android.finsky.billing.common.h.a(v3, v1.name);
        this.startActivityForResult(v3, 5);
    }

    public final void a(Document p0, com.google.android.finsky.cv.a.hv p1) {
        if (this.n_.dj().a(12636356)) {
            if (p1 == 0)
                throw new IllegalArgumentException("Reactivation dialog is required");
            v3 = new Intent(this.h(), ReactivateSubscriptionActivityNew);
            v3.putExtra("SubscriptionActionActivity.dialog", ParcelableProto.a(p1));
            this.startActivityForResult(com.google.android.finsky.billing.myaccount.bo.a(v3, this.bo.b(), p0, this.bw), 4);
        }
        else {
            v1 = this.bo.b();
            if (v1 == 0)
                throw new IllegalArgumentException("account is required");
            if (p0 == 0)
                throw new IllegalArgumentException("document is required");
            if (p1 == 0)
                throw new IllegalArgumentException("Reactivation dialog is required");
            v3 = new Intent(this.h(), ReactivateSubscriptionActivity);
            v3.putExtra("ReactivateSubscriptionDialog.document", p0);
            v3.putExtra("ReactivateSubscriptionDialog.account", v1);
            v3.putExtra("ReactivateSubscriptionDialog.dialog", ParcelableProto.a(p1));
            this.bw.a(v1).a(v3);
            com.google.android.finsky.billing.common.h.a(v3, v1.name);
            this.startActivityForResult(v3, 4);
        }
    }

    public final void a(Document p0, String p1, com.google.android.finsky.cv.a.hf p2) {
        this.startActivityForResult(ChangeSubscriptionPriceActivity.a(this.h(), p1, p0, p2), 6);
    }

    public final void a(String p0, com.google.android.finsky.cv.a.ax p1) {
        this.startActivityForResult(UpdateSubscriptionInstrumentActivity.a(this.h(), p0, p1, 0, 0, this.bw), 2);
    }

    public final void a(String p0, String p1) {
        if (this.B.a("refund_confirm") == 0) {
            v1 = new com.google.android.finsky.at.k();
            v1.a(2131953333).d(2131953511).e(2131952618);
            v2 = new Bundle();
            v2.putString("package_name", p0);
            v2.putString("refund_account_name", p1);
            v1.a(this, 1, v2);
            v1.a().a(this.B, "refund_confirm");
        }
    }

    public final void a(String p0, boolean p1) {
        if (this.ax != 0 && this.ax.equals(p0) && p1 != 0 && this.av != 0)
            this.av.a.b();
    }

    protected final void aa() {
        this.aj();
        this.h = com.google.android.finsky.dfemodel.l.a(this.bo, this.q.getString("list_url"), 1, 1);
        this.h.a(this);
        this.h.a(this);
        this.h.n();
        this.ag = System.currentTimeMillis();
    }

    public final void ac() {
        this.bm.c(this.g);
        this.bm.a(0, 1);
        this.bm.z();
    }

    protected final int ak() {
        return 3;
    }

    public final void b(int p0, Bundle p1) {
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
        this.as = this.i().getDimensionPixelOffset(2131624023) / 2;
    }

    public final void b(String p0) {
        if (this.ax != 0 && this.ax.equals(p0))
            Toast.makeText(this.bn, 2131952995, 1).show();
    }

    protected final void cg_() {
        this.ao();
        this.O_();
        if (this.ak != 0) {
            this.startActivityForResult(UpdateSubscriptionInstrumentActivity.a(this.h(), this.b.cZ(), this.aj, this.am, this.an, this.bw), 2);
            this.ak = 0;
        }
    }

    public final void d() {
        if (this.au != 0 && this.av != 0) {
            this.aw.putParcelable("AccountDfeListAdapter.recyclerViewParcel", this.au.x());
            this.aw.putInt("AccountDfeListAdapter.selectedPosition", this.av.e.b);
        }
        this.au = 0;
        if (this.av != 0) {
            this.av.g.b(this.av);
            this.av = 0;
        }
        if (this.bt instanceof PlayHeaderListLayout)
            ((PlayHeaderListLayout)this.bt).f();
        this.f.b(this);
        super.d();
    }

    public final void d(Bundle p0) {
        v0 = 1;
        super.d(p0);
        this.ac();
        if (this.ah != 0) {
            if (this.ag < com.google.android.finsky.cx.a.a)
                v2 = 1;
            else
                v2 = 0;
        }
        else
            v2 = 0;
        if (v2 != 0)
            this.aj();
        if (this.h == 0 || !this.h.a())
            v0 = 0;
        if (v0 != 0) {
            if (this.h.a != 0)
                com.google.android.finsky.d.j.a(this.getPlayStoreUiElement(), this.h.a.a.D);
            this.ao();
        }
        else {
            this.aa();
            this.au();
        }
        this.bq.a();
    }

    public final void f_(int p0) {
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void m_() {
  6:    if (!this.k())
 22:        return;
 10:    if (this.ao != 0) goto 23;
 12:    this.cg_();
 19:    FinskyLog.f("View rebound", new Object[0]);
 22:    return;
 26:    if (this.ap != -1) goto 93;
 36:    if (this.aq >= this.h.m()) goto 241;
 48:    v0 = ((Document)this.h.a(this.aq, 1)).d();
 58:    if (v0.d != this.aj.d) goto 233;
 66:    if (v0.c != this.aj.c) goto 233;
 78:    if (!v0.b.equals(this.aj.b)) goto 233;
 82:    this.ap = this.aq;
 88:    this.aq = this.aq + 1;
 90:    v0 = 1;
 91:    if (v0 == 0) goto 251;
101:    if (this.aq >= this.h.m()) goto 244;
107:    this.h.a(this.aq, 1);
114:    this.aq = this.aq + 1;
120:    this.ar = this.ar - 1;
124:    if (this.ar > 0) goto 93;
126:    v0 = 1;
127:    if (v0 == 0 && this.h.t != 0) {
 19:        FinskyLog.f("View rebound", new Object[0]);
 22:        return;
        }
135:    this.cg_();
138:    this.ao = 0;
146:    if (this.ap == 0)
148:        v1 = 0;
        else
299:        v1 = this.as;
159:    ((LinearLayoutManager)this.av.h.getLayoutManager()).a(this.ap + 1, v1);
164:    this.av.e.b = this.ap + 1;
168:    if (this.al == 0) {
 19:        FinskyLog.f("View rebound", new Object[0]);
 22:        return;
        }
200:    v1 = ((Document)this.h.a(this.ap, 1)).bw();
204:    if (v1 == 0) goto 249;
206:    v3 = v1.l;
209:    v1 = 0;
210:    if (v1 >= v3.length) goto 249;
217:    if (v3[v1].c != 7) goto 246;
219:    v1 = v3[v1].i;
226:    this.startActivityForResult(ChangeSubscriptionPriceActivity.a(this.h(), this.b.cZ(), (Document)this.h.a(this.ap, 1), v1), 6);
229:    this.al = 0;
231:    goto 15;
237:    this.aq = this.aq + 1;
239:    goto 28;
241:    v0 = 0;
242:    goto 91;
244:    v0 = 0;
245:    goto 127;
246:    v1 = v1 + 1;
248:    goto 210;
249:    v1 = 0;
250:    goto 221;
255:    if (this.h.t == 0) {
260:        v1 = new Object[3];
266:        v1[0] = this.aj.b;
276:        v1[1] = Integer.valueOf(this.aj.d);
287:        v1[2] = Integer.valueOf(this.aj.c);
289:        FinskyLog.c("Docid not found. Backend Docid: %s Backend: %d Type: %d", v1);
292:        this.cg_();
295:        this.ao = 0;
        }
297:    goto 15;
    }

}
