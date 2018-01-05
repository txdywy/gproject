package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OfferResolutionActivity extends aa implements OnClickListener, C0657w, C0998m, ah, C1031w {
    public final C2471a f9672q = C1473m.f7980a.aR();
    public Account f9673r;
    public Document f9674s;
    public C2719i f9675t;
    public C2731v f9676u;
    public int f9677v;
    public final ce f9678w = C2482j.m13283a(780);
    public C2495w f9679x;

    protected void onCreate(Bundle bundle) {
        int i;
        boolean z = true;
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.light_purchase_offer_resolution);
        Intent intent = getIntent();
        intent.getParcelableExtra("OfferResolutionActivity.dfeToc");
        this.f9673r = (Account) intent.getParcelableExtra("OfferResolutionActivity.account");
        this.f9677v = intent.getIntExtra("OfferResolutionActivity.provisioningType", 0);
        TextView textView = (TextView) findViewById(C7582R.id.title);
        if (this.f9677v == 1) {
            i = C7582R.string.gift_offer_resolution_dialog_title;
        } else {
            i = C7582R.string.offer_resolution_dialog_title;
        }
        textView.setText(i);
        this.f9679x = this.f9672q.m13180a(bundle, intent).m13366a(this.f9673r);
        String stringExtra = intent.getStringExtra("OfferResolutionActivity.docid");
        this.f9674s = (Document) intent.getParcelableExtra("OfferResolutionActivity.doc");
        if (intent.hasExtra("OfferResolutionActivity.offerFilter")) {
            this.f9676u = C2731v.valueOf(intent.getStringExtra("OfferResolutionActivity.offerFilter"));
        }
        if (bundle == null) {
            this.f9679x.m13370a(new C2488p().m13345b(this));
        }
        if (this.f9674s != null) {
            if (C1473m.f7980a.dj().mo2294a(12603117)) {
                boolean z2 = this.f9674s.f14885a.f12098e == 20 || this.f9674s.f14885a.f12098e == 19;
                C1473m.f7980a.ab();
                boolean a = C1804v.m9803a(C1473m.f7980a.ah().mo2811a(this.f9673r));
                if (!(z2 && a)) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                m10095o();
                return;
            }
        }
        findViewById(C7582R.id.contents).setVisibility(8);
        findViewById(C7582R.id.loading_indicator).setVisibility(0);
        m10094c(213);
        C1473m.f7980a.ab();
        this.f9675t = new C2719i(C1473m.f7980a.mo2112b(this.f9673r.name), C1289l.m7694a(stringExtra), false, C1804v.m9805b(C1473m.f7980a.ah().mo2811a(this.f9673r)));
        this.f9675t.m11918a((C1031w) this);
        this.f9675t.m11917a((C0657w) this);
    }

    protected void onStart() {
        super.onStart();
        if (this.f9675t != null) {
            this.f9675t.m11918a((C1031w) this);
            this.f9675t.m11917a((C0657w) this);
        }
    }

    protected void onStop() {
        if (this.f9675t != null) {
            this.f9675t.m11922b((C1031w) this);
            this.f9675t.m11921b((C0657w) this);
        }
        super.onStop();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9679x.m13377a(bundle);
    }

    private final void m10095o() {
        bl e;
        findViewById(C7582R.id.contents).setVisibility(0);
        findViewById(C7582R.id.loading_indicator).setVisibility(8);
        C2482j.m13285a(this.f9678w, this.f9674s.f14885a.f12087D);
        m10094c(781);
        ViewGroup viewGroup = (ViewGroup) findViewById(C7582R.id.offers);
        viewGroup.removeAllViews();
        List arrayList = new ArrayList();
        if (this.f9674s.f14885a.f12099f == 6 && this.f9674s.bj()) {
            for (Document document : this.f9674s.bl()) {
                e = document.m14649e(1);
                if (e == null) {
                    FinskyLog.m21665c("Skipping subscription doc, no PURCHASE offer: %s", document.f14885a.f12096c);
                } else {
                    arrayList.add(new ak(document, e));
                }
            }
        } else {
            for (bl blVar : this.f9674s.f14885a.f12107n) {
                if (blVar.f11926p != 2) {
                    arrayList.add(new ak(this.f9674s, blVar));
                }
            }
        }
        m10092a(arrayList);
        if (this.f9677v == 1) {
            m10093b(arrayList);
        }
        if (arrayList.isEmpty()) {
            m10091a(getString(C7582R.string.item_unavailable_message));
            return;
        }
        CharSequence charSequence;
        int i = this.f9674s.f14885a.f12099f;
        C2197a a = C1473m.f7980a.ah().mo2811a(this.f9673r);
        boolean z = false;
        int size = arrayList.size();
        LayoutInflater layoutInflater = getLayoutInflater();
        int i2 = 0;
        while (i2 < size) {
            boolean z2;
            ak akVar = (ak) arrayList.get(i2);
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C7582R.layout.light_purchase_offer_resolution_entry, viewGroup, false);
            TextView textView = (TextView) viewGroup2.findViewById(C7582R.id.price);
            TextView textView2 = (TextView) viewGroup2.findViewById(C7582R.id.full_price);
            TextView textView3 = (TextView) viewGroup2.findViewById(C7582R.id.byline);
            ((TextView) viewGroup2.findViewById(C7582R.id.title)).setText(akVar.f9750b.f11918h);
            textView.setText(akVar.f9750b.f11917g);
            textView.setTextColor(C1608h.m9255c(this, i));
            e = akVar.f9750b;
            C1473m.f7980a.mo2044X();
            if ((C2288b.m11784a(e) > 0.0f ? 1 : null) != null) {
                textView2.setVisibility(0);
                textView2.setText(akVar.f9750b.f11922l);
                textView2.setPaintFlags(textView2.getPaintFlags() | 16);
                textView2.setContentDescription(getResources().getString(C7582R.string.content_description_full_price, new Object[]{akVar.f9750b.f11922l}));
                textView.setContentDescription(getResources().getString(C7582R.string.content_description_current_price, new Object[]{akVar.f9750b.f11917g}));
            } else {
                textView2.setVisibility(8);
            }
            if (TextUtils.isEmpty(akVar.f9750b.f11919i)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(akVar.f9750b.f11919i);
            }
            viewGroup2.setTag(akVar);
            viewGroup2.setOnClickListener(this);
            viewGroup.addView(viewGroup2);
            if (i2 < size - 1) {
                viewGroup.addView(layoutInflater.inflate(C7582R.layout.light_purchase_separator, viewGroup, false));
            }
            if (z) {
                z2 = z;
            } else {
                z2 = C1473m.f7980a.ab().m9807a(this.f9674s, a, akVar.f9750b.f11926p);
            }
            i2++;
            z = z2;
        }
        ColorStateList c = C1608h.m9255c(this, i);
        if (z && this.f9674s.m14616E()) {
            findViewById(C7582R.id.voucher_section).setVisibility(0);
            ((ImageView) findViewById(C7582R.id.voucher_icon)).setImageDrawable(C1608h.m9264h(this, i));
            TextView textView4 = (TextView) findViewById(C7582R.id.voucher_message);
            textView4.setText(this.f9674s.m14617F());
            textView4.setTextColor(c);
        }
        C2440m c2440m = this.f9674s.f14885a.f12115v;
        if (c2440m != null) {
            charSequence = c2440m.f13112S;
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView4 = (TextView) findViewById(C7582R.id.subtitle);
            textView4.setText(charSequence);
            textView4.setTextColor(c);
            textView4.setVisibility(0);
        }
    }

    private final void m10092a(List list) {
        if (this.f9676u != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!this.f9676u.m14768a(((ak) it.next()).f9750b.f11926p)) {
                    it.remove();
                }
            }
        }
    }

    private static void m10093b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ak) it.next()).f9750b.f11908C) {
                it.remove();
            }
        }
    }

    private final void m10094c(int i) {
        this.f9679x.m13370a(new C2488p().m13340a(i).m13345b(this));
    }

    public void onClick(View view) {
        ak akVar = (ak) view.getTag();
        Intent intent = new Intent();
        intent.putExtra("OfferResolutionActivity.document", akVar.f9749a);
        intent.putExtra("OfferResolutionActivity.offer", ParcelableProto.m21671a(akVar.f9750b));
        this.f9679x.m13379b(new C2475d(this).m13256a(782).m13258a(akVar.f9749a.f14885a.f12087D));
        setResult(-1, intent);
        finish();
    }

    public final void m_() {
        this.f9674s = this.f9675t.m14722b();
        if (this.f9674s == null) {
            m10091a(getString(C7582R.string.item_unavailable_message));
        } else if (C1473m.f7980a.mo2045Y().m11649a(this.f9674s, C1473m.f7980a.dn(), C1473m.f7980a.ah().mo2811a(this.f9673r))) {
            m10095o();
        } else {
            m10091a(C1473m.f7980a.ax().m11783a(this.f9674s));
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        m10091a(C1290m.m7702a(this, volleyError));
    }

    private final void m10091a(String str) {
        C1508k c1508k = new C1508k();
        c1508k.m8852a(str).m8860d((int) C7582R.string.ok);
        c1508k.mo2272a().m625a(H_(), "OfferResolutionActivity.errorDialog");
    }

    public final void mo1202a(int i, Bundle bundle) {
        setResult(0);
        finish();
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public ce getPlayStoreUiElement() {
        return this.f9678w;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }

    public final C2495w mo1224n() {
        return this.f9679x;
    }

    public final void o_() {
        FinskyLog.m21669e("Not using impression id's.", new Object[0]);
    }

    public final void mo1222m() {
    }

    public void finish() {
        m10094c(603);
        super.finish();
    }
}
