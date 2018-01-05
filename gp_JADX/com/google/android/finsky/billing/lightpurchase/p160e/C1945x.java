package com.google.android.finsky.billing.lightpurchase.p160e;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.lightpurchase.C1961t;
import com.google.android.finsky.billing.lightpurchase.GiftEmailParams;
import com.google.android.finsky.billing.lightpurchase.am;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.InputWithCharacterCounter;
import com.google.android.finsky.frameworkviews.LabelEditText;
import com.google.android.finsky.frameworkviews.aa;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.by;
import com.squareup.leakcanary.C7582R;

public final class C1945x extends C1076h implements C0657w, C0660x, ad, aa {
    public static final int f9924a = ((Integer) C0955b.fo.m28964b()).intValue();
    public static final int f9925b = ((Integer) C0955b.fp.m28964b()).intValue();
    public String af;
    public String ag;
    public View ah;
    public TextView aj;
    public TextView ak;
    public LabelEditText al;
    public LabelEditText am;
    public InputWithCharacterCounter an;
    public final ce ao = C2482j.m13283a(1310);
    public Account f9926c;
    public int f9927d;
    public Document f9928e;
    public String f9929f;
    public String f9930g;
    public String f9931h;
    public String f9932i;

    public static C1945x m10369a(Account account, int i, String str, int i2, String str2, Document document, GiftEmailParams giftEmailParams) {
        Bundle bundle = new Bundle();
        Fragment c1945x = new C1945x();
        bundle.putParcelable("GiftEmailStep.account", account);
        bundle.putInt("GiftEmailStep.backend", i);
        bundle.putString("GiftEmailStep.fullDocid", str);
        bundle.putString("GiftEmailStep.offerId", str2);
        bundle.putInt("GiftEmailStep.offerType", i2);
        if (giftEmailParams != null) {
            bundle.putString("GiftEmailStep.recipientEmailAddress", giftEmailParams.f9634b);
            bundle.putString("GiftEmailStep.senderName", giftEmailParams.f9633a);
            bundle.putString("GiftEmailStep.giftMessage", giftEmailParams.f9635c);
        }
        if (document != null) {
            bundle.putParcelable("GiftEmailStep.document", document);
        }
        c1945x.m600f(bundle);
        return c1945x;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9926c = (Account) bundle2.getParcelable("GiftEmailStep.account");
        this.f9927d = bundle2.getInt("GiftEmailStep.backend");
        this.f9929f = bundle2.getString("GiftEmailStep.fullDocid");
        this.f9930g = bundle2.getString("GiftEmailStep.offerId");
        bundle2.getInt("GiftEmailStep.offerType");
        this.f9931h = bundle2.getString("GiftEmailStep.recipientEmailAddress");
        this.f9932i = bundle2.getString("GiftEmailStep.senderName");
        this.ag = bundle2.getString("GiftEmailStep.giftMessage");
        if (bundle != null) {
            this.f9928e = (Document) bundle.getParcelable("GiftEmailStep.document");
            this.f9931h = bundle.getString("GiftEmailStep.recipientEmailAddress");
            this.f9932i = bundle.getString("GiftEmailStep.senderName");
            this.af = bundle.getString("GiftEmailStep.defaultSenderName");
            this.ag = bundle.getString("GiftEmailStep.giftMessage");
            return;
        }
        this.f9928e = (Document) bundle2.getParcelable("GiftEmailStep.document");
        this.f9931h = bundle2.getString("GiftEmailStep.recipientEmailAddress");
        this.f9932i = bundle2.getString("GiftEmailStep.senderName");
        this.ag = bundle2.getString("GiftEmailStep.giftMessage");
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putParcelable("GiftEmailStep.document", this.f9928e);
        bundle.putString("GiftEmailStep.recipientEmailAddress", this.am.getTextValue());
        bundle.putString("GiftEmailStep.senderName", this.al.getTextValue());
        bundle.putString("GiftEmailStep.defaultSenderName", this.af);
        bundle.putString("GiftEmailStep.giftMessage", this.an.getTextValue());
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ah = layoutInflater.inflate(C7582R.layout.light_purchase_gift_email_step, viewGroup, false);
        ScrollView scrollView = (ScrollView) this.ah.findViewById(C7582R.id.scroll_view);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C1946y(this, scrollView));
        this.aj = (TextView) this.ah.findViewById(C7582R.id.item_title);
        this.ak = (TextView) this.ah.findViewById(C7582R.id.item_offer_title);
        ((TextView) this.ah.findViewById(C7582R.id.gift_email_copy)).setText(m572a((int) C7582R.string.gift_email_copy_description, this.f9926c.name));
        this.am = (LabelEditText) this.ah.findViewById(C7582R.id.to_email_text);
        this.am.setTextValue(this.f9931h);
        ae.m9215a(m603h(), this.am, 5, 5);
        this.al = (LabelEditText) this.ah.findViewById(C7582R.id.from_name_text);
        this.al.setTextValue(this.f9932i);
        this.al.setFilters(new InputFilter[]{new LengthFilter(f9925b)});
        ae.m9215a(m603h(), this.al, 5, 5);
        this.an = (InputWithCharacterCounter) this.ah.findViewById(C7582R.id.gift_message_text);
        this.an.m16027a(this.ag, m592c((int) C7582R.string.message_hint), f9924a, this);
        ae.m9215a(m603h(), this.an.getEditText(), 6, 6);
        return this.ah;
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.ah.getContext(), m592c((int) C7582R.string.send_gift), this.ah, false);
        View findFocus = this.ah.findFocus();
        if (TextUtils.isEmpty(this.f9931h)) {
            C1618s.m9294a(m603h(), this.am);
        } else if (findFocus != null) {
            C1618s.m9294a(m603h(), (EditText) findFocus);
        }
        if (this.f9928e == null) {
            C1473m.f7980a.mo2112b(this.f9926c.name).mo1599a(C1289l.m7694a(this.f9929f), false, false, null, null, (C0660x) this, (C0657w) this);
        } else {
            ab();
        }
        if (this.af == null) {
            C1473m.f7980a.bf().mo2019a(this.f9926c).mo5377a(new C1947z(this), this, true);
        } else {
            m10371Y();
        }
    }

    public final String mo1406a(Resources resources) {
        return resources.getString(C7582R.string.continue_text);
    }

    public final void mo1405X() {
        Object obj = 1;
        this.f9931h = this.am.getTextValue();
        this.f9932i = this.al.getTextValue();
        this.ag = this.an.getTextValue();
        Object obj2 = null;
        if (TextUtils.isEmpty(this.f9931h)) {
            ae.m9219a(this.am, m592c((int) C7582R.string.to_email_hint_short), m592c((int) C7582R.string.to_email_hint));
            obj2 = 1;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(this.f9931h).matches()) {
            ae.m9219a(this.am, m592c((int) C7582R.string.to_email_hint_short), m592c((int) C7582R.string.email_format_error));
            int i = 1;
        }
        if (TextUtils.isEmpty(this.f9932i)) {
            ae.m9219a(this.al, m592c((int) C7582R.string.from_name_hint_short), m592c((int) C7582R.string.from_name_hint));
        } else {
            obj = obj2;
        }
        if (obj == null) {
            m6694a(1311, null);
            am amVar = (am) aa();
            C1961t c1961t = new C1961t();
            c1961t.f9971c = this.ag;
            c1961t.f9969a = this.f9932i;
            c1961t.f9970b = this.f9931h;
            amVar.f9754c.m10394a(new GiftEmailParams(c1961t));
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.ao;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c(volleyError.toString(), new Object[0]);
    }

    private final void ab() {
        int i;
        int i2;
        int i3 = 1;
        int i4 = this.f9928e.f14885a.f12098e == 48 ? 1 : 0;
        View findViewById = this.ah.findViewById(C7582R.id.gift_dialog_header);
        Resources i5 = m605i();
        if (i4 != 0) {
            i = C7582R.color.play_credit_primary;
        } else {
            i = C1608h.m9251b(this.f9927d);
        }
        findViewById.setBackgroundColor(i5.getColor(i));
        LinearLayout linearLayout = (LinearLayout) this.ah.findViewById(C7582R.id.item_title_container);
        if (i4 != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        this.aj.setText(this.f9928e.f14885a.f12100g);
        bl[] blVarArr = this.f9928e.f14885a.f12107n;
        i2 = blVarArr.length;
        if (i4 != 0) {
            this.ak.setText(blVarArr[0].f11917g);
            this.ak.setVisibility(0);
        } else if (i2 > 1) {
            bl blVar = null;
            if (!TextUtils.isEmpty(this.f9930g)) {
                blVar = this.f9928e.m14639a(this.f9930g);
            }
            if (blVar != null) {
                if ((blVar.f11912b & 4) == 0) {
                    i3 = 0;
                }
                if (i3 != 0) {
                    this.ak.setText(blVar.f11918h);
                    this.ak.setVisibility(0);
                }
            }
        }
    }

    final void m10371Y() {
        if (TextUtils.isEmpty(this.f9932i) && !this.al.hasFocus()) {
            this.al.setTextValue(this.af);
        }
    }

    public final void X_() {
        Context h = m603h();
        C1601a.m9199a(h, m572a((int) C7582R.string.max_character_count_reached, Integer.valueOf(f9924a)), this.an, false);
        C1618s.m9293a(h, this.an);
    }

    public final /* synthetic */ void b_(Object obj) {
        cv cvVar = ((by) obj).c;
        if (cvVar == null) {
            FinskyLog.m21665c("Got empty document for displaying gift item.", new Object[0]);
            return;
        }
        this.f9928e = new Document(cvVar);
        if (m612l()) {
            ab();
        }
    }
}
