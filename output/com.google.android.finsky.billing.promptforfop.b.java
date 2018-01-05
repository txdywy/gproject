package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ai;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.profile.a;
import com.google.android.finsky.billing.profile.w;
import com.google.android.finsky.billing.redeem.RedeemCodeActivity;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.google.android.finsky.m;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import java.util.List;

public class com.google.android.finsky.billing.promptforfop.b extends com.google.android.finsky.billing.profile.a implements View$OnClickListener
{

    public com.google.wireless.android.a.a.a.a.ce aj;
    public int ak;
    public ViewGroup al;
    public View am;
    public List an;
    public int ao;
    public ViewGroup ap;
    public boolean aq;
    public TextView ar;
    public final View$OnClickListener as;

    b() {
        com.google.android.finsky.billing.profile.a();
        this.ao = -1;
        this.as = new com.google.android.finsky.billing.promptforfop.c(this);
    }

    protected static Bundle a(Account p0, byte[] p1) {
        v0 = new Bundle();
        v0.putParcelable("BillingProfileFragment.account", p0);
        v0.putByteArray("PromptForFopFragment.server_logs_cookie", p1);
        return v0;
    }

    public static Fragment a(Account p0, byte[] p1, com.google.android.finsky.d.w p2) {
        v0 = com.google.android.finsky.billing.promptforfop.b.a(p0, p1);
        p2.a(v0);
        v1 = new com.google.android.finsky.billing.promptforfop.b();
        v1.f(v0);
        return v1;
    }

    protected final void W() {
        this.af.a(new com.google.android.finsky.d.p().b((com.google.android.finsky.d.ad)this.h()).a(213));
    }

    protected final void Z() {
        if (this.aq == 0) {
            this.aq = 1;
            v1 = 0;
            while (v1 < this.an.size()) {
                v0 = (com.google.android.finsky.billing.profile.w)this.an.get(v1);
                this.af.a(new com.google.android.finsky.d.p().b(this).a(v0.h).a(v0.g));
                v1 = v1 + 1;
            }
            if (this.ak != 2)
                this.af.a(new com.google.android.finsky.d.p().b(this).a(1008));
        }
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
 11:    this.ap = (ViewGroup)p0.inflate(this.ah(), p1, 0);
 18:    v1 = this.ap.findViewById(2131756566);
 31:    this.al = (ViewGroup)v1.findViewById(2131755387);
 38:    v0 = this.ap.findViewById(2131755114);
 44:    if ((TextView)v0 != 0)
 49:        ((TextView)v0).setText(2131953141);
 61:    v0 = (TextView)this.ap.findViewById(2131755755);
 63:    if (v0 != 0) {
 69:        v0.setText(this.g.name);
 72:        v0.setVisibility(0);
        }
 98:    ((TextView)this.ap.findViewById(2131756565)).setText(Html.fromHtml(this.c(this.ai())));
110:    this.ah = this.ap.findViewById(2131755388);
121:    this.ag = this.ap.findViewById(2131755383);
127:    v0 = com.google.android.finsky.setup.cs.a(this.h());
131:    if (v0 != 0)
135:        this.am = v0.b;
        else
205:        this.am = this.ap.findViewById(2131755791);
139:    this.b(this.am);
144:    this.am.setEnabled(0);
151:    if (!(this.am instanceof PlayActionButtonV2))
155:        this.am.setOnClickListener(this);
160:    switch (this.ak) {
            case 1:
229:            break;
            default:
168:            v0 = this.ap.findViewById(2131756143);
172:            if (v0 != 0)
176:                v0.setVisibility(8);
190:            android.support.v4.view.ai.a(v1, 0, 0, 0, this.i().getDimensionPixelSize(2131625306));
195:            return this.ap;
        }
219:    this.ar = (TextView)this.ap.findViewById(2131756564);
225:    this.ar.setOnClickListener(this.as);
228:    goto 193;
    }

    protected final com.google.android.finsky.billing.profile.w a(com.google.wireless.android.finsky.dfe.nano.v p0) {
        return 0;
    }

    final void a(int p0) {
        v1 = 0;
        while (v1 < this.an.size()) {
            if (p0 == v1)
                v3 = 1;
            else
                v3 = 0;
            ((RadioButton)this.ap.findViewById(v1)).setChecked(v3);
            v1 = v1 + 1;
        }
        this.ao = p0;
        this.am.setEnabled(1);
    }

