package com.google.android.finsky.billing.addresschallenge;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.addresschallenge.p156a.C1709d;
import com.google.android.finsky.billing.addresschallenge.p156a.C1712g;
import com.google.android.finsky.billing.addresschallenge.p156a.C1713h;
import com.google.android.finsky.billing.addresschallenge.p156a.C1715j;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.a.a.c;
import com.google.wireless.android.finsky.a.a.i;
import com.google.wireless.android.finsky.a.a.p;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public final class C1734e extends Fragment implements OnClickListener, OnCheckedChangeListener, ad {
    public final C2471a f9028a = C1473m.f7980a.aR();
    public ce af;
    public C2495w ag;
    public c f9029b;
    public Bundle f9030c;
    public C1732i f9031d;
    public ViewGroup f9032e;
    public Button f9033f;
    public BillingAddress f9034g;
    public List f9035h;
    public i f9036i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9036i = (i) ParcelableProto.m21673a(bundle2, "address_challenge");
        this.af = C2482j.m13283a(1320);
        if (bundle == null) {
            this.ag = this.f9028a.m13179a(bundle2);
            this.ag.m13370a(new C2488p().m13345b(this));
            return;
        }
        this.ag = this.f9028a.m13179a(bundle);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return null;
        }
        this.f9032e = (ViewGroup) layoutInflater.inflate(C7582R.layout.billing_addresschallenge_fragment, viewGroup, false);
        this.f9029b = new c();
        int length = this.f9036i.j.length;
        this.f9029b.b = new int[length];
        System.arraycopy(this.f9036i.j, 0, this.f9029b.b, 0, length);
        if (!TextUtils.isEmpty(this.f9036i.i) && bundle == null) {
            this.f9032e.post(new C1735f(this));
        }
        TextView textView = (TextView) this.f9032e.findViewById(C7582R.id.challenge_title);
        if (TextUtils.isEmpty(this.f9036i.d)) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f9036i.d);
        }
        textView = (TextView) this.f9032e.findViewById(C7582R.id.challenge_description);
        if (TextUtils.isEmpty(this.f9036i.e)) {
            textView.setVisibility(8);
        } else {
            ae.m9217a(textView, this.f9036i.e);
        }
        LayoutInflater from = LayoutInflater.from(m603h());
        ViewGroup viewGroup2 = (ViewGroup) this.f9032e.findViewById(C7582R.id.content);
        int indexOfChild = viewGroup2.indexOfChild(textView) + 1;
        for (int i = 0; i < this.f9036i.f.length; i++) {
            am amVar = this.f9036i.f[i];
            CheckBox checkBox = (CheckBox) from.inflate(C7582R.layout.billing_addresschallenge_checkbox, this.f9032e, false);
            checkBox.setText(amVar.c);
            checkBox.setTag(amVar);
            if (bundle == null && this.f9030c == null) {
                checkBox.setChecked(amVar.d);
            } else if (this.f9030c != null) {
                checkBox.setChecked(this.f9030c.getBoolean("checkbox_" + i));
            } else if (bundle != null) {
                checkBox.setChecked(bundle.getBoolean("checkbox_" + i));
            }
            checkBox.setOnCheckedChangeListener(this);
            viewGroup2.addView(checkBox, indexOfChild + i);
        }
        this.f9034g = (BillingAddress) this.f9032e.findViewById(C7582R.id.billing_address);
        this.f9034g.setBillingCountryChangeListener(new C1737g(this));
        this.f9033f = (Button) this.f9032e.findViewById(C7582R.id.positive_button);
        this.f9033f.setOnClickListener(this);
        this.f9033f.setEnabled(false);
        this.f9033f.setText(C7582R.string.continue_text);
        Button button = (Button) this.f9032e.findViewById(C7582R.id.negative_button);
        button.setOnClickListener(this);
        button.setText(C7582R.string.cancel);
        if (this.f9036i.k.length > 0) {
            this.f9035h = C4672c.m21803a(this.f9036i.k);
            m9629W();
            this.f9034g.setBillingCountries(this.f9035h);
            if (bundle != null) {
                BillingAddress billingAddress = this.f9034g;
                c cVar = (c) ParcelableProto.m21673a(bundle, "address_spec");
                if (cVar != null) {
                    billingAddress.f8780m = cVar;
                    billingAddress.f8777j = (p) ParcelableProto.m21673a(bundle, "selected_country");
                    billingAddress.m9516a(billingAddress.f8777j, billingAddress.f8780m, null);
                    billingAddress.f8779l.m9601b(bundle);
                }
            } else {
                if (this.f9036i.g == null || TextUtils.isEmpty(this.f9036i.g.j)) {
                    String toUpperCase = ((TelephonyManager) m603h().getSystemService("phone")).getSimCountryIso().toUpperCase(Locale.US);
                    if (TextUtils.isEmpty(toUpperCase)) {
                        toUpperCase = "US";
                    }
                    this.f9034g.m9516a(C1742n.m9645a(toUpperCase, this.f9035h), this.f9029b, null);
                } else {
                    this.f9034g.m9516a(C1742n.m9645a(this.f9036i.g.j, this.f9035h), this.f9029b, this.f9036i.g);
                }
                new Handler(Looper.getMainLooper()).post(new C1738h(this));
            }
            return this.f9032e;
        }
        throw new IllegalStateException("No supported countries");
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        m9632a(bundle);
    }

    final void m9632a(Bundle bundle) {
        for (int i = 0; i < this.f9036i.f.length; i++) {
            bundle.putBoolean("checkbox_" + i, ((CheckBox) this.f9032e.findViewWithTag(this.f9036i.f[i])).isChecked());
        }
        if (this.f9034g != null) {
            BillingAddress billingAddress = this.f9034g;
            bundle.putParcelable("address_spec", ParcelableProto.m21671a(billingAddress.f8780m));
            bundle.putParcelable("selected_country", ParcelableProto.m21671a(billingAddress.f8777j));
            if (billingAddress.f8779l != null) {
                billingAddress.f8779l.m9595a(bundle);
            }
        }
    }

    private final void m9629W() {
        boolean z = true;
        for (am amVar : this.f9036i.f) {
            CheckBox checkBox = (CheckBox) this.f9032e.findViewWithTag(amVar);
            if (!z || (amVar.e && !checkBox.isChecked())) {
                z = false;
            } else {
                z = true;
            }
        }
        this.f9033f.setEnabled(z);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == C7582R.id.positive_button) {
            TextView a;
            a address;
            List<com.google.wireless.android.finsky.a.a.ad> addressValidationErrors = this.f9034g.getAddressValidationErrors();
            BillingAddress billingAddress = this.f9034g;
            billingAddress.f8768a.setError(null);
            billingAddress.f8769b.setError(null);
            billingAddress.f8770c.setError(null);
            billingAddress.f8772e.setError(null);
            billingAddress.f8773f.setError(null);
            C1715j c1715j = billingAddress.f8779l;
            for (C1709d c1709d : c1715j.f8972g.m9540a(c1715j.f8978m, c1715j.f8976k)) {
                C1712g c1712g = (C1712g) c1715j.f8970e.get(c1709d);
                if (c1712g != null && c1712g.f8955b == C1713h.EDIT) {
                    EditText editText = (EditText) c1712g.f8959f;
                    if (editText != null) {
                        editText.setError(null);
                    }
                }
            }
            Collection arrayList = new ArrayList();
            for (com.google.wireless.android.finsky.a.a.ad a2 : addressValidationErrors) {
                a = this.f9034g.m9514a(a2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            a = (TextView) C1742n.m9643a(this.f9032e, arrayList);
            if (a != null) {
                a.requestFocus();
            }
            if (addressValidationErrors.size() == 0) {
                address = this.f9034g.getAddress();
            } else {
                address = null;
            }
            if (address != null) {
                this.ag.m13379b(new C2475d(this).m13256a(1321));
                this.f9031d.mo2423a(0, address, m9630X());
            }
        } else if (id == C7582R.id.negative_button) {
            this.ag.m13379b(new C2475d(this).m13256a(1322));
            this.f9031d.mo2423a(2, null, null);
        }
    }

    private final boolean[] m9630X() {
        int length = this.f9036i.f.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((CheckBox) this.f9032e.findViewWithTag(this.f9036i.f[i])).isChecked();
        }
        return zArr;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m9629W();
    }

    public final ce getPlayStoreUiElement() {
        return this.af;
    }

    public final ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}
