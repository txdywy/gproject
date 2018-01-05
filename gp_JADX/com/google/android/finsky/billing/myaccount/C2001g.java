package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.billing.myaccount.layout.C2002e;
import com.google.android.finsky.billing.myaccount.layout.C2003n;
import com.google.android.finsky.billing.myaccount.layout.C2004o;
import com.google.android.finsky.billing.myaccount.layout.C2005p;
import com.google.android.finsky.billing.myaccount.layout.C2006q;
import com.google.android.finsky.billing.myaccount.layout.C2012a;
import com.google.android.finsky.billing.myaccount.layout.OrderHistoryRowView;
import com.google.android.finsky.billing.myaccount.layout.RewardRowView;
import com.google.android.finsky.billing.myaccount.layout.SubscriptionRowView;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.recyclerview.C1138e;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;

public final class C2001g extends C1138e implements C1031w {
    public final int f10284c;
    public final DfeToc f10285d;
    public final bn f10286e = new bn(this.f10287f);
    public final C2495w f10287f;
    public C2720j f10288g;
    public RecyclerView f10289h;
    public final C1294w f10290i;
    public final C2005p f10291j;
    public final C2006q f10292k;
    public final C2004o f10293l;
    public final C2003n f10294m;
    public final C2002e f10295n;
    public final ad f10296o;
    public final C3027b f10297p;
    public final C3748a f10298q;

    public C2001g(Account account, Context context, C2720j c2720j, C1294w c1294w, C3748a c3748a, C2002e c2002e, C2005p c2005p, C2006q c2006q, C2004o c2004o, C2003n c2003n, ad adVar, DfeToc dfeToc, C3027b c3027b, C2495w c2495w) {
        super(context, c2720j.mo3128h(), c2720j.f14901t);
        this.f10285d = dfeToc;
        this.f10298q = c3748a;
        this.f10288g = c2720j;
        this.f10288g.m11918a((C1031w) this);
        this.f10284c = FinskyHeaderListLayout.m16068a(context, 2, 0);
        this.f10297p = c3027b;
        this.f10287f = c2495w.m13366a(account);
        this.f10290i = c1294w;
        this.f10291j = c2005p;
        this.f10292k = c2006q;
        this.f10293l = c2004o;
        this.f10294m = c2003n;
        this.f10295n = c2002e;
        this.f10296o = adVar;
    }

    public final boolean mo1444i() {
        return this.f10288g.f14901t;
    }

    public final void mo1445j() {
        this.f10288g.m14702q();
    }

    public final String mo1446l() {
        return C1290m.m7702a(this.J, this.f10288g.mo3127g());
    }

    public final void mo2578a(RecyclerView recyclerView) {
        super.mo2578a(recyclerView);
        this.f10289h = recyclerView;
    }

    public final void mo2579b(RecyclerView recyclerView) {
        super.mo2579b(recyclerView);
        this.f10289h = null;
    }

    private final boolean m10627f(int i) {
        return i == this.f10286e.f10262b;
    }

    public final int mo1039a() {
        int m = this.f10288g.m14698m();
        if (m == 0) {
            return 0;
        }
        m++;
        if (this.f7100K != 0) {
            return m + 1;
        }
        return m;
    }

    public final int mo1040a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == mo1039a() - 1) {
            if (this.f7100K == 1) {
                return 3;
            }
            if (this.f7100K == 2) {
                return 4;
            }
        }
        int g = C2001g.m10628g(i);
        if (!this.f10288g.m14686a(g)) {
            return -1;
        }
        Document document = (Document) this.f10288g.m14679a(g, true);
        if (document.aI()) {
            return 6;
        }
        if (document.bx()) {
            return 7;
        }
        return 5;
    }

    private static int m10628g(int i) {
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    private final void m10626a(C2012a c2012a, int i) {
        Object obj = this.f10286e;
        if (obj.f10263c == c2012a) {
            obj.f10263c = null;
        }
        if (i == obj.f10262b) {
            obj.f10263c = c2012a;
        }
        c2012a.setRowPosition(i);
        c2012a.setOnClickListener(obj);
        if (i == obj.f10262b) {
            c2012a.setClickable(false);
        }
        if (!(this.f10286e.f10262b != -1)) {
            bn bnVar = this.f10286e;
            bnVar.f10263c = c2012a;
            bnVar.f10262b = i;
            c2012a.f10370g = true;
            c2012a.getLayoutParams().height = c2012a.f10365b;
            c2012a.invalidate();
            c2012a.setClickable(false);
        }
    }

    public final void m_() {
        if (mo1444i()) {
            m6882e(1);
        } else {
            m6882e(0);
        }
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        View view = c1155g.a;
        int i2 = c1155g.f3216f;
        C2012a c2012a;
        switch (i2) {
            case 0:
                view.getLayoutParams().height = this.f10284c;
                return;
            case 3:
                return;
            case 4:
                m6881b(view);
                return;
            case 5:
                c2012a = (OrderHistoryRowView) view;
                m10626a(c2012a, i);
                Document document = (Document) this.f10288g.m14679a(C2001g.m10628g(i), true);
                c2012a.m10699a(document, this.f10290i, m10627f(i), this.f10295n, this.f10298q, this.f10297p.m15626a(document.f14885a.f12097d), this.f10296o, this.f10287f);
                return;
            case 6:
                c2012a = (RewardRowView) view;
                m10626a(c2012a, i);
                c2012a.m10700a((Document) this.f10288g.m14679a(C2001g.m10628g(i), true), this.f10290i, m10627f(i), this.f10285d, this.f10298q, this.f10296o, this.f10287f);
                return;
            case 7:
                c2012a = (SubscriptionRowView) view;
                m10626a(c2012a, i);
                c2012a.m10702a((Document) this.f10288g.m14679a(C2001g.m10628g(i), true), this.f10290i, m10627f(i), this.f10285d, this.f10291j, this.f10292k, this.f10293l, this.f10294m, this.f10298q, this.f10296o, this.f10287f);
                return;
            default:
                throw new IllegalStateException("Unknown type for onBindView " + i2);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View a;
        switch (i) {
            case 0:
                a = m6878a(C7582R.layout.header_list_spacer, viewGroup);
                break;
            case 3:
                a = m6878a(C7582R.layout.loading_footer, viewGroup);
                break;
            case 4:
                a = m6878a(C7582R.layout.error_footer, viewGroup);
                break;
            case 5:
                a = m6878a(C7582R.layout.order_history_row, viewGroup);
                break;
            case 6:
                a = m6878a(C7582R.layout.reward_row2, viewGroup);
                break;
            case 7:
                a = m6878a(C7582R.layout.subscription_row, viewGroup);
                break;
            default:
                throw new IllegalStateException("Unknown type for onCreateView " + i);
        }
        return new C1155g(a);
    }
}
