package com.google.android.gms.instantapps.p288b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.net.Uri;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class C5262b {
    public static final Uri f26393a = Uri.parse("content://instantapp-dev-manager");
    public static final byte[] f26394b = new byte[]{(byte) -26, (byte) 38, (byte) 73, (byte) -86, (byte) -29, (byte) 23, (byte) 110, (byte) 31, (byte) -50, (byte) -34, (byte) 96, (byte) 19, (byte) -58, (byte) -24, (byte) -70, (byte) 63, (byte) -1, (byte) -45, (byte) 41, (byte) 53, (byte) -6, (byte) -100, (byte) -86, (byte) -64, (byte) -44, (byte) 43, (byte) -64, (byte) -125, (byte) 81, (byte) 76, (byte) -53, (byte) -15};
    public static final byte[] f26395c = new byte[]{(byte) 58, (byte) -1, (byte) 119, (byte) 121, (byte) -71, (byte) 17, (byte) 11, (byte) -54, (byte) 46, (byte) 10, (byte) 44, (byte) -125, (byte) 44, (byte) -108, (byte) 73, (byte) -15, (byte) -126, (byte) 47, Byte.MAX_VALUE, (byte) -38, (byte) -55, (byte) -36, (byte) -50, (byte) -110, (byte) 11, (byte) -41, (byte) -69, (byte) -86, (byte) 44, (byte) 106, (byte) 6, (byte) 56};

    public static boolean m24089a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.instantapps.devman", 64);
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                for (Signature toByteArray : packageInfo.signatures) {
                    byte[] digest = instance.digest(toByteArray.toByteArray());
                    if (Arrays.equals(digest, f26395c) || Arrays.equals(digest, f26394b)) {
                        return true;
                    }
                }
                return false;
            } catch (NoSuchAlgorithmException e) {
                return false;
            }
        } catch (NameNotFoundException e2) {
            return false;
        }
    }

    static {
        String[] strArr = new String[]{"getAppInfoResponse", "splitId"};
    }
}
