package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1791f;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.C1803u;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.billing.payments.C2041d;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.ff;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import java.util.HashMap;
import java.util.Map;

public final class C2056m extends C1089s {
    public static final Uri f10559a = Uri.parse((String) C0955b.ac.m28964b());
    public C1655h ah;
    public String ai;
    public SetupWizardParams aj;
    public Intent ak;
    public u al;
    public String am;
    public VolleyError an;
    public Map ao;
    public RedeemCodeResult ap;
    public String aq;
    public byte[] ar;
    public String as;
    public C1254c at;
    public int au;
    public int av;
    public Account aw;
    public byte[] ax;
    public C2471a f10560b;
    public C1287h f10561c;
    public C1461c f10562d;
    public C2041d f10563e;
    public C1793i f10564f;
    public C1803u f10565g;

    public static C2056m m10807a(Account account, String str, SetupWizardParams setupWizardParams, Intent intent, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BillingProfileSidecar.account", account);
        bundle.putString("BillingProfileSidecar.purchaseContextToken", str);
        bundle.putParcelable("BillingProfileSidecar.setupWizardParams", setupWizardParams);
        bundle.putParcelable("BillingProfileSidecar.redeemCodeIntent", intent);
        bundle.putInt("BillingProfileSidecar.billingProfileFlow", i);
        bundle.putInt("BillingProfileSidecar.backendId", i2);
        Fragment c2056m = new C2056m();
        c2056m.m600f(bundle);
        return c2056m;
    }

    public final void mo136b(Bundle bundle) {
        ((C1358l) C3947d.m18649a(C1358l.class)).mo1772a(this);
        Bundle bundle2 = this.f760q;
        this.aw = (Account) bundle2.getParcelable("BillingProfileSidecar.account");
        this.ai = bundle2.getString("BillingProfileSidecar.purchaseContextToken");
        this.aj = (SetupWizardParams) bundle2.getParcelable("BillingProfileSidecar.setupWizardParams");
        this.ak = (Intent) bundle2.getParcelable("BillingProfileSidecar.redeemCodeIntent");
        this.at = this.f10561c.mo2016a(this.aw.name);
        this.au = bundle2.getInt("BillingProfileSidecar.billingProfileFlow");
        this.av = bundle2.getInt("BillingProfileSidecar.backendId");
        super.mo136b(bundle);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putParcelable("BillingProfileSidecar.billingProfile", ParcelableProto.m21671a(this.al));
        bundle.putByteArray("BillingProfileSidecar.backgroundEventServerLogsCookies", this.ax);
    }

    protected final void mo2462a(Bundle bundle) {
        super.mo2462a(bundle);
        this.al = (u) ParcelableProto.m21673a(bundle, "BillingProfileSidecar.billingProfile");
        this.ax = bundle.getByteArray("BillingProfileSidecar.backgroundEventServerLogsCookies");
    }

    public final String mo968W() {
        return this.f10564f.m9766a(m603h(), this.aw.name, C2043f.m10743a(this.aj));
    }

    public final void m10816a(String str, ax axVar, int i, C2495w c2495w) {
        m10815a(str, axVar, i);
        c2495w.m13367a(m10811a(343));
        this.ax = null;
        m6758b(1, 0);
        this.at.mo1595a(this.ai, this.ao, new C2062s(this, c2495w, 2, 3), new C2061r(this, c2495w, 3));
    }

    final void m10815a(String str, ax axVar, int i) {
        if (this.ao == null) {
            this.ao = new HashMap();
            C1791f.m9754a(m603h().getApplicationContext(), this.ao);
            if (axVar != null) {
                this.ao.put("doc", Base64.encodeToString(C0757i.m4909a((C0757i) axVar), 10));
                if (i != 0) {
                    this.ao.put("ir", Integer.toString(i));
                }
            }
            this.ao.put("bpif", String.valueOf(this.au));
            this.ao.put("bppcc", str);
        }
    }

    public final boolean m10809X() {
        return !m603h().isFinishing();
    }

