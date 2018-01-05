package com.google.android.finsky.billing.updatesubscriptioninstrument;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.profile.C2045j;
import com.google.android.finsky.billing.profile.C2055k;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.flushlogs.C3129a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.wallet.common.util.a;
import com.google.wireless.android.finsky.a.a.bc;
import com.google.wireless.android.finsky.a.a.bd;
import com.google.wireless.android.finsky.a.a.be;
import com.squareup.leakcanary.C7582R;

public class UpdateSubscriptionInstrumentActivity extends C1647h implements OnClickListener, C0998m, C1087t, C2045j, C2055k {
    public C3129a f10679A;
    public String f10680G;
    public int f10681H = -1;
    public View f10682I;
    public View f10683J;
    public TextView f10684K;
    public PlayActionButtonV2 f10685L;
    public PlayActionButtonV2 f10686M;
    public TextView f10687N;
    public TextView f10688O;
    public be f10689P;
    public boolean f10690Q;
    public C0986a f10691n;
    public C1461c f10692o;
    public Account f10693p;
    public ax f10694q;
    public long f10695r;
    public int f10696s;
    public byte[] f10697t = null;
    public String f10698u;
    public C2100c f10699v;
    public int f10700w = 0;

    @Deprecated
    public static Intent m10968a(Context context, String str, ax axVar, long j, byte[] bArr, C2495w c2495w) {
        return m10967a(context, str, axVar, j, 0, bArr, c2495w);
    }

