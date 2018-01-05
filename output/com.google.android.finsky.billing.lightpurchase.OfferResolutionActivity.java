package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.cr;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.billing.common.v;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ck.a;
import com.google.android.finsky.ck.b;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.m;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

protected class OfferResolutionActivity extends android.support.v7.app.aa implements View$OnClickListener, com.android.volley.w, com.google.android.finsky.at.m, com.google.android.finsky.d.ah, com.google.android.finsky.dfemodel.w
{

    public final com.google.android.finsky.d.a q;
    public Account r;
    public Document s;
    public com.google.android.finsky.dfemodel.i t;
    public com.google.android.finsky.dfemodel.v u;
    public int v;
    public final com.google.wireless.android.a.a.a.a.ce w;
    public com.google.android.finsky.d.w x;

    OfferResolutionActivity() {
        android.support.v7.app.aa();
        this.q = com.google.android.finsky.m.a.aR();
        this.w = com.google.android.finsky.d.j.a(780);
    }

    private final void a(String p0) {
        v0 = new com.google.android.finsky.at.k();
        v0.a(p0).d(2131952688);
        v0.a().a(this.H_(), "OfferResolutionActivity.errorDialog");
    }

    private final void a(List p0) {
        if (this.u != 0) {
            v1 = p0.iterator();
            while (v1.hasNext()) {
                if (this.u.a(((com.google.android.finsky.billing.lightpurchase.ak)v1.next()).b.p))
                    continue;
                v1.remove();
            }
        }
    }

    private static void b(List p0) {
        v1 = p0.iterator();
        while (v1.hasNext()) {
            if (((com.google.android.finsky.billing.lightpurchase.ak)v1.next()).b.C != 0)
                continue;
            v1.remove();
        }
    }

    private final void c(int p0) {
        this.x.a(new com.google.android.finsky.d.p().a(p0).b(this));
    }

