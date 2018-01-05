package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.bb;
import com.google.android.wallet.ui.common.WebViewLayout;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.Iterator;
import java.util.Set;

public class AuthenticatedWebViewActivity extends Activity implements com.google.android.finsky.d.ad
{

    public final com.google.android.finsky.d.a a;
    public Account b;
    public String c;
    public String d;
    public boolean e;
    public WebViewLayout f;
    public final com.google.wireless.android.a.a.a.a.ce g;
    public com.google.android.finsky.d.w h;
    public com.google.android.finsky.billing.lightpurchase.e i;

    AuthenticatedWebViewActivity() {
        Activity();
        this.a = com.google.android.finsky.m.a.aR();
        this.g = com.google.android.finsky.d.j.a(6344);
        this.i = new com.google.android.finsky.billing.lightpurchase.d();
    }

    public static Intent a(Account p0, String p1, String p2, com.google.android.finsky.d.w p3) {
        v0 = new Intent(com.google.android.finsky.m.a.b, AuthenticatedWebViewActivity);
        v0.putExtra("AuthenticatedWebViewActivity.account", p0);
        v0.putExtra("AuthenticatedWebViewActivity.url", p1);
        v0.putExtra("AuthenticatedWebViewActivity.successUrl", p2);
        p3.a(p0).a(v0);
        return v0;
    }

    private final String a(String p0, String p1) {
        v2 = Uri.parse(p0);
        v3 = v2.buildUpon();
        if (v2.getQueryParameter("continue") == 0)
            v3.appendQueryParameter("continue", p1);
        else {
            v3.clearQuery();
            v4 = v2.getQueryParameterNames().iterator();
            v1 = 0;
            while (v4.hasNext()) {
                v0 = (String)v4.next();
                if (v0.equals("continue"))
                    v1 = v2.getQueryParameter(v0);
                else
                    v3.appendQueryParameter(v0, v2.getQueryParameter(v0));
            }
            v3.appendQueryParameter("continue", this.a(v1, p1));
        }
        return v3.build().toString();
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    final void a(boolean p0) {
        if (p0 != 0)
            v0 = -1;
        else
            v0 = 0;
        this.setResult(v0);
        this.h.a(new com.google.android.finsky.d.c(943).a(p0));
        this.finish();
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.g;
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public void onBackPressed() {
        if (this.f.getWebView().canGoBack())
            this.f.getWebView().goBack();
        else
            this.a(0);
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        v1 = this.getIntent();
        this.b = (Account)v1.getParcelableExtra("AuthenticatedWebViewActivity.account");
        this.c = v1.getStringExtra("AuthenticatedWebViewActivity.url");
        this.d = v1.getStringExtra("AuthenticatedWebViewActivity.successUrl");
        this.h = this.a.a(p0, v1);
        if (p0 == 0)
            this.h.a(new com.google.android.finsky.d.p().b(this));
        else
            this.e = p0.getBoolean("AuthenticatedWebViewActivity.pageLoaded");
        this.setContentView(2130968873);
        this.f = (WebViewLayout)this.findViewById(2131755875);
        if (this.d != 0) {
            this.c = this.a(this.c, this.d);
            this.f.setWebViewClient(new com.google.android.finsky.billing.lightpurchase.b(this));
        }
    }

    public void onSaveInstanceState(Bundle p0) {
        v0 = 1;
        super.onSaveInstanceState(p0);
        if (this.e == 0) {
            if (this.f.findViewById(2131755877).getVisibility() == 0)
                v2 = 1;
            else
                v2 = 0;
            if (v2 != 0)
                v0 = 0;
            this.e = v0;
        }
        p0.putBoolean("AuthenticatedWebViewActivity.pageLoaded", this.e);
        this.h.a(p0);
    }

    protected void onStart() {
        super.onStart();
        if (this.e == 0) {
            this.h.a(new com.google.android.finsky.d.c(942));
            com.google.android.finsky.utils.bb.a(new com.google.android.finsky.billing.lightpurchase.c(this), new Void[0]);
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