    public static Intent m10967a(Context context, String str, ax axVar, long j, int i, byte[] bArr, C2495w c2495w) {
        Intent intent = new Intent(context, UpdateSubscriptionInstrumentActivity.class);
        intent.putExtra("backend_docid", axVar.f11833b);
        intent.putExtra("backend", axVar.f11835d);
        intent.putExtra("document_type", axVar.f11834c);
        intent.putExtra("instrument_id", j);
        intent.putExtra("instrument_rank", i);
        intent.putExtra("payment_client_token", bArr);
        c2495w.m13380b(str).m13376a(intent);
        C1647h.m9344a(intent, str);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1359a) C3947d.m18649a(C1359a.class)).mo1773a(this);
        if (this.D) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.f10698u = intent.getStringExtra("backend_docid");
        this.f10680G = a.a(this);
        if (bundle == null) {
            this.E.m13367a(m10972d(1403));
        } else {
            this.f10681H = bundle.getInt("UpdateSubscriptionInstrumentActivity.lastHandledStateInstance");
            this.f10690Q = bundle.getBoolean("UpdateSubscriptionInstrumentActivity.updateSubscriptionInstrumentSucceeded");
        }
        if (!((Boolean) C0955b.ao.m28964b()).booleanValue()) {
            FinskyLog.m21665c("Update subscription instrument flow disabled by Gservices.", new Object[0]);
            m10971c(2);
        } else if (C2744a.m14792b((Activity) this) || ((Boolean) C0955b.ap.m28964b()).booleanValue()) {
            this.f10693p = this.f10691n.mo1183b(this.B);
            if (this.f10693p == null) {
                FinskyLog.m21665c("Invalid account name provided.", new Object[0]);
                m10971c(1);
            } else if (intent.hasExtra("backend") && intent.hasExtra("document_type") && !TextUtils.isEmpty(this.f10698u)) {
                setContentView((int) C7582R.layout.update_subscription_instrument_activity);
                this.f10685L = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
                this.f10685L.setVisibility(8);
                this.f10686M = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button);
                this.f10686M.setVisibility(8);
                this.f10687N = (TextView) findViewById(C7582R.id.title);
                this.f10687N.setText(C7582R.string.update_subscription_instrument);
                this.f10688O = (TextView) findViewById(C7582R.id.body_html_text_view);
                findViewById(C7582R.id.logo).setVisibility(0);
                this.f10684K = (TextView) findViewById(C7582R.id.account);
                this.f10684K.setText(this.B);
                this.f10684K.setVisibility(0);
                this.f10694q = new ax();
                this.f10694q.f11833b = this.f10698u;
                this.f10694q.f11835d = intent.getIntExtra("backend", 0);
                this.f10694q.f11834c = intent.getIntExtra("document_type", 15);
                this.f10695r = intent.getLongExtra("instrument_id", 0);
                this.f10696s = intent.getIntExtra("instrument_rank", 0);
                this.f10697t = intent.getByteArrayExtra("payment_client_token");
            } else {
                FinskyLog.m21665c("Invalid intent arguments provided.", new Object[0]);
                m10971c(1);
            }
        } else {
            FinskyLog.m21665c("Calling from untrusted package", new Object[0]);
            m10971c(1);
        }
    }

    public void finish() {
        boolean z = true;
        if (!this.D) {
            int i;
            setResult(this.f10700w);
            switch (this.f10700w) {
                case -1:
                    i = 0;
                    break;
                case 0:
                    i = -1;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                default:
                    throw new IllegalStateException("Unknown result code: " + this.f10700w);
            }
            C2495w c2495w = this.E;
            C2474c a = m10972d(1404).m13210a(i);
            if (i != 0) {
                z = false;
            }
            c2495w.m13367a(a.m13239a(z));
        }
        super.finish();
    }

    protected void onStart() {
        super.onStart();
        if (H_().mo281a((int) C7582R.id.content_frame) == null && this.f10695r == 0) {
            H_().mo284a().mo325a((int) C7582R.id.content_frame, C2099b.m10984a(this.f10693p, this.f10694q, this.f10696s)).mo334c();
        }
        this.f10699v = (C2100c) H_().mo283a("UpdateSubscriptionInstrumentActivity.sidecar");
        if (this.f10699v == null) {
            this.f10699v = C2100c.m10986a(this.B, this.f10694q);
            H_().mo284a().mo328a(this.f10699v, "UpdateSubscriptionInstrumentActivity.sidecar").mo334c();
        }
    }

    protected void onResume() {
        super.onResume();
        this.f10683J = findViewById(C7582R.id.loading_frame);
        this.f10682I = findViewById(C7582R.id.content_frame);
        this.f10679A.m16010c();
        this.f10699v.m6757a((C1087t) this);
        if (this.f10695r != 0 && this.f10697t != null) {
            C0660x c0660x = this.f10699v;
            long j = this.f10695r;
            byte[] bArr = this.f10697t;
            c0660x.m10987a(this.f10696s);
            bc bcVar = c0660x.f10703c;
            bcVar.a = -1;
            bcVar.a = 1;
            bcVar.d = j;
            if (bArr == null) {
                throw new NullPointerException();
            }
            bcVar.b |= 8;
            bcVar.g = bArr;
            c0660x.f10702b.mo1561a(c0660x.f10703c, c0660x, (C0657w) c0660x);
            c0660x.m6758b(1, 0);
            this.E.m13367a(m10972d(1400));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("UpdateSubscriptionInstrumentActivity.lastHandledStateInstance", this.f10681H);
        bundle.putBoolean("UpdateSubscriptionInstrumentActivity.updateSubscriptionInstrumentSucceeded", this.f10690Q);
    }

    protected void onPause() {
        this.f10699v.m6757a(null);
        super.onPause();
        this.f10679A.m16007a();
    }

    protected final int mo2368f() {
        return 5580;
    }

    private final void m10971c(int i) {
        this.f10700w = i;
        finish();
    }

    private final void m10974h() {
        this.f10682I.setVisibility(0);
        this.f10683J.setVisibility(8);
        this.f10687N.setText(C7582R.string.update_subscription_instrument);
        this.f10684K.setVisibility(0);
        this.f10688O.setVisibility(8);
        this.f10685L.setVisibility(4);
        if (this.f10686M.getVisibility() == 0) {
            this.f10686M.setVisibility(4);
        }
    }

    private final void m10969a(bd bdVar) {
        switch (bdVar.b) {
            case 1:
                if (!this.f10690Q) {
                    m10973e(0);
                }
                if (getIntent().getBooleanExtra("show_success", true)) {
                    this.f10689P = bdVar.d;
                    if (this.f10689P == null) {
                        Toast.makeText(this, Html.fromHtml(bdVar.c), 1).show();
                        m10971c(-1);
                        return;
                    }
                    this.f10687N.setText(this.f10689P.b);
                    this.f10688O.setText(this.f10689P.c);
                    this.f10685L.mo2588a(0, this.f10689P.d, (OnClickListener) this);
                    if (this.f10689P.d()) {
                        this.f10686M.mo2588a(0, this.f10689P.f, (OnClickListener) this);
                    }
                    boolean d = this.f10689P.d();
                    this.f10682I.setVisibility(8);
                    this.f10683J.setVisibility(8);
                    this.f10684K.setVisibility(8);
                    this.f10688O.setVisibility(0);
                    this.f10685L.setVisibility(0);
                    if (d) {
                        this.f10686M.setVisibility(0);
                        return;
                    }
                    return;
                }
                m10971c(-1);
                return;
            case 2:
                m10973e(2);
                m10970a(bdVar.c, 2);
                return;
            default:
                throw new IllegalStateException("Unknown response result: " + bdVar.b);
        }
    }

    private final void m10975i() {
        if (!this.f10692o.mo2249j(this.B).mo2294a(12641639)) {
            C2099b c2099b = (C2099b) H_().mo281a((int) C7582R.id.content_frame);
            c2099b.f730B.mo284a().mo327a(c2099b.e).mo334c();
        }
        H_().mo284a().mo331b(C7582R.id.content_frame, C2099b.m10984a(this.f10693p, this.f10694q, this.f10696s)).mo334c();
    }

    private final void m10970a(String str, int i) {
        new C1508k().m8856b(str).m8860d((int) C7582R.string.ok).m8851a(null, i, null).mo2272a().m625a(H_(), "UpdateSubscriptionInstrumentActivity.errorDialog");
    }

    private final C2474c m10972d(int i) {
        return new C2474c(i).m13247c(this.f10680G).m13236a(this.f10698u).m13213a(this.f10694q);
    }

    private final void m10973e(int i) {
        this.E.m13367a(m10972d(1401).m13210a(i).m13239a(i == 0));
    }

    public final void mo2595a(String str, byte[] bArr) {
        C0660x c0660x = this.f10699v;
        c0660x.m10987a(this.f10696s);
        if (!(bArr == null || bArr.length == 0)) {
            bc bcVar = c0660x.f10703c;
            if (bArr == null) {
                throw new NullPointerException();
            }
            bcVar.a = -1;
            bcVar.a = 0;
            bcVar.c = bArr;
        }
        c0660x.f10702b.mo1561a(c0660x.f10703c, c0660x, (C0657w) c0660x);
        c0660x.m6758b(1, 0);
        this.E.m13367a(m10972d(1400));
    }

    public final void mo2640a() {
        C0660x c0660x = this.f10699v;
        c0660x.m10987a(this.f10696s);
        bc bcVar = c0660x.f10703c;
        bcVar.a = -1;
        bcVar.a = 2;
        bcVar.e = true;
        c0660x.f10702b.mo1561a(c0660x.f10703c, c0660x, (C0657w) c0660x);
        c0660x.m6758b(1, 0);
        this.E.m13367a(m10972d(1400));
    }

    public final void mo2594a(RedeemCodeResult redeemCodeResult) {
        FinskyLog.m21669e("Promo code redemption not supported.", new Object[0]);
    }

    public final void mo2596k() {
        m10971c(0);
    }

    public final void mo1423a(C1089s c1089s) {
        int i = c1089s.ag;
        if (this.f10681H != i) {
            this.f10681H = i;
            switch (c1089s.f6948l) {
                case 0:
                    return;
                case 1:
                    this.f10682I.setVisibility(8);
                    this.f10683J.setVisibility(0);
                    this.f10684K.setVisibility(0);
                    this.f10688O.setVisibility(8);
                    this.f10685L.setVisibility(4);
                    if (this.f10686M.getVisibility() == 0) {
                        this.f10686M.setVisibility(4);
                        return;
                    }
                    return;
                case 2:
                    m10969a(this.f10699v.f10704d);
                    this.f10690Q = true;
                    return;
                case 3:
                    Throwable th = this.f10699v.f10705e;
                    this.E.m13367a(m10972d(1401).m13210a(1).m13239a(false).m13238a(th));
                    m10970a(C1290m.m7702a(this, th), 1);
                    return;
                default:
                    throw new IllegalStateException("Unhandled state change: " + c1089s.f6948l);
            }
        } else if (this.f10690Q) {
            m10969a(this.f10699v.f10704d);
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        ((C1128e) H_().mo283a("UpdateSubscriptionInstrumentActivity.errorDialog")).m626a(false);
        switch (i) {
            case 1:
                break;
            case 2:
                m10975i();
                break;
            default:
                throw new IllegalArgumentException("Unsupported request code: " + i);
        }
        m10974h();
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        mo1202a(i, bundle);
    }

    public void onClick(View view) {
        int i;
        if (view == this.f10685L) {
            i = this.f10689P.e;
        } else if (view == this.f10686M) {
            i = this.f10689P.g;
        } else {
            FinskyLog.m21669e("Unknown button selected", new Object[0]);
            m10971c(-1);
            i = 0;
        }
        this.f10690Q = false;
        this.f10696s = 1;
        switch (i) {
            case 1:
                m10971c(-1);
                return;
            case 2:
                break;
            case 3:
                this.f10696s = 2;
                break;
            default:
                FinskyLog.m21669e("Invalid UpdateResponseDialogAction %s", Integer.valueOf(i));
                m10971c(-1);
                return;
        }
        m10975i();
        m10974h();
    }
}
