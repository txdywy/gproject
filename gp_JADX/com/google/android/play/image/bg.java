package com.google.android.play.image;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class bg {
    public static final bh f32054a = bh.m29255a("=").m29256a();
    public static final bh f32055b = bh.m29255a("/").m29256a();

    static String m29252a(Uri uri) {
        StringBuilder stringBuilder = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null) {
            stringBuilder.append(scheme).append(':');
        }
        scheme = uri.getEncodedAuthority();
        if (scheme != null) {
            stringBuilder.append("//").append(scheme);
        }
        scheme = Uri.encode(uri.getPath(), "/=");
        if (scheme != null) {
            stringBuilder.append(scheme);
        }
        Object encodedQuery = uri.getEncodedQuery();
        if (!TextUtils.isEmpty(encodedQuery)) {
            stringBuilder.append('?').append(encodedQuery);
        }
        encodedQuery = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedQuery)) {
            stringBuilder.append('#').append(encodedQuery);
        }
        return stringBuilder.toString();
    }

    static Uri m29251a(String str, Uri uri) {
        int i;
        int i2 = 1;
        CharSequence path = uri.getPath();
        Object a = m29253a(f32055b.m29257a(path));
        if (a.size() <= 0 || !((String) a.get(0)).equals("image")) {
            i = 0;
        } else {
            a.remove(0);
            i = 1;
        }
        int size = a.size();
        boolean endsWith = path.endsWith("/");
        int i3 = (endsWith || size != 5) ? 0 : 1;
        if (size != 4) {
            i2 = 0;
        }
        if (i3 != 0) {
            a.add((String) a.get(4));
        }
        if (i2 != 0) {
            a.add(str);
        } else {
            a.set(4, str);
        }
        if (i != 0) {
            a.add(0, "image");
        }
        if (endsWith) {
            a.add("");
        }
        Builder buildUpon = uri.buildUpon();
        String str2 = "/";
        String valueOf = String.valueOf(TextUtils.join("/", a));
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        return buildUpon.path(valueOf).build();
    }

    static String m29254b(Uri uri) {
        CharSequence path = uri.getPath();
        List a = m29253a(f32055b.m29257a(path));
        if (a.size() > 0 && ((String) a.get(0)).equals("image")) {
            a.remove(0);
        }
        int size = a.size();
        int i = (path.endsWith("/") || size != 5) ? 0 : 1;
        if (size == 4) {
            size = 1;
        } else {
            size = 0;
        }
        if (i != 0) {
            return "";
        }
        if (size == 0) {
            return (String) a.get(4);
        }
        return "";
    }

    static ArrayList m29253a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
