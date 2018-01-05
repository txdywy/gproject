package com.squareup.okhttp.internal.p525a;

import p526e.C7728j;

public final class C7636x {
    public static final C7728j f39538a = C7728j.m37412a(":status");
    public static final C7728j f39539b = C7728j.m37412a(":method");
    public static final C7728j f39540c = C7728j.m37412a(":path");
    public static final C7728j f39541d = C7728j.m37412a(":scheme");
    public static final C7728j f39542e = C7728j.m37412a(":authority");
    public static final C7728j f39543f = C7728j.m37412a(":host");
    public static final C7728j f39544g = C7728j.m37412a(":version");
    public final C7728j f39545h;
    public final C7728j f39546i;
    public final int f39547j;

    public C7636x(String str, String str2) {
        this(C7728j.m37412a(str), C7728j.m37412a(str2));
    }

    public C7636x(C7728j c7728j, String str) {
        this(c7728j, C7728j.m37412a(str));
    }

    public C7636x(C7728j c7728j, C7728j c7728j2) {
        this.f39545h = c7728j;
        this.f39546i = c7728j2;
        this.f39547j = (c7728j.mo6522e() + 32) + c7728j2.mo6522e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7636x)) {
            return false;
        }
        C7636x c7636x = (C7636x) obj;
        if (this.f39545h.equals(c7636x.f39545h) && this.f39546i.equals(c7636x.f39546i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39545h.hashCode() + 527) * 31) + this.f39546i.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", new Object[]{this.f39545h.mo6515a(), this.f39546i.mo6515a()});
    }
}
