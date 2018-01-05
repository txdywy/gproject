package com.google.android.finsky.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.C0656n;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1880f;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;

public final class C4102l extends Fragment implements OnClickListener, C0998m, C1087t {
    public C2471a f20518a;
    public C4091n af;
    public ad ag = new C2473o(314);
    public C2495w ah;
    public C1880f ai;
    public C0986a f20519b;
    public C0656n f20520c = null;
    public View f20521d;
    public String f20522e;
    public AuthState f20523f;
    public boolean f20524g;
    public int f20525h;
    public EditText f20526i;

    static C4102l m19043a(String str, boolean z, AuthState authState, C2495w c2495w) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("GaiaAuthFragment_authState", authState);
        bundle.putBoolean("GaiaAuthFragment_showWarning", z);
        c2495w.m13380b(str).m13377a(bundle);
        Fragment c4102l = new C4102l();
        c4102l.m600f(bundle);
        return c4102l;
    }

    public final void mo1292a(Activity activity) {
        ((C1414v) C3947d.m18649a(C1414v.class)).mo1907a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f20522e = this.f760q.getString("authAccount");
        this.f20523f = (AuthState) this.f760q.getParcelable("GaiaAuthFragment_authState");
        this.f20524g = this.f760q.getBoolean("GaiaAuthFragment_showWarning");
        if (bundle != null) {
            this.f20525h = bundle.getInt("GaiaAuthFragment_retryCount");
            this.ah = this.f20518a.m13179a(bundle);
            return;
        }
        this.ah = this.f20518a.m13179a(this.f760q);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("GaiaAuthFragment_retryCount", this.f20525h);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.gaia_auth_fragment, viewGroup, false);
        this.f20521d = inflate;
        if (bundle == null) {
            this.ag.getPlayStoreUiElement().e = new cf();
            this.ag.getPlayStoreUiElement().e.h = this.f20523f.m10003b();
            this.ah.m13370a(new C2488p().m13345b(this.ag));
        }
        ((TextView) inflate.findViewById(C7582R.id.challenge_description)).setText(this.f20519b.mo1187d(this.f20522e));
        TextView textView = (TextView) inflate.findViewById(C7582R.id.challenge_title);
        this.f20526i = (EditText) inflate.findViewById(this.f20523f.m10001a() == 2 ? C7582R.id.pin : C7582R.id.password);
        textView.setText(this.f20523f.m10006d());
        ae.m9215a(m603h(), this.f20526i, 6, 7);
        this.f20526i.setVisibility(0);
        this.f20526i.setOnEditorActionListener(new C4103m(this));
        textView = (TextView) inflate.findViewById(C7582R.id.challenge_footer);
        CharSequence fromHtml = Html.fromHtml(m572a(this.f20523f.m10007e(), this.f20523f.m10002a(this.f20522e)));
        if (fromHtml != null) {
            textView.setText(fromHtml);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (this.f20524g) {
            textView = (TextView) inflate.findViewById(C7582R.id.opt_out_info);
            textView.setText(Html.fromHtml(m572a((int) C7582R.string.auth_challenge_opt_out_info, C0955b.f5859C.m28964b())));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setVisibility(0);
        }
        Button button = (Button) inflate.findViewById(C7582R.id.positive_button);
        button.setText(C7582R.string.ok);
        button.setOnClickListener(this);
        button = (Button) inflate.findViewById(C7582R.id.negative_button);
        button.setText(C7582R.string.cancel);
        button.setOnClickListener(this);
        return inflate;
    }

    public final void g_() {
        this.ai = (C1880f) this.f730B.mo283a("AuthChallengeStep.sidecar");
        if (this.ai == null) {
            this.ai = C1880f.m10016a(this.f20522e, this.f20523f);
            this.f730B.mo284a().mo328a(this.ai, "AuthChallengeStep.sidecar").mo334c();
        }
        this.ai.m6757a((C1087t) this);
        super.g_();
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.f20521d.getContext(), m592c(this.f20523f.m10006d()), this.f20521d, false);
        C1618s.m9294a(m603h(), this.f20526i);
    }

    public final void h_() {
        if (this.ai != null) {
            this.ai.m6757a(null);
        }
        super.h_();
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == C7582R.id.positive_button) {
            m19051a(false);
        } else if (id == C7582R.id.negative_button) {
            m19044a(266, false);
            if (this.af != null) {
                this.af.mo3911l();
            }
        }
    }

    final void m19051a(boolean z) {
        m19044a(265, z);
        String obj = this.f20526i.getText().toString();
        this.f20526i.setEnabled(false);
        this.ai.m10020a(this.f20522e, obj, this.ah);
    }

    public final void mo138d() {
        if (this.f20520c != null) {
            this.f20520c.mo1057f();
        }
        super.mo138d();
    }

    private final void m19041W() {
        this.f20525h++;
        m19045b(false);
        if (this.f20525h >= ((Integer) C0955b.dd.m28964b()).intValue()) {
            C1508k c1508k = new C1508k();
            c1508k.m8856b(m572a(this.f20523f.m10008f(), this.f20523f.m10002a(this.f20522e))).m8860d((int) C7582R.string.ok).m8851a(this, 1, null);
            c1508k.mo2272a().m625a(this.f730B, "GaiaAuthFragment.errorDialog");
            return;
        }
        this.f20526i.setText("");
        this.f20526i.setEnabled(true);
        C1618s.m9294a(m603h(), this.f20526i);
        TextView textView = this.f20526i;
        AuthState authState = this.f20523f;
        if (authState.f9583k) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        }
        int i;
        if (authState.f9573a) {
            i = C7582R.string.google_pin_hint;
        } else {
            i = C7582R.string.google_password_hint;
        }
        ae.m9219a(textView, m592c(i), this.ai.f9608f);
    }

    private final void m19042X() {
        this.f20526i.setEnabled(true);
        this.f20526i.setError(null);
        if (this.af != null) {
            this.af.mo3910k();
        }
        m19045b(true);
    }

    public final void mo1423a(C1089s c1089s) {
        int i = c1089s.ag;
        Object[] objArr = new Object[]{Integer.valueOf(c1089s.f6948l), Integer.valueOf(i)};
        switch (this.ai.f6948l) {
            case 2:
                m19042X();
                return;
            case 3:
                m19041W();
                return;
            default:
                return;
        }
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        if (i != 100) {
            super.mo2342a(i, i2, intent);
        } else if (i2 == -1) {
            m19042X();
        } else {
            m19041W();
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 1) {
            this.af.mo3911l();
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        if (i == 1) {
            this.af.mo3911l();
        }
    }

    private final void m19045b(boolean z) {
        this.ah.m13367a(new C2474c(502).m13239a(z).m13234a(this.f20523f.m10003b()));
    }

    private final void m19044a(int i, boolean z) {
        cf cfVar = new cf();
        if (z) {
            cfVar.d();
        }
        cfVar.h = this.f20523f.m10003b();
        this.ah.m13379b(new C2475d(this.ag).m13256a(i).m13257a(cfVar));
    }
}
