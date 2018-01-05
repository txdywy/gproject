package com.google.android.finsky.detailsmodules.modules.subscriptions;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.detailsmodules.modules.subscriptions.view.C2619a;
import com.google.android.finsky.detailsmodules.modules.subscriptions.view.C2620b;
import com.google.android.finsky.detailsmodules.modules.subscriptions.view.SubscriptionView;
import com.google.android.finsky.detailsmodules.modules.subscriptions.view.SubscriptionsModuleView;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C2617h extends C2598b implements OnClickListener, C0999d, C2616g {
    public final C2599c f13881d;
    public final C2495w f13882e;
    public final C3748a f13883f;
    public final ad f13884g;
    public final C1254c f13885h;
    public final C2206c f13886i;
    public final C2611b f13887j;
    public boolean f13888k;
    public C2620b f13889l;
    public C2613d f13890m;

    public C2617h(String str, C2599c c2599c, C2495w c2495w, C3748a c3748a, ad adVar, C1287h c1287h, C2206c c2206c, C2611b c2611b) {
        this.f13881d = c2599c;
        this.f13882e = c2495w;
        this.f13883f = c3748a;
        this.f13884g = adVar;
        this.f13885h = c1287h.mo2016a(str);
        this.f13886i = c2206c;
        this.f13887j = c2611b;
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.subscriptions_module;
    }

    public final boolean mo2979f() {
        return (this.b == null || !((C2618i) this.b).f13892b || ((C2618i) this.b).f13893c.isEmpty() || ((C2618i) this.b).f13894d.isEmpty()) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null) {
            this.b = new C2618i();
            ((C2618i) this.b).f13891a = document;
            ((C2618i) this.b).f13893c = new ArrayList();
            ((C2618i) this.b).f13894d = new ArrayList();
            this.f13886i.mo2814a((C0999d) this);
            m13715a();
        }
    }

    public final void mo2976b(View view, int i) {
        SubscriptionsModuleView subscriptionsModuleView = (SubscriptionsModuleView) view;
        if (this.f13889l == null) {
            this.f13889l = m13716b();
        }
        List list = this.f13889l.f13909a;
        while (subscriptionsModuleView.getChildCount() > list.size()) {
            subscriptionsModuleView.removeViewAt(subscriptionsModuleView.getChildCount() - 1);
        }
        while (subscriptionsModuleView.getChildCount() < list.size()) {
            subscriptionsModuleView.addView((SubscriptionView) subscriptionsModuleView.f13903a.inflate(C7582R.layout.subscription_item, subscriptionsModuleView, false));
        }
        int i2 = 0;
        while (i2 < list.size()) {
            SubscriptionView subscriptionView = (SubscriptionView) subscriptionsModuleView.getChildAt(i2);
            ((C2619a) list.get(i2)).f13908e = i2 == list.size() + -1;
            C2619a c2619a = (C2619a) list.get(i2);
            subscriptionView.f13895a.setText(c2619a.f13905b);
            if (TextUtils.isEmpty(c2619a.f13906c)) {
                subscriptionView.f13896b.setVisibility(8);
            } else {
                subscriptionView.f13896b.setVisibility(0);
                subscriptionView.f13896b.setText(c2619a.f13906c);
            }
            if (TextUtils.isEmpty(c2619a.f13907d)) {
                subscriptionView.f13897c.setVisibility(8);
            } else {
                subscriptionView.f13897c.setVisibility(0);
                subscriptionView.f13897c.setText(c2619a.f13907d);
            }
            subscriptionView.setNextFocusRightId(-1);
            if (c2619a.f13908e) {
                subscriptionView.f13898d.setVisibility(0);
                subscriptionView.f13898d.m6000a(c2619a.f13904a, (int) C7582R.string.manage_subscriptions, (OnClickListener) this);
            }
            i2++;
        }
        if (!this.f13889l.f13909a.isEmpty()) {
            this.f13882e.m13370a(new C2488p().m13345b(this.f13884g).m13340a(1840));
        }
    }

    public final void mo2980h() {
        this.f13886i.mo2819b(this);
        this.f13888k = true;
    }

    private final void m13715a() {
        if (this.f13890m == null) {
            this.f13890m = new C2613d(((C2618i) this.b).f13891a, this, this.f13885h, this.f13886i);
        }
        C2613d c2613d = this.f13890m;
        if (c2613d.f13874a.f14885a.f12098e == 1) {
            if ("com.google.android.music".equals(c2613d.f13874a.f14885a.f12097d)) {
                List arrayList = new ArrayList();
                Map hashMap = new HashMap();
                for (C2231n c2231n : c2613d.f13877d.mo2811a(c2613d.f13876c.mo1620b()).mo2786c()) {
                    String str = c2231n.f11104k;
                    hashMap.put(str, c2231n);
                    arrayList.add(C2726q.m14748a(c2231n.f11105l, str));
                }
                c2613d.m13711a(arrayList, hashMap);
                return;
            }
            c2613d.m13710a();
        } else if (c2613d.f13874a.f14885a.f12099f == 6) {
            c2613d.m13712b();
        }
    }

    private final C2620b m13716b() {
        C2620b c2620b = new C2620b();
        c2620b.f13909a = new ArrayList();
        for (int i = 0; i < ((C2618i) this.b).f13893c.size(); i++) {
            int i2;
            Document document = (Document) ((C2618i) this.b).f13893c.get(i);
            C2231n c2231n = (C2231n) ((C2618i) this.b).f13894d.get(i);
            long currentTimeMillis = System.currentTimeMillis();
            if (!c2231n.f11131e) {
                i2 = 3;
            } else if (currentTimeMillis < c2231n.f11130d) {
                i2 = 1;
            } else if (currentTimeMillis < c2231n.f11108o) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            if (i2 != 3) {
                bl e;
                String str;
                C2611b c2611b = this.f13887j;
                C2610a c2610a = new C2610a(c2611b.f13870a, c2231n, c2611b.f13871b);
                C2619a c2619a = new C2619a();
                c2619a.f13904a = document.f14885a.f12099f;
                c2619a.f13905b = document.f14885a.f12100g;
                if (document.f14885a.f12098e == 15) {
                    e = document.m14649e(1);
                } else {
                    e = document.m14649e(13);
                }
                if (e == null || e.f11930t == null) {
                    FinskyLog.m21669e("Document for %s does not contain a subscription offer or terms.", document.f14885a.f12096c);
                    str = null;
                } else {
                    CharSequence charSequence = e.f11930t.f11975f;
                    if (TextUtils.isEmpty(charSequence)) {
                        FinskyLog.m21669e("Document for %s does not contain a formatted price.", document.f14885a.f12096c);
                        str = charSequence;
                    } else {
                        CharSequence charSequence2 = charSequence;
                    }
                }
                c2619a.f13906c = str;
                c2619a.f13907d = c2610a.f13869d;
                c2620b.f13909a.add(c2619a);
            }
        }
        return c2620b;
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m13715a();
    }

    public void onClick(View view) {
        this.f13883f.mo3629a(2, this.f13882e);
        this.f13882e.m13379b(new C2475d(this.f13884g).m13256a(1840));
    }

    public final void mo2981a(List list, List list2) {
        if (this.f13888k) {
            FinskyLog.m21659a("Destroyed, ignoring response.", new Object[0]);
            return;
        }
        ((C2618i) this.b).f13892b = true;
        ((C2618i) this.b).f13893c = list;
        ((C2618i) this.b).f13894d = list2;
        if (mo2979f()) {
            this.f13889l = m13716b();
            this.f13881d.mo3033a(this, true);
            return;
        }
        this.f13881d.mo3032a(this);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((C2618i) c2600d);
        if (this.b != null) {
            this.f13886i.mo2814a((C0999d) this);
            if (!((C2618i) this.b).f13892b) {
                m13715a();
            }
        }
    }
}
