package com.google.android.play.article;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import com.google.c.a.a.a.a.a;
import org.json.JSONObject;

public class C6254k extends WebView {
    public static boolean f31277a;
    public final C6257n f31278b;
    public String f31279c;
    public C6261r f31280d;
    public C6258o f31281e;
    public C6262s f31282f;

    public C6254k(Context context) {
        this(context, (byte) 0);
    }

    private C6254k(Context context, byte b) {
        super(context, null, 0);
        this.f31278b = new C6257n();
        setWebViewClient(this.f31278b);
        setWebChromeClient(new C6255l(this));
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAppCacheEnabled(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setPluginState(PluginState.OFF);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(false);
        String userAgentString = settings.getUserAgentString();
        String str = "OnyxArticleView/1.1";
        settings.setUserAgentString(new StringBuilder((String.valueOf(userAgentString).length() + 1) + String.valueOf(str).length()).append(userAgentString).append(" ").append(str).toString());
        if (!f31277a) {
            f31277a = true;
            settings.setRenderPriority(RenderPriority.HIGH);
        }
        setOnLongClickListener(new C6256m());
    }

    final String m28770a() {
        try {
            JSONObject put = new JSONObject().put("name", "NewsstandSDK").put("version", "1.1").put("application", this.f31279c).put("newsstandVersion", m28769c());
            if (this.f31280d != null) {
                put.put("paddingTop", this.f31280d.f31290a);
                put.put("paddingBottom", this.f31280d.f31291b);
            }
            return put.toString();
        } catch (Throwable e) {
            a.a.a(e);
            return null;
        }
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f31282f != null) {
            this.f31282f.m28777a();
        }
    }

    public final int m28771b() {
        return computeVerticalScrollRange();
    }

    private final String m28769c() {
        try {
            return getContext().getPackageManager().getPackageInfo("com.google.android.apps.magazines", 1).versionName;
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    static {
        C6254k.class.getSimpleName();
    }
}
