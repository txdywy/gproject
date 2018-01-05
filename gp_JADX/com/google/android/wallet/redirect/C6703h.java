package com.google.android.wallet.redirect;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.p355a.C6490f;
import com.google.android.wallet.p383e.C6624h;
import com.google.android.wallet.ui.common.C6528w;
import com.google.android.wallet.ui.common.C6702q;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public final class C6703h extends C6702q {
    public static String f33048a;
    public final Context f33049b;
    public final LogContext f33050c;
    public final Handler f33051d;
    public final Pattern f33052e;
    public final Pattern f33053f;
    public final boolean f33054g;
    public final ArrayList f33055h;
    public final Pattern f33056i;
    public final Hashtable f33057j;
    public final Hashtable f33058k;
    public final Hashtable f33059l;
    public final Hashtable f33060m;
    public final Set f33061n;
    public final Set f33062o;
    public C6699e f33063p;
    public C6677m f33064q;
    public C6528w f33065r;
    public int f33066s = -1;
    public DisplayMetrics f33067t;
    public List f33068u;

    public C6703h(Context context, WebView webView, String str, String str2, boolean z, String[] strArr, String str3, LogContext logContext) {
        Pattern pattern = null;
        this.f33049b = context;
        this.f33051d = new Handler();
        this.f33052e = TextUtils.isEmpty(str) ? null : Pattern.compile(str);
        this.f33053f = TextUtils.isEmpty(str2) ? null : Pattern.compile(str2);
        this.f33054g = z;
        this.f33055h = C6703h.m30355a(strArr);
        if (!TextUtils.isEmpty(str3)) {
            pattern = Pattern.compile(str3);
        }
        this.f33056i = pattern;
        this.f33050c = logContext;
        this.f33057j = new Hashtable(25);
        this.f33058k = new Hashtable(25);
        this.f33059l = new Hashtable(25);
        this.f33060m = new Hashtable(5);
        this.f33061n = Collections.synchronizedSet(new HashSet(25));
        this.f33062o = Collections.synchronizedSet(new HashSet(5));
        if (VERSION.SDK_INT >= 19) {
            webView.addJavascriptInterface(new C6700f(this), "comGoogleAndroidWalletInterceptor");
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        boolean z;
        super.onPageStarted(webView, str, bitmap);
        m30360b(str);
        this.f33062o.add(str);
        m30358a(str);
        if (this.f33056i == null) {
            z = false;
        } else {
            z = this.f33056i.matcher(str).matches();
        }
        if (z) {
            webView.addJavascriptInterface(new C6701g(this), "comGoogleAndroidWalletRedirectLanding");
            C6537a.m29705c(this.f33050c, str);
            return;
        }
        webView.removeJavascriptInterface("comGoogleAndroidWalletRedirectLanding");
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (!this.f33062o.contains(str)) {
            if (((Boolean) C6490f.f32499b.a()).booleanValue()) {
                m30357a(0, str, 0, null);
            } else {
                m30359b(0, str, 0, null);
            }
            this.f33057j.remove(str);
            this.f33058k.remove(str);
            this.f33061n.remove(str);
            this.f33059l.remove(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str.startsWith("http")) {
            this.f33063p = null;
            if (this.f33052e != null) {
                if (f33048a == null) {
                    try {
                        f33048a = C6703h.m30354a(this.f33049b.getResources().openRawResource(C6624h.redirect_intercept));
                    } catch (Throwable e) {
                        throw new RuntimeException("Failed to load intercept js file.", e);
                    }
                }
                String str2 = "javascript:";
                String valueOf = String.valueOf(f33048a);
                webView.loadUrl(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        m30357a(0, str, 0, null);
        this.f33057j.remove(str);
        this.f33058k.remove(str);
        this.f33061n.remove(str);
        this.f33062o.remove(str);
        this.f33059l.remove(str);
        this.f33060m.remove(str);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        m30357a(40, str2, i, str);
        C6677m c6677m = this.f33064q;
        if (c6677m == null) {
            return;
        }
        if (Looper.myLooper() == this.f33051d.getLooper()) {
            c6677m.mo5592a(i, str);
        } else {
            this.f33051d.post(new C6706k(c6677m, i, str));
        }
    }

    @TargetApi(23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String uri = webResourceRequest.getUrl().toString();
        if (this.f33062o.contains(uri)) {
            m30357a(40, uri, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m30360b(str);
        this.f33062o.add(str);
        return m30358a(str) || super.shouldOverrideUrlLoading(webView, str);
    }

    @TargetApi(21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if ("POST".equalsIgnoreCase(webResourceRequest.getMethod())) {
            this.f33062o.add(uri);
        }
        m30360b(uri);
        return m30358a(uri) ? C6703h.m30353a() : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        m30360b(str);
        return m30358a(str) ? C6703h.m30353a() : super.shouldInterceptRequest(webView, str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m30358a(java.lang.String r13) {
        /*
        r12 = this;
        r9 = 2;
        r5 = 0;
        r7 = 1;
        r8 = 0;
        r0 = r12.f33062o;
        r10 = r0.contains(r13);
        r1 = r12.f33060m;
        monitor-enter(r1);
        r0 = r12.f33060m;	 Catch:{ all -> 0x0042 }
        r0 = r0.containsKey(r13);	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0023;
    L_0x0015:
        r0 = r12.f33060m;	 Catch:{ all -> 0x0042 }
        r0 = r0.get(r13);	 Catch:{ all -> 0x0042 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0042 }
        r7 = r0.booleanValue();	 Catch:{ all -> 0x0042 }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
    L_0x0022:
        return r7;
    L_0x0023:
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        r1 = r12.f33059l;
        monitor-enter(r1);
        if (r10 != 0) goto L_0x0045;
    L_0x0029:
        r0 = r12.f33059l;	 Catch:{ all -> 0x003f }
        r0 = r0.containsKey(r13);	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x0045;
    L_0x0031:
        r0 = r12.f33059l;	 Catch:{ all -> 0x003f }
        r0 = r0.get(r13);	 Catch:{ all -> 0x003f }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x003f }
        r7 = r0.booleanValue();	 Catch:{ all -> 0x003f }
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        goto L_0x0022;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        throw r0;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        if (r10 == 0) goto L_0x00a3;
    L_0x0048:
        r2 = r12.f33049b;
        r3 = r12.f33068u;
        if (r3 == 0) goto L_0x00a1;
    L_0x004e:
        r4 = r3.size();
        r1 = r8;
    L_0x0053:
        if (r1 >= r4) goto L_0x00a1;
    L_0x0055:
        r0 = r3.get(r1);
        r0 = (com.google.a.a.a.a.b.a.a.h.a.c) r0;
        r6 = com.google.android.wallet.common.util.C6589a.m29893a(r0, r13);
        r11 = r2.getPackageManager();
        r6 = r11.resolveActivity(r6, r8);
        if (r6 == 0) goto L_0x009d;
    L_0x0069:
        r4 = r0;
    L_0x006a:
        if (r4 == 0) goto L_0x00a3;
    L_0x006c:
        r0 = r12.f33049b;
        r0 = com.google.android.wallet.common.util.C6589a.m29899c(r0);
        if (r0 == 0) goto L_0x00a3;
    L_0x0074:
        r1 = 4;
        r2 = r12.f33064q;
        r0 = r12;
        r3 = r13;
        r0.m30356a(r1, r2, r3, r4, r5);
        r0 = 45;
        r12.m30357a(r0, r13, r8, r5);
        r0 = r7;
    L_0x0082:
        if (r0 == r9) goto L_0x0022;
    L_0x0084:
        if (r0 != r7) goto L_0x0186;
    L_0x0086:
        r0 = r7;
    L_0x0087:
        r1 = r12.f33059l;
        r2 = java.lang.Boolean.valueOf(r0);
        r1.put(r13, r2);
        if (r10 == 0) goto L_0x009b;
    L_0x0092:
        r1 = r12.f33060m;
        r2 = java.lang.Boolean.valueOf(r0);
        r1.put(r13, r2);
    L_0x009b:
        r7 = r0;
        goto L_0x0022;
    L_0x009d:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0053;
    L_0x00a1:
        r4 = r5;
        goto L_0x006a;
    L_0x00a3:
        r0 = r12.f33052e;
        if (r0 == 0) goto L_0x00d6;
    L_0x00a7:
        r0 = r12.f33052e;
        r0 = r0.matcher(r13);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x00d6;
    L_0x00b3:
        r0 = r7;
    L_0x00b4:
        if (r0 == 0) goto L_0x00da;
    L_0x00b6:
        r0 = r12.f33063p;
        if (r0 == 0) goto L_0x00d8;
    L_0x00ba:
        r0 = r12.f33063p;
        r0 = r0.m30352c();
        if (r0 == 0) goto L_0x00d8;
    L_0x00c2:
        r0 = r7;
    L_0x00c3:
        if (r0 == 0) goto L_0x00da;
    L_0x00c5:
        r3 = r12.f33064q;
        r6 = r12.f33063p;
        r1 = r12;
        r2 = r9;
        r4 = r13;
        r1.m30356a(r2, r3, r4, r5, r6);
        r0 = 41;
        r12.m30357a(r0, r13, r8, r5);
        r0 = r7;
        goto L_0x0082;
    L_0x00d6:
        r0 = r8;
        goto L_0x00b4;
    L_0x00d8:
        r0 = r8;
        goto L_0x00c3;
    L_0x00da:
        r0 = r12.f33053f;
        if (r0 == 0) goto L_0x00fe;
    L_0x00de:
        r0 = r12.f33053f;
        r0 = r0.matcher(r13);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x00fe;
    L_0x00ea:
        r0 = r7;
    L_0x00eb:
        if (r0 == 0) goto L_0x0100;
    L_0x00ed:
        r3 = r12.f33064q;
        r6 = r12.f33063p;
        r1 = r12;
        r2 = r7;
        r4 = r13;
        r1.m30356a(r2, r3, r4, r5, r6);
        r0 = 42;
        r12.m30357a(r0, r13, r8, r5);
        r0 = r7;
        goto L_0x0082;
    L_0x00fe:
        r0 = r8;
        goto L_0x00eb;
    L_0x0100:
        if (r10 == 0) goto L_0x0145;
    L_0x0102:
        r0 = java.util.Locale.getDefault();
        r0 = r13.toLowerCase(r0);
        r1 = "http://";
        r1 = r0.startsWith(r1);
        if (r1 != 0) goto L_0x011a;
    L_0x0112:
        r1 = "https://";
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x0138;
    L_0x011a:
        r0 = r7;
    L_0x011b:
        if (r0 != 0) goto L_0x0145;
    L_0x011d:
        r0 = r12.f33064q;
        if (r0 == 0) goto L_0x0130;
    L_0x0121:
        r1 = android.os.Looper.myLooper();
        r2 = r12.f33051d;
        r2 = r2.getLooper();
        if (r1 != r2) goto L_0x013a;
    L_0x012d:
        r0.mo5598c();
    L_0x0130:
        r0 = 46;
        r12.m30357a(r0, r13, r8, r5);
        r0 = r9;
        goto L_0x0082;
    L_0x0138:
        r0 = r8;
        goto L_0x011b;
    L_0x013a:
        r1 = r12.f33051d;
        r2 = new com.google.android.wallet.redirect.l;
        r2.<init>(r0);
        r1.post(r2);
        goto L_0x0130;
    L_0x0145:
        r0 = r12.f33055h;
        r2 = r0.size();
        r1 = r8;
    L_0x014c:
        if (r1 >= r2) goto L_0x017c;
    L_0x014e:
        r0 = r12.f33055h;
        r0 = r0.get(r1);
        r0 = (java.util.regex.Pattern) r0;
        r0 = r0.matcher(r13);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x0178;
    L_0x0160:
        r0 = r7;
    L_0x0161:
        if (r0 != 0) goto L_0x0183;
    L_0x0163:
        r0 = r12.f33054g;
        if (r0 == 0) goto L_0x017e;
    L_0x0167:
        r2 = 3;
        r3 = r12.f33064q;
        r1 = r12;
        r4 = r13;
        r6 = r5;
        r1.m30356a(r2, r3, r4, r5, r6);
        r0 = 43;
        r12.m30357a(r0, r13, r8, r5);
        r0 = r7;
        goto L_0x0082;
    L_0x0178:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x014c;
    L_0x017c:
        r0 = r8;
        goto L_0x0161;
    L_0x017e:
        r0 = 44;
        r12.m30357a(r0, r13, r8, r5);
    L_0x0183:
        r0 = r8;
        goto L_0x0082;
    L_0x0186:
        r0 = r8;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.redirect.h.a(java.lang.String):boolean");
    }

    private final void m30356a(int i, C6677m c6677m, String str, c cVar, C6699e c6699e) {
        if (c6677m != null) {
            this.f33051d.post(new C6705j(i, c6677m, str, c6699e, cVar));
        }
    }

    private final void m30357a(int i, String str, int i2, String str2) {
        if (!this.f33061n.contains(str)) {
            m30359b(i, str, i2, str2);
            if (this.f33065r != null && ((Boolean) C6490f.f32498a.a()).booleanValue()) {
                this.f33061n.add(str);
                Parcelable webViewPageLoadEvent = new WebViewPageLoadEvent();
                webViewPageLoadEvent.f32535a = C6703h.m30361c(str);
                webViewPageLoadEvent.f32536b = this.f33062o.contains(str);
                synchronized (this.f33057j) {
                    webViewPageLoadEvent.f32537c = this.f33057j.containsKey(str) ? ((Long) this.f33057j.get(str)).longValue() : -1;
                }
                webViewPageLoadEvent.f32538d = i2;
                if (str2 != null) {
                    webViewPageLoadEvent.f32539e = str2;
                }
                webViewPageLoadEvent.f32540f = this.f33049b.getResources().getConfiguration().orientation;
                DisplayMetrics displayMetrics = this.f33067t;
                if (displayMetrics == null || webViewPageLoadEvent.f32540f != this.f33066s) {
                    displayMetrics = C6589a.m29898b(this.f33049b);
                    this.f33066s = webViewPageLoadEvent.f32540f;
                    this.f33067t = displayMetrics;
                }
                webViewPageLoadEvent.f32541g = displayMetrics.widthPixels;
                webViewPageLoadEvent.f32542h = displayMetrics.heightPixels;
                webViewPageLoadEvent.f32543i = displayMetrics.xdpi;
                webViewPageLoadEvent.f32544j = displayMetrics.ydpi;
                Bundle bundle = new Bundle();
                bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 772);
                bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", webViewPageLoadEvent);
                bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i);
                this.f33065r.mo5469a(7, bundle);
            }
        }
    }

    private final void m30359b(int i, String str, int i2, String str2) {
        C6537a.m29691a(this.f33050c, (TimedEvent) this.f33058k.get(str), this.f33062o.contains(str), i, i2, str2);
    }

    private final void m30360b(String str) {
        synchronized (this.f33057j) {
            if (!this.f33057j.containsKey(str)) {
                this.f33057j.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
        synchronized (this.f33058k) {
            if (!this.f33058k.containsKey(str)) {
                TimedEvent a = C6537a.m29678a(this.f33050c, C6703h.m30361c(str));
                if (a != null) {
                    this.f33058k.put(str, a);
                }
            }
        }
    }

    private static WebResourceResponse m30353a() {
        Charset defaultCharset = Charset.defaultCharset();
        return new WebResourceResponse("text/html", defaultCharset.name(), new ByteArrayInputStream("".getBytes(defaultCharset)));
    }

    private static String m30354a(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder(200);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuilder.append(readLine);
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                }
            }
        }
        return stringBuilder.toString();
    }

    private static String m30361c(String str) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.query(null);
        buildUpon.fragment(null);
        return buildUpon.build().toString();
    }

    private static ArrayList m30355a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String compile : strArr) {
            arrayList.add(Pattern.compile(compile));
        }
        return arrayList;
    }
}
