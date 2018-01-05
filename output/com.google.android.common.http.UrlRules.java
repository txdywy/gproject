package com.google.android.common.http;

import android.content.ContentResolver;
import android.util.Log;
import com.google.android.c.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UrlRules
{

    public static final Pattern a;
    public static final Pattern b;
    public static UrlRules c;
    public static Object d;
    public final c[] e;
    public final Pattern f;

    static {
        UrlRules.a = Pattern.compile(" +");
        UrlRules.b = Pattern.compile("\\W");
        UrlRules.c = new UrlRules(new c[0]);
    }

    UrlRules(c[] p0) {
        Arrays.sort(p0);
        v1 = new StringBuilder("(");
        v0 = 0;
        while (v0 < p0.length) {
            if (v0 > 0)
                v1.append(")|(");
            v1.append(UrlRules.b.matcher(p0[v0].b).replaceAll("\\\\$0"));
            v0 = v0 + 1;
        }
        this.f = Pattern.compile(v1.append(")").toString());
        this.e = p0;
    }

    public static synchronized UrlRules a(ContentResolver p0) {
  2:    enter UrlRules;
  3:    v3 = com.google.android.c.g.a(p0);
  9:    if (v3 != UrlRules.d) goto 62;
 18:    if (Log.isLoggable("UrlRules", 2)) {
 22:        v1 = String.valueOf(v3);
 55:        Log.v("UrlRules", (String.valueOf(v1).length() + 34) + "Using cached rules, versionToken: " + v1);
        }
 58:    v0 = UrlRules.c;
 60:    exit UrlRules;
 61:    return v0;
 62:    try {
 69:        if (Log.isLoggable("UrlRules", 2))
 75:            Log.v("UrlRules", "Scanning for Gservices \"url:*\" rules");
 79:        v0 = new String[1];
 84:        v0[0] = "url:";
 92:        v4 = new ArrayList();
 99:        v5 = com.google.android.c.g.a(p0, v0).entrySet().iterator();
103:        while (v5.hasNext()) {
113:            v0 = (Map$Entry)v5.next();
115:            try {
122:                v1 = ((String)v0.getKey()).substring(4);
130:                v0 = (String)v0.getValue();
132:                if (v0 != 0) {
138:                    if (v0.length() != 0) {
147:                        if (Log.isLoggable("UrlRules", 2))
199:                            Log.v("UrlRules", (String.valueOf(v1).length() + 9 + String.valueOf(v0).length()) + "  Rule " + v1 + ": " + v0);
207:                        v4.add(new com.google.android.common.http.c(v1, v0));
                        }
                    }
                }
                catch (UrlRules$RuleFormatException ex) {
212:                try {
216:                    Log.e("UrlRules", "Invalid rule from Gservices", ex);
                    }
                    catch (Throwable ex) {
221:                    exit UrlRules;
222:                    throw ex;
                    }
                }
                catch (Throwable ex) {
221:                exit UrlRules;
222:                throw ex;
                }
            }
        }
        catch (Throwable ex) {
221:        exit UrlRules;
222:        throw ex;
        }
210:    goto 223;
221:    exit UrlRules;
222:    throw ex;
223:    try {
240:        UrlRules.c = new UrlRules((c[])v4.toArray(new c[v4.size()]));
242:        UrlRules.d = v3;
251:        if (Log.isLoggable("UrlRules", 2)) {
255:            v1 = String.valueOf(v3);
288:            Log.v("UrlRules", (String.valueOf(v1).length() + 32) + "New rules stored, versionToken: " + v1);
            }
291:        v0 = UrlRules.c;
        }
        catch (Throwable ex) {
221:        exit UrlRules;
222:        throw ex;
        }
293:    goto 60;
298:    try
            run 3...60
        catch (Throwable ex) {
  3:        goto 220;
        }
    }

    public final com.google.android.common.http.c a(String p0) {
        v1 = this.f.matcher(p0);
        if (v1.lookingAt()) {
            v0 = 0;
            while (v0 < this.e.length) {
                if (v1.group(v0 + 1) != 0) {
                    v0 = this.e[v0];
                    return v0;
                }
                v0 = v0 + 1;
            }
        }
        v0 = com.google.android.common.http.c.e;
        return v0;
    }

}
