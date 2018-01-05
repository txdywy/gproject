package com.google.android.finsky.billing.addresschallenge.a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

protected final class com.google.android.finsky.billing.addresschallenge.a.av
{

    public final com.google.android.finsky.billing.addresschallenge.a.aa a;
    public final Map b;

    static {
        new com.google.android.finsky.billing.addresschallenge.a.ax();
    }

    av(com.google.android.finsky.billing.addresschallenge.a.aa p0) {
        com.google.android.finsky.billing.addresschallenge.a.av(p0, 0);
    }

    av(com.google.android.finsky.billing.addresschallenge.a.aa p0, byte p1) {
        this.a = p0;
        this.b = com.google.android.finsky.billing.addresschallenge.a.ay.a;
    }

    protected static void a() {
    }

    protected final boolean a(com.google.android.finsky.billing.addresschallenge.a.ao p0, com.google.android.finsky.billing.addresschallenge.a.aa p1, com.google.android.finsky.billing.addresschallenge.a.d p2, String p3, com.google.android.finsky.billing.addresschallenge.a.f p4) {
        v0 = (List)this.b.get(p2);
        if (v0 == 0)
            v0 = Collections.emptyList();
        v3 = v0.iterator();
        while (true) {
            if (!v3.hasNext()) {
                v0 = 1;
                return v0;
            }
            v0 = (com.google.android.finsky.billing.addresschallenge.a.e)v3.next();
            v1 = 0;
            v4 = com.google.android.finsky.billing.addresschallenge.a.az.c(p3);
            switch (v0.ordinal()) {
                case 0:
                    if (v4 != 0 && !p1.c.contains(p2))
                        v1 = 1;
                    break;
                case 1:
                    if (p1.d.contains(p2) && v4 == 0)
                        v1 = 1;
                    break;
                case 2:
                    if (v4 != 0) {
                        v5 = com.google.android.finsky.billing.addresschallenge.a.az.c(v4);
                        com.google.android.finsky.billing.addresschallenge.a.az.a(v5);
                        if (p0 == 0) {
                            if (p1.e == 0 || p1.e.containsKey(v5.toLowerCase()))
                                v1 = 1;
                            else
                                v1 = 0;
                        }
                        else {
                            if (p0 == com.google.android.finsky.billing.addresschallenge.a.ao.a)
                                v1 = p1.g;
                            else
                                v1 = p1.h;
                            v6 = new HashSet();
                            if (v1 != 0) {
                                v2 = 0;
                                while (v2 < v1.length) {
                                    v6.add(v1[v2].toLowerCase());
                                    v2 = v2 + 1;
                                }
                            }
                            if (p1.f != 0) {
                                v1 = 0;
                                while (v1 < p1.f.length) {
                                    v6.add(p1.f[v1].toLowerCase());
                                    v1 = v1 + 1;
                                }
                            }
                            if (v6.size() == 0 || v5 == 0)
                                v1 = 1;
                            else
                                v1 = v6.contains(v4.toLowerCase());
                        }
                        if (v1 == 0)
                            v1 = 1;
                        else
                            v1 = 0;
                    }
                    break;
                case 3:
                    if (v4 != 0 && p1.i != 0 && !p1.i.matcher(v4).matches())
                        v1 = 1;
                    break;
                case 4:
                    if (v4 != 0 && p1.j != 0 && !p1.j.matcher(v4).lookingAt())
                        v1 = 1;
                    break;
                default:
                    v0 = String.valueOf(v0);
                    throw new RuntimeException((String.valueOf(v0).length() + 17) + "Unknown problem: " + v0);
            }
            if (v1 != 0)
                p4.a.put(p2, v0);
            if (v1 == 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 == 0) {
                v0 = 0;
                return v0;
            }
        }
    }

}