    private final void o() {
 10:    this.findViewById(2131756070).setVisibility(0);
 24:    this.findViewById(2131755388).setVisibility(8);
 39:    com.google.android.finsky.d.j.a(this.w, this.s.a.D);
 46:    this.c(781);
 58:    v1 = (ViewGroup)this.findViewById(2131756182);
 60:    v1.removeAllViews();
 65:    v10 = new ArrayList();
 77:    if (this.s.a.f != 6) {
154:        v2 = 0;
155:        while (v2 < this.s.a.n.length) {
162:            if (this.s.a.n[v2].p != 2)
173:                v10.add(new com.google.android.finsky.billing.lightpurchase.ak(this.s, this.s.a.n[v2]));
176:            v2 = v2 + 1;
            }
181:        this.a(v10);
189:        if (this.v == 1)
191:            OfferResolutionActivity.b(v10);
198:        if (v10.isEmpty())
211:            this.a(this.getString(2131952398));
            else {
237:            v8 = 0;
238:            v13 = v10.size();
242:            v14 = this.getLayoutInflater();
247:            v9 = 0;
248:            while (v9 < v13) {
254:                v2 = (com.google.android.finsky.billing.lightpurchase.ak)v10.get(v9);
264:                v3 = (ViewGroup)v14.inflate(2130969073, v1, 0);
282:                v5 = (TextView)v3.findViewById(2131755851);
291:                v6 = (TextView)v3.findViewById(2131756183);
300:                v7 = (TextView)v3.findViewById(2131755308);
306:                ((TextView)v3.findViewById(2131755114)).setText(v2.b.h);
313:                v5.setText(v2.b.g);
322:                v5.setTextColor(com.google.android.finsky.bg.h.c(this, this.s.a.f));
329:                com.google.android.finsky.m.a.X();
339:                if (com.google.android.finsky.ck.b.a(v2.b) > 0)
341:                    v4 = 1;
                    else
502:                    v4 = 0;
342:                if (v4 != 0) {
345:                    v6.setVisibility(0);
352:                    v6.setText(v2.b.l);
361:                    v6.setPaintFlags(v6.getPaintFlags() | 16);
377:                    v16 = new Object[1];
391:                    v16[0] = v2.b.l;
399:                    v6.setContentDescription(this.getResources().getString(2131951883, v16));
410:                    v15 = new Object[1];
424:                    v15[0] = v2.b.g;
430:                    v5.setContentDescription(this.getResources().getString(2131951872, v15));
                    }
                    else
507:                    v6.setVisibility(8);
441:                if (!TextUtils.isEmpty(v2.b.i))
447:                    v7.setText(v2.b.i);
                    else
513:                    v7.setVisibility(8);
450:                v3.setTag(v2);
455:                v3.setOnClickListener(this);
458:                v1.addView(v3);
463:                if (v9 < v13 - 1)
473:                    v1.addView(v14.inflate(2130969076, v1, 0));
476:                if (v8 == 0)
492:                    v2 = com.google.android.finsky.m.a.ab().a(this.s, com.google.android.finsky.m.a.ah().a(this.r), v2.b.p);
                    else
638:                    v2 = v8;
498:                v9 = v9 + 1;
499:                v8 = v2;
                }
519:            v3 = com.google.android.finsky.bg.h.c(this, this.s.a.f);
523:            if (v8 != 0 && this.s.E()) {
545:                this.findViewById(2131756179).setVisibility(0);
565:                ((ImageView)this.findViewById(2131756180)).setImageDrawable(com.google.android.finsky.bg.h.h(this, this.s.a.f));
577:                v1 = (TextView)this.findViewById(2131756181);
587:                v1.setText(this.s.F());
590:                v1.setTextColor(v3);
                }
601:            if (this.s.a.v != 0)
605:                v2 = this.s.a.v.S;
                else
636:                v2 = 0;
610:            if (!TextUtils.isEmpty(v2)) {
617:                v1 = this.findViewById(2131755307);
623:                ((TextView)v1).setText(v2);
626:                ((TextView)v1).setTextColor(v3);
630:                ((TextView)v1).setVisibility(0);
                }
            }
214:        return;
        }
 87:    if (!this.s.bj()) {
154:        v2 = 0;
155:        while (v2 < this.s.a.n.length) {
162:            if (this.s.a.n[v2].p != 2)
173:                v10.add(new com.google.android.finsky.billing.lightpurchase.ak(this.s, this.s.a.n[v2]));
176:            v2 = v2 + 1;
            }
181:        this.a(v10);
189:        if (this.v == 1)
191:            OfferResolutionActivity.b(v10);
198:        if (v10.isEmpty())
211:            this.a(this.getString(2131952398));
            else {
237:            v8 = 0;
238:            v13 = v10.size();
242:            v14 = this.getLayoutInflater();
247:            v9 = 0;
248:            while (v9 < v13) {
254:                v2 = (com.google.android.finsky.billing.lightpurchase.ak)v10.get(v9);
264:                v3 = (ViewGroup)v14.inflate(2130969073, v1, 0);
282:                v5 = (TextView)v3.findViewById(2131755851);
291:                v6 = (TextView)v3.findViewById(2131756183);
300:                v7 = (TextView)v3.findViewById(2131755308);
306:                ((TextView)v3.findViewById(2131755114)).setText(v2.b.h);
313:                v5.setText(v2.b.g);
322:                v5.setTextColor(com.google.android.finsky.bg.h.c(this, this.s.a.f));
329:                com.google.android.finsky.m.a.X();
339:                if (com.google.android.finsky.ck.b.a(v2.b) > 0)
341:                    v4 = 1;
                    else
502:                    v4 = 0;
342:                if (v4 != 0) {
345:                    v6.setVisibility(0);
352:                    v6.setText(v2.b.l);
361:                    v6.setPaintFlags(v6.getPaintFlags() | 16);
377:                    v16 = new Object[1];
391:                    v16[0] = v2.b.l;
399:                    v6.setContentDescription(this.getResources().getString(2131951883, v16));
410:                    v15 = new Object[1];
424:                    v15[0] = v2.b.g;
430:                    v5.setContentDescription(this.getResources().getString(2131951872, v15));
                    }
                    else
507:                    v6.setVisibility(8);
441:                if (!TextUtils.isEmpty(v2.b.i))
447:                    v7.setText(v2.b.i);
                    else
513:                    v7.setVisibility(8);
450:                v3.setTag(v2);
455:                v3.setOnClickListener(this);
458:                v1.addView(v3);
463:                if (v9 < v13 - 1)
473:                    v1.addView(v14.inflate(2130969076, v1, 0));
476:                if (v8 == 0)
492:                    v2 = com.google.android.finsky.m.a.ab().a(this.s, com.google.android.finsky.m.a.ah().a(this.r), v2.b.p);
                    else
638:                    v2 = v8;
498:                v9 = v9 + 1;
499:                v8 = v2;
                }
519:            v3 = com.google.android.finsky.bg.h.c(this, this.s.a.f);
523:            if (v8 != 0 && this.s.E()) {
545:                this.findViewById(2131756179).setVisibility(0);
565:                ((ImageView)this.findViewById(2131756180)).setImageDrawable(com.google.android.finsky.bg.h.h(this, this.s.a.f));
577:                v1 = (TextView)this.findViewById(2131756181);
587:                v1.setText(this.s.F());
590:                v1.setTextColor(v3);
                }
601:            if (this.s.a.v != 0)
605:                v2 = this.s.a.v.S;
                else
636:                v2 = 0;
610:            if (!TextUtils.isEmpty(v2)) {
617:                v1 = this.findViewById(2131755307);
623:                ((TextView)v1).setText(v2);
626:                ((TextView)v1).setTextColor(v3);
630:                ((TextView)v1).setVisibility(0);
                }
            }
214:        return;
        }
 97:    v3 = this.s.bl().iterator();
101:    while (v3.hasNext()) {
111:        v2 = (Document)v3.next();
114:        v4 = v2.e(1);
118:        if (v4 == 0) {
123:            v5 = new Object[1];
130:            v5[0] = v2.a.c;
132:            FinskyLog.c("Skipping subscription doc, no PURCHASE offer: %s", v5);
            }
            else
141:            v10.add(new com.google.android.finsky.billing.lightpurchase.ak(v2, v4));
        }
135:    goto 179;
154:    v2 = 0;
155:    while (v2 < this.s.a.n.length) {
162:        if (this.s.a.n[v2].p != 2)
173:            v10.add(new com.google.android.finsky.billing.lightpurchase.ak(this.s, this.s.a.n[v2]));
176:        v2 = v2 + 1;
        }
181:    this.a(v10);
189:    if (this.v == 1)
191:        OfferResolutionActivity.b(v10);
198:    if (v10.isEmpty())
211:        this.a(this.getString(2131952398));
        else {
237:        v8 = 0;
238:        v13 = v10.size();
242:        v14 = this.getLayoutInflater();
247:        v9 = 0;
248:        while (v9 < v13) {
254:            v2 = (com.google.android.finsky.billing.lightpurchase.ak)v10.get(v9);
264:            v3 = (ViewGroup)v14.inflate(2130969073, v1, 0);
282:            v5 = (TextView)v3.findViewById(2131755851);
291:            v6 = (TextView)v3.findViewById(2131756183);
300:            v7 = (TextView)v3.findViewById(2131755308);
306:            ((TextView)v3.findViewById(2131755114)).setText(v2.b.h);
313:            v5.setText(v2.b.g);
322:            v5.setTextColor(com.google.android.finsky.bg.h.c(this, this.s.a.f));
329:            com.google.android.finsky.m.a.X();
339:            if (com.google.android.finsky.ck.b.a(v2.b) > 0)
341:                v4 = 1;
                else
502:                v4 = 0;
342:            if (v4 != 0) {
345:                v6.setVisibility(0);
352:                v6.setText(v2.b.l);
361:                v6.setPaintFlags(v6.getPaintFlags() | 16);
377:                v16 = new Object[1];
391:                v16[0] = v2.b.l;
399:                v6.setContentDescription(this.getResources().getString(2131951883, v16));
410:                v15 = new Object[1];
424:                v15[0] = v2.b.g;
430:                v5.setContentDescription(this.getResources().getString(2131951872, v15));
                }
                else
507:                v6.setVisibility(8);
441:            if (!TextUtils.isEmpty(v2.b.i))
447:                v7.setText(v2.b.i);
                else
513:                v7.setVisibility(8);
450:            v3.setTag(v2);
455:            v3.setOnClickListener(this);
458:            v1.addView(v3);
463:            if (v9 < v13 - 1)
473:                v1.addView(v14.inflate(2130969076, v1, 0));
476:            if (v8 == 0)
492:                v2 = com.google.android.finsky.m.a.ab().a(this.s, com.google.android.finsky.m.a.ah().a(this.r), v2.b.p);
                else
638:                v2 = v8;
498:            v9 = v9 + 1;
499:            v8 = v2;
            }
519:        v3 = com.google.android.finsky.bg.h.c(this, this.s.a.f);
523:        if (v8 != 0 && this.s.E()) {
545:            this.findViewById(2131756179).setVisibility(0);
565:            ((ImageView)this.findViewById(2131756180)).setImageDrawable(com.google.android.finsky.bg.h.h(this, this.s.a.f));
577:            v1 = (TextView)this.findViewById(2131756181);
587:            v1.setText(this.s.F());
590:            v1.setTextColor(v3);
            }
601:        if (this.s.a.v != 0)
605:            v2 = this.s.a.v.S;
            else
636:            v2 = 0;
610:        if (!TextUtils.isEmpty(v2)) {
617:            v1 = this.findViewById(2131755307);
623:            ((TextView)v1).setText(v2);
626:            ((TextView)v1).setTextColor(v3);
630:            ((TextView)v1).setVisibility(0);
            }
        }
    }

