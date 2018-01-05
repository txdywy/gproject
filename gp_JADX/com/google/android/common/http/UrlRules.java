package com.google.android.common.http;

import android.content.ContentResolver;
import android.util.Log;
import com.google.android.p102c.C0925g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UrlRules {
    public static final Pattern f5714a = Pattern.compile(" +");
    public static final Pattern f5715b = Pattern.compile("\\W");
    public static UrlRules f5716c = new UrlRules(new C0935c[0]);
    public static Object f5717d;
    public final C0935c[] f5718e;
    public final Pattern f5719f;

    public class RuleFormatException extends Exception {
        public RuleFormatException(String str) {
            super(str);
        }
    }

    private UrlRules(C0935c[] c0935cArr) {
        Arrays.sort(c0935cArr);
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < c0935cArr.length; i++) {
            if (i > 0) {
                stringBuilder.append(")|(");
            }
            stringBuilder.append(f5715b.matcher(c0935cArr[i].f5729b).replaceAll("\\\\$0"));
        }
        this.f5719f = Pattern.compile(stringBuilder.append(")").toString());
        this.f5718e = c0935cArr;
    }

    public final C0935c m5672a(String str) {
        Matcher matcher = this.f5719f.matcher(str);
        if (matcher.lookingAt()) {
            for (int i = 0; i < this.f5718e.length; i++) {
                if (matcher.group(i + 1) != null) {
                    return this.f5718e[i];
                }
            }
        }
        return C0935c.f5727e;
    }

    public static synchronized UrlRules m5671a(ContentResolver contentResolver) {
        UrlRules urlRules;
        synchronized (UrlRules.class) {
            Object a = C0925g.m5651a(contentResolver);
            String valueOf;
            if (a == f5717d) {
                if (Log.isLoggable("UrlRules", 2)) {
                    valueOf = String.valueOf(a);
                    Log.v("UrlRules", new StringBuilder(String.valueOf(valueOf).length() + 34).append("Using cached rules, versionToken: ").append(valueOf).toString());
                }
                urlRules = f5716c;
            } else {
                if (Log.isLoggable("UrlRules", 2)) {
                    Log.v("UrlRules", "Scanning for Gservices \"url:*\" rules");
                }
                Map a2 = C0925g.m5654a(contentResolver, "url:");
                ArrayList arrayList = new ArrayList();
                for (Entry entry : a2.entrySet()) {
                    try {
                        valueOf = ((String) entry.getKey()).substring(4);
                        String str = (String) entry.getValue();
                        if (!(str == null || str.length() == 0)) {
                            if (Log.isLoggable("UrlRules", 2)) {
                                Log.v("UrlRules", new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(str).length()).append("  Rule ").append(valueOf).append(": ").append(str).toString());
                            }
                            arrayList.add(new C0935c(valueOf, str));
                        }
                    } catch (Throwable e) {
                        Log.e("UrlRules", "Invalid rule from Gservices", e);
                    }
                }
                f5716c = new UrlRules((C0935c[]) arrayList.toArray(new C0935c[arrayList.size()]));
                f5717d = a;
                if (Log.isLoggable("UrlRules", 2)) {
                    valueOf = String.valueOf(a);
                    Log.v("UrlRules", new StringBuilder(String.valueOf(valueOf).length() + 32).append("New rules stored, versionToken: ").append(valueOf).toString());
                }
                urlRules = f5716c;
            }
        }
        return urlRules;
    }
}
