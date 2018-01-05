package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.billing.myaccount.layout.AccountSimpleRowView;
import com.google.android.finsky.billing.myaccount.layout.C2014c;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.an;
import com.google.wireless.android.finsky.dfe.f.a.a;
import com.google.wireless.android.finsky.dfe.nano.gy;
import com.squareup.leakcanary.C7582R;

public final class C1996a extends C1995d {
    public C0988c f10169c;
    public C1461c f10170d;
    public C1557b f10171e;
    public C1500a f10172f;
    public C2910a f10173g;
    public final C3748a f10174h;

    public C1996a(Context context, C3748a c3748a, ad adVar, Bundle bundle, C2495w c2495w) {
        boolean z;
        an anVar;
        int i;
        int i2;
        super(context, bundle, adVar, c2495w);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1749a(this);
        this.f10174h = c3748a;
        this.i.clear();
        Account cY = this.f10169c.cY();
        boolean d = this.f10171e.mo2314d();
        C1500a c1500a = this.f10172f;
        if (cY != null) {
            if (C1500a.m8816c(cY)) {
                z = true;
            } else {
                C1552e j = c1500a.f8163e.mo2249j(cY.name);
                if (!j.mo2294a(12613099)) {
                    if (j.mo2294a(12608887)) {
                        a b = c1500a.m8821b(cY);
                        if (!(b == null || b.c == null || !b.c.c)) {
                            z = true;
                        }
                    }
                    gy b2 = c1500a.f8161c.m15190b(cY.name);
                    if (b2 == null) {
                        anVar = null;
                    } else {
                        anVar = b2.g;
                    }
                    if (anVar != null) {
                        z = anVar.b;
                    }
                }
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            if (this.f10170d.dj().mo2294a(12608225) || !this.f10172f.m8819a(cY)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.i.add(Integer.valueOf(0));
            if (i != 0) {
                this.i.add(Integer.valueOf(1));
            }
            if (d) {
                this.i.add(Integer.valueOf(2));
            }
            this.i.add(Integer.valueOf(3));
            if (i2 != 0) {
                this.i.add(Integer.valueOf(4));
            }
            if (this.f10170d.dj().mo2294a(12631494)) {
                this.i.add(Integer.valueOf(6));
            }
            this.i.add(Integer.valueOf(5));
            anVar = this.f10173g.m15197g(cY.name);
            if (anVar != null && anVar.e) {
                this.i.add(Integer.valueOf(7));
                return;
            }
        }
        z = false;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.f10170d.dj().mo2294a(12608225)) {
        }
        i2 = 1;
        this.i.add(Integer.valueOf(0));
        if (i != 0) {
            this.i.add(Integer.valueOf(1));
        }
        if (d) {
            this.i.add(Integer.valueOf(2));
        }
        this.i.add(Integer.valueOf(3));
        if (i2 != 0) {
            this.i.add(Integer.valueOf(4));
        }
        if (this.f10170d.dj().mo2294a(12631494)) {
            this.i.add(Integer.valueOf(6));
        }
        this.i.add(Integer.valueOf(5));
        anVar = this.f10173g.m15197g(cY.name);
        if (anVar != null) {
        }
    }

    protected final int mo2572e(int i) {
        switch (i) {
            case 0:
                return C7582R.layout.header_list_spacer;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return C7582R.layout.account_simple_row;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
    }

    protected final void mo2571a(View view, int i, int i2) {
        switch (i) {
            case 0:
                m10558a(view);
                return;
            case 1:
                C2014c a = m10556a(new C1997b(this), C7582R.string.account_payment_methods_page_title, C7582R.raw.ic_credit_card_24px, C7582R.color.payment_methods_icon, 2680);
                a.f10410c = C7582R.string.account_payment_methods_row_subtitle;
                a.f10413f = C7582R.color.play_apps_primary;
                ((AccountSimpleRowView) view).m10688a(a, this.j);
                return;
            case 2:
                m10560a(view, m10563f(5), C7582R.string.account_family_page_title, C7582R.raw.ic_family_24px, C7582R.color.family_icon, 2681);
                return;
            case 3:
                if (this.f10170d.dj().mo2294a(12643409)) {
                    m10560a(view, m10563f(2), C7582R.string.account_subscriptions_page_title, C7582R.raw.ic_autorenew_black_24dp, C7582R.color.subscriptions_icon, 2682);
                    return;
                }
                m10560a(view, m10563f(2), C7582R.string.account_subscriptions_page_title, C7582R.raw.ic_repeat_24px, C7582R.color.subscriptions_icon, 2682);
                return;
            case 4:
                m10560a(view, m10563f(3), C7582R.string.account_rewards_page_title, C7582R.raw.ic_reward_24px, C7582R.color.rewards_icon, 2683);
                return;
            case 5:
                m10560a(view, m10563f(1), C7582R.string.account_order_history_page_title, C7582R.raw.ic_history_24px, C7582R.color.order_history_icon, 2684);
                return;
            case 6:
                m10560a(view, m10563f(6), C7582R.string.account_email_page_title, C7582R.raw.ic_mail_24px, C7582R.color.email_icon, 2685);
                return;
            case 7:
                m10560a(view, m10563f(8), C7582R.string.account_country_page_title, C7582R.raw.ic_country_24dp, C7582R.color.country_icon, 2697);
                return;
            default:
                throw new IllegalStateException("Unknown type for getView " + i);
        }
    }

    private final OnClickListener m10563f(int i) {
        return new C1999c(this, i);
    }
}
