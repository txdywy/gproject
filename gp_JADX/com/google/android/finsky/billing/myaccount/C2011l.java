package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsActionRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsCreatableInstrumentRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsExistingInstrumentRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountSeparatorRowView;
import com.google.android.finsky.billing.profile.C2056m;
import com.google.android.finsky.billing.profile.C2060q;
import com.google.android.finsky.billing.profile.C2066w;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C2011l extends C1137h {
    public final Context f10307c;
    public final C2056m f10308d;
    public u f10309e;
    public final ad f10310f;
    public final ad f10311g;
    public final int f10312h;
    public final int f10313i;
    public final int f10314j;
    public final int f10315k;
    public final int f10316l;
    public final int f10317m;
    public final LayoutInflater f10318n;
    public final ArrayList f10319o = new ArrayList();
    public final ArrayList f10320p = new ArrayList();
    public final C2495w f10321q;
    public final C0988c f10322r;
    public final C1557b f10323s;
    public final C1612l f10324t;
    public final C1461c f10325u;
    public boolean f10326v;
    public ao[] f10327w;
    public boolean f10328x;

    public C2011l(Context context, C2056m c2056m, C0988c c0988c, C1557b c1557b, C1612l c1612l, C1461c c1461c, ad adVar, ad adVar2, C2495w c2495w) {
        boolean z = false;
        this.f10307c = context;
        this.f10308d = c2056m;
        this.f10322r = c0988c;
        this.f10323s = c1557b;
        this.f10324t = c1612l;
        this.f10325u = c1461c;
        this.f10310f = adVar;
        this.f10311g = adVar2;
        this.f10321q = c2495w;
        this.f10312h = FinskyHeaderListLayout.m16068a(context, 2, 0);
        this.f10313i = this.f10307c.getResources().getDimensionPixelSize(C7582R.dimen.account_payment_methods_spacer_height);
        this.f10314j = this.f10307c.getResources().getDimensionPixelSize(C7582R.dimen.account_payment_methods_spacer_text_height);
        this.f10315k = this.f10307c.getResources().getDimensionPixelSize(C7582R.dimen.account_payment_methods_spacer_h_padding);
        this.f10316l = this.f10307c.getResources().getDimensionPixelSize(C7582R.dimen.account_row_min_height);
        this.f10318n = LayoutInflater.from(this.f10307c);
        if (!this.f10325u.dj().mo2294a(12603133)) {
            z = true;
        }
        this.f10326v = z;
        this.f10317m = (this.f10312h + this.f10314j) + this.f10316l;
    }

    public final void m10676a(ao[] aoVarArr) {
        m10669b(aoVarArr);
        m10678b();
        m10674a(1, (Object[]) aoVarArr);
        if (this.f10326v) {
            this.f10319o.add(new C2027p(3));
            this.f10319o.add(new C2027p(4));
        }
        if (m10670c()) {
            if (!this.f10326v) {
                this.f10319o.add(new C2027p(3));
            }
            this.f10319o.add(new C2027p(5));
        }
        this.f3433a.m3638b();
    }

    public final void m10677a(ao[] aoVarArr, v[] vVarArr) {
        m10669b(aoVarArr);
        this.f10309e = this.f10308d.al;
        m10678b();
        if (aoVarArr.length > 0) {
            m10668a(1, aoVarArr, Math.max(1, ((this.f10307c.getResources().getDisplayMetrics().heightPixels - this.f10317m) / this.f10316l) - 1));
        } else {
            this.f10319o.add(new C2027p(6));
        }
        if (vVarArr.length > 0) {
            this.f10319o.add(new C2027p(3, this.f10309e.o));
            m10674a(2, (Object[]) vVarArr);
        }
        boolean c = m10670c();
        if (this.f10326v) {
            this.f10319o.add(new C2027p(3, this.f10309e.p));
            this.f10319o.add(new C2027p(4, null, !c));
        }
        if (c) {
            if (!this.f10326v) {
                this.f10319o.add(new C2027p(3, this.f10309e.p));
            }
            this.f10319o.add(new C2027p(5, null, true));
        }
        this.f3433a.m3638b();
    }

    public final int mo1039a() {
        return this.f10319o.size();
    }

    public final int mo1040a(int i) {
        return ((C2027p) this.f10319o.get(i)).f10469a;
    }

    private final boolean m10670c() {
        if (!this.f10323s.mo2313c().mo2327h() || !this.f10328x) {
            return false;
        }
        boolean z;
        int length = this.f10327w.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        int i = 0;
        while (i < length) {
            if (this.f10327w[i].w == null) {
                i++;
            } else if (length <= 1) {
                return false;
            } else {
                return true;
            }
        }
        return z;
    }

    final void m10678b() {
        this.f10319o.clear();
        this.f10319o.add(new C2027p(0));
        this.f10320p.clear();
    }

    final void m10674a(int i, Object[] objArr) {
        m10668a(i, objArr, Integer.MAX_VALUE);
    }

    private final void m10668a(int i, Object[] objArr, int i2) {
        int min = Math.min(i2, objArr.length);
        int i3 = 0;
        while (i3 < min) {
            boolean z;
            ArrayList arrayList = this.f10319o;
            Object obj = objArr[i3];
            if (i3 == min - 1) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new C2027p(i, obj, z));
            i3++;
        }
        if (objArr.length > i2) {
            this.f10319o.add(new C2027p(7, Integer.valueOf(this.f10319o.size())));
        }
        for (int i4 = i3; i4 < objArr.length; i4++) {
            this.f10320p.add(objArr[i4]);
        }
    }

    private final void m10669b(ao[] aoVarArr) {
        int i = 0;
        this.f10328x = false;
        ArrayList arrayList = new ArrayList();
        int length = aoVarArr.length;
        while (i < length) {
            ao aoVar = aoVarArr[i];
            if (aoVar.y) {
                arrayList.add(aoVar);
            }
            if (aoVar.w != null) {
                this.f10328x = true;
            }
            i++;
        }
        this.f10327w = (ao[]) arrayList.toArray(new ao[arrayList.size()]);
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        int i2 = c1155g.f3216f;
        View view = c1155g.a;
        C2027p c2027p;
        ad adVar;
        AccountSeparatorRowView accountSeparatorRowView;
        boolean z;
        bd bdVar;
        AccountPaymentMethodsActionRowView accountPaymentMethodsActionRowView;
        switch (i2) {
            case 0:
                view.getLayoutParams().height = this.f10312h;
                return;
            case 1:
                c2027p = (C2027p) this.f10319o.get(i);
                ao aoVar = (ao) c2027p.f10470b;
                C2056m c2056m = this.f10308d;
                adVar = this.f10310f;
                C2495w c2495w = this.f10321q;
                if (c2056m.al == null) {
                    throw new IllegalStateException("Cannot create edit instrument click listener without the billing profile.");
                }
                OnClickListener onClickListener;
                AccountSeparatorRowView accountSeparatorRowView2;
                CharSequence charSequence;
                if (TextUtils.isEmpty(aoVar.u) || aoVar.t == null || aoVar.t.length <= 0) {
                    onClickListener = null;
                } else {
                    onClickListener = new C2060q(c2056m, aoVar, c2495w, adVar);
                }
                accountSeparatorRowView = (AccountPaymentMethodsExistingInstrumentRowView) view;
                z = c2027p.f10471c;
                adVar = this.f10310f;
                accountSeparatorRowView.f10354k = z;
                if (accountSeparatorRowView.f10344a.dj().mo2294a(12622358)) {
                    z = true;
                    accountSeparatorRowView2 = accountSeparatorRowView;
                } else if (z) {
                    z = false;
                    accountSeparatorRowView2 = accountSeparatorRowView;
                } else {
                    z = true;
                    accountSeparatorRowView2 = accountSeparatorRowView;
                }
                accountSeparatorRowView2.setShouldDrawSeparator(z);
                accountSeparatorRowView.f10350g.setText(aoVar.d);
                bdVar = aoVar.e;
                if (bdVar != null) {
                    accountSeparatorRowView.f10345b.m9288a(accountSeparatorRowView.f10348e, bdVar.f11860f, bdVar.f11863i);
                    accountSeparatorRowView.f10348e.setVisibility(0);
                } else {
                    accountSeparatorRowView.f10348e.setVisibility(8);
                }
                if (aoVar.e()) {
                    accountSeparatorRowView.f10351h.setText(aoVar.x);
                    accountSeparatorRowView.f10351h.setVisibility(0);
                } else {
                    accountSeparatorRowView.f10351h.setVisibility(8);
                }
                if (aoVar.r.length > 0) {
                    charSequence = aoVar.r[0].d;
                } else {
                    charSequence = null;
                }
                if (TextUtils.isEmpty(charSequence)) {
                    accountSeparatorRowView.f10352i.setVisibility(8);
                } else {
                    accountSeparatorRowView.f10352i.setText(charSequence);
                    accountSeparatorRowView.f10352i.setVisibility(0);
                }
                byte[] bArr = aoVar.t;
                if (TextUtils.isEmpty(aoVar.u) || bArr == null || bArr.length <= 0) {
                    accountSeparatorRowView.f10353j.setVisibility(8);
                    accountSeparatorRowView.setOnClickListener(null);
                    accountSeparatorRowView.setClickable(false);
                } else {
                    accountSeparatorRowView.f10353j.setText(aoVar.u.toUpperCase());
                    accountSeparatorRowView.f10353j.setVisibility(0);
                    accountSeparatorRowView.setOnClickListener(onClickListener);
                }
                C2482j.m13285a(accountSeparatorRowView.f10346c, aoVar.v);
                accountSeparatorRowView.f10347d = adVar;
                accountSeparatorRowView.f10347d.mo1219a(accountSeparatorRowView);
                return;
            case 2:
                AccountSeparatorRowView accountSeparatorRowView3;
                c2027p = (C2027p) this.f10319o.get(i);
                v vVar = (v) c2027p.f10470b;
                C2066w a = this.f10308d.m10810a(vVar, this.f10308d.al.e, this.f10311g, this.f10321q);
                accountSeparatorRowView = (AccountPaymentMethodsCreatableInstrumentRowView) view;
                z = c2027p.f10471c;
                adVar = this.f10311g;
                accountSeparatorRowView.f10343g = z;
                if (accountSeparatorRowView.f10337a.dj().mo2294a(12622358)) {
                    z = true;
                    accountSeparatorRowView3 = accountSeparatorRowView;
                } else if (z) {
                    z = false;
                    accountSeparatorRowView3 = accountSeparatorRowView;
                } else {
                    z = true;
                    accountSeparatorRowView3 = accountSeparatorRowView;
                }
                accountSeparatorRowView3.setShouldDrawSeparator(z);
                accountSeparatorRowView.f10342f.setText(vVar.e);
                bdVar = vVar.f;
                if (bdVar != null) {
                    accountSeparatorRowView.f10338b.m9288a(accountSeparatorRowView.f10341e, bdVar.f11860f, bdVar.f11863i);
                    accountSeparatorRowView.f10341e.setVisibility(0);
                } else {
                    accountSeparatorRowView.f10341e.setVisibility(8);
                }
                accountSeparatorRowView.setOnClickListener(a.f10598f);
                accountSeparatorRowView.f10339c.b(a.f10600h);
                C2482j.m13285a(accountSeparatorRowView.f10339c, vVar.g);
                accountSeparatorRowView.f10340d = adVar;
                accountSeparatorRowView.f10340d.mo1219a(accountSeparatorRowView);
                return;
            case 3:
                c2027p = (C2027p) this.f10319o.get(i);
                if (c2027p.f10470b != null) {
                    ((TextView) view).setText((String) c2027p.f10470b);
                    view.setPadding(this.f10315k, view.getPaddingTop(), this.f10315k, view.getPaddingBottom());
                    view.getLayoutParams().height = this.f10314j;
                    return;
                }
                view.getLayoutParams().height = this.f10313i;
                view.setPadding(0, 0, 0, 0);
                return;
            case 4:
                accountPaymentMethodsActionRowView = (AccountPaymentMethodsActionRowView) view;
                accountPaymentMethodsActionRowView.m10681a(C7582R.string.more_payment_settings, C7582R.raw.ic_settings_24px, new C2024m(this), ((C2027p) this.f10319o.get(i)).f10471c, 2623, this.f10310f);
                return;
            case 5:
                accountPaymentMethodsActionRowView = (AccountPaymentMethodsActionRowView) view;
                accountPaymentMethodsActionRowView.m10681a(C7582R.string.change_family_instrument, C7582R.raw.ic_family_24px, new C2025n(this, view), ((C2027p) this.f10319o.get(i)).f10471c, 2629, this.f10310f);
                return;
            case 6:
                bd bdVar2 = this.f10309e.q;
                FifeImageView fifeImageView = (FifeImageView) view.findViewById(16908294);
                if (bdVar2 != null) {
                    fifeImageView.setVisibility(0);
                    this.f10324t.m9288a(fifeImageView, bdVar2.f11860f, bdVar2.f11863i);
                } else {
                    fifeImageView.setVisibility(8);
                }
                ((TextView) view.findViewById(16908308)).setText(this.f10309e.r);
                this.f10310f.mo1219a(new C2473o(2632, this.f10310f));
                return;
            case 7:
                c2027p = (C2027p) this.f10319o.get(i);
                ((TextView) view.findViewById(16908310)).setText(this.f10309e.n);
                view.setOnClickListener(new C2026o(this, c2027p));
                this.f10310f.mo1219a(new C2473o(2631, this.f10310f));
                return;
            default:
                throw new IllegalStateException("Unknown type for onBindViewHolder " + i2);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View inflate;
        switch (i) {
            case 0:
                inflate = this.f10318n.inflate(C7582R.layout.header_list_spacer, viewGroup, false);
                break;
            case 1:
                inflate = this.f10318n.inflate(C7582R.layout.account_payment_methods_existing_instrument_row, viewGroup, false);
                break;
            case 2:
                inflate = this.f10318n.inflate(C7582R.layout.account_payment_methods_creatable_instrument_row, viewGroup, false);
                break;
            case 3:
                inflate = this.f10318n.inflate(C7582R.layout.account_payment_methods_spacer, viewGroup, false);
                break;
            case 4:
            case 5:
                inflate = this.f10318n.inflate(C7582R.layout.account_payment_methods_action_row, viewGroup, false);
                break;
            case 6:
                inflate = this.f10318n.inflate(C7582R.layout.account_payment_methods_empty_instruments_row, viewGroup, false);
                break;
            case 7:
                inflate = this.f10318n.inflate(C7582R.layout.account_payment_methods_view_all_row, viewGroup, false);
                break;
            default:
                throw new IllegalStateException("Unknown type for onCreateViewHolder " + i);
        }
        return new C1155g(inflate);
    }
}
