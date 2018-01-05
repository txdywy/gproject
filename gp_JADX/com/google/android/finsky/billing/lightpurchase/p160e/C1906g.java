package com.google.android.finsky.billing.lightpurchase.p160e;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1880f;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;

public abstract class C1906g extends C1076h implements OnClickListener, C1087t, ad {
    public TextView aA;
    public final ce aB;
    public Account an;
    public AuthState ao;
    public int ap;
    public C1612l aq;
    public C1880f ar;
    public boolean as;
    public int at;
    public String au;
    public String av;
    public View aw;
    public EditText ax;
    public ImageView ay;
    public TextView az;

    protected C1906g(int i) {
        this.aB = C2482j.m13283a(i);
    }

    protected abstract void mo2531a(Bundle bundle);

    protected abstract void mo2532a(boolean z);

    protected abstract void ac();

    public static Bundle m10222a(Account account, AuthState authState, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AuthenticationChallengeBaseStep.account", account);
        bundle.putParcelable("AuthenticationChallengeBaseStep.authState", authState);
        bundle.putString("AuthenticationChallengeBaseStep.docidStr", str);
        bundle.putInt("AuthenticationChallengeBaseStep.backend", i);
        return bundle;
    }

    public void mo136b(Bundle bundle) {
        Bundle bundle2 = this.f760q;
        this.an = (Account) bundle2.getParcelable("AuthenticationChallengeBaseStep.account");
        this.ao = (AuthState) bundle2.getParcelable("AuthenticationChallengeBaseStep.authState");
        this.au = bundle2.getString("AuthenticationChallengeBaseStep.docidStr");
        this.ap = bundle2.getInt("AuthenticationChallengeBaseStep.backend");
        if (this.aB.e == null) {
            this.aB.e = new cf();
        }
        this.aB.e.h = this.ao.m10003b();
        super.mo136b(bundle);
        if (bundle != null) {
            this.at = bundle.getInt("AuthenticationChallengeBaseStep.handledStateInstance");
            this.as = bundle.getBoolean("AuthenticationChallengeBaseStep.passwordHelpExpanded");
            this.av = bundle.getString("AuthenticationChallengeBaseStep.errorMessage");
        }
        this.aq = C1473m.f7980a.ar();
    }

    public void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("AuthenticationChallengeBaseStep.handledStateInstance", this.at);
        bundle.putBoolean("AuthenticationChallengeBaseStep.passwordHelpExpanded", this.as);
        bundle.putString("AuthenticationChallengeBaseStep.errorMessage", this.av);
    }

    public String mo1406a(Resources resources) {
        return resources.getString(this.ao.m10005c());
    }

    public final void g_() {
        super.g_();
        this.ar = (C1880f) this.f730B.mo283a(ae());
        if (this.ar == null) {
            this.ar = C1880f.m10016a(this.an.name, this.ao);
            this.f730B.mo284a().mo328a(this.ar, ae()).mo334c();
        }
        this.ar.m6757a((C1087t) this);
    }

    public final void h_() {
        if (this.ar != null) {
            this.ar.m6757a(null);
        }
        if (this.ax != null) {
            C1618s.m9293a(m603h(), this.ax);
        }
        super.h_();
    }

    public void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.aw.getContext(), m592c(this.ao.m10006d()), this.aw, false);
    }

    protected String ae() {
        return "AuthenticationChallengeBaseStep.sidecar";
    }

    protected final void m10234b(boolean z) {
        m10227a(751, z);
        C1618s.m9293a(m603h(), this.ax);
        aa().aj();
        ac();
    }

    protected void mo2542a(int i, int i2, String str) {
        this.aw.findViewById(C7582R.id.password_pin_frame).setVisibility(0);
        this.ax = (EditText) this.aw.findViewById(i);
        this.ax.setVisibility(0);
        ae.m9215a(m603h(), this.ax, 6, 7);
        this.ax.setOnEditorActionListener(new C1933h(this));
        this.ax.addTextChangedListener(new C1934i(this));
        this.ax.setHintTextColor(C0216d.m1116c(aa().m6731g(), C7582R.color.play_tertiary_text));
        this.ax.setHint(str);
        this.ay = (ImageView) this.aw.findViewById(C7582R.id.help_toggle);
        this.ay.setOnClickListener(this);
        this.ay.setContentDescription(m592c(i2));
        this.az = (TextView) this.aw.findViewById(C7582R.id.error_message);
        if (!TextUtils.isEmpty(this.av)) {
            m10223b(this.av);
        }
    }

    protected final void af() {
        m10236e(true);
        C1905j c1905j = (C1905j) aa();
        Bundle bundle = new Bundle();
        int a = this.ao.m10001a();
        c1905j.e_(a);
        bundle.putString("pcam", String.valueOf(a));
        if (!TextUtils.isEmpty(this.ar.f9609g)) {
            bundle.putString("rapt", this.ar.f9609g);
        }
        mo2531a(bundle);
        c1905j.mo2520a(bundle);
    }

    protected void mo2541Y() {
        this.ax.setText("");
        m10223b(this.ar.f9608f);
        aa().ak();
        C1618s.m9294a(m603h(), this.ax);
    }

    public void mo2538a(String str) {
        aa().mo1411a(ac.m10304a(new CheckoutPurchaseError(str), true));
    }

    protected final void m10227a(int i, boolean z) {
        cf cfVar = new cf();
        if (z) {
            cfVar.d();
        }
        cfVar.h = this.ao.m10003b();
        m6694a(i, cfVar);
    }

    protected final void m10236e(boolean z) {
        aa().am().m13367a(new C2474c(508).m13236a(this.au).m13239a(z).m13234a(this.ao.m10003b()));
    }

    private final void m10223b(String str) {
        this.av = str;
        this.az.setText(str);
        this.az.setVisibility(0);
        C1601a.m9199a(m603h(), str, this.az, false);
    }

    protected final void m10233b(View view) {
        this.aw = view;
        this.aA = (TextView) this.aw.findViewById(C7582R.id.purchase_disclaimer);
        this.aA.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void mo1423a(C1089s c1089s) {
        int i = c1089s.ag;
        Object[] objArr = new Object[]{Integer.valueOf(c1089s.f6948l), Integer.valueOf(i)};
        if (i == this.at) {
            FinskyLog.m21662b("Already handled state %d", Integer.valueOf(this.at));
            return;
        }
        this.at = i;
        switch (this.ar.f6948l) {
            case 2:
                af();
                return;
            case 3:
                i = this.ar.af;
                m10236e(false);
                if (i == 3) {
                    String str = this.an.name;
                    mo2538a(m572a(this.ao.m10008f(), this.ao.m10002a(str)));
                    return;
                } else if (i == 4) {
                    mo2538a(m592c((int) C7582R.string.generic_account_error));
                    return;
                } else {
                    mo2541Y();
                    return;
                }
            default:
                return;
        }
    }

    public ce getPlayStoreUiElement() {
        return this.aB;
    }
}
