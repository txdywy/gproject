package com.google.android.finsky.ak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.ak.q
{

    public final StringBuilder a;
    public final List b;

    q() {
        com.google.android.finsky.ak.q(new StringBuilder("1=1"), new ArrayList());
    }

    q(Object p0) {
        com.google.android.finsky.ak.q("pk", p0);
    }

    q(String p0, Object p1) {
        com.google.android.finsky.ak.q();
        this.a(p0, p1);
    }

    q(StringBuilder p0, List p1) {
        this.a = p0;
        this.b = p1;
    }

    public static com.google.android.finsky.ak.q a(com.google.android.finsky.ak.q p0, com.google.android.finsky.ak.q p1, String p2) {
        v0 = new StringBuilder("(");
        v0.append(p0.a.toString());
        v2 = new Object[1];
        v2[0] = p2;
        v0.append(String.format(") %s (", v2));
        v0.append(p1.a.toString());
        v0.append(")");
        v1 = new ArrayList(p0.b);
        v1.addAll(p1.b);
        return new com.google.android.finsky.ak.q(v0, v1);
    }

    public final com.google.android.finsky.ak.q a(String p0) {
        this.a(p0, "is null", 0);
        return this;
    }

    public final com.google.android.finsky.ak.q a(String p0, Object p1) {
        this.a(p0, "=", p1);
        return this;
    }

    public final com.google.android.finsky.ak.q a(String p0, List p1) {
        this.a(p0, "in", p1);
        return this;
    }

    public final void a(String p0, String p1, Object p2) {
        if (p2 == 0)
            v0 = 0;
        else
            v0 = Collections.singletonList(p2);
        this.a(p0, p1, v0);
    }

    public final void a(String p0, String p1, List p2) {
        this.a(p0, p1, 0, p2);
    }

    public final void a(String p0, String p1, boolean p2, List p3) {
        this.a.append(" AND ");
        this.a.append(p0);
        this.a.append(" ");
        this.a.append(p1);
        if (p3 != 0) {
            if (p3.isEmpty())
                throw new IllegalArgumentException("Empty argument value");
            v0 = 0;
            v1 = p3.iterator();
            while (v1.hasNext()) {
                v2 = v1.next();
                if (v0 == 0)
                    v0 = v2.getClass();
                if (!v0.isInstance(v2))
                    throw new IllegalArgumentException("Heterogeneous list of values provided, all objects should be same type");
            }
            this.a.append(" (?");
            v0 = 0;
            while (v0 < p3.size() - 1) {
                this.a.append(", ?");
                v0 = v0 + 1;
            }
            this.a.append(")");
            if (p2 != 0)
                this.a.append(" ESCAPE '!'");
            v0 = p3.iterator();
            while (v0.hasNext())
                this.b.add(String.valueOf(v0.next()));
        }
    }

    public final String[] a() {
        if (this.b.isEmpty())
            v0 = 0;
        else
            v0 = (String[])this.b.toArray(new String[this.b.size()]);
        return v0;
    }

    public final com.google.android.finsky.ak.q b(String p0, Object p1) {
        this.a(p0, "<", p1);
        return this;
    }

}
