package com.google.android.finsky.billing.redeem.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputFilter$AllCaps;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.bg.v;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.redeem.a;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;

public final class com.google.android.finsky.billing.redeem.a.d extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public String b;
    public View c;
    public EditText d;
    public TextView e;

    d() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(881);
    }

    public static com.google.android.finsky.billing.redeem.a.d a(String p0, String p1, String p2, PurchaseFlowConfig p3) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v0.putString("RedeemScreenStep.prefill_code", p1);
        v0.putString("RedeemScreenStep.error_message_html", p2);
        com.google.android.finsky.m.a.aH().b(v0, p3);
        v1 = new com.google.android.finsky.billing.redeem.a.d();
        v1.f(v0);
        return v1;
    }

    private final void ab() {
        com.google.android.finsky.bg.v.a(this.h(), this.d);
        com.google.android.finsky.bg.a.a(this.c.getContext(), this.e.getText().toString(), this.c, 0);
    }

    private final void ac() {
        if (this.c == 0)
            FinskyLog.e("Null mMainView.", new Object[0]);
        else if (this.b != 0) {
            this.e.setVisibility(0);
            com.google.android.finsky.bg.ae.a(this.e, this.b);
            this.d.setTextColor(this.i().getColor(2131558789));
        }
        else
            this.e.setVisibility(8);
    }

    public final void X() {
        this.a(0);
    }

    final void Y() {
        if (!TextUtils.isEmpty(this.d.getText()))
            v1 = 1;
        else
            v1 = 0;
        ((com.google.android.finsky.billing.redeem.a)this.aa()).b(v1);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.c = p0.inflate(2130969331, p1, 0);
        this.d = (EditText)this.c.findViewById(2131756600);
        v0 = this.q.getString("RedeemScreenStep.prefill_code");
        if (p2 == 0 && !TextUtils.isEmpty(v0))
            this.d.setText(v0);
        com.google.android.finsky.bg.ae.a(this.h(), this.d, 6, 7);
        v1 = this.q.getString("authAccount");
        ((TextView)this.c.findViewById(2131755755)).setText(com.google.android.finsky.m.a.U().d(v1));
        v7 = (TextView)this.c.findViewById(2131755352);
        v3 = new Object[2];
        v3[0] = com.google.android.finsky.billing.f.a((String)com.google.android.finsky.aa.b.t.b());
        v3[1] = this.a(this.i());
        com.google.android.finsky.bg.ae.a(v7, this.a(2131952989, v3));
        this.d.addTextChangedListener(new com.google.android.finsky.billing.redeem.a.e(this, this.d.getTextColors()));
        this.d.setOnEditorActionListener(new com.google.android.finsky.billing.redeem.a.f(this));
        if (com.google.android.finsky.m.a.j(v1).a(12625218)) {
            v1 = new InputFilter[1];
            v1[0] = new InputFilter$AllCaps();
            this.d.setFilters(v1);
        }
        this.e = (TextView)this.c.findViewById(2131755354);
        this.Y();
        this.ac();
        com.google.android.finsky.m.a.aH().a(this.q, this.c, (TextView)this.c.findViewById(2131756599), this.e, 0, 0, v7, ((com.google.android.finsky.billing.redeem.a)this.aa()).aF);
        return this.c;
    }

    public final String a(Resources p0) {
        return p0.getString(2131952987);
    }

    public final void a(View p0, Bundle p1) {
        super.a(p0, p1);
        if (p1 == 0) {
            com.google.android.finsky.bg.s.a(this.h(), this.d);
            if (this.b != 0)
                this.ab();
        }
    }

    public final void a(String p0) {
        this.b = p0;
        com.google.android.finsky.bg.s.a(this.h(), this.d);
        this.ac();
        this.ab();
    }

    final void a(boolean p0) {
        v0 = 0;
        if (p0 != 0) {
            v0 = new com.google.wireless.android.a.a.a.a.cf();
            v0.d();
        }
        this.a(882, v0);
        ((com.google.android.finsky.billing.redeem.a)this.aa()).a(this.d.getText().toString());
    }

    public final void b(Bundle p0) {
        super.b(p0);
        if (p0 != 0)
            this.b = p0.getString("RedeemScreenStep.error_message_html");
        else
            this.b = this.q.getString("RedeemScreenStep.error_message_html");
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putString("RedeemScreenStep.error_message_html", this.b);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

}
