package com.google.android.finsky.verifier.impl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.aa;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.squareup.leakcanary.C7582R;

public class PerSourceInstallationConsentWarningDialog extends aa implements C0998m {
    public String f24329q;
    public String f24330r;
    public int f24331s;
    public ActivityListener f24332t;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f24329q = intent.getStringExtra("app_name");
        this.f24330r = intent.getStringExtra("package_name");
        this.f24332t = (ActivityListener) intent.getParcelableExtra("listener");
        if (this.f24329q == null || this.f24330r == null || this.f24332t == null) {
            this.f24331s = -1;
            finish();
        }
        String str = this.f24329q;
        String str2 = this.f24330r;
        Bundle bundle2 = new Bundle();
        bundle2.putString("app_name", str);
        bundle2.putString("package_name", str2);
        C1128e akVar = new ak();
        new C1508k().m8855b((int) C7582R.layout.per_source_installation_consent_warning_dialog).m8850a(bundle2).m8857b(false).m8853a(false).m8858c((int) C7582R.string.google_play_protect).m8862e((int) C7582R.string.cancel).m8860d((int) C7582R.string.allow).m8854a(akVar);
        akVar.m625a(H_(), "PerSourceInstallationConsentWarningSimpleAlertDialog");
        this.f24332t.mo4337a(this);
    }

    protected void onDestroy() {
        if (this.f24332t != null) {
            this.f24332t.mo4338b(this);
        }
        super.onDestroy();
    }

    public final void mo1202a(int i, Bundle bundle) {
        this.f24331s = 1;
        finish();
    }

    public final void mo1211b(int i, Bundle bundle) {
        this.f24331s = -1;
        finish();
    }

    public final void f_(int i) {
        this.f24331s = -1;
        finish();
    }
}
