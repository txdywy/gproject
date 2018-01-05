package com.google.android.gms.phenotype.core;

import java.util.List;

public final class C5533l {
    public final List f28394a;

    public C5533l(List list) {
        this.f28394a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5533l)) {
            return false;
        }
        return this.f28394a.equals(((C5533l) obj).f28394a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlagOverrides(");
        Object obj = 1;
        for (C5532k c5532k : this.f28394a) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            obj = null;
            c5532k.m26475a(stringBuilder);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
