package com.google.android.finsky.detailspage.seasonlist;

import android.accounts.Account;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.jk;
import com.google.android.finsky.cv.p177a.la;
import com.google.android.finsky.cv.p177a.lx;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.detailspage.ck;
import com.google.android.finsky.detailspage.videowatchaction.C2679e;
import com.google.android.finsky.detailspage.videowatchaction.C2683i;
import com.google.android.finsky.detailspage.videowatchaction.WatchActionSummaryView;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dz.C2945a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C2664a extends ck implements ad, C2663i {
    public final boolean f14732d = C1473m.f7980a.dj().mo2294a(12624692);
    public C2683i f14733e;
    public C2720j f14734f;
    public String f14735g;
    public boolean f14736h;
    public final C1031w f14737i;
    public final C0657w f14738j;
    public ce f14739k;

    public C2664a() {
        C1473m.f7980a.aO();
        this.f14737i = new C2665b(this);
        this.f14738j = new C2666c(this);
        this.f14739k = C2482j.m13283a(211);
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.season_list_module;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((C2667d) this.b).f14744c == null || ((C2667d) this.b).f14744c.size() <= 0) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.f14732d) {
            Object obj = (document.f14885a.f12098e != 18 || TextUtils.isEmpty(document.m14654i())) ? null : 1;
            if (obj != null && this.b == null) {
                this.b = new C2667d();
                ((C2667d) this.b).f14742a = document;
                ((C2667d) this.b).f14747f = new ArrayList();
                jk aR = document.aR();
                if (aR != null) {
                    boolean z2;
                    this.f14735g = aR.f12790b;
                    if (aR.f12791c != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f14736h = z2;
                }
                m14473i();
            }
        }
    }

    public final void mo2976b(View view, int i) {
        int i2;
        CharSequence string;
        boolean z;
        int i3;
        CharSequence charSequence = null;
        int i4 = 8;
        boolean z2 = true;
        List arrayList = new ArrayList();
        if (((C2667d) this.b).f14746e) {
            i2 = -1;
            for (int i5 = 0; i5 < ((C2667d) this.b).f14747f.size(); i5++) {
                boolean z3;
                lx lxVar = (lx) ((C2667d) this.b).f14747f.get(i5);
                if (((C2667d) this.b).f14748g != null && TextUtils.equals(lxVar.f13074c, ((C2667d) this.b).f14748g.f13074c)) {
                    i2 = i5;
                }
                Document document = ((C2667d) this.b).f14745d;
                if (i2 == i5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList.add(C2945a.m15314a(document, lxVar, z3));
            }
        } else {
            i2 = -1;
        }
        if (m14471c()) {
            string = this.t.getResources().getString(C7582R.string.season_name_unavailable_show_available, new Object[]{((C2667d) this.b).f14745d.f14885a.f12100g});
        } else {
            string = null;
        }
        SeasonListModuleLayout seasonListModuleLayout = (SeasonListModuleLayout) view;
        List list = ((C2667d) this.b).f14744c;
        Document document2 = ((C2667d) this.b).f14745d;
        if (((C2667d) this.b).f14746e && m14472d()) {
            charSequence = C2945a.m15319b(((C2667d) this.b).f14745d);
        }
        if (m14472d() && ((C2667d) this.b).f14745d != null && ((C2667d) this.b).f14746e && ((C2667d) this.b).f14745d.m14636Y()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == -1) {
            i2 = 0;
        }
        boolean z4 = this.f14736h;
        seasonListModuleLayout.f14727i = list;
        seasonListModuleLayout.f14728j = document2;
        seasonListModuleLayout.f14729k = this;
        seasonListModuleLayout.f14720b.setVisibility(0);
        seasonListModuleLayout.f14720b.setAdapter(new C2671h(seasonListModuleLayout, seasonListModuleLayout.getContext(), seasonListModuleLayout.f14727i));
        seasonListModuleLayout.f14720b.setSelection(seasonListModuleLayout.f14727i.indexOf(seasonListModuleLayout.f14728j));
        if (seasonListModuleLayout.f14727i.size() == 1) {
            seasonListModuleLayout.f14720b.setClickable(false);
            seasonListModuleLayout.f14720b.setBackgroundResource(0);
        }
        mo3102a(seasonListModuleLayout.f14721c, seasonListModuleLayout.f14722d, seasonListModuleLayout.f14723e);
        seasonListModuleLayout.f14725g.setVisibility(TextUtils.isEmpty(string) ? 8 : 0);
        if (!TextUtils.isEmpty(string)) {
            seasonListModuleLayout.f14725g.setText(string);
        }
        TextView textView = seasonListModuleLayout.f14724f;
        if (TextUtils.isEmpty(charSequence)) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        textView.setVisibility(i3);
        seasonListModuleLayout.f14724f.setText(charSequence);
        View view2 = seasonListModuleLayout.f14719a;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        boolean isEmpty = arrayList.isEmpty();
        ExpandableListView expandableListView = seasonListModuleLayout.f14726h;
        if (!isEmpty) {
            i4 = 0;
        }
        expandableListView.setVisibility(i4);
        if (!isEmpty) {
            seasonListModuleLayout.f14726h.setAdapter(new C2679e(seasonListModuleLayout.getContext(), seasonListModuleLayout.f14726h, arrayList, i2, new C2670g(seasonListModuleLayout)));
            ExpandableListView expandableListView2 = seasonListModuleLayout.f14726h;
            if (arrayList.size() <= 1) {
                z2 = false;
            }
            expandableListView2.setEnabled(z2);
        }
        if (z4) {
            seasonListModuleLayout.f14730l.post(seasonListModuleLayout.f14731m);
        }
    }

    public final void mo2980h() {
        if (this.f14734f != null) {
            this.f14734f.m11922b(this.f14737i);
            this.f14734f.m11921b(this.f14738j);
        }
        if (this.f14733e != null) {
            this.f14733e.m14521a();
            this.f14733e = null;
        }
    }

    public final void mo3101a(Document document) {
        if (((C2667d) this.b).f14745d != document) {
            String str;
            ((C2667d) this.b).f14745d = document;
            ((C2667d) this.b).f14746e = C2945a.m15321d(document);
            ((C2667d) this.b).f14747f = C2945a.m15316a(document);
            if (((C2667d) this.b).f14748g == null) {
                String str2;
                la U = ((C2667d) this.b).f14742a.m14632U();
                if (U != null) {
                    str2 = U.f13001i;
                } else {
                    str2 = null;
                }
                str = str2;
            } else {
                str = ((C2667d) this.b).f14748g.f13074c;
            }
            ((C2667d) this.b).f14748g = C2945a.m15313a(((C2667d) this.b).f14745d, ((C2667d) this.b).f14747f, str);
            m14474a();
            this.u.mo3036b("SeasonListModule.SeasonDocument", ((C2667d) this.b).f14745d);
            m14470b();
            if (!(this.f14739k.d.length == 0 || Arrays.equals(this.f14739k.d, ((C2667d) this.b).f14745d.f14885a.f12087D))) {
                this.f14739k.f = ce.a;
                this.f14739k.d();
            }
            C2482j.m13285a(this.f14739k, ((C2667d) this.b).f14745d.f14885a.f12087D);
        }
    }

    public final void mo3103b(int i) {
        ((C2667d) this.b).f14748g = (lx) ((C2667d) this.b).f14747f.get(i);
        m14474a();
        m14470b();
    }

    public final void mo3102a(PlayActionButtonV2 playActionButtonV2, WatchActionSummaryView watchActionSummaryView, WishlistPlayActionButton wishlistPlayActionButton) {
        playActionButtonV2.setVisibility(8);
        watchActionSummaryView.setVisibility(8);
        wishlistPlayActionButton.setVisibility(8);
        if (m14471c()) {
            wishlistPlayActionButton.m6004a(((C2667d) this.b).f14742a, this.z, this.I);
        } else if (m14472d()) {
            Resources resources = this.t.getResources();
            Document document = ((C2667d) this.b).f14745d;
            C3748a c3748a = this.z;
            C2495w c2495w = this.J;
            Account cY = C1473m.f7980a.cY();
            if (C2945a.m15320c(document)) {
                playActionButtonV2.mo2588a(4, resources.getString(C7582R.string.purchased_list_state), null);
                playActionButtonV2.setEnabled(false);
                playActionButtonV2.setVisibility(0);
                return;
            }
            bl[] blVarArr = document.f14885a.f12107n;
            C1473m.f7980a.mo2044X();
            int a = C2288b.m11785a(blVarArr);
            if (a == 0) {
                playActionButtonV2.setVisibility(8);
                return;
            }
            int i;
            String string;
            playActionButtonV2.setVisibility(0);
            playActionButtonV2.setEnabled(true);
            C1473m.f7980a.mo2044X();
            bl a2 = C2288b.m11786a(blVarArr, true, null);
            Object obj = null;
            Object obj2 = null;
            for (bl blVar : blVarArr) {
                int i2 = blVar.f11926p;
                if (C2731v.RENTAL.m14768a(i2)) {
                    obj = 1;
                } else if (C2731v.PURCHASE.m14768a(i2)) {
                    obj2 = 1;
                }
            }
            if (obj2 != null && obj != null) {
                i = C7582R.string.purchase_or_rent_resolution;
            } else if (obj2 != null) {
                if (a == 1) {
                    i = C7582R.string.tvseason_buy;
                } else {
                    i = C7582R.string.tvseason_purchase_resolution;
                }
            } else if (obj == null) {
                i = 0;
            } else if (a == 1) {
                i = C7582R.string.rent;
            } else {
                i = C7582R.string.rent_resolution;
            }
            if (i != 0) {
                string = resources.getString(i, new Object[]{a2.f11917g});
            } else {
                string = a2.f11917g;
            }
            if (a == 1) {
                i = a2.f11926p;
            } else {
                i = 0;
            }
            playActionButtonV2.mo2588a(4, string, c3748a.mo3624a(cY, document, i, null, null, 200, (ad) this, c2495w));
        } else {
            if (this.f14733e == null) {
                this.f14733e = new C2683i(this.t, this.I, this.z, this.J, this.w);
            }
            this.f14733e.m14522a(watchActionSummaryView, ((C2667d) this.b).f14748g);
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f14739k;
    }

    public final ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    private final void m14470b() {
        Object obj;
        C2599c c2599c = this.u;
        String str = "SeasonListModule.WatchActionApp";
        if (m14472d()) {
            obj = null;
        } else {
            obj = ((C2667d) this.b).f14748g.f13074c;
        }
        c2599c.mo3036b(str, obj);
    }

    private final boolean m14471c() {
        return !((C2667d) this.b).f14746e && ((C2667d) this.b).f14743b;
    }

    private final boolean m14472d() {
        return ((C2667d) this.b).f14748g == null || C2945a.m15317a(((C2667d) this.b).f14748g);
    }

    final void m14474a() {
        if (mo2979f()) {
            this.u.mo3033a(this, false);
        }
    }

    private final void m14473i() {
        this.f14734f = C2721l.m14733a(this.w, ((C2667d) this.b).f14742a.m14654i(), false, true);
        this.f14734f.m11918a(this.f14737i);
        this.f14734f.m11917a(this.f14738j);
        this.f14734f.m14699n();
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((C2667d) c2600d);
        if (this.b != null && ((C2667d) this.b).f14744c == null) {
            m14473i();
        }
    }
}
