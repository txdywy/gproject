package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputFilter$LengthFilter;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.l;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.billing.lightpurchase.GiftEmailParams;
import com.google.android.finsky.billing.lightpurchase.am;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.lightpurchase.i;
import com.google.android.finsky.billing.lightpurchase.t;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.InputWithCharacterCounter;
import com.google.android.finsky.frameworkviews.LabelEditText;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.dfe.api.d;
import com.google.android.play.dfe.api.g;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.by;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class com.google.android.finsky.billing.lightpurchase.e.x extends com.google.android.finsky.billing.lightpurchase.d.h implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.d.ad, com.google.android.finsky.frameworkviews.aa
{

    public static final int a;
    public static final int b;
    public String af;
    public String ag;
    public View ah;
    public TextView aj;
    public TextView ak;
    public LabelEditText al;
    public LabelEditText am;
    public InputWithCharacterCounter an;
    public final com.google.wireless.android.a.a.a.a.ce ao;
    public Account c;
    public int d;
    public Document e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        com.google.android.finsky.billing.lightpurchase.e.x.a = ((Integer)com.google.android.finsky.aa.b.fo.b()).intValue();
        com.google.android.finsky.billing.lightpurchase.e.x.b = ((Integer)com.google.android.finsky.aa.b.fp.b()).intValue();
    }

    x() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.ao = com.google.android.finsky.d.j.a(1310);
    }

    public static com.google.android.finsky.billing.lightpurchase.e.x a(Account p0, int p1, String p2, int p3, String p4, Document p5, GiftEmailParams p6) {
        v0 = new Bundle();
        v1 = new com.google.android.finsky.billing.lightpurchase.e.x();
        v0.putParcelable("GiftEmailStep.account", p0);
        v0.putInt("GiftEmailStep.backend", p1);
        v0.putString("GiftEmailStep.fullDocid", p2);
        v0.putString("GiftEmailStep.offerId", p4);
        v0.putInt("GiftEmailStep.offerType", p3);
        if (p6 != 0) {
            v0.putString("GiftEmailStep.recipientEmailAddress", p6.b);
            v0.putString("GiftEmailStep.senderName", p6.a);
            v0.putString("GiftEmailStep.giftMessage", p6.c);
        }
        if (p5 != 0)
            v0.putParcelable("GiftEmailStep.document", p5);
        v1.f(v0);
        return v1;
    }

    private final void ab() {
        v2 = 1;
        if (this.e.a.e == 48)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0)
            v0 = 2131558666;
        else
            v0 = com.google.android.finsky.bg.h.b(this.d);
        this.ah.findViewById(2131756171).setBackgroundColor(this.i().getColor(v0));
        if (v1 != 0)
            v4 = 0;
        else
            v4 = 1;
        ((LinearLayout)this.ah.findViewById(2131756172)).setOrientation(v4);
        this.aj.setText(this.e.a.g);
        if (v1 != 0) {
            this.ak.setText(this.e.a.n[0].g);
            this.ak.setVisibility(0);
        }
        else if (this.e.a.n.length > 1) {
            v0 = 0;
            if (!TextUtils.isEmpty(this.g))
                v0 = this.e.a(this.g);
            if (v0 != 0) {
                if (!(v0.b & 4))
                    v2 = 0;
                if (v2 != 0) {
                    this.ak.setText(v0.h);
                    this.ak.setVisibility(0);
                }
            }
        }
    }

    public final void X() {
        v1 = 1;
        this.h = this.am.getTextValue();
        this.i = this.al.getTextValue();
        this.ag = this.an.getTextValue();
        v0 = 0;
        if (TextUtils.isEmpty(this.h)) {
            com.google.android.finsky.bg.ae.a(this.am, this.c(2131953268), this.c(2131953267));
            v0 = 1;
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(this.h).matches()) {
            com.google.android.finsky.bg.ae.a(this.am, this.c(2131953268), this.c(2131952106));
            v0 = 1;
        }
        if (TextUtils.isEmpty(this.i))
            com.google.android.finsky.bg.ae.a(this.al, this.c(2131952234), this.c(2131952233));
        else
            v1 = v0;
        if (v1 == 0) {
            this.a(1311, 0);
            v1 = new com.google.android.finsky.billing.lightpurchase.t();
            v1.c = this.ag;
            v1.a = this.i;
            v1.b = this.h;
            ((com.google.android.finsky.billing.lightpurchase.am)this.aa()).c.a(new GiftEmailParams(v1));
        }
    }

    public final void X_() {
        v0 = this.h();
        v2 = new Object[1];
        v2[0] = Integer.valueOf(com.google.android.finsky.billing.lightpurchase.e.x.a);
        com.google.android.finsky.bg.a.a(v0, this.a(2131952484, v2), this.an, 0);
        com.google.android.finsky.bg.s.a(v0, this.an);
    }

    final void Y() {
        if (TextUtils.isEmpty(this.i) && !this.al.hasFocus())
            this.al.setTextValue(this.af);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.ah = p0.inflate(2130969071, p1, 0);
        v0 = (ScrollView)this.ah.findViewById(2131756174);
        v0.getViewTreeObserver().addOnGlobalLayoutListener(new com.google.android.finsky.billing.lightpurchase.e.y(this, v0));
        this.aj = (TextView)this.ah.findViewById(2131756147);
        this.ak = (TextView)this.ah.findViewById(2131756173);
        v2 = new Object[1];
        v2[0] = this.c.name;
        ((TextView)this.ah.findViewById(2131756178)).setText(this.a(2131952246, v2));
        this.am = (LabelEditText)this.ah.findViewById(2131756175);
        this.am.setTextValue(this.h);
        com.google.android.finsky.bg.ae.a(this.h(), this.am, 5, 5);
        this.al = (LabelEditText)this.ah.findViewById(2131756176);
        this.al.setTextValue(this.i);
        v1 = new InputFilter[1];
        v1[0] = new InputFilter$LengthFilter(com.google.android.finsky.billing.lightpurchase.e.x.b);
        this.al.setFilters(v1);
        com.google.android.finsky.bg.ae.a(this.h(), this.al, 5, 5);
        this.an = (InputWithCharacterCounter)this.ah.findViewById(2131756177);
        this.an.a(this.ag, this.c(2131952493), com.google.android.finsky.billing.lightpurchase.e.x.a, this);
        com.google.android.finsky.bg.ae.a(this.h(), this.an.getEditText(), 6, 6);
        return this.ah;
    }

    public final String a(Resources p0) {
        return p0.getString(2131951948);
    }

    public final void a(VolleyError p0) {
        FinskyLog.c(p0.toString(), new Object[0]);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.c = (Account)this.q.getParcelable("GiftEmailStep.account");
        this.d = this.q.getInt("GiftEmailStep.backend");
        this.f = this.q.getString("GiftEmailStep.fullDocid");
        this.g = this.q.getString("GiftEmailStep.offerId");
        this.q.getInt("GiftEmailStep.offerType");
        this.h = this.q.getString("GiftEmailStep.recipientEmailAddress");
        this.i = this.q.getString("GiftEmailStep.senderName");
        this.ag = this.q.getString("GiftEmailStep.giftMessage");
        if (p0 != 0) {
            this.e = (Document)p0.getParcelable("GiftEmailStep.document");
            this.h = p0.getString("GiftEmailStep.recipientEmailAddress");
            this.i = p0.getString("GiftEmailStep.senderName");
            this.af = p0.getString("GiftEmailStep.defaultSenderName");
            this.ag = p0.getString("GiftEmailStep.giftMessage");
        }
        else {
            this.e = (Document)this.q.getParcelable("GiftEmailStep.document");
            this.h = this.q.getString("GiftEmailStep.recipientEmailAddress");
            this.i = this.q.getString("GiftEmailStep.senderName");
            this.ag = this.q.getString("GiftEmailStep.giftMessage");
        }
    }

    public final void b_(Object p0) {
        if (((com.google.wireless.android.finsky.dfe.nano.by)p0).c == 0)
            FinskyLog.c("Got empty document for displaying gift item.", new Object[0]);
        else {
            this.e = new Document(((com.google.wireless.android.finsky.dfe.nano.by)p0).c);
            if (this.l())
                this.ab();
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putParcelable("GiftEmailStep.document", this.e);
        p0.putString("GiftEmailStep.recipientEmailAddress", this.am.getTextValue());
        p0.putString("GiftEmailStep.senderName", this.al.getTextValue());
        p0.putString("GiftEmailStep.defaultSenderName", this.af);
        p0.putString("GiftEmailStep.giftMessage", this.an.getTextValue());
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.ao;
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.ah.getContext(), this.c(2131953123), this.ah, 0);
        v0 = this.ah.findFocus();
        if (TextUtils.isEmpty(this.h))
            com.google.android.finsky.bg.s.a(this.h(), this.am);
        else if (v0 != 0)
            com.google.android.finsky.bg.s.a(this.h(), (EditText)v0);
        if (this.e == 0)
            com.google.android.finsky.m.a.b(this.c.name).a(com.google.android.finsky.api.l.a(this.f), 0, 0, 0, 0, this, this);
        else
            this.ab();
        if (this.af == 0)
            com.google.android.finsky.m.a.bf().a(this.c).a(new com.google.android.finsky.billing.lightpurchase.e.z(this), this, 1);
        else
            this.Y();
    }

}
