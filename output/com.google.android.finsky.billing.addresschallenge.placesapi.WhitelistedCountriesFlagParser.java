package com.google.android.finsky.billing.addresschallenge.placesapi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

private static class WhitelistedCountriesFlagParser
{

    public Set a;

    WhitelistedCountriesFlagParser(Context p0) {
        try {
            this.a = WhitelistedCountriesFlagParser.a((String)com.google.android.finsky.aa.b.cY.b(), WhitelistedCountriesFlagParser.a(p0));
        }
        catch (WhitelistedCountriesFlagParser$ParseException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.d("Malformatted format for places api whitelisting flag: %s", v2);
        }
    }

    private static int a(Context p0) {
        try {
            return p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static Set a(String p0, int p1) {
        if (TextUtils.isEmpty(p0))
            v0 = Collections.emptySet();
        else {
            v0 = new HashSet();
            v3 = p0.split(";");
            v1 = 0;
            while (v1 < v3.length) {
                v6 = v3[v1].split(":");
                if (v6.length != 2) {
                    v0 = String.valueOf(v3[v1]);
                    if (v0.length() != 0)
                        v0 = "The following part must have exactly one ':': ".concat(v0);
                    else
                        v0 = new String("The following part must have exactly one ':': ");
                    throw new Exception(v0) {
                    };
                }
                try {
                    if (p1 >= Integer.parseInt(v6[0]))
                        v0.addAll(Arrays.asList(com.google.android.finsky.utils.k.a(v6[1])));
                }
                catch (NumberFormatException ex) {
                    v0 = String.valueOf(v6[0]);
                    if (v0.length() != 0)
                        v0 = "Can't parse version: ".concat(v0);
                    else
                        v0 = new String("Can't parse version: ");
                    throw new Exception(v0) {
                    };
                }
                v1 = v1 + 1;
            }
        }
        return v0;
    }

}
