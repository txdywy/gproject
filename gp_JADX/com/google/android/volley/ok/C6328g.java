package com.google.android.volley.ok;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.common.http.C0935c;
import com.google.android.common.http.UrlRules;
import com.google.android.volley.ok.UrlRewriter.BlockedRequestException;

public final class C6328g implements UrlRewriter {
    public ContentResolver f31632a;

    public C6328g(Context context) {
        this.f31632a = context.getContentResolver();
    }

    public final String mo5391a(String str) {
        C0935c a = UrlRules.m5671a(this.f31632a).m5672a(str);
        String a2 = a.m5673a(str);
        if (a2 != null) {
            return a2;
        }
        throw new BlockedRequestException(a.f5728a);
    }
}
