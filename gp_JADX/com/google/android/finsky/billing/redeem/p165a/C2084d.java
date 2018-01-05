package com.google.android.finsky.billing.redeem.p165a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.C1833f;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.billing.redeem.C2088a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;

public final class C2084d extends C1076h {
    public final ce f10635a = C2482j.m13283a(881);
    public String f10636b;
    public View f10637c;
    public EditText f10638d;
    public TextView f10639e;

    public static C2084d m10916a(String str, String str2, String str3, PurchaseFlowConfig purchaseFlowConfig) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("RedeemScreenStep.prefill_code", str2);
        bundle.putString("RedeemScreenStep.error_message_html", str3);
        C1473m.f7980a.aH().m9785b(bundle, purchaseFlowConfig);
        Fragment c2084d = new C2084d();
        c2084d.m600f(bundle);
        return c2084d;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (bundle != null) {
            this.f10636b = bundle.getString("RedeemScreenStep.error_message_html");
        } else {
            this.f10636b = this.f760q.getString("RedeemScreenStep.error_message_html");
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putString("RedeemScreenStep.error_message_html", this.f10636b);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10637c = layoutInflater.inflate(C7582R.layout.redeem_screen_step, viewGroup, false);
        this.f10638d = (EditText) this.f10637c.findViewById(C7582R.id.pin_entry);
        CharSequence string = this.f760q.getString("RedeemScreenStep.prefill_code");
        if (bundle == null && !TextUtils.isEmpty(string)) {
            this.f10638d.setText(string);
        }
        ae.m9215a(m603h(), this.f10638d, 6, 7);
        TextView textView = (TextView) this.f10637c.findViewById(C7582R.id.account);
        String string2 = this.f760q.getString("authAccount");
        textView.setText(C1473m.f7980a.mo2041U().mo1187d(string2));
        String a = C1833f.m9860a((String) C0955b.f5904t.m28964b());
        TextView textView2 = (TextView) this.f10637c.findViewById(C7582R.id.footer);
        ae.m9217a(textView2, m572a((int) C7582R.string.redeem_screen_footer, a, mo1406a(m605i())));
        this.f10638d.addTextChangedListener(new C2085e(this, this.f10638d.getTextColors()));
        this.f10638d.setOnEditorActionListener(new C2086f(this));
        if (C1473m.f7980a.mo2249j(string2).mo2294a(12625218)) {
            this.f10638d.setFilters(new InputFilter[]{new AllCaps()});
        }
        this.f10639e = (TextView) this.f10637c.findViewById(C7582R.id.error);
        m10918Y();
        ac();
        C1473m.f7980a.aH().m9782a(this.f760q, this.f10637c, (TextView) this.f10637c.findViewById(C7582R.id.redeem_screen_title), this.f10639e, null, null, textView2, ((C2088a) aa()).aF);
        return this.f10637c;
    }

    public final void mo1410a(View view, Bundle bundle) {
        super.mo1410a(view, bundle);
        if (bundle == null) {
            C1618s.m9294a(m603h(), this.f10638d);
            if (this.f10636b != null) {
                ab();
            }
        }
    }

    private final void ab() {
        C1621v.m9305a(m603h(), this.f10638d);
        C1601a.m9199a(this.f10637c.getContext(), this.f10639e.getText().toString(), this.f10637c, false);
    }

    final void m10918Y() {
        ((C2088a) aa()).mo1422b(!TextUtils.isEmpty(this.f10638d.getText()));
    }

    public final String mo1406a(Resources resources) {
        return resources.getString(C7582R.string.redeem_gift_card_button);
    }

    public final void mo1405X() {
        m10923a(false);
    }

    public final ce getPlayStoreUiElement() {
        return this.f10635a;
    }

    public final void m10922a(String str) {
        this.f10636b = str;
        C1618s.m9294a(m603h(), this.f10638d);
        ac();
        ab();
    }

    private final void ac() {
        if (this.f10637c == null) {
            FinskyLog.m21669e("Null mMainView.", new Object[0]);
        } else if (this.f10636b != null) {
            this.f10639e.setVisibility(0);
            ae.m9217a(this.f10639e, this.f10636b);
            this.f10638d.setTextColor(m605i().getColor(C7582R.color.purchase_flow_error_text_color));
        } else {
            this.f10639e.setVisibility(8);
        }
    }

    final void m10923a(boolean z) {
        cf cfVar = null;
        if (z) {
            cfVar = new cf();
            cfVar.d();
        }
        m6694a(882, cfVar);
        ((C2088a) aa()).m10940a(this.f10638d.getText().toString());
    }
}
