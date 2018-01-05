package com.google.android.finsky.utils;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.Set;
import java.util.TreeSet;

public final class be {
    public static String m21800a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable e) {
            FinskyLog.m21669e("%s", e);
            throw new RuntimeException(e);
        }
    }

    public static boolean m21802a(String str, boolean z) {
        Uri parse = Uri.parse(str);
        if ("https".equals(parse.getScheme())) {
            return true;
        }
        if (z && parse.getHost() != null && (parse.getHost().toLowerCase().endsWith("corp.google.com") || parse.getHost().toLowerCase().endsWith("prod.google.com") || parse.getHost().startsWith("192.168.0") || parse.getHost().startsWith("127.0.0"))) {
            return true;
        }
        return false;
    }

    public static String m21801a(String str, Set set) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null url source");
        }
        for (String isEmpty : set) {
            if (TextUtils.isEmpty(isEmpty)) {
                throw new IllegalArgumentException("Empty prefix key is not allowed");
            }
        }
        Uri parse = Uri.parse(str);
        Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String isEmpty2 : new TreeSet(parse.getQueryParameterNames())) {
            Object obj;
            for (String startsWith : set) {
                if (isEmpty2.startsWith(startsWith)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                for (String startsWith2 : new TreeSet(parse.getQueryParameters(isEmpty2))) {
                    buildUpon.appendQueryParameter(isEmpty2, startsWith2);
                }
            }
        }
        return buildUpon.build().toString();
    }

    public static Uri m21799a(Uri uri) {
        if (!"market".equals(uri.getScheme()) || !"webstoreredirect".equals(uri.getHost())) {
            return uri;
        }
        Object queryParameter = uri.getQueryParameter("uri");
        if (!TextUtils.isEmpty(queryParameter)) {
            Uri parse = Uri.parse(Uri.decode(queryParameter));
            if ("play.google.com".equals(parse.getHost())) {
                return parse;
            }
        }
        FinskyLog.m21665c("Unrecognized redirect URI: %s", FinskyLog.m21655a(uri.toString()));
        return Uri.parse("http://play.google.com/store");
    }
}
