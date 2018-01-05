package com.google.android.gms.internal;

import android.util.Base64;

public final class eb {
    public static String m24315a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    public static byte[] m24316a(String str, boolean z) {
        byte[] decode = Base64.decode(str, z ? 11 : 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String str2 = "Unable to decode ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
