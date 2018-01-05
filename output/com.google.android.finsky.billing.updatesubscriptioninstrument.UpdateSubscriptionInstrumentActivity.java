package com.google.android.finsky.billing.updatesubscriptioninstrument;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.e;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.flushlogs.a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.android.wallet.common.util.a;
import com.google.wireless.android.finsky.a.a.bc;
import com.google.wireless.android.finsky.a.a.bd;
import com.google.wireless.android.finsky.a.a.be;

protected class UpdateSubscriptionInstrumentActivity extends com.google.android.finsky.billing.common.h implements View$OnClickListener, com.google.android.finsky.at.m, com.google.android.finsky.billing.common.t, com.google.android.finsky.billing.profile.j, com.google.android.finsky.billing.profile.k
{

    public com.google.android.finsky.flushlogs.a A;
    public String G;
    public int H;
    public View I;
    public View J;
    public TextView K;
    public PlayActionButtonV2 L;
    public PlayActionButtonV2 M;
    public TextView N;
    public TextView O;
    public com.google.wireless.android.finsky.a.a.be P;
    public boolean Q;
    public com.google.android.finsky.accounts.a n;
    public com.google.android.finsky.ba.c o;
    public Account p;
    public com.google.android.finsky.cv.a.ax q;
    public long r;
    public int s;
    public byte[] t;
    public String u;
    public com.google.android.finsky.billing.updatesubscriptioninstrument.c v;
    public int w;

    UpdateSubscriptionInstrumentActivity() {
        com.google.android.finsky.billing.common.h();
        this.t = 0;
        this.w = 0;
        this.H = -1;
    }

    public static Intent a(Context p0, String p1, com.google.android.finsky.cv.a.ax p2, long p3, int p5, byte[] p6, com.google.android.finsky.d.w p7) {
        v0 = new Intent(p0, UpdateSubscriptionInstrumentActivity);
        v0.putExtra("backend_docid", p2.b);
        v0.putExtra("backend", p2.d);
        v0.putExtra("document_type", p2.c);
        v0.putExtra("instrument_id", p3);
        v0.putExtra("instrument_rank", p5);
        v0.putExtra("payment_client_token", p6);
        p7.b(p1).a(v0);
        com.google.android.finsky.billing.common.h.a(v0, p1);
        return v0;
    }

    public static Intent a(Context p0, String p1, com.google.android.finsky.cv.a.ax p2, long p3, byte[] p5, com.google.android.finsky.d.w p6) {
        return UpdateSubscriptionInstrumentActivity.a(p0, p1, p2, p3, 0, p5, p6);
    }

    private final void a(com.google.wireless.android.finsky.a.a.bd p0) {
  8:    switch (p0.b) {
            case 1:
 42:            if (this.Q == 0)
 44:                this.e(0);
 57:            if (!this.getIntent().getBooleanExtra("show_success", 1))
 59:                this.c(-1);
                else {
 65:                this.P = p0.d;
 69:                if (this.P == 0) {
 81:                    Toast.makeText(this, Html.fromHtml(p0.c), 1).show();
 84:                    this.c(-1);
                    }
                    else {
 94:                    this.N.setText(this.P.b);
103:                    this.O.setText(this.P.c);
112:                    this.L.a(0, this.P.d, this);
121:                    if (this.P.d())
129:                        this.M.a(0, this.P.f, this);
140:                    this.I.setVisibility(8);
145:                    this.J.setVisibility(8);
150:                    this.K.setVisibility(8);
155:                    this.O.setVisibility(0);
160:                    this.L.setVisibility(0);
163:                    if (this.P.d())
167:                        this.M.setVisibility(0);
                    }
                }
 62:            return;
            case 2:
180:            break;
            default:
 39:            throw new IllegalStateException(36 + "Unknown response result: " + p0.b);
        }
171:    this.e(2);
176:    this.a(p0.c, 2);
179:    goto 62;
    }

    private final void a(String p0, int p1) {
        new com.google.android.finsky.at.k().b(p0).d(2131952688).a(0, p1, 0).a().a(this.H_(), "UpdateSubscriptionInstrumentActivity.errorDialog");
    }

    private final void c(int p0) {
        this.w = p0;
        this.finish();
    }

    private final com.google.android.finsky.d.c d(int p0) {
        return new com.google.android.finsky.d.c(p0).c(this.G).a(this.u).a(this.q);
    }

