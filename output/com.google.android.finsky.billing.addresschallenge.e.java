package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.addresschallenge.a.af;
import com.google.android.finsky.billing.addresschallenge.a.d;
import com.google.android.finsky.billing.addresschallenge.a.g;
import com.google.android.finsky.billing.addresschallenge.a.h;
import com.google.android.finsky.billing.addresschallenge.a.j;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.c;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.ad;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.a.a.c;
import com.google.wireless.android.finsky.a.a.i;
import com.google.wireless.android.finsky.a.a.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class com.google.android.finsky.billing.addresschallenge.e extends Fragment implements View$OnClickListener, CompoundButton$OnCheckedChangeListener, com.google.android.finsky.d.ad
{

    public final com.google.android.finsky.d.a a;
    public com.google.wireless.android.a.a.a.a.ce af;
    public com.google.android.finsky.d.w ag;
    public com.google.wireless.android.finsky.a.a.c b;
    public Bundle c;
    public com.google.android.finsky.billing.addresschallenge.i d;
    public ViewGroup e;
    public Button f;
    public BillingAddress g;
    public List h;
    public com.google.wireless.android.finsky.a.a.i i;

    e() {
        Fragment();
        this.a = com.google.android.finsky.m.a.aR();
    }

    private final void W() {
        v1 = 0;
        v3 = 1;
        while (v1 < this.i.f.length) {
            if (v3 != 0 && (this.i.f[v1].e == 0 || ((CheckBox)this.e.findViewWithTag(this.i.f[v1])).isChecked()))
                v3 = 1;
            else
                v3 = 0;
            v1 = v1 + 1;
        }
        this.f.setEnabled(v3);
    }

    private final boolean[] X() {
        v3 = new boolean[this.i.f.length];
        v1 = 0;
        while (v1 < this.i.f.length) {
            v3[v1] = ((CheckBox)this.e.findViewWithTag(this.i.f[v1])).isChecked();
            v1 = v1 + 1;
        }
        return v3;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        if (p1 == 0)
            v0 = 0;
        else {
            this.e = (ViewGroup)p0.inflate(2130968646, p1, 0);
            this.b = new com.google.wireless.android.finsky.a.a.c();
            this.b.b = new int[this.i.j.length];
            System.arraycopy(this.i.j, 0, this.b.b, 0, this.i.j.length);
            if (!TextUtils.isEmpty(this.i.i) && p2 == 0)
                this.e.post(new com.google.android.finsky.billing.addresschallenge.f(this));
            v0 = (TextView)this.e.findViewById(2131755375);
            if (!TextUtils.isEmpty(this.i.d))
                v0.setText(this.i.d);
            else
                v0.setVisibility(8);
            v0 = (TextView)this.e.findViewById(2131755376);
            if (!TextUtils.isEmpty(this.i.e))
                com.google.android.finsky.bg.ae.a(v0, this.i.e);
            else
                v0.setVisibility(8);
            v1 = (ViewGroup)this.e.findViewById(2131755326);
            v6 = v1.indexOfChild(v0) + 1;
            v2 = 0;
            while (v2 < this.i.f.length) {
                v0 = (CheckBox)LayoutInflater.from(this.h()).inflate(2130968645, this.e, 0);
                v0.setText(this.i.f[v2].c);
                v0.setTag(this.i.f[v2]);
                if (p2 == 0 && this.c == 0)
                    v0.setChecked(this.i.f[v2].d);
                else if (this.c != 0)
                    v0.setChecked(this.c.getBoolean(20 + "checkbox_" + v2));
                else if (p2 != 0)
                    v0.setChecked(p2.getBoolean(20 + "checkbox_" + v2));
                v0.setOnCheckedChangeListener(this);
                v1.addView(v0, v6 + v2);
                v2 = v2 + 1;
            }
            this.g = (BillingAddress)this.e.findViewById(2131755377);
            this.g.setBillingCountryChangeListener(new com.google.android.finsky.billing.addresschallenge.g(this));
            this.f = (Button)this.e.findViewById(2131755405);
            this.f.setOnClickListener(this);
            this.f.setEnabled(0);
            this.f.setText(2131951948);
            v0 = this.e.findViewById(2131755404);
            ((Button)v0).setOnClickListener(this);
            ((Button)v0).setText(2131951799);
            if (this.i.k.length <= 0)
                throw new IllegalStateException("No supported countries");
            this.h = com.google.android.finsky.utils.c.a(this.i.k);
            this.W();
            this.g.setBillingCountries(this.h);
            if (p2 != 0) {
                v0 = (com.google.wireless.android.finsky.a.a.c)ParcelableProto.a(p2, "address_spec");
                if (v0 != 0) {
                    this.g.m = v0;
                    this.g.j = (com.google.wireless.android.finsky.a.a.p)ParcelableProto.a(p2, "selected_country");
                    this.g.a(this.g.j, this.g.m, 0);
                    this.g.l.b(p2);
                }
            }
            else {
                if (this.i.g != 0 && !TextUtils.isEmpty(this.i.g.j))
                    this.g.a(com.google.android.finsky.billing.addresschallenge.n.a(this.i.g.j, this.h), this.b, this.i.g);
                else {
                    v0 = ((TelephonyManager)this.h().getSystemService("phone")).getSimCountryIso().toUpperCase(Locale.US);
                    if (TextUtils.isEmpty(v0))
                        v0 = "US";
                    this.g.a(com.google.android.finsky.billing.addresschallenge.n.a(v0, this.h), this.b, 0);
                }
                new Handler(Looper.getMainLooper()).post(new com.google.android.finsky.billing.addresschallenge.h(this));
            }
            v0 = this.e;
        }
        return v0;
    }

    final void a(Bundle p0) {
        v1 = 0;
        while (v1 < this.i.f.length) {
            p0.putBoolean(20 + "checkbox_" + v1, ((CheckBox)this.e.findViewWithTag(this.i.f[v1])).isChecked());
            v1 = v1 + 1;
        }
        if (this.g != 0) {
            p0.putParcelable("address_spec", ParcelableProto.a(this.g.m));
            p0.putParcelable("selected_country", ParcelableProto.a(this.g.j));
            if (this.g.l != 0)
                this.g.l.a(p0);
        }
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.i = (com.google.wireless.android.finsky.a.a.i)ParcelableProto.a(this.q, "address_challenge");
        this.af = com.google.android.finsky.d.j.a(1320);
        if (p0 == 0) {
            this.ag = this.a.a(this.q);
            this.ag.a(new com.google.android.finsky.d.p().b(this));
        }
        else
            this.ag = this.a.a(p0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        this.a(p0);
    }

    public final com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.af;
    }

    public final void onCheckedChanged(CompoundButton p0, boolean p1) {
        this.W();
    }

    public final void onClick(View p0) {
        v0 = p0.getId();
        if (v0 == 2131755405) {
            v2 = this.g.getAddressValidationErrors();
            this.g.a.setError(0);
            this.g.b.setError(0);
            this.g.c.setError(0);
            this.g.e.setError(0);
            this.g.f.setError(0);
            v4 = this.g.l.g.a(this.g.l.m, this.g.l.k).iterator();
            while (v4.hasNext()) {
                v0 = (com.google.android.finsky.billing.addresschallenge.a.g)this.g.l.e.get((com.google.android.finsky.billing.addresschallenge.a.d)v4.next());
                if (v0 == 0)
                    continue;
                if (v0.b != com.google.android.finsky.billing.addresschallenge.a.h.a)
                    continue;
                if ((EditText)v0.f == 0)
                    continue;
                ((EditText)v0.f).setError(0);
            }
            v3 = new ArrayList();
            v4 = v2.iterator();
            while (v4.hasNext()) {
                v0 = this.g.a((com.google.wireless.android.finsky.a.a.ad)v4.next());
                if (v0 == 0)
                    continue;
                v3.add(v0);
            }
            v0 = com.google.android.finsky.billing.addresschallenge.n.a(this.e, v3);
            if ((TextView)v0 != 0)
                ((TextView)v0).requestFocus();
            if (v2.size() == 0)
                v0 = this.g.getAddress();
            else
                v0 = 0;
            if (v0 != 0) {
                this.ag.b(new com.google.android.finsky.d.d(this).a(1321));
                this.d.a(0, v0, this.X());
            }
        }
        else if (v0 == 2131755404) {
            this.ag.b(new com.google.android.finsky.d.d(this).a(1322));
            this.d.a(2, 0, 0);
        }
    }

}
