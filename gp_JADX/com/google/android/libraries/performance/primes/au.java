package com.google.android.libraries.performance.primes;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class au {
    public static final Charset f29678a = Charset.forName("UTF-8");

    public static Long m27649a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f29678a));
            return Long.valueOf(ByteBuffer.wrap(instance.digest()).getLong());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
