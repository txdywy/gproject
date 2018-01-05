package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.Map;

public final class al {
    public static final C1709d[] f8831a = new C1709d[]{C1709d.COUNTRY, C1709d.ADMIN_AREA, C1709d.LOCALITY, C1709d.DEPENDENT_LOCALITY};
    public final an f8832b;
    public final ao f8833c;
    public final Map f8834d;
    public final String f8835e = m9551a();
    public final String f8836f;

    al(am amVar) {
        this.f8832b = amVar.f8837a;
        this.f8833c = amVar.f8838b;
        this.f8834d = amVar.f8839c;
        this.f8836f = amVar.f8840d;
    }

    final al m9553a(C1709d c1709d) {
        Object obj = null;
        if (this.f8832b != an.DATA) {
            throw new RuntimeException("Only support getting parent keys for the data key type.");
        }
        am amVar = new am(this);
        Object obj2 = null;
        for (C1709d c1709d2 : f8831a) {
            if (obj2 != null && amVar.f8839c.containsKey(c1709d2)) {
                amVar.f8839c.remove(c1709d2);
            }
            if (c1709d2 == c1709d) {
                if (!amVar.f8839c.containsKey(c1709d2)) {
                    return null;
                }
                obj = 1;
                obj2 = 1;
            }
        }
        if (obj == null) {
            return null;
        }
        amVar.f8840d = this.f8836f;
        amVar.f8838b = this.f8833c;
        return amVar.m9554a();
    }

    private final String m9551a() {
        StringBuilder stringBuilder = new StringBuilder(this.f8832b.name().toLowerCase());
        if (this.f8832b == an.DATA) {
            for (C1709d c1709d : f8831a) {
                if (!this.f8834d.containsKey(c1709d)) {
                    break;
                }
                if (c1709d != C1709d.COUNTRY || this.f8836f == null) {
                    stringBuilder.append("/").append((String) this.f8834d.get(c1709d));
                } else {
                    stringBuilder.append("/").append((String) this.f8834d.get(c1709d)).append("--").append(this.f8836f);
                }
            }
        } else if (this.f8834d.containsKey(C1709d.COUNTRY)) {
            stringBuilder.append("/").append((String) this.f8834d.get(C1709d.COUNTRY)).append("/").append(this.f8833c.name().toLowerCase()).append("/_default");
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        return this.f8835e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((al) obj).toString().equals(this.f8835e);
    }

    public final int hashCode() {
        return this.f8835e.hashCode();
    }

    static boolean m9552a(String str) {
        for (an name : an.values()) {
            if (str.startsWith(name.name().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
