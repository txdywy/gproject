package com.google.android.finsky.setup;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class C4191x {
    public final PackageManager f21119a;

    public C4191x(PackageManager packageManager) {
        this.f21119a = packageManager;
    }

    public final boolean m19518a(String[] strArr, String str) {
        if (strArr == null) {
            FinskyLog.m21667d("No packages given", new Object[0]);
            return false;
        }
        String str2;
        Map hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21659a("No packages whitelisted for setup APIs", new Object[0]);
        } else {
            for (String str22 : str.split(";")) {
                if (str22.isEmpty()) {
                    FinskyLog.m21665c("Empty entry in setup APIs whitelist, skipping", new Object[0]);
                } else {
                    String[] split = str22.split(":");
                    if (split.length != 2) {
                        FinskyLog.m21665c("Bad entry in setup APIs whitelist (expected a single ':', got %s), skipping", str22);
                    } else {
                        str22 = split[0];
                        if (str22.isEmpty()) {
                            FinskyLog.m21665c("Empty package name in setup APIs whitelist, skipping", new Object[0]);
                        } else {
                            Set hashSet = new HashSet();
                            hashSet.addAll(Arrays.asList(split[1].split(",")));
                            hashMap.put(str22, hashSet);
                        }
                    }
                }
            }
        }
        for (String str222 : strArr) {
            if (m19517a(str222, (Set) hashMap.get(str222))) {
                return true;
            }
        }
        throw new SecurityException(String.format(Locale.getDefault(), "No package in %s is authorized to call setup APIs", new Object[]{Arrays.toString(strArr)}));
    }

    private final boolean m19517a(String str, Set set) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("No package given", new Object[0]);
            return false;
        } else if (set == null || set.isEmpty()) {
            FinskyLog.m21665c("Package %s is not whitelisted", str);
            return false;
        } else {
            try {
                Signature[] signatureArr = this.f21119a.getPackageInfo(str, 64).signatures;
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    for (Signature toByteArray : signatureArr) {
                        byte[] digest = instance.digest(toByteArray.toByteArray());
                        Formatter formatter = new Formatter();
                        int length = digest.length;
                        for (int i = 0; i < length; i++) {
                            formatter.format("%02X", new Object[]{Byte.valueOf(digest[i])});
                        }
                        if (set.contains(formatter.toString())) {
                            FinskyLog.m21659a("Package %s is whitelisted and has a matching signature", str);
                            return true;
                        }
                    }
                    FinskyLog.m21665c("Could not find a matching signature for package %s", str);
                    return false;
                } catch (Throwable e) {
                    FinskyLog.m21660a(e, "Failed to get SHA-256 instance", new Object[0]);
                    return false;
                }
            } catch (NameNotFoundException e2) {
                FinskyLog.m21665c("Could not find package %s", str);
                return false;
            }
        }
    }
}
