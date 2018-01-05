package com.google.android.c;

import android.content.ContentResolver;
import android.net.Uri;

public static class com.google.android.c.e extends com.google.android.c.c
{

    public static final Uri b;

    static {
        com.google.android.c.e.b = Uri.parse("content://com.google.settings/partner");
    }

    public static String a(ContentResolver p0, String p1, String p2) {
        v0 = com.google.android.c.e.a(p0, com.google.android.c.e.b, p1);
        if (v0 != 0)
            p2 = v0;
        return p2;
    }

}
