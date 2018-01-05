package com.google.android.finsky.billing.addresschallenge.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

final class com.google.android.finsky.billing.addresschallenge.a.ab
{

    public static final com.google.android.finsky.billing.addresschallenge.a.al a;
    public static final d[] b;
    public String c;
    public com.google.android.finsky.billing.addresschallenge.a.x d;
    public String e;

    static {
        com.google.android.finsky.billing.addresschallenge.a.ab.a = new com.google.android.finsky.billing.addresschallenge.a.am(com.google.android.finsky.billing.addresschallenge.a.an.a).a(new com.google.android.finsky.billing.addresschallenge.a.b().a()).a();
        v0 = new d[4];
        v0[0] = com.google.android.finsky.billing.addresschallenge.a.d.k;
        v0[1] = com.google.android.finsky.billing.addresschallenge.a.d.a;
        v0[2] = com.google.android.finsky.billing.addresschallenge.a.d.b;
        v0[3] = com.google.android.finsky.billing.addresschallenge.a.d.g;
        com.google.android.finsky.billing.addresschallenge.a.ab.b = v0;
    }

    ab(com.google.android.finsky.billing.addresschallenge.a.x p0, String p1, String p2) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "null data not allowed");
        this.c = p1;
        this.e = p2;
        v0 = com.google.android.finsky.billing.addresschallenge.a.ab.a(new com.google.android.finsky.billing.addresschallenge.a.b().a("ZZ").a());
        v1 = p0.b(v0.toString());
        v0 = String.valueOf(v0);
        com.google.android.finsky.billing.addresschallenge.a.az.a(v1, (String.valueOf(v0).length() + 38) + "require data for default country key: " + v0);
        this.d = p0;
    }

    static com.google.android.finsky.billing.addresschallenge.a.al a(com.google.android.finsky.billing.addresschallenge.a.a p0) {
        return new com.google.android.finsky.billing.addresschallenge.a.am(com.google.android.finsky.billing.addresschallenge.a.an.a).a(p0).a();
    }

    private final String a(com.google.android.finsky.billing.addresschallenge.a.al p0, String p1) {
        v1 = this.a(p0).iterator();
        while (true) {
            if (!v1.hasNext()) {
                v0 = 0;
                return v0;
            }
            v0 = (com.google.android.finsky.billing.addresschallenge.a.aq)v1.next();
            if (v0.a(p1)) {
                v0 = v0.a;
                return v0;
            }
        }
    }

    private final com.google.android.finsky.billing.addresschallenge.a.al b(com.google.android.finsky.billing.addresschallenge.a.al p0) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0);
        if (p0.b != com.google.android.finsky.billing.addresschallenge.a.an.a)
            throw new RuntimeException("Only DATA keyType is supported");
        v3 = p0.toString().split("/");
        if (v3.length < 2)
            return p0;
        v4 = new StringBuilder(v3[0]);
        v0 = 1;
        while (true) {
            if (v0 >= v3.length) {
                p0 = new com.google.android.finsky.billing.addresschallenge.a.am(v4.toString()).a();
                return p0;
            }
            v2 = 0;
            if (v0 == 1 && v3[v0].contains("--")) {
                v2 = v3[v0].split("--");
                v3[v0] = v2[0];
                v2 = v2[1];
            }
            v5 = this.a(new com.google.android.finsky.billing.addresschallenge.a.am(v4.toString()).a(), v3[v0]);
            if (v5 == 0)
                break;
            v4.append("/").append(v5);
            if (v2 != 0)
                v4.append("--").append(v2);
            v0 = v0 + 1;
        }
        while (v0 < v3.length) {
            v4.append("/").append(v3[v0]);
            v0 = v0 + 1;
        }
        p0 = new com.google.android.finsky.billing.addresschallenge.a.am(v4.toString()).a();
        return p0;
    }

    private static String[] b(String p0) {
        if (p0 == 0 || p0.length() == 0)
            v0 = new String[0];
        else
            v0 = p0.split("~");
        return v0;
    }

    final List a(com.google.android.finsky.billing.addresschallenge.a.al p0) {
        v0 = 0;
        if (p0.b == com.google.android.finsky.billing.addresschallenge.a.an.b)
            throw new RuntimeException("example key not allowed for getting region data");
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "null regionKey not allowed");
        v1 = this.b(p0);
        v3 = new ArrayList();
        if (v1.equals(com.google.android.finsky.billing.addresschallenge.a.ab.a)) {
            v1 = com.google.android.finsky.billing.addresschallenge.a.ab.b(this.d.b(v1.toString()).b(com.google.android.finsky.billing.addresschallenge.a.c.a));
            while (v0 < v1.length) {
                v3.add(new com.google.android.finsky.billing.addresschallenge.a.ar().a(v1[v0]).b(v1[v0]).a());
                v0 = v0 + 1;
            }
            v0 = v3;
        }
        else {
            v2 = this.d.a(v1.toString());
            if (v2 != 0) {
                v4 = com.google.android.finsky.billing.addresschallenge.a.ab.b(v2.b(com.google.android.finsky.billing.addresschallenge.a.c.i));
                if (this.c != 0 && com.google.android.finsky.billing.addresschallenge.a.az.a(this.c))
                    v1 = com.google.android.finsky.billing.addresschallenge.a.ao.a;
                else
                    v1 = com.google.android.finsky.billing.addresschallenge.a.ao.b;
                if (v1 == com.google.android.finsky.billing.addresschallenge.a.ao.b)
                    v1 = com.google.android.finsky.billing.addresschallenge.a.ab.b(v2.b(com.google.android.finsky.billing.addresschallenge.a.c.l));
                else
                    v1 = com.google.android.finsky.billing.addresschallenge.a.ab.b(v2.b(com.google.android.finsky.billing.addresschallenge.a.c.j));
                while (v0 < v4.length) {
                    if (v0 < v1.length)
                        v2 = v1[v0];
                    else
                        v2 = v4[v0];
                    v3.add(new com.google.android.finsky.billing.addresschallenge.a.ar().a(v4[v0]).b(v2).a());
                    v0 = v0 + 1;
                }
            }
            v0 = v3;
        }
        return v0;
    }

    final void a(com.google.android.finsky.billing.addresschallenge.a.a p0, com.google.android.finsky.billing.addresschallenge.a.y p1) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0.a, "null country not allowed");
        v1 = new LinkedList();
        v0 = 0;
        while (v0 < com.google.android.finsky.billing.addresschallenge.a.ab.b.length) {
            v4 = p0.a(com.google.android.finsky.billing.addresschallenge.a.ab.b[v0]);
            if (v4 == 0)
                break;
            v1.add(v4);
            v0 = v0 + 1;
        }
        if (v1.size() == 0)
            throw new RuntimeException("Need at least country level info");
        p1.a();
        this.a(com.google.android.finsky.billing.addresschallenge.a.ab.a, v1, p1);
    }

    final void a(com.google.android.finsky.billing.addresschallenge.a.al p0, Queue p1, com.google.android.finsky.billing.addresschallenge.a.y p2) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "Null key not allowed");
        com.google.android.finsky.billing.addresschallenge.a.az.a(p1, "Null subkeys not allowed");
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "Null lookup key not allowed");
        this.d.b.a(p0, (com.google.android.finsky.billing.addresschallenge.a.ah)this.d.a.get(p0.toString()), new com.google.android.finsky.billing.addresschallenge.a.ac(this, p0, p2, p1));
    }

    final boolean a(String p0) {
        v0 = 1;
        if (p0 != 0 && com.google.android.finsky.billing.addresschallenge.a.az.c(this.d.b(com.google.android.finsky.billing.addresschallenge.a.ab.a(new com.google.android.finsky.billing.addresschallenge.a.b().a(this.e).a()).toString()).b(com.google.android.finsky.billing.addresschallenge.a.c.e)) != 0 && !com.google.android.finsky.billing.addresschallenge.a.az.b(p0).equals(com.google.android.finsky.billing.addresschallenge.a.az.b(p0)))
            v0 = 0;
        return v0;
    }

}
