package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.annotation.Keep;
import android.support.v4.h.a;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.C7122a;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FirebaseInstanceId {
    public final C7139m f34832a;
    public final String f34833b;

    static {
        a aVar = new a();
    }

    static int m32347a(Context context) {
        return m32348a(context, context.getPackageName());
    }

    static int m32348a(Context context, String str) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to find package ").append(valueOf).toString());
            return i;
        }
    }

    public static FirebaseInstanceId m32349a() {
        return getInstance(C7122a.m32346b());
    }

    public static String m32350a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    static String m32351a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static void m32352a(Context context, C7144r c7144r) {
        c7144r.m32411b();
        Intent intent = new Intent();
        intent.putExtra("CMD", "RST");
        C7143q.m32400a().m32403a(context, intent);
    }

    static String m32354b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    static void m32356c(Context context) {
        Intent intent = new Intent();
        intent.putExtra("CMD", "SYNC");
        C7143q.m32400a().m32403a(context, intent);
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(C7122a c7122a) {
        synchronized (FirebaseInstanceId.class) {
            C7122a.m32345a();
            throw new NoSuchMethodError();
        }
    }

    static C7145s m32353b() {
        throw new NoSuchMethodError();
    }

    static void m32355c() {
        throw new NoSuchMethodError();
    }
}
