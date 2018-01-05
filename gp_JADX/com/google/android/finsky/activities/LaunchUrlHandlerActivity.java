package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.inlinedetails.C1039i;
import com.google.android.finsky.inlinedetails.C3251f;
import com.google.android.finsky.inlinedetails.C3254j;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class LaunchUrlHandlerActivity extends Activity implements C1039i {
    public boolean f6356a;
    public C2495w f6357b;
    public boolean f6358c;
    public C3251f f6359d;
    public C3254j f6360e;

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        if (this.f6358c) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    public void finish() {
        super.finish();
        if (this.f6358c) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6358c = C1473m.f7980a.dj().mo2294a(12631898);
        this.f6357b = C1473m.f7980a.dd().m13375a("deep_link");
        if (C1473m.f7980a.dj().mo2294a(12629616)) {
            C1473m.f7980a.aP().m13350a(this.f6357b, 1722);
        }
        if (bundle != null) {
            this.f6356a = bundle.getBoolean("LaunchUrlHandlerActivity.hasLaunchedInline");
        }
        C1461c c1461c = C1473m.f7980a;
        C0988c c0988c = C1473m.f7980a;
        C2162a bn = C1473m.f7980a.bn();
        C1473m.f7980a.aJ();
        C3646a I = C1473m.f7980a.mo2029I();
        C1473m.f7980a.mo2027G();
        this.f6359d = new C3251f(this, new ej(this, c1461c, c0988c, bn, I, C1473m.f7980a.cx(), C1473m.f7980a.cW()), this, C1473m.f7980a.aN(), C1473m.f7980a.mo2029I(), C1473m.f7980a.mo2037Q(), C1473m.f7980a.mo2035O(), C1473m.f7980a.bK(), C1473m.f7980a.bo(), this.f6357b);
        this.f6359d.m16364a(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f6359d.m16365a(this.f6360e);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("LaunchUrlHandlerActivity.hasLaunchedInline", this.f6356a);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f6359d.m16366a(i, i2)) {
            finish();
        }
    }

    public final void mo1254a(C3254j c3254j) {
        Intent a = c3254j.m16368a();
        this.f6357b.m13376a(a);
        this.f6360e = c3254j;
        if (!c3254j.f16769a || !C1473m.f7980a.dj().mo2294a(12613372)) {
            startActivity(a);
            finish();
        } else if (!this.f6356a) {
            startActivityForResult(a, 0);
            this.f6356a = true;
        }
    }
}
