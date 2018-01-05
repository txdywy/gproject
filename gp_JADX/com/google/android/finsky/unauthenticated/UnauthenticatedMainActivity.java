package com.google.android.finsky.unauthenticated;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.aa;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class UnauthenticatedMainActivity extends aa implements C4573n {
    public C2171b f23376q;
    public C0986a f23377r;
    public C2471a f23378s;
    public C3340g f23379t;
    public C2495w f23380u;
    public ProgressBar f23381v;
    public View f23382w;

    protected void onCreate(Bundle bundle) {
        ((C1447e) C3947d.m18649a(C1447e.class)).mo1964a(this);
        super.onCreate(bundle);
        this.f23380u = this.f23378s.m13181a(bundle, getIntent(), this.f23378s.m13178a(null));
        setContentView((int) C7582R.layout.unauthenticated_main_activity);
        this.f23381v = (ProgressBar) findViewById(C7582R.id.loading_spinner);
        this.f23382w = findViewById(C7582R.id.unauth_content_frame);
        if (bundle == null) {
            this.f23381v.setVisibility(0);
            this.f23382w.setVisibility(8);
            this.f23379t.mo3479a(new C3363f().m16804b(C4579g.f23395a).m16802a(C4579g.f23396b).m16800a()).mo4397a(new C4578f(this));
        }
    }

    protected void onResume() {
        super.onResume();
        Account[] d = this.f23377r.mo1188d();
        if (d != null && d.length != 0) {
            m21209k();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f23380u.m13377a(bundle);
    }

    public final void mo4265b(Fragment fragment) {
        H_().mo284a().mo331b(C7582R.id.unauth_content_frame, fragment).mo334c();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            Account[] d = this.f23377r.mo1188d();
            if (d == null || d.length == 0) {
                FinskyLog.m21659a("No new account added: Assume the user canceled", new Object[0]);
                return;
            }
            FinskyLog.m21659a("Account added: Switching to auth mode", new Object[0]);
            this.f23380u.m13367a(new C2474c(564));
            m21209k();
        }
    }

    private final void m21209k() {
        Intent g = this.f23376q.mo2767g(this);
        this.f23380u.m13376a(g);
        startActivity(g);
        finish();
    }
}
