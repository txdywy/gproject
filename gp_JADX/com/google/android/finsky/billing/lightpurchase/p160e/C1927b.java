package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.v4.p030c.p031a.C0282a;
import android.support.v4.view.ai;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.p131e.C1814a;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.a.a.k;
import com.squareup.leakcanary.C7582R;

public final class C1927b extends C1906g implements OnCheckedChangeListener {
    public final C2492t f9875a = C1473m.f7980a.aP();
    public TextView af;
    public C1941s ag;
    public C1817e ah;
    public CheckBox aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public k f9876b;
    public int f9877c;
    public int f9878d;
    public boolean f9879e;
    public int f9880f = -1;
    public TextView f9881g;
    public Button f9882h;
    public CheckBox f9883i;

    public C1927b() {
        super(750);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9876b = (k) ParcelableProto.m21673a(bundle2, "AuthChallengeStep.challenge");
        this.f9877c = bundle2.getInt("AuthChallengeStep.documentType");
        this.f9879e = false;
        this.ak = false;
        if (bundle != null) {
            this.f9878d = bundle.getInt("AuthChallengeStep.retryCount");
            this.f9879e = bundle.getBoolean("AuthChallengeStep.optOutSelected");
            this.ak = bundle.getBoolean("AuthChallengeStep.fingerprintOptInSelected");
            this.al = bundle.getBoolean("AuthChallengeStep.fingerprintAuthenticationComplete");
            this.f9880f = bundle.getInt("AuthChallengeStep.PurchaseAuthBeforeManageSettings");
            this.am = bundle.getBoolean("AuthChallengeStep.stepFragmentReadyLogged");
        }
        this.ah = new C1817e(C0282a.m1599a(m601g()));
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("AuthChallengeStep.retryCount", this.f9878d);
        bundle.putBoolean("AuthChallengeStep.optOutSelected", this.f9879e);
        bundle.putBoolean("AuthChallengeStep.fingerprintOptInSelected", this.ak);
        bundle.putBoolean("AuthChallengeStep.fingerprintAuthenticationComplete", this.al);
        bundle.putBoolean("AuthChallengeStep.stepFragmentReadyLogged", this.am);
        bundle.putInt("AuthChallengeStep.PurchaseAuthBeforeManageSettings", this.f9880f);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        TextView textView2;
        m10233b(layoutInflater.inflate(C7582R.layout.light_purchase_password_confirm, viewGroup, false));
        ColorStateList c = C1608h.m9255c(m603h(), this.ap);
        if (TextUtils.isEmpty(this.f9876b.j)) {
            textView = null;
        } else {
            TextView textView3 = (TextView) this.aw.findViewById(C7582R.id.item_title);
            textView3.setText(this.f9876b.j);
            textView3.setVisibility(0);
            textView = textView3;
        }
        if (!TextUtils.isEmpty(this.f9876b.k)) {
            textView3 = (TextView) this.aw.findViewById(C7582R.id.item_subtitle);
            textView3.setText(this.f9876b.k);
            textView3.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f9876b.l)) {
            textView2 = null;
        } else {
            textView3 = (TextView) this.aw.findViewById(C7582R.id.item_price);
            textView3.setText(this.f9876b.l);
            textView3.setTextColor(c);
            textView3.setVisibility(0);
            textView2 = textView3;
        }
        if (!TextUtils.isEmpty(this.f9876b.v)) {
            textView3 = (TextView) this.aw.findViewById(C7582R.id.price_byline);
            textView3.setText(this.f9876b.v);
            textView3.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f9876b.w)) {
            textView3 = (TextView) this.aw.findViewById(C7582R.id.price_byline_2);
            textView3.setText(this.f9876b.w);
            textView3.setVisibility(0);
        }
        if (!C2726q.m14753b(this.f9877c)) {
            this.aq.m9287a((FifeImageView) this.aw.findViewById(C7582R.id.application_icon), this.f9876b.u, this.f9877c);
        }
        CharSequence charSequence = ((aq) aa()).ai().name;
        CharSequence charSequence2 = this.f9876b.m;
        ((TextView) this.aw.findViewById(C7582R.id.title)).setText(this.ao.m10006d());
        ((TextView) this.aw.findViewById(C7582R.id.account)).setText(charSequence);
        if (!TextUtils.isEmpty(charSequence2)) {
            textView3 = (TextView) this.aw.findViewById(C7582R.id.instrument_title);
            textView3.setText(charSequence2);
            textView3.setVisibility(0);
        }
        this.af = (TextView) this.aw.findViewById(C7582R.id.opt_out_info);
        this.f9883i = (CheckBox) this.aw.findViewById(C7582R.id.opt_out_checkbox);
        if (!TextUtils.isEmpty(this.f9876b.n)) {
            textView3 = (TextView) this.aw.findViewById(C7582R.id.challenge_description_text);
            textView3.setText(Html.fromHtml(this.f9876b.n));
            textView3.setVisibility(0);
        }
        if (C1601a.m9200a(this.aw.getContext())) {
            this.f9882h = (Button) this.aw.findViewById(C7582R.id.settings);
            this.f9882h.setOnClickListener(this);
        }
        int a = this.ao.m10001a();
        switch (a) {
            case 1:
                mo2542a(C7582R.id.password, C7582R.string.content_description_password_help, this.f9876b.p);
                ab();
                break;
            case 2:
                mo2542a(C7582R.id.pin, C7582R.string.content_description_pin_help, this.f9876b.q);
                ab();
                break;
            case 3:
                this.aw.findViewById(C7582R.id.fingerprint_frame).setVisibility(0);
                this.ak = true;
                this.ag = new C1941s(m601g(), (ImageView) this.aw.findViewById(C7582R.id.fingerprint_icon), (TextView) this.aw.findViewById(C7582R.id.fingerprint_status), new C1929c(this));
                break;
            default:
                throw new IllegalStateException("Unexpected auth method " + a);
        }
        View view = this.aw;
        C1473m.f7980a.aH().m9782a(this.f760q, view, textView, null, textView2, (TextView) view.findViewById(C7582R.id.instrument_title), null, ((aq) aa()).ao());
        return view;
    }

    protected final void mo2542a(int i, int i2, String str) {
        CharSequence ag;
        super.mo2542a(i, i2, str);
        if (this.ah.m9821a()) {
            this.aj = (CheckBox) this.aw.findViewById(C7582R.id.fingerprint_opt_in_checkbox);
            this.ak = this.ah.m9822a(this.an.name);
            boolean z = ((Boolean) C1814a.f9375e.m5777b(this.an.name).m5760a()).booleanValue() && !this.ah.m9826e();
            if (z) {
                int i3;
                TextView textView = (TextView) this.aw.findViewById(C7582R.id.fingerprint_locked);
                if (this.ao.m10001a() == 2) {
                    i3 = C7582R.string.fingerprint_locked_pin;
                } else {
                    i3 = C7582R.string.fingerprint_locked_password;
                }
                textView.setText(i3);
                textView.setVisibility(0);
                this.ak = true;
            }
            if (!this.ak) {
                this.aj.setVisibility(0);
                this.aj.setOnCheckedChangeListener(this);
            }
        } else {
            this.aw.findViewById(C7582R.id.opt_out_checkbox).setVisibility(0);
        }
        if (C1473m.f7980a.mo2249j(this.an.name).mo2294a(12609807)) {
            this.ay.setVisibility(8);
        }
        this.f9881g = (TextView) this.aw.findViewById(C7582R.id.password_help);
        this.f9881g.setMovementMethod(LinkMovementMethod.getInstance());
        if (C1473m.f7980a.mo2249j(this.an.name).mo2294a(12605725)) {
            ag = ag();
        } else {
            ag = UrlSpanUtils.b(Html.fromHtml(m572a(this.ao.m10007e(), this.ao.m10002a(this.an.name))), this.ao.m10002a(this.an.name), new C1930d(this));
        }
        this.f9881g.setText(m10321a(ag));
        this.af = (TextView) this.aw.findViewById(C7582R.id.opt_out_info);
        this.af.setText(m10320a((int) C7582R.string.purchase_auth_message_never));
        this.af.setMovementMethod(LinkMovementMethod.getInstance());
        this.f9883i = (CheckBox) this.aw.findViewById(C7582R.id.opt_out_checkbox);
        if (this.f9876b.h == null) {
            this.f9883i.setVisibility(8);
            return;
        }
        am amVar = this.f9876b.h;
        this.f9883i.setOnCheckedChangeListener(this);
        ag = this.f760q.getString("AuthChallengeStep.challengeGaiaOptOutLabel");
        if (TextUtils.isEmpty(ag)) {
            ag = m592c((int) C7582R.string.auth_challenge_opt_out_title);
        }
        this.f9883i.setText(ag);
        this.f9879e = amVar.d;
        this.f9883i.setChecked(this.f9879e);
    }

    protected final void mo2541Y() {
        super.mo2541Y();
        if (C1473m.f7980a.mo2249j(this.an.name).mo2294a(12609806) && !C1473m.f7980a.mo2249j(this.an.name).mo2294a(12609807)) {
            mo2532a(true);
        }
    }

    private final CharSequence m10321a(CharSequence charSequence) {
        if (!C1473m.f7980a.mo2249j(this.an.name).mo2294a(12609807)) {
            return charSequence;
        }
        Spanned fromHtml = Html.fromHtml(m572a((int) C7582R.string.auth_challenge_info_link, C0955b.f5859C.m28964b()));
        if (ai.f1848a.mo400k(this.f9881g) == 1) {
            return TextUtils.concat(new CharSequence[]{fromHtml, "  ", charSequence});
        }
        return TextUtils.concat(new CharSequence[]{charSequence, "  ", fromHtml});
    }

    private final CharSequence ag() {
        AuthState authState = this.ao;
        CharSequence b = authState.m10004b(this.an.name);
        CharSequence fromHtml = Html.fromHtml(m572a(authState.m10007e(), b));
        UrlSpanUtils.a(fromHtml, b, new C1931e(this));
        return fromHtml;
    }

    public final void mo979u() {
        super.mo979u();
        if (!(VERSION.SDK_INT < 23 || this.ag == null || this.al)) {
            C1941s c1941s = this.ag;
            if (c1941s.f9917g.m9821a()) {
                c1941s.f9916f = new CancellationSignal();
                c1941s.f9918h = false;
                c1941s.f9912b.authenticate(null, c1941s.f9916f, 0, c1941s, null);
                c1941s.f9914d.setTextColor(c1941s.f9914d.getResources().getColor(C7582R.color.fingerprint_hint_color, null));
                c1941s.f9914d.setText(c1941s.f9914d.getResources().getString(C7582R.string.fingerprint_scanning));
                c1941s.f9913c.setImageResource(C7582R.drawable.ic_fp_dialog_initial);
            } else {
                c1941s.f9915e.mo2544b();
            }
        }
        if (this.f9881g != null && C1473m.f7980a.mo2249j(this.an.name).mo2294a(12605725)) {
            this.f9881g.setText(m10321a(ag()));
        }
        if (!(this.ax == null || aa().al() || this.ax.getVisibility() != 0)) {
            C1618s.m9294a(m603h(), this.ax);
        }
        if (!this.am) {
            this.f9875a.m13358c(((aq) aa()).am(), "purchase_fragment_auth_challenge");
            this.am = true;
        }
    }

    public final void mo980v() {
        super.mo980v();
        if (VERSION.SDK_INT >= 23 && this.ag != null) {
            this.ag.m10366a();
        }
    }

    public final void mo1405X() {
        if (this.ao.m10001a() == 3) {
            ad();
        } else {
            m10234b(false);
        }
    }

    protected final void mo2531a(Bundle bundle) {
        bundle.putString(this.f9876b.d, String.valueOf(this.f9878d));
        if (this.f9879e) {
            int b = C1821j.m9832b(this.an.name);
            if (b == 0) {
                FinskyLog.m21669e("Got through auth while opted out? Previous=%d", Integer.valueOf(b));
            }
            C1473m.f7980a.aQ().m9833a(this.an.name, 0, Integer.valueOf(b), "purchase-auth-screen", ((aq) aa()).am());
        }
        C1821j.m9831a(this.an.name, this.ak, "purchase-auth-screen", ((aq) aa()).am());
        C0954a.f5827W.m5777b(this.an.name).m5763a(Long.valueOf(System.currentTimeMillis()));
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.f9883i) {
            m10227a(753, false);
            this.f9879e = z;
            if (z) {
                mo2532a(false);
                this.af.setVisibility(0);
            } else {
                this.af.setVisibility(8);
            }
            ah();
        } else if (compoundButton == this.aj) {
            m10227a(755, false);
            this.ak = z;
        }
    }

    public final void onClick(View view) {
        boolean z = false;
        if (view == this.ay) {
            m10227a(752, false);
            if (!this.as) {
                z = true;
            }
            mo2532a(z);
        } else if (view == this.f9882h) {
            this.f9880f = C1821j.m9832b(this.an.name);
            ((aq) aa()).af();
        }
    }

    private final void ah() {
        int i = 0;
        if (this.f9882h != null) {
            int i2;
            if (this.f9879e || this.as) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            Button button = this.f9882h;
            if (i2 == 0) {
                i = 8;
            }
            button.setVisibility(i);
        }
    }

    protected final void mo2532a(boolean z) {
        this.as = z;
        ab();
    }

    public final void ab() {
        TextView textView;
        int i = C7582R.string.purchase_auth_message_always;
        int i2 = 1;
        int i3 = 0;
        int b = C1821j.m9832b(this.an.name);
        if (b == 0) {
            i2 = 0;
        } else if (this.f9876b.o) {
            if (b == 1) {
                i = C7582R.string.purchase_auth_message_session;
            } else if (b != 2) {
                FinskyLog.m21669e("Unexpected value for PurchaseAuth message %d", Integer.valueOf(b));
                i2 = 0;
            }
            this.aA.setText(m10320a(i));
        } else {
            i2 = 0;
        }
        TextView textView2 = this.aA;
        if (i2 == 0 || !this.as) {
            i = 8;
        } else {
            i = 0;
        }
        textView2.setVisibility(i);
        if (C1473m.f7980a.mo2249j(this.an.name).mo2294a(12609807)) {
            textView = this.f9881g;
        } else {
            textView = this.f9881g;
            if (!this.as) {
                i3 = 8;
            }
        }
        textView.setVisibility(i3);
        ah();
    }

    protected final void ac() {
        this.ar.m10020a(this.an.name, this.ax.getText().toString(), ((aq) aa()).am());
    }

    private final CharSequence m10320a(int i) {
        CharSequence fromHtml = Html.fromHtml(m572a(i, "SETTINGS_ACTIVITY_SENTINEL", C0955b.f5859C.m28964b()));
        UrlSpanUtils.a(fromHtml, "SETTINGS_ACTIVITY_SENTINEL", new C1932f(this));
        return fromHtml;
    }

    final void ad() {
        m10236e(false);
        this.ao.f9583k = false;
        ((aq) aa()).mo2516a(this.f9876b, this.ao);
    }
}