    private final void e(int p0) {
        if (p0 == 0)
            v0 = 1;
        else
            v0 = 0;
        this.E.a(this.d(1401).a(p0).a(v0));
    }

    private final void h() {
        this.I.setVisibility(0);
        this.J.setVisibility(8);
        this.N.setText(2131953345);
        this.K.setVisibility(0);
        this.O.setVisibility(8);
        this.L.setVisibility(4);
        if (this.M.getVisibility() == 0)
            this.M.setVisibility(4);
    }

    private final void i() {
        if (!this.o.j(this.B).a(12641639)) {
            v0 = (com.google.android.finsky.billing.updatesubscriptioninstrument.b)this.H_().a(2131755313);
            v0.B.a().a(v0.e).c();
        }
        this.H_().a().b(2131755313, com.google.android.finsky.billing.updatesubscriptioninstrument.b.a(this.p, this.q, this.s)).c();
    }

    public final void a() {
        this.v.a(this.s);
        this.v.c.a = -1;
        this.v.c.a = 2;
        this.v.c.e = 1;
        this.v.b.a(this.v.c, this.v, this.v);
        this.v.b(1, 0);
        this.E.a(this.d(1400));
    }

    public final void a(int p0, Bundle p1) {
        ((com.google.android.finsky.at.e)this.H_().a("UpdateSubscriptionInstrumentActivity.errorDialog")).a(0);
        switch (p0) {
            case 1:
                break;
            case 2:
                this.i();
                break;
            default:
                throw new IllegalArgumentException(37 + "Unsupported request code: " + p0);
        }
        this.h();
    }

    public final void a(RedeemCodeResult p0) {
        FinskyLog.e("Promo code redemption not supported.", new Object[0]);
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        if (this.H == p0.ag) {
            if (this.Q != 0)
                this.a(this.v.d);
            return;
        }
        this.H = p0.ag;
        switch (p0.l) {
            case 0:
                break;
            case 1:
                this.I.setVisibility(8);
                this.J.setVisibility(0);
                this.K.setVisibility(0);
                this.O.setVisibility(8);
                this.L.setVisibility(4);
                if (this.M.getVisibility() == 0)
                    this.M.setVisibility(4);
                break;
            case 2:
                this.a(this.v.d);
                this.Q = 1;
                break;
            case 3:
                this.E.a(this.d(1401).a(1).a(0).a(this.v.e));
                this.a(com.google.android.finsky.api.m.a(this, this.v.e), 1);
                break;
            default:
                throw new IllegalStateException(35 + "Unhandled state change: " + p0.l);
        }
    }

    public final void a(String p0, byte[] p1) {
        this.v.a(this.s);
        if (p1 != 0 && p1.length != 0) {
            if (p1 == 0)
                throw new NullPointerException();
            this.v.c.a = -1;
            this.v.c.a = 0;
            this.v.c.c = p1;
        }
        this.v.b.a(this.v.c, this.v, this.v);
        this.v.b(1, 0);
        this.E.a(this.d(1400));
    }

    public final void b(int p0, Bundle p1) {
        this.a(p0, p1);
    }

    protected final int f() {
        return 5580;
    }

    public final void f_(int p0) {
    }

    public void finish() {
        v2 = 1;
        if (this.D == 0) {
            this.setResult(this.w);
            switch (this.w) {
                case -1:
                    v0 = 0;
                    break;
                case 0:
                    v0 = -1;
                    break;
                case 1:
                    v0 = 1;
                    break;
                case 2:
                    v0 = 2;
                    break;
                default:
                    throw new IllegalStateException(32 + "Unknown result code: " + this.w);
            }
            if (v0 != 0)
                v2 = 0;
            this.E.a(this.d(1404).a(v0).a(v2));
        }
        super.finish();
    }

    public final void k() {
        this.c(0);
    }

