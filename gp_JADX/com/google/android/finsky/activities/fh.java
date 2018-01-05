package com.google.android.finsky.activities;

import java.util.Comparator;
import java.util.HashMap;

final class fh implements Comparator {
    public final /* synthetic */ HashMap f6800a;

    fh(HashMap hashMap) {
        this.f6800a = hashMap;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((String) this.f6800a.get((String) obj)).compareTo((String) this.f6800a.get((String) obj2));
    }
}
