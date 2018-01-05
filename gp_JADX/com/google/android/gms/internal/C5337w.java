package com.google.android.gms.internal;

import android.os.Build;
import android.os.Looper;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

@C5302b
public final class C5337w {
    static {
        C5330p c5330p = new C5330p(Looper.getMainLooper());
        AtomicReference atomicReference = new AtomicReference(null);
        atomicReference = new AtomicReference(null);
    }

    public C5337w() {
        Object obj = new Object();
    }

    public static String m25814a() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    public static void m25815a(List list, String str) {
        for (String ajVar : list) {
            C5301m ajVar2 = new aj(ajVar, str);
            if (ajVar2.f26483c) {
                C5331q.m25394a(1, ajVar2.f26481a);
            } else {
                C5331q.m25395a(ajVar2.f26481a);
            }
        }
    }

    public static String m25816b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
    }
}
