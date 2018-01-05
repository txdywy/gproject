package com.google.android.play.article;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;

final class C6257n extends WebViewClient {
    public static final Pattern f31284a = Pattern.compile("https?", 2);
    public C6247a f31285b;

    C6257n() {
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return !TextUtils.isEmpty(str) && m28772a(webView.getContext(), str);
    }

    private final boolean m28772a(Context context, String str) {
        Uri parse = Uri.parse(str);
        if (!f31284a.matcher(parse.getScheme()).matches()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(parse);
        try {
            context.startActivity(intent);
            if (this.f31285b == null) {
                return true;
            }
            throw new NoSuchMethodError();
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }
}
