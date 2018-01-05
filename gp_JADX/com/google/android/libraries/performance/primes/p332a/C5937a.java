package com.google.android.libraries.performance.primes.p332a;

import com.google.android.libraries.performance.primes.C5989do;
import com.google.android.libraries.performance.primes.au;
import d.a.a.a.a.a.aa;
import d.a.a.a.a.a.bt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C5937a {
    public static final Pattern f29587a = Pattern.compile("^(\\*[a-z]+\\*).*");
    public final ConcurrentHashMap f29588b = new ConcurrentHashMap();

    private static String m27536a(String str) {
        String[] split = str.split("/");
        if (split != null && split.length == 3) {
            return split[0];
        }
        C5989do.m27824a(3, "HashingNameSanitizer", "malformed sync name: %s", str);
        return "MALFORMED";
    }

    C5937a() {
    }

    public final void m27537a(C5938b c5938b, bt[] btVarArr) {
        if (btVarArr != null) {
            for (bt btVar : btVarArr) {
                if (!(btVar == null || btVar.d == null || btVar.d.b == null)) {
                    aa aaVar = btVar.d;
                    String str = btVar.d.b;
                    long longValue = au.m27649a(str).longValue();
                    if (!this.f29588b.containsKey(Long.valueOf(longValue))) {
                        String group;
                        switch (c5938b.ordinal()) {
                            case 0:
                                Matcher matcher = f29587a.matcher(str);
                                if (matcher.matches()) {
                                    if (!str.startsWith("*sync*/")) {
                                        group = matcher.group(1);
                                        C5989do.m27824a(3, "HashingNameSanitizer", "non-sync system task wakelock: %s", group);
                                        break;
                                    }
                                    String valueOf = String.valueOf("*sync*/");
                                    group = String.valueOf(C5937a.m27536a(str.substring(7)));
                                    if (group.length() == 0) {
                                        group = new String(valueOf);
                                        break;
                                    } else {
                                        group = valueOf.concat(group);
                                        break;
                                    }
                                }
                                C5989do.m27824a(3, "HashingNameSanitizer", "wakelock: %s", str);
                                group = str;
                                break;
                            case 1:
                                group = C5937a.m27536a(str);
                                break;
                            case 2:
                                group = "--";
                                break;
                            default:
                                group = str;
                                break;
                        }
                        C5989do.m27824a(3, "HashingNameSanitizer", "Sanitized Hash: [%s] %s -> %s", c5938b, group, au.m27649a(group));
                        C5989do.m27824a(2, "HashingNameSanitizer", "Raw Hash: [%s] %s -> %s", c5938b, str, Long.valueOf(longValue));
                        this.f29588b.putIfAbsent(Long.valueOf(longValue), r8);
                    }
                    aaVar.a = Long.valueOf(longValue);
                    btVar.d.b = null;
                }
            }
        }
    }

    public final void m27538a(bt[] btVarArr) {
        if (btVarArr != null) {
            for (bt btVar : btVarArr) {
                if (!(btVar == null || btVar.d == null || btVar.d.a == null)) {
                    btVar.d.a = (Long) this.f29588b.get(btVar.d.a);
                }
            }
        }
    }
}
