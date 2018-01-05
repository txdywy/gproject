package com.google.android.finsky.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public final class C1283d {
    public static final Comparator f7575a = new C1284e();
    public final String f7576b;
    public final Integer f7577c;
    public final Integer f7578d;
    public final Long f7579e;
    public final String[] f7580f;
    public final Boolean f7581g;
    public final boolean f7582h;

    public C1283d(String str) {
        this.f7576b = str;
        this.f7577c = null;
        this.f7578d = null;
        this.f7579e = null;
        this.f7580f = null;
        this.f7581g = null;
        this.f7582h = false;
    }

    public C1283d(String str, int i, Integer num, Long l, String[] strArr, boolean z, Boolean bool) {
        this.f7576b = str;
        this.f7577c = Integer.valueOf(i);
        this.f7578d = num;
        this.f7579e = l;
        this.f7580f = strArr;
        this.f7582h = z;
        this.f7581g = bool;
    }

    public static List m7689a(Collection collection) {
        List arrayList = new ArrayList(collection.size());
        for (String c1283d : collection) {
            arrayList.add(new C1283d(c1283d));
        }
        return arrayList;
    }
}
