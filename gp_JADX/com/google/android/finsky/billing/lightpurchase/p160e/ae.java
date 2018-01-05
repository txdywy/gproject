package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2492t;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

public final class ae extends C1076h implements OnClickListener {
    public final ce f9866a = C2482j.m13283a(1250);
    public PlayActionButtonV2 af;
    public PlayActionButtonV2 ag;
    public final C2492t f9867b = C1473m.f7980a.aP();
    public String f9868c;
    public String f9869d;
    public boolean f9870e;
    public boolean f9871f;
    public boolean f9872g;
    public boolean f9873h;
    public View f9874i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9868c = bundle2.getString("authAccount");
        this.f9870e = bundle2.getBoolean("SuccessStepWithAuthChoices.usedPinBasedAuth");
        this.f9871f = C1473m.f7980a.mo2249j(this.f9868c).mo2294a(12609656);
        this.f9872g = C1473m.f7980a.mo2249j(this.f9868c).mo2294a(12609657);
        if (bundle != null) {
            this.f9873h = bundle.getBoolean("SuccessStepWithAuthChoices.stepFragmentReadyLogged");
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBoolean("SuccessStepWithAuthChoices.stepFragmentReadyLogged", this.f9873h);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        TextView textView;
        if (this.f9871f || this.f9872g) {
            i = C7582R.layout.light_purchase_success_step_with_auth_choices_restyle;
        } else {
            i = C7582R.layout.light_purchase_success_step_with_auth_choices;
        }
        this.f9874i = layoutInflater.inflate(i, viewGroup, false);
        if (this.f9871f) {
            if (this.f9870e) {
                i = C7582R.string.payment_success_via_pin_auth_choices_description_restyle_1;
            } else {
                i = C7582R.string.payment_success_auth_choices_description_restyle_1;
            }
        } else if (this.f9872g) {
            if (this.f9870e) {
                i = C7582R.string.payment_success_via_pin_auth_choices_description_restyle_2;
            } else {
                i = C7582R.string.payment_success_auth_choices_description_restyle_2;
            }
        } else if (this.f9870e) {
            i = C7582R.string.payment_success_via_pin_auth_choices_description;
        } else {
            i = C7582R.string.payment_success_auth_choices_description;
        }
        this.f9869d = m592c(i);
        TextView textView2 = (TextView) this.f9874i.findViewById(C7582R.id.description);
        com.google.android.finsky.bg.ae.m9217a(textView2, this.f9869d);
        if (this.f9871f || this.f9872g) {
            String replace = ((String) C0955b.gt.m28964b()).replace("%lang%", Locale.getDefault().getLanguage().toLowerCase());
            TextView textView3 = (TextView) this.f9874i.findViewById(C7582R.id.detailed_footer_text);
            if (!this.f9871f && !this.f9872g) {
                i2 = 0;
            } else if (this.f9870e) {
                i2 = C7582R.string.payment_success_via_pin_auth_choices_footer_restyle;
            } else {
                i2 = C7582R.string.payment_success_auth_choices_footer_restyle;
            }
            com.google.android.finsky.bg.ae.m9217a(textView3, m572a(i2, replace));
            textView = textView3;
        } else {
            textView = null;
        }
        i2 = this.f760q.getInt("SuccessStepWithAuthChoices.backend");
        this.af = (PlayActionButtonV2) this.f9874i.findViewById(C7582R.id.choice_everytime_button);
        this.ag = (PlayActionButtonV2) this.f9874i.findViewById(C7582R.id.choice_session_button);
        PlayActionButtonV2 playActionButtonV2 = this.af;
        if (this.f9871f || !this.f9872g) {
            i = C7582R.string.purchase_auth_choice_everytime;
        } else {
            i = C7582R.string.yes;
        }
        playActionButtonV2.m6000a(i2, i, (OnClickListener) this);
        playActionButtonV2 = this.ag;
        if (this.f9871f) {
            i = C7582R.string.purchase_auth_choice_never;
        } else if (this.f9872g) {
            i = C7582R.string.no;
        } else {
            i = C7582R.string.purchase_auth_choice_session;
        }
        playActionButtonV2.m6000a(i2, i, (OnClickListener) this);
        C1473m.f7980a.aH().m9782a(this.f760q, this.f9874i, (TextView) this.f9874i.findViewById(C7582R.id.title), textView2, null, null, textView, ((aq) aa()).ao());
        return this.f9874i;
    }

    public final void mo979u() {
        super.mo979u();
        if (this.f9869d == null) {
            throw new IllegalArgumentException("No text was specified for a11y announcements.");
        }
        C1601a.m9199a(this.f9874i.getContext(), this.f9869d, this.f9874i, false);
        if (!this.f9873h) {
            this.f9867b.m13358c(((aq) aa()).am(), "purchase_fragment_success_choice");
            this.f9873h = true;
        }
    }

    public final void onClick(View view) {
        if (view == this.af) {
            m6694a(1251, null);
            m10312a(2);
        } else if (view == this.ag) {
            if (this.f9871f || this.f9872g) {
                m6694a(1253, null);
                m10312a(0);
            } else {
                m6694a(1252, null);
                m10312a(1);
            }
        }
        aq aqVar = (aq) aa();
        if (aqVar != null) {
            aqVar.ah();
        }
    }

    private final void m10312a(int i) {
        int i2 = i;
        C1473m.f7980a.aQ().m9833a(this.f9868c, i2, null, "success-step-with-choices", ((aq) aa()).am());
    }

    public final String mo1406a(Resources resources) {
        return null;
    }

    public final void mo1405X() {
    }

    public final ce getPlayStoreUiElement() {
        return this.f9866a;
    }

    public final boolean mo968W() {
        return false;
    }
}
