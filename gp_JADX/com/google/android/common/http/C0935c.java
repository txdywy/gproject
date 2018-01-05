package com.google.android.common.http;

import com.google.android.common.http.UrlRules.RuleFormatException;

public final class C0935c implements Comparable {
    public static final C0935c f5727e = new C0935c();
    public final String f5728a;
    public final String f5729b;
    public final String f5730c;
    public final boolean f5731d;

    public C0935c(String str, String str2) {
        this.f5728a = str;
        String[] split = UrlRules.f5714a.split(str2);
        if (split.length == 0) {
            throw new RuleFormatException("Empty rule");
        }
        this.f5729b = split[0];
        String str3 = null;
        boolean z = false;
        int i = 1;
        while (i < split.length) {
            String toLowerCase = split[i].toLowerCase();
            if (toLowerCase.equals("rewrite") && i + 1 < split.length) {
                str3 = split[i + 1];
                i += 2;
            } else if (toLowerCase.equals("block")) {
                i++;
                z = true;
            } else {
                String str4 = "Illegal rule: ";
                String valueOf = String.valueOf(str2);
                throw new RuleFormatException(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            }
        }
        this.f5730c = str3;
        this.f5731d = z;
    }

    private C0935c() {
        this.f5728a = "DEFAULT";
        this.f5729b = "";
        this.f5730c = null;
        this.f5731d = false;
    }

    public final String m5673a(String str) {
        if (this.f5731d) {
            return null;
        }
        if (this.f5730c == null) {
            return str;
        }
        String valueOf = String.valueOf(this.f5730c);
        String valueOf2 = String.valueOf(str.substring(this.f5729b.length()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final int compareTo(Object obj) {
        return ((C0935c) obj).f5729b.compareTo(this.f5729b);
    }
}
