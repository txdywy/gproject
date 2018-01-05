package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.f;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.common.u;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.billing.payments.d;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.utils.b.a;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.ff;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.billing.profile.m extends com.google.android.finsky.billing.common.s
{

    public static final Uri a;
    public com.google.android.finsky.billing.a.h ah;
    public String ai;
    public SetupWizardParams aj;
    public Intent ak;
    public com.google.wireless.android.finsky.dfe.nano.u al;
    public String am;
    public VolleyError an;
    public Map ao;
    public RedeemCodeResult ap;
    public String aq;
    public byte[] ar;
    public String as;
    public com.google.android.finsky.api.c at;
    public int au;
    public int av;
    public Account aw;
    public byte[] ax;
    public com.google.android.finsky.d.a b;
    public com.google.android.finsky.api.h c;
    public com.google.android.finsky.ba.c d;
    public com.google.android.finsky.billing.payments.d e;
    public com.google.android.finsky.billing.common.i f;
    public com.google.android.finsky.billing.common.u g;

    static {
        com.google.android.finsky.billing.profile.m.a = Uri.parse((String)com.google.android.finsky.aa.b.ac.b());
    }

    m() {
        com.google.android.finsky.billing.common.s();
    }

    public static com.google.android.finsky.billing.profile.m a(Account p0, String p1, SetupWizardParams p2, Intent p3, int p4, int p5) {
        v0 = new Bundle();
        v0.putParcelable("BillingProfileSidecar.account", p0);
        v0.putString("BillingProfileSidecar.purchaseContextToken", p1);
        v0.putParcelable("BillingProfileSidecar.setupWizardParams", p2);
        v0.putParcelable("BillingProfileSidecar.redeemCodeIntent", p3);
        v0.putInt("BillingProfileSidecar.billingProfileFlow", p4);
        v0.putInt("BillingProfileSidecar.backendId", p5);
        v1 = new com.google.android.finsky.billing.profile.m();
        v1.f(v0);
        return v1;
    }

    public final String W() {
        return this.f.a(this.h(), this.aw.name, com.google.android.finsky.billing.payments.f.a(this.aj));
    }

    public final boolean X() {
        if (!this.h().isFinishing())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.android.finsky.billing.profile.w a(com.google.wireless.android.finsky.dfe.nano.v p0, byte[] p1, com.google.android.finsky.d.ad p2, com.google.android.finsky.d.w p3) {
        v0 = 0;
        switch (p0.d) {
            case 3:
                if (this.aj == 0)
                    v0 = new com.google.android.finsky.billing.profile.w(p0, new com.google.android.finsky.billing.profile.n(this, p0, p3, p2), 815);
                else
                    FinskyLog.c("Skipping Redeem for setup wizard", new Object[0]);
                break;
            case 4:
                if (this.aj == 0)
                    v0 = new com.google.android.finsky.billing.profile.w(p0, new com.google.android.finsky.billing.profile.o(this, p0, p3, p2), 816);
                else
                    FinskyLog.c("Skipping Topup for setup wizard", new Object[0]);
                break;
            case 5:
                v2 = new Object[2];
                v2[0] = Integer.valueOf(p0.d);
                v2[1] = p0.e;
                FinskyLog.c("Skipping unknown option: type=%d, displayTitle=%s", v2);
                break;
            case 6:
                v0 = new com.google.android.finsky.billing.profile.w(p0, new com.google.android.finsky.billing.profile.p(this, p0, p3, p2, p1), 817);
                break;
            default:
                v2 = new Object[2];
                v2[0] = Integer.valueOf(p0.d);
                v2[1] = p0.e;
                FinskyLog.c("Skipping unknown option: type=%d, displayTitle=%s", v2);
                break;
        }
        return v0;
    }

    final com.google.android.finsky.d.c a(int p0) {
        v0 = new com.google.android.finsky.d.c(p0).d(this.au);
        if (this.ax != 0)
            v0.a(this.ax);
        return v0;
    }

    public final void a(int p0, int p1, Intent p2) {
        this.as = 0;
        if (p1 == -1) {
            this.aq = 0;
            this.ar = 0;
            switch (p0) {
                case 4:
                    v1 = this.d.j(this.aw.name).a(12632678);
                    v0 = (RedeemCodeResult)p2.getParcelableExtra("redeem_code_result");
                    if (v0 != 0) {
                        if (v1 == 0)
                            this.b.a(p2.getExtras()).a(this.a(326));
                        this.ap = v0;
                        if (TextUtils.isEmpty(this.ap.a) && this.ap.b == 0)
                            this.b(5, 0);
                        else {
                            this.aq = this.ap.a;
                            this.ar = this.ap.b;
                            this.b(4, 0);
                        }
                    }
                    else if (v1 != 0)
                        this.b(5, 0);
                    break;
                case 5:
                    if (this.d.j(this.aw.name).a(12634793)) {
                        if (p2.hasExtra("topupInstrumentId"))
                            this.aq = p2.getStringExtra("topupInstrumentId");
                        if (p2.hasExtra("topupInstrumentToken"))
                            this.ar = Base64.decode(p2.getStringExtra("topupInstrumentToken"), 8);
                    }
                    else {
                        this.b.a(p2.getExtras()).a(this.a(327));
                        v0 = (com.google.wireless.android.finsky.dfe.nano.ff)ParcelableProto.a(p2, "topUpResult");
                        if (v0 == 0)
                            FinskyLog.c("Missing TopupResult", new Object[0]);
                        else {
                            this.aq = v0.b;
                            this.ar = v0.c;
                        }
                    }
                    this.b(4, 0);
                    break;
                case 6:
                    this.b.a(p2.getExtras()).a(this.a(328));
                    this.aq = p2.getStringExtra("instrument_id");
                    this.ar = p2.getByteArrayExtra("instrument_token");
                    this.b(4, 0);
                    this.ah.a(this.aw.name, 0);
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    this.b.a(p2.getExtras()).a(this.a(329));
                    this.aq = p2.getStringExtra("instrument_id");
                    this.ar = p2.getByteArrayExtra("instrument_token");
                    this.b(4, 0);
                    this.ah.a(this.aw.name, 0);
                    break;
                case 11:
                    this.b(6, 0);
                    break;
                default:
                    break;
            }
        }
        super.a(p0, p1, p2);
    }

    final void a(int p0, Throwable p1, com.google.android.finsky.d.w p2) {
        v0 = this.a(344);
        if (p0 == 0)
            v0.a(1);
        else
            v0.a(0).a(p0).a(p1);
        p2.a(v0);
    }

    protected final void a(Bundle p0) {
        super.a(p0);
        this.al = (com.google.wireless.android.finsky.dfe.nano.u)ParcelableProto.a(p0, "BillingProfileSidecar.billingProfile");
        this.ax = p0.getByteArray("BillingProfileSidecar.backgroundEventServerLogsCookies");
    }

    final void a(String p0, com.google.android.finsky.cv.a.ax p1, int p2) {
        if (this.ao == 0) {
            this.ao = new HashMap();
            com.google.android.finsky.billing.common.f.a(this.h().getApplicationContext(), this.ao);
            if (p1 != 0) {
                this.ao.put("doc", Base64.encodeToString(com.google.protobuf.nano.i.a(p1), 10));
                if (p2 != 0)
                    this.ao.put("ir", Integer.toString(p2));
            }
            this.ao.put("bpif", String.valueOf(this.au));
            this.ao.put("bppcc", p0);
        }
    }

    public final void a(String p0, com.google.android.finsky.cv.a.ax p1, int p2, com.google.android.finsky.d.w p3) {
        this.a(p0, p1, p2);
        p3.a(this.a(343));
        this.ax = 0;
        this.b(1, 0);
        this.at.a(this.ai, this.ao, new com.google.android.finsky.billing.profile.s(this, p3, 2, 3), new com.google.android.finsky.billing.profile.r(this, p3, 3));
    }

    public final void a(byte[] p0, byte[] p1, byte[] p2, com.google.android.finsky.d.w p3) {
        this.ax = p2;
        this.startActivityForResult(InstrumentManagerActivity.a(this.h(), this.aw.name, p1, p0, Bundle.EMPTY, p3, this.av), 10);
    }

    public final void b(Bundle p0) {
        ((com.google.android.finsky.billing.profile.l)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.profile.l)).a(this);
        this.aw = (Account)this.q.getParcelable("BillingProfileSidecar.account");
        this.ai = this.q.getString("BillingProfileSidecar.purchaseContextToken");
        this.aj = (SetupWizardParams)this.q.getParcelable("BillingProfileSidecar.setupWizardParams");
        this.ak = (Intent)this.q.getParcelable("BillingProfileSidecar.redeemCodeIntent");
        this.at = this.c.a(this.aw.name);
        this.au = this.q.getInt("BillingProfileSidecar.billingProfileFlow");
        this.av = this.q.getInt("BillingProfileSidecar.backendId");
        super.b(p0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putParcelable("BillingProfileSidecar.billingProfile", ParcelableProto.a(this.al));
        p0.putByteArray("BillingProfileSidecar.backgroundEventServerLogsCookies", this.ax);
    }

}