    public void onClick(View p0) {
        if (p0 == this.L)
            v0 = this.P.e;
        else if (p0 == this.M)
            v0 = this.P.g;
        else {
            FinskyLog.e("Unknown button selected", new Object[0]);
            this.c(-1);
            v0 = 0;
        }
        this.Q = 0;
        this.s = 1;
        switch (v0) {
            case 1:
                this.c(-1);
                break;
            case 2:
                this.i();
                this.h();
                break;
            case 3:
                this.s = 2;
                this.i();
                this.h();
                break;
            default:
                v3 = new Object[1];
                v3[0] = Integer.valueOf(v0);
                FinskyLog.e("Invalid UpdateResponseDialogAction %s", v3);
                this.c(-1);
                break;
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.billing.updatesubscriptioninstrument.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.updatesubscriptioninstrument.a)).a(this);
        if (this.D != 0)
            this.finish();
        else {
            v1 = this.getIntent();
            this.u = v1.getStringExtra("backend_docid");
            this.G = com.google.android.wallet.common.util.a.a(this);
            if (p0 == 0)
                this.E.a(this.d(1403));
            else {
                this.H = p0.getInt("UpdateSubscriptionInstrumentActivity.lastHandledStateInstance");
                this.Q = p0.getBoolean("UpdateSubscriptionInstrumentActivity.updateSubscriptionInstrumentSucceeded");
            }
            if (!((Boolean)com.google.android.finsky.aa.b.ao.b()).booleanValue()) {
                FinskyLog.c("Update subscription instrument flow disabled by Gservices.", new Object[0]);
                this.c(2);
            }
            else if (!com.google.android.finsky.dh.a.b(this) && !((Boolean)com.google.android.finsky.aa.b.ap.b()).booleanValue()) {
                FinskyLog.c("Calling from untrusted package", new Object[0]);
                this.c(1);
            }
            else {
                this.p = this.n.b(this.B);
                if (this.p == 0) {
                    FinskyLog.c("Invalid account name provided.", new Object[0]);
                    this.c(1);
                }
                else if ((!v1.hasExtra("backend")) || (!v1.hasExtra("document_type")) || TextUtils.isEmpty(this.u)) {
                    FinskyLog.c("Invalid intent arguments provided.", new Object[0]);
                    this.c(1);
                }
                else {
                    this.setContentView(2130969491);
                    this.L = (PlayActionButtonV2)this.findViewById(2131755791);
                    this.L.setVisibility(8);
                    this.M = (PlayActionButtonV2)this.findViewById(2131755776);
                    this.M.setVisibility(8);
                    this.N = (TextView)this.findViewById(2131755114);
                    this.N.setText(2131953345);
                    this.O = (TextView)this.findViewById(2131755437);
                    this.findViewById(2131755333).setVisibility(0);
                    this.K = (TextView)this.findViewById(2131755755);
                    this.K.setText(this.B);
                    this.K.setVisibility(0);
                    this.q = new com.google.android.finsky.cv.a.ax();
                    this.q.b = this.u;
                    this.q.d = v1.getIntExtra("backend", 0);
                    this.q.c = v1.getIntExtra("document_type", 15);
                    this.r = v1.getLongExtra("instrument_id", 0);
                    this.s = v1.getIntExtra("instrument_rank", 0);
                    this.t = v1.getByteArrayExtra("payment_client_token");
                }
            }
        }
    }

    protected void onPause() {
        this.v.a(0);
        super.onPause();
        this.A.a();
    }

    protected void onResume() {
        super.onResume();
        this.J = this.findViewById(2131755430);
        this.I = this.findViewById(2131755313);
        this.A.c();
        this.v.a(this);
        if (this.r != 0 && this.t != 0) {
            this.v.a(this.s);
            this.v.c.a = -1;
            this.v.c.a = 1;
            this.v.c.d = this.r;
            if (this.t == 0)
                throw new NullPointerException();
            this.v.c.b = this.v.c.b | 8;
            this.v.c.g = this.t;
            this.v.b.a(this.v.c, this.v, this.v);
            this.v.b(1, 0);
            this.E.a(this.d(1400));
        }
    }

    public void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putInt("UpdateSubscriptionInstrumentActivity.lastHandledStateInstance", this.H);
        p0.putBoolean("UpdateSubscriptionInstrumentActivity.updateSubscriptionInstrumentSucceeded", this.Q);
    }

    protected void onStart() {
        super.onStart();
        if (this.H_().a(2131755313) == 0 && this.r == 0)
            this.H_().a().a(2131755313, com.google.android.finsky.billing.updatesubscriptioninstrument.b.a(this.p, this.q, this.s)).c();
        this.v = (com.google.android.finsky.billing.updatesubscriptioninstrument.c)this.H_().a("UpdateSubscriptionInstrumentActivity.sidecar");
        if (this.v == 0) {
            this.v = com.google.android.finsky.billing.updatesubscriptioninstrument.c.a(this.B, this.q);
            this.H_().a().a(this.v, "UpdateSubscriptionInstrumentActivity.sidecar").c();
        }
    }

}
