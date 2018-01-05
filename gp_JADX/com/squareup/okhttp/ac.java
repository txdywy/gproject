package com.squareup.okhttp;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ac {
    public static final Pattern f39281a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern f39282b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String f39283c;
    public final String f39284d;
    public final String f39285e;

    private ac(String str, String str2, String str3) {
        this.f39283c = str;
        this.f39284d = str2;
        this.f39285e = str3;
    }

    public static ac m36615a(String str) {
        Matcher matcher = f39281a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String toLowerCase = matcher.group(1).toLowerCase(Locale.US);
        String toLowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f39282b.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group == null || !group.equalsIgnoreCase("charset")) {
                group = str2;
            } else {
                if (matcher2.group(2) != null) {
                    group = matcher2.group(2);
                } else {
                    group = matcher2.group(3);
                }
                if (!(str2 == null || r0.equalsIgnoreCase(str2))) {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
            }
            str2 = group;
        }
        return new ac(str, toLowerCase, toLowerCase2);
    }

    public final String toString() {
        return this.f39283c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ac) && ((ac) obj).f39283c.equals(this.f39283c);
    }

    public final int hashCode() {
        return this.f39283c.hashCode();
    }
}
