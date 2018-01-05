package com.google.android.finsky.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.aw;
import android.support.v7.app.aa;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public class GaiaAuthActivity extends aa implements C4091n {
    public C2471a f20492q;
    public C4102l f20493r;

    public static Intent m19034a(Context context, String str, boolean z, AuthState authState, Bundle bundle, C2495w c2495w) {
        authState.f9583k = false;
        Intent intent = new Intent(context, GaiaAuthActivity.class);
        intent.putExtra("GaiaAuthActivity_authState", authState);
        intent.putExtra("GaiaAuthActivity_accountName", str);
        intent.putExtra("GaiaAuthActivity_showWarning", z);
        intent.putExtra("GaiaAuthActivity_extraParams", bundle);
        c2495w.m13380b(str).m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        ((C1414v) C3947d.m18649a(C1414v.class)).mo1904a(this);
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.gaia_auth_frame);
        if (bundle != null) {
            this.f20493r = (C4102l) H_().mo282a(bundle, "GaiaAuthActivity_GaiaAuthFragment");
            this.f20493r.af = this;
            return;
        }
        Intent intent = getIntent();
        this.f20493r = C4102l.m19043a(intent.getStringExtra("GaiaAuthActivity_accountName"), intent.getBooleanExtra("GaiaAuthActivity_showWarning", false), (AuthState) getIntent().getParcelableExtra("GaiaAuthActivity_authState"), this.f20492q.m13180a(bundle, getIntent()));
        this.f20493r.af = this;
        aw a = H_().mo284a();
        a.mo325a((int) C7582R.id.content_frame, this.f20493r);
        a.mo334c();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        H_().mo285a(bundle, "GaiaAuthActivity_GaiaAuthFragment", this.f20493r);
    }

    public final void mo3910k() {
        Intent intent = new Intent();
        intent.putExtra("GaiaAuthActivity_extraParams", getIntent().getBundleExtra("GaiaAuthActivity_extraParams"));
        setResult(-1, intent);
        finish();
    }

    public final void mo3911l() {
        setResult(0);
        finish();
    }
}
