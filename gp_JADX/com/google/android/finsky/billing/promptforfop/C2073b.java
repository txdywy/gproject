package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ai;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.profile.C2046a;
import com.google.android.finsky.billing.profile.C2066w;
import com.google.android.finsky.billing.redeem.RedeemCodeActivity;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.v;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class C2073b extends C2046a implements OnClickListener {
    public ce aj;
    public int ak;
    public ViewGroup al;
    public View am;
    public List an;
    public int ao = -1;
    public ViewGroup ap;
    public boolean aq;
    public TextView ar;
    public final OnClickListener as = new C2074c(this);

    public static Fragment m10870a(Account account, byte[] bArr, C2495w c2495w) {
        Bundle a = C2073b.m10869a(account, bArr);
        c2495w.m13377a(a);
        Fragment c2073b = new C2073b();
        c2073b.m600f(a);
        return c2073b;
    }

    protected static Bundle m10869a(Account account, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BillingProfileFragment.account", account);
        bundle.putByteArray("PromptForFopFragment.server_logs_cookie", bArr);
        return bundle;
    }

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.ak = ag();
        this.aj = C2482j.m13283a(af());
        C2482j.m13285a(this.aj, this.f760q.getByteArray("PromptForFopFragment.server_logs_cookie"));
        if (bundle != null) {
            this.aq = bundle.getBoolean("PromptForFopFragment.has_logged_screen");
        }
    }

    protected int af() {
        return 1002;
    }

    protected int ag() {
        return 1;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ap = (ViewGroup) layoutInflater.inflate(ah(), viewGroup, false);
        View findViewById = this.ap.findViewById(C7582R.id.actions_container);
        this.al = (ViewGroup) findViewById.findViewById(C7582R.id.actions);
        TextView textView = (TextView) this.ap.findViewById(C7582R.id.title);
        if (textView != null) {
            textView.setText(C7582R.string.setup_account_title);
        }
        textView = (TextView) this.ap.findViewById(C7582R.id.account);
        if (textView != null) {
            textView.setText(this.g.name);
            textView.setVisibility(0);
        }
        ((TextView) this.ap.findViewById(C7582R.id.primer)).setText(Html.fromHtml(m592c(ai())));
        this.ah = this.ap.findViewById(C7582R.id.loading_indicator);
        this.ag = this.ap.findViewById(C7582R.id.profile);
        SetupWizardNavBar a = cs.m19397a(m603h());
        if (a != null) {
            this.am = a.f20629b;
        } else {
            this.am = this.ap.findViewById(C7582R.id.continue_button);
        }
        mo2630b(this.am);
        this.am.setEnabled(false);
        if (!(this.am instanceof PlayActionButtonV2)) {
            this.am.setOnClickListener(this);
        }
        switch (this.ak) {
            case 1:
                this.ar = (TextView) this.ap.findViewById(C7582R.id.not_now_button);
                this.ar.setOnClickListener(this.as);
                break;
            default:
                View findViewById2 = this.ap.findViewById(C7582R.id.continue_button_bar);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                ai.m1823a(findViewById, 0, 0, 0, m605i().getDimensionPixelSize(C7582R.dimen.prompt_for_fop_bottom_padding));
                break;
        }
        return this.ap;
    }

    protected int ah() {
        return C7582R.layout.prompt_for_fop_fragment;
    }

    protected void mo2630b(View view) {
        if (view instanceof PlayActionButtonV2) {
            ((PlayActionButtonV2) view).m6000a(3, (int) C7582R.string.continue_text, (OnClickListener) this);
            return;
        }
        FinskyLog.m21669e("Unexpected continue button type: %s", view.getClass().getSimpleName());
    }

    protected int ai() {
        return C7582R.string.setup_account_primer;
    }

    public final void mo1410a(View view, Bundle bundle) {
        super.mo1410a(view, bundle);
        if (bundle != null) {
            this.ao = bundle.getInt("PromptForFopFragment.selected_index", this.ao);
        }
        if (this.ao >= 0) {
            m10875a(this.ao);
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("PromptForFopFragment.selected_index", this.ao);
        bundle.putBoolean("PromptForFopFragment.has_logged_screen", this.aq);
    }

    protected final void mo2604a(List list) {
        this.an = list;
        this.al.removeAllViews();
        if (this.ak == 1 && ak()) {
            this.ar.setVisibility(0);
            this.ar.setText(this.f.g.toUpperCase());
        }
        if (this.ak == 2 && ak()) {
            list.add(new C2066w(this.f.g, null, this.f.f, null, null, this.as, null, 1008));
        }
        ViewGroup viewGroup = this.al;
        int size = list.size();
        int i = 0;
        while (i < size) {
            boolean z = i == size + -1;
            C2066w c2066w = (C2066w) list.get(i);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(aj(), viewGroup, false);
            ((TextView) inflate.findViewById(C7582R.id.title)).setText(c2066w.f10593a);
            FifeImageView fifeImageView = (FifeImageView) inflate.findViewById(C7582R.id.image_icon);
            bd bdVar = c2066w.f10595c;
            if (bdVar == null) {
                fifeImageView.setVisibility(8);
            } else {
                C1473m.f7980a.ar().m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
            }
            RadioButton radioButton = (RadioButton) inflate.findViewById(C7582R.id.radio);
            radioButton.setId(i);
            radioButton.setClickable(false);
            radioButton.setVisibility(0);
            inflate.setOnClickListener(new C2075d(this, i));
            if (z && (inflate instanceof SeparatorLinearLayout)) {
                ((SeparatorLinearLayout) inflate).m10858a();
            }
            viewGroup.addView(inflate);
            i++;
        }
        if (this.ak == 2) {
            m10875a(0);
        }
    }

    protected final boolean mo2622a(ao[] aoVarArr) {
        if (aoVarArr.length <= 0) {
            return true;
        }
        FinskyLog.m21665c("Unexpected instruments found.", new Object[0]);
        C2070e al = al();
        if (al == null) {
            return false;
        }
        al.mo2614q();
        return false;
    }

    protected final C2066w mo2600a(v vVar) {
        return null;
    }

    protected final void mo2605a(ao[] aoVarArr, byte[] bArr) {
    }

    protected final void mo2603a(String str, byte[] bArr) {
        C2070e al = al();
        if (al != null) {
            al.mo2611n();
        }
    }

    protected final void mo2601a(RedeemCodeResult redeemCodeResult) {
        FinskyLog.m21669e("Unexpected promo code redemption.", new Object[0]);
    }

    protected final void mo2602a(String str) {
        C2070e al = al();
        if (al != null) {
            al.mo2613p();
        }
    }

    protected int aj() {
        return C7582R.layout.prompt_for_fop_row;
    }

    final void m10875a(int i) {
        for (int i2 = 0; i2 < this.an.size(); i2++) {
            boolean z;
            RadioButton radioButton = (RadioButton) this.ap.findViewById(i2);
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            radioButton.setChecked(z);
        }
        this.ao = i;
        this.am.setEnabled(true);
    }

    protected boolean ak() {
        return true;
    }

    public void onClick(View view) {
        if (this.ao >= 0) {
            ((C2066w) this.an.get(this.ao)).f10598f.onClick(view);
        }
    }

    final C2070e al() {
        if (m603h() instanceof C2070e) {
            return (C2070e) m603h();
        }
        FinskyLog.m21669e("No listener registered.", new Object[0]);
        return null;
    }

    protected final Intent ac() {
        return RedeemCodeActivity.m10895a(this.g.name, 2, null, null, this.af);
    }

    protected int ad() {
        return 2;
    }

    protected final void mo968W() {
        this.af.m13370a(new C2488p().m13345b((ad) m603h()).m13340a(213));
    }

    protected final void mo2599Z() {
        if (!this.aq) {
            this.aq = true;
            for (int i = 0; i < this.an.size(); i++) {
                C2066w c2066w = (C2066w) this.an.get(i);
                this.af.m13370a(new C2488p().m13345b(this).m13340a(c2066w.f10600h).m13343a(c2066w.f10599g));
            }
            if (this.ak != 2) {
                this.af.m13370a(new C2488p().m13345b(this).m13340a(1008));
            }
        }
    }

    public ce getPlayStoreUiElement() {
        return this.aj;
    }

    public ad getParentNode() {
        return (ad) m603h();
    }
}
