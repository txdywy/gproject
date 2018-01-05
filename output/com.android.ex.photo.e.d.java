package com.android.ex.photo.e;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class com.android.ex.photo.e.d extends com.android.ex.photo.e.c
{

    public byte[] c;

    d(ContentResolver p0, Uri p1) {
        com.android.ex.photo.e.c(p0, p1);
    }

    private static byte[] a(Uri p0) {
        v0 = 0;
        v1 = p0.getSchemeSpecificPart();
        try {
            if (v1.startsWith("base64,"))
                v0 = Base64.decode(v1.substring(7), 8);
            else if (com.android.ex.photo.e.b.a.matcher(v1).matches())
                v0 = Base64.decode(v1.substring(v1.indexOf("base64,") + 7), 0);
            return v0;
        }
        catch (IllegalArgumentException ex) {
            v1 = String.valueOf(ex);
            Log.e("ImageUtils", (String.valueOf(v1).length() + 21) + "Mailformed data URI: " + v1);
            return v0;
        }
    }

    public final InputStream a() {
        if (this.c == 0) {
            this.c = com.android.ex.photo.e.d.a(this.b);
            if (this.c == 0) {
                v0 = super.a();
                return v0;
            }
        }
        v0 = new ByteArrayInputStream(this.c);
        return v0;
    }

}