    public final C2066w m10810a(v vVar, byte[] bArr, ad adVar, C2495w c2495w) {
        switch (vVar.d) {
            case 3:
                if (this.aj == null) {
                    return new C2066w(vVar, new C2057n(this, vVar, c2495w, adVar), 815);
                }
                FinskyLog.m21665c("Skipping Redeem for setup wizard", new Object[0]);
                return null;
            case 4:
                if (this.aj == null) {
                    return new C2066w(vVar, new C2058o(this, vVar, c2495w, adVar), 816);
                }
                FinskyLog.m21665c("Skipping Topup for setup wizard", new Object[0]);
                return null;
            case 6:
                return new C2066w(vVar, new C2059p(this, vVar, c2495w, adVar, bArr), 817);
            default:
                FinskyLog.m21665c("Skipping unknown option: type=%d, displayTitle=%s", Integer.valueOf(vVar.d), vVar.e);
                return null;
        }
    }

    public final void m10817a(byte[] bArr, byte[] bArr2, byte[] bArr3, C2495w c2495w) {
        this.ax = bArr3;
        startActivityForResult(InstrumentManagerActivity.m10735a(m603h(), this.aw.name, bArr2, bArr, Bundle.EMPTY, c2495w, this.av), 10);
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        this.as = null;
        if (i2 == -1) {
            this.aq = null;
            this.ar = null;
            switch (i) {
                case 4:
                    boolean a = this.f10562d.mo2249j(this.aw.name).mo2294a(12632678);
                    RedeemCodeResult redeemCodeResult = (RedeemCodeResult) intent.getParcelableExtra("redeem_code_result");
                    if (redeemCodeResult == null) {
                        if (a) {
                            m6758b(5, 0);
                            break;
                        }
                    }
                    if (!a) {
                        this.f10560b.m13179a(intent.getExtras()).m13367a(m10811a(326));
                    }
                    this.ap = redeemCodeResult;
                    Object obj = this.ap.f9307a;
                    byte[] bArr = this.ap.f9308b;
                    if (!TextUtils.isEmpty(obj) || bArr != null) {
                        this.aq = obj;
                        this.ar = bArr;
                        m6758b(4, 0);
                        break;
                    }
                    m6758b(5, 0);
                    break;
                    break;
                case 5:
                    if (this.f10562d.mo2249j(this.aw.name).mo2294a(12634793)) {
                        if (intent.hasExtra("topupInstrumentId")) {
                            this.aq = intent.getStringExtra("topupInstrumentId");
                        }
                        if (intent.hasExtra("topupInstrumentToken")) {
                            this.ar = Base64.decode(intent.getStringExtra("topupInstrumentToken"), 8);
                        }
                    } else {
                        this.f10560b.m13179a(intent.getExtras()).m13367a(m10811a(327));
                        ff ffVar = (ff) ParcelableProto.m21672a(intent, "topUpResult");
                        if (ffVar == null) {
                            FinskyLog.m21665c("Missing TopupResult", new Object[0]);
                        } else {
                            this.aq = ffVar.b;
                            this.ar = ffVar.c;
                        }
                    }
                    m6758b(4, 0);
                    break;
                case 6:
                    this.f10560b.m13179a(intent.getExtras()).m13367a(m10811a(328));
                    this.aq = intent.getStringExtra("instrument_id");
                    this.ar = intent.getByteArrayExtra("instrument_token");
                    m6758b(4, 0);
                    this.ah.m9407a(this.aw.name, null);
                    break;
                case 10:
                    this.f10560b.m13179a(intent.getExtras()).m13367a(m10811a(329));
                    this.aq = intent.getStringExtra("instrument_id");
                    this.ar = intent.getByteArrayExtra("instrument_token");
                    m6758b(4, 0);
                    this.ah.m9407a(this.aw.name, null);
                    break;
                case 11:
                    m6758b(6, 0);
                    break;
            }
        }
        super.mo2342a(i, i2, intent);
    }

    final C2474c m10811a(int i) {
        C2474c d = new C2474c(i).m13248d(this.au);
        if (this.ax != null) {
            d.m13240a(this.ax);
        }
        return d;
    }

    final void m10813a(int i, Throwable th, C2495w c2495w) {
        C2474c a = m10811a(344);
        if (i == 0) {
            a.m13239a(true);
        } else {
            a.m13239a(false).m13210a(i).m13238a(th);
        }
        c2495w.m13367a(a);
    }
}
