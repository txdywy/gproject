package com.google.android.finsky.stream.controllers.promotioncampaign;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.cv.p177a.hj;
import com.google.android.finsky.cv.p177a.hl;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.promotioncampaign.view.C4475a;
import com.google.android.finsky.stream.controllers.promotioncampaign.view.C4477b;
import com.google.android.finsky.stream.controllers.promotioncampaign.view.C4478c;
import com.google.android.finsky.stream.controllers.promotioncampaign.view.PromotionCampaignHeaderView;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class C4476a extends C4250b implements C4475a {
    public final ab f22736a;
    public final C1461c f22737b;
    public C4477b f22738o;
    public Document f22739p;

    public C4476a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, ab abVar, C1461c c1461c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22736a = abVar;
        this.f22737b = c1461c;
    }

    public final void mo4050a(C2720j c2720j) {
        String str;
        String str2;
        Object obj;
        List arrayList;
        super.mo4050a(c2720j);
        this.f22739p = this.g.f14908a;
        hl hlVar = this.f22739p.bg().ao;
        String str3 = this.f22739p.f14885a.f12100g;
        String str4 = this.f22739p.f14885a.f12101h;
        if (this.f22737b.dj().mo2294a(12640238)) {
            str = this.f22739p.f14885a.f12103j;
        } else {
            str = Html.fromHtml(this.f22739p.f14885a.f12103j).toString();
        }
        if (this.f22737b.dj().mo2294a(12637706)) {
            str2 = hlVar.f12574c;
        } else {
            str2 = "";
        }
        Spanned fromHtml = Html.fromHtml(str2);
        if (hlVar.f12575d != null) {
            obj = 1;
        } else if (TextUtils.isEmpty(hlVar.f12577f) || TextUtils.isEmpty(hlVar.f12579h) || hlVar.f12578g == null) {
            obj = null;
        } else {
            int i = 1;
        }
        if (obj == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (hlVar.f12575d != null) {
                obj = C4476a.m20900a(hlVar.f12575d);
            } else {
                obj = new C4478c(hlVar.f12577f.toUpperCase(Locale.getDefault()), hlVar.f12579h);
            }
            arrayList2.add(obj);
            if (this.f22737b.dj().mo2294a(12640433) && hlVar.f12576e != null) {
                arrayList2.add(C4476a.m20900a(hlVar.f12576e));
            }
            obj = arrayList2;
        }
        boolean z = hlVar.f12573b != null && hlVar.f12573b.length > 0;
        this.f22738o = new C4477b(str3, str4, str, fromHtml, arrayList, z, this.f22739p.f14885a.f12099f, this.f22739p.f14885a.f12087D);
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.promotion_campaign_header;
    }

    public final void mo1510a(View view, int i) {
        PromotionCampaignHeaderView promotionCampaignHeaderView = (PromotionCampaignHeaderView) view;
        C4477b c4477b = this.f22738o;
        ad adVar = this.h;
        PromotionCampaignHeaderView.m20914a(c4477b.f22759a, promotionCampaignHeaderView.f22740a);
        PromotionCampaignHeaderView.m20914a(c4477b.f22760b, promotionCampaignHeaderView.f22741b);
        String str = c4477b.f22761c;
        TextView textView = promotionCampaignHeaderView.f22742c;
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            ae.m9217a(textView, str);
            textView.setVisibility(0);
        }
        PromotionCampaignHeaderView.m20914a(c4477b.f22762d, promotionCampaignHeaderView.f22743d);
        List list = c4477b.f22763e;
        int i2 = c4477b.f22765g;
        if (list.isEmpty()) {
            promotionCampaignHeaderView.m20916a(promotionCampaignHeaderView.f22748i);
            promotionCampaignHeaderView.m20919b();
            promotionCampaignHeaderView.f22753n.setVisibility(8);
            promotionCampaignHeaderView.f22754o.setVisibility(8);
            promotionCampaignHeaderView.f22755p.setVisibility(8);
        } else {
            PromotionCampaignHeaderView.m20913a(promotionCampaignHeaderView.f22745f, -2, 0.0f);
            PromotionCampaignHeaderView.m20913a(promotionCampaignHeaderView.f22749j, -2, 0.0f);
            promotionCampaignHeaderView.m20917a(promotionCampaignHeaderView.f22748i, (C4478c) list.get(0), i2, false);
            if (list.size() > 1) {
                promotionCampaignHeaderView.m20917a(promotionCampaignHeaderView.f22752m, (C4478c) list.get(1), i2, true);
                if (!promotionCampaignHeaderView.m20918a()) {
                    PromotionCampaignHeaderView.m20913a(promotionCampaignHeaderView.f22745f, 0, 0.5f);
                    PromotionCampaignHeaderView.m20913a(promotionCampaignHeaderView.f22749j, 0, 0.5f);
                }
            } else {
                promotionCampaignHeaderView.m20919b();
            }
            promotionCampaignHeaderView.f22753n.setVisibility(8);
            promotionCampaignHeaderView.f22754o.setVisibility(8);
            promotionCampaignHeaderView.f22755p.setVisibility(4);
        }
        if (c4477b.f22764f) {
            promotionCampaignHeaderView.f22744e.setOnClickListener(promotionCampaignHeaderView);
            promotionCampaignHeaderView.f22744e.setClickable(true);
            promotionCampaignHeaderView.f22744e.setVisibility(0);
        } else {
            promotionCampaignHeaderView.f22744e.setClickable(false);
            promotionCampaignHeaderView.f22744e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(c4477b.f22762d)) {
            promotionCampaignHeaderView.f22743d.setOnClickListener(promotionCampaignHeaderView);
        }
        C2482j.m13285a(promotionCampaignHeaderView.f22757r, c4477b.f22766h);
        promotionCampaignHeaderView.f22758s = adVar;
        promotionCampaignHeaderView.f22756q = this;
        C4477b c4477b2 = this.f22738o;
        this.h.mo1219a((PromotionCampaignHeaderView) view);
        if (c4477b2.f22763e.size() > 0) {
            this.i.m13370a(new C2488p().m13345b((PromotionCampaignHeaderView) view).m13340a(C2482j.m13283a(2932).c));
        }
        if (c4477b2.f22763e.size() > 1) {
            this.i.m13370a(new C2488p().m13345b((PromotionCampaignHeaderView) view).m13340a(C2482j.m13283a(2945).c));
        }
        if (c4477b2.f22764f) {
            this.i.m13370a(new C2488p().m13345b((PromotionCampaignHeaderView) view).m13340a(C2482j.m13283a(2933).c));
        }
        if (!TextUtils.isEmpty(c4477b2.f22762d)) {
            this.i.m13370a(new C2488p().m13345b((PromotionCampaignHeaderView) view).m13340a(C2482j.m13283a(2944).c));
        }
    }

    public final void mo1511b(View view, int i) {
    }

    private static C4478c m20900a(hj hjVar) {
        return new C4478c(hjVar.f12567b.toUpperCase(Locale.getDefault()), hjVar.f12569d.f12571b);
    }

    public final void mo4220a(ad adVar) {
        ip ipVar;
        this.i.m13379b(new C2475d(adVar).m13256a(2932));
        hl hlVar = this.f22739p.bg().ao;
        if (hlVar.f12575d != null) {
            ipVar = hlVar.f12575d.f12568c.f12324d;
        } else {
            ipVar = hlVar.f12578g.f12324d;
        }
        m20901a(ipVar);
    }

    public final void mo4221b(ad adVar) {
        this.i.m13379b(new C2475d(adVar).m13256a(2945));
        m20901a(this.f22739p.bg().ao.f12576e.f12568c.f12324d);
    }

    private final void m20901a(ip ipVar) {
        this.f.mo3643a(ipVar, this.f22739p.f14885a.f12100g, this.f22739p.f14885a.f12099f, this.f22736a.dn(), this.h, 0, this.i);
    }

    public final void mo4222c(ad adVar) {
        this.i.m13379b(new C2475d(adVar).m13256a(2933));
        m20902b();
    }

    public final void mo4223d(ad adVar) {
        this.i.m13379b(new C2475d(adVar).m13256a(2944));
        m20902b();
    }

    private final void m20902b() {
        if (this.f.mo3700d()) {
            this.f.mo3690b(this.f22739p, this.i);
        }
    }
}
