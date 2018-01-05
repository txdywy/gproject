package com.google.android.p102c;

import android.content.ContentResolver;
import android.net.Uri;

public final class C0923e extends C0921c {
    public static final Uri f5694b = Uri.parse("content://com.google.settings/partner");

    public static String m5647a(ContentResolver contentResolver, String str, String str2) {
        String a = C0921c.m5645a(contentResolver, f5694b, str);
        return a == null ? str2 : a;
    }
}