    public final void a(View p0, Bundle p1) {
        super.a(p0, p1);
        if (p1 != 0)
            this.ao = p1.getInt("PromptForFopFragment.selected_index", this.ao);
        if (this.ao >= 0)
            this.a(this.ao);
    }

    protected final void a(RedeemCodeResult p0) {
        FinskyLog.e("Unexpected promo code redemption.", new Object[0]);
    }

    protected final void a(String p0) {
        v0 = this.al();
        if (v0 != 0)
            v0.p();
    }

    protected final void a(String p0, byte[] p1) {
        v0 = this.al();
        if (v0 != 0)
            v0.n();
    }

    protected final void a(List p0) {
        this.an = p0;
        this.al.removeAllViews();
        if (this.ak == 1 && this.ak()) {
            this.ar.setVisibility(0);
            this.ar.setText(this.f.g.toUpperCase());
        }
        if (this.ak == 2 && this.ak())
            p0.add(new com.google.android.finsky.billing.profile.w(this.f.g, 0, this.f.f, 0, 0, this.as, 0, 1008));
        v6 = p0.size();
        v4 = 0;
        while (v4 < v6) {
            if (v4 == v6 - 1)
                v3 = 1;
            else
                v3 = 0;
            v0 = (com.google.android.finsky.billing.profile.w)p0.get(v4);
            v2 = LayoutInflater.from(this.al.getContext()).inflate(this.aj(), this.al, 0);
            ((TextView)v2.findViewById(2131755114)).setText(v0.a);
            v1 = (FifeImageView)v2.findViewById(2131755305);
            if (v0.c == 0)
                v1.setVisibility(8);
            else
                com.google.android.finsky.m.a.ar().a(v1, v0.c.f, v0.c.i);
            v0 = (RadioButton)v2.findViewById(2131755279);
            v0.setId(v4);
            v0.setClickable(0);
            v0.setVisibility(0);
            v2.setOnClickListener(new com.google.android.finsky.billing.promptforfop.d(this, v4));
            if (v3 != 0) {
                if (v2 instanceof SeparatorLinearLayout)
                    ((SeparatorLinearLayout)v2).a();
            }
            this.al.addView(v2);
            v4 = v4 + 1;
        }
        if (this.ak == 2)
            this.a(0);
    }

    protected final void a(ao[] p0, byte[] p1) {
    }

    protected final boolean a(ao[] p0) {
        v0 = 0;
        if (p0.length > 0) {
            FinskyLog.c("Unexpected instruments found.", new Object[0]);
            v1 = this.al();
            if (v1 != 0)
                v1.q();
        }
        else
            v0 = 1;
        return v0;
    }

    protected final Intent ac() {
        return RedeemCodeActivity.a(this.g.name, 2, 0, 0, this.af);
    }

    protected int ad() {
        return 2;
    }

    protected int af() {
        return 1002;
    }

    protected int ag() {
        return 1;
    }

    protected int ah() {
        return 2130969311;
    }

    protected int ai() {
        return 2131953139;
    }

    protected int aj() {
        return 2130969313;
    }

    protected boolean ak() {
        return 1;
    }

    final com.google.android.finsky.billing.promptforfop.e al() {
        if (this.h() instanceof com.google.android.finsky.billing.promptforfop.e)
            v0 = (com.google.android.finsky.billing.promptforfop.e)this.h();
        else {
            FinskyLog.e("No listener registered.", new Object[0]);
            v0 = 0;
        }
        return v0;
    }

    public void b(Bundle p0) {
        super.b(p0);
        this.ak = this.ag();
        this.aj = com.google.android.finsky.d.j.a(this.af());
        com.google.android.finsky.d.j.a(this.aj, this.q.getByteArray("PromptForFopFragment.server_logs_cookie"));
        if (p0 != 0)
            this.aq = p0.getBoolean("PromptForFopFragment.has_logged_screen");
    }

    protected void b(View p0) {
        if (p0 instanceof PlayActionButtonV2)
            ((PlayActionButtonV2)p0).a(3, 2131951948, this);
        else {
            v1 = new Object[1];
            v1[0] = p0.getClass().getSimpleName();
            FinskyLog.e("Unexpected continue button type: %s", v1);
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putInt("PromptForFopFragment.selected_index", this.ao);
        p0.putBoolean("PromptForFopFragment.has_logged_screen", this.aq);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return (com.google.android.finsky.d.ad)this.h();
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.aj;
    }

    public void onClick(View p0) {
        if (this.ao >= 0)
            ((com.google.android.finsky.billing.profile.w)this.an.get(this.ao)).f.onClick(p0);
    }

}
