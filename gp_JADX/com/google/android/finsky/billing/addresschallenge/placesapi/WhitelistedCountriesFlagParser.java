package com.google.android.finsky.billing.addresschallenge.placesapi;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class WhitelistedCountriesFlagParser {
    public Set f9048a;

    class ParseException extends Exception {
        ParseException(String str) {
            super(str);
        }
    }

    public WhitelistedCountriesFlagParser(Context context) {
        try {
            this.f9048a = m9650a((String) C0955b.cY.m28964b(), m9649a(context));
        } catch (ParseException e) {
            FinskyLog.m21667d("Malformatted format for places api whitelisting flag: %s", e);
        }
    }

    private static Set m9650a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptySet();
        }
        Set hashSet = new HashSet();
        String[] split = str.split(";");
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = split[i2];
            String[] split2 = str2.split(":");
            if (split2.length != 2) {
                String str3 = "The following part must have exactly one ':': ";
                String valueOf = String.valueOf(str2);
                throw new ParseException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            }
            try {
                if (i >= Integer.parseInt(split2[0])) {
                    hashSet.addAll(Arrays.asList(C4680k.m21818a(split2[1])));
                }
                i2++;
            } catch (NumberFormatException e) {
                String str4 = "Can't parse version: ";
                valueOf = String.valueOf(split2[0]);
                throw new ParseException(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            }
        }
        return hashSet;
    }

    private static int m9649a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
