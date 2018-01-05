package com.android.ex.photo.p052e;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class C0562d extends C0561c {
    public byte[] f3764c;

    public C0562d(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final InputStream mo992a() {
        if (this.f3764c == null) {
            this.f3764c = C0562d.m4095a(this.b);
            if (this.f3764c == null) {
                return super.mo992a();
            }
        }
        return new ByteArrayInputStream(this.f3764c);
    }

    private static byte[] m4095a(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        try {
            if (schemeSpecificPart.startsWith("base64,")) {
                return Base64.decode(schemeSpecificPart.substring(7), 8);
            }
            if (C0559b.f3760a.matcher(schemeSpecificPart).matches()) {
                return Base64.decode(schemeSpecificPart.substring(schemeSpecificPart.indexOf("base64,") + 7), 0);
            }
            return null;
        } catch (IllegalArgumentException e) {
            schemeSpecificPart = String.valueOf(e);
            Log.e("ImageUtils", new StringBuilder(String.valueOf(schemeSpecificPart).length() + 21).append("Mailformed data URI: ").append(schemeSpecificPart).toString());
            return null;
        }
    }
}
