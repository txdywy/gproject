package com.google.android.finsky.detailsmodules.modules.secondaryactions;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.detailsmodules.modules.secondaryactions.view.C2606b;
import com.google.android.finsky.detailsmodules.modules.secondaryactions.view.C2609a;
import com.google.android.finsky.detailsmodules.modules.secondaryactions.view.SecondaryActionsModuleView;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.C1016f;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public class C2607c extends C2598b implements C0999d, C2606b, C1016f {
    public final C0988c f13830d;
    public final C2162a f13831e;
    public final C1461c f13832f;
    public final C2206c f13833g;
    public final C2233o f13834h;
    public final C2974a f13835i;
    public final Context f13836j;
    public final C1254c f13837k;
    public final C2599c f13838l;
    public final C2495w f13839m;
    public final C3748a f13840n;
    public final ad f13841o;
    public C2609a f13842p;

    public C2607c(Context context, String str, C2599c c2599c, C2495w c2495w, C3748a c3748a, ad adVar, C0988c c0988c, C2162a c2162a, C1287h c1287h, C1461c c1461c, C2206c c2206c, C2233o c2233o, C2974a c2974a) {
        this.f13836j = context;
        this.f13837k = c1287h.mo2016a(str);
        this.f13838l = c2599c;
        this.f13839m = c2495w;
        this.f13840n = c3748a;
        this.f13841o = adVar;
        this.f13830d = c0988c;
        this.f13831e = c2162a;
        this.f13832f = c1461c;
        this.f13833g = c2206c;
        this.f13834h = c2233o;
        this.f13835i = c2974a;
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.secondary_actions_module;
    }

    public final boolean mo2979f() {
        return this.b != null && m13692i();
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        boolean z2 = true;
        if (z) {
            boolean z3 = this.f13832f.dj().mo2294a(12629590) && document != null && document.aL();
            if (!z3 && this.b == null) {
                boolean z4;
                this.b = new C2608d();
                ((C2608d) this.b).f13843a = document;
                ((C2608d) this.b).f13844b = !this.f13835i.m15403a(document, this.f13837k);
                if (((C2608d) this.b).f13844b) {
                    ((C2608d) this.b).f13845c = this.f13835i.m15402a(document, this.f13830d.cY());
                }
                C2608d c2608d = (C2608d) this.b;
                if (TextUtils.isEmpty(document.f14885a.f12117x)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                c2608d.f13846d = z4;
                c2608d = (C2608d) this.b;
                for (bl blVar : document.f14885a.f12107n) {
                    if (blVar.f11908C) {
                        break;
                    }
                }
                z2 = false;
                c2608d.f13847e = z2;
                this.f13835i.m15399a(this);
                this.f13833g.mo2814a((C0999d) this);
            }
        }
    }

    public final void mo2976b(View view, int i) {
        if (this.f13842p == null) {
            this.f13842p = m13691d();
        }
        SecondaryActionsModuleView secondaryActionsModuleView = (SecondaryActionsModuleView) view;
        C2609a c2609a = this.f13842p;
        ad adVar = this.f13841o;
        if (c2609a.f13861a || c2609a.f13864d) {
            secondaryActionsModuleView.setVisibility(0);
            secondaryActionsModuleView.f13860m = this;
            secondaryActionsModuleView.f13858k = adVar;
            Resources resources = secondaryActionsModuleView.getResources();
            if (c2609a.f13861a) {
                ad adVar2;
                secondaryActionsModuleView.f13848a.setVisibility(0);
                if (c2609a.f13862b) {
                    secondaryActionsModuleView.f13849b.setImageDrawable(C1608h.m9246a(secondaryActionsModuleView.getContext(), (int) C7582R.drawable.ic_menu_wish_on, c2609a.f13863c));
                    secondaryActionsModuleView.f13848a.setContentDescription(resources.getString(C7582R.string.content_description_wishlist_remove));
                    if (secondaryActionsModuleView.f13855h == null) {
                        secondaryActionsModuleView.f13855h = new C2473o(205, adVar);
                    }
                    adVar2 = secondaryActionsModuleView.f13855h;
                } else {
                    secondaryActionsModuleView.f13849b.setImageResource(C7582R.drawable.ic_menu_wish_off);
                    secondaryActionsModuleView.f13848a.setContentDescription(resources.getString(C7582R.string.content_description_wishlist_add));
                    if (secondaryActionsModuleView.f13854g == null) {
                        secondaryActionsModuleView.f13854g = new C2473o(204, adVar);
                    }
                    adVar2 = secondaryActionsModuleView.f13854g;
                }
                secondaryActionsModuleView.f13860m.mo2972a(secondaryActionsModuleView, adVar2);
            } else {
                secondaryActionsModuleView.f13848a.setVisibility(8);
            }
            secondaryActionsModuleView.m13707a(c2609a.f13864d, secondaryActionsModuleView.f13850c, C7582R.string.share, secondaryActionsModuleView.f13851d, C7582R.raw.ic_share_black24dp);
            if (c2609a.f13864d) {
                if (secondaryActionsModuleView.f13856i == null) {
                    secondaryActionsModuleView.f13856i = new C2473o(202, adVar);
                }
                secondaryActionsModuleView.f13860m.mo2972a(secondaryActionsModuleView, secondaryActionsModuleView.f13856i);
            }
            secondaryActionsModuleView.m13707a(c2609a.f13865e, secondaryActionsModuleView.f13852e, C7582R.string.details_secondary_action_gift, secondaryActionsModuleView.f13853f, C7582R.raw.ic_card_giftcard_24px);
            if (c2609a.f13865e) {
                if (secondaryActionsModuleView.f13857j == null) {
                    secondaryActionsModuleView.f13857j = new C2473o(5550, adVar);
                }
                secondaryActionsModuleView.f13860m.mo2972a(secondaryActionsModuleView, secondaryActionsModuleView.f13857j);
                return;
            }
            return;
        }
        secondaryActionsModuleView.setVisibility(8);
    }

    public final void mo2980h() {
        this.f13835i.m15404b(this);
        this.f13833g.mo2819b(this);
    }

    private final C2609a m13691d() {
        C2609a c2609a = new C2609a();
        c2609a.f13861a = ((C2608d) this.b).f13844b;
        c2609a.f13862b = ((C2608d) this.b).f13845c;
        c2609a.f13863c = ((C2608d) this.b).f13843a.f14885a.f12099f;
        c2609a.f13864d = ((C2608d) this.b).f13846d;
        c2609a.f13865e = ((C2608d) this.b).f13847e;
        return c2609a;
    }

    private final boolean m13692i() {
        return ((C2608d) this.b).f13844b || ((C2608d) this.b).f13846d;
    }

    public final void mo1217a(String str, boolean z, boolean z2) {
        if (this.b != null && ((C2608d) this.b).f13843a.f14885a.f12096c.equals(str)) {
            ((C2608d) this.b).f13845c = z;
            ((C2608d) this.b).f13844b = !this.f13835i.m15403a(((C2608d) this.b).f13843a, this.f13837k);
            this.f13842p = m13691d();
            if (m13692i()) {
                this.f13838l.mo3033a(this, false);
            } else {
                this.f13838l.mo3032a(this);
            }
        }
    }

    public final void mo2971a(View view) {
        int i;
        if (((C2608d) this.b).f13845c) {
            i = 205;
        } else {
            i = 204;
        }
        this.f13839m.m13379b(new C2475d(this.f13841o).m13256a(i));
        this.f13835i.m15398a(view, ((C2608d) this.b).f13843a, this.f13837k);
    }

    public final void mo2970a() {
        Document document = ((C2608d) this.b).f13843a;
        this.f13831e.mo2694a(this.f13836j, this.f13841o, this.f13839m, document.f14885a.f12117x, document.ae(), document.f14885a.f12100g);
    }

    public final void mo2975b() {
        bl blVar;
        int i;
        String str;
        bl[] blVarArr = ((C2608d) this.b).f13843a.f14885a.f12107n;
        int length = blVarArr.length;
        int i2 = 0;
        bl blVar2 = null;
        while (i2 < length) {
            blVar = blVarArr[i2];
            if (!blVar.f11908C) {
                blVar = blVar2;
            } else if (blVar2 != null) {
                blVar = null;
                break;
            }
            i2++;
            blVar2 = blVar;
        }
        blVar = blVar2;
        if (blVar != null) {
            i = blVar.f11926p;
            str = blVar.f11907B;
        } else {
            str = null;
            i = 0;
        }
        this.f13840n.mo3632a(this.f13837k.mo1620b(), ((C2608d) this.b).f13843a, str, i);
    }

    public final void mo2972a(ad adVar, ad adVar2) {
        adVar.mo1219a(adVar2);
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (this.f13834h.m11647a(((C2608d) this.b).f13843a, (C2196e) c2197a)) {
            boolean z = ((C2608d) this.b).f13844b;
            ((C2608d) this.b).f13844b = !this.f13835i.m15403a(((C2608d) this.b).f13843a, this.f13837k);
            this.f13842p = m13691d();
            if (z == ((C2608d) this.b).f13844b) {
                return;
            }
            if (m13692i()) {
                this.f13838l.mo3033a(this, true);
            } else {
                this.f13838l.mo3032a(this);
            }
        }
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((C2608d) c2600d);
        if (this.b != null) {
            this.f13835i.m15399a(this);
            this.f13833g.mo2814a((C0999d) this);
        }
    }
}
