package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.bb;
import com.google.android.wallet.ui.common.WebViewLayout;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class AuthenticatedWebViewActivity extends Activity implements ad {
    public final C2471a f9617a = C1473m.f7980a.aR();
    public Account f9618b;
    public String f9619c;
    public String f9620d;
    public boolean f9621e;
    public WebViewLayout f9622f;
    public final ce f9623g = C2482j.m13283a(6344);
    public C2495w f9624h;
    public C1921e f9625i = new C1922d();

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

    public static Intent m10032a(Account account, String str, String str2, C2495w c2495w) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, AuthenticatedWebViewActivity.class);
        intent.putExtra("AuthenticatedWebViewActivity.account", account);
        intent.putExtra("AuthenticatedWebViewActivity.url", str);
        intent.putExtra("AuthenticatedWebViewActivity.successUrl", str2);
        c2495w.m13366a(account).m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f9618b = (Account) intent.getParcelableExtra("AuthenticatedWebViewActivity.account");
        this.f9619c = intent.getStringExtra("AuthenticatedWebViewActivity.url");
        this.f9620d = intent.getStringExtra("AuthenticatedWebViewActivity.successUrl");
        this.f9624h = this.f9617a.m13180a(bundle, intent);
        if (bundle == null) {
            this.f9624h.m13370a(new C2488p().m13345b(this));
        } else {
            this.f9621e = bundle.getBoolean("AuthenticatedWebViewActivity.pageLoaded");
        }
        setContentView(C7582R.layout.finsky_web_view_layout);
        this.f9622f = (WebViewLayout) findViewById(C7582R.id.web_view_layout);
        if (this.f9620d != null) {
            this.f9619c = m10033a(this.f9619c, this.f9620d);
            this.f9622f.setWebViewClient(new C1912b(this));
        }
    }

    protected void onStart() {
        super.onStart();
        if (!this.f9621e) {
            this.f9624h.m13367a(new C2474c(942));
            bb.m21792a(new C1915c(this), new Void[0]);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean z = true;
        super.onSaveInstanceState(bundle);
        if (!this.f9621e) {
            boolean z2;
            if (this.f9622f.findViewById(C7582R.id.loading_overlay).getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = false;
            }
            this.f9621e = z;
        }
        bundle.putBoolean("AuthenticatedWebViewActivity.pageLoaded", this.f9621e);
        this.f9624h.m13377a(bundle);
    }

    public void onBackPressed() {
        if (this.f9622f.getWebView().canGoBack()) {
            this.f9622f.getWebView().goBack();
        } else {
            m10035a(false);
        }
    }

    final void m10035a(boolean z) {
        setResult(z ? -1 : 0);
        this.f9624h.m13367a(new C2474c(943).m13239a(z));
        finish();
    }

    private final String m10033a(String str, String str2) {
        Uri parse = Uri.parse(str);
        Builder buildUpon = parse.buildUpon();
        if (parse.getQueryParameter("continue") == null) {
            buildUpon.appendQueryParameter("continue", str2);
        } else {
            buildUpon.clearQuery();
            String str3 = null;
            for (String str4 : parse.getQueryParameterNames()) {
                if (str4.equals("continue")) {
                    str3 = parse.getQueryParameter(str4);
                } else {
                    buildUpon.appendQueryParameter(str4, parse.getQueryParameter(str4));
                }
            }
            buildUpon.appendQueryParameter("continue", m10033a(str3, str2));
        }
        return buildUpon.build().toString();
    }

    public ce getPlayStoreUiElement() {
        return this.f9623g;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}
