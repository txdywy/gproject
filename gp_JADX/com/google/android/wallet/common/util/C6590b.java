package com.google.android.wallet.common.util;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.util.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public final class C6590b {
    public static boolean m29905a(PackageInfo packageInfo, Set set, String str) {
        if (packageInfo == null || packageInfo.signatures == null) {
            String str2 = "ApplicationSigningCerti";
            String str3 = "Failed to get package signatures from PackageManager for ";
            String valueOf = String.valueOf(packageInfo == null ? "unknown null package" : packageInfo.packageName);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return false;
        }
        HashSet hashSet = new HashSet(packageInfo.signatures.length);
        int i = 0;
        while (i < packageInfo.signatures.length) {
            str3 = C6590b.m29904a(packageInfo.signatures[i], str);
            if (str3 == null) {
                str2 = packageInfo.packageName;
                Log.e("ApplicationSigningCerti", new StringBuilder(String.valueOf(str2).length() + 84).append("At least one of the package certificates obtained from PackageManagerfor ").append(str2).append(" is invalid").toString());
                return false;
            } else if (hashSet.contains(str3)) {
                str2 = packageInfo.packageName;
                Log.e("ApplicationSigningCerti", new StringBuilder(String.valueOf(str2).length() + 72).append("Package certificates obtained from PackageManager for ").append(str2).append("contain duplicates").toString());
                return false;
            } else {
                hashSet.add(str3);
                i++;
            }
        }
        if (hashSet.equals(set)) {
            return true;
        }
        Log.e("ApplicationSigningCerti", "Mismatched signing certificate fingerprints");
        return false;
    }

    private static String m29904a(Signature signature, String str) {
        String str2 = null;
        if (signature == null || signature.toByteArray() == null || signature.toByteArray().length == 0) {
            return str2;
        }
        try {
            return d.a(MessageDigest.getInstance(str).digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            return str2;
        }
    }
}
