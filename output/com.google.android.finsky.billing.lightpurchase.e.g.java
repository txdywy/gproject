package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.a.d;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.f;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.d.g;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;

public class com.google.android.finsky.billing.lightpurchase.e.g extends com.google.android.finsky.billing.lightpurchase.d.h implements View$OnClickListener, com.google.android.finsky.billing.common.t, com.google.android.finsky.d.ad
{

    public TextView aA;
    public final com.google.wireless.android.a.a.a.a.ce aB;
    public Account an;
    public AuthState ao;
    public int ap;
    public com.google.android.finsky.bg.l aq;
    public com.google.android.finsky.billing.legacyauth.f ar;
    public boolean as;
    public int at;
    public String au;
    public String av;
    public View aw;
    public EditText ax;
    public ImageView ay;
    public TextView az;

    g(int p0) {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.aB = com.google.android.finsky.d.j.a(p0);
    }

    public static Bundle a(Account p0, AuthState p1, String p2, int p3) {
        v0 = new Bundle();
        v0.putParcelable("AuthenticationChallengeBaseStep.account", p0);
        v0.putParcelable("AuthenticationChallengeBaseStep.authState", p1);
        v0.putString("AuthenticationChallengeBaseStep.docidStr", p2);
        v0.putInt("AuthenticationChallengeBaseStep.backend", p3);
        return v0;
    }

    private final void b(String p0) {
        this.av = p0;
        this.az.setText(p0);
        this.az.setVisibility(0);
        com.google.android.finsky.bg.a.a(this.h(), p0, this.az, 0);
    }

    protected void Y() {
        this.ax.setText("");
        this.b(this.ar.f);
        this.aa().ak();
        com.google.android.finsky.bg.s.a(this.h(), this.ax);
    }

    public String a(Resources p0) {
        return p0.getString(this.ao.c());
    }

    protected void a(int p0, int p1, String p2) {
        this.aw.findViewById(2131756193).setVisibility(0);
        this.ax = (EditText)this.aw.findViewById(p0);
        this.ax.setVisibility(0);
        com.google.android.finsky.bg.ae.a(this.h(), this.ax, 6, 7);
        this.ax.setOnEditorActionListener(new com.google.android.finsky.billing.lightpurchase.e.h(this));
        this.ax.addTextChangedListener(new com.google.android.finsky.billing.lightpurchase.e.i(this));
        this.ax.setHintTextColor(android.support.v4.a.d.c(this.aa().g(), 2131558990));
        this.ax.setHint(p2);
        this.ay = (ImageView)this.aw.findViewById(2131756194);
        this.ay.setOnClickListener(this);
        this.ay.setContentDescription(this.c(p1));
        this.az = (TextView)this.aw.findViewById(2131755736);
        if (!TextUtils.isEmpty(this.av))
            this.b(this.av);
    }

    protected final void a(int p0, boolean p1) {
        v0 = new com.google.wireless.android.a.a.a.a.cf();
        if (p1 != 0)
            v0.d();
        v0.h = this.ao.b();
        this.a(p0, v0);
    }

    protected abstract void a(Bundle p0);

    public final void a(com.google.android.finsky.billing.common.s p0) {
        v1 = new Object[2];
        v1[0] = Integer.valueOf(p0.l);
        v1[1] = Integer.valueOf(p0.ag);
        if (p0.ag == this.at) {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.at);
            FinskyLog.b("Already handled state %d", v1);
            return;
        }
        this.at = p0.ag;
        switch (this.ar.l) {
            case 2:
                this.af();
                break;
            case 3:
                this.e(0);
                if (this.ar.af == 3) {
                    v2 = new Object[1];
                    v2[0] = this.ao.a(this.an.name);
                    this.a(this.a(this.ao.f(), v2));
                }
                else if (this.ar.af == 4)
                    this.a(this.c(2131952240));
                else
                    this.Y();
                break;
            default:
                break;
        }
    }

    public void a(String p0) {
        this.aa().a(com.google.android.finsky.billing.lightpurchase.e.ac.a(new CheckoutPurchaseError(p0), 1));
    }

    protected abstract void a(boolean p0);

    protected abstract void ac();

    protected String ae() {
        return "AuthenticationChallengeBaseStep.sidecar";
    }

    protected final void af() {
        this.e(1);
        v0 = (com.google.android.finsky.billing.lightpurchase.e.j)this.aa();
        v1 = new Bundle();
        v2 = this.ao.a();
        v0.e_(v2);
        v1.putString("pcam", String.valueOf(v2));
        if (!TextUtils.isEmpty(this.ar.g))
            v1.putString("rapt", this.ar.g);
        this.a(v1);
        v0.a(v1);
    }

    public void b(Bundle p0) {
        this.an = (Account)this.q.getParcelable("AuthenticationChallengeBaseStep.account");
        this.ao = (AuthState)this.q.getParcelable("AuthenticationChallengeBaseStep.authState");
        this.au = this.q.getString("AuthenticationChallengeBaseStep.docidStr");
        this.ap = this.q.getInt("AuthenticationChallengeBaseStep.backend");
        if (this.aB.e == 0)
            this.aB.e = new com.google.wireless.android.a.a.a.a.cf();
        this.aB.e.h = this.ao.b();
        super.b(p0);
        if (p0 != 0) {
            this.at = p0.getInt("AuthenticationChallengeBaseStep.handledStateInstance");
            this.as = p0.getBoolean("AuthenticationChallengeBaseStep.passwordHelpExpanded");
            this.av = p0.getString("AuthenticationChallengeBaseStep.errorMessage");
        }
        this.aq = com.google.android.finsky.m.a.ar();
    }

    protected final void b(View p0) {
        this.aw = p0;
        this.aA = (TextView)this.aw.findViewById(2131755864);
        this.aA.setMovementMethod(LinkMovementMethod.getInstance());
    }

    protected final void b(boolean p0) {
        this.a(751, p0);
        com.google.android.finsky.bg.s.a(this.h(), this.ax);
        this.aa().aj();
        this.ac();
    }

    public void e(Bundle p0) {
        super.e(p0);
        p0.putInt("AuthenticationChallengeBaseStep.handledStateInstance", this.at);
        p0.putBoolean("AuthenticationChallengeBaseStep.passwordHelpExpanded", this.as);
        p0.putString("AuthenticationChallengeBaseStep.errorMessage", this.av);
    }

    protected final void e(boolean p0) {
        this.aa().am().a(new com.google.android.finsky.d.c(508).a(this.au).a(p0).a(this.ao.b()));
    }

    public final void g_() {
        super.g_();
        this.ar = (com.google.android.finsky.billing.legacyauth.f)this.B.a(this.ae());
        if (this.ar == 0) {
            this.ar = com.google.android.finsky.billing.legacyauth.f.a(this.an.name, this.ao);
            this.B.a().a(this.ar, this.ae()).c();
        }
        this.ar.a(this);
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.aB;
    }

    public final void h_() {
        if (this.ar != 0)
            this.ar.a(0);
        if (this.ax != 0)
            com.google.android.finsky.bg.s.a(this.h(), this.ax);
        super.h_();
    }

    public void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.aw.getContext(), this.c(this.ao.d()), this.aw, 0);
    }

}