    public final void a(int p0, Bundle p1) {
        this.setResult(0);
        this.finish();
    }

    public final void a(VolleyError p0) {
        this.a(com.google.android.finsky.api.m.a(this, p0));
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final void b(int p0, Bundle p1) {
    }

    public final void f_(int p0) {
    }

    public void finish() {
        this.c(603);
        super.finish();
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.w;
    }

    public final void m() {
    }

    public final void m_() {
        this.s = this.t.b();
        if (this.s == 0)
            this.a(this.getString(2131952398));
        else if (!com.google.android.finsky.m.a.Y().a(this.s, com.google.android.finsky.m.a.dn(), com.google.android.finsky.m.a.ah().a(this.r)))
            this.a(com.google.android.finsky.m.a.ax().a(this.s));
        else
            this.o();
    }

    public final com.google.android.finsky.d.w n() {
        return this.x;
    }

    public final void o_() {
        FinskyLog.e("Not using impression id's.", new Object[0]);
    }

    public void onClick(View p0) {
        v0 = (com.google.android.finsky.billing.lightpurchase.ak)p0.getTag();
        v1 = new Intent();
        v1.putExtra("OfferResolutionActivity.document", v0.a);
        v1.putExtra("OfferResolutionActivity.offer", ParcelableProto.a(v0.b));
        this.x.b(new com.google.android.finsky.d.d(this).a(782).a(v0.a.a.D));
        this.setResult(-1, v1);
        this.finish();
    }

    protected void onCreate(Bundle p0) {
        v3 = 1;
        super.onCreate(p0);
        this.setContentView(2130969072);
        v4 = this.getIntent();
        v4.getParcelableExtra("OfferResolutionActivity.dfeToc");
        this.r = (Account)v4.getParcelableExtra("OfferResolutionActivity.account");
        this.v = v4.getIntExtra("OfferResolutionActivity.provisioningType", 0);
        if (this.v == 1)
            v1 = 2131952247;
        else
            v1 = 2131952682;
        ((TextView)this.findViewById(2131755114)).setText(v1);
        this.x = this.q.a(p0, v4).a(this.r);
        this.s = (Document)v4.getParcelableExtra("OfferResolutionActivity.doc");
        if (v4.hasExtra("OfferResolutionActivity.offerFilter"))
            this.u = com.google.android.finsky.dfemodel.v.valueOf(v4.getStringExtra("OfferResolutionActivity.offerFilter"));
        if (p0 == 0)
            this.x.a(new com.google.android.finsky.d.p().b(this));
        if (this.s == 0) {
            this.findViewById(2131756070).setVisibility(8);
            this.findViewById(2131755388).setVisibility(0);
            this.c(213);
            com.google.android.finsky.m.a.ab();
            this.t = new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.b(this.r.name), com.google.android.finsky.api.l.a(v4.getStringExtra("OfferResolutionActivity.docid")), 0, com.google.android.finsky.billing.common.v.b(com.google.android.finsky.m.a.ah().a(this.r)));
            this.t.a(this);
            this.t.a(this);
            return;
        }
        if (com.google.android.finsky.m.a.dj().a(12603117)) {
            if (this.s.a.e == 20 || this.s.a.e == 19)
                v0 = 1;
            else
                v0 = 0;
            com.google.android.finsky.m.a.ab();
            if (v0 == 0 || !com.google.android.finsky.billing.common.v.a(com.google.android.finsky.m.a.ah().a(this.r)))
                v3 = 0;
        }
        else
            v3 = 0;
        if (v3 != 0) {
            this.findViewById(2131756070).setVisibility(8);
            this.findViewById(2131755388).setVisibility(0);
            this.c(213);
            com.google.android.finsky.m.a.ab();
            this.t = new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.b(this.r.name), com.google.android.finsky.api.l.a(v4.getStringExtra("OfferResolutionActivity.docid")), 0, com.google.android.finsky.billing.common.v.b(com.google.android.finsky.m.a.ah().a(this.r)));
            this.t.a(this);
            this.t.a(this);
        }
        else
            this.o();
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        this.x.a(p0);
    }

    protected void onStart() {
        super.onStart();
        if (this.t != 0) {
            this.t.a(this);
            this.t.a(this);
        }
    }

    protected void onStop() {
        if (this.t != 0) {
            this.t.b(this);
            this.t.b(this);
        }
        super.onStop();
    }

}
