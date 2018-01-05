package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.billing.changesubscriptionprice.ChangeSubscriptionPriceActivity;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.myaccount.layout.C2002e;
import com.google.android.finsky.billing.myaccount.layout.C2003n;
import com.google.android.finsky.billing.myaccount.layout.C2004o;
import com.google.android.finsky.billing.myaccount.layout.C2005p;
import com.google.android.finsky.billing.myaccount.layout.C2006q;
import com.google.android.finsky.billing.updatesubscriptioninstrument.UpdateSubscriptionInstrumentActivity;
import com.google.android.finsky.cv.p177a.ai;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.fa;
import com.google.android.finsky.cv.p177a.gb;
import com.google.android.finsky.cv.p177a.hf;
import com.google.android.finsky.cv.p177a.hv;
import com.google.android.finsky.cv.p177a.ke;
import com.google.android.finsky.cx.C1000f;
import com.google.android.finsky.cx.C2459a;
import com.google.android.finsky.cx.C2460b;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C2007h extends C1045b implements C0998m, C2002e, C2003n, C2004o, C2005p, C2006q, C1000f {
    public final ce f10299a = C2482j.m13283a(11);
    public long ag;
    public boolean ah;
    public boolean ai;
    public ax aj;
    public boolean ak;
    public boolean al;
    public long am;
    public byte[] an;
    public boolean ao = true;
    public int ap = -1;
    public int aq = 0;
    public int ar = 20;
    public int as;
    public String at;
    public PlayRecyclerView au;
    public C2001g av;
    public Bundle aw = new Bundle();
    public String ax;
    public C0988c f10300b;
    public C3027b f10301c;
    public C2721l f10302e;
    public C2460b f10303f;
    public String f10304g;
    public C2720j f10305h;

    public static C2007h m10644a(String str, int i, int i2, ax axVar, DfeToc dfeToc, boolean z, boolean z2, boolean z3, boolean z4, long j, byte[] bArr, C2495w c2495w) {
        if (z3 && axVar == null) {
            throw new IllegalArgumentException("updateSubscriptionInstrument requires initialSelectedDocid");
        }
        Bundle bundle = new Bundle();
        bundle.putString("list_url", str);
        bundle.putInt("title_id", i);
        bundle.putInt("empty_page_string_id", i2);
        bundle.putParcelable("selected_docid", ParcelableProto.m21671a((C0757i) axVar));
        bundle.putBoolean("is_order_history_page", z);
        bundle.putBoolean("is_subscription_page", z2);
        bundle.putBoolean("update_subscription_instrument", z3);
        bundle.putBoolean("change_subscription_price", z4);
        bundle.putLong("instrument_id", j);
        bundle.putByteArray("payment_client_token", bArr);
        Fragment c2007h = new C2007h();
        c2007h.m600f(bundle);
        c2007h.m6251a(dfeToc);
        c2007h.mo2580a(c2495w);
        return c2007h;
    }

    public final void mo1292a(Activity activity) {
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1757a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.as = m605i().getDimensionPixelOffset(C7582R.dimen.account_row_min_height) / 2;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.f760q;
        this.ah = bundle2.getBoolean("is_order_history_page");
        this.ai = bundle2.getBoolean("is_subscription_page");
        this.f10304g = m592c(bundle2.getInt("title_id"));
        this.at = m592c(bundle2.getInt("empty_page_string_id"));
        this.aj = (ax) ParcelableProto.m21673a(bundle2, "selected_docid");
        this.ak = bundle2.getBoolean("update_subscription_instrument");
        this.al = bundle2.getBoolean("change_subscription_price");
        this.am = bundle2.getLong("instrument_id");
        this.an = bundle2.getByteArray("payment_client_token");
        if (this.aj == null) {
            this.ao = false;
        }
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new C2008i(finskyHeaderListLayout.getContext()));
        this.au = (PlayRecyclerView) this.bt.findViewById(C7582R.id.recycler_view);
        this.au.setSaveEnabled(false);
        this.au.setLayoutManager(new LinearLayoutManager());
        this.au.setAdapter(new C3984a());
        this.f10303f.m13163a(this);
        return a;
    }

    public final void mo139d(Bundle bundle) {
        Object obj = 1;
        super.mo139d(bundle);
        ac();
        Object obj2 = this.ah ? this.ag < C2459a.f13276a ? 1 : null : null;
        if (obj2 != null) {
            aj();
        }
        if (this.f10305h == null || !this.f10305h.mo2861a()) {
            obj = null;
        }
        if (obj != null) {
            Document document = this.f10305h.f14908a;
            if (document != null) {
                C2482j.m13285a(getPlayStoreUiElement(), document.f14885a.f12087D);
            }
            ao();
        } else {
            aa();
            au();
        }
        this.bq.mo1259a();
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this);
    }

    public final void ac() {
        this.bm.mo1241c(this.f10304g);
        this.bm.mo1237a(0, true);
        this.bm.mo1246z();
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    public final void m_() {
        if (m610k()) {
            if (this.ao) {
                boolean z;
                if (this.ap == -1) {
                    while (this.aq < this.f10305h.m14698m()) {
                        ax d = ((Document) this.f10305h.m14679a(this.aq, true)).m14646d();
                        if (d.f11835d == this.aj.f11835d && d.f11834c == this.aj.f11834c && d.f11833b.equals(this.aj.f11833b)) {
                            this.ap = this.aq;
                            this.aq++;
                            z = true;
                            break;
                        }
                        this.aq++;
                    }
                    z = false;
                    if (!z) {
                        if (!this.f10305h.f14901t) {
                            FinskyLog.m21665c("Docid not found. Backend Docid: %s Backend: %d Type: %d", this.aj.f11833b, Integer.valueOf(this.aj.f11835d), Integer.valueOf(this.aj.f11834c));
                            cg_();
                            this.ao = false;
                        }
                    }
                }
                while (this.aq < this.f10305h.m14698m()) {
                    this.f10305h.m14679a(this.aq, true);
                    this.aq++;
                    this.ar--;
                    if (this.ar <= 0) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (z || !this.f10305h.f14901t) {
                    int i;
                    cg_();
                    this.ao = false;
                    C2001g c2001g = this.av;
                    int i2 = this.ap;
                    int i3 = this.as;
                    if (i2 == 0) {
                        i = 0;
                    } else {
                        i = i3;
                    }
                    i2++;
                    ((LinearLayoutManager) c2001g.f10289h.getLayoutManager()).m3094a(i2, i);
                    c2001g.f10286e.f10262b = i2;
                    if (this.al) {
                        hf hfVar;
                        Context h = m603h();
                        String cZ = this.f10300b.cZ();
                        Document document = (Document) this.f10305h.m14679a(this.ap, true);
                        gb bw = ((Document) this.f10305h.m14679a(this.ap, true)).bw();
                        if (bw != null) {
                            for (ke keVar : bw.f12418l) {
                                if (keVar.f12863c == 7) {
                                    hfVar = keVar.f12869i;
                                    break;
                                }
                            }
                        }
                        hfVar = null;
                        startActivityForResult(ChangeSubscriptionPriceActivity.m9733a(h, cZ, document, hfVar), 6);
                        this.al = false;
                    }
                }
            } else {
                cg_();
            }
            FinskyLog.m21670f("View rebound", new Object[0]);
        }
    }

    protected final void aa() {
        aj();
        this.f10305h = C2721l.m14733a(this.bo, this.f760q.getString("list_url"), true, true);
        this.f10305h.m11918a((C1031w) this);
        this.f10305h.m11917a((C0657w) this);
        this.f10305h.m14699n();
        this.ag = System.currentTimeMillis();
    }

    private final void aj() {
        if (this.f10305h != null) {
            this.f10305h.m11922b((C1031w) this);
            this.f10305h.m11921b((C0657w) this);
            this.f10305h = null;
        }
    }

    protected final void cg_() {
        ao();
        O_();
        if (this.ak) {
            startActivityForResult(UpdateSubscriptionInstrumentActivity.m10968a(m603h(), this.f10300b.cZ(), this.aj, this.am, this.an, this.bw), 2);
            this.ak = false;
        }
    }

    private final void ao() {
        if (this.au == null) {
            FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
        } else if (this.av == null) {
            this.av = new C2001g(this.bo.mo1620b(), this.bn, this.f10305h, this.bD, this.bp, this, this, this, this, this, this, this.k_, this.f10301c, this.bw);
            this.au.setAdapter(this.av);
            if (!this.aw.isEmpty()) {
                C2001g c2001g = this.av;
                PlayRecyclerView playRecyclerView = this.au;
                Bundle bundle = this.aw;
                Parcelable parcelable = bundle.getParcelable("AccountDfeListAdapter.recyclerViewParcel");
                if (parcelable != null) {
                    playRecyclerView.m13601a(parcelable);
                }
                c2001g.f10286e.f10262b = bundle.getInt("AccountDfeListAdapter.selectedPosition");
                this.aw.clear();
            }
            if (this.n_.dj().mo2294a(12643943) && this.ai) {
                View findViewById = this.bt.findViewById(C7582R.id.empty_state_view);
                ((PlayActionButtonV2) findViewById.findViewById(C7582R.id.explore_button)).m6000a(3, (int) C7582R.string.get_started, new C2009j(this));
                this.au.setEmptyView(findViewById);
                return;
            }
            TextView textView = (TextView) this.bt.findViewById(C7582R.id.no_results_view);
            textView.setText(this.at);
            this.au.setEmptyView(textView);
        } else {
            C1031w c1031w = this.av;
            C2720j c2720j = this.f10305h;
            c1031w.f10288g.m11922b(c1031w);
            c1031w.f10288g = c2720j;
            c1031w.f10288g.m11918a(c1031w);
            c1031w.f3433a.m3638b();
        }
    }

    public final void mo138d() {
        if (!(this.au == null || this.av == null)) {
            C2001g c2001g = this.av;
            PlayRecyclerView playRecyclerView = this.au;
            Bundle bundle = this.aw;
            bundle.putParcelable("AccountDfeListAdapter.recyclerViewParcel", playRecyclerView.mo2959x());
            bundle.putInt("AccountDfeListAdapter.selectedPosition", c2001g.f10286e.f10262b);
        }
        this.au = null;
        if (this.av != null) {
            C1031w c1031w = this.av;
            c1031w.f10288g.m11922b(c1031w);
            this.av = null;
        }
        if (this.bt instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.bt).f();
        }
        this.f10303f.m13164b(this);
        super.mo138d();
    }

    protected final int ak() {
        return 3;
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
            aa();
            au();
            return;
        }
        super.mo2342a(i, i2, intent);
    }

    public final void mo2586a(String str, String str2) {
        ab abVar = this.f730B;
        if (abVar.mo283a("refund_confirm") == null) {
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.uninstall_refund_confirmation_body).m8860d((int) C7582R.string.yes).m8862e((int) C7582R.string.no);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            bundle.putString("refund_account_name", str2);
            c1508k.m8851a(this, 1, bundle);
            c1508k.mo2272a().m625a(abVar, "refund_confirm");
        }
    }

    public final void mo2581a(Document document, ai aiVar) {
        if (this.n_.dj().mo2294a(12636356)) {
            Context h = m603h();
            Account b = this.bo.mo1620b();
            C2495w c2495w = this.bw;
            if (aiVar == null) {
                throw new IllegalArgumentException("Cancellation dialog is required");
            }
            Intent intent = new Intent(h, CancelSubscriptionActivityNew.class);
            intent.putExtra("SubscriptionActionActivity.dialog", ParcelableProto.m21671a((C0757i) aiVar));
            startActivityForResult(bo.m10507a(intent, b, document, c2495w), 3);
            return;
        }
        startActivityForResult(CancelSubscriptionActivity.m10502a(m603h(), this.bo.mo1620b(), document, aiVar, this.bw), 3);
    }

    public final void mo2583a(Document document, hv hvVar) {
        Context h;
        Account b;
        C2495w c2495w;
        if (this.n_.dj().mo2294a(12636356)) {
            h = m603h();
            b = this.bo.mo1620b();
            c2495w = this.bw;
            if (hvVar == null) {
                throw new IllegalArgumentException("Reactivation dialog is required");
            }
            Intent intent = new Intent(h, ReactivateSubscriptionActivityNew.class);
            intent.putExtra("SubscriptionActionActivity.dialog", ParcelableProto.m21671a((C0757i) hvVar));
            startActivityForResult(bo.m10507a(intent, b, document, c2495w), 4);
            return;
        }
        h = m603h();
        b = this.bo.mo1620b();
        c2495w = this.bw;
        if (b == null) {
            throw new IllegalArgumentException("account is required");
        } else if (document == null) {
            throw new IllegalArgumentException("document is required");
        } else if (hvVar == null) {
            throw new IllegalArgumentException("Reactivation dialog is required");
        } else {
            intent = new Intent(h, ReactivateSubscriptionActivity.class);
            intent.putExtra("ReactivateSubscriptionDialog.document", document);
            intent.putExtra("ReactivateSubscriptionDialog.account", b);
            intent.putExtra("ReactivateSubscriptionDialog.dialog", ParcelableProto.m21671a((C0757i) hvVar));
            c2495w.m13366a(b).m13376a(intent);
            C1647h.m9344a(intent, b.name);
            startActivityForResult(intent, 4);
        }
    }

    public final void mo2585a(String str, ax axVar) {
        startActivityForResult(UpdateSubscriptionInstrumentActivity.m10968a(m603h(), str, axVar, 0, null, this.bw), 2);
    }

    public final void mo2582a(Document document, fa faVar) {
        Context h = m603h();
        Account b = this.bo.mo1620b();
        C2495w c2495w = this.bw;
        if (faVar == null) {
            throw new IllegalArgumentException("manage dialog is required");
        } else if (faVar.f12351e == null || faVar.f12351e.length == 0) {
            throw new IllegalArgumentException("Invalid manage dialog proto: no manage actions");
        } else {
            Intent intent = new Intent(h, ManageSubscriptionActivity.class);
            intent.putExtra("ManageSubscriptionDialog.document", document);
            intent.putExtra("ManageSubscriptionDialog.account", b);
            c2495w.m13366a(b).m13376a(intent);
            intent.putExtra("ManageSubscriptionDialog.dialog", ParcelableProto.m21671a((C0757i) faVar));
            C1647h.m9344a(intent, b.name);
            startActivityForResult(intent, 5);
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 1) {
            String string = bundle.getString("package_name");
            String string2 = bundle.getString("refund_account_name");
            this.ax = string;
            this.f10303f.m13162a(this, string, string2, true);
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public final ce getPlayStoreUiElement() {
        return this.f10299a;
    }

    public final void mo1212b(String str) {
        if (this.ax != null && this.ax.equals(str)) {
            Toast.makeText(this.bn, C7582R.string.refunding, 1).show();
        }
    }

    public final void mo1208a(String str, boolean z) {
        if (this.ax != null && this.ax.equals(str) && z && this.av != null) {
            this.av.f3433a.m3638b();
        }
    }

    public final void mo2584a(Document document, String str, hf hfVar) {
        startActivityForResult(ChangeSubscriptionPriceActivity.m9733a(m603h(), str, document, hfVar), 6);
    }

    protected final void mo2580a(C2495w c2495w) {
        this.bw = c2495w;
    }
}
