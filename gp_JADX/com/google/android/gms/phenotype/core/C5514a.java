package com.google.android.gms.phenotype.core;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public final class C5514a implements Comparable {
    public final int f28339a;
    public final C5530i[] f28340b;
    public final String[] f28341c;
    public final Map f28342d = new TreeMap();

    public C5514a(int i, C5530i[] c5530iArr, String[] strArr) {
        this.f28339a = i;
        this.f28340b = c5530iArr;
        for (C5530i c5530i : c5530iArr) {
            this.f28342d.put(c5530i.f28382a, c5530i);
        }
        this.f28341c = strArr;
        if (this.f28341c != null) {
            Arrays.sort(this.f28341c);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        stringBuilder.append(this.f28339a);
        stringBuilder.append(", ");
        stringBuilder.append("(");
        for (C5530i append : this.f28342d.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        stringBuilder.append(", ");
        stringBuilder.append("(");
        if (this.f28341c != null) {
            for (String append2 : this.f28341c) {
                stringBuilder.append(append2);
                stringBuilder.append(", ");
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(")");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5514a)) {
            return false;
        }
        C5514a c5514a = (C5514a) obj;
        if (this.f28339a == c5514a.f28339a && C5534m.m26476a(this.f28342d, c5514a.f28342d) && Arrays.equals(this.f28341c, c5514a.f28341c)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f28339a - ((C5514a) obj).f28339a;
    }
}
